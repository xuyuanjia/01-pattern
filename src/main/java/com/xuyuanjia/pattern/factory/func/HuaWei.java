package com.xuyuanjia.pattern.factory.func;

/**
 * @ClassName HuaWei
 * @Description 华为手机
 * @Author xuyuanjia
 * @Date 2019/3/13 下午3:33
 * @Version 1.0
 **/

public class HuaWei implements Phone {
    @Override
    public String getProductName() {
        return "华为Mate 20";
    }
}
