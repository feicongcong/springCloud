package com.SpringCloudAll.business.restImpl;

import com.SpringCloudAll.feign.business.rest.BusinessRest;
import com.SpringCloudAll.feign.common.pojo.ResultDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: CC.F
 * @Date: 0:05 2019/2/25
 */
@Slf4j
@RestController
public class BusinessRestImpl implements BusinessRest {
    @Override
    public ResultDto<String> businessTest() {
        ResultDto<String> resultDto=ResultDto.build();
        return resultDto.setResult("business9022");
    }
}
