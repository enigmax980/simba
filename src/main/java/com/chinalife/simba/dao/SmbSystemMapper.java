package com.chinalife.simba.dao;

import com.chinalife.simba.model.SmbSystem;
import com.chinalife.simba.model.SmbSystemExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface SmbSystemMapper {
    long countByExample(SmbSystemExample example);

    int deleteByExample(SmbSystemExample example);

    int deleteByPrimaryKey(Integer sys_id);

    int insert(SmbSystem record);

    int insertSelective(SmbSystem record);

    List<SmbSystem> selectByExample(SmbSystemExample example);

    List<SmbSystem> selectAll();

    SmbSystem selectByPrimaryKey(Integer sys_id);

    int updateByExampleSelective(@Param("record") SmbSystem record, @Param("example") SmbSystemExample example);

    int updateByExample(@Param("record") SmbSystem record, @Param("example") SmbSystemExample example);

    int updateByPrimaryKeySelective(SmbSystem record);

    int updateByPrimaryKey(SmbSystem record);
}