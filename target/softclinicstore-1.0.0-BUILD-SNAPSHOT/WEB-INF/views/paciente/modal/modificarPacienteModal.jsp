<%-- 
    Document   : Modificar Paciente Modal
    Created on : 02/07/2017, 19:06:01 PM
    Author     : Intraron
--%>

  <!-- Modal -->
  <div id="myModal" class="modal fade" role="dialog">
  <div class="modal-dialog">
	  <!-- Modal content-->
	  <div class="modal-content">
		  <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal">&times;</button>
	        <h4 class="modal-title">Edici&oacute;n de Datos del Paciente</h4>
	      </div>
	  	  <div class="modal-body">
	  	  		<c:url var="Url" value="/registrarpacientes.html" />
   				<form:form action="${Url}" method="post" id="registroform">
   				
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
			                        <input name="sPrimerNombre" id="sPrimerNombre" type="text" class="form-control" placeholder="Coloque su primer nombre" aria-describedby="pNombre_id">
			                      </div>
			                  </td>
			                  <td width="5%">&nbsp;</td>
			                  <td width="47,5%">
			                      <div class="input-group">
			                        <span class="input-group-addon" id="sNombre_id">Segundo Nombre</span>
			                        <input name="sSegundoNombre" type="text" class="form-control" placeholder="Coloque su primer nombre" aria-describedby="sNombre_id">
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
			                        <input name="sPrimerApellido" id="sPrimerApellido" type="text" class="form-control" placeholder="Coloque su primer apellido" aria-describedby="pApellido_id">
			                      </div>
			                  </td>
			                  <td width="5%">&nbsp;</td>
			                  <td width="47,5%">
			                      <div class="input-group">
			                        <span class="input-group-addon" id="sApellido_id">Segundo Apellido</span>
			                        <input name="sSegundoApellido" type="text" class="form-control" placeholder="Coloque su segundo apellido" aria-describedby="sApellido_id">
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
									  <select name="sTipoDocumento" class="form-control">
									    <option selected="selected">C&eacute;dula</option>
									    <option>Pasaporte</option>
									  </select>
								  </div>
			                  </td>
			                  <td width="5%">&nbsp;</td>
			                  <td width="47,5%">
			                      <div class="input-group">
			                        <span class="input-group-addon" id="cedula_id"><font color="red" size="4">*</font>&nbsp;C&eacute;dula</span>
			                        <input name="sCedula" id="sCedula" type="text" class="form-control" placeholder="Coloque su Cedula" aria-describedby="cedula_id">
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
			                        <input name="sRif" type="text" class="form-control" placeholder="Coloque su RIF" aria-describedby="rif_id">
			                      </div>
			                  </td>
			                  <td width="5%">&nbsp;</td>
			                  <td width="47,5%">
			                      <div class="input-group">
			                        <span class="input-group-addon" id="edad_id">Edad</span>
			                        <input name="nEdad" type="text" class="form-control" placeholder="Coloque su edad" aria-describedby="edad_id">
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
			                    <input name="dtFechaNacimiento" id="datepicker" type="text" class="datepicker form-control" placeholder="Seleccione su fecha de nacimiento" aria-describedby="fnacimiento_id" readonly>
			                    <span class="input-group-addon add-on">
			                        <span class="glyphicon glyphicon-calendar"></span>
			                    </span>
			                  </div>
			                  </td>
			                  <td width="5%">&nbsp;</td>
			                  <td width="47,5%">
			                      <div class="input-group">
			                        <span class="input-group-addon" id="nacional_id">Nacionalidad</span>
			                        <input name="sNacionalidad" type="text" class="form-control" placeholder="Seleccione su nacionalidad" aria-describedby="nacional_id">
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
									    <option selected="selected" value=""></option>
									    <option>Masculino</option>
									    <option>Femenino</option>
									  </select>
								  </div>
			                  </td>
			                  <td width="5%">&nbsp;</td>
			                  <td width="47,5%">
			                      <div class="input-group">	
				                  	  <span class="input-group-addon" id="estadocivil_id">Estado Civil</span>					  
									  <select name="sEstadoCivil" class="form-control">
									    <option selected="selected">Soltero</option>
									    <option>Casado</option>
									    <option>Divorciado</option>
									    <option>Viudo</option>
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
			                        <input name="sMedicoTratante" type="text" class="form-control" placeholder="Coloque nombre de medico" aria-describedby="meditra_id">
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
			                        <input name="sCorreo" id="sCorreo" type="text" class="form-control" placeholder="Coloque su Correo Electronico" aria-describedby="correo_id">
			                      </div>
			                  </td>
			                  <td width="5%">&nbsp;</td>
			                  <td width="47,5%">
			                      <div class="input-group">
			                        <span class="input-group-addon" id="telefofi_id">Tel&eacute;f. Oficina</span>
			                        <input name="sTelefOficina" type="text" class="form-control" placeholder="Coloque su Telefono" aria-describedby="telefofi_id">
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
			                        <input name="sTelefMovil" id="sTelefMovil" type="text" class="form-control" placeholder="Coloque su Telefono" aria-describedby="telefmovil_id">
			                      </div>
			                  </td>
			                  <td width="5%">&nbsp;</td>
			                  <td width="47,5%">
			                      <div class="input-group">
			                        <span class="input-group-addon" id="twitter_id">Twitter</span>
			                        <input name="sTwitter" type="text" class="form-control" placeholder="Coloque su cuenta de twitter" aria-describedby="twitter_id">
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
			                        <input name="sInstagram" type="text" class="form-control" placeholder="Coloque su cuenta de inistagram" aria-describedby="insta_id">
			                      </div>
			                  </td>
			                  <td width="5%">&nbsp;</td>
			                  <td width="47,5%">
			                      <div class="input-group">
			                        <span class="input-group-addon" id="pais_id"><font color="red" size="4">*</font>&nbsp;Pais</span>
			                        <input name="sPais" id="sPais" type="text" class="form-control" placeholder="Coloque su pais de origen" aria-describedby="pais_id">
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
			                        <input name="sEstado" type="text" class="form-control" placeholder="Coloque el estado" aria-describedby="edo_id">
			                      </div>
			                  </td>
			                  <td width="5%">&nbsp;</td>
			                  <td width="47,5%">
			                      <div class="input-group">
			                        <span class="input-group-addon" id="munic_id">Municipio</span>
			                        <input name="sMunicipio" type="text" class="form-control" placeholder="Coloque el municipio" aria-describedby="munic_id">
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
			                        <input name="sDespartamento" type="text" class="form-control" placeholder="Coloque el departamento" aria-describedby="depar_id">
			                      </div>
			                  </td>
			                  <td width="5%">&nbsp;</td>
			                  <td width="47,5%">
			                      <div class="input-group">
			                        <span class="input-group-addon" id="parro_id">Parroquia</span>
			                        <input name="sParroquia" type="text" class="form-control" placeholder="Coloque la parroquia" aria-describedby="parro_id">
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
			                        <input name="sProvincia" type="text" class="form-control" placeholder="Coloque la provincia" aria-describedby="provin_id">
			                      </div>
			                  </td>
			                  <td width="5%">&nbsp;</td>
			                  <td width="47,5%">
			                      <div class="input-group">
			                        <span class="input-group-addon" id="sector_id">Sector</span>
			                        <input name="sSector" type="text" class="form-control" placeholder="Coloque el sector" aria-describedby="sector_id">
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
			                        <input name="sCalleoAv" type="text" class="form-control" placeholder="Coloque calle o av" aria-describedby="calleav_id">
			                      </div>
			                  </td>
			                  <td width="5%">&nbsp;</td>
			                  <td width="47,5%">
			                      <div class="input-group">
			                        <span class="input-group-addon" id="casaedif_id">Casa/Edif.</span>
			                        <input name="sCasaoEdif" type="text" class="form-control" placeholder="Coloque casa o edif." aria-describedby="casaedif_id">
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
			                        <input name="sPiso" type="text" class="form-control" placeholder="Coloque el piso" aria-describedby="piso_id">
			                      </div>
			                  </td>
			                  <td width="5%">&nbsp;</td>
			                  <td width="47,5%">
			                      <div class="input-group">
			                        <span class="input-group-addon" id="ncasa_id">N. Casa</span>
			                        <input name="nNumerodeCasa" type="text" class="form-control" placeholder="Coloque n de Casa" aria-describedby="ncasa_id">
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
			                        <span class="input-group-addon" id="preferen_id">Punto Referencia</span>
			                        <input name="sPuntodeReferencia" type="text" class="form-control" placeholder="Coloque punto de referencia" aria-describedby="preferen_id">
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
			                        <input name="sCargo" type="text" class="form-control" placeholder="Coloque su cargo" aria-describedby="cargo_id">
			                      </div>
			                  </td>
			                  <td width="5%">&nbsp;</td>
			                  <td width="47,5%">
			                  	<div class="input-group">
			                  		<span class="input-group-addon" id="profes_id"><font color="red" size="4">*</font>&nbsp;Profesion</span>					  
									<select name="sProfesion" id="sProfesion" class="form-control">
									  <option selected="selected" value=""></option>
									  <c:forEach items="${aListaProfes}" var="state">
									  	<option>${state}</option>
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
			                        <input name="sJefeDirecto" type="text" class="form-control" placeholder="Coloque nombre de jefe" aria-describedby="jefdirect_id">
			                      </div>
			                  </td>
			                  <td width="5%">&nbsp;</td>
			                  <td width="47,5%">
			                      <div class="input-group">
			                        <span class="input-group-addon" id="usujefe_id">Usuario Jefe</span>
			                        <input name="sUsuarioSisJefe" type="text" class="form-control" placeholder="Coloque usuario de jefe" aria-describedby="usujefe_id">
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
			                        <input name="sCedulaJefe" type="text" class="form-control" placeholder="Coloque cedula de jefe" aria-describedby="cedulajefe_id">
			                      </div>
			                  </td>
			                  <td width="5%">&nbsp;</td>
			                  <td width="47,5%">
			                      <div class="input-group">
			                        <span class="input-group-addon" id="nomempresa_id"><font color="red" size="4">*</font>&nbsp;Nombre Empresa</span>
			                        <input name="sNombredeEmpresa" id="sNombredeEmpresa" type="text" class="form-control" placeholder="Coloque nombre empresa" aria-describedby="nomempresa_id">
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
			                        <input name="sTelefonoOficina" id="sTelefonoOficina" type="text" class="form-control" placeholder="Coloque telef. empresa" aria-describedby="telefempre_id">
			                      </div>
			                  </td>
			                  <td width="5%">&nbsp;</td>
			                  <td width="47,5%">
			                      <div class="input-group">
			                        <span class="input-group-addon" id="fax_id">Fax</span>
			                        <input name="sFaxOficina" type="text" class="form-control" placeholder="Coloque fax de empresa" aria-describedby="fax_id">
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
			                        <input name="sCorreoEmpresa" type="text" class="form-control" placeholder="Coloque correo empresa" aria-describedby="correoempre_id">
			                      </div>
			                  </td>
			                  <td width="5%">&nbsp;</td>
			                  <td width="47,5%">
			                      <div class="input-group">
			                        <span class="input-group-addon" id="pwebempre_id">P&aacute;gina Web Empresa</span>
			                        <input name="sPaginaWeb" type="text" class="form-control" placeholder="Coloque pag. web empresa" aria-describedby="pwebempre_id">
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
			                        <input name="sUsuarioSis" id="sUsuarioSis" type="text" class="form-control" placeholder="Proponga un ususario de Sistema" aria-describedby="usuariosis_id">
			                      </div>
			                      <div id="resultado"></div>
			                  </td>
			                  <td width="5%">&nbsp;</td>
			                  <td width="47,5%">
			                  	<div class="form-group">
			                  	  <h3><span class="label label-default">Comentarios</span></h3>
								  <textarea class="form-control" rows="5" id="sComentario" name="sComentario" placeholder="Coloque cualquier otro comentario relevante"></textarea>
								</div>
			                  </td>
			                </tr>
			            </table>
			          </p>
			        </div>
			    </div> <!-- Cierre de pestañas dinamicas -->
			    
   				
	      </div><!-- Fin del body del modal -->
	      <div class="modal-footer">
	        <div align="right">
			    <p>
			        <a><button class="btn btn-lg btn-success " type="reset">Limpiar</button></a>
			        <input class="btn btn-lg btn-primary" type="submit" value="Aceptar" id="aceptarregistro"/>
			        <!-- a><button class="btn btn-lg btn-primary " type="submit" id="aceptarregistro">Aceptar</button></a> -->
			        <button type="button" class="btn btn-danger btn-lg" data-dismiss="modal">Cancelar</button>
			    </p>
		    </div>
	      </div>
	      </form:form>
	  </div>
  </div>
 </div> <!-- Fin de Modal -->      
