<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<c:set value="${pageContext.request.contextPath}" var="_ctx"></c:set> 
<!-- Links (sit on top) -->
<div class="w3-top">
  <div class="w3-row w3-padding w3-black">
    <div class="w3-col s3">
      <a href="${_ctx}/home" class="w3-btn-block w3-hover-white">صفحه اصلی</a>
    </div>
    <c:if test="${auth == null}">
    <div class="w3-col s3">
      <a href="${_ctx}/login" class="w3-btn-block w3-hover-white">ورود</a>
    </div>
    </c:if>
    
  </div>
</div>