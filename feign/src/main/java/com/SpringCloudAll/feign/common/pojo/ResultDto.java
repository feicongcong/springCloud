package com.SpringCloudAll.feign.common.pojo;

import org.apache.commons.lang3.StringUtils;

/**
 * @Description: 返回结果封装类
 * @Author: J.W
 * @Date: 下午8:26 2018/1/6
 */
public class ResultDto<T> extends AbstractBasePojo {

    private boolean isSuccess = true;
    /**
     * 错误码
     */
    private String error;
    /**
     * 错误描述信息
     */
    private String errorDescription;

    /**
     * 返回结果对象
     */
    private T result;

    private ResultDto() {

    }

    public static <T> ResultDto<T> build() {
        return new ResultDto<>();
    }

    public static <T> ResultDto<T> build(String messCodeConstant) {
        ResultDto<T> resultDo = ResultDto.build();
        resultDo.setError(messCodeConstant).setSuccess(false);
        return resultDo;
    }

//    /**
//     * 获取messageSource的消息
//     *
//     * @param code
//     * @return
//     */
//    private static String messageSource(String code) {
//        return SpringComponent.getBean(MessageSource.class).getMessage(code, null, code, null);
//    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public ResultDto<T> setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
        if (StringUtils.isNotBlank(this.errorDescription)) {
            this.setSuccess(false);
        }
        return this;
    }

    public String getError() {
        return error;
    }

    public T getResult() {
        return result;
    }

    public ResultDto<T> setResult(T result) {
        this.result = result;
        return this;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public ResultDto<T> setSuccess(boolean success) {
        isSuccess = success;
        return this;
    }

    public boolean isError() {
        return !isSuccess;
    }

    public ResultDto<T> setError(String error) {
        this.error = error;
        this.isSuccess = false;
        return this;
    }

}