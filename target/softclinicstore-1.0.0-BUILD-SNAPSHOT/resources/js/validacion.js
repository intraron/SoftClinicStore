/**
 * 
 * Esta funsion se usara para validar todos los campos obligatorios de los formularios.
 * Done by intraron 
 * 24-06-2017 Batalla de Carabobo
 */
var user_ckeck=false;

$(document).ready(function(){
	$("#sCedula").numeric({ maxDigits : 10 });
	$("#sTelefMovil").numeric({ maxDigits : 12 });
	$("#sTelefonoOficina").numeric({ maxDigits : 12 });
	
	$("#sPrimerNombre").alpha();
	$("#sSegundoNombre").alpha();
	$("#sPrimerApellido").alpha();
	$("#sSegundoApellido").alpha();
	$("#sNombredeEmpresa").alpha();
	$("#sPais").alpha();
	$("#sProfesion").alpha();
	
	$.validator.addMethod(
        "regex",
        function(value, element, regexp) {
            var re = new RegExp(regexp);
            return this.optional(element) || re.test(value);
        },
        "Por favor introduzca el dato con el formato correcto"
	);
	
	$("#registroform").validate({

		rules:{
			sPrimerNombre:{
				required: true,
				minlength: 2,
			},
			sPrimerApellido:{
				required: true,
				minlength: 2
			},
			sNombredeEmpresa:{
				required: true
			},
			sCedula:{
				required: true
			},
			sSexo:{
				required: true
			},
			sTelefMovil:{
				required: true
			},
			sTelefonoOficina:{
				required: true
			},
			sCorreo:{
				required: true,
				regex: "\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,4})+"
			},
			sPais:{
				required: true
			},
			sProfesion:{
				required: true
			}
		},
		messages:{

			sPrimerNombre:{
				required: "Este campo no puede estar en vac&iacute;o",
				minlength: "Debe contener m&iacute;nimo 2 caracteres",
			},
			sPrimerApellido:{
				required: "Este campo no puede estar en vac&iacute;o",
				minlength: "Debe contener m&iacute;nimo 2 caracteres"
			},
			sNombredeEmpresa:{
				required: "Este campo no puede estar vac&iacute;o"
			},
			sCedula:{
				required: "Este campo no puede estar vac&iacute;o"
			},
			sSexo:{
				required: "Este campo no puede estar vac&iacute;o"
			},
			sTelefMovil:{
				required: "Este campo no puede estar vac&iacute;o"
			},
			sTelefonoOficina:{
				required: "Este campo no puede estar vac&iacute;o"
			},
			sCorreo:{
				required: "Este campo no puede estar vac&iacute;o",
				regex: "Ingrese un email val&aacute;do Ej: email@ejemplo.com"
			},
			sPais:{
				required: "Este campo no puede estar vac&iacute;o"
			},			
			sProfesion:{
				required: "Este campo no puede estar vac&iacute;o"	
			}
		}
	});
	
	$(document).ready(function(){
	      var consulta;
	      //hacemos focus
	      $("#sUsuarioSis").focus();
	      //blur es la accion cuando se deja libre la caja de input
	      $("#sUsuarioSis").blur(function(e){
	             //obtenemos el texto introducido en el campo
	             consulta = $("#sUsuarioSis").val();
	             //hace la búsqueda
	             $("#resultado").delay(2).queue(function(n) {      
	                  $("#resultado").html('<img src="resources/imagenes/ajax-loader.gif" />');
                        $.ajax({
                              type: "POST",
                              url: "loginDisponible.do",
                              data: "login="+consulta,
                              dataType: "html",
                              error: function(){
                                    alert("error petición ajax");
                              },
                              success: function(data){ 
                            	  if(data=="OK"){
                            		  $("#resultado").html('&nbsp;<img src="resources/imagenes/tick.gif" align="absmiddle">');
                            		  user_ckeck = true;
                            	  }
                            	  else{
                            		  $("#resultado").html(data);
                            	  }
                                  n();
                              }
	                  });
	             });
	      });
	});
});