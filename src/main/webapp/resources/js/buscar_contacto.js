/**
 * Done by intraron 
 * 14-09-2017
 */

$(document).ready(function(){
	  var consultapaciente;      
	  //blur es la accion cuando se deja libre la caja de input
	  $("select[name=sFkPaciente_Usuariosis]").change(function(){
	        //obtenemos el texto introducido en el campo
		  	consultapaciente = $("#paciente").val();
	        //hace la búsqueda     	                  
	        $.ajax({
	            type: "GET",
	            url: "contacto.do",
	            data: "id="+consultapaciente,
	            dataType: "json",
	            async: false,
	      		error: function(data){
	      	        alert("error petición ajax"+data);
	      		},
	      		success: function(doc) {
	      			
	      			$("#nombrepct").val(doc.sPrimerNombre+" "+doc.sPrimerApellido);
	      			$("#telefonopct").val(doc.sTelefMovil);
	      			
	      			$.ajax({
	    	            type: "GET",
	    	            url: "direccion.do",
	    	            data: "id="+doc.nId_Direccion,
	    	            dataType: "json",
	    	            async: false,
	    	      		error: function(k){
	    	      	        alert("error petición ajax"+k);
	    	      		},
	    	      		success: function(dk) {
	    	      			$("#direccionpct").val(dk.sCalleoAv+" "+dk.sCasaoEdif+" "+dk.sSector+". "+dk.sEstado+". "+dk.sPais);
	    	      		}
	      			});
	      			
	              }
	      });
	  });
});

$(document).ready(function(){
	  var consultadoctor;      
	  //blur es la accion cuando se deja libre la caja de input
	  $("select[name=sFkDoctor_Usuariosis]").change(function(){
	        //obtenemos el texto introducido en el campo
		  	consultadoctor = $("#doctor").val();
	        //hace la búsqueda     	                  
	        $.ajax({
	            type: "GET",
	            url: "contacto.do",
	            data: "id="+consultadoctor,
	            dataType: "json",
	            async: false,
	      		error: function(data){
	      	        alert("error petición ajax"+data);
	      		},
	      		success: function(doc) {
	      			
	      			$("#nombredoc").val(doc.sPrimerNombre+" "+doc.sPrimerApellido);
	      			$("#telefonodoc").val(doc.sTelefMovil);
	      			
	      			$.ajax({
	    	            type: "GET",
	    	            url: "direccion.do",
	    	            data: "id="+doc.nId_Direccion,
	    	            dataType: "json",
	    	            async: false,
	    	      		error: function(k){
	    	      	        alert("error petición ajax"+k);
	    	      		},
	    	      		success: function(dk) {
	    	      			$("#direcciondoc").val(dk.sCalleoAv+" "+dk.sCasaoEdif+" "+dk.sSector+". "+dk.sEstado+". "+dk.sPais);
	    	      		}
	      			});
	      			
	              }
	      });
	  });
});

$("#btn").click(function () {
    //Hide all other elements other than printarea.
    $("#paraimprimir").show();
    window.print();
});