package com.xuyuanjia.pattern.factory.simple;

/**
 * @ClassName PhoneFactory
 * @Description 手机工厂
 * @Author xuyuanjia
 * @Date 2019/3/13 下午3:34
 * @Version 1.0
 **/

public class PhoneFactory {

    //创建手机
    public static Phone createPhone(String name){
        if ("IPhone".equals(name)){
            return new IPhone();
        }else if ("HuaWei".equals(name)){
            return new HuaWei();
        }else {
            return null;
        }
    }
}
