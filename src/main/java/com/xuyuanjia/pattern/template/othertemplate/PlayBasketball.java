package com.xuyuanjia.pattern.template.othertemplate;

/**
 * @ClassName PlayBasketball
 * @Description TODO
 * @Author xuyuanjia
 * @Date 2019/3/22 下午4:10
 * @Version 1.0
 **/

public class PlayBasketball implements IPlayBasketballTemplate {
    @Override
    public void drink() {
        System.out.println("喝红牛");
    }
}
