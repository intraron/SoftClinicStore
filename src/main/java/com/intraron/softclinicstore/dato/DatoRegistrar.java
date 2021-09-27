/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intraron.softclinicstore.dato;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.Date;

import com.intraron.softclinicstore.entidad.*;

/**
 *
 * @author nash
 */
public class DatoRegistrar {
	
    private Bd oBaseDato = new Bd();
    
    public String sqlregistrarContacto(Contacto oContacto){
        
        String sMsj = new String();
        
        double n_id                  = oContacto.getnId();
        String n_cedula              = oContacto.getsCedula();
        String n_rif                 = oContacto.getsRif();
        String s_usuariosis          = oContacto.getsUsuarioSis();
        String s_pnombre             = oContacto.getsPrimerNombre();
        String s_snombre             = oContacto.getsSegundoNombre();
        String s_papellido           = oContacto.getsPrimerApellido();
        String s_sapellido           = oContacto.getsSegundoApellido();
        int n_edad                   = oContacto.getnEdad();
        String s_correo              = oContacto.getsCorreo();
        String n_telefmo             = oContacto.getsTelefMovil();
        String n_telefof             = oContacto.getsTelefOficina();
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
        double n_id_empresa          = oContacto.getnId_Empresa();
        double n_id_direccion        = oContacto.getnId_Direccion();
        java.util.Date dt_sysmodtime = oContacto.getdtSysModTime();
        String s_sysmoduser          = oContacto.getsSysModUser();
        String n_sysmodcount         = oContacto.getsSysModCount();
        
        try
        {
            this.oBaseDato.conectarToSCS();
            String sql = null;
            Statement declaracion = null;
                       
            sql= "INSERT INTO scs.contactos (n_id, n_cedula, n_rif, s_usuariosis, s_pnombre, s_snombre, s_papellido, s_sapellido, n_edad, s_correo, n_telefmo, n_telefof, s_tipodocumento, dt_fechanaci, s_sexo, s_medicotra, s_cargo, s_profesi, s_nacionali, s_estadocivil, s_jefedirec, s_usujefedirec, n_cedulajefe, s_twitter, s_instagram, s_comentario, n_id_empresa, n_id_direccion, dt_sysmodtime, s_sysmoduser, n_sysmodcount)" +
                         "VALUES('"+n_id+"','"+n_cedula+"','"+n_rif+"','"+s_usuariosis+"','"+s_pnombre+"','"+s_snombre+"','"+s_papellido+"','"+s_sapellido+"','"+n_edad+"','"+s_correo+"','"+n_telefmo+"','"+n_telefof+"','"+s_tipodocumento+"','"+dt_fechanaci+"','"+s_sexo+"','"+s_medicotra+"','"+s_cargo+"','"+s_profesi+"','"+s_nacionali+"','"+s_estadocivil+"','"+s_jefedirec+"','"+s_usujefedirec+"','"+n_cedulajefe+"','"+s_twitter+"','"+s_instagram+"','"+s_comentario+"','"+n_id_empresa+"','"+n_id_direccion+"','"+dt_sysmodtime+"','"+s_sysmoduser+"','"+n_sysmodcount+"')";
        
            declaracion = this.oBaseDato.getConexion().createStatement();
            
            declaracion.executeUpdate(sql);
            sMsj="El Contacto fue registrado satisfactoriamente, con el Id: "+oContacto.getnId();
        }
        catch(SQLException e)
        {
            sMsj= "El Contacto no fue registrado";
        }
        
        return sMsj;
    }
    
