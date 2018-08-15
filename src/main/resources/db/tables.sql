#create DATABASE simba character set = utf8;
use simba;

####################逻辑部署信息########################
#系统信息表
DROP TABLE IF EXISTS smb_system;
 create table smb_system(
 sys_id int primary key auto_increment, #系统id
 sys_code     varchar(12) not null,              #系统简称
 sys_name     varchar(50),              #系统名称
 principal    varchar(40),              #系统负责人
 architect        varchar(40),          #架构师
 director      varchar(40),             #主管责任人
 dev_dept      varchar(40),             #开发部门
 busi_dept     varchar(40),             #业务部门
 sys_desc varchar(250)                  #系统功能描述
 ) character set = utf8;

#alter table smb_system convert to character set utf8;

#应用信息表
DROP TABLE IF EXISTS smb_server;
 create table smb_server(
 srv_id int primary key auto_increment,     #应用服务器id
 srv_code   varchar(20),                    #应用服务器名
 srv_name   varchar(60),                    #应用服务器中文名
 sys_code    varchar(12),                   #系统id，一个应用服务器逻辑上属于一个系统
 db_cmpt_code     varchar(20),              #数据库组件
 mq_cmpt_code     varchar(20),              #消息队列组件
 cache_cmpt_code  varchar(20),              #缓存组件
 srv_desc    varchar(100)                   #应用服务器描述
 ) character set = utf8;

#服务信息表
DROP TABLE IF EXISTS smb_service;
 create table smb_service(
 svc_id int primary key auto_increment,     #服务id
 svc_code   varchar(30) not null,           #服务名
 svc_name   varchar(60) not null,           #服务中文名
 sys_code       varchar(12) not null,       #系统名
 srv_code       varchar(20) not null,       #应用服务名
 plan_tps        int,                       #规划容量
 plan_resp_time  int,                       #规划最大响应时间 ms
 stat_resp_time  int,                       #统计生产平均响应时间 ms
 rtlmt_id        int default 0              #限流器信息
 ) character set = utf8;

#限流器
DROP TABLE IF EXISTS smb_ratelimit;
 create table smb_ratelimit(
 rtlmt_id int primary key auto_increment,   #限流器id
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
 src_pos        varchar(10) not null,        #调用方身份　client service
 fuse_id        int default 0,               #熔断器id
 svc_bus        varchar(12) ,                #服务总线　ESB AAP
 svc_bus_srv    varchar(20) ,               #服务总线应用服务器  esb-wtc esb-ws
 des_sys_code   varchar(12) not null,       #目标系统
 des_svc_code   varchar(30) not null,       #目标服务
 time_out       int,                        #服务调用超时时间　ms
 call_percent   int  default 100            #调用频率百分比
 ) character set = utf8;

#客户端信息表--虚拟管理,作为流程入口
DROP TABLE IF EXISTS smb_client;
 create table smb_client(
 clnt_id int primary key auto_increment, #客户端id
 clnt_code   varchar(30),                #客户端编码
 clnt_name   varchar(60),                #服务中文名
 scnr_code   varchar(20),                 #场景代码
 scnr_flow_no  int,                      #场景流程顺序号
 busi_order  int,                        #业务环节序号
 busi_desc   varchar(30),                #业务环节描述
 sys_code       varchar(12),             #系统简称
 srv_code       varchar(20)              #应用服务节点名
 ) character set = utf8;

#熔断器,描述A服务调用B服务的熔断策略
DROP TABLE IF EXISTS smb_fuse;
 create table smb_fuse(
 fs_id int primary key auto_increment,  #熔断器id
 fuse_desc varchar(100)                 #熔断器描述
 ) character set = utf8;


#组件信息
DROP TABLE IF EXISTS smb_component;
 create table smb_component(
 cmpt_id int primary key auto_increment,  #组件id
 cmpt_type  varchar(12),                  #组件类型 db mq cache
 cmpt_code varchar(20),                   #组件代码  如 orbps_db
 cmpt_name varchar(50),                   #组件名称  如 契约平台数据库
 db_type varchar(20),                   #数据库类型　如　oracle mongo db2 neo4j
 mq_type    varchar(20),                #消息队列类型　rabbitmq kafka jms
 cache_type varchar(20),                #缓存类型　　　　
 cmpt_desc varchar(30),                 #组件描述信息　如　rac2 3m3s3sen
 sys_code  varchar(12)                  #系统名称
 ) character set = utf8;

#应用场景
DROP TABLE IF EXISTS smb_scenario;
 create table smb_scenario(
 scnr_id int primary key auto_increment,  #场景id
 scnr_level  int,                         #场景重要水平
 scnr_code varchar(20),                   #场景代码
 scnr_name varchar(50),                   #场景名称
 scnr_desc  varchar(200)                  #场景描述
 ) character set = utf8;

#应用流程
DROP TABLE IF EXISTS smb_scnr_flow;
 create table smb_scnr_flow(
 scnr_flow_id int primary key auto_increment,  #场景流程id
 scnr_flow_no  int not null,                   #场景流程顺序号
 scnr_flow_name varchar(30) not null,          #场景流程名称
 scnr_code varchar(20),                        #场景代码
 scnr_desc  varchar(100)                       #场景流程描述
 ) character set = utf8;

######################物理部署信息######################

# 服务器信息表
DROP TABLE IF EXISTS smb_machine;
 create table smb_machine(
 mach_id int primary key auto_increment, #服务器id
 mach_ip   varchar(15) not null,         #ip地址
 mach_name varchar(30) not null,         #服务器名
 mach_desc varchar(100),                 #服务器描述
 mach_type varchar(20) ,                 #physical virtual
 mach_model varchar(20),                 #硬件类型 x86 mini
 net_pos   varchar(18),                  #网络位置 intranet internet dmz
 os        varchar(20),                  #操作系统 windows mac linux unix 等
 os_ver    varchar(50)                   #操作系统版本
 ) character set = utf8;

#应用节点信息表
DROP TABLE IF EXISTS smb_node;
 create table smb_node(
 node_id int primary key auto_increment, #应用节点id
 mach_id    int not null,                #服务器id，物理上一个应用节点上属于一个物理服务器
 srv_port   int not null,                #服务端口号
 srv_code    varchar(20) not null,       #应用服务器,逻辑上一个节点是一个应用服务器的实例
 clstr_id    int,                         #集群id
 node_desc    varchar(100)                #应用服务器描述
 ) character set = utf8;

#集群信息表
DROP TABLE IF EXISTS smb_cluster;
 create table smb_cluster(
 clstr_id int primary key auto_increment, #集群id
 clstr_name  varchar(30) not null,        #集群名称
 node_cnt    int,                         #集群中节点数量
 sys_code    varchar(12) not null,        #系统名称
 srv_code    varchar(20) not null,        #应用服务类型
 clstr_ip    varchar(15) not null,        #集群ip
 clstr_port  int,                         #集群端口号
 lb_type     varchar(10) not null,        #负载均衡设备类型 dns hardware software 等
 lb_eqp      varchar(20)not null,         #负载均衡设备名 F5,　A10, radware, nginx, lvs 等
 hp_check_way    varchar(20) not null,    #健康度检测方式 ping tcp http heartbeat
 lb_desc         varchar(100),            #康检查与故障隔离策略描述
 clstr_desc   varchar(100)                #集群描述
 ) character set = utf8;


