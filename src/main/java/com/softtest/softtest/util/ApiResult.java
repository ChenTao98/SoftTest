package com.softtest.softtest.util;

import com.alibaba.fastjson.JSONObject;
import com.softtest.softtest.util.errCode.ErrorCode;
import com.softtest.softtest.util.errCode.ErrorCodeException;

public class ApiResult {
	public static String writeSuccess() {
		JSONObject ret = new JSONObject();
		ret.put("errorCode", ErrorCode.SUCCESS.getErrorCode());
		ret.put("message", ErrorCode.SUCCESS.getType());
		return ApiJson.toJson(ret);
	}

	/**
	 * data可以是
	 * Record, writeData(userService.selectByPrimaryKey(user_phone));
	 * List<Record> writeData(userService.selectAll());
	 * */
	public static String writeData(Object data){
		JSONObject ret = new JSONObject();
		ret.put("errorCode", ErrorCode.SUCCESS.getErrorCode());
		ret.put("message", ErrorCode.SUCCESS.getType());
		ret.put("data", data);
		return ApiJson.toJson(ret);
	}

	/**
	 * List数据
 	 */
	public static String writeData(Object data, int total){
		JSONObject ret = new JSONObject();
		ret.put("errorCode", ErrorCode.SUCCESS.getErrorCode());
		ret.put("message", ErrorCode.SUCCESS.getType());
		ret.put("data", data);
		ret.put("total", total);
		return ApiJson.toJson(ret);
	}

	private static String writeError(int errorCode, String msg){
		JSONObject ret = new JSONObject();
		ret.put("errorCode", errorCode);
		ret.put("message", msg);
		return ApiJson.toJson(ret);
	}

	public static String writeError(ErrorCodeException exception){
		return writeError(exception.getErrCode(), exception.getType() + "：" + exception.getMessage());
	}
}
