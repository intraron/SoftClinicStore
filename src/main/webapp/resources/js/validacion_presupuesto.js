/**
 * validación para la vista de presupuestos y demas script de corto alcance.
 */

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
			sFkPaciente_Usuariosis:{
				required: true
			},
			sFkDoctor_Usuariosis:{
				required: true
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
});
