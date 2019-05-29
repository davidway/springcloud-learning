package com.feign.service.impl;

import com.feign.service.IHelloService;
import org.springframework.stereotype.Component;

@Component
public class HelloService implements IHelloService {
    @Override
    public String getService() {
        return "Sorry,i cannot get it";
    }
}
