package com.sqgxy.shangjia;

import com.sqgxy.factory.UsbKingFactory;
import com.sqgxy.service.UsbShell;

/**
 * @author: 10856
 * @date: 2021/2/26/026 15:11
 * @description:
 */
public class taobao implements UsbShell {
    //商家，代理金士顿
    private  UsbShell factory = new UsbKingFactory();
    @Override
    public float sell(int amout) {
        //向厂家发送订单，告诉厂家，我卖了u盘 厂家发货
        float price = factory.sell(amout);//厂家的价格
        //商家需要加价 也就是我们的代理要增加价格
        price = price+25;
        return price;
    }
}
