<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Vehicle || Entry</title>
</head>
<body>
	<form:form id="myvehicle" modelAttribute="vehicleObj"
		action="login-vehicle" method="post">

		<table align="left">
			<tr>
				<td><form:label path="name">Name : </form:label></td>
				<td><form:input path="name" name="name" id="name" /></td>
			</tr>
			<tr>
				<td><form:label path="model">Model : </form:label></td>
				<td><form:input path="model" name="model" id="model" /></td>
			</tr>
			<tr>
				<td><form:label path="type">Type :</form:label></td>
				<td><form:input path="type" name="type" id="description" /></td>
			</tr>
			<tr>
				<td></td>
				<td align="left"><form:button id="login" name="login">Login</form:button>
				</td>
			</tr>
			<tr></tr>
		</table>
	</form:form>

</body>
</html>