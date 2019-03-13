package com.xuyuanjia.pattern.factory.simple;

/**
 * @ClassName SimpleFactoryTest
 * @Description TODO
 * @Author xuyuanjia
 * @Date 2019/3/13 下午3:37
 * @Version 1.0
 **/

public class SimpleFactoryTest {

    //测试方法
    public static void main(String[] args) {

        //Phone phone = PhoneFactory.createPhone("HuaWei");
        Phone phone = PhoneFactory.createPhone("IPhone");
        System.out.println(phone.getProductName());
    }
}
