package com.xuyuanjia.pattern.template;

/**
 * @ClassName CurrentAccount
 * @Description TODO
 * @Author xuyuanjia
 * @Date 2019/4/23 上午1:09
 * @Version 1.0
 **/

public class CurrentAccount extends Account {
    @Override
    public void calculateInterest() {
        System.out.println("活期利率");
    }
}
