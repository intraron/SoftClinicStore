<%-- 
    Document   : gestionarPaciente
    Created on : 02/07/2017, 0100
    Author     : Intraron
--%>
<%@ include file="../nucleo/cabecera.jsp"%>
<body>

<div class="container">

      <!-- Navigation -->
	  <%@ include file="../nucleo/menu.jsp" %>

      <!-- Main component for a primary marketing message or call to action -->
      <div class="jumbotron">
      	<div><h3 class="text-center">Gestión de Pacientes</h3></div>
 
      	<br>
      	<table class="table table-bordered" id="ListaPacientes" cellspacing="0" width="100%">
			<thead>
				<tr>
					<td><h3 class="text-center"><small>Nro de Paciente</small></h3></td>
					<td><h3 class="text-center"><small>C&eacute;dula</small></h3></td>
					<td><h3 class="text-center"><small>Nombre</small></h3></td>
					<td><h3 class="text-center"><small>Apellido</small></h3></td>
					<td><h3 class="text-center"><small>T&eacute;lef. M&oacute;vil</small></h3></td>
					<td><h3 class="text-center"><small>Sexo</small></h3></td>
					<td><h3 class="text-center"><small>Correo</small></h3></td>
					<td><h3 class="text-center"><small>Usuario de Sistema</small></h3></td>
					<td><h3 class="text-center"><small>Acci&oacute;n</small></h3></td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${listacontactos}" var="lisCont">
					<tr>
						<td>${lisCont.getnId()}</td>
						<td>${lisCont.getsCedula()}</td>
						<td>${lisCont.getsPrimerNombre()}</td>
						<td>${lisCont.getsPrimerApellido()}</td>
						<td>${lisCont.getsTelefMovil()}</td>
						<td>${lisCont.getsSexo()}</td>
						<td>${lisCont.getsCorreo()}</td>
						<td>${lisCont.getsUsuarioSis()}</td>
						<td><div align="center">
							<a href="modificarPaciente.html?id=${lisCont.getnId()}" data-toggle="tooltip" title="Editar Paciente" class="btn btn-primary">
						      <span class="glyphicon glyphicon-pencil" style="color: yellow"></span> 
						    </a>
						</div></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
      </div><!-- Fin de jumbotron -->
 <%//@ include file="../paciente/modificarPacienteModal.jsp"%>  <!-- no estoy usando este modal por ahora 08-07-17 -->
</div> <!-- /container -->
<input id="idmensj" value="${accion}" type="text">
<div id="bien" title="Aviso de Sistema" style="display: none;">
  ${mensajeSistema}
</div>	
<!-- Base de la pagina (pie) -->
<%@ include file="../nucleo/pie.jsp"%>
    
<script>
	
	if($("#idmensj").val()==="true"){
		$("#bien").dialog({
			buttons : {
				"Ok" : function() {
					$(this).dialog("close");
					$("#idmensj").val("false");
				}
			},
			modal: true,
			draggable: false,
			resizable: false,
			show: "fold"
		});
	}

	$(document).ready(function() {	
		$('#ListaPacientes').DataTable({
			"oLanguage": { 
				"oPaginate": { 
				"sPrevious": "Anterior", 
				"sNext": "Siguiente", 
				"sLast": "Ultima", 
				"sFirst": "Primera" 
				}, 
	
				"sLengthMenu": 'Mostrar <select>'+ 
				'<option value="10">10</option>'+ 
				'<option value="20">20</option>'+ 
				'<option value="30">30</option>'+ 
				'<option value="40">40</option>'+ 
				'<option value="50">50</option>'+ 
				'<option value="-1">Todos</option>'+ 
				'</select> registros', 
	
				"sInfo": "Mostrando del _START_ a _END_ (Total: _TOTAL_ resultados)", 
	
				"sInfoFiltered": " - filtrados de _MAX_ registros", 
	
				"sInfoEmpty": "No hay resultados de búsqueda", 
	
				"sZeroRecords": "No hay registros a mostrar", 
	
				"sProcessing": "Espere, por favor...", 
	
				"sSearch": "Buscar:", 
	
				} 
		});
	});
	
	$(document).on('click', "a[id^=mostrar]",function (e) {
		event.preventDefault();
        //
        var currentRow=$(this).closest("tr"); 
        var f1=currentRow.find("td:eq(0)").text();
        var f2=currentRow.find("td:eq(1)").text();
        var f3=currentRow.find("td:eq(2)").text();
  		
		 $("#myModal").modal('show');
		 
		 $("#nombre").val(f3);
	});
</script>

</body>
<style type="text/css">
    #datepicker
    {
        z-index: 9999999;
    }
      
    #validModal
    {
        z-index: 1999999 !important;
    }
    
    #sendFromModal
    {
        z-index: 2999999 !important;
    }
    
    #uniqueUserModal
    {
        z-index: 3999999 !important;
    }
</style>
</html>