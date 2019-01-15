package com.sbc.manager.service.impl;

import com.sbc.manager.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String getDemoData() {
        return "测试数据";
    }
}
