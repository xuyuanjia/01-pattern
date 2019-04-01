package com.xuyuanjia.pattern.singleton.hungry;

/**
 * @ClassName HungrySingleton
 * @Description 饿汉式单例
 * @Author xuyuanjia
 * @Date 2019/4/1 下午2:08
 * @Version 1.0
 **/

public class HungrySingleton {

    //声明并实例化单例对象
    private static HungrySingleton hungrySingleton = new HungrySingleton();

    //防止被初始化
    private HungrySingleton(){

    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
