package com.chinalife.simba.dao;

import com.chinalife.simba.model.SmbNode;
import com.chinalife.simba.model.SmbNodeExample;
import org.apache.ibatis.annotations.Param;
import java.util.List;


public interface SmbNodeMapper {
    long countByExample(SmbNodeExample example);

    int deleteByExample(SmbNodeExample example);

    int deleteByPrimaryKey(Integer node_id);

    int insert(SmbNode record);

    int insertSelective(SmbNode record);

    List<SmbNode> selectByExample(SmbNodeExample example);

    SmbNode selectByPrimaryKey(Integer node_id);

    int updateByExampleSelective(@Param("record") SmbNode record, @Param("example") SmbNodeExample example);

    int updateByExample(@Param("record") SmbNode record, @Param("example") SmbNodeExample example);

    int updateByPrimaryKeySelective(SmbNode record);

    int updateByPrimaryKey(SmbNode record);
}