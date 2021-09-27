<%-- 
    Document   : Modificar Paciente
    Created on : 05/07/2017, 07:52:01 PM
    Author     : Intraron
--%>
<%@ include file="../nucleo/cabecera.jsp"%>
<body>
<div class="container">

      <!-- Navigation -->
	  <%@ include file="../nucleo/menu.jsp" %>
	  
	  <c:url var="Url" value="/modificarpaciente.html" />
      <form:form action="${Url}" method="post" id="registroform">
  	  
      <!-- Main component for a primary marketing message or call to action -->
      <div class="jumbotron">
	    <!-- Esta estructura son para las pestañas  -->
	    <ul class="nav nav-tabs">
	    <li class="active"><a data-toggle="tab" href="#home">Personal</a></li>
	    <li><a data-toggle="tab" href="#menu1">Localizaci&oacute;n</a></li>
	    <li><a data-toggle="tab" href="#menu2">Laboral</a></li>
	    <li><a data-toggle="tab" href="#menu3">Varios</a></li>
	    </ul>
	    <!-- Llamado de las pestañas definidas arriba  -->
	    <div class="tab-content">
	        <div id="home" class="tab-pane fade in active">
	          <h3>Datos personales del paciente</h3>
	          <p>
	            <table width="100%" border="0">
	                <tr>
	                  <td width="47,5%">
	                      <div class="input-group">
	                        <span class="input-group-addon" id="pNombre_id"><font color="red" size="4">*</font>&nbsp;Primer Nombre</span>
	                        <input name="sPrimerNombre" id="sPrimerNombre" value="${oContacto.getsPrimerNombre()}" type="text" class="form-control" placeholder="Coloque su primer nombre" aria-describedby="pNombre_id">
	                      </div>
	                  </td>
	                  <td width="5%">&nbsp;</td>
	                  <td width="47,5%">
	                      <div class="input-group">
	                        <span class="input-group-addon" id="sNombre_id">Segundo Nombre</span>
	                        <input name="sSegundoNombre" value="${oContacto.getsSegundoNombre()}" type="text" class="form-control" placeholder="Coloque su primer nombre" aria-describedby="sNombre_id">
	                      </div>
	                  </td>
	                </tr>
	                <tr>
	                  <td width="47,5%">
	                  </td>
	                  <td width="5%">&nbsp;</td>
	                  <td width="47,5%">
	                  </td>
	                </tr>
	                <tr>
	                  <td width="47,5%">
	                      <div class="input-group">
	                        <span class="input-group-addon" id="pApellido_id"><font color="red" size="4">*</font>&nbsp;Primer Apellido</span>
	                        <input name="sPrimerApellido" id="sPrimerApellido" value="${oContacto.getsPrimerApellido()}" type="text" class="form-control" placeholder="Coloque su primer apellido" aria-describedby="pApellido_id">
	                      </div>
	                  </td>
	                  <td width="5%">&nbsp;</td>
	                  <td width="47,5%">
	                      <div class="input-group">
	                        <span class="input-group-addon" id="sApellido_id">Segundo Apellido</span>
	                        <input name="sSegundoApellido" value="${oContacto.getsSegundoApellido()}" type="text" class="form-control" placeholder="Coloque su segundo apellido" aria-describedby="sApellido_id">
	                      </div>
	                  </td>
	                </tr>
	                <tr>
	                  <td width="47,5%">
	                  </td>
	                  <td width="5%">&nbsp;</td>
	                  <td width="47,5%">
	                  </td>
	                </tr>
	                <tr>
	                  <td width="47,5%">
		                  <div class="input-group">	
		                  	  <span class="input-group-addon" id="tipodoc_id">Tipo Documento</span>					  
							  <select name="sTipoDocumento" value="" class="form-control">
							  <c:choose>
    							<c:when test="${oContacto.getsTipoDocumento()=='Pasaporte'}">
    								<option selected="selected">Pasaporte</option>
    								<option>C&eacute;dula</option>
    							</c:when>
    							<c:otherwise>
							    	<option>Pasaporte</option>
    								<option selected="selected">C&eacute;dula</option>
							    </c:otherwise>
							  </c:choose>  
							  </select>
						  </div>
	                  </td>
	                  <td width="5%">&nbsp;</td>
	                  <td width="47,5%">
	                      <div class="input-group">
	                        <span class="input-group-addon" id="cedula_id"><font color="red" size="4">*</font>&nbsp;C&eacute;dula</span>
	                        <input name="sCedula" id="sCedula" type="text" value="${oContacto.getsCedula()}" class="form-control" placeholder="Coloque su Cedula" aria-describedby="cedula_id">
	                      </div>
	                  </td>
	                </tr>
	                <tr>
	                  <td width="47,5%">
	                  </td>
	                  <td width="5%">&nbsp;</td>
	                  <td width="47,5%">
	                  </td>
	                </tr>
	                <tr>
	                  <td width="47,5%">
	                      <div class="input-group">
	                        <span class="input-group-addon" id="rif_id">RIF</span>
	                        <input name="sRif" type="text" value="${oContacto.getsRif()}" class="form-control" placeholder="Coloque su RIF" aria-describedby="rif_id">
	                      </div>
	                  </td>
	                  <td width="5%">&nbsp;</td>
	                  <td width="47,5%">
	                      <div class="input-group">
	                        <span class="input-group-addon" id="edad_id">Edad</span>
	                        <input name="nEdad" type="text" value="${oContacto.getnEdad()}" class="form-control" placeholder="Coloque su edad" aria-describedby="edad_id">
	                      </div>
	                  </td>
	                </tr>
	                <tr>
	                  <td width="47,5%">
	                  </td>
	                  <td width="5%">&nbsp;</td>
	                  <td width="47,5%">
	                  </td>
	                </tr>
	                <tr>
	                  <td width="47,5%">
	                  <div class="input-group date">
	                  	<span class="input-group-addon" id="fnacimiento_id">Fecha Nacimiento</span>
	                    <input name="dtFechaNacimiento" id="datepicker" type="text" value="${oContacto.getdtFechaNacimiento()}" class="form-control" placeholder="Seleccione su fecha de nacimiento" aria-describedby="fnacimiento_id" readonly>
	                    <span class="input-group-addon add-on">
	                        <span class="glyphicon glyphicon-calendar"></span>
	                    </span>
	                  </div>
	                  </td>
	                  <td width="5%">&nbsp;</td>
	                  <td width="47,5%">
	                      <div class="input-group">
	                        <span class="input-group-addon" id="nacional_id">Nacionalidad</span>
	                        <input name="sNacionalidad" type="text" value="${oContacto.getsNacionalidad()}" class="form-control" placeholder="Seleccione su nacionalidad" aria-describedby="nacional_id">
	                      </div>
	                  </td>
	                </tr>
	                <tr>
	                  <td>&nbsp;</td>
	                  <td>&nbsp;</td>
	                  <td>&nbsp;</td>
	                </tr>
	                <tr>
	                  <td width="47,5%">
	                  	  <div class="input-group">	
		                  	  <span class="input-group-addon" id="sexo_id"><font color="red" size="4">*</font>&nbsp;Sexo</span>					  
							  <select name="sSexo" id="sSexo" class="form-control">
							  <c:choose>
    							<c:when test="${oContacto.getsSexo()=='Masculino'}">
								    <option value=""></option>
								    <option selected="selected">Masculino</option>
								    <option>Femenino</option>
							    </c:when>
							    <c:otherwise>
								    <option value=""></option>
								    <option>Masculino</option>
								    <option selected="selected">Femenino</option>
								    </c:otherwise>
							  </c:choose>
							  </select>
						  </div>
	                  </td>
	                  <td width="5%">&nbsp;</td>
	                  <td width="47,5%">
	                      <div class="input-group">	
		                  	  <span class="input-group-addon" id="estadocivil_id">Estado Civil</span>					  
							  <select name="sEstadoCivil" class="form-control">
							  <c:choose>
    							<c:when test="${oContacto.getsEstadoCivil()=='Soltero'}">
								    <option selected="selected">Soltero</option>
								    <option>Casado</option>
								    <option>Divorciado</option>
								    <option>Viudo</option>
							    </c:when>
							    <c:when test="${oContacto.getsEstadoCivil()=='Casado'}">
								    <option>Soltero</option>
								    <option selected="selected">Casado</option>
								    <option>Divorciado</option>
								    <option>Viudo</option>
							    </c:when>
							    <c:when test="${oContacto.getsEstadoCivil()=='Divorciado'}">
								    <option>Soltero</option>
								    <option>Casado</option>
								    <option selected="selected">Divorciado</option>
								    <option>Viudo</option>
							    </c:when>
							    <c:otherwise>
							    	<option>Soltero</option>
								    <option>Casado</option>
								    <option>Divorciado</option>
								    <option selected="selected">Viudo</option>
							    </c:otherwise>
							  </c:choose>
							  </select>
						  </div>
	                  </td>
	                </tr>
	                <tr>
	                  <td>&nbsp;</td>
	                  <td>&nbsp;</td>
	                  <td>&nbsp;</td>
	                </tr>
	                <tr>
	                  <td width="47,5%">
	                      <div class="input-group">
	                        <span class="input-group-addon" id="meditra_id">Medico Tratante</span>
	                        <input name="sMedicoTratante" type="text" value="${oContacto.getsMedicoTratante()}" class="form-control" placeholder="Coloque nombre de medico" aria-describedby="meditra_id">
	                      </div>
	                  </td>
	                  <td width="5%">&nbsp;</td>
	                  <td width="47,5%">&nbsp;</td>
	                </tr>
	            </table>
	          </p>
	        </div>
	        <div id="menu1" class="tab-pane fade">
	          <h3>Datos de localizaci&oacute;n</h3>
	          <p>
	              <table width="100%" border="0">
	                <tr>
	                  <td width="47,5%">
	                      <div class="input-group">
	                        <span class="input-group-addon" id="correo_id"><font color="red" size="4">*</font>&nbsp;Correo</span>
	                        <input name="sCorreo" id="sCorreo" type="text" value="${oContacto.getsCorreo()}" class="form-control" placeholder="Coloque su Correo Electronico" aria-describedby="correo_id">
	                      </div>
	                  </td>
	                  <td width="5%">&nbsp;</td>
	                  <td width="47,5%">
	                      <div class="input-group">
	                        <span class="input-group-addon" id="telefofi_id">Tel&eacute;f. Oficina</span>
	                        <input name="sTelefOficina" type="text" value="${oContacto.getsTelefOficina()}" class="form-control" placeholder="Coloque su Telefono" aria-describedby="telefofi_id">
	                      </div>
	                  </td>
	                </tr>
	                <tr>
	                  <td width="47,5%">
	                  </td>
	                  <td width="5%">&nbsp;</td>
	                  <td width="47,5%">
	                  </td>
	                </tr>
	                <tr>
	                  <td width="47,5%">
	                      <div class="input-group">
	                        <span class="input-group-addon" id="telefmovil_id"><font color="red" size="4">*</font>&nbsp;Tel&eacute;f. M&oacute;vil</span>
	                        <input name="sTelefMovil" id="sTelefMovil" type="text" value="${oContacto.getsTelefMovil()}" class="form-control" placeholder="Coloque su Telefono" aria-describedby="telefmovil_id">
	                      </div>
	                  </td>
	                  <td width="5%">&nbsp;</td>
	                  <td width="47,5%">
	                      <div class="input-group">
	                        <span class="input-group-addon" id="twitter_id">Twitter</span>
	                        <input name="sTwitter" type="text" value="${oContacto.getsTwitter()}" class="form-control" placeholder="Coloque su cuenta de twitter" aria-describedby="twitter_id">
	                      </div>
	                  </td>
	                </tr>
	                <tr>
	                  <td width="47,5%">
	                  </td>
	                  <td width="5%">&nbsp;</td>
	                  <td width="47,5%">
	                  </td>
	                </tr>
	                <tr>
	                  <td width="47,5%">
	                      <div class="input-group">
	                        <span class="input-group-addon" id="insta_id">Instagram</span>
	                        <input name="sInstagram" type="text" value="${oContacto.getsInstagram()}" class="form-control" placeholder="Coloque su cuenta de inistagram" aria-describedby="insta_id">
	                      </div>
	                  </td>
	                  <td width="5%">&nbsp;</td>
	                  <td width="47,5%">
	                      <div class="input-group">
	                        <span class="input-group-addon" id="pais_id"><font color="red" size="4">*</font>&nbsp;Pais</span>
	                        <input name="sPais" id="sPais" type="text" value="${oDireccion.getsPais()}" class="form-control" placeholder="Coloque su pais de origen" aria-describedby="pais_id">
	                      </div>
	                  </td>
	                </tr>
	                <tr>
	                  <td width="47,5%">
	                  </td>
	                  <td width="5%">&nbsp;</td>
	                  <td width="47,5%">
	                  </td>
	                </tr>
	                <tr>
	                  <td width="47,5%">
	                      <div class="input-group">
	                        <span class="input-group-addon" id="edo_id">Estado</span>
	                        <input name="sEstado" type="text" value="${oDireccion.getsEstado()}" class="form-control" placeholder="Coloque el estado" aria-describedby="edo_id">
	                      </div>
	                  </td>
	                  <td width="5%">&nbsp;</td>
	                  <td width="47,5%">
	                      <div class="input-group">
	                        <span class="input-group-addon" id="munic_id">Municipio</span>
	                        <input name="sMunicipio" type="text" value="${oDireccion.getsMunicipio()}" class="form-control" placeholder="Coloque el municipio" aria-describedby="munic_id">
	                      </div>
	                  </td>
	                </tr>
	                <tr>
	                  <td width="47,5%">
	                  </td>
	                  <td width="5%">&nbsp;</td>
	                  <td width="47,5%">
	                  </td>
	                </tr>
	                <tr>
	                  <td width="47,5%">
	                      <div class="input-group">
	                        <span class="input-group-addon" id="depar_id">Departamento</span>
	                        <input name="sDespartamento" type="text" value="${oDireccion.getsDespartamento()}" class="form-control" placeholder="Coloque el departamento" aria-describedby="depar_id">
	                      </div>
	                  </td>
	                  <td width="5%">&nbsp;</td>
	                  <td width="47,5%">
	                      <div class="input-group">
	                        <span class="input-group-addon" id="parro_id">Parroquia</span>
	                        <input name="sParroquia" type="text" value="${oDireccion.getsParroquia()}" class="form-control" placeholder="Coloque la parroquia" aria-describedby="parro_id">
	                      </div>
	                  </td>
	                </tr>
	                <tr>
	                  <td>&nbsp;</td>
	                  <td>&nbsp;</td>
	                  <td>&nbsp;</td>
	                </tr>
	                <tr>
	                  <td width="47,5%">
	                      <div class="input-group">
	                        <span class="input-group-addon" id="provin_id">Provincia</span>
	                        <input name="sProvincia" type="text" value="${oDireccion.getsProvincia()}" class="form-control" placeholder="Coloque la provincia" aria-describedby="provin_id">
	                      </div>
	                  </td>
	                  <td width="5%">&nbsp;</td>
	                  <td width="47,5%">
	                      <div class="input-group">
	                        <span class="input-group-addon" id="sector_id">Sector</span>
	                        <input name="sSector" type="text" value="${oDireccion.getsSector()}" class="form-control" placeholder="Coloque el sector" aria-describedby="sector_id">
	                      </div>
	                  </td>
	                </tr>
	                <tr>
	                  <td>&nbsp;</td>
	                  <td>&nbsp;</td>
	                  <td>&nbsp;</td>
	                </tr>
	                <tr>
	                  <td width="47,5%">
	                      <div class="input-group">
	                        <span class="input-group-addon" id="calleav_id">Calle/Av</span>
	                        <input name="sCalleoAv" type="text" value="${oDireccion.getsCalleoAv()}" class="form-control" placeholder="Coloque calle o av" aria-describedby="calleav_id">
	                      </div>
	                  </td>
	                  <td width="5%">&nbsp;</td>
	                  <td width="47,5%">
	                      <div class="input-group">
	                        <span class="input-group-addon" id="casaedif_id">Casa/Edif.</span>
	                        <input name="sCasaoEdif" type="text" value="${oDireccion.getsCasaoEdif()}" class="form-control" placeholder="Coloque casa o edif." aria-describedby="casaedif_id">
	                      </div>
	                  </td>
	                </tr>
	                <tr>
	                  <td>&nbsp;</td>
	                  <td>&nbsp;</td>
	                  <td>&nbsp;</td>
	                </tr>
	                <tr>
	                  <td width="47,5%">
	                      <div class="input-group">
	                        <span class="input-group-addon" id="piso_id">Piso</span>
	                        <input name="sPiso" type="text" value="${oDireccion.getsPiso()}" class="form-control" placeholder="Coloque el piso" aria-describedby="piso_id">
	                      </div>
	                  </td>
	                  <td width="5%">&nbsp;</td>
	                  <td width="47,5%">
	                      <div class="input-group">
	                        <span class="input-group-addon" id="ncasa_id">N. Casa</span>
	                        <input name="nNumerodeCasa" type="text" value="${oDireccion.getnNumerodeCasa()}" class="form-control" placeholder="Coloque n de Casa" aria-describedby="ncasa_id">
	                      </div>
	                  </td>
	                </tr>
	                <tr>
	                  <td>&nbsp;</td>
	                  <td>&nbsp;</td>
	                  <td>&nbsp;</td>
	                </tr>
	                <tr>
	                  <td width="47,5%">
	                    <div class="form-group">
		                  	<h3><span class="label label-default">Punto Referencia</span></h3>
							<textarea class="form-control" rows="5" id="sPuntodeReferencia" name="sPuntodeReferencia" placeholder="Indique un punto de referencia cercano">${oDireccion.getsPuntodeReferencia()}</textarea>
						</div>
	                  </td>
	                  <td width="5%">&nbsp;</td>
	                  <td width="47,5%">&nbsp;</td>
	                </tr>
	            </table>
	          </p>
	        </div>
	        <div id="menu2" class="tab-pane fade">
	          <h3>Datos del trabajo</h3>
	          <p>
	              <table width="100%" border="0">
	                <tr>
	                  <td width="47,5%">
	                      <div class="input-group">
	                        <span class="input-group-addon" id="cargo_id">Cargo</span>
	                        <input name="sCargo" type="text" value="${oContacto.getsCargo()}" class="form-control" placeholder="Coloque su cargo" aria-describedby="cargo_id">
	                      </div>
	                  </td>
	                  <td width="5%">&nbsp;</td>
	                  <td width="47,5%">
	                  	<div class="input-group">
	                  		<span class="input-group-addon" id="profes_id"><font color="red" size="4">*</font>&nbsp;Profesion</span>					  
							<select name="sProfesion" id="sProfesion" class="form-control">
							<option value=""></option>
							<c:forEach items="${aListaProfes}" var="state">
							<c:choose>
								<c:when test="${oContacto.getsProfesion()==state}">
							  		<option selected="selected">${state}</option>
							  	</c:when>
							  	<c:otherwise>
							  		<option>${state}</option>
							  	</c:otherwise>
							</c:choose>
							</c:forEach>
							</select>
						</div>
	                  </td>
	                </tr>
	                <tr>
	                  <td width="47,5%">
	                  </td>
	                  <td width="5%">&nbsp;</td>
	                  <td width="47,5%">
	                  </td>
	                </tr>
	                <tr>
	                  <td width="47,5%">
	                      <div class="input-group">
	                        <span class="input-group-addon" id="jefdirect_id">Jefe Directo</span>
	                        <input name="sJefeDirecto" type="text" value="${oContacto.getsJefeDirecto()}" class="form-control" placeholder="Coloque nombre de jefe" aria-describedby="jefdirect_id">
	                      </div>
	                  </td>
	                  <td width="5%">&nbsp;</td>
	                  <td width="47,5%">
	                      <div class="input-group">
	                        <span class="input-group-addon" id="usujefe_id">Usuario Jefe</span>
	                        <input name="sUsuarioSisJefe" type="text" value="${oContacto.getsUsuarioSisJefe()}" class="form-control" placeholder="Coloque usuario de jefe" aria-describedby="usujefe_id">
	                      </div>
	                  </td>
	                </tr>
	                <tr>
	                  <td width="47,5%">
	                  </td>
	                  <td width="5%">&nbsp;</td>
	                  <td width="47,5%">
	                  </td>
	                </tr>
	                <tr>
	                  <td width="47,5%">
	                      <div class="input-group">
	                        <span class="input-group-addon" id="cedulajefe_id">Cedula Jefe</span>
	                        <input name="sCedulaJefe" type="text" value="${oContacto.getsCedulaJefe()}" class="form-control" placeholder="Coloque cedula de jefe" aria-describedby="cedulajefe_id">
	                      </div>
	                  </td>
	                  <td width="5%">&nbsp;</td>
	                  <td width="47,5%">
	                      <div class="input-group">
	                        <span class="input-group-addon" id="nomempresa_id"><font color="red" size="4">*</font>&nbsp;Nombre Empresa</span>
	                        <input name="sNombredeEmpresa" id="sNombredeEmpresa" type="text" value="${oEmpresa.getsNombredeEmpresa()}" class="form-control" placeholder="Coloque nombre empresa" aria-describedby="nomempresa_id">
	                      </div>
	                  </td>
	                </tr>
	                <tr>
	                  <td width="47,5%">
	                  </td>
	                  <td width="5%">&nbsp;</td>
	                  <td width="47,5%">
	                  </td>
	                </tr>
	                <tr>
	                  <td width="47,5%">
	                      <div class="input-group">
	                        <span class="input-group-addon" id="telefempre_id"><font color="red" size="4">*</font>&nbsp;Tel&eacute;f. Empresa</span>
	                        <input name="sTelefonoOficina" id="sTelefonoOficina" type="text" value="${oEmpresa.getsTelefonoOficina()}" class="form-control" placeholder="Coloque telef. empresa" aria-describedby="telefempre_id">
	                      </div>
	                  </td>
	                  <td width="5%">&nbsp;</td>
	                  <td width="47,5%">
	                      <div class="input-group">
	                        <span class="input-group-addon" id="fax_id">Fax</span>
	                        <input name="sFaxOficina" type="text" value="${oEmpresa.getsFaxOficina()}" class="form-control" placeholder="Coloque fax de empresa" aria-describedby="fax_id">
	                      </div>
	                  </td>
	                </tr>
	                <tr>
	                  <td width="47,5%">
	                  </td>
	                  <td width="5%">&nbsp;</td>
	                  <td width="47,5%">
	                  </td>
	                </tr>
	                <tr>
	                  <td width="47,5%">
	                      <div class="input-group">
	                        <span class="input-group-addon" id="correoempre_id">Correo Empresa</span>
	                        <input name="sCorreoEmpresa" type="text" value="${oEmpresa.getsCorreoEmpresa()}" class="form-control" placeholder="Coloque correo empresa" aria-describedby="correoempre_id">
	                      </div>
	                  </td>
	                  <td width="5%">&nbsp;</td>
	                  <td width="47,5%">
	                      <div class="input-group">
	                        <span class="input-group-addon" id="pwebempre_id">P&aacute;gina Web Empresa</span>
	                        <input name="sPaginaWeb" type="text" value="${oEmpresa.getsPaginaWeb()}" class="form-control" placeholder="Coloque pag. web empresa" aria-describedby="pwebempre_id">
	                      </div>
	                  </td>
	                </tr>
	            </table>
	          </p>
	        </div>
	        <div id="menu3" class="tab-pane fade">
	          <h3>Datos varios</h3>
	          <p>
	              <table width="100%" border="0">
	                <tr>
	                  <td width="47,5%">
	                      <div class="input-group">
	                        <span class="input-group-addon" id="usuariosis_id">Usuario de Sistema</span>
	                        <input name="sUsuarioSis" id="sUsuarioSis" type="text" value="${oContacto.getsUsuarioSis()}" class="form-control" placeholder="Proponga un ususario de Sistema" aria-describedby="usuariosis_id" readonly>
	                      </div>
	                      <div id="resultado"></div>
	                  </td>
	                  <td width="5%">&nbsp;</td>
	                  <td width="47,5%">
	                  	<div class="form-group">
	                  	  <h3><span class="label label-default">Comentarios</span></h3>
						  <textarea class="form-control" rows="5" id="sComentario" name="sComentario" placeholder="Coloque cualquier otro comentario relevante">${oContacto.getsComentario()}</textarea>
						</div>
	                  </td>
	                </tr>
	            </table>
	          </p>
	        </div>
	    </div> <!-- Cierre de pestañas dinamicas -->
	    <div align="right">
	    <p>
	    	<input name="nId" value="${oContacto.getnId()}" type="hidden">
	    	<input name="nId_Empresa" value="${oContacto.getnId_Empresa()}" type="hidden">
	    	<input name="nId_Direccion" value="${oContacto.getnId_Direccion()}" type="hidden">
	        <a><button class="btn btn-lg btn-success " type="reset">Limpiar</button></a>
	        <input class="btn btn-lg btn-primary" type="submit" value="Aceptar" id="aceptarregistro"/>
	        <!-- a><button class="btn btn-lg btn-primary " type="submit" id="aceptarregistro">Aceptar</button></a> -->
	        <a href="irgestionarPaciente.html" id="cancel" name="cancel" class="btn btn-danger btn-lg">Cancelar</a>
	    </p>
	    </div>
        
      </div><!-- fin de jumbotron -->
      </form:form>
