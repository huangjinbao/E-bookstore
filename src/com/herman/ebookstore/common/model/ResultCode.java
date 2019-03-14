package com.herman.ebookstore.common.model;

/**
 * 响应码枚举，参考HTTP状态码的语义
 */
public enum ResultCode {
    SUCCESS(200,"成功"),//成功
    FAIL(400,"失败"),//失败
    UNAUTHORIZED(401,"未认证"),//未认证（签名错误）
    INTERNAL_SERVER_ERROR(500,"服务器异常"),
    PARAMS_NOT_NULL(7001,"参数不能为空"),
    
	NOT_FOUND(404,"查询无此记录"),

	PASSWORD_ERROR(445,"密码错误"),

	SAME_PASSWORD(446,"新密码不能与原密码一样！"),

	MULTI_ACCOUNT_RECORD(1001,"同一账号有多条记录"),

	/**
	 * 参数错误
	 */
	PARAMETER_ERROR(9998,"参数错误"),
	SDK_ERROR(10001,"验证码获取错误"),
	SDK_USERCODE_EXIT(10002,"验证发送失败，该账号已存在"),
	SDK_SERVER_ERROR(10004,"验证码获取异常"),
	USERCODE_EXIT(10003,"该一卡通账号已被注册，请重新输入或者直接登录"),

	/**
	 * 服务器繁忙
	 */
	NETWORK_ERROR(9999,"服务器繁忙");
	private final int code;

    private final String message;

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
