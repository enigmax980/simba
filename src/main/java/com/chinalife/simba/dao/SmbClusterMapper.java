package com.chinalife.simba.dao;

import com.chinalife.simba.model.SmbCluster;
import com.chinalife.simba.model.SmbClusterExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SmbClusterMapper {
    long countByExample(SmbClusterExample example);

    int deleteByExample(SmbClusterExample example);

    int deleteByPrimaryKey(Integer clstr_id);

    int insert(SmbCluster record);

    int insertSelective(SmbCluster record);

    List<SmbCluster> selectByExample(SmbClusterExample example);

    SmbCluster selectByPrimaryKey(Integer clstr_id);

    int updateByExampleSelective(@Param("record") SmbCluster record, @Param("example") SmbClusterExample example);

    int updateByExample(@Param("record") SmbCluster record, @Param("example") SmbClusterExample example);

    int updateByPrimaryKeySelective(SmbCluster record);

    int updateByPrimaryKey(SmbCluster record);
}