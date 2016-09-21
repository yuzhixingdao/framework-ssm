<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
  
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    <title>用户列表</title>

    <%@include file="/bases/view/base.jsp" %>
    
  </head>
  <body style="padding: 5px;">

	<form id="formUsers" class="form-inline" action="<%=path%>/user/queryPage" method="post">
		
		<div class="panel panel-default">
			<div class="panel-heading">用户列表</div>
			<div class="panel-body">
				<div class="form-group">
					<label for="exampleInputName2">姓名</label>
					<input type="text" name="personName" value="${user.personName }" class="form-control" id="exampleInputName2" placeholder="姓名">
				</div>
				<div class="form-group">
					<label for="exampleInputEmail2">登陆名</label>
					<input type="text" name="loginName"  value="${user.loginName }" class="form-control" id="exampleInputEmail2" placeholder="登陆名">
				</div>
				<button type="button" class="btn btn-default" onclick="Page.submit();">查询</button>
				<button type="button" class="btn btn-default" onclick="Page.submit();">清空</button>
			</div>

			<table class="table table-bordered table-striped table-hover table-condensed">
				<thead>
					<tr>
						<th colspan="20" class="base-text-right">
							<button type="button" class="btn btn-default btn-xs btn-danger" onclick="Bootstrap.form.removes('<%=path %>/user/queryInfo}', 'id');">删除</button>
						</th>
					</tr>
					<tr>
						<th class="base-text-center" width="30"></th>
						<th class="base-text-center" width="40"><input type="checkbox" onclick="Bootstrap.form.checkedAll(this, 'id');"></th>
						<th class="base-text-center">姓名</th>
						<th class="base-text-center">登陆名</th>
						<th class="base-text-center">性别</th>
						<th class="base-text-center">创建时间</th>
						<th class="base-text-center">更新时间</th>
						<th class="base-text-center">操作</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${page.pageList }" var="form" varStatus="index">
						<tr>
							<td align="center">${index.index+1 }</td>
							<td align="center"><input type="checkbox" name="id" value="${form.id }"></td>
							<td align="center">${form.personName }</td>
							<td align="center">${form.loginName }</td>
							<td align="center"><tag:dict dictType="GENDER" dictCode="${form.sex }"></tag:dict></td>
							<td align="center"><fmt:formatDate value="${form.createDate }" pattern="yyyy-MM-dd HH:mm:ss"/></td>
							<td align="center"><fmt:formatDate value="${form.updateDate }" pattern="yyyy-MM-dd HH:mm:ss"/></td>
							<td align="center">
								<button type="button" class="btn btn-default btn-xs btn-info" onclick="Form.action('<%=path %>/user/queryInfo?id=${form.id }');">详情</button>
								<button type="button" class="btn btn-default btn-xs btn-info" onclick="Form.action('<%=path %>/user/editInfo?id=${form.id }');">编辑</button>
								<button type="button" class="btn btn-default btn-xs btn-danger" onclick="Bootstrap.form.remove('#', '确认删除数据？');">删除</button>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<tag:page page="${page }" formId="formUsers"></tag:page>
			
		</div>
	</form>

</body>
</html>