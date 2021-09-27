
<c:url var="Url" value="/registrarcita.html" />
<form:form action="${Url}" method="post" id="registroform">

<div class="modal fade" id="capt-cita" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				<h3 class="modal-title">Registrar nueva Cita</h3>
			</div>
			<div class="modal-body" style="height: 500px">
			
			<c:url var="UrlMostrar" value="/mostrarcita.html" />
			<input type="hidden" name="urldecita" value="${UrlMostrar}">

			<div class="row">
				<div class="col-sm-12">
					<h3><small>Seleccione la fecha y hora de la cita</small></h3>
				</div>
				<div class="col-sm-6">
				<div class="input-group date" id="datepicker_ini">
					<input name="nIniciodeCita" type='text' class="form-control" placeholder="Inicio de Cita" aria-describedby="nIniciodeCita_id" readonly>
		            <span class="input-group-addon add-on">
		                <span class="glyphicon glyphicon-calendar"></span>
		            </span>
	            </div>
	            </div>
	            <div class="col-sm-6">
	            <div class="input-group date" id="datepicker_fin">
					<input name="nFindeCita" type='text' class="form-control" placeholder="Fin de Cita" aria-describedby="nFindeCita_id" readonly>
		            <span class="input-group-addon add-on">
		                <span class="glyphicon glyphicon-calendar"></span>
		            </span>
	            </div>
	            </div>
	            <!-- ######################## -->
	            <div class="col-sm-12">
		            <div class="col-sm-6">
						<h3><small>Seleccionar Paciente</small></h3>
						<div class="input-group">
		                  <span class="input-group-addon" id="pNombre_id"><span class="glyphicon glyphicon-search" style="color: green;"></span></span>
		                  <select name="sUsuariosis_Contacto_Paciente" class="form-control">
		                  	<option selected="selected" value="">Seleccione</option>
							<c:forEach items="${aPacientes}" var="state">
								<option>${state.getsUsuarioSis()}</option>
							</c:forEach>
					      </select>
		                </div>
					</div>
					<div class="col-sm-6">
						<h3><small>Seleccionar Medico Tratante</small></h3>
						<div class="input-group">
		                  <span class="input-group-addon" id="pNombre_id"><span class="glyphicon glyphicon-search" style="color: green;"></span></span>
		                  <select name="sUsuariosis_Contacto_Doctor" class="form-control">
	                  		<option selected="selected" value="">Seleccione</option>
							<c:forEach items="${aDoctores}" var="state">
								<option>${state.getsUsuarioSis()}</option>
							</c:forEach>
					      </select>
		                </div>
					</div>
	            </div>
                <!-- ######################## -->
	            <div class="col-sm-12">
					<h3><small>Tipo de Cita</small></h3>
				</div>
				<div class="col-sm-12">
					<select name="sTipodeCita" class="form-control">
						<option value="event-info">Información</option>
                        <option value="event-success">Cumplido</option>
                        <option value="event-inverse">Reversado</option>
                        <option value="event-important">Importante</option>
                        <option value="event-warning">Advertencia</option>
                        <option value="event-special">Especial</option>
				    </select>
			    </div>
	            <div class="col-sm-12">
					<h3><small>Titulo</small></h3>
				</div>
				<div class=" col-sm-12">
					<div class="input-group">
	                  <span class="input-group-addon" id="pNombre_id"><span class="glyphicon glyphicon-pencil"></span></span>
	                  <input name="sTitulodeCita" id="sTitulodeCita" type="text" class="form-control" placeholder="Coloque su primer nombre" aria-describedby="sTitulodeCita_id">
	                </div>
                </div>
				<div class="col-sm-12">
					<h3><small>Descripcion</small></h3>
				</div>
				<div class="col-sm-12">
					<textarea class="form-control" rows="5" id="sMotivodeCita" name="sMotivodeCita" placeholder="Describa la razón de la Cita"></textarea>
                </div>
            </div>
            
			</div>
			<div class="modal-footer">
				<div align="right">
			    <p>
			        <a><button class="btn btn-sm btn-success " type="reset">Limpiar</button></a>
			        <input class="btn btn-sm btn-primary" type="submit" value="Aceptar" id="aceptarregistro"/>
			        <a><button type="button" id="cancel" name="cancel" class="btn btn-sm btn-danger" data-dismiss="modal">Cancelar</button></a>
			    </p>
			    </div>
			</div>
		</div>
	</div>
</div>

</form:form>