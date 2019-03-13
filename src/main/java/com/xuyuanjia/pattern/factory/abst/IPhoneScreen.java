package com.xuyuanjia.pattern.factory.abst;

/**
 * @ClassName IPhoneScreen
 * @Description Iphone屏幕
 * @Author xuyuanjia
 * @Date 2019/3/13 下午4:06
 * @Version 1.0
 **/

public class IPhoneScreen implements Screen {
    @Override
    public String getSize() {
        return "4.7寸";
    }
}
