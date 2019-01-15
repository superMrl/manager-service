package com.sbc.manager.controller;


import com.sbc.manager.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class DemoController {


    @Autowired
    private DemoService demoService;


    @RequestMapping("/getData")
    public String getDemoData(){
        return demoService.getDemoData();
    }
}
