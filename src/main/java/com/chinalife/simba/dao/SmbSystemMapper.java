package com.chinalife.simba.dao;

import com.chinalife.simba.model.SmbSystem;
import com.chinalife.simba.model.SmbSystemExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SmbSystemMapper {
    long countByExample(SmbSystemExample example);

    int deleteByExample(SmbSystemExample example);

    int deleteByPrimaryKey(Integer sysId);

    int insert(SmbSystem record);

    int insertSelective(SmbSystem record);

    List<SmbSystem> selectByExample(SmbSystemExample example);

    List<SmbSystem> selectAll();

    SmbSystem selectByPrimaryKey(Integer sysId);

    int updateByExampleSelective(@Param("record") SmbSystem record, @Param("example") SmbSystemExample example);

    int updateByExample(@Param("record") SmbSystem record, @Param("example") SmbSystemExample example);

    int updateByPrimaryKeySelective(SmbSystem record);

    int updateByPrimaryKey(SmbSystem record);
}