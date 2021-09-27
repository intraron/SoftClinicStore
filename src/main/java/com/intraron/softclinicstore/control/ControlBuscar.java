/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intraron.softclinicstore.control;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import com.intraron.softclinicstore.dato.DatoBuscar;
import com.intraron.softclinicstore.entidad.Cita;
import com.intraron.softclinicstore.entidad.Contacto;
import com.intraron.softclinicstore.entidad.Direccion;
import com.intraron.softclinicstore.entidad.Empresa;
import com.intraron.softclinicstore.entidad.Operador;
import com.intraron.softclinicstore.entidad.Rol;


public class ControlBuscar {

    private String m_sMensaje;
    private String m_sMensajedeError;
    
    public long buscarIdparaRegistro(String tabla) {
    	DatoBuscar oDatoBuscar = new DatoBuscar();
    	long aux = oDatoBuscar.get_IdparaRegistro(tabla);
    	//this.m_sMensajedeError = oDatoBuscar.get_MensajedeError();
    	return aux;
    }
    
    public String get_Mensaje(){
        return this.m_sMensaje;
    }
    
    public void set_Mensaje(String sMensaje){
        this.m_sMensaje = sMensaje;
    }
    
    public String get_MensajedeError(){
        return this.m_sMensajedeError;
    }
    
    public void set_MensajedeError(String sMensajedeError){
        this.m_sMensajedeError = sMensajedeError;
    }
    
