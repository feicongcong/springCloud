package com.SpringCloudAll.business.restImpl;

import com.SpringCloudAll.feign.business.dto.TestDto;
import com.SpringCloudAll.feign.business.feign.BusinessFeign;
import com.SpringCloudAll.feign.common.pojo.ResultDto;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class BusinessRestImpl implements BusinessFeign {
    @Override
    @HystrixCommand(fallbackMethod = "businessTestHystrix")
    public ResultDto<String> businessTest() {
        ResultDto<String> resultDto = ResultDto.build();
//        if(true) {
//            throw new RuntimeException("businessTestHystrix");
//        }
        return resultDto.setResult("business9023");
    }

    @Override
    public void performanceTest(TestDto testDto) {

    }

    public ResultDto<String> businessTestHystrix() {
        ResultDto<String> resultDto = ResultDto.build();
        return resultDto.setError("businessTestHystrix9021");
    }
}