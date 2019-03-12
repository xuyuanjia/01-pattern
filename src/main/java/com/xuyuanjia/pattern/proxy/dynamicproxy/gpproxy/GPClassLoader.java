package com.xuyuanjia.pattern.proxy.dynamicproxy.gpproxy;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 * @ClassName GPClassLoader
 * @Description 自己实现类加载器
 * @Author xuyuanjia(马拉松de流程逻辑)
 * @Date 2019/3/12 上午11:10
 * @Version 1.0
 **/

public class GPClassLoader extends ClassLoader {

    private File classPathFile;

    public GPClassLoader(){
        String classPath = GPClassLoader.class.getResource("").getPath();
        this.classPathFile = new File(classPath);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {

        String className = GPClassLoader.class.getPackage().getName()+ "." + name;
        if(classPathFile != null){
            File classFile = new File(classPathFile, name.replace("\\.","/") + ".class");
            if(classFile.exists()){
                FileInputStream fis = null;
                ByteArrayOutputStream bos = null;
                try {
                    fis = new FileInputStream(classFile);
                    bos = new ByteArrayOutputStream();
                    byte[] buff = new byte[1024];
                    int length;
                    while ((length = fis.read(buff)) != -1){
                        bos.write(buff, 0, length);
                    }
                    return defineClass(className, bos.toByteArray(), 0, bos.size());
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }

        return null;
    }
}
