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
public class Empresa {
    
    private long nId; //n_id
    private String sNombredeEmpresa; //s_nombre
    private String sTelefonoOficina; //n_telefof
    private String sFaxOficina; //n_fax
    private String sCorreoEmpresa; //s_correo
    private String sPaginaWeb; //s_pweb
    private java.util.Date dtSysModTime = new Date(); //dt_sysmodtime
    private String sSysModUser; //s_sysmoduser
    private String sSysModCount; //n_sysmodcount
	
    public Empresa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empresa(long nId, String sNombredeEmpresa, String sTelefonoOficina, String sFaxOficina, String sCorreoEmpresa,
			String sPaginaWeb, Date dtSysModTime, String sSysModUser, String sSysModCount) {
		super();
		this.nId = nId;
		this.sNombredeEmpresa = sNombredeEmpresa;
		this.sTelefonoOficina = sTelefonoOficina;
		this.sFaxOficina = sFaxOficina;
		this.sCorreoEmpresa = sCorreoEmpresa;
		this.sPaginaWeb = sPaginaWeb;
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

	public String getsNombredeEmpresa() {
		return sNombredeEmpresa;
	}

	public void setsNombredeEmpresa(String sNombredeEmpresa) {
		this.sNombredeEmpresa = sNombredeEmpresa;
	}

	public String getsTelefonoOficina() {
		return sTelefonoOficina;
	}

	public void setsTelefonoOficina(String sTelefonoOficina) {
		this.sTelefonoOficina = sTelefonoOficina;
	}

	public String getsFaxOficina() {
		return sFaxOficina;
	}

	public void setsFaxOficina(String sFaxOficina) {
		this.sFaxOficina = sFaxOficina;
	}

	public String getsCorreoEmpresa() {
		return sCorreoEmpresa;
	}

	public void setsCorreoEmpresa(String sCorreoEmpresa) {
		this.sCorreoEmpresa = sCorreoEmpresa;
	}

	public String getsPaginaWeb() {
		return sPaginaWeb;
	}

	public void setsPaginaWeb(String sPaginaWeb) {
		this.sPaginaWeb = sPaginaWeb;
	}

	public java.util.Date getdtSysModTime() {
		return dtSysModTime;
	}

	public void setdtSysModTime(java.util.Date dtSysModTime) {
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
