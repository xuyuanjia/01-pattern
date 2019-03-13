package com.xuyuanjia.pattern.factory.abst;

/**
 * @ClassName IPhoneFactory
 * @Description IPhone手机工厂
 * @Author xuyuanjia
 * @Date 2019/3/13 下午4:05
 * @Version 1.0
 **/

public class IPhoneFactory implements PhoneFactory {
    @Override
    public Screen createScreen() {
        return new IPhoneScreen();
    }

    @Override
    public Shell createShell() {
        return new IphoneShell();
    }
}
