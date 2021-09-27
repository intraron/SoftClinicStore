<%-- 
    Document   : registrarPresupuesto
    Created on : 27/08/2017, 10:19:33 AM
    Author     : Intraron
--%>
<%@ include file="../nucleo/cabecera.jsp"%>    
</head>
<body>            
   
<div class="container">
    <!-- Navigation -->
	<%@ include file="../nucleo/menu.jsp" %>
    <c:url var="Url" value="/registrarpresupuesto.html" />
    <form:form action="${Url}" method="post" id="registroform">
	    <!-- Todo el Conteido de Registrar -->
	    <div class="jumbotron" id="paraimprimir">
<!-- Datos de la factura, logo, numero de factura, fecha de factura, monto total de la factura -->
    	<table border="1" style="width:100%">
		<tr>
		    <td width="40%">
		    	<div class="input-group-sm">
	                <h5 style="text-align: left;">Presupuesto # ${numpresu}</h5>
              	</div>
              	<div class="input-group-sm">
	                <h5 style="text-align: left;">${horasistema}</h5>
              	</div>
              	<div class="input-group-sm" id="er">
              	</div>
		    </td>
		    <td width="20%">&nbsp;</td>
		    <td width="40%">
		    	<div class="input-group-sm" align="right">
		    		<c:url var="img" value="resources/imagenes/BaseLogo.jpg" />
	                <img src="${img}" width="200" height="58" >
              	</div>
              	<div class="input-group-sm">
	                <h5 style="text-align: right;">Teléfono: ${telefono}</h5>
              	</div>
              	<div class="input-group-sm">
	                <h5 style="text-align: right;">Correo: ${correo}</h5>
              	</div>
		    </td>
		</tr>
		<tr><td width="100%" colspan="3"><hr style="color: #0056b2;" /></td></tr>
<!-- Datos del paciente o cliente a facturar, los mismo pueden ser modificados. Se debe poder escoger el usuarios del paciente a facturar. -->
		<tr>
		    <td width="40%">
		    	<div class="input-group-sm nover">
	                <h3><small>Seleccionar Paciente</small></h3>
					<div class="input-group">
					<span class="input-group-addon" id="pNombre_id"><span class="glyphicon glyphicon-search" style="color: blue;"></span></span>
	                  <select id="paciente" name="sFkPaciente_Usuariosis" class="form-control input-sm">
	                  	<option selected="selected" value="">Seleccione</option>
						<c:forEach items="${aPacientes}" var="state">
							<option>${state.getsUsuarioSis()}</option>
						</c:forEach>
				      </select>
	                </div>
              	</div>
              	<div class="input-group-sm">
	                <input id="nombrepct" name="sSegundoNombre" type="text" class="form-control input-sm" placeholder="..." style="border-width:0; font-weight: bold;">
              	</div>
              	<div class="input-group-sm">
	                <input id="direccionpct" name="sSegundoNombre" type="text" class="form-control input-sm" placeholder="..." style="border-width:0; font-weight: bold;">
              	</div>
              	<div class="input-group-sm">
	                <input id="telefonopct" name="sSegundoNombre" type="text" class="form-control input-sm" placeholder="..." style="border-width:0; font-weight: bold;">
              	</div>
		    </td>
		    <td width="20%">&nbsp;</td>
		    <td width="40%">
		    	<div class="input-group-sm nover">
	                <h3><small>Seleccionar Medico Tratante</small></h3>
					<div class="input-group">
	                  <span class="input-group-addon" id="pNombre_id"><span class="glyphicon glyphicon-search" style="color: blue;"></span></span>
	                  <select id="doctor" name="sFkDoctor_Usuariosis" class="form-control input-sm">
                  		<option selected="selected" value="">Seleccione</option>
						<c:forEach items="${aDoctores}" var="state">
							<option>${state.getsUsuarioSis()}</option>
						</c:forEach>
				      </select>
	                </div>
              	</div>
              	<div class="input-group-sm">
	                <input id="nombredoc" name="sSegundoNombre" type="text" placeholder="..." class="form-control input-sm" style="border-width:0; text-align: right; font-weight: bold;">
              	</div>
              	<div class="input-group-sm">
	                <input id="direcciondoc" name="sSegundoNombre" type="text" placeholder="..." class="form-control input-sm" style="border-width:0; text-align: right; font-weight: bold;">
              	</div>
              	<div class="input-group-sm">
	                <input id="telefonodoc" name="sSegundoNombre" type="text" placeholder="..." class="form-control input-sm" style="border-width:0; text-align: right; font-weight: bold;">
              	</div>
		    </td>
		</tr>
		<tr><td width="100%" colspan="3"><hr style="color: #0056b2;" /></td></tr>
