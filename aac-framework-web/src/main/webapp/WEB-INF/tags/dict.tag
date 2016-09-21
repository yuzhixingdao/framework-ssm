<%@ tag pageEncoding="UTF-8"%>
<%@ tag import="com.aac.framework.init.DictService"%>
<%@ tag import="java.util.List"%>
<%@ tag import="com.aac.framework.entity.Dictionary"%>

<%@ attribute name="operation" rtexprvalue="true" type="java.lang.String"%>
<%@ attribute name="dictType" rtexprvalue="true" type="java.lang.String"%>
<%@ attribute name="dictCode" rtexprvalue="true" type="java.lang.String"%>
<%@ attribute name="selected" rtexprvalue="true" type="java.lang.String"%>
<%@ attribute name="name" rtexprvalue="true" type="java.lang.String"%>
<%@ attribute name="onclick" rtexprvalue="true" type="java.lang.String"%>

<!-- 参数说明 -->
<!-- operation : 操作选项（null或者1：获取字典值、option或2：获取下拉列表、checkbox或3：获取复选框） -->
<!-- dictType ：字典类型 -->
<!-- dictCode ：字典编码 -->
<!-- selected ：默认选中 -->
<!-- name : 如果operation为checkbox或3时，要传入name属性（指定checkbox的名称） -->

<%
	if((operation == null) || (operation != null && operation.equals("1"))){
		if(dictType != null && dictCode != null){
			out.print(DictService.getDictText(dictType, dictCode));
		}
	}else if(operation != null && (operation.equals("2") || operation.equals("option"))){
		if(dictType != null){
			List list = DictService.getDictList(dictType);
			if(list != null && list.size() > 0){
				Boolean flag = false;
				for(int i=0; i<list.size(); i++){
					Dictionary dict = (Dictionary)list.get(i);
					
					if(selected != null){
						if(selected.indexOf(",") > 0){
							flag = false;
							String sps[] = selected.split(",");
							for(int l=0; l<sps.length; l++){
								if(dict.getDictCode().equals(sps[l])){
									out.print("<option value='"+dict.getDictCode()+"' selected='selected'>"+dict.getDictText()+"</option>");
									flag = true;
									break;
								}
							}
							if(!flag){
								out.print("<option value='"+dict.getDictCode()+"'>"+dict.getDictText()+"</option>");
							}
						}else{
							if(dict.getDictCode().equals(selected)){
								out.print("<option value='"+dict.getDictCode()+"' selected='selected'>"+dict.getDictText()+"</option>");
							}else{
								out.print("<option value='"+dict.getDictCode()+"'>"+dict.getDictText()+"</option>");
							}
						}
					}else{
						out.print("<option value='"+dict.getDictCode()+"'>"+dict.getDictText()+"</option>");
					}
					
				}
			}
		}
	}else if(operation != null && (operation.equals("3") || operation.equals("checkbox"))){
		if(dictType != null){
			List list = DictService.getDictList(dictType);
			if(list != null && list.size() > 0){
				Boolean flag = false;
				
				onclick = onclick == null ? "" : onclick;
				
				for(int i=0; i<list.size(); i++){
					Dictionary dict = (Dictionary)list.get(i);
					
					if(selected != null){
						if(selected.indexOf(",") > 0){
							flag = false;
							String sps[] = selected.split(",");
							for(int l=0; l<sps.length; l++){
								if(dict.getDictCode().equals(sps[l])){
									out.print("<input type='checkbox' name='"+name+"' value='"+dict.getDictCode()+"' checked='checked' onclick='"+onclick+"'>" + dict.getDictText());
									flag = true;
									break;
								}
							}
							if(!flag){
								out.print("<input type='checkbox' name='"+name+"' value='"+dict.getDictCode()+"' onclick='"+onclick+"'>" + dict.getDictText());
							}
						}else{
							if(dict.getDictCode().equals(selected)){
								out.print("<input type='checkbox' name='"+name+"' value='"+dict.getDictCode()+"' checked='checked' onclick='"+onclick+"'>" + dict.getDictText());
							}else{
								out.print("<input type='checkbox' name='"+name+"' value='"+dict.getDictCode()+"' onclick='"+onclick+"'>" + dict.getDictText());
							}
						}
					}else{
						out.print("<input type='checkbox' name='"+name+"' value='"+dict.getDictCode()+"' onclick='"+onclick+"'>" + dict.getDictText());
					}
				}
			}
		}
	} else if (operation != null && (operation.equals("4") || operation.equals("radio"))) {
		//<div class="radio"><label><input type="radio" name="sex" value="1" checked>&nbsp;男&nbsp;</label></div>
		if (dictType != null) {
			List list = DictService.getDictList(dictType);
			if (list != null && list.size() > 0) {
				Boolean flag = false;
				for (int i=0; i<list.size(); i++) {
					Dictionary dict = (Dictionary)list.get(i);
					
					if(selected != null){
						if(selected.indexOf(",") > 0){
							flag = false;
							String sps[] = selected.split(",");
							for(int l=0; l<sps.length; l++){
								if(dict.getDictCode().equals(sps[l])){
									out.print("<div class='radio'><label><input type='radio' name='" + name + "' value='" + dict.getDictCode() + "' checked>&nbsp;" + dict.getDictText() + "&nbsp;</label></div>");
									flag = true;
									break;
								}
							}
							if(!flag){
								out.print("<div class='radio'><label><input type='radio' name='" + name + "' value='" + dict.getDictCode() + "'>&nbsp;" + dict.getDictText() + "&nbsp;</label></div>");
							}
						}else{
							if(dict.getDictCode().equals(selected)){
								out.print("<div class='radio'><label><input type='radio' name='" + name + "' value='" + dict.getDictCode() + "' checked>&nbsp;" + dict.getDictText() + "&nbsp;</label></div>");
							}else{
								out.print("<div class='radio'><label><input type='radio' name='" + name + "' value='" + dict.getDictCode() + "'>&nbsp;" + dict.getDictText() + "&nbsp;</label></div>");
							}
						}
					}else{
						out.print("<div class='radio'><label><input type='radio' name='" + name + "' value='" + dict.getDictCode() + "'>&nbsp;" + dict.getDictText() + "&nbsp;</label></div>");
					}
				}
			}
		}
	}
%>

