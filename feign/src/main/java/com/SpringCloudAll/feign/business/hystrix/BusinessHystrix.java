package com.SpringCloudAll.feign.business.hystrix;

import com.SpringCloudAll.feign.business.feign.BusinessFeign;
import com.SpringCloudAll.feign.common.constant.ErrorMessageCode;
import com.SpringCloudAll.feign.common.pojo.ResultDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Description: 白骑士基本操作Hystrix
 * @Author: CC.F
 * @Date: 16:39 2018/11/12
 */
@Slf4j
@Component
public class BusinessHystrix implements BusinessFeign {

    /**
     *
     * @return ResultDto
     */
    @Override
    public ResultDto businessTest() {
        log.error("businessTest客户端回退");
        return ResultDto.build(ErrorMessageCode.ERROR_SERVER);
    }


}