<!-- Articulos, montos, cantidades, etc a facturar. AQUI VAN LOS BOTONES PARA AGREGAR, QUITAR, GUARDAR O CANCELAR LA FACTURA-->
		<tr>
			<td width="100%" colspan="3">
		    <table id="tabla" style="width:100%">
		    	<!-- Cabecera de la tabla -->
				<thead>
					<tr>
						<th width="7%">&nbsp;</th>
						<th width="15,5%">Art&iacute;culo</th>
						<th width="15,5%">Descripción</th>
						<th width="15,5%">Cantidad</th>
						<th width="15,5%">Precio</th>
						<th width="15,5%">Total</th>
					</tr>
				</thead>
				<!-- Cuerpo de la tabla con los campos -->
				<tbody>
					<!-- fila base para clonar y agregar al final -->
					<tr class="fila-base" id="fila0">
						<td class="eliminar" width="7%" align="center">
						<div class="input-group">
							<button type="button" class="btn btn-sm btn-default nover" data-toggle="tooltip" title="Eliminar">
						      <span class="glyphicon glyphicon-remove" style="Color:red"></span>
						    </button>
						</div>
						</td>
						<td width="15,5%">
						<div class="input-group">
	                        <input name="numarti0" id="numarti0" type="text" class="input-sm" placeholder="Número de artículo" >
                      	</div>
                      	</td>
						<td width="15,5%">
						<div class="input-group">
							<textarea class="input-sm" rows="2" name="descrip0" id="descrip0" placeholder="Descripción"></textarea>
                      	</div>
                      	</td>
						<td width="15,5%">
						<div class="input-group on">
							<select id="cant0" name="cant0" class="input-sm" style="width:150px">
								<option selected="selected" value="0">Seleccione</option>
								<c:forEach var = "i" begin = "1" end = "50">
									<option value = "${i}">${i}</option>
								</c:forEach>
							</select>
                      	</div>
						</td>
						<td width="15,5%">
						<div class="input-group on">
							<span class="input-group-addon add-on">
				                <span class="glyphicon glyphicon-usd"></span>
				            </span>
	                        <input name="preci0" id="preci0" type="text" class="input-sm" placeholder="0.00" >
                      	</div>
						</td>
						<td width="15,5%">
						<div class="input-group on">
							<span class="input-group-addon add-on">
				                <span class="glyphicon glyphicon-usd"></span>
				            </span>
	                        <input name="total0" id="total0" type="text" class="input-sm" placeholder="0.00" readonly="readonly">
                      	</div>
						</td>
					</tr>
					<!-- fin de código: fila base -->
					<!-- Fila de ejemplo -->
					<tr id="fila1">
						<td class="eliminar" width="7%" align="center">
						<div class="input-group">
							<button type="button" class="btn btn-sm btn-default nover" data-toggle="tooltip" title="Eliminar">
						      <span class="glyphicon glyphicon-remove" style="Color:red"></span>
						    </button>
						</div>
						</td>
						<td width="15,5%">
						<div class="input-group">
	                        <input name="numarti1" id="numarti1" type="text" class="input-sm" placeholder="Número de artículo" >
                      	</div>
                      	</td>
						<td width="15,5%">
						<div class="input-group">
							<textarea class="input-sm" rows="2" name="descrip1" id="descrip1" placeholder="Descripción"></textarea>
	                        <!-- input name="#" id="descrip1" type="text" class="input-sm" placeholder="Descripción" > -->
                      	</div>
                      	</td>
						<td width="15,5%">
						<div class="input-group on">
							<select id="cant1" name="cant1" class="input-sm" style="width:150px">
								<option selected="selected" value="0">Seleccione</option>
								<c:forEach var = "i" begin = "1" end = "50">
									<option value = "${i}">${i}</option>
								</c:forEach>
							</select>
                      	</div>
						</td>
						<td width="15,5%">
						<div class="input-group on">
							<span class="input-group-addon add-on">
				                <span class="glyphicon glyphicon-usd"></span>
				            </span>
	                        <input name="preci1" id="preci1" type="text" class="input-sm" placeholder="0.00" >
                      	</div>
						</td>
						<td width="15,5%">
						<div class="input-group on">
							<span class="input-group-addon add-on">
				                <span class="glyphicon glyphicon-usd"></span>
				            </span>
	                        <input name="total1" id="total1" type="text" class="input-sm" placeholder="0.00" readonly="readonly">
                      	</div>
						</td>
					</tr>
					<!-- fin de código: fila de ejemplo -->
				</tbody>
		    </table>
			</td>
		</tr>
		<tr>
		    <td width="100%" colspan="3">
		    	<hr style="color: #0056b2;" />
                <div class="col-sm-8" align="left">
		    		<button type="button" class="btn btn-success btn-sm nover" onclick="agregar()">
                      <span class="glyphicon glyphicon-plus"></span> Agregar Artículo
                    </button>
                </div>
                            
		    </td>
		</tr>
