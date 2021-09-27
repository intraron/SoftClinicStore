package com.intraron.softclinicstore.dato;

import java.sql.SQLException;
import java.sql.Statement;

import com.intraron.softclinicstore.entidad.Contacto;
import com.intraron.softclinicstore.entidad.Direccion;
import com.intraron.softclinicstore.entidad.Empresa;

public class DatoModificar {
	
	private Bd oBaseDato = new Bd();
        
	public DatoModificar() {
		super();
		// TODO Auto-generated constructor stub
	}

    public String sqlmodificarContacto(Contacto oContacto, Empresa oEmpresa, Direccion oDireccion) {
    	
        this.oBaseDato.conectarToSCS();
        
    	String sMsjC = new String();
        String sMsjE = new String();
        String sMsjD = new String();
        String sMsjFinal = new String();
        
        long n_id_empresa			 = oContacto.getnId_Empresa();
        String s_nombre				 = oEmpresa.getsNombredeEmpresa();
        String n_telefof			 = oEmpresa.getsTelefonoOficina();
        String n_fax				 = oEmpresa.getsFaxOficina();
        String s_correo				 = oEmpresa.getsCorreoEmpresa();
        String s_pweb				 = oEmpresa.getsPaginaWeb();
        java.util.Date dt_sysmodtime = oEmpresa.getdtSysModTime();
        String s_sysmoduser			 = oEmpresa.getsSysModUser();
        String n_sysmodcount		 = oEmpresa.getsSysModCount();
        String sql = null;
        try
        {

            Statement declaracion = null;
                       
            sql= "UPDATE scs.empresas SET s_nombre='"+s_nombre+"', n_telefof='"+n_telefof+"', n_fax='"+n_fax+"', s_correo='"+s_correo+"', s_pweb='"+s_pweb+"', dt_sysmodtime='"+dt_sysmodtime+"', s_sysmoduser='"+s_sysmoduser+"', n_sysmodcount='"+n_sysmodcount+"' WHERE n_id='"+n_id_empresa+"'";
                                 
            declaracion = this.oBaseDato.getConexion().createStatement();
            
            declaracion.executeUpdate(sql);
            sMsjE="E";
        }
        catch(SQLException e)
        {
            sMsjE= "La Empresa no fue modificada. "+e;
        }
        
        long n_id_direccion = oContacto.getnId_Direccion();
        String s_pais		= oDireccion.getsPais();
        String s_estado		= oDireccion.getsEstado();
        String s_municipio	= oDireccion.getsMunicipio();
        String s_despart	= oDireccion.getsDespartamento();
        String s_provin		= oDireccion.getsProvincia();
        String s_parroq		= oDireccion.getsParroquia();
        String s_sector		= oDireccion.getsSector();
        String s_caavca		= oDireccion.getsCalleoAv();
        String s_casaedi	= oDireccion.getsCasaoEdif();
        String s_piso		= oDireccion.getsPiso();
        int n_numcasa		= oDireccion.getnNumerodeCasa();
        String s_prefer		= oDireccion.getsPuntodeReferencia();
                   
        try
        {
            Statement declaracion = null;
                       
            sql= "UPDATE scs.direcciones SET s_pais='"+s_pais+"', s_estado='"+s_estado+"', s_municipio='"+s_municipio+"', s_despart='"+s_despart+"', s_provin='"+s_provin+"', s_parroq='"+s_parroq+"', s_sector='"+s_sector+"', s_caavca='"+s_caavca+"', s_casaedi='"+s_casaedi+"', s_piso='"+s_piso+"', n_numcasa='"+n_numcasa+"', s_prefer='"+s_prefer+"', dt_sysmodtime='"+dt_sysmodtime+"', s_sysmoduser='"+s_sysmoduser+"', n_sysmodcount='"+n_sysmodcount+"' WHERE n_id='"+n_id_direccion+"'";
                                
            declaracion = this.oBaseDato.getConexion().createStatement();
            
            declaracion.executeUpdate(sql);
            sMsjD="D";
        }
        catch(SQLException e)
        {
            sMsjD= "La Direccion no fue modificada. "+e;
        }
        
        long n_id_contacto           = oContacto.getnId();
        String n_cedula              = oContacto.getsCedula();
        String n_rif                 = oContacto.getsRif();
        //String s_usuariosis          = oContacto.getsUsuarioSis();
        String s_pnombre             = oContacto.getsPrimerNombre();
        String s_snombre             = oContacto.getsSegundoNombre();
        String s_papellido           = oContacto.getsPrimerApellido();
        String s_sapellido           = oContacto.getsSegundoApellido();
        int n_edad                   = oContacto.getnEdad();
        String s_correo_contacto     = oContacto.getsCorreo();
        String n_telefmo             = oContacto.getsTelefMovil();
        String n_telefof_contacto    = oContacto.getsTelefOficina();
        String s_tipodocumento       = oContacto.getsTipoDocumento();
        java.util.Date dt_fechanaci  = oContacto.getdtFechaNacimiento();
        String s_sexo                = oContacto.getsSexo();
        String s_medicotra           = oContacto.getsMedicoTratante();
        String s_cargo               = oContacto.getsCargo();
        String s_profesi             = oContacto.getsProfesion();
        String s_nacionali           = oContacto.getsNacionalidad();
        String s_estadocivil         = oContacto.getsEstadoCivil();
        String s_jefedirec           = oContacto.getsJefeDirecto();
        String s_usujefedirec        = oContacto.getsUsuarioSisJefe();
        String n_cedulajefe          = oContacto.getsCedulaJefe();
        String s_twitter             = oContacto.getsTwitter();
        String s_instagram           = oContacto.getsInstagram();
        String s_comentario          = oContacto.getsComentario();
        
        
        try
        {
            Statement declaracion = null;
            
            sql= "UPDATE scs.contactos SET n_cedula='"+n_cedula+"', n_rif='"+n_rif+"', s_pnombre='"+s_pnombre+"', s_snombre='"+s_snombre+"', s_papellido='"+s_papellido+"', s_sapellido='"+s_sapellido+"', n_edad='"+n_edad+"', s_correo='"+s_correo_contacto+"', n_telefmo='"+n_telefmo+"', n_telefof='"+n_telefof_contacto+"', s_tipodocumento='"+s_tipodocumento+"', dt_fechanaci='"+dt_fechanaci+"', s_sexo='"+s_sexo+"',"
            		+ " s_medicotra='"+s_medicotra+"', s_cargo='"+s_cargo+"', s_profesi='"+s_profesi+"', s_nacionali='"+s_nacionali+"', s_estadocivil='"+s_estadocivil+"', s_jefedirec='"+s_jefedirec+"', s_usujefedirec='"+s_usujefedirec+"', n_cedulajefe='"+n_cedulajefe+"', s_twitter='"+s_twitter+"', s_instagram='"+s_instagram+"', s_comentario='"+s_comentario+"', n_id_empresa='"+n_id_empresa+"', n_id_direccion='"+n_id_direccion+"', dt_sysmodtime='"+dt_sysmodtime+"', s_sysmoduser='"+s_sysmoduser+"', n_sysmodcount='"+n_sysmodcount+"' "
            				+ "WHERE n_id='"+n_id_contacto+"'";
            		
            declaracion = this.oBaseDato.getConexion().createStatement();
            
            declaracion.executeUpdate(sql);
            sMsjC="C";
        }
        catch(SQLException e)
        {
            sMsjC= "El Contacto no fue modificado. "+e;
        }
        
        if(sMsjC.equals("C") && sMsjE.equals("E") && sMsjD.equals("D")) {
        	sMsjFinal="El Paciente "+oContacto.getsPrimerNombre()+" , "+oContacto.getsPrimerApellido()+" fue actualizado satisfactoriamente";
        }
        else {
        	sMsjFinal="El Paciente no fue modificado.";
        	
        	//Recordar eliminar los registros en este else si falla alguno de los registros.
        }

        return sMsjFinal;
    }

}
