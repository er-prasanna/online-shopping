<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />
<spring:url var="vendor" value="/resources/vendor" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Online Shopping - ${title}</title>
<script>
	window.menu = '${title}';
	window.category = '${id}';
</script>
<!-- Bootstrap core CSS -->
<link href="${vendor}/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Bootswatch flatly theme -->
<link href="${css}/bootstrap-flatly.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/shop-homepage.css" rel="stylesheet">

</head>

<body>

	<div class="wrapper">
		<!-- Navigation -->
		<%@include file="./shared/navbar.jsp"%>

		<!-- Page Content -->

		<div class="content">

			<c:if test="${userClickHome == true }">
				<!-- load home page -->
				<%@include file="home.jsp"%>
			</c:if>


			<c:if test="${userClickAbout == true }">
				<!-- load about us page -->
				<%@include file="about.jsp"%>
			</c:if>


			<c:if test="${userClickContact == true }">
				<!-- load contact us page -->
				<%@include file="contact.jsp"%>
			</c:if>
			<c:if test="${userClickAllProducts == true }">
				<!-- load contact us page -->
				<%@include file="listProducts.jsp"%>
			</c:if>
			<c:if test="${userClickCategoryProduct == true }">
				<!-- load contact us page -->
				<%@include file="listProducts.jsp"%>
			</c:if>
		</div>
		<!-- End of Content class -->
		<!-- Footer -->
		<%@include file="./shared/footer.jsp"%>

		<!-- Bootstrap core JavaScript -->
		<script src="${vendor}/jquery/jquery.min.js"></script>
		<script src="${vendor}/bootstrap/js/bootstrap.bundle.min.js"></script>
		<script src="${js}/myapp.js"></script>

	</div>
	<!--  End of wrapper -->

</body>

</html>