<!-- Subtotal y totales mas impuestos  -->
		<tr><td width="100%" colspan="3"><hr style="color: #0056b2;" /></td></tr>
		<tr>
			<td width="40%">&nbsp;</td>
		    <td width="20%">&nbsp;</td>
	    	<td width="40%">
    		<table>
    		<tr>
    			<td>
	            	<div class="input-group-sm col-sm-12">
	                	<h4 style="text-align: right;">Sub Total:&nbsp;</h4>
		            </div>
	            </td>
	            <td>
	            	<div class="col-sm-6">
	                	<input name="nSubtotal" type="text" class="input-sm" id="psubtotal" style="border-width:0; text-align:right;" readonly="readonly">
	                </div>
	            </td>
            </tr>
            <tr>
            	<td>
            		<div class="input-group" id="tax_id">
            			<span class="input-group-addon add-on">
	                  		<span class="glyphicon glyphicon-pushpin"></span>
	                	</span>
	                	<input name="nImpuesto" type='text' class="input-sm" placeholder="% Impuesto" id="tax" value="12" style="text-align:right;">
	              	</div>
				</td>
	            <td>
	            	<div class="col-sm-6">
	              		<input name="#" type="text" class="input-sm" id="pimpuesto" style="border-width:0; text-align:right;" readonly="readonly">
	              	</div>
	            </td>
			</tr>
			<tr>
				<td>
	            	<div class="input-group-sm col-sm-12">
	                	<h4 style="text-align: right;">Total:&nbsp;</h4>
		            </div>
	            </td>
	            <td>
	            	<div class="col-sm-6">
	                	<input name="nTotal" type="text" class="input-sm" id="ptotal" style="border-width:0; text-align:right;" readonly="readonly">
	                </div>
	            </td>
	        </tr>
	      	</table>		    	
            </td>
		</tr>
		<tr>
			<td width="100%" colspan="3"><hr style="color: #0056b2;" />
				<div class="col-sm-4" align="right">
                	<input type="text" id="count" name="count" value="2" style=" display: none;"></input>
					<input type="text" id="sendcount" name="sendcount" value="2" style=" display: none;"></input>
		    		<input class="btn btn-primary btn-sm nover" type="submit" id="enviar" value="Enviar" />
		    		
		    		<button type="button" class="btn btn-danger btn-sm nover">
                      <span class="glyphicon glyphicon-chevron-left"></span> Cancelar
                    </button>
                </div>
			</td>
		</tr>
		</table>
		<input type="button" name="imprimir" value="Imprimir" id="btn" class="nover" >
	    </div> <!-- Cierre de Jumbotron -->
    </form:form>
    <!-- Base de la pagina (pie) -->
<%@ include file="../nucleo/pie.jsp"%>
</div> <!-- /container -->
</body>
</html>
<script type="text/javascript" src="resources/js/fila_dinamica.js"></script>
<script type="text/javascript" src="resources/js/buscar_contacto.js"></script>

<style>
.fila-base{ display: none; } /* fila base oculta */
.jumbotron{ background-color: white; }
</style>
<style type="text/css" media="print">
.nover {display:none}
</style>