package com.xuyuanjia.pattern.proxy.dynamicproxy.gpproxy;

import java.lang.reflect.Method;

/**
 * @ClassName GPInvocationHandler
 * @Description TODO
 * @Author xuyuanjia(马拉松de流程逻辑)
 * @Date 2019/3/12 上午11:09
 * @Version 1.0
 **/

public interface GPInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
