/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intraron.softclinicstore.entidad;

import java.util.Date;
/**
 *
 * @author Nash
 */
public class Contacto {
    
    private long nId; //n_id
    private String sCedula; //n_cedula
    private String sRif; //n_rif
    private String sUsuarioSis; //s_usuariosis
    private String sPrimerNombre; //s_pnombre
    private String sSegundoNombre; //s_snombre
    private String sPrimerApellido; //s_papellido
    private String sSegundoApellido; //s_sapellido
    private int nEdad; //n_edad
    private String sCorreo; //s_correo
    private String sTelefMovil; //n_telefmo
    private String sTelefOficina; //n_telefof
    private String sTipoDocumento; //s_tipodocumento
    private Date dtFechaNacimiento = new Date(); //dt_fechanaci
    private String sSexo; //s_sexo
    private String sMedicoTratante; //s_medicotra
    private String sCargo; //s_cargo
    private String sProfesion; //s_profesi
    private String sNacionalidad; //s_nacionali
    private String sEstadoCivil; //s_estadocivil
    private String sJefeDirecto; //s_jefedirec
    private String sUsuarioSisJefe; //s_usujefedirec
    private String sCedulaJefe; //n_cedulajefe
    private String sTwitter; //s_twitter
    private String sInstagram; //s_instagram
    private String sComentario; //s_comentario
    private long nId_Empresa; //n_id_empresa
    private long nId_Direccion; //n_id_direccion
    private Date dtSysModTime = new Date(); //dt_sysmodtime
    private String sSysModUser; //s_sysmoduser
    private String sSysModCount; //n_sysmodcount
	
    public Contacto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contacto(long nId, String sCedula, String sRif, String sUsuarioSis, String sPrimerNombre,
			String sSegundoNombre, String sPrimerApellido, String sSegundoApellido, int nEdad, String sCorreo,
			String sTelefMovil, String sTelefOficina, String sTipoDocumento, Date dtFechaNacimiento, String sSexo,
			String sMedicoTratante, String sCargo, String sProfesion, String sNacionalidad, String sEstadoCivil,
			String sJefeDirecto, String sUsuarioSisJefe, String sCedulaJefe, String sTwitter, String sInstagram,
			String sComentario, long nId_Empresa, long nId_Direccion, Date dtSysModTime, String sSysModUser,
			String sSysModCount) {
		super();
		this.nId = nId;
		this.sCedula = sCedula;
		this.sRif = sRif;
		this.sUsuarioSis = sUsuarioSis;
		this.sPrimerNombre = sPrimerNombre;
		this.sSegundoNombre = sSegundoNombre;
		this.sPrimerApellido = sPrimerApellido;
		this.sSegundoApellido = sSegundoApellido;
		this.nEdad = nEdad;
		this.sCorreo = sCorreo;
		this.sTelefMovil = sTelefMovil;
		this.sTelefOficina = sTelefOficina;
		this.sTipoDocumento = sTipoDocumento;
		this.dtFechaNacimiento = dtFechaNacimiento;
		this.sSexo = sSexo;
		this.sMedicoTratante = sMedicoTratante;
		this.sCargo = sCargo;
		this.sProfesion = sProfesion;
		this.sNacionalidad = sNacionalidad;
		this.sEstadoCivil = sEstadoCivil;
		this.sJefeDirecto = sJefeDirecto;
		this.sUsuarioSisJefe = sUsuarioSisJefe;
		this.sCedulaJefe = sCedulaJefe;
		this.sTwitter = sTwitter;
		this.sInstagram = sInstagram;
		this.sComentario = sComentario;
		this.nId_Empresa = nId_Empresa;
		this.nId_Direccion = nId_Direccion;
		this.dtSysModTime = dtSysModTime;
		this.sSysModUser = sSysModUser;
		this.sSysModCount = sSysModCount;
	}

	public long getnId() {
		return nId;
	}

	public void setnId(long nId) {
		this.nId = nId;
	}

	public String getsCedula() {
		return sCedula;
	}

	public void setsCedula(String sCedula) {
		this.sCedula = sCedula;
	}

	public String getsRif() {
		return sRif;
	}

	public void setsRif(String sRif) {
		this.sRif = sRif;
	}

	public String getsUsuarioSis() {
		return sUsuarioSis;
	}

	public void setsUsuarioSis(String sUsuarioSis) {
		this.sUsuarioSis = sUsuarioSis;
	}

	public String getsPrimerNombre() {
		return sPrimerNombre;
	}

	public void setsPrimerNombre(String sPrimerNombre) {
		this.sPrimerNombre = sPrimerNombre;
	}

	public String getsSegundoNombre() {
		return sSegundoNombre;
	}

