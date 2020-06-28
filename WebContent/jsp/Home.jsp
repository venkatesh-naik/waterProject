<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/js/bootstrap-datepicker.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/css/bootstrap-datepicker3.css" />
<style>
.bs-example {
	margin: 10px;
}
</style>
</head>
<body>
	<div class="bs-example">
		<form action="save" method="post" class="needs-validation" novalidate>
			<div class="form-group">
				<label for="areaName">Area: </label> 
				<select class="form-control" name="area">
					<option>Rajajinagar</option>
					<option>HsrLayout</option>
				</select>

				<div class="invalid-feedback">area is not empty</div>
				<div class="valid-feedback">Looks good!</div>
			<div class="form-group">
				<label for="noof liters">NoOfLiters:</label> 
				<input type="number" class="form-control" name="nol" placeholder="NoOfLiters" required>
					<div class="invalid-feedback">NoOfLiters not empty</div>
					<div class="valid-feedback">Looks good!</div>
			
			<div style="padding-bottom: 10px">
			<button type="submit" class="btn btn-primary">send</button>
			</div>
		</form>
		

		<script>
			// Example starter JavaScript for disabling form submissions if there are invalid fields
		(
			function() {
						'use strict';
					window.addEventListener('load',function() {
			// Fetch all the forms we want to apply custom Bootstrap validation styles to
				var forms = document.getElementsByClassName('needs-validation');
			// Loop over them and prevent submission
				var validation = Array.prototype.filter.call(forms,function(form) {
					form.addEventListener('submit',function(event) {
						if (form.checkValidity() === false) {
						event.preventDefault();
						event.stopPropagation();
					}
				form.classList.add('was-validated');
		},	false);
});
}, false);
})();
		</script>
	</div>

</body>
</html>