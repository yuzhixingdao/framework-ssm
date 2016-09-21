package com.aac.framework.ifc.core.json;

import java.io.Serializable;

import com.aac.framework.common.util.json.GsonUtil;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Request<T> implements Serializable {
	
	private static final long serialVersionUID = 2906181638087248718L;

	private String requestCode;

	private T data;

	public Request<T> fromJson(String jsondata, TypeToken<Request<T>> type) {
		Gson gson = GsonUtil.createGson();
		return gson.fromJson(jsondata, type.getType());
	}

	public String getRequestCode() {
		return requestCode;
	}

	public void setRequestCode(String requestCode) {
		this.requestCode = requestCode;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
