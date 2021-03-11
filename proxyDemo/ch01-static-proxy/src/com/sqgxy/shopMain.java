package com.sqgxy;

import com.sqgxy.shangjia.taobao;

/**
 * @author: 10856
 * @date: 2021/2/26/026 15:14
 * @description:
 */
public class shopMain {
    public static void main(String[] args) {
        taobao taobao = new taobao();
        float sell = taobao.sell(1);
        System.out.println("通过淘宝的商家，购买u盘的单价" + sell);
    }
}
