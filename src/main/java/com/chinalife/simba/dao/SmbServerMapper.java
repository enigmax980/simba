package com.chinalife.simba.dao;

import com.chinalife.simba.model.SmbServer;
import com.chinalife.simba.model.SmbServerExample;
import org.apache.ibatis.annotations.Param;
import java.util.List;


public interface SmbServerMapper {
    long countByExample(SmbServerExample example);

    int deleteByExample(SmbServerExample example);

    int deleteByPrimaryKey(Integer srv_id);

    int insert(SmbServer record);

    int insertSelective(SmbServer record);

    List<SmbServer> selectByExample(SmbServerExample example);

    SmbServer selectByPrimaryKey(Integer srv_id);

    int updateByExampleSelective(@Param("record") SmbServer record, @Param("example") SmbServerExample example);

    int updateByExample(@Param("record") SmbServer record, @Param("example") SmbServerExample example);

    int updateByPrimaryKeySelective(SmbServer record);

    int updateByPrimaryKey(SmbServer record);
}