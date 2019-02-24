package com.SpringCloudAll.zuul.filter;

import com.SpringCloudAll.feign.common.constant.ErrorMessageCode;
import com.SpringCloudAll.feign.common.pojo.ResultDto;
import com.SpringCloudAll.feign.common.tool.JsonTools;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description:
 * @Author: CC.F
 * @Date: 21:55 2019/2/24
 */
@Slf4j
@Component
public class PreAuthFilter extends ZuulFilter {
    @Value("${token.name}")
    private String tokenName;
    @Value("${token.prefix.basic}")
    private String basicPrefix;
    @Value("${token.prefix.bearer}")
    private String bearerPrefix;

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        String authHeader = request.getHeader(this.tokenName);
        // 如果请求头没带token直接返回
        if (StringUtils.isBlank(authHeader)) {
            preAuthFail(ctx,ErrorMessageCode.ERROR_ACCESS_DENIED);
            return null;
        }

        // 对请求进行鉴权
        if (authHeader.startsWith(basicPrefix) && authHeader.length() > basicPrefix.length() + 2) {
            //这里直接通过了
            return null;
        }else{
            preAuthFail(ctx,ErrorMessageCode.ERROR_ACCESS_DENIED);
        }
        return null;
    }


    /**
     * 鉴权不通过
     *
     * @param ctx
     */
    private void preAuthFail(RequestContext ctx, String errorMessage) {
        ctx.setSendZuulResponse(false);
        ctx.setResponseStatusCode(HttpServletResponse.SC_OK);
        ResultDto resultDo = ResultDto.build(errorMessage);
        try {
            ctx.setResponseBody(JsonTools.encode(resultDo));
            ctx.getResponse().setContentType("application/json; charset=utf-8");
        } catch (JsonProcessingException e) {
            log.error("鉴权不通过返回结果json序列化失败, resultDo={}", resultDo, e);
            ctx.setResponseBody(resultDo.getErrorDescription());
            ctx.getResponse().setContentType("text/html; charset=UTF-8");
        }
    }
}
