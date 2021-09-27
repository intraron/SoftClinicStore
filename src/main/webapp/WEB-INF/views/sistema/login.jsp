<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="com.intraron.softclinicstore.dato.*" %>
<%@page import="com.intraron.softclinicstore.entidad.*" %>
<%@page import="com.intraron.softclinicstore.control.*" %>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>


<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">

<title>Inicio de Sección|SoftClinicStore</title>

</head>
	
<!-- Bootstrap core CSS -->
<link href="bootstrap-3.3.7/dist/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>

<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<link href="bootstrap-3.3.7/docs/assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet" type="text/css"/>

<!-- Custom styles for this template -->
<link href="bootstrap-3.3.7/docs/examples/signin/signin.css" rel="stylesheet" type="text/css"/>
    
<body background="Imagenes/fondoinicio.jpg">

<div style="text-align:center;">
<table width="800" border="0" align="center">
  <tr>
    <td class="form-signin-heading">
    <p>Aqui Banner</p>
    </td>
  </tr>
</table>
</div>
<div class="container">
<form:form class="form-signin" action="irBandeja.html" method="post">

  <%
    /*    String sMsjeError = "";
        Operador oOperador = new Operador();
        ControlBuscar oObjControl = new ControlBuscar();
        
        try{
            oOperador = oObjControl.buscarOperador(request, "login");
            
        }
        catch(Exception e){
            e.getMessage();
            sMsjeError=oObjControl.get_Mensaje();
        }
        */
    %>
  <table width="800" border="0" class="form-signin">
    <tr>
    	<td colspan="4">&nbsp;</td>
  	</tr>
  	<tr>
    	<td colspan="4" align="center">
        <div>
            <h2 class="form-signin-heading">Iniciar Sesi&oacute;n&nbsp;</h2>
        </div>
        </td>
  	</tr>
  	<tr>
      <td colspan="4" align="left">
      <form:label path="m_sUsuarioSistema" for="inputlogin" class="sr-only">Usuario de Sistema</form:label>
      <form:input path="m_sUsuarioSistema"/>
      </td>
  	<tr>
    	<td colspan="4" align="left">
    	<form:label path="m_sContrasena" for="inputpasswd" class="sr-only">Clave</form:label>
    	<form:input path="m_sContrasena"/>
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
        <% /*
        try{
            if (!sMsjeError.trim().equals("")){ 
        */%>
        <tr>
            <td bgcolor="red" colspan="4" align="center">
            <div align="center" class="alert-danger" role="alert"><% /*out.println(sMsjeError); */%></div> 
            </td>
        </tr>
        <%/*} 
        }
        catch(Exception e){
        sMsjeError=e.getMessage();
        }
        */%>
        <td colspan="4">&nbsp;</td>
  	</tr>
  	<tr>
        <td colspan="4" height="21" align="center">
        <div class="label-info">Copyright 2017- Done by Intraron - Venezuela&nbsp; </div>
        </td>
  	</tr>
</table>

</form:form>
</div>

<!-- Esto arregla un bug de win 10-->
<script src="bootstrap-3.3.7/docs/assets/js/ie10-viewport-bug-workaround.js" type="text/javascript"></script>
</body>
</html>
