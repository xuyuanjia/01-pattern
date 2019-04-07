package com.xuyuanjia.pattern.prototype.utility;

//import com.xuyuanjia.pattern.prototype.entity.CccUploadImage_HI_RO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @ClassName BeanUtils
 * @Description TODO
 * @Author xuyuanjia
 * @Date 2019/4/8 上午12:16
 * @Version 1.0
 **/

public class BeanUtils {

    public static void copyProperties(Object orig, Object target) throws Exception{
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(orig);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);

        target = ois.readObject();
        //System.out.println(((CccUploadImage_HI_RO)target).getBusinessId());
    }
}
