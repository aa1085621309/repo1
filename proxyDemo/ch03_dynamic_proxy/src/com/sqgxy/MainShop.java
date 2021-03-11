package com.sqgxy;

import com.sqgxy.factory.UsbKingFactory;
import com.sqgxy.handler.MySellHandler;
import com.sqgxy.service.UsbShell;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author: 10856
 * @date: 2021/2/26/026 17:29
 * @description:
 */
public class MainShop {
    public static void main(String[] args) {
        //创建代理对象，使用Proxy
        //1.创建目标对象
        UsbShell factory = new UsbKingFactory();
        //2.创建InvocationHandler
        InvocationHandler handler = new MySellHandler(factory);
        //3.创建代理对象
        UsbShell proxy = (UsbShell) Proxy.newProxyInstance(factory.getClass().getClassLoader(), factory.getClass().getInterfaces(), handler);
        //4.通过代理执行方法
        float sell = proxy.sell(1);
        System.out.println("通过动态代理对象，调用方法：" + sell);
    }
}
