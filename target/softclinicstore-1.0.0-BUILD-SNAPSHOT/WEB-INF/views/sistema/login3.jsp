<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Inicio de Sección|SCS</title>
	<!-- Bootstrap core CSS -->
	<link href="resources/bootstrap-3.3.7/dist/css/bootstrap.min.css" rel="stylesheet" type="text/css">
		
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<link href="resources/bootstrap-3.3.7/docs/assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet" type="text/css">

	<!-- Custom styles for this template -->
	<link href="resources/bootstrap-3.3.7/docs/examples/signin/signin.css" rel="stylesheet" type="text/css">
</head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<body style="background-image: url('resources/imagenes/Zika-virus-3D.png');">
<div class="container">
	<div style="text-align:center;">
	<table width="800" border="0" align="center">
	  <tr>
	    <td>&nbsp;</td>
	  </tr>
	  <tr>
	    <td>&nbsp;</td>
	  </tr>
	</table>
	</div>

  <c:url var="loginUrl" value="/j_spring_security_check" />
<form action="${loginUrl}" method="post">
  
  <table width="800" border="0" class="form-signin">
    <tr>
    	<td colspan="4">&nbsp;</td>
  	</tr>
  	<tr>
    	<td colspan="4" align="center">
        <div>
            <h3 class="form-signin-heading">Iniciar Sesi&oacute;n&nbsp;</h3>
        </div>
        </td>
  	</tr>
  	<tr>
      <td colspan="4" align="left">
      <label for="inputlogin" class="sr-only">Usuario de Sistema</label>
      <input name="username" id="inputlogin" type="text" class="form-control" placeholder="Usuario de Sistema" required autofocus/>
  	<tr>
    	<td colspan="4" align="left">
        <label for="inputpasswd" class="sr-only">Clave</label>
        <input name="password" id="inputpasswd" type="password" class="form-control" placeholder="Clave" required/>
        </td>
  	</tr>
  	<tr>
        <td colspan="4" rowspan="2" align="center" valign="middle">
            <p>
            <input name="submit" type="hidden" value="Enviar" />
            <button class="btn btn-lg btn-primary btn-block" type="submit">Aceptar</button>
            </p>
        </td>
  	</tr>
  	<tr>
  		<td colspan="4">&nbsp;</td>
        <td colspan="4">&nbsp;</td>
  	</tr>
  	<tr>
        <td colspan="4" height="21" align="center">
        	<c:if test="${param.logout != null}">
				<div id="logoutDialog" title="Cierre de sesi&oacute;n" style="color: silver; text-indent: em;">
		  			<p>Se ha finalizado la sesión satisfactoriamente</p>
				</div>
			</c:if>
			 <c:if test="${param.error != null}">
				<div id="loginErrorDialog" title="Error en datos de acceso" style="color: silver; text-indent: em;">
					<p>Por favor verifique los datos de acceso del  usuario</p>
				</div>
			</c:if>
			
			<c:if test="${param.close != null}">
				<div id="logoutDialog" title="Cierre de sesi&oacute;n" style="color: silver; text-indent: em;">
				  <p>Se ha finalizado la sesión</p>
				</div>
			</c:if>
        </td>
  	</tr>
  	<tr>
  		<td colspan="4">&nbsp;</td>
        <td colspan="4">&nbsp;</td>
  	</tr>
  	<tr>
  		<td colspan="4">&nbsp;</td>
        <td colspan="4">&nbsp;</td>
  	</tr>
  	<tr>
        <td colspan="4" height="21" align="center">
        <div class="label-info">Copyright © 2017 - Done by Intraron - Venezuela&nbsp; </div>
        </td>
  	</tr>
</table>

</form>
</div> <!-- /container -->

<c:if test="${param.error != null}">
	<script>
		$(document).ready(function(){
			$("#loginErrorDialog").dialog({
				buttons : {
					"OK" : function() {
						$(this).dialog("close");
					}
				},
				modal: true,
				draggable: false,
				resizable: false,
				show: "fold"
			});
	
			$("#loginErrorDialog").dialog("open");
		});
	</script>
</c:if>
<c:if test="${param.logout != null}">
	<script>
		$(document).ready(function(){
			$("#logoutDialog").dialog({
				buttons : {
					"OK" : function() {
						$(this).dialog("close");
					}
				},
				modal: true,
				draggable: false,
				resizable: false,
				show: "fold"
			});
	
			$("#logoutDialog").dialog("open");
		});
	</script>
</c:if>

<c:if test="${param.close != null}">
	<script>
		$(document).ready(function(){
			$("#logoutDialog").dialog({
				buttons : {
					"OK" : function() {
						$(this).dialog("close");
					}
				},
				modal: true,
				draggable: false,
				resizable: false,
				show: "fold"
			});
	
			$("#logoutDialog").dialog("open");
		});
	</script>
</c:if>

 <script src="resources/bootstrap-3.3.7/docs/assets/js/ie-emulation-modes-warning.js"></script>
 <script src="resources/bootstrap-3.3.7/docs/assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
