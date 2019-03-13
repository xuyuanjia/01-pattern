package com.xuyuanjia.pattern.factory.func;

/**
 * @ClassName PhoneFactory
 * @Description 手机工厂接口
 * @Author xuyuanjia
 * @Date 2019/3/13 下午3:50
 * @Version 1.0
 **/

public interface PhoneFactory {

    //生成自己工厂的专属手机
    public Phone createPhone();
}
