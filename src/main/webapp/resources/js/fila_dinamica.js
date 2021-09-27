/**
 * 
 */
var vector = [0,1];
var aTotal = new Array();

$(function(){
	$("#tax").blur(function(e){
		$("#pimpuesto").val($("#tax").val().toString()+"%");
		
		var totalfinal = parseInt($("#psubtotal").val()) + ((parseInt($("#psubtotal").val())*parseInt($("#tax").val()))/100);
		
		$("#ptotal").val(totalfinal.toFixed(2));
		$("#er").html("<h3 style='text-align: left;'>$"+totalfinal.toFixed(2)+"</h3>");
	});
	$("#pimpuesto").val($("#tax").val().toString()+"%");
});

function agregar() {
	
	var aux = $("#count").val();
	var x = parseInt(aux);
	
	var sendaux = $("#sendcount").val();
	var y = parseInt(sendaux);
	
	vector[x]=x;
		
	$("#fila0").attr('id', 'fila' + x.toString()).attr('name', 'fila' + x.toString());
	$("#numarti0").attr('id', 'numarti' + x.toString()).attr('name', 'numarti' + x.toString());
	$("#descrip0").attr('id', 'descrip' + x.toString()).attr('name', 'descrip' + x.toString());
	$("#cant0").attr('id', 'cant' + x.toString()).attr('name', 'cant' + x.toString());
	$("#preci0").attr('id', 'preci' + x.toString()).attr('name', 'preci' + x.toString());
	$("#total0").attr('id', 'total' + x.toString()).attr('name', 'total' + x.toString());
	
	/*
	$("#fila0").attr('name', 'fila' + x.toString());
	$("#numarti0").attr('name', 'numarti' + x.toString());
	$("#descrip0").attr('name', 'descrip' + x.toString());
	$("#cant0").attr('name', 'cant' + x.toString());
	$("#preci0").attr('name', 'preci' + x.toString());
	$("#total0").attr('name', 'total' + x.toString());*/
	
	$("#tabla tbody tr:eq(0)").clone().removeClass('fila-base').appendTo("#tabla tbody");
		
	$("#fila"+x.toString()).attr('id', 'fila0').attr('name', 'fila0');
	$("#numarti"+x.toString()).attr('id', 'numarti0').attr('name', 'numarti0');
	$("#descrip"+x.toString()).attr('id', 'descrip0').attr('name', 'descrip0');
	$("#cant"+x.toString()).attr('id', 'cant0').attr('name', 'cant0');
	$("#preci"+x.toString()).attr('id', 'preci0').attr('name', 'preci0');
	$("#total"+x.toString()).attr('id', 'total0').attr('name', 'total0');
	
	/*
	$("#fila"+x.toString()).attr('name', 'fila0');
	$("#numarti"+x.toString()).attr('name', 'numarti0');
	$("#descrip"+x.toString()).attr('name', 'descrip0');
	$("#cant"+x.toString()).attr('name', 'cant0');
	$("#preci"+x.toString()).attr('name', 'preci0');
	$("#total"+x.toString()).attr('name', 'total0');
	*/
	x=x+1;
	y=y+1;
	
	$("#count").val(x.toString());
	$("#sendcount").val(y.toString());
}

$(function(){ //aqui se cren los totales por articulo y el total global
	
	$(document).on("change",".on",function(){
		
		//var divfile = document.querySelectorAll(".on");
		var i = 0;
		var j = 0;
		
		for (i = 0; i < vector.length; i++) { //Iteramos la variable divfile
			/*var alfa = divfile[i];
			var j = i+1;
			var betha = divfile[j];
			var k = i+2;
			var gamma = divfile[k];
			
			var iDAlfa  = alfa.children[0].id;
			var iDBetha = betha.children[1].id;
			var iDGamma = gamma.children[1].id;*/

			var total = $('#cant'+vector[i]).val()*$('#preci'+vector[i]).val();
			if(Number.isNaN(total)) total=0;
			$('#total'+vector[i]).val(total);
			
			var aux =i-1; 
			if(aux<0){
				aTotal[i]=total;
			} 
			else{
				aTotal[i]=aTotal[i-1]+total;
			}
			
		}
		
		var parTotal = aTotal[i-1];
		
		var percent = (parTotal*parseInt($("#tax").val()))/100;
		
		$("#psubtotal").val(parTotal.toFixed(2));
		totalfinal = parTotal+percent;
		$("#ptotal").val(totalfinal.toFixed(2));
		
		
		$("#er").html("<h3 style='text-align: left;'>$"+totalfinal.toFixed(2)+"</h3>");
	});
});

$(function(){
	// Clona la fila oculta que tiene los campos base, y la agrega al final de la tabla NO LA ESTOY USANDO PORQUE NO ESTOY USANDO UN BOTON INPUT PARA LLAMAR A LA FUNCION SI NO UN BOTON DE BOOTSTRAP
	$("#agregar").on('click', function(){
		$("#tabla tbody tr:eq(0)").clone().removeClass('fila-base').appendTo("#tabla tbody");
	});
 
	// Evento que selecciona la fila y la elimina 
	$(document).on("click",".eliminar",function(){
		//var i = 0;
		var parent = $(this).parents().get(0);
		var id = $(this).closest('tr').attr('id');
		var saux = parseInt(id.substring(4));
		var total;
		var aux;
		
		for (var i = 0; i < vector.length; i+=1) { //probar ya que parece que no es necesario hacer el for
			if(vector[i]===saux){
							
				total = $('#cant'+vector[i]).val()*$('#preci'+vector[i]).val();
				removeItemFromArr(aTotal, total);
				removeItemFromArr(vector, saux);				
				break;
			}
		}
		
		var j=0;
		for (j = 0; j < vector.length; j++) {
			total = $('#cant'+vector[j]).val()*$('#preci'+vector[j]).val();
			if(Number.isNaN(total)) total=0;
			aux =j-1; 
			if(aux<0){
				aTotal[j]=total;
			} 
			else{
				aTotal[j]=aTotal[j-1]+total;
			}
		}
				
		var parTotal = aTotal[i-1];
		
		var percent = (parTotal*parseInt($("#tax").val()))/100;
		
		$("#psubtotal").val(parTotal);
		totalfinal = parTotal+percent;
		$("#ptotal").val(totalfinal);		
		
		$("#er").html("<h3 style='text-align: left;'>$"+totalfinal+"</h3>");
		
		$(parent).remove();
		
		var auxcount = $("#sendcount").val()-1;
		$("#sendcount").val(auxcount.toString());
	});
});

function removeItemFromArr( arr, item ) {
    var k = arr.indexOf( item );
    arr.splice( k, 1 );
}