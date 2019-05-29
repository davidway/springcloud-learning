package com.feign.service;

import com.feign.service.impl.HelloService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@ FeignClient指定调用服务名
@FeignClient(value = "ec",fallback = HelloService.class)
@Component
public interface IHelloService {
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    String getService();
}