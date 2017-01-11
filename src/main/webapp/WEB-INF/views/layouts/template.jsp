<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
 
<html>
 
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title><tiles:getAsString name="title" /></title>
   
</head>
  
<body>
        <div id="header">
            <tiles:insertAttribute name="header" />
        </div>
     
        <div id="sidemenu">
            <tiles:insertAttribute name="menu" />
        </div>
             
        <div id="site-content">
            <tiles:insertAttribute name="body" />
        </div>
         
        <div id="footer">
            <tiles:insertAttribute name="footer" />
        </div>
</body>
</html>
