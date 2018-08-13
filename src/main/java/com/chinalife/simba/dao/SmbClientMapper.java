package com.chinalife.simba.dao;

import com.chinalife.simba.model.SmbClient;
import com.chinalife.simba.model.SmbClientExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface SmbClientMapper {
    long countByExample(SmbClientExample example);

    int deleteByExample(SmbClientExample example);

    int deleteByPrimaryKey(Integer clnt_id);

    int insert(SmbClient record);

    int insertSelective(SmbClient record);

    List<SmbClient> selectByExample(SmbClientExample example);

    SmbClient selectByPrimaryKey(Integer clnt_id);

    int updateByExampleSelective(@Param("record") SmbClient record, @Param("example") SmbClientExample example);

    int updateByExample(@Param("record") SmbClient record, @Param("example") SmbClientExample example);

    int updateByPrimaryKeySelective(SmbClient record);

    int updateByPrimaryKey(SmbClient record);
}