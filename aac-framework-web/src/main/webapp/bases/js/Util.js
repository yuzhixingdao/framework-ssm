Date.prototype.format=function(fmt) {           
    var o = {           
    "M+" : this.getMonth()+1, //�·�           
    "d+" : this.getDate(), //��           
    "h+" : this.getHours()%12 == 0 ? 12 : this.getHours()%12, //Сʱ           
    "H+" : this.getHours(), //Сʱ           
    "m+" : this.getMinutes(), //��           
    "s+" : this.getSeconds(), //��           
    "q+" : Math.floor((this.getMonth()+3)/3), //����           
    "S" : this.getMilliseconds() //����           
    };           
    var week = {           
    "0" : "/u65e5",           
    "1" : "/u4e00",           
    "2" : "/u4e8c",           
    "3" : "/u4e09",           
    "4" : "/u56db",           
    "5" : "/u4e94",           
    "6" : "/u516d"          
    };           
    if(/(y+)/.test(fmt)){           
        fmt=fmt.replace(RegExp.$1, (this.getFullYear()+"").substr(4 - RegExp.$1.length));           
    }           
    if(/(E+)/.test(fmt)){           
        fmt=fmt.replace(RegExp.$1, ((RegExp.$1.length>1) ? (RegExp.$1.length>2 ? "/u661f/u671f" : "/u5468") : "")+week[this.getDay()+""]);           
    }           
    for(var k in o){           
        if(new RegExp("("+ k +")").test(fmt)){           
            fmt = fmt.replace(RegExp.$1, (RegExp.$1.length==1) ? (o[k]) : (("00"+ o[k]).substr((""+ o[k]).length)));           
        }           
    }           
    return fmt;           
}         

var DateUtil = {
	
	/**
	 * ��ȡ��ǰʱ��
	 * ���ظ�ʽ��yyyy-MM-dd hh:mm:ss
	 */
	getCurrentlyDate : function(){
		return DateUtil.format(new Date());
	},
	/**
	 * ��ȡ�������
	 */
	getCurrentlyZero : function(){
		var date = new Date();
		var year = date.getFullYear();
		var month = date.getMonth() + 1;
		var day = date.getDate();
		return year + "-" + month + "-" + day + " 00:00:00";
	},
	/**
	 * ��ȡ�������һ��
	 */
	getCurrentlyUltimate : function(){
		var date = new Date();
		var year = date.getFullYear();
		var month = date.getMonth() + 1;
		var day = date.getDate();
		return year + "-" + month + "-" + day + " 23:59:59";
	},
	/**
	 * ���һ��ʱ��
	 * strDate : yyyy-MM-dd hh:mm:ss ��ʽ���ַ���
	 * millisecond : ���ӵĺ���������������
	 */
	getSpacingDate : function(strDate, millisecond){
		strDate = strDate.replace(/-/g,"/");
		var date = new Date(strDate);
		
		date.setTime(date.getTime() + (millisecond));
		
		var year = date.getFullYear();
		var month = date.getMonth() + 1;
		var day = date.getDate();
		
		var hours = date.getHours();
		var minutes = date.getMinutes();
		var seconds = date.getSeconds();
		
		month = month < 10 ? ("0" + month) : month;
		day = day < 10 ? ("0" + day) : day;
		
		hours = hours < 10 ? ("0" + hours) : hours;
		minutes = minutes < 10 ? ("0" + minutes) : minutes;
		seconds = seconds < 10 ? ("0" + seconds) : seconds;
		
		return year + "-" + month + "-" + day + " " + hours + ":" + minutes + ":" + seconds;
		
	},
//	/**
//	 *
//	 */
//	addTime(date, millisecond){
//		if(date != undefined && date != null && millisecond != undefined && millisecond != null){
//			if(date instanceof Date){
//				return date.setTime(date.getTime() + (millisecond));
//			}else if(typeof date == 'string'){
//				date = date.replace(/-/g,"/");
//				date = new Date(date);
//				date.setTime(date.getTime() + (millisecond));
//				return DateUtil.dateFormat(date, 'yyyy-MM-dd');
//			}
//		}
//	},
	/**
	 * ��ʽʱ��
	 * date : ��������ΪDate
	 */
	format : function(date){
		var year = date.getFullYear();
		var month = date.getMonth() + 1;
		var day = date.getDate();
		
		var hours = date.getHours();
		var minutes = date.getMinutes();
		var seconds = date.getSeconds();
		
		month = month < 10 ? ("0" + month) : month;
		day = day < 10 ? ("0" + day) : day;
		
		hours = hours < 10 ? ("0" + hours) : hours;
		minutes = minutes < 10 ? ("0" + minutes) : minutes;
		seconds = seconds < 10 ? ("0" + seconds) : seconds;
		
		return year + "-" + month + "-" + day + " " + hours + ":" + minutes + ":" + seconds;
	},
	dateFormat : function(date, format){
		if(date == undefined || date == null || date == '') date = new Date();
		if(format == undefined || format == null || format == '') format = 'yyyy-MM-dd';
		return date.format(format);
	},
	/**
	 * ��ȡ������
	 */
	getStrDateTime : function(strDate) {
		if (strDate != undefined && strDate != null && strDate != '') {
			strDate = strDate.replace(/-/g,"/");
			var date = new Date(strDate);
			return date.getTime();
		}
		return null; 
	}
}

var StringUtil = {
	/**
	 * ��ȡ�ַ���
	 * @param str
	 * @param first
	 * @param last
	 */
	substringForLong : function(str, first, last){
		if(str != undefined && str != null){
			if(str.length > 0 && str.length > last && first < last){
				return str.substring(first, last) + "...";
			}else{
				return str;
			}
		}
		return "";
	},
	show : function(str, defaultStr){
		if(str != undefined && str != null && (str + "") != ""){
			return str;
		}
		
		if(defaultStr != undefined && defaultStr != null && defaultStr != ""){
			return defaultStr;
		}
		return "";
	},
	appends : function(str, appendStr, splitStr){
		if (str.length > 0) {
			str += splitStr + appendStr;
		} else {
			str = appendStr;
		}
		return str;
	},
	deletes : function(str, deleteStr, splitStr){
		if (str.length > 0) {
			var ret = '';
			var st = str.split(splitStr);
			for (var i=0; i<st.length; i++) {
				if (st[i] != deleteStr) {
					ret += st[i];
					ret += splitStr;
				}
			}
			return ret.substring(0, ret.length-1);
		}
		return str;
	}
};

var NumberUtil = {
	
	/**
	 * ����2λС��
	 */
	get2Scale : function(num){
		
		if(num != undefined && num != null){
			return num.toFixed(2);
		}
		
		return '';
		
	}
	
};
