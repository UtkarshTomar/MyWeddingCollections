<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <c:set var="contextRoot" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
 
<title>Supplier Option</title>
</head>
<body>
<jsp:include page="./shared/header.jsp"/>
<br/><br/>
<div class="container">
	<div class="row"><h1>Supplier-Options</h1></div>
	
	
	<hr/>
	
	
	<a href="${contextRoot}/admin/addsupplier">Add Supplier</a><br/>
	<a href="${contextRoot}/admin/viewsupplier">View All Supplier</a><br/>
	
	</div>
	<div style="margin-top:500px">
<jsp:include page="./shared/Footer.jsp"/>
</div>
	
	
	
</body>
</html>