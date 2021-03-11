package com.sqgxy.service.impl;

import com.sqgxy.service.HelloService;

/**
 * @author: 10856
 * @date: 2021/2/26/026 16:01
 * @description:
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello(String name) {
        System.out.println("你好" + name);
    }
}
