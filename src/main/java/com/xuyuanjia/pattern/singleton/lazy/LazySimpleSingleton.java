package com.xuyuanjia.pattern.singleton.lazy;

/**
 * @ClassName LazySimpleSingleton
 * @Description TODO
 * @Author xuyuanjia
 * @Date 2019/4/1 下午2:13
 * @Version 1.0
 **/

public class LazySimpleSingleton {

    //私有化构造器,防止被创建
    private LazySimpleSingleton(){

    }

    //一开始只有声明,并没有实例化
    private static LazySimpleSingleton lazySimpleSingleton = null;

    //加上synchronized防止并发
    public synchronized static LazySimpleSingleton getInstance(){
        //获取实例的时候,判断是否已经实例化了单例对象
        if (lazySimpleSingleton == null){
            //如果还没有实例化,就进行实例化,并赋值给静态变量
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        //返回单例
        return lazySimpleSingleton;
    }
}
