package com.xuyuanjia.pattern.proxy.dynamicproxy.cglibproxy;

/**
 * @ClassName WorkProxyTest
 * @Description TODO
 * @Author xuyuanjia
 * @Date 2019/3/12 上午10:49
 * @Version 1.0
 **/

public class WorkProxyTest {

    public static void main(String[] args) {

        Xuyuanjia x = (Xuyuanjia) new WorkProxy().getInstance(new Xuyuanjia());
        x.work();

    }
}
