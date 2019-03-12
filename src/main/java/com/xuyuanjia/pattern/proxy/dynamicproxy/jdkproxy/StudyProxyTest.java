package com.xuyuanjia.pattern.proxy.dynamicproxy.jdkproxy;

/**
 * @ClassName StudyProxyTest
 * @Description 学习代理测试类
 * @Author xuyuanjia
 * @Date 2019/3/12 上午10:21
 * @Version 1.0
 **/

public class StudyProxyTest {
    public static void main(String[] args) {
        People p = (People) new JDKStudyProxy().getInstance(new Xuyuanjia());
        p.studyJava();
    }
}
