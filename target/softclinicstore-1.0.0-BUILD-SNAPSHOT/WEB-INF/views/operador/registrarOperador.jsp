<%-- 
    Document   : registrarPaciente
    Created on : 21/05/2017, 10:19:33 AM
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
    <title>Registro|SoftClinicStore</title>
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
                  <li><a href="registrarPaciente">Registrar Pacientes</a></li>
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
                <li><a>Sr./Sra.</a></li>
              <li><a href="irLogin3">Salir</a></li>
            </ul>
          </div><!--/.nav-collapse -->
        </div><!--/.container-fluid -->
      </nav>
              
    <form action="registrarpaciente.html" method="post" name="form" id="form">
      <!-- Todo el Conteido de Registrar -->
      <div class="jumbotron">
        
    <!-- Esta estructura son para las pestañas  -->
    <ul class="nav nav-tabs">
    <li class="active"><a data-toggle="tab" href="#home">Personal</a></li>
    <li><a data-toggle="tab" href="#menu1">Localizacion</a></li>
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
                        <span class="input-group-addon" id="pNombre_id">Primer Nombre</span>
                        <input type="text" class="form-control" placeholder="Coloque su primer nombre" aria-describedby="pNombre_id">
                      </div>
                  </td>
                  <td width="5%">&nbsp;</td>
                  <td width="47,5%">
                      <div class="input-group">
                        <span class="input-group-addon" id="sNombre_id">Segundo Nombre</span>
                        <input type="text" class="form-control" placeholder="Coloque su primer nombre" aria-describedby="sNombre_id">
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
                        <span class="input-group-addon" id="pApellido_id">Primer Apellido</span>
                        <input type="text" class="form-control" placeholder="Coloque su primer apellido" aria-describedby="pApellido_id">
                      </div>
                  </td>
                  <td width="5%">&nbsp;</td>
                  <td width="47,5%">
                      <div class="input-group">
                        <span class="input-group-addon" id="sApellido_id">Segundo Apellido</span>
                        <input type="text" class="form-control" placeholder="Coloque su segundo apellido" aria-describedby="sApellido_id">
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
                        <input type="text" class="form-control" placeholder="Coloque su tipo de documento" aria-describedby="tipodoc_id">
                      </div>
                  </td>
                  <td width="5%">&nbsp;</td>
                  <td width="47,5%">
                      <div class="input-group">
                        <span class="input-group-addon" id="cedula_id">Cedula</span>
                        <input type="text" class="form-control" placeholder="Coloque su Cedula" aria-describedby="cedula_id">
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
                        <input type="text" class="form-control" placeholder="Coloque su RIF" aria-describedby="rif_id">
                      </div>
                  </td>
                  <td width="5%">&nbsp;</td>
                  <td width="47,5%">
                      <div class="input-group">
                        <span class="input-group-addon" id="edad_id">Edad</span>
                        <input type="text" class="form-control" placeholder="Coloque su edad" aria-describedby="edad_id">
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
                        <span class="input-group-addon" id="fnacimiento_id">Fecha Nacimiento</span>
                        <input type="text" class="form-control" placeholder="Seleccione su fecha de nacimiento" aria-describedby="fnacimiento_id">
                      </div>
                  </td>
                  <td width="5%">&nbsp;</td>
                  <td width="47,5%">
                      <div class="input-group">
                        <span class="input-group-addon" id="nacional_id">Nacionalidad</span>
                        <input type="text" class="form-control" placeholder="Seleccione su nacionalidad" aria-describedby="nacional_id">
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
                        <span class="input-group-addon" id="sexo_id">Sexo</span>
                        <input type="text" class="form-control" placeholder="Seleccione su sexo" aria-describedby="sexo_id">
                      </div>
                  </td>
                  <td width="5%">&nbsp;</td>
                  <td width="47,5%">
                      <div class="input-group">
                        <span class="input-group-addon" id="estadocivil_id">Estado Civil</span>
                        <input type="text" class="form-control" placeholder="Seleccione su estado civil" aria-describedby="estadocivil_id">
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
                        <input type="text" class="form-control" placeholder="Coloque nombre de medico" aria-describedby="meditra_id">
                      </div>
                  </td>
                  <td width="5%">&nbsp;</td>
                  <td width="47,5%">&nbsp;</td>
                </tr>
            </table>
          </p>
        </div>
        <div id="menu1" class="tab-pane fade">
          <h3>Datos de localizacion</h3>
          <p>
              <table width="100%" border="0">
                <tr>
                  <td width="47,5%">
                      <div class="input-group">
                        <span class="input-group-addon" id="correo_id">Correo</span>
                        <input type="text" class="form-control" placeholder="Coloque su Correo Electronico" aria-describedby="correo_id">
                      </div>
                  </td>
                  <td width="5%">&nbsp;</td>
                  <td width="47,5%">
                      <div class="input-group">
                        <span class="input-group-addon" id="telefofi_id">Telef. Oficina</span>
                        <input type="text" class="form-control" placeholder="Coloque su Telefono" aria-describedby="telefofi_id">
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
                        <span class="input-group-addon" id="telefmovil_id">Telef. Movil</span>
                        <input type="text" class="form-control" placeholder="Coloque su Telefono" aria-describedby="telefmovil_id">
                      </div>
                  </td>
                  <td width="5%">&nbsp;</td>
                  <td width="47,5%">
                      <div class="input-group">
                        <span class="input-group-addon" id="twitter_id">Twitter</span>
                        <input type="text" class="form-control" placeholder="Coloque su cuenta de twitter" aria-describedby="twitter_id">
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
                        <input type="text" class="form-control" placeholder="Coloque su cuenta de inistagram" aria-describedby="insta_id">
                      </div>
                  </td>
                  <td width="5%">&nbsp;</td>
                  <td width="47,5%">
                      <div class="input-group">
                        <span class="input-group-addon" id="pais_id">Pais</span>
                        <input type="text" class="form-control" placeholder="Coloque su pais de origen" aria-describedby="pais_id">
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
                        <input type="text" class="form-control" placeholder="Coloque el estado" aria-describedby="edo_id">
                      </div>
                  </td>
                  <td width="5%">&nbsp;</td>
                  <td width="47,5%">
                      <div class="input-group">
                        <span class="input-group-addon" id="munic_id">Municipio</span>
                        <input type="text" class="form-control" placeholder="Coloque el municipio" aria-describedby="munic_id">
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
                        <input type="text" class="form-control" placeholder="Coloque el departamento" aria-describedby="depar_id">
                      </div>
                  </td>
                  <td width="5%">&nbsp;</td>
                  <td width="47,5%">
                      <div class="input-group">
                        <span class="input-group-addon" id="parro_id">Parroquia</span>
                        <input type="text" class="form-control" placeholder="Coloque la parroquia" aria-describedby="parro_id">
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
                        <input type="text" class="form-control" placeholder="Coloque la provincia" aria-describedby="provin_id">
                      </div>
                  </td>
                  <td width="5%">&nbsp;</td>
                  <td width="47,5%">
                      <div class="input-group">
                        <span class="input-group-addon" id="sector_id">Sector</span>
                        <input type="text" class="form-control" placeholder="Coloque el sector" aria-describedby="sector_id">
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
                        <input type="text" class="form-control" placeholder="Coloque calle o av" aria-describedby="calleav_id">
                      </div>
                  </td>
                  <td width="5%">&nbsp;</td>
                  <td width="47,5%">
                      <div class="input-group">
                        <span class="input-group-addon" id="casaedif_id">Casa/Edif.</span>
                        <input type="text" class="form-control" placeholder="Coloque casa o edif." aria-describedby="casaedif_id">
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
                        <input type="text" class="form-control" placeholder="Coloque el piso" aria-describedby="piso_id">
                      </div>
                  </td>
                  <td width="5%">&nbsp;</td>
                  <td width="47,5%">
                      <div class="input-group">
                        <span class="input-group-addon" id="ncasa_id">N. Casa</span>
                        <input type="text" class="form-control" placeholder="Coloque n de Casa" aria-describedby="ncasa_id">
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
                        <input type="text" class="form-control" placeholder="Coloque punto de referencia" aria-describedby="preferen_id">
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
                        <input type="text" class="form-control" placeholder="Coloque su cargo" aria-describedby="cargo_id">
                      </div>
                  </td>
                  <td width="5%">&nbsp;</td>
                  <td width="47,5%">
                      <div class="input-group">
                        <span class="input-group-addon" id="profes_id">Profesion</span>
                        <input type="text" class="form-control" placeholder="Coloque su profesion" aria-describedby="profes_id">
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
                        <input type="text" class="form-control" placeholder="Coloque nombre de jefe" aria-describedby="jefdirect_id">
                      </div>
                  </td>
                  <td width="5%">&nbsp;</td>
                  <td width="47,5%">
                      <div class="input-group">
                        <span class="input-group-addon" id="usujefe_id">Usuario Jefe</span>
                        <input type="text" class="form-control" placeholder="Coloque usuario de jefe" aria-describedby="usujefe_id">
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
                        <input type="text" class="form-control" placeholder="Coloque cedula de jefe" aria-describedby="cedulajefe_id">
                      </div>
                  </td>
                  <td width="5%">&nbsp;</td>
                  <td width="47,5%">
                      <div class="input-group">
                        <span class="input-group-addon" id="nomempresa_id">Nombre Empresa</span>
                        <input type="text" class="form-control" placeholder="Coloque nombre empresa" aria-describedby="nomempresa_id">
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
                        <span class="input-group-addon" id="telefempre_id">Telef. Empresa</span>
                        <input type="text" class="form-control" placeholder="Coloque telef. empresa" aria-describedby="telefempre_id">
                      </div>
                  </td>
                  <td width="5%">&nbsp;</td>
                  <td width="47,5%">
                      <div class="input-group">
                        <span class="input-group-addon" id="fax_id">Fax</span>
                        <input type="text" class="form-control" placeholder="Coloque fax de empresa" aria-describedby="fax_id">
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
                        <input type="text" class="form-control" placeholder="Coloque correo empresa" aria-describedby="correoempre_id">
                      </div>
                  </td>
                  <td width="5%">&nbsp;</td>
                  <td width="47,5%">
                      <div class="input-group">
                        <span class="input-group-addon" id="pwebempre_id">Pagina Web Empresa</span>
                        <input type="text" class="form-control" placeholder="Coloque pag. web empresa" aria-describedby="pwebempre_id">
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
                        <span class="input-group-addon" id="coment_id">Comentarios</span>
                        <input type="text" class="form-control" placeholder="Coloque comentarios" aria-describedby="coment_id">
                      </div>
                  </td>
                  <td width="5%">&nbsp;</td>
                  <td width="47,5%">
                      <div class="input-group">
                        <span class="input-group-addon" id="foto_id">Foto</span>
                        <input type="text" class="form-control" placeholder="Coloque la foto" aria-describedby="foto_id">
                      </div>
                  </td>
                </tr>
            </table>
          </p>
        </div>
    </div> <!-- Cierre de pestañas dinamicas -->
    </div> <!-- Cierre de Jumbotron -->
    <div align="right">
    <p>
        <a><button class="btn btn-lg btn-success " type="reset">Limpiar</button></a>
        <input name="submit" type="hidden" value="Enviar" />
        <a><button class="btn btn-lg btn-primary " type="submit">Aceptar</button></a>
        <a href="bandejaentrada.html" id="cancel" name="cancel" class="btn btn-danger btn-lg">Cancelar</a>
    </p>
    </div>
    </form>
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
