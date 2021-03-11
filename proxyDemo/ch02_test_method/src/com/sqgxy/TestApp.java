package com.sqgxy;

import com.sqgxy.service.HelloService;
import com.sqgxy.service.impl.HelloServiceImpl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author: 10856
 * @date: 2021/2/26/026 16:02
 * @description:
 */
public class TestApp {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        HelloService service = new HelloServiceImpl();
//        service.sayHello("张三");
        //通过反射机制执行sayhello方法，核心method（类中的方法）
        HelloService target = new HelloServiceImpl();
        //获取sayHello名称对于method类对象
        Method sayHello = HelloService.class.getMethod("sayHello", String.class);
        /**
         * invoke是method类中的一个方法。表示执行方法的调用
         * 参数：
         * 1.object，表示对象的，要执行这个对象的方法
         * 2.object...args 方法执行时的参数
         * 返回值
         * object ：方法执行后的返回值
         */
        sayHello.invoke(target,"张三");
    }
}
