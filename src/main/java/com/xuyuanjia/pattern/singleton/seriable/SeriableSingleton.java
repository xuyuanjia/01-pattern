package com.xuyuanjia.pattern.singleton.seriable;

/**
 * @ClassName SeriableSingleton
 * @Description TODO
 * @Author xuyuanjia
 * @Date 2019/4/1 下午2:50
 * @Version 1.0
 **/

public class SeriableSingleton {
    public final static SeriableSingleton seriableSingleton = new SeriableSingleton();

    //防止被其他类实例化本类对象
    private SeriableSingleton(){

    }

    public static SeriableSingleton getInstance(){
        return seriableSingleton;
    }

    //知识点:此方法有什么作用?
    //作用: 防止以序列化和反序列化的方式破坏单例
    private Object readRessolve(){
        return seriableSingleton;
    }
}
