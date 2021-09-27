/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intraron.softclinicstore.dato;

import java.sql.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 *
 * @author Nash
 */
public class DatoBuscar {
	
	private static final Logger logger = LoggerFactory.getLogger(DatoBuscar.class);
    
    private Bd oBaseDato           = new Bd();
    private String m_sMensaje      = new String();
    private String m_sMensajeError = new String();
       
    public DatoBuscar() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	public String get_MensajedeError(){
        return this.m_sMensajeError;
    }
    
    public void set_MensajedeError(String sMensajedeError){
        this.m_sMensajeError = sMensajedeError;
    }
    
    public String get_Mensaje(){
        return this.m_sMensaje;
    }
    
    public void set_Mensaje(String sMensaje){
        this.m_sMensaje = sMensaje;
    }
    
    public long get_IdparaRegistro(String NombreTabla) 
    {
    	long dId=-1;
    	String sql = null;
    	Statement declaracion = null;
        ResultSet resultado = null;
                
        try{    
        	this.oBaseDato.conectarToSCSCTRL();
        	
        	sql="SELECT S_ULTIMO_N FROM SCS_CTRL.NUMERO WHERE S_NOMBRE_TABLA='"+NombreTabla+"' ";
        	
        	logger.info(sql);
    
            declaracion = oBaseDato.getConexion().createStatement(); 
            
            resultado = declaracion.executeQuery (sql); 
            
            if(resultado.next())
            	dId = Long.valueOf(resultado.getString("S_ULTIMO_N"));
            else
            	dId = dId + 1;
                       
            oBaseDato.Conexion.close();
        }
        catch(Exception ex){
            
            ex.printStackTrace();
            this.set_MensajedeError("No se ejecuto el query: "+ex.getMessage());
            dId = 0;
            logger.error(this.get_MensajedeError());
        }
        
    	return dId;
    }
    
    public ResultSet sqlbuscarTodosContactos(){

    	String sql = null;
        Statement declaracion = null;
        ResultSet resultado = null;
                
        try{    
        	this.oBaseDato.conectarToSCS();
        	
            sql="SELECT * FROM scs.contactos";
    
            declaracion = oBaseDato.getConexion().createStatement(); 
            
            resultado = declaracion.executeQuery (sql); 
//      
            oBaseDato.Conexion.close();
        }
        catch(Exception ex){
            
            ex.printStackTrace();
            this.set_MensajedeError("No se ejecuto el query: "+ex.getMessage());
        }

        return resultado;
    }
    
    public ResultSet sqlbuscarTodasCitas(){

    	String sql = null;
        Statement declaracion = null;
        ResultSet resultado = null;
                
        try{    
        	this.oBaseDato.conectarToSCS();
        	
            sql="SELECT * FROM scs.citas";
    
            declaracion = oBaseDato.getConexion().createStatement(); 
            
            resultado = declaracion.executeQuery (sql); 
  
            oBaseDato.Conexion.close();
        }
        catch(Exception ex){
            
            ex.printStackTrace();
            this.set_MensajedeError("No se ejecuto el query: "+ex.getMessage());
        }

        return resultado;
    }
    
    public ResultSet sqlbuscarCitasporId(String IdCita){

    	String sql = null;
        Statement declaracion = null;
        ResultSet resultado = null;
                
        try{    
        	this.oBaseDato.conectarToSCS();
        	
            sql="SELECT * FROM scs.citas WHERE n_id='"+IdCita+"'";
    
            declaracion = oBaseDato.getConexion().createStatement(); 
            
            resultado = declaracion.executeQuery (sql); 
  
            oBaseDato.Conexion.close();
        }
        catch(Exception ex){
            
            ex.printStackTrace();
            this.set_MensajedeError("No se ejecuto el query: "+ex.getMessage());
        }

        return resultado;
    }
    
    public ResultSet sqlbuscarContactoporCedula(String NumeroCedula){

    	String sql = null;
        Statement declaracion = null;
        ResultSet resultado = null;
                
        try{    
        	this.oBaseDato.conectarToSCS();
        	
            sql="SELECT * FROM scs.contactos WHERE n_cedula='"+NumeroCedula+"'";
    
            declaracion = oBaseDato.getConexion().createStatement(); 
            
            resultado = declaracion.executeQuery (sql); 
//      
            oBaseDato.Conexion.close();
        }
        catch(Exception ex){
            
            ex.printStackTrace();
            this.set_MensajedeError("No se ejecuto el query: "+ex.getMessage());
        }

        return resultado;
    }
    
