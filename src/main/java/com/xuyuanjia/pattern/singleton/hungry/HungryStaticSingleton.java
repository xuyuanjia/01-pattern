package com.xuyuanjia.pattern.singleton.hungry;

/**
 * @ClassName HungryStaticSingleton
 * @Description TODO
 * @Author xuyuanjia
 * @Date 2019/4/1 下午2:10
 * @Version 1.0
 **/

public class HungryStaticSingleton {

    private static HungryStaticSingleton hungryStaticSingleton;

    static{
        hungryStaticSingleton = new HungryStaticSingleton();
    }

    //私有构造器
    //说明只有自己才能构造
    private HungryStaticSingleton(){

    }

    public static HungryStaticSingleton getInstance(){
        return hungryStaticSingleton;
    }
}
