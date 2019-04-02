package com.xuyuanjia.pattern.singleton.destroysingleton.reflect;

/**
 * @ClassName HungrySingleton
 * @Description 饿汉式单例
 * @Author xuyuanjia
 * @Date 2019/4/1 下午6:25
 * @Version 1.0
 **/

public class HungryProtectReflectSingleton {

    //初始化单例模式实例
    private static HungryProtectReflectSingleton hungrySingleton = new HungryProtectReflectSingleton();


    //初始化计数变量
    //作用:如果count = 1,说明实例已经创建
    private static int count = 0;

    //知识点:私有化构造函数
    //作用:防止其他类实例化本类
    private HungryProtectReflectSingleton(){
        if(count >0){
            throw new RuntimeException("实例已创建,请访问单一对象");
        }
        count++;
    }



    //获取实例
    public static HungryProtectReflectSingleton getInstance(){
        count++;
        return hungrySingleton;
    }
}
