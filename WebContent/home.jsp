<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" pageEncoding="UTF-8"%>
<html>
	<head>
		 <title>魔都召唤师</title>
		<meta http-equiv="Content-Language" content="zh-cn">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <style>
		body
		{
			SCROLLBAR-ARROW-COLOR: #ffffff;  SCROLLBAR-BASE-COLOR: #dee3f7;
		}
    </style>
  </head>
 
<frameset rows="103,*,43" frameborder=0 border="0" framespacing="0">
  <frame src="${pageContext.request.contextPath}/top.jsp" name="topFrame" scrolling="NO" noresize>
  <frameset cols="159,*" frameborder="0" border="0" framespacing="0">
		<frame src="${pageContext.request.contextPath}/left.jsp" name="leftFrame" noresize scrolling="YES">
		<frame src="${pageContext.request.contextPath}/welcome.jsp" name="mainFrame">
  </frameset>
  <frame src="${pageContext.request.contextPath}/bottom.jsp" name="bottomFrame" scrolling="NO"  noresize>
</frameset>
</html>