	public void setsSegundoNombre(String sSegundoNombre) {
		this.sSegundoNombre = sSegundoNombre;
	}

	public String getsPrimerApellido() {
		return sPrimerApellido;
	}

	public void setsPrimerApellido(String sPrimerApellido) {
		this.sPrimerApellido = sPrimerApellido;
	}

	public String getsSegundoApellido() {
		return sSegundoApellido;
	}

	public void setsSegundoApellido(String sSegundoApellido) {
		this.sSegundoApellido = sSegundoApellido;
	}

	public int getnEdad() {
		return nEdad;
	}

	public void setnEdad(int nEdad) {
		this.nEdad = nEdad;
	}

	public String getsCorreo() {
		return sCorreo;
	}

	public void setsCorreo(String sCorreo) {
		this.sCorreo = sCorreo;
	}

	public String getsTelefMovil() {
		return sTelefMovil;
	}

	public void setsTelefMovil(String sTelefMovil) {
		this.sTelefMovil = sTelefMovil;
	}

	public String getsTelefOficina() {
		return sTelefOficina;
	}

	public void setsTelefOficina(String sTelefOficina) {
		this.sTelefOficina = sTelefOficina;
	}

	public String getsTipoDocumento() {
		return sTipoDocumento;
	}

	public void setsTipoDocumento(String sTipoDocumento) {
		this.sTipoDocumento = sTipoDocumento;
	}

	public Date getdtFechaNacimiento() {
		return dtFechaNacimiento;
	}

	public void setdtFechaNacimiento(Date dtFechaNacimiento) {
				
		this.dtFechaNacimiento = dtFechaNacimiento;
	}

	public String getsSexo() {
		return sSexo;
	}

	public void setsSexo(String sSexo) {
		this.sSexo = sSexo;
	}

	public String getsMedicoTratante() {
		return sMedicoTratante;
	}

	public void setsMedicoTratante(String sMedicoTratante) {
		this.sMedicoTratante = sMedicoTratante;
	}

	public String getsCargo() {
		return sCargo;
	}

	public void setsCargo(String sCargo) {
		this.sCargo = sCargo;
	}

	public String getsProfesion() {
		return sProfesion;
	}

	public void setsProfesion(String sProfesion) {
		this.sProfesion = sProfesion;
	}

	public String getsNacionalidad() {
		return sNacionalidad;
	}

	public void setsNacionalidad(String sNacionalidad) {
		this.sNacionalidad = sNacionalidad;
	}

	public String getsEstadoCivil() {
		return sEstadoCivil;
	}

	public void setsEstadoCivil(String sEstadoCivil) {
		this.sEstadoCivil = sEstadoCivil;
	}

	public String getsJefeDirecto() {
		return sJefeDirecto;
	}

	public void setsJefeDirecto(String sJefeDirecto) {
		this.sJefeDirecto = sJefeDirecto;
	}

	public String getsUsuarioSisJefe() {
		return sUsuarioSisJefe;
	}

	public void setsUsuarioSisJefe(String sUsuarioSisJefe) {
		this.sUsuarioSisJefe = sUsuarioSisJefe;
	}

	public String getsCedulaJefe() {
		return sCedulaJefe;
	}

	public void setsCedulaJefe(String sCedulaJefe) {
		this.sCedulaJefe = sCedulaJefe;
	}

	public String getsTwitter() {
		return sTwitter;
	}

	public void setsTwitter(String sTwitter) {
		this.sTwitter = sTwitter;
	}

	public String getsInstagram() {
		return sInstagram;
	}

	public void setsInstagram(String sInstagram) {
		this.sInstagram = sInstagram;
	}

	public String getsComentario() {
		return sComentario;
	}

	public void setsComentario(String sComentario) {
		this.sComentario = sComentario;
	}

	public long getnId_Empresa() {
		return nId_Empresa;
	}

	public void setnId_Empresa(long nId_Empresa) {
		this.nId_Empresa = nId_Empresa;
	}

	public long getnId_Direccion() {
		return nId_Direccion;
	}

	public void setnId_Direccion(long nId_Direccion) {
		this.nId_Direccion = nId_Direccion;
	}

	public Date getdtSysModTime() {
		return dtSysModTime;
	}

	public void setdtSysModTime(Date dtSysModTime) {
		this.dtSysModTime = dtSysModTime;
	}

	public String getsSysModUser() {
		return sSysModUser;
	}

	public void setsSysModUser(String sSysModUser) {
		this.sSysModUser = sSysModUser;
	}

	public String getsSysModCount() {
		return sSysModCount;
	}

	public void setsSysModCount(String sSysModCount) {
		this.sSysModCount = sSysModCount;
	}
	
   
    
}
