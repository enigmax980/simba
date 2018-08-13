package com.chinalife.simba.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinalife.simba.model.SimbaSystem;
import com.chinalife.simba.dao.SimbaSystemMapper;


@Service
public class SimbaSystemService {

    @Autowired
    private SimbaSystemMapper mapper;

    public List<SimbaSystem> getMessage(){
        List<SimbaSystem> list = new ArrayList<SimbaSystem>();
        list.add(mapper.selectByPrimaryKey("xtt"));
        //list = dao.selectAll();
        return list;
    }

    public List<SimbaSystem> getAllMessage(){
        List<SimbaSystem> list = new ArrayList<SimbaSystem>();
        list = mapper.selectAll();
        return list;
    }

    public int addMessage(SimbaSystem simbaSystem) {
        return mapper.insert(simbaSystem);
    }

    public List<SimbaSystem> getMessageById(String id) {
        return mapper.getMessById(id);
    }

    public int delMessage(String id) {
        return mapper.deleteByPrimaryKey(id);
    }



}