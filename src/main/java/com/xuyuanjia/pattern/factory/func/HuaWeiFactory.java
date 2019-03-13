package com.xuyuanjia.pattern.factory.func;

/**
 * @ClassName HuaWeiFactory
 * @Description TODO
 * @Author xuyuanjia
 * @Date 2019/3/13 下午3:52
 * @Version 1.0
 **/

public class HuaWeiFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        return new HuaWei();
    }
}
