<%@ tag pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ attribute name="page" required="true" rtexprvalue="true" type="java.util.Map"%>
<%@ attribute name="formId" required="true" rtexprvalue="true" type="java.lang.String"%>

<nav>
	<ul class="pagination" style="float: left;">
		<li>
			每页显示&nbsp;<input type="text" placeholder="条数" value="${page.pageSize}" onkeydown="Page.keyPageSize(event, this);" style="width: 33px; text-align: center;">&nbsp;条， 
			页码&nbsp;<input type="text" placeholder="页码" value="${page.pageNum}" onkeydown="Page.keyPageNum(event, this);"  style="width: 33px; text-align: center;">&nbsp;/&nbsp;${page.totalPage}，
			总条数${page.totalRow}条
		</li>
	</ul>
	<ul class="pagination" style="float: right;">
		<li><a href="javascript:void(0);" onclick="Page.gotoPage(1);" title="首页">&lt;&lt;</a></li>
		<li><a href="javascript:void(0);" onclick="Page.gotoPage(${page.pageNum-1});" title="上一页">&lt;</a></li>
		
		<c:forEach begin="${page.pageNum-5 <= 1 ? 1 : page.pageNum-5}" end="${page.pageNum+5>=page.totalPage ? page.totalPage : page.pageNum+5}" step="1" var="pageNum">
			<li class="${page.pageNum==pageNum ? 'active' : ''}"><a href="javascript:void(0);" onclick="Page.gotoPage(${pageNum});">${pageNum}</a></li>
		</c:forEach>
		
		<li><a href="javascript:void(0);" onclick="Page.gotoPage(${page.pageNum+1});" title="下一页">&gt;</a></li>
		<li><a href="javascript:void(0);" onclick="Page.gotoPage(${page.totalPage});" title="尾页">&gt;&gt;</a></li>
	</ul>
</nav>

<input type="hidden" id="page_pageNum" name="pageNum" value="${page.pageNum}" />
<input type="hidden" id="page_pageSize" name="pageSize" value="${page.pageSize}" />

<script type="text/javascript">

var Page = {
	gotoPage : function(pageNum) {
		if(pageNum >= 1 && pageNum <= ${page.totalPage}){
			$("#${formId} #page_pageNum").val(pageNum);
			$("#${formId}").submit();
		}
	},
	submit : function() {
		$("#${formId} #page_pageNum").val(1);
		$("#${formId}").submit();
	},
	
	keyPageSize : function(event, th) {
		if (event.keyCode=='13') {
			var pageSize = $(th).val();
			$("#${formId} #page_pageSize").val(pageSize);
			$("#${formId} #page_pageNum").val(1);
			$("#${formId}").submit();
		}
	},
	keyPageNum : function(event, th) {
		if (event.keyCode=='13') {
			var pageNum = $(th).val();
			$("#${formId} #page_pageNum").val(pageNum);
			$("#${formId}").submit();
		}
	}
};

</script>