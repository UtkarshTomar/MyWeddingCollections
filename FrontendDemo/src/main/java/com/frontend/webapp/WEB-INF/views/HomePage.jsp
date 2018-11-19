<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %> 
<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>

<spring:url var="images" value="/resources/images"/>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
<style type="text/css">
.btn{
	background-color: Cyan ;
}

.btn:hover {
    background-color: cyan;

</style>
</head>
<body>
	
	<div class="panel-heading" align="center">
	<h1>Welcome to Weddings Made Good</h1>
	</div>
	<div align="center">
	<hr/>
	<a href="${contextRoot}/admin/getProductPage">Product</a><br/>
	<a href="${contextRoot}/admin/getCatagoryPage">Category</a><br/>
	<a href="${contextRoot}/admin/getSupplierPage">Supplier</a><br/>
	
	</div>
</body>
</html>