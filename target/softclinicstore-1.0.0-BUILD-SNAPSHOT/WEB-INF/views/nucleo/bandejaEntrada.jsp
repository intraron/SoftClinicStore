<%-- 
    Document   : bandejaEntrada
    Created on : 17/05/2017, 07:52:01 PM
    Author     : Nash
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.intraron.softclinicstore.dato.*" %>
<%@page import="com.intraron.softclinicstore.entidad.*" %>
<%@page import="com.intraron.softclinicstore.control.*" %>
<% request.setCharacterEncoding("UTF-8"); // Esta linea soluciona el problema del UTF-8 %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Menu|SoftClinicStore</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="resources/bootstrap-3.3.7/docs/assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet" type="text/css">
<link href="resources/bootstrap-3.3.7/dist/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="resources/bootstrap-3.3.7/docs/examples/navbar/navbar.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="container">

      <!-- Static navbar -->
      <nav class="navbar navbar-default">
        <div class="container-fluid">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">SoftClinicStore</a>
          </div>
          <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
              <li class="active"><a href="irbandeja">Home</a></li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Paciente<span class="caret"></span></a>
                <ul class="dropdown-menu">
                  <li><a href="irregistrarPaciente">Registrar Pacientes</a></li>
                  <li><a href="#">Gestionar Pacientes</a></li>
                </ul>
              </li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Clinico<span class="caret"></span></a>
                <ul class="dropdown-menu">
                  <li class="dropdown-header">Historia</li>
                  <li><a href="#">Gestionar Historias</a></li>
                  <li><a href="#">Ver Historias</a></li>
                  <li role="separator" class="divider"></li>
                  <li class="dropdown-header">Informe</li>
                  <li><a href="#">Gestionar Informes</a></li>
                  <li><a href="#">Ver Informes</a></li>
                </ul>
              </li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Presupuesto<span class="caret"></span></a>
                <ul class="dropdown-menu">
                  <li><a href="#">Gestionar Presupuesto</a></li>
                  <li><a href="#">Ver Presupuesto</a></li>
                </ul>
              </li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Reporte<span class="caret"></span></a>
                <ul class="dropdown-menu">
                  <li><a href="#">Gestionar Reportes</a></li>
                  <li><a href="#">Ver Reportes</a></li>
                </ul>
              </li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Administraci&oacute;n<span class="caret"></span></a>
                <ul class="dropdown-menu">
                  <li class="dropdown-header">Operador</li>
                  <li><a href="#">Registrar Operador</a></li>
                  <li><a href="#">Gestionar Operador</a></li>
                  <li role="separator" class="divider"></li>
                  <li class="dropdown-header">Rol</li>
                  <li><a href="#">Gestionar Roles</a></li>
                  <li role="separator" class="divider"></li>
                  <li class="dropdown-header">Empresa</li>
                  <li><a href="#">Gestionar Empresa</a></li>
                </ul>
              </li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a>Sr./Sra. ${sysUser}</a></li>
              <li><a href="irLogin3?logout">Salir</a></li>
            </ul>
          </div><!--/.nav-collapse -->
        </div><!--/.container-fluid -->
      </nav>

      <!-- Main component for a primary marketing message or call to action -->
      <div class="jumbotron">
        <h1>SoftClinicStore</h1>
        <p>Bienvenido al sistema de gestión y almacenamiento de historias clinicas SoftClinicStore Cloud.</p>
        <p>Done by intraron 2017</p>
      </div>
      
    </div> <!-- /container -->

<!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script>window.jQuery || document.write('<script src="resources/bootstrap-3.3.7/docs/assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="resources/bootstrap-3.3.7/dist/js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="resources/bootstrap-3.3.7/docs/assets/js/ie10-viewport-bug-workaround.js"></script>
    
</body>
</html>
