package lcxy.demo.bospider.commonbox;

/**
 * Function: 响应码枚举，参考HTTP状态码的语义
 *
 * @author miluo
 * Date: 2018/9/5 上午10:39
 * @since JDK 1.8
 */
public enum ResultCode {
    //成功
    SUCCESS(2000, "Success"),
    //已获得许可
    YE_VERY(2001, "Ye Very"),
    //暂无数据
    NONE_DATA(2002,"None Data"),
    //失败
    FAIL(4000, "Fail"),
    //未认证（签名错误）
    UNAUTHORIZED(4001, "Unauthorized"),
    NOT_AUTH(4002, "Not Auth"),
    //接口不存在
    NOT_FOUND(4004, "Not Found"),
    //token失效
    TOKEN_TIMEOUT(4444, "Token TimeOut"),
    //未获得许可（没有权限）
    NO_AUTH(4445, "No Auth"),
    //认证造假（上传的假token） 或者token上传错误
    TOKEN_ERROR(4446, "Token Error"),
    //参数校验错误
    PARAM_VALID(4447, "Param Valid"),

    //服务器内部错误
    INTERNAL_SERVER_ERROR(5000, "Internal Server Error"),
    //没那么智能，分辨不出正相关还是负相关
    NOT_SMART_ENOUGH(6008, "Not Smart Enough");




    public int code;
    public String message;

    ResultCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
