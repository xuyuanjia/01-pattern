package com.xuyuanjia.pattern.singleton.destroysingleton;

/**
 * @ClassName HungrySingleton
 * @Description 饿汉式单例
 * @Author xuyuanjia
 * @Date 2019/4/1 下午6:25
 * @Version 1.0
 **/

public class HungrySingleton {

    //知识点:私有化构造函数
    //作用:防止其他类实例化本类
    private HungrySingleton(){

    }

    //初始化单例模式实例
    private static HungrySingleton hungrySingleton = new HungrySingleton();


    //获取实例
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
