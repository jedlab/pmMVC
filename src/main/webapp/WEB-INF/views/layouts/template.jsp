<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:set value="${pageContext.request.contextPath}" var="_ctx"></c:set>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title><tiles:getAsString name="title" /></title>
<link rel="stylesheet" href="${_ctx}/resources/css/kube.min.css">
<link rel="stylesheet" href="${_ctx}/resources/css/w3.css">

<script type="text/javascript" src="${_ctx}/resources/js/jquery.js"></script>
<script type="text/javascript" src="${_ctx}/resources/js/kube.min.js"></script>
</head>

<body>
	<div id="header">
		<tiles:insertAttribute name="header" />
	</div>

	<div id="sidemenu">
		<tiles:insertAttribute name="menu" />
	</div>

	<div class="w3-sand w3-grayscale w3-large">
		<div class="w3-container" id="about">
			<div class="w3-content" style="max-width: 700px;min-height: 750px;">
				<tiles:insertAttribute name="body" />
			</div>
		</div>
	</div>

	<div id="footer">
		<tiles:insertAttribute name="footer" />
	</div>
</body>
</html>
