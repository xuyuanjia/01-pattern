package com.xuyuanjia.pattern.proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName JDKStudyProxy
 * @Description jdk-代理类
 * @Author xuyuanjia
 * @Date 2019/3/12 上午10:16
 * @Version 1.0
 **/

public class JDKStudyProxy implements InvocationHandler {

    private People target;

    public Object getInstance(People target){
        this.target = target;
        Class clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(),this);
    }


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //被代理方法前面加点东西
        before();
        Object object = method.invoke(this.target, args);
        //被代理方法后面加点东西
        after();
        return object;
    }

    //事后调用
    private void after() {

        System.out.println("===============");
        System.out.println("事后:获得高薪工作");

    }

    //事前调用
    private void before() {

        System.out.println("===============");
        System.out.println("事前:报名Java课程");

    }
}
