/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intraron.softclinicstore.control;
import java.util.Collection;

import com.intraron.softclinicstore.dato.*;
import com.intraron.softclinicstore.entidad.*;

/**
 *
 * @author Nash
 */
public class ControlRegistrar {
	
	public String registrarContacto(Contacto oContacto){
		String Msj = new String();
				
		DatoRegistrar oSqlRegistrar = new DatoRegistrar();
		DatoBuscar oSqlBuscar = new DatoBuscar();
		
		long dId = oSqlBuscar.get_IdparaRegistro("contactos");
		oContacto.setnId(dId);
		
		Msj = oSqlRegistrar.sqlregistrarContacto(oContacto);
		
		return Msj;
	}
	
	public String registrarContacto(Contacto oContacto, Empresa oEmpresa, Direccion oDireccion){
		String Msj = new String();
				
		DatoRegistrar oSqlRegistrar = new DatoRegistrar();
		DatoBuscar oSqlBuscar = new DatoBuscar();
		
		long dIdC = oSqlBuscar.get_IdparaRegistro("contactos");
		long dIdE = oSqlBuscar.get_IdparaRegistro("empresas");
		long dIdD = oSqlBuscar.get_IdparaRegistro("direcciones");
		oContacto.setnId(dIdC);
		oEmpresa.setnId(dIdE);
		oDireccion.setnId(dIdD);
		
		Msj = oSqlRegistrar.sqlregistrarContacto(oContacto,oEmpresa,oDireccion)+String.valueOf(dIdC)+String.valueOf(dIdE)+String.valueOf(dIdD);
		
		return Msj;
	}
	
	public String registrarEmpresa(Empresa oEmpresa){
		String Msj = new String();
				
		DatoRegistrar oSqlRegistrar = new DatoRegistrar();
		DatoBuscar oSqlBuscar = new DatoBuscar();
		
		long dId = oSqlBuscar.get_IdparaRegistro("empresas");
		oEmpresa.setnId(dId);
		
		Msj = oSqlRegistrar.sqlregistrarEmpresa(oEmpresa);
		
		return Msj;
	}
	
	public String registrarDireccion(Direccion oDireccion){
		String Msj = new String();
				
		DatoRegistrar oSqlRegistrar = new DatoRegistrar();
		DatoBuscar oSqlBuscar = new DatoBuscar();
		
		long dId = oSqlBuscar.get_IdparaRegistro("direcciones");
		oDireccion.setnId(dId);
		
		Msj = oSqlRegistrar.sqlregistrarDireccion(oDireccion);
		
		return Msj;
	}
	
	public String registrarCita(Cita oCita){
		String Msj = new String();
				
		DatoRegistrar oSqlRegistrar = new DatoRegistrar();
		DatoBuscar oSqlBuscar = new DatoBuscar();
		
		long dId = oSqlBuscar.get_IdparaRegistro("citas");
		oCita.setnId(dId);
				
		Msj = oSqlRegistrar.sqlregistrarCita(oCita);
		
		return Msj;
	}
	
	public String registrarPresupuesto(Presupuesto oPresupuesto){
		String Msj = new String();
				
		DatoRegistrar oSqlRegistrar = new DatoRegistrar();
						
		Msj = oSqlRegistrar.sqlregistrarPresupuesto(oPresupuesto);
		
		return Msj;
	}	
	
	public String registrarArticulo(Collection<Articulo> aArticulo){
		String Msj = new String();
				
		DatoRegistrar oSqlRegistrar = new DatoRegistrar();
			
		Msj = oSqlRegistrar.sqlregistrarArticulo(aArticulo);
		
		return Msj;
	}
	
}
