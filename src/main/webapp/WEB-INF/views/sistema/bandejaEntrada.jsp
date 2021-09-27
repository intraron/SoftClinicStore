<%-- 
    Document   : bandejaEntrada
    Created on : 17/05/2017, 07:52:01 PM
    Author     : Nash
--%>
<%@ include file="../nucleo/cabecera.jsp"%>
<body>
<div class="container">

      <!-- Navigation -->
	  <%@ include file="../nucleo/menu.jsp" %>

      <!-- Main component for a primary marketing message or call to action -->
      <div class="jumbotron">
        <h1>SoftClinicStore</h1>
        <p>Bienvenido al sistema de gestión y almacenamiento de historias clinicas SoftClinicStore Cloud.</p>
        <p>Done by intraron 2017</p>
        <div>
        <p>${mensajeSistema}</p>
        </div>
      </div>
      
</div> <!-- /container -->
	
<!-- Base de la pagina (pie) -->
<%@ include file="../nucleo/pie.jsp"%>
    
</body>
</html>