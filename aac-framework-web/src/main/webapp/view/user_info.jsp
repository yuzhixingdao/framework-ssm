<%@ page language="java" import="java.util.*" isELIgnored="false" pageEncoding="UTF-8"%>
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
	
	<div class="panel panel-info">
	
		<div class="panel-heading">用户信息</div>
		<div class="panel-body">
		
			<form role="form">
				
				<div class="row">
				
				  <div class="col-md-4 base-top">
				  	 <div class="row">
				  	 	<div  class="col-xs-4 col-md-2">用户名</div>
				  	 	<div  class="col-xs-8 col-md-10">${user.personName}</div>
				  	 </div>
				  </div>
				  
				  <div class="col-md-4 base-top">
				  	 <div class="row">
				  	 	<div  class="col-xs-4 col-md-2">登陆名</div>
				  	 	<div  class="col-xs-8 col-md-10">${user.loginName }</div>
				  	 </div>
				  </div>
				  
				  <div class="col-md-4 base-top">
				  	 <div class="row">
				  	 	<div  class="col-xs-4 col-md-2">性别</div>
				  	 	<div  class="col-xs-8 col-md-10"><tag:dict dictType="GENDER" dictCode="${user.sex }"></tag:dict></div>
				  	 </div>
				  </div>
				  
				</div>
			  
			  </form>
			  
			</div>

		</div>
		
	</div>


</body>
</html>