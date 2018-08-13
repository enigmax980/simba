package com.chinalife.simba.dao;
import com.chinalife.simba.model.SimbaSystem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SimbaSystemMapper {

    int deleteByPrimaryKey(String id);

    int insert(SimbaSystem record);

    int insertSelective(SimbaSystem record);

    SimbaSystem selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SimbaSystem record);

    int updateByPrimaryKey(SimbaSystem record);

    List<SimbaSystem> selectAll();

    List<SimbaSystem> getMessById(String id);
}
