package com.xuyuanjia.pattern.factory.abst;

/**
 * @ClassName IphoneShell
 * @Description TODO
 * @Author xuyuanjia
 * @Date 2019/3/13 下午4:06
 * @Version 1.0
 **/

public class IphoneShell implements Shell {
    @Override
    public String getMaterial() {
        return "铝合金";
    }
}
