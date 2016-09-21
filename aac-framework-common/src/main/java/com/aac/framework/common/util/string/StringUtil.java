package com.aac.framework.common.util.string;

public class StringUtil {

	public static String obj2str(Object obj) {
		if (obj != null) {
			return obj.toString();
		}
		return "";
	}
	
	public static String obj2strornull(Object obj) {
		if (obj != null) {
			return obj.toString();
		}
		return null;
	}
	
}
