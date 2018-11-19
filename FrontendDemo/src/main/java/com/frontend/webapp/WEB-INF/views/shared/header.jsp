<%@page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %> 
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>

<spring:url var="images" value="/resources/images"/>
   
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Home Page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="css/footer.css">
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid" style="background-color:#7D3C98">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Wedding Collections</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="http://localhost:8524/FrontendDemo/">Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Shop By Category<span class="caret"></span></a>
        <ul class="dropdown-menu">
        <c:forEach items="${sessionScope.catList}" var="catObj">
        	<li><a href="${contextRoot}/viewAllProducts/${catObj.categoryid}">${catObj.categoryname}</a></li>
        </c:forEach>
          
        </ul>
    </li>
      <li><a href="${contextRoot}/aboutUs">About Us</a></li>
      <li><a href="${contextRoot}/ContactUs">Contact Us</a></li>
      
       <sec:authorize access="hasAuthority('ADMIN')" > 
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Admin Options<span class="caret"></span></a>
        <ul class="dropdown-menu">
        
          <li><a href="${contextRoot}/admin/getProductPage">Product</a></li>
          <li><a href="${contextRoot}/admin/getCatagoryPage">Category</a></li>
          <li><a href="${contextRoot}/admin/getSupplierPage">Supplier</a></li>
    
	   </ul>
	   </li>
		</sec:authorize>   
    </ul>
    <sec:authorize access="isAnonymous()">
    <ul class="nav navbar-nav navbar-right">
      <li><a href="${contextRoot}/getSignUpForm"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="${contextRoot}/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
    </sec:authorize>
    
     <sec:authorize access="isAuthenticated()">
    	<ul class="nav navbar-nav navbar-right">
    		<li>Welcome :${sessionScope.userName}</li>
    		<li><a href="${contextRoot}/doLogout">Logout</a></li>
    	</ul>
    </sec:authorize>
</div>
</nav>
  