    public Operador buscarOperador(String UsuariodeSistema){
    	
    	Operador oOperador = new Operador();
    	ResultSet resultado    = null;
    	DatoBuscar oDatoBuscar = new DatoBuscar();
    	
    	try {
    		
			resultado = oDatoBuscar.sqlbuscarOperador(UsuariodeSistema);
			
			if(resultado.next()){
								  
				oOperador.setsPrimerNombre(resultado.getString("s_pnombre"));
				oOperador.setsSegundoNombre(resultado.getString("s_snombre"));
				oOperador.setsPrimerApellido(resultado.getString("s_papellido"));
				oOperador.setnId(resultado.getInt("n_Id"));
				oOperador.setsUsuarioSistema(resultado.getString("s_usuariosis"));
				oOperador.setsSegundoApellido(resultado.getString("s_sapellido"));
				oOperador.setsCorreo(resultado.getString("s_correo").toString());
				oOperador.setsTelefonoOficina(resultado.getString("n_telefof"));
				oOperador.setsContrasena(resultado.getString("s_contras"));
				oOperador.setdtUltimaHoraAcceso(resultado.getDate("dt_ultimahora"));
				oOperador.setnId_Empresa(resultado.getInt("n_id_empresa"));
				oOperador.setnId_Contacto(resultado.getInt("n_id_contacto"));
				oOperador.setdtSysModTime(resultado.getDate("dt_sysmodtime"));
				oOperador.setsSysModUser(resultado.getString("s_sysmoduser"));
				oOperador.setsSysModCount(resultado.getString("n_sysmodcount"));
				oOperador.setbActivo(resultado.getBoolean("b_activo"));
			}
			else{
				this.set_Mensaje("El usuario: "+UsuariodeSistema+" no esta registrado");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			this.set_MensajedeError("Hubo una excepcion en el mapeo");
			e.printStackTrace();
		}
    	
    	return oOperador;
    	
    }

    public Rol buscarRol(String NombreRol){
    	
    	Rol oRol = new Rol();
    	ResultSet resultado    = null;
    	DatoBuscar oDatoBuscar = new DatoBuscar();
    	
    	try {
    		
			resultado = oDatoBuscar.sqlbuscarRol(NombreRol);
			
			if(resultado.next()){
				  
				oRol.setnId(resultado.getInt("n_Id"));
				oRol.setsNombredeRol(resultado.getString("s_nombre"));
				oRol.setsDescripcion(resultado.getString("s_descri"));
				oRol.setsEstadoPermitido(resultado.getString("s_estadop"));
				oRol.setbActualizar(resultado.getBoolean("b_actualizar"));
				oRol.setbModificar(resultado.getBoolean("b_modificar"));
				oRol.setbEliminar(resultado.getBoolean("b_eliminar"));
				oRol.setbVer(resultado.getBoolean("b_ver"));
				oRol.setbEsAdmin(resultado.getBoolean("b_esadmin"));
				oRol.setsUsusarioSistema_Operador(resultado.getString("s_usuariosis_operador"));
				oRol.setdtSysModTime(resultado.getDate("dt_sysmodtime"));
				oRol.setsSysModUser(resultado.getString("s_sysmoduser"));
				oRol.setnSysModCount(resultado.getInt("n_sysmodcount"));
				
			}
			else{
				this.set_Mensaje("El usuario: "+NombreRol+" no esta registrado");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			this.set_MensajedeError("Hubo una excepcion en el mapeo");
			e.printStackTrace();
		}
    	
    	return oRol;
    	
    }

    public Collection<Rol> buscarRolesdeOperador(String UsuariodeSistema){
    	
    	Collection<Rol> oResultRol = new ArrayList<Rol>();
    	ResultSet resultado    = null;
    	DatoBuscar oDatoBuscar = new DatoBuscar();
    	int aux = 0;
    	
    	try {
    		
			resultado = oDatoBuscar.sqlbuscarRolesdeUsuarioSistema(UsuariodeSistema);
			
			while(resultado.next()){
				Rol oRol = new Rol();
				  
				oRol.setnId(resultado.getInt("n_Id"));
				oRol.setsNombredeRol(resultado.getString("s_nombre"));
				oRol.setsDescripcion(resultado.getString("s_descri"));
				oRol.setsEstadoPermitido(resultado.getString("s_estadop"));
				oRol.setbActualizar(resultado.getBoolean("b_actualizar"));
				oRol.setbModificar(resultado.getBoolean("b_modificar"));
				oRol.setbEliminar(resultado.getBoolean("b_eliminar"));
				oRol.setbVer(resultado.getBoolean("b_ver"));
				oRol.setbEsAdmin(resultado.getBoolean("b_esadmin"));
				oRol.setsUsusarioSistema_Operador(resultado.getString("s_usuariosis_operador"));
				oRol.setdtSysModTime(resultado.getDate("dt_sysmodtime"));
				oRol.setsSysModUser(resultado.getString("s_sysmoduser"));
				oRol.setnSysModCount(resultado.getInt("n_sysmodcount"));
								
				oResultRol.add(oRol);				
				aux++;
			}
			
			if(aux==0){
				this.set_Mensaje("El usuario: "+UsuariodeSistema+" no tiene roles");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			this.set_MensajedeError("Hubo una excepcion en el mapeo");
			e.printStackTrace();
		}
    	
    	return oResultRol;
    	
    }

    public Contacto buscarContactoporUsuario(String UsuariodeSistema){
    	
    	Contacto oContacto = new Contacto();
    	ResultSet resultado    = null;
    	DatoBuscar oDatoBuscar = new DatoBuscar();
    	
    	try {
    		
			resultado = oDatoBuscar.sqlbuscarContactoporUsuario(UsuariodeSistema);
			
			if(resultado.next()){
			    
				oContacto.setnId(resultado.getInt("n_Id"));
				oContacto.setsCedula(resultado.getString("n_cedula"));
				oContacto.setsRif(resultado.getString("n_rif"));
				oContacto.setsUsuarioSis(resultado.getString("s_usuariosis"));
				oContacto.setsPrimerNombre(resultado.getString("s_pnombre"));
				oContacto.setsSegundoNombre(resultado.getString("s_snombre"));
				oContacto.setsPrimerApellido(resultado.getString("s_papellido"));
				oContacto.setsSegundoApellido(resultado.getString("s_sapellido"));
				oContacto.setnEdad(resultado.getInt("n_edad"));
				oContacto.setsCorreo(resultado.getString("s_correo"));
				oContacto.setsTelefMovil(resultado.getString("n_telefmo"));
				oContacto.setsTelefOficina(resultado.getString("n_telefof"));
				oContacto.setsTipoDocumento(resultado.getString("s_tipodocumento"));
				oContacto.setdtFechaNacimiento(resultado.getDate("dt_fechanaci"));
				oContacto.setsSexo(resultado.getString("s_sexo"));
				oContacto.setsMedicoTratante(resultado.getString("s_medicotra"));
				oContacto.setsCargo(resultado.getString("s_cargo"));
				oContacto.setsProfesion(resultado.getString("s_profesi"));
				oContacto.setsNacionalidad(resultado.getString("s_nacionali"));
				oContacto.setsEstadoCivil(resultado.getString("s_estadocivil"));
				oContacto.setsJefeDirecto(resultado.getString("s_jefedirec"));
				oContacto.setsUsuarioSisJefe(resultado.getString("s_usujefedirec"));
				oContacto.setsCedulaJefe(resultado.getString("n_cedulajefe"));
				oContacto.setsTwitter(resultado.getString("s_twitter"));
				oContacto.setsInstagram(resultado.getString("s_instagram"));
				oContacto.setsComentario(resultado.getString("s_comentario"));
				oContacto.setnId_Empresa(resultado.getLong("n_id_empresa"));
				oContacto.setnId_Direccion(resultado.getLong("n_id_direccion"));
				oContacto.setdtSysModTime(resultado.getDate("dt_sysmodtime"));
				oContacto.setsSysModUser(resultado.getString("s_sysmoduser"));
				oContacto.setsSysModCount(resultado.getString("n_sysmodcount"));

			}
			else{
				this.set_Mensaje("El paciente: "+UsuariodeSistema+" no esta registrado");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			this.set_MensajedeError("Hubo una excepcion en el mapeo");
			e.printStackTrace();
		}
    	
    	return oContacto;
    	
    }

    public Collection<Contacto> buscarTodosContactos(){
    	
    	Collection<Contacto> oResultRol = new ArrayList<Contacto>();
    	ResultSet resultado    = null;
    	DatoBuscar oDatoBuscar = new DatoBuscar();
    	int aux = 0;
    	
    	try {
    		
			resultado = oDatoBuscar.sqlbuscarTodosContactos();
			
			while(resultado.next()){
				Contacto oContacto = new Contacto();
				  
				oContacto.setnId(resultado.getInt("n_Id"));
				oContacto.setsCedula(resultado.getString("n_cedula"));
				oContacto.setsRif(resultado.getString("n_rif"));
				oContacto.setsUsuarioSis(resultado.getString("s_usuariosis"));
				oContacto.setsPrimerNombre(resultado.getString("s_pnombre"));
				oContacto.setsSegundoNombre(resultado.getString("s_snombre"));
				oContacto.setsPrimerApellido(resultado.getString("s_papellido"));
				oContacto.setsSegundoApellido(resultado.getString("s_sapellido"));
				oContacto.setnEdad(resultado.getInt("n_edad"));
				oContacto.setsCorreo(resultado.getString("s_correo"));
				oContacto.setsTelefMovil(resultado.getString("n_telefmo"));
				oContacto.setsTelefOficina(resultado.getString("n_telefof"));
				oContacto.setsTipoDocumento(resultado.getString("s_tipodocumento"));
				oContacto.setdtFechaNacimiento(resultado.getDate("dt_fechanaci"));
				oContacto.setsSexo(resultado.getString("s_sexo"));
				oContacto.setsMedicoTratante(resultado.getString("s_medicotra"));
				oContacto.setsCargo(resultado.getString("s_cargo"));
				oContacto.setsProfesion(resultado.getString("s_profesi"));
				oContacto.setsNacionalidad(resultado.getString("s_nacionali"));
				oContacto.setsEstadoCivil(resultado.getString("s_estadocivil"));
				oContacto.setsJefeDirecto(resultado.getString("s_jefedirec"));
				oContacto.setsUsuarioSisJefe(resultado.getString("s_usujefedirec"));
				oContacto.setsCedulaJefe(resultado.getString("n_cedulajefe"));
				oContacto.setsTwitter(resultado.getString("s_twitter"));
				oContacto.setsInstagram(resultado.getString("s_instagram"));
				oContacto.setsComentario(resultado.getString("s_comentario"));
				oContacto.setnId_Empresa(resultado.getLong("n_id_empresa"));
				oContacto.setnId_Direccion(resultado.getLong("n_id_direccion"));
				oContacto.setdtSysModTime(resultado.getDate("dt_sysmodtime"));
				oContacto.setsSysModUser(resultado.getString("s_sysmoduser"));
				oContacto.setsSysModCount(resultado.getString("n_sysmodcount"));
								
				oResultRol.add(oContacto);				
				aux++;
			}
			
			if(aux==0){
				this.set_Mensaje("No hay contactos en la tabla.");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			this.set_MensajedeError("Hubo una excepcion en el mapeo");
			e.printStackTrace();
		}
    	return oResultRol;
    }
    
    public Contacto buscarContactoporId(String IddeContacto){
    	
    	Contacto oContacto = new Contacto();
    	ResultSet resultado    = null;
    	DatoBuscar oDatoBuscar = new DatoBuscar();
    	
    	try {
    		
			resultado = oDatoBuscar.sqlbuscarContactoporId(IddeContacto);
			
			if(resultado.next()){
			    
				oContacto.setnId(resultado.getInt("n_Id"));
				oContacto.setsCedula(resultado.getString("n_cedula"));
				oContacto.setsRif(resultado.getString("n_rif"));
				oContacto.setsUsuarioSis(resultado.getString("s_usuariosis"));
				oContacto.setsPrimerNombre(resultado.getString("s_pnombre"));
				oContacto.setsSegundoNombre(resultado.getString("s_snombre"));
				oContacto.setsPrimerApellido(resultado.getString("s_papellido"));
				oContacto.setsSegundoApellido(resultado.getString("s_sapellido"));
				oContacto.setnEdad(resultado.getInt("n_edad"));
				oContacto.setsCorreo(resultado.getString("s_correo"));
				oContacto.setsTelefMovil(resultado.getString("n_telefmo"));
				oContacto.setsTelefOficina(resultado.getString("n_telefof"));
				oContacto.setsTipoDocumento(resultado.getString("s_tipodocumento"));
				oContacto.setdtFechaNacimiento(resultado.getDate("dt_fechanaci"));
				oContacto.setsSexo(resultado.getString("s_sexo"));
				oContacto.setsMedicoTratante(resultado.getString("s_medicotra"));
				oContacto.setsCargo(resultado.getString("s_cargo"));
				oContacto.setsProfesion(resultado.getString("s_profesi"));
				oContacto.setsNacionalidad(resultado.getString("s_nacionali"));
				oContacto.setsEstadoCivil(resultado.getString("s_estadocivil"));
				oContacto.setsJefeDirecto(resultado.getString("s_jefedirec"));
				oContacto.setsUsuarioSisJefe(resultado.getString("s_usujefedirec"));
				oContacto.setsCedulaJefe(resultado.getString("n_cedulajefe"));
				oContacto.setsTwitter(resultado.getString("s_twitter"));
				oContacto.setsInstagram(resultado.getString("s_instagram"));
				oContacto.setsComentario(resultado.getString("s_comentario"));
				oContacto.setnId_Empresa(resultado.getLong("n_id_empresa"));
				oContacto.setnId_Direccion(resultado.getLong("n_id_direccion"));
				oContacto.setdtSysModTime(resultado.getDate("dt_sysmodtime"));
				oContacto.setsSysModUser(resultado.getString("s_sysmoduser"));
				oContacto.setsSysModCount(resultado.getString("n_sysmodcount"));

			}
			else{
				this.set_Mensaje("El paciente cuyo id: "+IddeContacto+" no esta registrado");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			this.set_MensajedeError("Hubo una excepcion en el mapeo");
			e.printStackTrace();
		}
    	return oContacto;
    }
    
    public Collection<Contacto> buscarContactoporCargo(String Cargo){
    	    	
    	ResultSet resultado    = null;
    	DatoBuscar oDatoBuscar = new DatoBuscar();
    	Collection<Contacto> aContactos = new ArrayList<Contacto>();
    	
    	try {
    		
			resultado = oDatoBuscar.sqlbuscarContactoporCargo(Cargo);
			
			if(resultado.next()){
				Contacto oContacto = new Contacto();
				
				oContacto.setnId(resultado.getInt("n_Id"));
				oContacto.setsCedula(resultado.getString("n_cedula"));
				oContacto.setsRif(resultado.getString("n_rif"));
				oContacto.setsUsuarioSis(resultado.getString("s_usuariosis"));
				oContacto.setsPrimerNombre(resultado.getString("s_pnombre"));
				oContacto.setsSegundoNombre(resultado.getString("s_snombre"));
				oContacto.setsPrimerApellido(resultado.getString("s_papellido"));
				oContacto.setsSegundoApellido(resultado.getString("s_sapellido"));
				oContacto.setnEdad(resultado.getInt("n_edad"));
				oContacto.setsCorreo(resultado.getString("s_correo"));
				oContacto.setsTelefMovil(resultado.getString("n_telefmo"));
				oContacto.setsTelefOficina(resultado.getString("n_telefof"));
				oContacto.setsTipoDocumento(resultado.getString("s_tipodocumento"));
				oContacto.setdtFechaNacimiento(resultado.getDate("dt_fechanaci"));
				oContacto.setsSexo(resultado.getString("s_sexo"));
				oContacto.setsMedicoTratante(resultado.getString("s_medicotra"));
				oContacto.setsCargo(resultado.getString("s_cargo"));
				oContacto.setsProfesion(resultado.getString("s_profesi"));
				oContacto.setsNacionalidad(resultado.getString("s_nacionali"));
				oContacto.setsEstadoCivil(resultado.getString("s_estadocivil"));
				oContacto.setsJefeDirecto(resultado.getString("s_jefedirec"));
				oContacto.setsUsuarioSisJefe(resultado.getString("s_usujefedirec"));
				oContacto.setsCedulaJefe(resultado.getString("n_cedulajefe"));
				oContacto.setsTwitter(resultado.getString("s_twitter"));
				oContacto.setsInstagram(resultado.getString("s_instagram"));
				oContacto.setsComentario(resultado.getString("s_comentario"));
				oContacto.setnId_Empresa(resultado.getLong("n_id_empresa"));
				oContacto.setnId_Direccion(resultado.getLong("n_id_direccion"));
				oContacto.setdtSysModTime(resultado.getDate("dt_sysmodtime"));
				oContacto.setsSysModUser(resultado.getString("s_sysmoduser"));
				oContacto.setsSysModCount(resultado.getString("n_sysmodcount"));
				
				aContactos.add(oContacto);
			}
			else{
				this.set_Mensaje("No existen pacientes con el Cargo: "+Cargo+" no estan registrado");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			this.set_MensajedeError("Hubo una excepcion en el mapeo");
			e.printStackTrace();
		}
    	return aContactos;
    }
    
    public Empresa buscarEmpresaporId(String IddeEmpresa){
    	
    	Empresa oEmpresa = new Empresa();
    	ResultSet resultado    = null;
    	DatoBuscar oDatoBuscar = new DatoBuscar();
    	
    	try {
    		
			resultado = oDatoBuscar.sqlbuscarEmpresaporId(IddeEmpresa);
			
			if(resultado.next()){
			    
				oEmpresa.setnId(resultado.getInt("n_Id"));
				oEmpresa.setsNombredeEmpresa(resultado.getString("s_nombre"));
				oEmpresa.setsTelefonoOficina(resultado.getString("n_telefof"));
				oEmpresa.setsFaxOficina(resultado.getString("n_fax"));
				oEmpresa.setsCorreoEmpresa(resultado.getString("s_correo"));
				oEmpresa.setsPaginaWeb(resultado.getString("s_pweb"));
				oEmpresa.setdtSysModTime(resultado.getDate("dt_sysmodtime"));
				oEmpresa.setsSysModUser(resultado.getString("s_sysmoduser"));
				oEmpresa.setsSysModCount(resultado.getString("n_sysmodcount"));
			}
			else{
				this.set_Mensaje("La empresa cuyo id: "+IddeEmpresa+" no esta registrado");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			this.set_MensajedeError("Hubo una excepcion en el mapeo");
			e.printStackTrace();
		}
    	return oEmpresa;
    }

    public Direccion buscarDireccion(String IddeDireccion){
    	
    	Direccion oDireccion = new Direccion();
    	ResultSet resultado    = null;
    	DatoBuscar oDatoBuscar = new DatoBuscar();
    	
    	try {
    		
			resultado = oDatoBuscar.sqlbuscarDireccion(IddeDireccion);
			
			if(resultado.next()){
			    
				oDireccion.setnId(resultado.getInt("n_Id"));
				oDireccion.setsPais(resultado.getString("s_pais"));
				oDireccion.setsEstado(resultado.getString("s_estado"));
				oDireccion.setsMunicipio(resultado.getString("s_municipio"));
				oDireccion.setsDespartamento(resultado.getString("s_despart"));
				oDireccion.setsProvincia(resultado.getString("s_provin"));
				oDireccion.setsParroquia(resultado.getString("s_parroq"));
				oDireccion.setsSector(resultado.getString("s_sector"));
				oDireccion.setsCalleoAv(resultado.getString("s_caavca"));
				oDireccion.setsCasaoEdif(resultado.getString("s_casaedi"));
				oDireccion.setsPiso(resultado.getString("s_piso"));
				oDireccion.setnNumerodeCasa(resultado.getInt("n_numcasa"));
				oDireccion.setsPuntodeReferencia(resultado.getString("s_prefer"));
				oDireccion.setdtSysModTime(resultado.getDate("dt_sysmodtime"));
				oDireccion.setsSysModUser(resultado.getString("s_sysmoduser"));
				oDireccion.setsSysModCount(resultado.getString("n_sysmodcount"));
			}
			else{
				this.set_Mensaje("La direccion cuyo id: "+IddeDireccion+" no esta registrado");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			this.set_MensajedeError("Hubo una excepcion en el mapeo");
			e.printStackTrace();
		}
    	return oDireccion;
    }

    public Collection<Cita> buscarTodasCitas(){
    	
    	Collection<Cita> oResultCita = new ArrayList<Cita>();
    	ResultSet resultado    = null;
    	DatoBuscar oDatoBuscar = new DatoBuscar();
    	int aux = 0;
    	
    	try {
    		
			resultado = oDatoBuscar.sqlbuscarTodasCitas();
			
			while(resultado.next()){
				Cita oCita = new Cita();
				  
				oCita.setnId(resultado.getInt("n_Id"));
				oCita.setnIniciodeCita(resultado.getLong("n_inciocita"));
				oCita.setnFindeCita(resultado.getLong("n_fincita"));
				oCita.setsTipodeCita(resultado.getString("s_tipocita"));
				oCita.setsTitulodeCita(resultado.getString("s_titulo"));
				oCita.setsMotivodeCita(resultado.getString("s_moticita"));
				oCita.setdtSysModTime(resultado.getDate("dt_sysmodtime"));
				oCita.setsSysModUser(resultado.getString("s_sysmoduser"));
				oCita.setnSysModCount(resultado.getString("n_sysmodcount"));
				oCita.setsUrl(resultado.getString("s_url"));
				oCita.setsUsuariosis_Contacto_Doctor(resultado.getString("s_usuariosis_contacto_doctor"));
				oCita.setsUsuariosis_Contacto_Paciente(resultado.getString("s_usuariosis_contacto_paciente"));
												
				oResultCita.add(oCita);				
				aux++;
			}
			
			if(aux==0){
				this.set_Mensaje("No hay citas en la tabla.");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			this.set_MensajedeError("Hubo una excepcion en el mapeo");
			e.printStackTrace();
		}
    	return oResultCita;
    }
    
    public Cita buscarCitaporId(String IdCita){
    	
    	Cita oCita = new Cita();
    	ResultSet resultado    = null;
    	DatoBuscar oDatoBuscar = new DatoBuscar();
    	
    	try {
    		
			resultado = oDatoBuscar.sqlbuscarCitasporId(IdCita);
			
			while(resultado.next()){
				  
				oCita.setnId(resultado.getInt("n_Id"));
				oCita.setnIniciodeCita(resultado.getLong("n_inciocita"));
				oCita.setnFindeCita(resultado.getLong("n_fincita"));
				oCita.setsTipodeCita(resultado.getString("s_tipocita"));
				oCita.setsTitulodeCita(resultado.getString("s_titulo"));
				oCita.setsMotivodeCita(resultado.getString("s_moticita"));
				oCita.setdtSysModTime(resultado.getDate("dt_sysmodtime"));
				oCita.setsSysModUser(resultado.getString("s_sysmoduser"));
				oCita.setnSysModCount(resultado.getString("n_sysmodcount"));
				oCita.setsUrl(resultado.getString("s_url"));
				oCita.setsUsuariosis_Contacto_Doctor(resultado.getString("s_usuariosis_contacto_doctor"));
				oCita.setsUsuariosis_Contacto_Paciente(resultado.getString("s_usuariosis_contacto_paciente"));
			}
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			this.set_MensajedeError("Hubo una excepcion en el mapeo");
			e.printStackTrace();
		}
    	return oCita;
    }
    
}
