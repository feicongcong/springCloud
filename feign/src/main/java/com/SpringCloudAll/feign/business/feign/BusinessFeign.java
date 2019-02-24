package com.SpringCloudAll.feign.business.feign;

import com.SpringCloudAll.feign.business.hystrix.BusinessHystrix;
import com.SpringCloudAll.feign.business.rest.BusinessRest;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @Description:
 * @Author: CC.F
 * @Date:
 */
@FeignClient(value = "business", fallback = BusinessHystrix.class)
public interface BusinessFeign extends BusinessRest {
}
