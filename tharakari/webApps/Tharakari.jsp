<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tharakari Angadi</title>

<style>
#tharakari {
	position: inline;
	width: 450px;
	height: auto;
	margin: auto;
}

#tharakari>div {
	float: left;
	margin: 10px;
}

#label {
	width: 100px;
	height: 20px;
}

#text {
	width: 300px;
	height: 20px;
}

#sel {
	width: 144px;
	height: 20px;
}

input[type=text] {
	width: 100%;
}
</style>
</head>
<body>
<h2 align="center">${success}</h2>
	<form action="tharakari">
		<div id="tharakari">
			<div id="label">Name</div>
			<div id="text">
				<input type="text" name="name">
			</div>

			<div id="label">Quantity</div>
			<div id="text">
				<input type="text" name="quantity">
			</div>

			<div id="label">Price</div>
			<div id="text">
				<input type="text" name="price">
			</div>

			<div id="label">Type</div>
			<div id="text">
				<select id="sel" name="type">
					<option>Hybrid</option>
					<option>Javari</option>
				</select>
			</div>

			<div id="label">Delivery Date</div>
			<div id="text">
				<input type="date" name="deliveryDate">
			</div>
			<div id="text">
				<input  type="submit" value="Add">
				<input type="submit" formaction="display"
					value="Display item"> 
			</div>
		</div>
	</form>
	<!-- <form action="display">
	<divid="text">
	<input type="submit"
					value="Display item">
	</div>
	
	</form> -->

</body>
</html>