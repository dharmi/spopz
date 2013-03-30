package com.stylepopz.app.util;

public class StringUtil {
	
	public static String getSafeString(String data) {
		
		if( null == data || "".equals(data)) {
			return "";
		}
		
		return data;
	}

}
