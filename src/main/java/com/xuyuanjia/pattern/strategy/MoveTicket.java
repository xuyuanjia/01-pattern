package com.xuyuanjia.pattern.strategy;

/**
 * @ClassName MoveTicket
 * @Description TODO
 * @Author xuyuanjia
 * @Date 2019/4/8 上午1:19
 * @Version 1.0
 **/

public class MoveTicket {

    private double price;

    private Discount discount;

    public void setPrice(double price){
        this.price = price;
    }

    public void setDiscount(Discount discount){
        this.discount = discount;
    }

    public double getPrice(){
        return discount.calculate(this.price);
    }
}
