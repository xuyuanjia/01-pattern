package com.xuyuanjia.pattern.factory.abst;

/**
 * @ClassName PhoneFactory
 * @Description 手机工厂接口
 * @Author xuyuanjia
 * @Date 2019/3/13 下午4:03
 * @Version 1.0
 **/

public interface PhoneFactory {

    //创建屏幕
    public Screen createScreen();


    //创建外壳
    public Shell createShell();
}
