package com.xuyuanjia.pattern.observer;

import com.google.common.eventbus.EventBus;

/**
 * @ClassName ObserverTest
 * @Description TODO
 * @Author xuyuanjia
 * @Date 2019/4/23 上午12:30
 * @Version 1.0
 **/

public class ObserverTest {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        eventBus.register(new Listener());
        eventBus.post(1);
    }
}
