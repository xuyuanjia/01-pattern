package com.xuyuanjia.pattern.factory.func;

/**
 * @ClassName FuncFactoryTest
 * @Description TODO
 * @Author xuyuanjia
 * @Date 2019/3/13 下午3:53
 * @Version 1.0
 **/

public class FuncFactoryTest {

    public static void main(String[] args) {
        //生产苹果手机用苹果手机工厂
        Phone iphone = new IPhoneFactory().createPhone();
        System.out.println(iphone.getProductName());

        System.out.println("=====================================");

        //生产华为手机用华为手机工厂
        Phone huawei = new HuaWeiFactory().createPhone();
        System.out.println(huawei.getProductName());
    }
}
