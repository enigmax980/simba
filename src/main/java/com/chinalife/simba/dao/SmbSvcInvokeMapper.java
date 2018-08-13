package com.chinalife.simba.dao;

import com.chinalife.simba.model.SmbSvcInvoke;
import com.chinalife.simba.model.SmbSvcInvokeExample;
import org.apache.ibatis.annotations.Param;
import java.util.List;


public interface SmbSvcInvokeMapper {
    long countByExample(SmbSvcInvokeExample example);

    int deleteByExample(SmbSvcInvokeExample example);

    int deleteByPrimaryKey(Integer svc_invk_id);

    int insert(SmbSvcInvoke record);

    int insertSelective(SmbSvcInvoke record);

    List<SmbSvcInvoke> selectByExample(SmbSvcInvokeExample example);

    SmbSvcInvoke selectByPrimaryKey(Integer svc_invk_id);

    int updateByExampleSelective(@Param("record") SmbSvcInvoke record, @Param("example") SmbSvcInvokeExample example);

    int updateByExample(@Param("record") SmbSvcInvoke record, @Param("example") SmbSvcInvokeExample example);

    int updateByPrimaryKeySelective(SmbSvcInvoke record);

    int updateByPrimaryKey(SmbSvcInvoke record);
}