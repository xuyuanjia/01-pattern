package com.xuyuanjia.pattern.prototype;

import com.xuyuanjia.pattern.prototype.entity.CccUploadImage_HI_RO;
import com.xuyuanjia.pattern.prototype.utility.BeanUtils;

/**
 * @ClassName PrototypeTest
 * @Description TODO
 * @Author xuyuanjia
 * @Date 2019/4/8 上午12:35
 * @Version 1.0
 **/

public class PrototypeTest {
    public static void main(String[] args) throws Exception {
        CccUploadImage_HI_RO orig = new CccUploadImage_HI_RO();
        orig.setBusinessId(1L);

        CccUploadImage_HI_RO target = new CccUploadImage_HI_RO();
        BeanUtils.copyProperties(orig, target);
        System.out.println(((CccUploadImage_HI_RO)target).getBusinessId());

    }
}
