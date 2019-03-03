package com.SpringCloudAll.client.controller;

import com.SpringCloudAll.feign.business.feign.BusinessFeign;
import com.SpringCloudAll.feign.common.pojo.ResultDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: CC.F
 * @Date: 0:33 2019/2/25
 */
@Slf4j
@RestController
@RequestMapping("business")
public class BusinessController {
    @Autowired
    private BusinessFeign businessFeign;
    /**
     * 业务统计A
     *
     * @return ResultDto
     */
    @GetMapping("businessTest")
    public ResultDto businessInfoIndex() {
        //调用feign的RESTful API
        ResultDto result = businessFeign.businessTest();
        log.info("返回结果: {}",  result);
        return result;
    }

    /**
     * @return ResultDto
     */
    @GetMapping("business1")
    public ResultDto business1() {
        return ResultDto.build();
    }
}
