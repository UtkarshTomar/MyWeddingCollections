<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>

<spring:url value="/resources/images" var="images"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style >
  .btn{
	background-color:  #00cc66 ;
}

.btn:hover {
    background-color: #6666ff ;
}
  
  </style>  
<title>All Products</title>
</head>
<body>

<jsp:include page="./shared/header.jsp"/>

<div class="container">

<!-- 	<div class="panel panel-info">
 	<div class="panel-heading"><h1><strong>View All Products</strong></h1></div>
 --> 	

		<br>
 		
 		<c:if test="${not empty msgToDisplay }">
		<div class="alert alert-success">
		${msgToDisplay}
		</div>
		</c:if>
		
	
	<h1>All Products</h1>
	<div class="table-responsive">
	<table class="table table-bordered" Style="background-color:#ddccff;">

		<tr>  
			<th><strong>Product Id</strong></th>
			<th><strong>Product Name</strong></th>
			<th><strong>Price</strong></th>
			<th><strong>Quantity</strong></th>
			<th><strong>Product Description</strong></th>
			<th><strong>Category Id</strong></th> 
			<th><strong>Supplier Id</strong> </th>
			<th><strong>Delete Product</strong></th>
			<th><strong>Update Product</strong></th>
		</tr>
			<c:forEach items="${productlist}" var="prodobj">
		<tr>
			<td>${prodobj.productid}</td>
			<td>${prodobj.productname }</td>
			<td>${prodobj.price }</td>
			<td>${prodobj.quantity }</td>
			<td>${prodobj.productdescription }</td>
			<td>${prodobj.categoryid }</td>
			<td>${prodobj.supplierid }</td>
			<td>${images}/${prodobj.imgName}</td>
			<td><img src="${images}/${prodobj.imgName}" style="height:150px;width:150px"/></td>
		
		<sec:authorize access="hasAuthority('ADMIN')">
  			<td><a href="deleteProduct/${productObj.productId}">Delete</a></td>
  			<td><a href="deleteProduct/${productObj.productId}">Update</a></td>
  			</sec:authorize>
			
			<td><a href="${contextRoot}/admin/deleteProduct/${prodobj.productid}"> <span class="glyphicon glyphicon-trash"></span></a>
				</td>
			<td><a href="${contextRoot}/admin/updateProduct/${prodobj.productid}"> <span class="glyphicon glyphicon-edit"></span></a></td>
			</tr>	
			</c:forEach>
			
		
		</table>
		</div>
</div>
</div>
</div>

<jsp:include page="./shared/Footer.jsp"/>

</body>
</html>