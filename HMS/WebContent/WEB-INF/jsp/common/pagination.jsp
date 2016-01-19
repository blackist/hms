<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="am-cf">
	&nbsp;&nbsp;共 ${pb.totalrecards}条记录
	<div class="am-fr">
		<ul class="am-pagination">

			<li <c:if test="${pb.pagecode<=1}">class="am-disabled"</c:if>><a
				class="page-indexor" href="javascript:void(0);"
				<c:if test="${pb.pagecode>1}">value="${page.pagecode-1}"</c:if>>«</a></li>

			<c:forEach items="${pb.pcList}" var="pagecode">
				<li <c:if test="${pb.pagecode==pagecode}">class="am-active"</c:if>><a
					class="page-indexor" href="javascript:;"
					<c:if test="${pagecode>-1}">value="${pagecode}"</c:if>>${pagecode}</a></li>
			</c:forEach>

			<li
				<c:if test="${pb.pagecode>=pb.totalpages}">class="am-disabled"</c:if>><a
				class="page-indexor" href="javascript:;"
				<c:if test="${pb.pagecode<pb.totalpages}">value="${pb.pagecode+1}"</c:if>>»</a></li>

		</ul>
	</div>
</div>

<script type="text/javascript">
	/* 为页码绑定查询器 */
	function _pageIndexBond(_queryfunc) {
		/*翻页页码绑定查询器*/
		$(".page-indexor").click(function() {
			/*页码*/
			var pagecode = $(this).attr("value");
			/*执行查询*/
			_queryfunc(pagecode);
		});
	}
</script>