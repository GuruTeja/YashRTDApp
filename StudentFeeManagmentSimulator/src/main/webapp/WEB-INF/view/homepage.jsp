<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<!-- For Header,footer, and panel -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
		
		<!-- Table in Pagination -->
		<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css" rel='stylesheet' type='text/css'>
		
		<%@include file="/WEB-INF/view/functions/export.jsp" %>
		
		<script type="text/javascript">
			$(document).ready(function(){
				table = initTable('#userdetailtable', 'Users');
			});
		</script>
		
		<style type="text/css">
		    .bs-example{
		    	margin: 20px;
		    }
		    .panel-heading {
			padding: 5px 15px;
			}
			
			.panel-footer {
				padding: 3px 15px;
				color: #A0A0A0;
			}
			
			.profile-img {
				width: 200px;
				height: 200px;
				margin: 0 auto 10px;
				display: block;
				-moz-border-radius: 40%;
				-webkit-border-radius: 40%;
				border-radius: 40%;
			}
		</style>
	</head>
	<body>
		<center>
			<div id="navBar">
				<%@include file="/WEB-INF/view/header.jsp" %>
			</div>
			<div id="body">
				<%@include file="/WEB-INF/view/dashboard.jsp" %>
			</div>
			<div>
				<%@include file="/WEB-INF/view/footer.jsp" %>
			</div>
		</center>
	</body>
</html>
	