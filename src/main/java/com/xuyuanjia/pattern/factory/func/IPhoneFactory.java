package com.xuyuanjia.pattern.factory.func;

/**
 * @ClassName IPhoneFactory
 * @Description 苹果手机工厂
 * @Author xuyuanjia
 * @Date 2019/3/13 下午3:50
 * @Version 1.0
 **/

public class IPhoneFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        return new IPhone();
    }
}
