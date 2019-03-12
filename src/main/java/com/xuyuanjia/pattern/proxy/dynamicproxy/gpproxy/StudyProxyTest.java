package com.xuyuanjia.pattern.proxy.dynamicproxy.gpproxy;

/**
 * @ClassName StudyProxyTest
 * @Description 学习代理测试类
 * @Author xuyuanjia(马拉松de流程逻辑)
 * @Date 2019/3/12 上午10:21
 * @Version 1.0
 **/

public class StudyProxyTest {
    public static void main(String[] args) {
        People p = (People) new JDKStudyProxy().getInstance(new Xuyuanjia());
        p.studyJava();
    }
}
