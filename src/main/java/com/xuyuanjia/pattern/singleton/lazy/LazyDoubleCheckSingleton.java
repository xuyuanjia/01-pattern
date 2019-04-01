package com.xuyuanjia.pattern.singleton.lazy;

/**
 * @ClassName LazyDoubleCheckSingleton
 * @Description TODO
 * @Author xuyuanjia
 * @Date 2019/4/1 下午2:24
 * @Version 1.0
 **/

public class LazyDoubleCheckSingleton {

    //疑问:volatile关键字有什么作用?
    //volatile是Java提供的一种轻量级的同步机制，
    // 在并发编程中，它也扮演着比较重要的角色。
    // 同synchronized相比（synchronized通常称为重量级锁），
    // volatile更轻量级，相比使用synchronized所带来的庞大开销，
    // 倘若能恰当的合理的使用volatile，自然是美事一桩。
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    //防止被其他类实例化本对象
    private LazyDoubleCheckSingleton(){

    }

    public static LazyDoubleCheckSingleton getInstance(){
        if (lazyDoubleCheckSingleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if (lazyDoubleCheckSingleton == null){
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }

}
