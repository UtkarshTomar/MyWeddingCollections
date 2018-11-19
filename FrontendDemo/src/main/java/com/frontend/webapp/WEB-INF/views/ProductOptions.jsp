<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <c:set var="contextRoot" value="${ pageContext.request.contextPath}"/>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
      
<title>Product option page</title>
<style type="text/css">
.btn{
	background-color: #ffa366 ;
}

.btn:hover {
    background-color: #b34700 ;
}
</style>
</head>
<body>


<jsp:include page="./shared/header.jsp"/>

<br/><br/>
<div class="container">
	<div class="row">
  <div class="col-sm-6"><a href="${contextRoot}/admin/getProductForm" class="btn btn-primary btn-lg">Add Product</a></div>
  <div class="col-sm-6"><a href="${contextRoot}/admin/ViewProduct" class="btn btn-primary btn-lg" >View All Products</a></div>
</div>
</div>

<div style="margin-top:500px">
<jsp:include page="./shared/Footer.jsp"/>
</div>
</body>
</html>