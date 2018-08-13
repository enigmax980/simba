package com.chinalife.simba.dao;

import com.chinalife.simba.model.SmbFuse;
import com.chinalife.simba.model.SmbFuseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface SmbFuseMapper {
    long countByExample(SmbFuseExample example);

    int deleteByExample(SmbFuseExample example);

    int deleteByPrimaryKey(Integer fs_id);

    int insert(SmbFuse record);

    int insertSelective(SmbFuse record);

    List<SmbFuse> selectByExample(SmbFuseExample example);

    SmbFuse selectByPrimaryKey(Integer fs_id);

    int updateByExampleSelective(@Param("record") SmbFuse record, @Param("example") SmbFuseExample example);

    int updateByExample(@Param("record") SmbFuse record, @Param("example") SmbFuseExample example);

    int updateByPrimaryKeySelective(SmbFuse record);

    int updateByPrimaryKey(SmbFuse record);
}