    public String sqlregistrarContacto(Contacto oContacto, Empresa oEmpresa, Direccion oDireccion){
        
        String sMsjC = new String();
        String sMsjE = new String();
        String sMsjD = new String();
        String sMsjFinal = new String();
        
        long n_id_empresa			 = oEmpresa.getnId();
        String s_nombre				 = oEmpresa.getsNombredeEmpresa();
        String n_telefof			 = oEmpresa.getsTelefonoOficina();
        String n_fax				 = oEmpresa.getsFaxOficina();
        String s_correo				 = oEmpresa.getsCorreoEmpresa();
        String s_pweb				 = oEmpresa.getsPaginaWeb();
        java.util.Date dt_sysmodtime = oEmpresa.getdtSysModTime();
        String s_sysmoduser			 = oEmpresa.getsSysModUser();
        String n_sysmodcount		 = oEmpresa.getsSysModCount();
                
        try
        {
            this.oBaseDato.conectarToSCS();
            String sql = null;
            Statement declaracion = null;
                       
            sql= "INSERT INTO scs.empresas (n_id, s_nombre, n_telefof, n_fax, s_correo, s_pweb, dt_sysmodtime, s_sysmoduser, n_sysmodcount)" +
                         "VALUES('"+n_id_empresa+"','"+s_nombre+"','"+n_telefof+"','"+n_fax+"','"+s_correo+"','"+s_pweb+"','"+dt_sysmodtime+"','"+s_sysmoduser+"','"+n_sysmodcount+"')";
        
            declaracion = this.oBaseDato.getConexion().createStatement();
            
            declaracion.executeUpdate(sql);
            sMsjE="E";
        }
        catch(SQLException e)
        {
            sMsjE= "La Empresa no fue actualizado.";
        }
        
        long n_id_direccion = oDireccion.getnId();
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
            //this.oBaseDato.conectar();
            String sql = null;
            Statement declaracion = null;
                       
            sql= "INSERT INTO scs.direcciones (n_id, s_pais, s_estado, s_municipio, s_despart, s_provin, s_parroq, s_sector, s_caavca, s_casaedi, s_piso, n_numcasa, s_prefer, dt_sysmodtime, s_sysmoduser, n_sysmodcount)" +
                         "VALUES('"+n_id_direccion+"','"+s_pais+"','"+s_estado+"','"+s_municipio+"','"+s_despart+"','"+s_provin+"','"+s_parroq+"','"+s_sector+"','"+s_caavca+"','"+s_casaedi+"','"+s_piso+"','"+n_numcasa+"','"+s_prefer+"','"+dt_sysmodtime+"','"+s_sysmoduser+"','"+n_sysmodcount+"')";
        
            declaracion = this.oBaseDato.getConexion().createStatement();
            
            declaracion.executeUpdate(sql);
            sMsjD="D";
        }
        catch(SQLException e)
        {
            sMsjD= "La Direccion no fue registrado.";
        }
        
        long n_id_contacto           = oContacto.getnId();
        String n_cedula              = oContacto.getsCedula();
        String n_rif                 = oContacto.getsRif();
        String s_usuariosis          = oContacto.getsUsuarioSis();
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
            //this.oBaseDato.conectar();
            String sql = null;
            Statement declaracion = null;
            
            sql= "INSERT INTO scs.contactos (n_id, n_cedula, n_rif, s_usuariosis, s_pnombre, s_snombre, s_papellido, s_sapellido, n_edad, s_correo, n_telefmo, n_telefof, s_tipodocumento, dt_fechanaci, s_sexo, s_medicotra, s_cargo, s_profesi, s_nacionali, s_estadocivil, s_jefedirec, s_usujefedirec, n_cedulajefe, s_twitter, s_instagram, s_comentario, n_id_empresa, n_id_direccion, dt_sysmodtime, s_sysmoduser, n_sysmodcount)" +
                         "VALUES('"+n_id_contacto+"','"+n_cedula+"','"+n_rif+"',NULLIF('"+s_usuariosis+"',''),'"+s_pnombre+"','"+s_snombre+"','"+s_papellido+"','"+s_sapellido+"','"+n_edad+"','"+s_correo_contacto+"','"+n_telefmo+"','"+n_telefof_contacto+"','"+s_tipodocumento+"','"+dt_fechanaci+"','"+s_sexo+"','"+s_medicotra+"','"+s_cargo+"','"+s_profesi+"','"+s_nacionali+"','"+s_estadocivil+"','"+s_jefedirec+"','"+s_usujefedirec+"','"+n_cedulajefe+"','"+s_twitter+"','"+s_instagram+"','"+s_comentario+"','"+n_id_empresa+"','"+n_id_direccion+"','"+dt_sysmodtime+"','"+s_sysmoduser+"','"+n_sysmodcount+"')";
        
            declaracion = this.oBaseDato.getConexion().createStatement();
            
