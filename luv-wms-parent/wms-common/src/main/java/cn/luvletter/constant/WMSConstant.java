package cn.luvletter.constant;

import org.springframework.security.access.method.P;

/**
 * @author Zephyr Ji
 * @ Description: WMS 的一些常量
 * @ Date 2018/3/28
 */
public class WMSConstant {

    /**
     *  redis中存储当前用户登录仓库的map name
     */
    public static final String R_WAREHOUSENO_M = "R_WAREHOUSENO_M";
    /**
     * 默认分页开始
     */
    public static final String DEFAULT_START = "0";
    /**
     * 默认分页大小
     */
    public static final String DEFAULT_LIMIT = "10";
    /**
     * 七牛云ACCESSKEY
     */
    public static final String ACCESSKEY = "";
    /**
     * 七牛云SECRETKEY
     */
    public static final String SECRETKEY = "";
    /**
     * 七牛云BUCKET
     */
    public static final String BUCKET = "";
    /**
     * cdn服务器前缀
     */
    public static final String CDN_URL_PER = "";

    public static final String YES = "1";

    public static final String NO = "0";
}
