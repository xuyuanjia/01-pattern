package com.xuyuanjia.pattern.singleton.threadlocal;

/**
 * @ClassName ThreadLocalSingleton
 * @Description TODO
 * @Author xuyuanjia
 * @Date 2019/4/1 下午2:55
 * @Version 1.0
 **/

public class ThreadLocalSingleton {
    //知识点:ThreadLocal是什么玩意?
    //作用:ThreadLocal,很多地方叫做线程本地变量,有些地方叫做线程本地存储
    //ThreadLocal为变量在每个线程中创建一个副本,那么每个线程都可以访问自己内部的副本变量
    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            new ThreadLocal<ThreadLocalSingleton>(){
                //知识点:initialValue()
                //作用:设置每个线程属于自己的内部的副本变量
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };

    //知识点:私有化构造器
    //作用:防止被其他类私有化本来实例
    private ThreadLocalSingleton(){

    }

    public static ThreadLocalSingleton getInstance(){
        return threadLocalInstance.get();
    }
}
