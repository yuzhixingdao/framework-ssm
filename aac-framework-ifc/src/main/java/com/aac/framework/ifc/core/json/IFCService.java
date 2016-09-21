package com.aac.framework.ifc.core.json;

public interface IFCService<T> {

	public Response<T> execute(String qtData);
	
}
