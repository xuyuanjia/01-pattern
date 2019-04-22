package com.xuyuanjia.pattern.observer;

import com.google.common.eventbus.Subscribe;

/**
 * @ClassName Listener
 * @Description TODO
 * @Author xuyuanjia
 * @Date 2019/4/23 上午12:30
 * @Version 1.0
 **/

public class Listener {
    @Subscribe
    public void print(Integer integer){
        System.out.println(integer);
    }
}
