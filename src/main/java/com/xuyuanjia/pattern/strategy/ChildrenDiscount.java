package com.xuyuanjia.pattern.strategy;

/**
 * @ClassName ChildrenDiscount
 * @Description TODO
 * @Author xuyuanjia
 * @Date 2019/4/8 上午1:24
 * @Version 1.0
 **/

public class ChildrenDiscount implements Discount{
    private final double DISCOUNT = 10;

    @Override
    public double calculate(double price) {
        if(price > 20 ){
            return price -10;
        }else {
            return price;
        }
    }

}