</div> <!-- container -->
	<!-- Mensajes del sistema -->
	<div id="validModal" title="Alerta de Sistema" style="display: none;">
	  Todavía hay campos obligatorios, por favor revisar todas las pestañas del formulario.
	</div>
	<div id="sendFromModal" title="Confirmaci&oacute;n requerida" style="display: none;">
	  ¿Desea guardar el registro del Paciente?
	</div>
	<div id="uniqueUserModal" title="Alerta de Sistema" style="display: none;">
	  Modifique el Usuario de Sistema ingresado, No está disponible.
	</div>
	<!-- Fin de mensajes del sistema -->
   	<script type="text/javascript">
	$(document).ready(function(){
		$('#datepicker').datepicker({
			dateFormat: 'dd/mm/yy'
  		});
	});
    </script>
    <script type="text/javascript">
	$(document).ready(function(){	
		$("#aceptarregistro").click(function(e) {
			
			e.preventDefault();
			if ($("#sPrimerNombre").val().trim() === '' || $("#sPrimerApellido").val().trim() === '' || $("#sNombredeEmpresa").val().trim() === '' || 
				$("#sCedula").val().trim() === '' || $("#sTelefMovil").val().trim() === '' || $("#sTelefonoOficina").val().trim() === '' || 
				$("#sCorreo").val().trim() === '' || $("#sSexo").val().trim() === '' || $("#sPais").val().trim() === '' || 
				$("#sProfesion").val().trim() === '') {
				
				$("#registroform").valid();
								
				$("#validModal").dialog({
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
				
			}else{
				$("#sendFromModal").dialog({
					buttons : {
						"Ok" : function() {
								$("#registroform").submit();	
								$(this).dialog("close");
						},
						"Cancelar" : function() {
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
	});	
    </script>

<!-- Base de la pagina (pie) -->
<%@ include file="../nucleo/pie.jsp"%>
    
</body>
</html>