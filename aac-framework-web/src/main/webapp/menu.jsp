<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>

<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>用户列表</title>

<%@include file="/bases/view/base.jsp"%>

<link href="<%=path %>/plugins/bootstrap-treeview/bootstrap-treeview.min.css" rel="stylesheet">
<script type="text/javascript" src="<%=path %>/plugins/bootstrap-3.3.5-dist/js/bootstrap-treeview.min.js"></script>

</head>
<body class="base-color-menu">

<a href="<%=path%>/user/queryPage" target="mainFrame">用户列表</a>

<div class="container">
  <div class="row">
    <div class="col-sm-12">
      <label for="treeview"></label>
      <div id="treeview"/>
    </div>
  </div>
</div>

<script type="text/javascript">

function buildDomTree() {
   
  var data = [{id:'123', text:'用户列表sss'}];

  function walk(nodes, data) {
    if (!nodes) { return; }
    $.each(nodes, function (id, node) {
      var obj = {
        id: id,
        text: node.nodeName + " - " + (node.innerText ? node.innerText : ''),
        tags: [node.childElementCount > 0 ? node.childElementCount + ' child elements' : '']
      };
      if (node.childElementCount > 0) {
        obj.nodes = [];
        walk(node.children, obj.nodes);
      }
      data.push(obj);
    });
  }

  walk($('html')[0].children, data);
  return data;
}

$(function() {

  var options = {
    bootstrap2: false, 
    showTags: true,
    levels: 5,
    data: buildDomTree()
  };

  $('#treeview').treeview(options);
});

</script>

</body>
</html>