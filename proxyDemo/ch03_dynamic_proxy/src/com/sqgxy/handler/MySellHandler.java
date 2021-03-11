package com.sqgxy.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: 10856
 * @date: 2021/2/26/026 17:21
 * @description:
 */
//必须实现InvocationHandler接口 完成代理类要做的功能（1.调用目标方法，2功能增强）
public class MySellHandler implements InvocationHandler {
    private Object target = null;


    //动态代理：目标对象时活动的，部署固定的，需要传入进来
    public MySellHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object res = null;
        //向厂家发送订单，告诉厂家，我卖了u盘 厂家发货
//        float price = factory.sell(amout);//厂家的价格
        res = method.invoke(target, args); //执行目标方法
        //商家需要加价 也就是我们的代理要增加价格
//        price = price+25;
        if (res != null) {
            Float price = (Float) res;
            price = price + 25;
            res = price;
        }

        return res;
    }
}
