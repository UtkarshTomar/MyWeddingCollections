<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>


<spring:url value="/resources/images" var="images"/>

<!DOCTYPE html>
<html lang="en">
<head>

  <title>Wedding Made Good</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<!-- Header -->
<jsp:include page="shared/header.jsp"/>


<!-- Content -->
<div class="container">
  
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner">
    <div class="item active">
      <img src="${images}/Banner1.jpg" alt="gef" style="height:550px;width:1200px">
      <div class="carousel-caption">
        <h3>White Beauty</h3>
        <p>Bride in white!</p>
      </div>
    </div>

    <div class="item">
      <img src="${images}/Banner2.jpg" alt="def" style="height:550px;width:1200px">
      <div class="carousel-caption">
        <h3>Best Color Combo</h3>
        <p>For Bridesmaid !</p>
      </div>
    </div>

    <div class="item">
      <img src="${images}/Banner3.webp" alt="abc" style="height:550px;width:1200px">
      <div class="carousel-caption">
        <h3>Bride and Groom</h3>
        <p>Handsome Groom!</p>
      </div>
    </div>
  </div>

  <!-- Left and right controls -->
  <a class="left carousel-control" href="#myCarousel" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
  
  
  <div class="jumbotron" style="margin-top:10px;text-align:center">
  	
    
    <h2>-----------WHAT OUR CLIENTS HAVE TO SAY ABOUT US-----------</h2>
    
   <pre> <p style="color:#B34E7D">
I wasn't so confident at first about picking my wedding outfit online. 
But with the special assistance of the stylist, she convinced me of changing my mind about helping me 
find the perfect wedding outfit, the virtual way!
<i><b>Sonalika Shetty In Anushree Reddy</b></i>

I cannot thank Aza enough for helping me put all my wedding 
outfits so seamlessly together. This is definitely a wedding heaven for all brides!
<i><b>Payal Chauhan In Varun Bahl</b></i>

I wasn't so confident at first about picking my wedding outfit online. But with the special assistance 
of the stylist, she convinced me of changing my mind about helping me find the perfect wedding outfit, 
the virtual way!
<i></b>Sonalika Shetty In Anushree Reddy</b></i>
     </p></pre>
  
  </div>
  
  <img src="${images}/Image1.jpg"  class="col-sm-4" alt="Cinque Terre" width="304" height="236">
  <img src="${images}/Image2.jpg"  class="col-sm-4" alt="Cinque Terre" width="304" height="236">
  <img src="${images}/Image3.jpg"  class="col-sm-4" alt="Cinque Terre" width="304" height="236"> 
  
  
  </div>


<!-- Footer -->
<jsp:include page="shared/Footer.jsp"/>
<!-- ./Footer -->
