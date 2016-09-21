var Ajax = {
	/**
	 * 
	 * @param jsonParam
	 */
	send : function(jsonParam){
		
		if (jsonParam != undefined && jsonParam != null) {
			
			if (jsonParam.url == null || jsonParam.url == undefined) jsonParam.url = '#';
			if (jsonParam.type == null || jsonParam.type == undefined) jsonParam.type = 'POST';
			if (jsonParam.data == null || jsonParam.data == undefined) jsonParam.data = null;
			if (jsonParam.dataType == null || jsonParam.dataType == undefined) jsonParam.dataType = 'JSON';
			if (jsonParam.cache == null || jsonParam.cache == undefined) jsonParam.cache = false;
			if (jsonParam.sync == null || jsonParam.sync == undefined) jsonParam.sync = true;
			if (jsonParam.success == null || jsonParam.success == undefined) jsonParam.success = function(){};
			
			$.ajax(jsonParam);
			
		}
		
	}
	
};