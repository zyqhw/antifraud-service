/**
 * Project:antifraud-api
 * File:ResultCode.java
 * Copyright © 2003-2016 unisk.cn All rights reserved.
 */

package cn.unisk.antifraud.response;

/**
 * @author zhangyq
 * @date 2016年12月20日
 */

public enum ResultCode {
	FAULT(0, "occur error"),
	OK(1, "success"), 
	VALIDATE_ERROR(2, "validate error"), 
	DATA_NO_FOUND(3, "data no found");
	
	private final int code;
	
	private final String msg;
	
	private ResultCode(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

}
