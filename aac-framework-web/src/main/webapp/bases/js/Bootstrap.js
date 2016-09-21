var Bootstrap = {
		
	form : {
		
		action : function(url) {
			window.location.href = url;
		},
		
		remove : function(url, body) {
			
			var dhtml = '' +
				'<div class="modal fade">' +
				  '<div class="modal-dialog modal-sm">' +
				    '<div class="modal-content">' +
				      '<div class="modal-header">' +
				        '<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>' +
				        '<h4 class="modal-title">删除提示</h4>' +
				      '</div>' +
				      '<div class="modal-body">' +
				        '<p>' + body + '</p>' +
				      '</div>' +
				      '<div class="modal-footer">' +
				        '<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>' +
				        '<button type="button" class="btn btn-primary" onclick="Bootstrap.form.action(\'' + url + '\');">确认</button>' +
				      '</div>' +
				    '</div>' + 
				  '</div>' + 
				'</div>';
			
			$(dhtml).modal('show');
			
		},
		
		/**
		 * 
		 * @param {Object} url
		 * @param {Object} name
		 */
		removes : function(url, name) {
			var ckIds = $('[name="'+name+'"]');
			var ids = "";
			for (var i=0; i<ckIds.length; i++) {
				if(ckIds[i].checked){
					ids += ckIds[i].value + ',';
				}
			}
			
			if (ids != "") {
				ids = ids.substring(0,ids.length-1);
				Bootstrap.form.remove(url + '?ids=' + ids, '确认删除数据？');
			} else {
				Bootstrap.dialog.alert('删除提示', '请选择删除数据');
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
		}

	},
	
	dialog : {
		alert : function(title, body) {
			title = (title == undefined || title == null || title == '') ? '提示' : title;
			body = (body == undefined || body == null || body == '') ? '确认当前操作吗？' : body;
			var dhtml = '' +
				'<div class="modal fade">' +
				  '<div class="modal-dialog modal-sm">' +
				    '<div class="modal-content">' +
				      '<div class="modal-header">' +
				        '<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>' +
				        '<h4 class="modal-title">' + title + '</h4>' +
				      '</div>' +
				      '<div class="modal-body">' +
				        '<p>' + body + '</p>' +
				      '</div>' +
				      '<div class="modal-footer">' +
				        '<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>' +
				      '</div>' +
				    '</div>' + 
				  '</div>' + 
				'</div>';
		
			$(dhtml).modal('show');
		}
	}
	
};