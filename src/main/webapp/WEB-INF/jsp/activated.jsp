<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<c:set value="${pageContext.request.contextPath}" var="_ctx"></c:set>
<div class="w3-padding-large w3-margin-large" style="padding-top:50px;margin-top:50px"> 
کاربر ${user.username}
<br />
فعال شد

</div>