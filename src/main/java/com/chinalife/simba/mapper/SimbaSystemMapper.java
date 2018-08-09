package com.chinalife.simba.mapper;
import java.util.List;
import com.chinalife.simba.bean.SimbaSystem;
import org.apache.ibatis.annotations.Mapper;

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
