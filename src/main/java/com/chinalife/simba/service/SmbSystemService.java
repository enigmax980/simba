package com.chinalife.simba.service;

import com.chinalife.simba.dao.SmbSystemMapper;
import com.chinalife.simba.model.SmbSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class SmbSystemService {

    @Autowired
    private SmbSystemMapper mapper;

    public List<SmbSystem> getSystem(int id){
        List<SmbSystem> list = new ArrayList<SmbSystem>();
        list.add(mapper.selectByPrimaryKey(id));
        return list;
    }

    public List<SmbSystem> getAllSystem(){
        List<SmbSystem> list = new ArrayList<SmbSystem>();
        list = mapper.selectAll();
        return list;
    }

    public int delSystem(int id) {
        return mapper.deleteByPrimaryKey(id);
    }

    public int addSystem(SmbSystem smbSystem) {
        return mapper.insert(smbSystem);
    }


}