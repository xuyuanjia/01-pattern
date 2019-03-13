package com.xuyuanjia.pattern.proxy.dynamicproxy.gpproxy;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName GPProxy
 * @Description 咕泡代理类
 * @Author xuyuanjia(马拉松de流程逻辑)
 * @Date 2019/3/12 上午11:29
 * @Version 1.0
 **/

public class GPProxy {

    public static final String ln = "\r\n";

    public static Object newProxyInstance(GPClassLoader classLoader, Class<?> [] interfaces, GPInvocationHandler h){
        try {
            //1.动态生成源代码.Java文件
            String src = generateSrc(interfaces);
            //2.Java文件输出到磁盘
            String filePath = GPProxy.class.getResource("").getPath();
            File f = new File(filePath + "$Proxy0.java");
            FileWriter fileWriter = new FileWriter(f);
            fileWriter.write(src);
            fileWriter.flush();
            fileWriter.close();
            //3.把生成的.java文件编译成.class文件
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager = ((javax.tools.JavaCompiler) compiler).getStandardFileManager(null, null, null);
            Iterable iterable = manager.getJavaFileObjects(f);

            JavaCompiler.CompilationTask task = compiler.getTask(null,manager,null,null,null,iterable);
            task.call();
            manager.close();
            //4.把编译生成的.class文件加载到JVM中来
            Class proxyClass =  classLoader.findClass("$Proxy0");
            Constructor c = proxyClass.getConstructor(GPInvocationHandler.class);
            f.delete();
            //5.返回字节码重组以后的新的代理对象
            return c.newInstance(h);
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    private static String generateSrc(Class<?>[] interfaces) {
        StringBuffer sb = new StringBuffer();
        sb.append("package com.xuyuanjia.pattern.proxy.dynamicproxy.gpproxy;" + ln);
        sb.append("import com.xuyuanjia.pattern.proxy.dynamicproxy.gpproxy.People;" + ln);
        sb.append("import java.lang.reflect.*;" + ln);
        sb.append("public class $Proxy0 implements " + interfaces[0].getName() + "{"  + ln);
            sb.append("GPInvocationHandler h;" + ln);
            sb.append("public $Proxy0(GPInvocationHandler h) {" + ln);
                sb.append("this.h = h;" + ln);
            sb.append("}" + ln);

        for(Method method : interfaces[0].getMethods()){
            Class<?>[] params = method.getParameterTypes();
            StringBuffer paramNames = new StringBuffer();
            StringBuffer paramValues = new StringBuffer();
            StringBuffer paramClasses = new StringBuffer();

            for (int i = 0; i < params.length; i++) {
                Class clazz = params[i];
                String type = clazz.getName();
                String paramName = toLowerFirstCase(clazz.getSimpleName());
                paramNames.append(type + " " + paramName);
                paramValues.append(paramName);
                paramClasses.append(clazz.getName() + ".class");
                if(i > 0 && i < params.length -1){
                    paramNames.append(",");
                    paramClasses.append(",");
                    paramValues.append(",");
                }
            }

            sb.append("public " + method.getReturnType().getName() + " " + method.getName() + "(" + paramNames.toString() + ") {" + ln);
                sb.append("try{" + ln);
                sb.append("Method m = " + interfaces[0].getName() + ".class.getMethod(\"" + method.getName() + "\",new Class[]{" + paramClasses.toString() + "});" + ln);
                sb.append((hasReturn(method.getReturnType()) ? " " : "return ") + getCaseCode("this.h.invoke(this,m,new Object[]{" + paramValues + "})",method.getReturnType()) + ";" + ln);
                sb.append("}catch(Error _ex) { }");
                sb.append("catch(Throwable e){" + ln);
                sb.append("throw new UndeclaredThrowableException(e);" + ln);
                sb.append("}");
                sb.append(getReturnEmptyCode(method.getReturnType()));
                sb.append("}");
            }

            sb.append("}" + ln);
            return sb.toString();
    }

    private static Map<Class, Class> mapping = new HashMap<Class, Class>();

    static{
        mapping.put(int.class,Integer.class);
    }

    private static String getReturnEmptyCode(Class<?> returnClass){
        if(mapping.containsKey(returnClass)){
            return "return 0;";
        }else if(returnClass.getName().equals("void")){
            return  "";
        }else {
            return "return null";
        }
    }

    private static String getCaseCode(String code, Class<?> returnClass){
        if(mapping.containsKey(returnClass)){
            return "((" + mapping.get(returnClass).getName() + ")" + code + ")." + returnClass.getSimpleName() + "Value()";
        }

        return code;
    }

    private static boolean hasReturn(Class<?> clazz){
        return clazz != Void.class;
    }

    private static String toLowerFirstCase(String src){
        char [] chars = src.toCharArray();
        chars[0] += 32;
        return  String.valueOf(chars);
    }


}
