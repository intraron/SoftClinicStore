<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<sec:authorize access="hasRole('ROLE_ADMIN')">
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
              <li class="active"><a href="irbandeja.html">Home</a></li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Paciente<span class="caret"></span></a>
                <ul class="dropdown-menu">
                  <li><a href="irregistrarPaciente.html">Registrar Paciente</a></li>
                  <li><a href="irgestionarPaciente.html">Gestionar Pacientes</a></li>
                </ul>
              </li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Clinico<span class="caret"></span></a>
                <ul class="dropdown-menu">
                  <li class="dropdown-header">Historia</li>
                  <li><a href="#">Registrar Historia</a></li>
                  <li><a href="#">Gestionar Historias</a></li>
                  <li role="separator" class="divider"></li>
                  <li class="dropdown-header">Informe</li>
                  <li><a href="#">Registrar Informe</a></li>
                  <li><a href="#">Gestionar Informes</a></li>
                  <li role="separator" class="divider"></li>
                  <li class="dropdown-header">Cita</li>
                  <li><a href="irgestionarCita.html">Gestionar Citas</a></li>
                </ul>
              </li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Presupuesto<span class="caret"></span></a>
                <ul class="dropdown-menu">
                  <li><a href="irregistrarPresupuesto.html">Registrar Presupuesto</a></li>
                  <li><a href="irgestionarPresupuesto.html">Gestionar Presupuestos</a></li>
                </ul>
              </li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Reporte<span class="caret"></span></a>
                <ul class="dropdown-menu">
                  <li><a href="#">Gestionar Reportes</a></li>                  
                </ul>
              </li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Administraci&oacute;n<span class="caret"></span></a>
                <ul class="dropdown-menu">
                  <li class="dropdown-header">Operador</li>
                  <li><a href="#">Registrar Operador</a></li>
                  <li><a href="#">Gestionar Operadores</a></li>
                  <li role="separator" class="divider"></li>
                  <li class="dropdown-header">Rol</li>
                  <li><a href="#">Registrar Rol</a></li>
                  <li><a href="#">Gestionar Roles</a></li>
                  <li role="separator" class="divider"></li>
                  <li class="dropdown-header">Organización</li>
                  <li><a href="#">Registrar Organización</a></li>
                  <li><a href="#">Gestionar Organizaciones</a></li><!-- Esto no esta implementado ni idealizado -->
                </ul>
              </li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a>Sr./Sra.&nbsp;${sysUser}</a></li>
              <li><a href="irLogin3?logout">Salir</a></li>
            </ul>
          </div><!--/.nav-collapse -->
        </div><!--/.container-fluid -->
      </nav><!--/.fin del navegador estatico -->      
</sec:authorize>
<sec:authorize access="hasRole('ROLE_USER')">
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
              <li class="active"><a href="irbandeja.html">Home</a></li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Paciente<span class="caret"></span></a>
                <ul class="dropdown-menu">
                  <li><a href="irregistrarPaciente.html">Registrar Paciente</a></li>
                  <li><a href="#">Gestionar Pacientes</a></li>
                </ul>
              </li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Clinico<span class="caret"></span></a>
                <ul class="dropdown-menu">
                  <li class="dropdown-header">Historia</li>
                  <li><a href="#">Registrar Historia</a></li>
                  <li><a href="#">Gestionar Historias</a></li>
                  <li role="separator" class="divider"></li>
                  <li class="dropdown-header">Informe</li>
                  <li><a href="#">Registrar Informe</a></li>
                  <li><a href="#">Gestionar Informes</a></li>
                  <li role="separator" class="divider"></li>
                  <li class="dropdown-header">Cita</li>
                  <li><a href="#">Registrar Cita</a></li>
                  <li><a href="#">Gestionar Citas</a></li>
                </ul>
              </li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Presupuesto<span class="caret"></span></a>
                <ul class="dropdown-menu">
                  <li><a href="#">Regstrar Presupuesto</a></li>
                  <li><a href="#">Gestionar Presupuestos</a></li>
                </ul>
              </li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Reporte<span class="caret"></span></a>
                <ul class="dropdown-menu">
                  <li><a href="#">Gestionar Reportes</a></li><!-- Esto no esta implementado y no esta idealizado -->
                </ul>
              </li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a>Sr./Sra.&nbsp;${sysUser}</a></li>
              <li><a href="irLogin3?logout">Salir</a></li>
            </ul>
          </div><!--/.nav-collapse -->
        </div><!--/.container-fluid -->
      </nav><!--/.fin del navegador estatico -->
</sec:authorize>