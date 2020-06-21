<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crea Factura</title>
 <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
  <link rel="stylesheet" href="http://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="http:/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
</head>
<body>
<script type="text/javascript">
	$(function () {
 	$("#datepicker-1").datepicker();
	});
</script>

<header><h1>Crea una nueva factura</h1></header>

	<section class="wrapper">
		<form action="CreaFact" method="post" class="formUser">
			 <table width="40%">
			    <tr>
			      <td width="50%"><label for="nombre">Nombre Empresa: </label></td>
			      <td width="50%"><input type="text" name="nombre" id="nombre"></td>
			    </tr>
			    <tr>
			      <td><label for="rubro">Giro Empresa:  </label></td>
			      <td><input type="text" name="giro" id="giro"></td>
			    </tr>
			    <tr>
			      <td><label for="rut">Rut Empresa: </label></td>
			      <td><input type="text" name="rut" id="rut"></td>
			    </tr>
			    <tr>
			      <td><label for="fecha">Fecha: </label></td>
			      <td><input type="text" name="fecha" id="datepicker-1"></td>
			    </tr>
			    <tr> <br />
      			<td colspan="2" align="center"><input type="submit" name="button" id="button" value="Enviar"></td>
    			</tr>
		</form>
	</section>
	
</body>
</html>