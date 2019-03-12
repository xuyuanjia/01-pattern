package com.xuyuanjia.pattern.proxy.dynamicproxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ClassName WorkProxy
 * @Description 工作代理类
 * @Author xuyuanjia(马拉松de流程逻辑)
 * @Date 2019/3/12 上午10:44
 * @Version 1.0
 **/

public class WorkProxy implements MethodInterceptor {

    //public Object target;

    public Object getInstance(Object target){
        //this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setCallback(this);
        enhancer.setSuperclass(target.getClass());
        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        //目标方法发生前的处理方法
        before();
        //目标方法调用
        Object methodResult =  methodProxy.invokeSuper(o,objects);
        //目标方法发生后的处理方法
        after();
        return methodResult;
    }

    //事后调用
    private void after() {
        System.out.println("放松一下吧");
    }

    //事前调用
    private void before() {
        System.out.println("喝瓶红牛");
    }
}
