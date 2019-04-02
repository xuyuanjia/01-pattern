package com.xuyuanjia.pattern.singleton.destroysingleton.reflect;

import com.xuyuanjia.pattern.singleton.destroysingleton.HungrySingleton;

import java.lang.reflect.Constructor;

/**
 * @ClassName ReflectTest
 * @Description 反射破坏单例模式
 * @Author xuyuanjia
 * @Date 2019/4/1 下午6:28
 * @Version 1.0
 **/

public class ReflectTest {
    public static void main(String[] args) throws Exception {
        //正常获取单例对象
        HungrySingleton h1 = HungrySingleton.getInstance();
        //输出内存地址
        System.out.println(h1);

        //获取单例类的构造方法
        Constructor<HungrySingleton> constructor = HungrySingleton.class.getDeclaredConstructor();
        //设置构造器的访问权限
        constructor.setAccessible(true);
        //通过反射,实例化单例类
        HungrySingleton h2 = constructor.newInstance();
        //输出内存地址
        System.out.println(h2);

        //比较内存地址是否相等
        System.out.println(h1 == h2);
    }
}
