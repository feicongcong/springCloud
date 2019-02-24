package com.SpringCloudAll.feign.common.constant;

/**
 * @Description:常量码
 * @Author: J.W
 * @Date: 下午8:29 2018/1/6
 */
public class ErrorMessageCode {

    /**
     * 系统异常码
     */
    public static final String ERROR_SYSTEM = "ERROR_SYSTEM";
    public static final String ERROR_SERVER = "ERROR_SERVER";
    public static final String ERROR_SYSTEM_PARAM_FORMAT = "ERROR_SYSTEM_PARAM_FORMAT";
    public static final String ERROR_DATA_MISS = "ERROR_DATA_MISS";
    public static final String ERROR_OPERATE_FAIL = "ERROR_OPERATE_FAIL";

    /**
     * 加密解密
     */
    public static final String ERROR_ENCODE = "ERROR_ENCODE";
    public static final String ERROR_DECODE = "ERROR_DECODE";

    /**
     * 文件服务器Oss
     */
    public static final String ERROR_FILE_SERVER_UPLOAD = "ERROR_FILE_SERVER_UPLOAD";
    public static final String ERROR_FILE_SERVER_UPLOAD_SIZE_EXCEED = "ERROR_FILE_SERVER_UPLOAD_SIZE_EXCEED";
    public static final String ERROR_FILE_SERVER_GENERATE_URL = "ERROR_FILE_SERVER_GENERATE_URL";
    public static final String ERROR_FILE_SERVER_DOWNLOAD = "ERROR_FILE_SERVER_DOWNLOAD";

    /**
     * 鉴权
     */
    public static final String ERROR_ACCESS_NEED_AUTH = "ERROR_ACCESS_NEED_AUTH";
    public static final String ERROR_ACCESS_DENIED = "ERROR_ACCESS_DENIED";
    public static final String ERROR_ACCESS_PRINCIPAL_CHECK = "ERROR_ACCESS_PRINCIPAL_CHECK";
    public static final String ERROR_ACCESS_TOKEN_NOT_EXIST = "ERROR_ACCESS_TOKEN_NOT_EXIST";

    /**
     * 获取验证码次数超限
     */
    public static final String ERROR_GET_CAPTCHA_NUM_OUT_LIMIT = "ERROR_GET_CAPTCHA_NUM_OUT_LIMIT";
    /**
     * 验证码
     */
    public static final String ERROR_CAPTCHA_NOT_EXIST = "ERROR_CAPTCHA_NOT_EXIST";
    public static final String ERROR_CAPTCHA_CODE_NOT_MATCH = "ERROR_CAPTCHA_CODE_NOT_MATCH";
    public static final String ERROR_CAPTCHA_CONTENT_NOT_MATCH = "ERROR_CAPTCHA_CONTENT_NOT_MATCH";
    public static final String ERROR_CAPTCHA_CLIENT_NOT_MATCH = "ERROR_CAPTCHA_CLIENT_NOT_MATCH";
    public static final String ERROR_CAPTCHA_HAS_EXPIRE = "ERROR_CAPTCHA_HAS_EXPIRE";


    /**
     * 用户信息校验
     */
    public static final String ERROR_MOBILE_FORMAT = "ERROR_MOBILE_FORMAT";

    public static final String ERROR_MERCHANT_NOT_EXISTS = "ERROR_MERCHANT_NOT_EXISTS";
    /**
     * 商户信息校验
     */
    public static final String ERROR_USER_MERCHANT_NOT_EXISTS = "ERROR_USER_MERCHANT_NOT_EXISTS";
    public static final String ERROR_USER_MERCHANT_IS_CANCEL = "ERROR_USER_MERCHANT_IS_CANCEL";
    public static final String ERROR_USER_MERCHANT_IS_FREEZE = "ERROR_ACCOUNT_USER_IS_FREEZE";
    public static final String ERROR_USER_MERCHANT_IS_WAIT_AUDIT = "ERROR_USER_MERCHANT_IS_WAIT_AUDIT";
    public static final String ERROR_USER_MERCHANT_HAS_ADDINFO = "ERROR_USER_MERCHANT_HAS_ADDINFO";

    /**
     * 会员信息校验
     */
    public static final String ERROR_USER_MEMBER_NOT_EXISTS = "ERROR_USER_MEMBER_NOT_EXISTS";


    /**
     * 活动不存在
     */
    public static final String ERROR_ACTIVITY_NOT_EXISTS = "ERROR_ACTIVITY_NOT_EXISTS";
    /**
     * 活动已参加过
     */
    public static final String ERROR_ACTIVITY_HAS_JOINED = "ERROR_ACTIVITY_HAS_JOINED";
    public static final String ERROR_ACTIVITY_HAS_FINISH = "ERROR_ACTIVITY_HAS_FINISH";



    /**
     * 微信服务号接口请求失败
     */
    public static final String ERROR_WECHAT_HTTP_REQUEST = "ERROR_WECHAT_HTTP_REQUEST";

    /**
     * 订单
     */
    public static final String ERROR_ORDER_NOT_EXISTS = "ERROR_ORDER_NOT_EXISTS";
    /**
     * 砍价订单已砍成功
     */
    public static final String ERROR_ORDER_BARGAIN_HAS_SUCCESSED = "ERROR_ORDER_BARGAIN_HAS_SUCCESSED";
    /**
     * 该好友已砍过此订单
     */
    public static final String ERROR_BARGAIN_RECORD_HAS_EXISTS = "ERROR_BARGAIN_RECORD_HAS_EXISTS";





}
