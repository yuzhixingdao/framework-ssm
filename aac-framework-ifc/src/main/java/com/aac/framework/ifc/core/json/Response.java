package com.aac.framework.ifc.core.json;

import java.io.Serializable;

import com.aac.framework.common.util.json.GsonUtil;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Response<T> implements Serializable {

	private static final long serialVersionUID = -6469206527081991527L;
	private String responseCode;
	private String errorMessage;
	private String requestCode;
	private T data;

	public Response<T> fromJson(String jsondata, TypeToken<Response<T>> type) {
		Gson gson = GsonUtil.createGson();
		return gson.fromJson(jsondata, type.getType());
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public final String getRequestCode() {
		return requestCode;
	}

	public final void setRequestCode(String requestCode) {
		this.requestCode = requestCode;
	}

	@Override
	public String toString() {
		return "Response [data=" + data + ", errorMessage=" + errorMessage + ", requestCode=" + requestCode
				+ ", responseCode=" + responseCode + "]";
	}

}
