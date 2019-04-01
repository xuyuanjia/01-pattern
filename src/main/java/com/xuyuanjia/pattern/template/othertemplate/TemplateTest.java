package com.xuyuanjia.pattern.template.othertemplate;

/**
 * @ClassName TemplateTest
 * @Description TODO
 * @Author xuyuanjia
 * @Date 2019/3/22 下午4:11
 * @Version 1.0
 **/

public class TemplateTest {

    public static void main(String[] args) {

        IPlayBasketballTemplate template = new PlayBasketball();
        template.handle();
    }
}
