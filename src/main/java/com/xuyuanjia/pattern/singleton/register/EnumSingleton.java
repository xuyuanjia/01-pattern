package com.xuyuanjia.pattern.singleton.register;
/**
 * @ClassName EnumSingleton
 * @Description TODO
 * @Author xuyuanjia
 * @Date 2019/4/1 下午2:46
 * @Version 1.0
 **/

public enum  EnumSingleton {
    INSTANCE;
    private Object data;
    public Object getData(){
        return this.data;
    }

    public void setData(Object data){
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