    public ResultSet sqlbuscarContactoporUsuario(String UsuarioSistema){

    	String sql = null;
        Statement declaracion = null;
        ResultSet resultado = null;
                
        try{    
        	this.oBaseDato.conectarToSCS();
        	
            sql="SELECT * FROM scs.contactos WHERE s_usuariosis='"+UsuarioSistema+"'";
    
            declaracion = oBaseDato.getConexion().createStatement(); 
            
            resultado = declaracion.executeQuery (sql); 
//      
            oBaseDato.Conexion.close();
        }
        catch(Exception ex){
            
            ex.printStackTrace();
            this.set_MensajedeError("No se ejecuto el query: "+ex.getMessage());
        }

        return resultado;
    }
    
    public ResultSet sqlbuscarContactoporId(String IddeContacto){

    	String sql = null;
        Statement declaracion = null;
        ResultSet resultado = null;
                
        try{    
        	this.oBaseDato.conectarToSCS();
        	
            sql="SELECT * FROM scs.contactos WHERE n_id='"+IddeContacto+"'";
    
            declaracion = oBaseDato.getConexion().createStatement(); 
            
            resultado = declaracion.executeQuery (sql); 
      
            oBaseDato.Conexion.close();
        }
        catch(Exception ex){
            
            ex.printStackTrace();
            this.set_MensajedeError("No se ejecuto el query: "+ex.getMessage());
        }

        return resultado;
    }
    
    public ResultSet sqlbuscarContactoporCargo(String Cargo){

    	String sql = null;
        Statement declaracion = null;
        ResultSet resultado = null;
                
        try{    
        	this.oBaseDato.conectarToSCS();
        	
            sql="SELECT * FROM scs.contactos WHERE s_profesi='"+Cargo+"'";
    
            declaracion = oBaseDato.getConexion().createStatement(); 
            
            resultado = declaracion.executeQuery (sql); 
      
            oBaseDato.Conexion.close();
        }
        catch(Exception ex){
            
            ex.printStackTrace();
            this.set_MensajedeError("No se ejecuto el query: "+ex.getMessage());
        }

        return resultado;
    }
    
    public ResultSet sqlbuscarOperador(String UsuarioSistema){
        
        String sql = null;
        Statement declaracion = null;
        ResultSet resultado = null;
                
        try{    
        	this.oBaseDato.conectarToSCS();
        	
            sql="SELECT * FROM scs.operadores WHERE s_usuariosis='"+UsuarioSistema+"'";
    
            declaracion = oBaseDato.getConexion().createStatement(); 
            
            resultado = declaracion.executeQuery (sql); 
      
            oBaseDato.Conexion.close();
        }
        catch(Exception ex){
            
            ex.printStackTrace();
            this.set_MensajedeError("No se ejecuto el query: "+ex.getMessage());
        }

        return resultado;
    }
    
    public ResultSet sqlbuscarRol(String NombreRol){
        
        String sql = null;
        Statement declaracion = null;
        ResultSet resultado = null;
                
        try{    
        	this.oBaseDato.conectarToSCS();
        	
            sql="SELECT * FROM scs.roles WHERE s_nombre ='"+NombreRol+"'";
    
            declaracion = oBaseDato.getConexion().createStatement(); 
            
            resultado = declaracion.executeQuery (sql); 
      
            oBaseDato.Conexion.close();
        }
        catch(Exception ex){
            
            ex.printStackTrace();
            this.set_MensajedeError("No se ejecuto el query: "+ex.getMessage());
        }

        return resultado;
    }
    
    public ResultSet sqlbuscarRolesdeUsuarioSistema(String NombreOperador){
        
        String sql = null;
        Statement declaracion = null;
        ResultSet resultado = null;
                
        try{    
        	this.oBaseDato.conectarToSCS();
        	
            sql="SELECT * FROM scs.roles WHERE s_usuariosis_operador ='"+NombreOperador+"'";
    
            declaracion = oBaseDato.getConexion().createStatement(); 
            
            resultado = declaracion.executeQuery (sql); 
      
            oBaseDato.Conexion.close();
        }
        catch(Exception ex){
            
            ex.printStackTrace();
            this.set_MensajedeError("No se ejecuto el query: "+ex.getMessage());
        }

        return resultado;
    }
    
