<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
  
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    <title>用户详情</title>

    <%@include file="/bases/view/base.jsp" %>
    
</head>
<body style="padding: 20px;">
	
<form role="form" action="<%=path %>/user/editSubmit" method="post">

	<input type="hidden" name="id" value="${user.id }" />

	<div class="panel panel-info">
		<div class="panel-heading">用户信息</div>
		<div class="panel-body">
		
			<div class="row">
			
			  <div class="col-md-4 base-top">
			  	 <div class="row">
			  	 	<div  class="col-xs-4 col-md-2">用户名</div>
			  	 	<div  class="col-xs-8 col-md-10"><input type="text" class="form-control" id="inputpersonName3" name="personName" value="${user.personName }"></div>
			  	 </div>
			  </div>
			  
			  <div class="col-md-4 base-top">
			  	 <div class="row">
			  	 	<div  class="col-xs-4 col-md-2">登陆名</div>
			  	 	<div  class="col-xs-8 col-md-10"><input type="text" class="form-control" id="inputpersonName3" name="loginName" value="${user.loginName }"></div>
			  	 </div>
			  </div>
			  
			  <div class="col-md-4 base-top">
			  	 <div class="row">
			  	 	<div  class="col-xs-4 col-md-2">性别</div>
			  	 	<div  class="col-xs-8 col-md-10 form-inline">
						<tag:dict operation="radio" name="sex" selected="${user.sex }" dictType="GENDER"></tag:dict>
			  	 	</div>
			  	 </div>
			  </div>
			  
			</div>
			
		</div>
		
		<div class="panel-footer text-center">
			<input class="btn btn-default base-width-100" type="submit" value="Submit">
		</div>
		
	</div>
</form>

</body>
</html>