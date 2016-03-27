<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
		<title>Products</title>
	</head>
	<body>
		<section>
			<div class="jumbotron">
				<div class="container">
					<h1>Customers</h1>
					<p>All cutomers of our store</p>
				</div>
			</div>
		</section>
		
		<section class="container">
			<div class="row">
				<table class="col-md-12 table table-striped">
					<thead>
						<tr>
							<th>Name</th>
							<th>Address</th>
							<th>Orders</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${customers}" var="customer">
							<tr>	
								<td>${customer.name}</td>
								<td>${customer.address }</td>
								<td>${customer.noOfOrdersMade}</td>			
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</section>
	</body>
</html>