package com.chinalife.simba.controller;

import com.chinalife.simba.model.SmbSystem;
import com.chinalife.simba.service.SmbSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/smbSystem")
public class SimbaController {

    @Autowired
    private SmbSystemService service;

    @RequestMapping(value = "/getOne",method = RequestMethod.GET)
    public List<SmbSystem> getSystem(@RequestParam("id") int id){

        List<SmbSystem> list = service.getSystem(id);
        int num = list.size();
        if(null!=list && num>8){
            for (int i = 0; i < num-8; i++) {
                list.remove(0);
            }
        }
        return list;
    }

    @RequestMapping(value = "/getAll")
    public List<SmbSystem> getAllSystem(){

        List<SmbSystem> list = service.getAllSystem();
        int num = list.size();
        if(null!=list && num>8){
            for (int i = 0; i < num-8; i++) {
                list.remove(0);
            }
        }
        return list;
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public int addMessage(@RequestBody SmbSystem smbSystem){
        return service.addSystem(smbSystem);
    }

    @RequestMapping(value="/del",method=RequestMethod.POST)
    public int delMessageById(@RequestParam("id") int id){
        return service.delSystem(id);
    }
}