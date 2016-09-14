<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<!-- This file has been downloaded from Bootsnipp.com. Enjoy! -->
<title>Sign in Panel - YASH TECHNOLOGIES</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="http://netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css"
	rel="stylesheet">
<!-- 	
 Accessing Static pages by using spring tags
<spring:url value="/resources/css/customstyles.css" var="mainCss" />
	
<link href="${mainCss}" rel="stylesheet" />
-->

<style type="text/css">
.panel-heading {
	padding: 5px 15px;
}

.panel-footer {
	padding: 1px 15px;
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

<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>

<script
	src="http://netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container" style="margin-top: 40px">
		<div class="row">
			<div class="col-sm-8 col-md-6 col-md-offset-3">
				<div class="panel panel-default">
					<div class="panel-heading">
						<strong> RTD APP </strong>
					</div>
					<div class="panel-body">
						<form role="form" action="registerUser.htm" method="POST">
							<fieldset>
								<div class="row">
									<div class="center-block">
										<img class="profile-img"
											src="https://media.glassdoor.com/sqll/14704/yash-technologies-squarelogo-1462539660064.png"
											alt="">
									</div>
								</div>
							
								<div class="row">
									<div class="col-sm-12 col-md-10  col-md-offset-1 ">
										<div class="form-group" id="userinformation">
											<div class="input-group">
												<span class="input-group-addon"> <i
													class="glyphicon glyphicon-map-marker"></i>
												</span> 
												<select name="companyLocations.location_name" class="form-control" aria-labelledby="dropdownMenu1" data-style="btn-primary">
													<option value="" selected disabled>Choose Company Location</option>
													<option value="USA-URBANDALE-114TH Street">USA-URBANDALE-114TH Street</option>
													<option value="INDIA-INDORE-Bansi Trade Center">INDIA-INDORE-BANSAI TRADE CENTER</option>
													<option value="INDIA-INDORE-Crystal IT PARK">INDIA-INDORE-CRYSTAL IT PARK</option>
													<option value="INDIA-HYDERABAD-IT Park">INDIA-HYDERABAD-IT PARK</option>
													<option value="INDIA-HYDERABAD-My Home Hub">INDIA-HYDERABAD-MY HOME HUB</option>
													<option value="INDIA-HYDERABAD-Raheja Mind Space">INDIA-HYDERABAD-RAHEJA MIND SPACE</option>
												</select>
											</div>
										</div>
										<div class="form-group" id="userinformation">
											<div class="input-group">
												<span class="input-group-addon"> <i
													class="glyphicon glyphicon-user"></i>
												</span> 
												<input class="form-control" placeholder="Firstname" name="firstname" type="text" autofocus> 
												<input class="form-control" placeholder="Lastname" name="lastname" type="text" autofocus> 
												<input class="form-control" placeholder="Date of birth" name="dob" type="text" type="text" onfocus="(this.type='date')" autofocus>
												<input class="form-control" placeholder="Contact" name="contact" type="text" autofocus> 
												<select name="gender.gender" class="form-control" aria-labelledby="dropdownMenu1" data-style="btn-primary">
													<option value="" selected disabled>Choose Gender</option>
													<option value="male">male</option>
													<option value="female">female</option>
												</select> 
												<input class="form-control" placeholder="Date of joining" name="doj" type="text" onfocus="(this.type='date')" autofocus>
											</div>
										</div>

										<div class="form-group" id="address">
											<div class="input-group">
												<span class="input-group-addon"> 
													<i class="glyphicon glyphicon-home"></i>
												</span> 
												<input class="form-control" placeholder="Street" name="address.street" type="text" autofocus> 
												<input class="form-control" placeholder="City" name="address.city" type="text" autofocus> 
												<input class="form-control" placeholder="State" name="address.state" type="text" autofocus>
												<input class="form-control" placeholder="Zip" name="address.zipcode" type="text" autofocus>
												<select name="address.country.country_name" class="form-control" aria-labelledby="dropdownMenu1" data-style="btn-primary">
													<option value="" selected disabled>Choose Country</option>
													<option value="india">India</option>
													<option value="usa">Usa</option>
												</select> 
											</div>
										</div>


										<div class="form-group">
											<div class="input-group">
												<span class="input-group-addon"> 
													<i class="glyphicon glyphicon-envelope"></i>
												</span> 
												<input class="form-control" placeholder="Email" name="email" type="text" value="">
											</div>
										</div>
										<div class="form-group">
											<div class="input-group">
												<span class="input-group-addon"> 
													<i class="glyphicon glyphicon-lock"></i>
												</span> 
												<input class="form-control" placeholder="Password" name="password" type="password" value="">
											</div>
										</div>
										<div class="form-group">
											<input type="submit" class="btn btn-lg btn-primary btn-block" value="Register">
										</div>

									</div>
								</div>
							</fieldset>
						</form>
					</div>
					<div class="panel-footer ">
						Already Have a Account <a href="./login.htm" onClick=""> Login
							Here </a>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
