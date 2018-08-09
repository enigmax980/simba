package com.chinalife.simba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chinalife.simba.bean.SimbaSystem;
import com.chinalife.simba.service.SimbaSystemService;

@RestController
@RequestMapping("/simba")
public class SimbaSystemController {

    @Autowired
    private SimbaSystemService service;

    @RequestMapping("/getThree")
    public List<SimbaSystem> getThreeForMessage(){

        List<SimbaSystem> list = service.getMessage();
        return list;
    }

    @RequestMapping("/getAll")
    public List<SimbaSystem> getAllMessage(){

        List<SimbaSystem> list = service.getAllMessage();
        int num = list.size();
        if(null!=list && num>3){
            for (int i = 0; i < num-3; i++) {
                list.remove(0);
            }
        }
        return list;
    }

    @RequestMapping("/getByID")
    public List<SimbaSystem> getMessageById(@RequestParam("id") String id){
        List<SimbaSystem> list = service.getMessageById(id);
        int num = list.size();
        if(null!=list && num>5){
            for (int i = 0; i < num-5; i++) {
                list.remove(0);
            }
        }
        return list;
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public int addMessage(@RequestBody SimbaSystem simbaSystem){
        return service.addMessage(simbaSystem);
    }

    @RequestMapping(value="/delMessageById",method=RequestMethod.POST)
    public int delMessageById(@RequestParam("id") String id){
        return service.delMessage(id);
    }
}