    public ResultSet sqlbuscarEmpresa(String NombreEmpresa){

    	String sql = null;
        Statement declaracion = null;
        ResultSet resultado = null;
                
        try{    
        	this.oBaseDato.conectarToSCS();
        	
            sql="SELECT * FROM scs.empresas WHERE s_nombre='"+NombreEmpresa+"'";
    
            declaracion = oBaseDato.getConexion().createStatement(); 
            
            resultado = declaracion.executeQuery (sql); 
      
            oBaseDato.Conexion.close();
        }
        catch(Exception ex){
            
            ex.printStackTrace();
            this.set_MensajedeError("No se ejecuto el query: "+ex.getMessage());
        }

        return resultado;
    }
    
    public ResultSet sqlbuscarEmpresaporId(String IddeEmpresa){

    	String sql = null;
        Statement declaracion = null;
        ResultSet resultado = null;
                
        try{    
        	this.oBaseDato.conectarToSCS();
        	
            sql="SELECT * FROM scs.empresas WHERE n_id='"+IddeEmpresa+"'";
    
            declaracion = oBaseDato.getConexion().createStatement(); 
            
            resultado = declaracion.executeQuery (sql); 
      
            oBaseDato.Conexion.close();
        }
        catch(Exception ex){
            
            ex.printStackTrace();
            this.set_MensajedeError("No se ejecuto el query: "+ex.getMessage());
        }

        return resultado;
    }
    
    public ResultSet sqlbuscarDireccion(String IdDireccion){

    	String sql = null;
        Statement declaracion = null;
        ResultSet resultado = null;
                
        try{    
        	this.oBaseDato.conectarToSCS();
        	
            sql="SELECT * FROM scs.direcciones WHERE n_id='"+IdDireccion+"'";
    
            declaracion = oBaseDato.getConexion().createStatement(); 
            
            resultado = declaracion.executeQuery (sql); 
      
            oBaseDato.Conexion.close();
        }
        catch(Exception ex){
            
            ex.printStackTrace();
            this.set_MensajedeError("No se ejecuto el query: "+ex.getMessage());
        }

        return resultado;
    }    
    
    public ResultSet sqlbuscarHistoria(String IdHistoria){

    	String sql = null;
        Statement declaracion = null;
        ResultSet resultado = null;
                
        try{    
        	this.oBaseDato.conectarToSCS();
        	
            sql="SELECT * FROM scs.historias WHERE n_id='"+IdHistoria+"'";
    
            declaracion = oBaseDato.getConexion().createStatement(); 
            
            resultado = declaracion.executeQuery (sql); 
      
            oBaseDato.Conexion.close();
        }
        catch(Exception ex){
            
            ex.printStackTrace();
            this.set_MensajedeError("No se ejecuto el query: "+ex.getMessage());
        }

        return resultado;
    }    
    
    public ResultSet sqlbuscarHistoriaporPaciente(String cedulaPaiente){

    	String sql = null;
        Statement declaracion = null;
        ResultSet resultado = null;
                
        try{    
        	this.oBaseDato.conectarToSCS();
        	
        	sql="SELECT * FROM scs.historias WHERE n_id_contacto_paciente IN (select n_id from scs.contactos where n_cedula='"+cedulaPaiente+"')";
        	    
            declaracion = oBaseDato.getConexion().createStatement(); 
            
            resultado = declaracion.executeQuery (sql); 
      
            oBaseDato.Conexion.close();
        }
        catch(Exception ex){
            
            ex.printStackTrace();
            this.set_MensajedeError("No se ejecuto el query: "+ex.getMessage());
        }

        return resultado;
    }    
    
