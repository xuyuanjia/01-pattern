package com.xuyuanjia.pattern.template;

/**
 * @ClassName Account
 * @Description TODO
 * @Author xuyuanjia
 * @Date 2019/4/23 上午1:03
 * @Version 1.0
 **/

public abstract class Account {

    public boolean validate(String account, String password){
        System.out.println("账号:" + account);
        System.out.println("密码:" + password);
        if (account.equalsIgnoreCase("刘德华") && "123456".equalsIgnoreCase(password)){
            return true;
        }else {
            return  false;
        }
    }


    public abstract  void calculateInterest();

    public void display(){
        System.out.println("显示利息");
    }

    public  void handle(String account, String password){
        if (!validate(account, password)){
            System.out.println("用户名或密码错误");
            return;
        }

        calculateInterest();
        display();
    }
}
