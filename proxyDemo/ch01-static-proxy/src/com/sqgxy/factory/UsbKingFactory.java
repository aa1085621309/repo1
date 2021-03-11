package com.sqgxy.factory;

import com.sqgxy.service.UsbShell;

/**
 * @author: 10856
 * @date: 2021/2/26/026 15:09
 * @description:
 */
//目标类。金士顿厂家，不接受用户的单独购买
public class UsbKingFactory implements UsbShell {
    @Override
    public float sell(int amout) {
        //一个u128g的u盘是 85元。
        //后期根据amount 可以实现不同的价格 例如1000个

        return 85.0f;
    }
}
