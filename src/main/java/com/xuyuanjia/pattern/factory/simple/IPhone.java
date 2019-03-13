package com.xuyuanjia.pattern.factory.simple;

/**
 * @ClassName IPhone
 * @Description 苹果手机
 * @Author xuyuanjia
 * @Date 2019/3/13 下午3:32
 * @Version 1.0
 **/

public class IPhone implements Phone {
    @Override
    public String  getProductName() {
       return "IPhone 8";
    }
}
