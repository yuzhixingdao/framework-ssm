<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%String path = request.getContextPath();%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>

<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>咕咕救援管理系统</title>

</head>

<frameset rows="88,*" cols="*" frameborder="no" border="0" framespacing="0">
  <frame src="<%=path %>/top.jsp" name="topFrame" scrolling="no" noresize="noresize" id="topFrame" title="topFrame" />
  <frameset cols="187,*" frameborder="no" border="0" framespacing="0">
    <frame src="<%=path %>/menu.jsp" name="menuFrame" scrolling="no" noresize="noresize" id="menuFrame" title="menuFrame" />
    <frameset rows="40,*" frameborder="no" border="0" framespacing="0">
		<frame src="<%=path %>/info.jsp" name="infoFrame" id="infoFrame" title="infoFrame" />
		<frame src="<%=path %>/main.jsp" name="mainFrame" id="mainFrame" title="mainFrame" />
	</frameset>
  </frameset>
</frameset>

</html>