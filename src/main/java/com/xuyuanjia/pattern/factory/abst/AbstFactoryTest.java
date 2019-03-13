package com.xuyuanjia.pattern.factory.abst;

/**
 * @ClassName AbstFactoryTest
 * @Description 抽象工厂测试类
 * @Author xuyuanjia
 * @Date 2019/3/13 下午4:21
 * @Version 1.0
 **/

public class AbstFactoryTest {

    public static void main(String[] args) {
        IPhoneFactory iPhoneFactory = new IPhoneFactory();
        System.out.println("iphone手机屏幕大小是:" + iPhoneFactory.createScreen().getSize());
        System.out.println("iphone手机外壳材质是:" + iPhoneFactory.createShell().getMaterial());
    }
}
