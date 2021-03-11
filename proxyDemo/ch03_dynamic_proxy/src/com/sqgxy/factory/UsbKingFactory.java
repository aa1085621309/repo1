package com.sqgxy.factory;

import com.sqgxy.service.UsbShell;

/**
 * @author: 10856
 * @date: 2021/2/26/026 17:19
 * @description:目标类
 */
public class UsbKingFactory implements UsbShell {
    @Override
    public float sell(int amout) {
        //目标方法
        System.out.println("目标类中,执行了sell方法");
        return 85.0F;
    }

    @Override
    public void print(int amout) {
        System.out.println("这是print方法");

    }
}
