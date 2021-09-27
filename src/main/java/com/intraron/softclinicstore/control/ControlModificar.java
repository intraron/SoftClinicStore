package com.intraron.softclinicstore.control;

import com.intraron.softclinicstore.dato.DatoModificar;
import com.intraron.softclinicstore.dato.DatoRegistrar;
import com.intraron.softclinicstore.entidad.Contacto;
import com.intraron.softclinicstore.entidad.Direccion;
import com.intraron.softclinicstore.entidad.Empresa;

public class ControlModificar {
	
	public String modificarContacto(Contacto oContacto, Empresa oEmpresa, Direccion oDireccion){
		String Msj = new String();
				
		DatoModificar oSqlModificar = new DatoModificar();
		
		Msj = oSqlModificar.sqlmodificarContacto(oContacto,oEmpresa,oDireccion);
		
		return Msj;
	}

}
