
var Form = {
	
	/**
	 *
	 */
	remove : function(url) {
		var ret = window.confirm("确认删除？");
		if (ret) {
			window.location.href = url;
		}
	},
	/**
	 * 
	 * @param {Object} url
	 * @param {Object} htmlName
	 */
	removes : function(url, htmlName) {
		var ckIds = $('[name="'+htmlName+'"]');
		var ids = "";
		for(var i=0; i<ckIds.length; i++){
			if(ckIds[i].checked){
				ids += ckIds[i].value + ',';
			}
		}
		
		if(ids != ""){
			ids = ids.substring(0,ids.length-1);
			var ret = window.confirm("确认删除？");
			if(ret){
				window.location.href = url + '?ids=' + ids;
			}
		}else{
			alert("请选择删除数据");
		}
	},
	/**
	 *
	 */
	checkedAll : function(th, name) {
		if (name != undefined && name != null && name != '') {
			var cks = $('[name="'+name+'"]');
			if (th.checked) {
				for (var i=0; i<cks.length; i++) {
					cks.get(i).checked = true;
				}
			} else {
				for (var i=0; i<cks.length; i++) {
					cks.get(i).checked = false;
				}
			}
		}
	},
	/**
	 * 
	 * @param {Object} url
	 */
	action : function(url) {
		window.location.href = url;
	}
	
};