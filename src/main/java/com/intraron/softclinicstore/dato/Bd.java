/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intraron.softclinicstore.dato;

//Con este import te tares todos los metodo de la clase SQL pero solo pudieras incluir "Conection" y "DriverManager"
import java.sql.*;

/**
 *
 * @author Nash
 */
public class Bd {
    
    protected final String DRIVER_NAME = "org.postgresql.Driver";
    protected final String URL_BD_SCS = "jdbc:postgresql://localhost:5432/scs?currentSchema=scs";
    protected final String URL_BD_SCS_CRTL = "jdbc:postgresql://localhost:5432/scs?currentSchema=scs_ctrl";
    protected final String USUARIO = "postgres";
    protected final String CLAVE = "admin";
    
    public Connection Conexion;

    
    public Bd(Connection conexion) {
		super();
		this.Conexion = conexion;
	}

	public Bd() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Connection getConexion() {
        return this.Conexion;
    }    

//colocar esta función en void una vez finalizadas las pruebas.
    //public String conectar() 
    protected void conectarToSCS()  
    {
        //String Msj = new String();
        //Msj= "No se conecto";
        try 
        {
            Class.forName(DRIVER_NAME);
            this.Conexion = DriverManager.getConnection(URL_BD_SCS, USUARIO, CLAVE);
            //Msj=Conexion.getSchema();
            //return Msj;
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
            //Msj="excepcion1     "+ex.getMessage()+"  "+ex.toString();
            //return Msj;
        }
        catch (SQLException ex) 
        {
            ex.printStackTrace();
            //Msj="excepcion2     "+ex.getMessage()+ex.getCause();
            //return Msj;
        }
    }
    
    protected void conectarToSCSCTRL()  
    {
        //String Msj = new String();
        //Msj= "No se conecto";
        try 
        {
            Class.forName(DRIVER_NAME);
            this.Conexion = DriverManager.getConnection(URL_BD_SCS_CRTL, USUARIO, CLAVE);
            //Msj=Conexion.getSchema();
            //return Msj;
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
            //Msj="excepcion1     "+ex.getMessage()+"  "+ex.toString();
            //return Msj;
        }
        catch (SQLException ex) 
        {
            ex.printStackTrace();
            //Msj="excepcion2     "+ex.getMessage()+ex.getCause();
            //return Msj;
        }
    }
}
