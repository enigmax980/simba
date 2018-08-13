package com.chinalife.simba.dao;

import com.chinalife.simba.model.SmbMachine;
import com.chinalife.simba.model.SmbMachineExample;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface SmbMachineMapper {
    long countByExample(SmbMachineExample example);

    int deleteByExample(SmbMachineExample example);

    int deleteByPrimaryKey(Integer mach_id);

    int insert(SmbMachine record);

    int insertSelective(SmbMachine record);

    List<SmbMachine> selectByExample(SmbMachineExample example);

    SmbMachine selectByPrimaryKey(Integer mach_id);

    int updateByExampleSelective(@Param("record") SmbMachine record, @Param("example") SmbMachineExample example);

    int updateByExample(@Param("record") SmbMachine record, @Param("example") SmbMachineExample example);

    int updateByPrimaryKeySelective(SmbMachine record);

    int updateByPrimaryKey(SmbMachine record);
}