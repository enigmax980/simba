#create DATABASE simba;
use simba;

####################逻辑部署信息########################
#系统信息表
DROP TABLE IF EXISTS smb_system;
 create table smb_system(
 sys_id int primary key auto_increment, #系统id
 sys_code     varchar(12),                  #系统简称
 sys_name     varchar(50),                 #系统名称
 principal    varchar(15),             #系统负责人
 architect        varchar(15),             #架构师
 director      varchar(15),             #主管责任人
 department    varchar(15),             #部门
 sys_desc varchar(250)                #系统功能描述
 ) character set = utf8;

#alter table smb_system convert to character set utf8;

#应用信息表
DROP TABLE IF EXISTS smb_server;
 create table smb_server(
 srv_id int primary key auto_increment,     #应用服务器配置id
 srv_code   varchar(20),                    #应用服务器名
 srv_name   varchar(60),                    #应用服务器中文名
 sys_code    varchar(12),                   #系统id 一个应用服务器逻辑上属于一个系统
 srv_desc    varchar(100)                   #应用服务器描述
 ) character set = utf8;

#服务信息表
DROP TABLE IF EXISTS smb_service;
 create table smb_service(
 svc_id int primary key auto_increment, #服务id
 svc_code   varchar(30) not null,           #服务名
 svc_name   varchar(60) not null,           #服务中文名
 sys_code       varchar(12) not null,       #系统名
 srv_code       varchar(20) not null,       #应用服务名
 plan_tps        int,                       #规划容量
 plan_resp_time  int,                       #规划最大响应时间 ms
 stat_resp_time  int,                       #统计生产平均响应时间 ms
 is_ratelmt     int not null,              #是否有限流
 rtlmt_id        int                        #限流器信息
 ) character set = utf8;

#限流器
DROP TABLE IF EXISTS smb_ratelimit;
 create table smb_ratelimit(
 rtlmt_id int primary key auto_increment, #限流器id
 sys_code  varchar(12),                     #系统代码
 svc_code  varchar(30),                     #服务代码
 rate_lmt_algo   varchar(50) ,              #限流算法描述
 rate_lmt_thld   varchar(50) ,              #限流阈值描述
 rate_lmt_desc   varchar(100)               #限流详细描述
 ) character set = utf8;


#服务调用关系表
DROP TABLE IF EXISTS smb_svc_invoke;
 create table smb_svc_invoke(
 svc_invk_id int primary key auto_increment, #服务调用关系id
 src_sys_code   varchar(12) not null,       #源系统
 src_svc_code   varchar(30) not null,       #源服务,或客户端
 src_pos        varchar(2) not null,        #调用方身份 client service
 is_fuse        int default 0,              #是否熔断
 fuse_id        int,                        #熔断器id
 des_sys_code   varchar(12) not null,       #目标系统
 des_svc_code   varchar(30) not null,       #目标服务
 time_out       int,                        #服务调用超时时间 ms
 call_percent   int  default 100            #调用频率百分比
 ) character set = utf8;

#客户端信息表--虚拟管理,作为流程入口
DROP TABLE IF EXISTS smb_client;
 create table smb_client(
 clnt_id int primary key auto_increment, #客户端id
 clnt_code   varchar(30),                #客户端编码
 clnt_name   varchar(60),                #服务中文名
 sys_code       varchar(12),             #系统简称
 srv_code       varchar(20)              #应用服务节点名

 ) character set = utf8;

#熔断器,描述A服务调用B服务的熔断策略
DROP TABLE IF EXISTS smb_fuse;
 create table smb_fuse(
 fs_id int primary key auto_increment,  #熔断器id
 fuse_desc varchar(100)                 #熔断器描述
 ) character set = utf8;



######################物理部署信息######################

# 服务器信息表
DROP TABLE IF EXISTS smb_machine;
 create table smb_machine(
 mach_id int primary key auto_increment, #服务器id
 mach_name varchar(30) not null,         #服务器名
 mach_desc varchar(100),                 #服务器描述
 mach_ip   varchar(15) not null,         #ip地址
 mach_type varchar(20) default 'not_known',   #physical virtual
 mach_model varchar(20),                  #硬件类型 x86 mini
 net_pos   varchar(18),                  #网络位置 intranet internet dmz
 os        varchar(20),                  #操作系统 windows mac linux unix 等
 os_ver    varchar(50)                   #操作系统版本
 ) character set = utf8;

#应用节点信息表
DROP TABLE IF EXISTS smb_node;
 create table smb_node(
 node_id int primary key auto_increment, #应用节点id
 srv_code    varchar(20) not null,    #应用服务器,逻辑上一个节点是一个应用服务器的实例
 mach_id     int not null,            #服务器id, 物理上一个应用节点上属于一个物理服务器
 srv_port   int not null,             #服务端口号
 is_clstr    int default 0,           #是否集群部署
 clstr_id    int,                     #集群id
 node_desc    varchar(100)            #应用服务器描述
 ) character set = utf8;

#集群信息表
DROP TABLE IF EXISTS smb_cluster;
 create table smb_cluster(
 clstr_id int primary key auto_increment, #集群id
 clstr_name  varchar(30) not null,        #集群名称
 sys_code    varchar(12) not null,        #系统名称
 srv_code    varchar(20) not null,        #应用服务类型
 srv_port    int,                         #应用端口号
 lb_type     varchar(10) not null,        #负载均衡设备类型 dns hardware software 等
 lb_eqp      varchar(20)not null,         #负载均衡设备名 F5, A10, radware, nginx, lvs 等
 hp_check_way    varchar(20) not null,    #健康度检测方式 ping tcp http heartbeat
 lb_desc         varchar(100),            #康检查与故障隔离策略描述
 clstr_desc   varchar(100)                #集群描述
 ) character set = utf8;


