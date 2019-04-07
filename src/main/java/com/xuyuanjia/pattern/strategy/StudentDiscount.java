package com.xuyuanjia.pattern.strategy;

/**
 * @ClassName StudentDiscount
 * @Description TODO
 * @Author xuyuanjia
 * @Date 2019/4/8 上午1:23
 * @Version 1.0
 **/

public class StudentDiscount implements Discount {
    private final double DISCOUNT = 0.8;

    @Override
    public double calculate(double price) {
        return price * DISCOUNT;
    }
}
