<%-- 
    Document   : cabecera
    Created on : 29/06/2017, 10:19:33 AM
    Author     : Intraron
--%>
<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.intraron.softclinicstore.dato.*" %>
<%@page import="com.intraron.softclinicstore.entidad.*" %>
<%@page import="com.intraron.softclinicstore.control.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<% request.setCharacterEncoding("UTF-8"); // Esta linea soluciona el problema del UTF-8 %>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1">
 
    <link href="resources/bootstrap-3.3.7/docs/assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet" type="text/css">
    <link href="resources/bootstrap-3.3.7/dist/css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link href="resources/bootstrap-3.3.7/docs/examples/navbar/navbar.css" rel="stylesheet" type="text/css">
    <link href="resources/bootstrap-3.3.7/dist/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css">
    
	<link href="resources/bootstrap-datetimepicker/css/bootstrap-datetimepicker.css" rel="stylesheet">
	<link href="resources/jquery-ui-1.12.1.custom/jquery-ui.min.css"  rel="stylesheet">
	<link href="resources/jquery-ui-1.12.1.custom/jquery-ui.structure.min.css"  rel="stylesheet">
	<link href="resources/jquery-ui-1.12.1.custom/jquery-ui.theme.min.css"  rel="stylesheet">
	<link href="resources/DataTables-1.10.15/media/css/jquery.dataTables.min.css" rel="stylesheet">
	<link href="resources/DataTables-1.10.15/media/css/dataTables.jqueryui.min.css" rel="stylesheet">
	 
    <!-- script src="resources/bootstrap-datepicker/tests/assets/jquery-1.7.1.min.js"></script-->
    <script>window.jQuery || document.write('<script src="resources/bootstrap-3.3.7/docs/assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="resources/bootstrap-3.3.7/dist/js/bootstrap.min.js"></script>
	<script src="resources/bootstrap-datetimepicker/js/bootstrap-datetimepicker.min.js"></script>
	<script src="resources/bootstrap-datetimepicker/js/locales/bootstrap-datetimepicker.es.js"></script>
	<script src="resources/jquery-ui-1.12.1.custom/jquery-ui.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="resources/bootstrap-3.3.7/docs/assets/js/ie10-viewport-bug-workaround.js"></script>
	<script src="resources/js/jquery.validate.js"></script>
	<script src="resources/js/jquery.alphanum.js"></script>
	<script src="resources/DataTables-1.10.15/media/js/jquery.dataTables.min.js"></script>
	<script src="resources/DataTables-1.10.15/media/js/dataTables.jqueryui.min.js"></script>
		
	<!-- Script en jQuery para validacion -->
	<script src="resources/js/validacion.js"></script>
    <title>${accionPagina}|${tituloPagina}</title>
</head>