            declaracion.executeUpdate(sql);
            sMsjC="C";
        }
        catch(SQLException e)
        {
            sMsjC= "El Contacto no fue registrado.";
        }
        
        if(sMsjC.equals("C") && sMsjE.equals("E") && sMsjD.equals("D")) {
        	sMsjFinal="El Paciente "+oContacto.getsPrimerNombre()+" , "+oContacto.getsPrimerApellido()+" fue registrado satisfactoriamente.";
        }
        else {
        	sMsjFinal="El Paciente no fue actualizado.";
        	
        	//Recordar eliminar los registros en este else si falla alguno de los registros.
        }
        
        return sMsjFinal;
    }
    
    public String sqlregistrarDireccion(Direccion oDireccion){
        
        String sMsj = new String();
        
        long n_id					 = oDireccion.getnId();
        String s_pais				 = oDireccion.getsPais();
        String s_estado				 = oDireccion.getsEstado();
        String s_municipio			 = oDireccion.getsMunicipio();
        String s_despart			 = oDireccion.getsDespartamento();
        String s_provin				 = oDireccion.getsProvincia();
        String s_parroq				 = oDireccion.getsParroquia();
        String s_sector				 = oDireccion.getsSector();
        String s_caavca				 = oDireccion.getsCalleoAv();
        String s_casaedi			 = oDireccion.getsCasaoEdif();
        String s_piso				 = oDireccion.getsPiso();
        int n_numcasa				 = oDireccion.getnNumerodeCasa();
        String s_prefer				 = oDireccion.getsPuntodeReferencia();
        java.util.Date dt_sysmodtime = oDireccion.getdtSysModTime();
        String s_sysmoduser 		 = oDireccion.getsSysModUser();
        String n_sysmodcount 		 = oDireccion.getsSysModCount();
        
        try
        {
            this.oBaseDato.conectarToSCS();
            String sql = null;
            Statement declaracion = null;
                       
            sql= "INSERT INTO scs.direcciones (n_id, s_pais, s_estado, s_municipio, s_despart, s_provin, s_parroq, s_sector, s_caavca, s_casaedi, s_piso, n_numcasa, s_prefer, dt_sysmodtime, s_sysmoduser, n_sysmodcount)" +
                         "VALUES('"+n_id+"','"+s_pais+"','"+s_estado+"','"+s_municipio+"','"+s_despart+"','"+s_provin+"','"+s_parroq+"','"+s_sector+"','"+s_caavca+"','"+s_casaedi+"','"+s_piso+"','"+n_numcasa+"','"+s_prefer+"','"+dt_sysmodtime+"','"+s_sysmoduser+"','"+n_sysmodcount+"')";
        
            declaracion = this.oBaseDato.getConexion().createStatement();
            
            declaracion.executeUpdate(sql);
            sMsj="La Direccion fue registrada satisfactoriamente, con el Id: "+oDireccion.getnId();
        }
        catch(SQLException e)
        {
            sMsj= "La Direccion no fue registrada";
        }
        
        return sMsj;
    }
    
    public String sqlregistrarEmpresa(Empresa oEmpresa){
        
        String sMsj = new String();
        
        long n_id					 = oEmpresa.getnId();
        String s_nombre				 = oEmpresa.getsNombredeEmpresa();
        String n_telefof			 = oEmpresa.getsTelefonoOficina();
        String n_fax				 = oEmpresa.getsFaxOficina();
        String s_correo				 = oEmpresa.getsCorreoEmpresa();
        String s_pweb				 = oEmpresa.getsPaginaWeb();
        java.util.Date dt_sysmodtime = oEmpresa.getdtSysModTime();
        String s_sysmoduser			 = oEmpresa.getsSysModUser();
        String n_sysmodcount		 = oEmpresa.getsSysModCount();
        
        try
        {
            this.oBaseDato.conectarToSCS();
            String sql = null;
            Statement declaracion = null;
                       
            sql= "INSERT INTO scs.empresas (n_id, s_nombre, n_telefof, n_fax, s_correo, s_pweb, dt_sysmodtime, s_sysmoduser, n_sysmodcount)" +
                         "VALUES('"+n_id+"','"+s_nombre+"','"+n_telefof+"','"+n_fax+"','"+s_correo+"','"+s_pweb+"','"+dt_sysmodtime+"','"+s_sysmoduser+"','"+n_sysmodcount+"')";
        
            declaracion = this.oBaseDato.getConexion().createStatement();
            
            declaracion.executeUpdate(sql);
            sMsj="La Empresa fue registrada satisfactoriamente, con el Id: "+oEmpresa.getnId();
        }
        catch(SQLException e)
        {
            sMsj= "La Empresa no fue registrada";
        }
        
        return sMsj;
    }
    
    public String sqlregistrarHistoria(Historia oHistoia){
        
        String sMsj = new String();
        
        long n_id = oHistoia.getnId();
        Date dt_fechaconsul = oHistoia.getdtFechaConsulta();
        String s_moticonsul = oHistoia.getsMotivoConsulta();
        String s_anteceenferme = oHistoia.getsAntecedentesEnfermedad();
        String s_antehedofamil = oHistoia.getsAntecedentesHeredofamiliar();
        boolean b_padresvivos = oHistoia.isbPadresVivos();
        boolean b_padresfalle = oHistoia.isbPadresFallecidos();
        String s_causaspapfalle = oHistoia.getsCausasPadresFallecido();
        boolean b_hermasvivos = oHistoia.isbHermanosVivos();
        boolean b_hemasfallec = oHistoia.isbHemanosFallecidos();
        String s_causasherfalle = oHistoia.getsCausasHermanosFallecidos();
        boolean b_hijosvivos = oHistoia.isbHijosVivos();
        boolean b_hijosfalle = oHistoia.isbHijosFallecidos();
        String s_causashijfalle = oHistoia.getsCausasHijosFallecidos();
        boolean b_famidiabetes = oHistoia.isbFamiliaresDiabetes();
        boolean b_famihiperten = oHistoia.isbFamiliaresHipertension();
        boolean b_famitubercul = oHistoia.isbFamiliaresTuberculosis();
        boolean b_famigenelar = oHistoia.isbFamiliaresGemelar();
        String s_otrasfamienfer = oHistoia.getsOtrasEnfermedadesfamiliares();
        boolean b_habialcohol = oHistoia.isbHabitoAlcohol();
        boolean b_habitabaco = oHistoia.isbHabitoTabaco();
        boolean b_habidrogas = oHistoia.isbHabitoDrogas();
        boolean b_patodiabet = oHistoia.isbPatologiaDiabete();
        boolean b_patohipert = oHistoia.isbPatologiaHipertension();
        boolean b_patotuberc = oHistoia.isbPatoligiaTuberculosis();
        String s_otraspatoenfer = oHistoia.getsOtrasPatologiaEnfermedades();
        String s_cirugiperso = oHistoia.getsCirugiasPersonales();
        String s_traumasperso = oHistoia.getsTraumasPersonales();
        String s_alergiaperso = oHistoia.getsAlergiasPersonales();
        String s_otrasenferperso = oHistoia.getsOtrasEnfermedadesPersonales();
        boolean b_embarazo = oHistoia.isbEmbarazo();
        String s_impregeneralfisi = oHistoia.getsImpresionGeneralFisica();
        String s_sigvitalfc = oHistoia.getsSignoVitalFrecuenciaCardiaca();
        String s_sigvitalta = oHistoia.getsSignoVitalTensionArterial();
        String s_sigvitalrf = oHistoia.getsSignoVitalFrecuenciaRespiratoria();
        String s_sigvitalpul = oHistoia.getsSignoVitalPulso();
        String s_sigvitaltaux = oHistoia.getsSignoVitalTensionAxilar();
        String s_sigvitaltrectal = oHistoia.getsSignoVitalTesionRectal();
        String n_pesohabi = oHistoia.getnPesoHabitual();
        String n_pesoactual = oHistoia.getnPesoActual();
        String n_talla = oHistoia.getnTalla();
        String n_imc = oHistoia.getnIMC();
        String s_diagnost = oHistoia.getsDiagnostico();
        String s_tratamie = oHistoia.getsTratamiento();
        String s_comengenerales = oHistoia.getsComentariosGenerales();
        long n_id_contacto_paciente = oHistoia.getnId_Contacto_Paciente();
        long n_id_contacto_doctor = oHistoia.getnId_Contacto_Doctor();
        Date dt_sysmodtime = oHistoia.getdtSysModTime();
        String s_sysmoduser = oHistoia.getsSysModUser();
        String n_sysmodcount = oHistoia.getnSysModCount();
        
        try
        {
            this.oBaseDato.conectarToSCS();
            String sql = null;
            Statement declaracion = null;
                       
            sql= "INSERT INTO scs.historias (n_id, dt_fechaconsul, s_moticonsul, s_anteceenferme, s_antehedofamil, b_padresvivos, b_padresfalle, s_causaspapfalle, b_hermasvivos, b_hemasfallec, s_causasherfalle, b_hijosvivos, b_hijosfalle, s_causashijfalle, b_famidiabetes, b_famihiperten, b_famitubercul, b_famigenelar, s_otrasfamienfer, b_habialcohol, b_habitabaco, b_habidrogas, b_patodiabet, b_patohipert, b_patotuberc, s_otraspatoenfer, s_cirugiperso, s_traumasperso, s_alergiaperso, s_otrasenferperso, b_embarazo, s_impregeneralfisi, s_sigvitalfc, s_sigvitalta, s_sigvitalrf, s_sigvitalpul, s_sigvitaltaux, s_sigvitaltrectal, n_pesohabi, n_pesoactual, n_talla, n_imc, s_diagnost, s_tratamie, s_comengenerales, n_id_contacto_paciente, n_id_contacto_doctor, dt_sysmodtime, s_sysmoduser, n_sysmodcount)" +
                         "VALUES('"+n_id+"','"+dt_fechaconsul+"','"+s_moticonsul+"','"+s_anteceenferme+"','"+s_antehedofamil+"','"+b_padresvivos+"','"+b_padresfalle+"','"+s_causaspapfalle+"','"+b_hermasvivos+"','"+b_hemasfallec+"','"+s_causasherfalle+"','"+b_hijosvivos+"','"+b_hijosfalle+"','"+s_causashijfalle+"','"+b_famidiabetes+"','"+b_famihiperten+"','"+b_famitubercul+"','"+b_famigenelar+"','"+s_otrasfamienfer+"','"+b_habialcohol+"','"+b_habitabaco+"','"+b_habidrogas+"','"+b_patodiabet+"','"+b_patohipert+"','"+b_patotuberc+"','"+s_otraspatoenfer+"','"+s_cirugiperso+"','"+s_traumasperso+"','"+s_alergiaperso+"','"+s_otrasenferperso+"','"+b_embarazo+"','"+s_impregeneralfisi+"','"+s_sigvitalfc+"','"+s_sigvitalta+"','"+s_sigvitalrf+"','"+s_sigvitalpul+"','"+s_sigvitaltaux+"','"+s_sigvitaltrectal+"','"+n_pesohabi+"','"+n_pesoactual+"','"+n_talla+"','"+n_imc+"','"+s_diagnost+"','"+s_tratamie+"','"+s_comengenerales+"','"+n_id_contacto_paciente+"','"+n_id_contacto_doctor+"','"+dt_sysmodtime+"','"+s_sysmoduser+"','"+n_sysmodcount+"')";
        
            declaracion = this.oBaseDato.getConexion().createStatement();
            
            declaracion.executeUpdate(sql);
            sMsj="La Historia fue registrado satisfactoriamente, con el Id: "+oHistoia.getnId();
        }
        catch(SQLException e)
        {
            sMsj= "La Historia no fue registrado";
        }
        
        return sMsj;
    }
 
    public String sqlregistrarInforme(Informe oInforme){
        
        String sMsj = new String();
        
        long n_id = oInforme.getnId();
        Date dt_fechainforme = oInforme.getdtFechaInforme();
        String s_notivoconsulta = oInforme.getsMotivoConsulta();
        String s_diagnost = oInforme.getsDiagnostico();
        String s_esturealizado = oInforme.getsEstudioRealizado();
        String s_tratamie = oInforme.getsTratamiento();
        boolean b_incapatemp = oInforme.isbIncapacidadTemporal();
        Date dt_iniincatemp = oInforme.getdtInicioIncapacidadTemporal();
        Date dt_finincatemp = oInforme.getdtFinIncapacidadTemporal();
        boolean b_incapatotal = oInforme.isbIncapacidadTotal();
        long n_id_contacto_paciente = oInforme.getnId_Contacto_Paciente();
        long n_id_contacto_doctor = oInforme.getnId_Contacto_Doctor();
        Date dt_sysmodtime = oInforme.getdtSysModTime();
        String s_sysmoduser = oInforme.getsSysModUser();
        String n_sysmodcount = oInforme.getnSysModCount();
        
        try
        {
            this.oBaseDato.conectarToSCS();
            String sql = null;
            Statement declaracion = null;
                       
            sql= "INSERT INTO scs.informes (n_id, dt_fechainforme, s_notivoconsulta, s_diagnost, s_esturealizado, s_tratamie, b_incapatemp, dt_iniincatemp, dt_finincatemp, b_incapatotal, n_id_contacto_paciente, n_id_contacto_doctor, dt_sysmodtime, s_sysmoduser, n_sysmodcount)" +
                         "VALUES('"+n_id+"','"+dt_fechainforme+"','"+s_notivoconsulta+"','"+s_diagnost+"','"+s_esturealizado+"','"+s_tratamie+"','"+b_incapatemp+"','"+dt_iniincatemp+"','"+dt_finincatemp+"','"+b_incapatotal+"','"+n_id_contacto_paciente+"','"+n_id_contacto_doctor+"','"+dt_sysmodtime+"','"+s_sysmoduser+"','"+n_sysmodcount+"')";
        
            declaracion = this.oBaseDato.getConexion().createStatement();
            
            declaracion.executeUpdate(sql);
            sMsj="El Informe fue registrado satisfactoriamente, con el Id: "+oInforme.getnId();
        }
        catch(SQLException e)
        {
            sMsj= "El Informe no fue registrado";
        }
        
        return sMsj;
    }
    
    public String sqlregistrarOperador(Operador oOperador){
        
        String sMsj = new String();
        
        long n_id = oOperador.getnId();
        String s_usuariosis = oOperador.getsUsuarioSistema();
        String s_pnombre = oOperador.getsPrimerNombre();
        String s_snombre = oOperador.getsSegundoNombre();
        String s_papellido = oOperador.getsPrimerApellido();
        String s_sapellido = oOperador.getsSegundoApellido();
        String s_correo = oOperador.getsCorreo();
        String n_telefof = oOperador.getsTelefonoOficina();
        String s_contras = oOperador.getsContrasena();
        Date dt_ultimahora = oOperador.getdtUltimaHoraAcceso();
        long n_id_empresa = oOperador.getnId_Empresa();
        long n_id_contacto = oOperador.getnId_Contacto();
        boolean b_activo = oOperador.getbActivo();
        Date dt_sysmodtime = oOperador.getdtSysModTime();
        String s_sysmoduser = oOperador.getsSysModUser();
        String n_sysmodcount = oOperador.getsSysModCount();
        
        
        try
        {
            this.oBaseDato.conectarToSCS();
            String sql = null;
            Statement declaracion = null;
                       
            sql= "INSERT INTO scs.operadores (n_id, s_usuariosis, s_pnombre, s_snombre, s_papellido, s_sapellido, s_correo, n_telefof, s_contras, dt_ultimahora, n_id_empresa, n_id_contacto, b_activo, dt_sysmodtime, s_sysmoduser, n_sysmodcount)" +
                         "VALUES('"+n_id+"','"+s_usuariosis+"','"+s_pnombre+"','"+s_snombre+"','"+s_papellido+"','"+s_sapellido+"','"+s_correo+"','"+n_telefof+"','"+s_contras+"','"+dt_ultimahora+"','"+n_id_empresa+"','"+n_id_contacto+"','"+b_activo+"','"+dt_sysmodtime+"','"+s_sysmoduser+"','"+n_sysmodcount+"')";
        
            declaracion = this.oBaseDato.getConexion().createStatement();
            
            declaracion.executeUpdate(sql);
            sMsj="El Operador fue registrado satisfactoriamente, con el Id: "+oOperador.getnId();
        }
        catch(SQLException e)
        {
            sMsj= "El Operador no fue registrado";
        }
        
        return sMsj;
    }
    
    public String sqlregistrarPresupuesto(Presupuesto oPresupuesto){
        
        String sMsj = new String();
        
        long n_id = oPresupuesto.getnId();
        Date dt_fpresupuesto = oPresupuesto.getDtFpresupuesto();
        String s_fkpaciente_usuariosis = oPresupuesto.getsFkPaciente_Usuariosis();
        String s_fkdoctor_usuariosis = oPresupuesto.getsFkDoctor_Usuariosis();
        double n_subtotal = oPresupuesto.getnSubtotal();
        double n_impuesto = oPresupuesto.getnImpuesto();
        double n_total = oPresupuesto.getnTotal();
        
        Date dt_sysmodtime = oPresupuesto.getdtSysModTime();
        String s_sysmoduser = oPresupuesto.getsSysModuser();
        String n_sysmodcount = oPresupuesto.getnSysModCount();
        
        String sql = null;
        try
        {
            this.oBaseDato.conectarToSCS();
            
            Statement declaracion = null;
                       
            sql= "INSERT INTO scs.presupuestos (n_id, dt_fpresupuesto, s_fkpaciente_usuariosis, s_fkdoctor_usuariosis, n_subtotal, n_impuesto, n_total, dt_sysmodtime, s_sysmoduser, n_sysmodcount)" +
                         "VALUES('"+n_id+"','"+dt_fpresupuesto+"','"+s_fkpaciente_usuariosis+"','"+s_fkdoctor_usuariosis+"','"+n_subtotal+"','"+n_impuesto+"','"+n_total+"','"+dt_sysmodtime+"','"+s_sysmoduser+"','"+n_sysmodcount+"')";
        
            declaracion = this.oBaseDato.getConexion().createStatement();
            
            declaracion.executeUpdate(sql);
            sMsj="El Presupuesto fue registrado satisfactoriamente, con el Id: "+n_id;
        }
        catch(SQLException e)
        {
            sMsj= "El Presupuesto no fue registrado  "+"Error: "+ e.getMessage()+" "+sql;
        }
        
        return sMsj;
    }
    
    public String sqlregistrarArticulo(Collection<Articulo> aArticulo){
        
        String sMsj = new String();
        for (Articulo oArticulo: aArticulo) {
        	
        	if(!oArticulo.equals(null)) {
        		
        		long n_id = oArticulo.getnId();
                long n_id_presupuesto = oArticulo.getnIdPresupuesto();
                long n_numarticulo = oArticulo.getnNumArticulo();
                String s_desarticulo = oArticulo.getsDesArticulo();
                long n_cantarticulo = oArticulo.getnCantArticulo();
                double n_precio = oArticulo.getnPrecio();
                double n_total = oArticulo.getnTotal();
                
                Date dt_sysmodtime = oArticulo.getdtSysModTime();
                String s_sysmoduser = oArticulo.getsSysModuser();
                String n_sysmodcount = oArticulo.getnSysModCount();
                
                String sql = null;
                try
                {
                    this.oBaseDato.conectarToSCS();
                    
                    Statement declaracion = null;
                               
                    sql= "INSERT INTO scs.articulos (n_id, n_id_presupuesto, n_numarticulo, s_desarticulo, n_cantarticulo, n_precio, n_total, dt_sysmodtime, s_sysmoduser, n_sysmodcount)" +
                                 "VALUES('"+n_id+"','"+n_id_presupuesto+"','"+n_numarticulo+"','"+s_desarticulo+"','"+n_cantarticulo+"','"+n_precio+"','"+n_total+"','"+dt_sysmodtime+"','"+s_sysmoduser+"','"+n_sysmodcount+"')";
                
                    declaracion = this.oBaseDato.getConexion().createStatement();
                    
                    declaracion.executeUpdate(sql);
                    sMsj="El Artiulo fue registrado satisfactoriamente, con el Id: "+n_id;
                }
                catch(SQLException e)
                {
                    sMsj= "El Articulo no fue registrado  "+"Error: "+ e.getMessage()+" "+sql;
                }
        	}
        	            
        }
        
        
        
        return sMsj;
    }
    
    public String sqlregistrarRol(Rol oRol){
        
        String sMsj = new String();
        
        long n_id = oRol.getnId();
        String s_nombre = oRol.getsNombredeRol();
        String s_descri = oRol.getsDescripcion();
        String s_estadop = oRol.getsEstadoPermitido();
        boolean b_actualizar = oRol.isbActualizar();
        boolean b_modificar = oRol.isbModificar();
        boolean b_eliminar = oRol.isbEliminar();
        boolean b_ver = oRol.isbVer();
        boolean b_esadmin = oRol.isbEsAdmin();
        String s_usuariosis_operador = oRol.getsUsusarioSistema_Operador();
        Date dt_sysmodtime = oRol.getdtSysModTime();
        String s_sysmoduser = oRol.getsSysModUser();
        int n_sysmodcount = oRol.getnSysModCount();
        
        
        try
        {
            this.oBaseDato.conectarToSCS();
            String sql = null;
            Statement declaracion = null;
                       
            sql= "INSERT INTO scs.roles (n_id, s_nombre, s_descri, s_estadop, b_actualizar, b_modificar, b_eliminar, b_ver, b_esadmin, s_usuariosis_operador, dt_sysmodtime, s_sysmoduser, n_sysmodcount)" +
                         "VALUES('"+n_id+"','"+s_nombre+"','"+s_descri+"','"+s_estadop+"','"+b_actualizar+"','"+b_modificar+"','"+b_eliminar+"','"+b_ver+"','"+b_esadmin+"','"+s_usuariosis_operador+"','"+dt_sysmodtime+"','"+s_sysmoduser+"','"+n_sysmodcount+"')";
        
            declaracion = this.oBaseDato.getConexion().createStatement();
            
            declaracion.executeUpdate(sql);
            sMsj="El Rol fue registrado satisfactoriamente, con el Id: "+oRol.getnId();
        }
        catch(SQLException e)
        {
            sMsj= "El Rol no fue registrado";
        }
        
        return sMsj;
    }
    
    public String sqlregistrarCita(Cita oCita){
        
        String sMsj = new String();
        
        long n_id = oCita.getnId();
    	long n_inciocita = oCita.getnIniciodeCita();
    	long n_fincita = oCita.getnFindeCita();
    	String s_tipocita = oCita.getsTipodeCita();
    	String s_titulo = oCita.getsTitulodeCita();
    	String s_moticita = oCita.getsMotivodeCita();
        Date dt_sysmodtime = oCita.getdtSysModTime();
        String s_sysmoduser = oCita.getsSysModUser();
        String n_sysmodcount = oCita.getnSysModCount();
        String s_url = oCita.getsUrl();
        String s_usuariosis_contacto_paciente = oCita.getsUsuariosis_Contacto_Paciente();
        String s_usuariosis_contacto_doctor = oCita.getsUsuariosis_Contacto_Doctor();
        
        try
        {
            this.oBaseDato.conectarToSCS();
            String sql = null;
            Statement declaracion = null;
                       
            sql= "INSERT INTO scs.citas (n_id, n_inciocita, n_fincita, s_tipocita, s_titulo, s_moticita, dt_sysmodtime, s_sysmoduser, n_sysmodcount, s_url, s_usuariosis_contacto_paciente, s_usuariosis_contacto_doctor)" +
                         "VALUES('"+n_id+"','"+n_inciocita+"','"+n_fincita+"','"+s_tipocita+"','"+s_titulo+"','"+s_moticita+"','"+dt_sysmodtime+"','"+s_sysmoduser+"','"+n_sysmodcount+"','"+s_url+"','"+s_usuariosis_contacto_paciente+"','"+s_usuariosis_contacto_doctor+"')";
        
            declaracion = this.oBaseDato.getConexion().createStatement();
            
            declaracion.executeUpdate(sql);
            sMsj="La Cita fue registrada satisfactoriamente, con el Id: "+oCita.getnId();
        }
        catch(SQLException e)
        {
            sMsj= "La Cita no fue registrada";
        }
        
        return sMsj;
    }
    
}
