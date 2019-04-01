package com.xuyuanjia.pattern.template.othertemplate;

public interface IPlayBasketballTemplate {

    //热身
    default void warmUp(){
        System.out.println("做热身运动");
    }

    //打球
    default void play(){
        System.out.println("打球");
    }

    //喝水
    public void drink();

    //休息
    default void rest(){
        System.out.println("睡个好觉");
    }

    default void handle(){
        warmUp();
        play();
        drink();
        rest();
    }
}
