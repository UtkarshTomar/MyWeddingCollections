<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="form"  uri="http://www.springframework.org/tags/form"%>
 
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  	  <c:set var="contextRoot" value="${pageContext.request.contextPath}"/>
    
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Wedding Made Good </title>
</head>
<body>
<jsp:include page="./shared/header.jsp"/>

<div class="container">

	<h1> Supplier</h1>
		<hr/>
		<br/>

	<h3>${heading}</h3>

<form:form action="${contextRoot}/admin/a3" method="POST" modelAttribute="supplierObj" enctype="multipart/form-data">
		<c:if test="${supplierObj.supplierid!=0}">
		<div class="form-group">
			<label for="supplierid">Supplier Id:</label>
			<form:input type="text" path="supplierid" readonly="true" class="form-control"/>
		</div>
		</c:if>	
		
		
			
		<div class="form-group">	
			<label for="supplierName">Supplier Name </label>
			<form:input type="text"  path="suppliername" class="form-control"/>
		</div>
			<div>
				<input type="submit" value="${button}" class="form-control btn btn-primary">
			</div>
			
	</form:form>
	</div><div style="margin-top:300px">
<jsp:include page="./shared/Footer.jsp"/>
</div>

</body>
</html>