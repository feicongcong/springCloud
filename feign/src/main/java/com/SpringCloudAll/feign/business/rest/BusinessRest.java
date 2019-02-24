package com.SpringCloudAll.feign.business.rest;


import com.SpringCloudAll.feign.common.pojo.ResultDto;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Description:
 * @Author: CC.F
 * @Date: 16:39 2018/11/12
 */
public interface BusinessRest {

    @PostMapping("/business/test")
    ResultDto<String> businessTest();


}
