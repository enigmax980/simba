package com.chinalife.simba.dao;

import com.chinalife.simba.model.SmbService;
import com.chinalife.simba.model.SmbServiceExample;
import org.apache.ibatis.annotations.Param;
import java.util.List;


public interface SmbServiceMapper {
    long countByExample(SmbServiceExample example);

    int deleteByExample(SmbServiceExample example);

    int deleteByPrimaryKey(Integer svc_id);

    int insert(SmbService record);

    int insertSelective(SmbService record);

    List<SmbService> selectByExample(SmbServiceExample example);

    SmbService selectByPrimaryKey(Integer svc_id);

    int updateByExampleSelective(@Param("record") SmbService record, @Param("example") SmbServiceExample example);

    int updateByExample(@Param("record") SmbService record, @Param("example") SmbServiceExample example);

    int updateByPrimaryKeySelective(SmbService record);

    int updateByPrimaryKey(SmbService record);
}