package com.stylepopz.app.classifier;

import com.stylepopz.app.util.JsonUtil;
import com.stylepopz.app.util.StringUtil;



/**
 * Used if Alchemy Api is used to retrive blog data 	
*/

public class Alchemy implements Classifier{

	public String getClassifierData(String classifierUrl) {
		// TODO Auto-generated method stub
		//This will return Alchemy Data
		if( null == classifierUrl){
			return "";
		}
		return StringUtil.getSafeString(JsonUtil.getJSON("http://access.alchemyapi.com/calls/url/URLGetRankedKeywords?apikey=aad473649252d5b81f30d5950b95863faa211076&url="+classifierUrl+"&outputMode=json",60000));
	}

	

}
