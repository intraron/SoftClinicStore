<%-- 
    Document   : registrarCita
    Created on : 08/07/2017, 07:52:01 PM
    Author     : Intraron
--%>
<%@ include file="../nucleo/cabecera.jsp"%>
<link rel="stylesheet" href="resources/bootstrap-calendar/css/calendar.css">

<body>
<div class="container">

      <!-- Navigation -->
	  <%@ include file="../nucleo/menu.jsp" %>

      <!-- Main component for a primary marketing message or call to action -->
      <!-- div class="jumbotron"> -->       
      <div class="page-header">
      	<div class="pull-right form-inline">
			<div class="btn-group">
				<button class="btn btn-primary" data-calendar-nav="prev"><< Prev</button>
				<button class="btn btn-default" data-calendar-nav="today">Today</button>
				<button class="btn btn-primary" data-calendar-nav="next">Next >></button>
			</div>
			<div class="btn-group">
				<button class="btn btn-warning" data-calendar-view="year">A&ntilde;o</button>
				<button class="btn btn-warning active" data-calendar-view="month">Mes</button>
				<button class="btn btn-warning" data-calendar-view="week">Semana</button>
				<button class="btn btn-warning" data-calendar-view="day">D&iacute;a</button>
			</div>
		</div>
		<h3></h3>
	  </div>
      
      <div class="row">
		<div class="col-md-9">
			<div id="calendar"></div>
		</div>
		<div class="col-md-3">
			<h4>Lista de citas</h4>
			<small>Esta lista es referenecial se carga dinamicamente</small>
			<ul id="eventlist" class="nav nav-list"></ul>
		</div>
		<div class="col-md-12">
			<div>
				<h3>&nbsp;</h3>
			</div>
		</div>
		
	  </div>
	  	 
	  <!-- Modales -->
	  <%@ include file="../cita/modal/capturarCita.jsp"%>
	  <%@ include file="../cita/modal/mostrarCita.jsp"%>     
	  <!-- Fin Modales -->	  
 	  <!-- Mensajes -->
 	  <div id="registroexitoso" title="Información de Sistema" style="display: none;">
 	  	${mensajeSistema}
	  </div>
	  <input type="hidden" id="conmesaj" value="${mensajeSistema}">
	  <!-- Fin de los mensajes -->
	  
      <!-- /div> <!-- /fin de jumbotron -->
</div> <!-- /container -->
<!-- Base de la pagina (pie) -->
<%@ include file="../nucleo/pie.jsp"%>

</body>
<script>
$(document).ready(function(){
	$('#datepicker_ini').datetimepicker({
		autoclose: 1,
		todayHighlight: 1,
		format: 'dd/mm/yyyy hh:ii:ss',
		startDate: new Date()
		});
});

$(document).ready(function(){
	$('#datepicker_fin').datetimepicker({
		autoclose: 1,
		todayHighlight: 1,
		format: 'dd/mm/yyyy hh:ii:ss',
		startDate: new Date()
		});
});

$(document).ready(function() {	
	$("#calendar").click(function(){
	$("#capt-cita").modal('show');
	});
});

$(document).ready(function(){
	
	if($("#conmesaj").val().trim() !== ''){
		$("#registroexitoso").dialog({
			buttons : {
				"Ok" : function() {
					$(this).dialog("close");
				}
			},
			modal: true,
			draggable: false,
			resizable: false,
			show: "fold"
		});
	}
});

</script>

	<script type="text/javascript" src="resources/bootstrap-calendar/components/underscore/underscore-min.js"></script>
	<script type="text/javascript" src="resources/bootstrap-calendar/components/jstimezonedetect/jstz.min.js"></script>
	<script type="text/javascript" src="resources/bootstrap-calendar/js/language/es-ES.js"></script>
	<script type="text/javascript" src="resources/bootstrap-calendar/js/calendar.js"></script>
	<script type="text/javascript" src="resources/bootstrap-calendar/js/app.js"></script>
	
<style type="text/css">
#datepicker
{
    z-index: 9999999;
}
</style>
</html>