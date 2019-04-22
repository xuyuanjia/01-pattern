package com.xuyuanjia.pattern.template;

/**
 * @ClassName SavingAccout
 * @Description TODO
 * @Author xuyuanjia
 * @Date 2019/4/23 上午1:10
 * @Version 1.0
 **/

public class SavingAccout extends Account {
    @Override
    public void calculateInterest() {
        System.out.println("定期利率");
    }
}