    public ResultSet sqlbuscarHistoriaporDoctor(String cedulaDoctor){

    	String sql = null;
        Statement declaracion = null;
        ResultSet resultado = null;
                
        try{    
        	this.oBaseDato.conectarToSCS();
        	
        	sql="SELECT * FROM scs.historias WHERE n_id_contacto_doctor IN (select n_id from scs.contactos where n_cedula='"+cedulaDoctor+"')";
    
            declaracion = oBaseDato.getConexion().createStatement(); 
            
            resultado = declaracion.executeQuery (sql); 
      
            oBaseDato.Conexion.close();
        }
        catch(Exception ex){
            
            ex.printStackTrace();
            this.set_MensajedeError("No se ejecuto el query: "+ex.getMessage());
        }

        return resultado;
    }    

    public ResultSet sqlbuscarInforme(String IdInforme){

    	String sql = null;
        Statement declaracion = null;
        ResultSet resultado = null;
                
        try{    
        	this.oBaseDato.conectarToSCS();
        	
            sql="SELECT * FROM scs.informes WHERE n_id='"+IdInforme+"'";
    
            declaracion = oBaseDato.getConexion().createStatement(); 
            
            resultado = declaracion.executeQuery (sql); 
      
            oBaseDato.Conexion.close();
        }
        catch(Exception ex){
            
            ex.printStackTrace();
            this.set_MensajedeError("No se ejecuto el query: "+ex.getMessage());
        }

        return resultado;
    }    
    
    public ResultSet sqlbuscarInformeporPaciente(String cedulaPaiente){

    	String sql = null;
        Statement declaracion = null;
        ResultSet resultado = null;
                
        try{    
        	this.oBaseDato.conectarToSCS();
        	
        	sql="SELECT * FROM scs.informes WHERE n_id_contacto_paciente IN (select n_id from scs.contactos where n_cedula='"+cedulaPaiente+"')";
        	    
            declaracion = oBaseDato.getConexion().createStatement(); 
            
            resultado = declaracion.executeQuery (sql); 
      
            oBaseDato.Conexion.close();
        }
        catch(Exception ex){
            
            ex.printStackTrace();
            this.set_MensajedeError("No se ejecuto el query: "+ex.getMessage());
        }

        return resultado;
    }    
    
    public ResultSet sqlbuscarInformeporDoctor(String cedulaDoctor){

    	String sql = null;
        Statement declaracion = null;
        ResultSet resultado = null;
                
        try{    
        	this.oBaseDato.conectarToSCS();
        	
        	sql="SELECT * FROM scs.informes WHERE n_id_contacto_doctor IN (select n_id from scs.contactos where n_cedula='"+cedulaDoctor+"')";
    
            declaracion = oBaseDato.getConexion().createStatement(); 
            
            resultado = declaracion.executeQuery (sql); 
      
            oBaseDato.Conexion.close();
        }
        catch(Exception ex){
            
            ex.printStackTrace();
            this.set_MensajedeError("No se ejecuto el query: "+ex.getMessage());
        }

        return resultado;
    }    

    public ResultSet sqlbuscarPresupuesto(String IdPresupuesto){

    	String sql = null;
        Statement declaracion = null;
        ResultSet resultado = null;
                
        try{    
        	this.oBaseDato.conectarToSCS();
        	
            sql="SELECT * FROM scs.presupuestos WHERE n_id='"+IdPresupuesto+"'";
    
            declaracion = oBaseDato.getConexion().createStatement(); 
            
            resultado = declaracion.executeQuery (sql); 
      
            oBaseDato.Conexion.close();
        }
        catch(Exception ex){
            
            ex.printStackTrace();
            this.set_MensajedeError("No se ejecuto el query: "+ex.getMessage());
        }

        return resultado;
    }    
    
    public ResultSet sqlbuscarPresupuestosporPaciente(String cedulaPaiente){

    	String sql = null;
        Statement declaracion = null;
        ResultSet resultado = null;
                
        try{    
        	this.oBaseDato.conectarToSCS();
        	
        	sql="SELECT * FROM scs.presupuestos WHERE n_id_contacto IN (select n_id from scs.contactos where n_cedula='"+cedulaPaiente+"')";
    
            declaracion = oBaseDato.getConexion().createStatement(); 
            
            resultado = declaracion.executeQuery (sql); 
      
            oBaseDato.Conexion.close();
        }
        catch(Exception ex){
            
            ex.printStackTrace();
            this.set_MensajedeError("No se ejecuto el query: "+ex.getMessage());
        }

        return resultado;
    }    

    
}
