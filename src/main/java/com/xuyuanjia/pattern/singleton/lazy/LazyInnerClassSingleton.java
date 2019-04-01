package com.xuyuanjia.pattern.singleton.lazy;

/**
 * @ClassName LazyInnerClassSingleton
 * @Description TODO
 * @Author xuyuanjia
 * @Date 2019/4/1 下午2:18
 * @Version 1.0
 **/

public class LazyInnerClassSingleton {

    //私有化构造器,防止被实例化
    private LazyInnerClassSingleton(){
        //防止自己实例化多个对象
        if(LazyHolder.LAZY != null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    public static final LazyInnerClassSingleton getInstance(){
        return LazyHolder.LAZY;
    }

    private static class LazyHolder {
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }


    public static void main(String[] args) {
        new LazyInnerClassSingleton();
    }
}
