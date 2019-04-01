package com.xuyuanjia.pattern.singleton.register;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName ContainerSingleton
 * @Description TODO
 * @Author xuyuanjia
 * @Date 2019/4/1 下午2:32
 * @Version 1.0
 **/

public class ContainerSingleton {

    //知识点:私有化构造器
    //作用:防止被别的类创建本类的实例
    private ContainerSingleton(){

    }

    //知识点:接口引用指向实现类对象
    //作用:Java多态的表现形式
    //     也许有一天你不想用HashMap实现类了,你去用Hashtablel
    private static Map<String, Object> ioc = new HashMap<String, Object>();

    //规律:获取单例方法都是用getInstance()
    public static Object getInstance(String name){
        if(!ioc.containsKey(name)){
            Object object = null;
            try {
                //知识点:Class.forName()
                //作用: 加载此类
                //知识点:newInstance()与new的区别
                //相同点:大家都是创建对象,
                // newInstance()是使用类加载机制.Class.forName()是加载该类,newInstance()是实例化.
                // new 的时候,可以没有加载该类
                object = Class.forName(name).newInstance();
                ioc.put(name, object);
            }catch (Exception e){
                e.printStackTrace();
            }
            return object;
        }else {
            return ioc.get(name);
        }
    }
}
