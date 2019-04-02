package com.xuyuanjia.pattern.singleton.destroysingleton.reflect;

import java.lang.reflect.Constructor;

/**
 * @ClassName ProtectReflectTest
 * @Description TODO
 * @Author xuyuanjia
 * @Date 2019/4/2 下午3:26
 * @Version 1.0
 **/

public class ProtectReflectTest {

    public static void main(String[] args) throws Exception{

        HungryProtectReflectSingleton h1 = HungryProtectReflectSingleton.getInstance();
        System.out.println(h1);

        Constructor<HungryProtectReflectSingleton> constructor = HungryProtectReflectSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        HungryProtectReflectSingleton h2 = constructor.newInstance();
        System.out.println(h2);

        HungryProtectReflectSingleton h3 = constructor.newInstance();
        System.out.println(h3);
    }
}
