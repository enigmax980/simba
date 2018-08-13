package com.chinalife.simba.dao;

import com.chinalife.simba.model.SmbRatelimit;
import com.chinalife.simba.model.SmbRatelimitExample;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface SmbRatelimitMapper {
    long countByExample(SmbRatelimitExample example);

    int deleteByExample(SmbRatelimitExample example);

    int deleteByPrimaryKey(Integer rtlmt_id);

    int insert(SmbRatelimit record);

    int insertSelective(SmbRatelimit record);

    List<SmbRatelimit> selectByExample(SmbRatelimitExample example);

    SmbRatelimit selectByPrimaryKey(Integer rtlmt_id);

    int updateByExampleSelective(@Param("record") SmbRatelimit record, @Param("example") SmbRatelimitExample example);

    int updateByExample(@Param("record") SmbRatelimit record, @Param("example") SmbRatelimitExample example);

    int updateByPrimaryKeySelective(SmbRatelimit record);

    int updateByPrimaryKey(SmbRatelimit record);
}