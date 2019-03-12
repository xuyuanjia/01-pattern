package com.xuyuanjia.pattern.proxy.dynamicproxy.jdkproxy;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * @ClassName StudyProxyTest
 * @Description 学习代理测试类
 * @Author xuyuanjia(马拉松de流程逻辑)
 * @Date 2019/3/12 上午10:21
 * @Version 1.0
 **/

public class StudyProxyTest {
    public static void main(String[] args) throws Exception{
        People p = (People) new JDKStudyProxy().getInstance(new Xuyuanjia());
        p.studyJava();
        printProxyClassFile();
    }

    public static void printProxyClassFile() throws Exception{
        try {
            byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{People.class});
            FileOutputStream fos = new FileOutputStream("/Users/xuyuanjia/Downloads/$Proxy0.class");
            fos.write(bytes);
            //fos.flush();
            fos.close();


            //如何反编译class文件?

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
