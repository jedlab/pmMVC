<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<c:set value="${pageContext.request.contextPath}" var="_ctx"></c:set> 
<!-- About Container -->
    <h5 class="w3-center w3-padding-48"><span class="w3-tag w3-wide w3-padding-left w3-padding-right">ABOUT THE JEDLab PM</span></h5>
    <p>JEDLab pm lets you work more collaboratively and get more done.</p>
    
    <a href="${_ctx}/login" class="button" role="button">ورود</a>
    
    <a href="${_ctx}/users/register" class="button primary" role="button">ثبت نام</a>