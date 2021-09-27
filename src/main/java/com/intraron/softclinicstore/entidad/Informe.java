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
public class Informe {
    
    private long nId; //n_id
    private Date dtFechaInforme = new Date(); //dt_fechainforme
    private String sMotivoConsulta; //s_notivoconsulta
    private String sDiagnostico; //s_diagnost
    private String sEstudioRealizado; //s_esturealizado
    private String sTratamiento; //s_tratamie
    private boolean bIncapacidadTemporal; //b_incapatemp
    private Date dtInicioIncapacidadTemporal = new Date(); //dt_iniincatemp
    private Date dtFinIncapacidadTemporal = new Date(); //dt_finincatemp
    private boolean bIncapacidadTotal; //b_incapatotal
    private long nId_Contacto_Paciente; //n_id_contacto_paciente
    private long nId_Contacto_Doctor; //n_id_contacto_doctor
    private Date dtSysModTime = new Date(); //dt_sysmodtime
    private String sSysModUser; //s_sysmoduser
    private String nSysModCount; //n_sysmodcount
	
    public Informe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Informe(long nId, Date dtFechaInforme, String sMotivoConsulta, String sDiagnostico, String sEstudioRealizado,
			String sTratamiento, boolean bIncapacidadTemporal, Date dtInicioIncapacidadTemporal,
			Date dtFinIncapacidadTemporal, boolean bIncapacidadTotal, int nId_Contacto_Paciente,
			int nId_Contacto_Doctor, Date dtSysModTime, String sSysModUser, String nSysModCount) {
		super();
		this.nId = nId;
		this.dtFechaInforme = dtFechaInforme;
		this.sMotivoConsulta = sMotivoConsulta;
		this.sDiagnostico = sDiagnostico;
		this.sEstudioRealizado = sEstudioRealizado;
		this.sTratamiento = sTratamiento;
		this.bIncapacidadTemporal = bIncapacidadTemporal;
		this.dtInicioIncapacidadTemporal = dtInicioIncapacidadTemporal;
		this.dtFinIncapacidadTemporal = dtFinIncapacidadTemporal;
		this.bIncapacidadTotal = bIncapacidadTotal;
		this.nId_Contacto_Paciente = nId_Contacto_Paciente;
		this.nId_Contacto_Doctor = nId_Contacto_Doctor;
		this.dtSysModTime = dtSysModTime;
		this.sSysModUser = sSysModUser;
		this.nSysModCount = nSysModCount;
	}

	public long getnId() {
		return nId;
	}

	public void setnId(long nId) {
		this.nId = nId;
	}

	public Date getdtFechaInforme() {
		return dtFechaInforme;
	}

	public void setdtFechaInforme(Date dtFechaInforme) {
		this.dtFechaInforme = dtFechaInforme;
	}

	public String getsMotivoConsulta() {
		return sMotivoConsulta;
	}

	public void setsMotivoConsulta(String sMotivoConsulta) {
		this.sMotivoConsulta = sMotivoConsulta;
	}

	public String getsDiagnostico() {
		return sDiagnostico;
	}

	public void setsDiagnostico(String sDiagnostico) {
		this.sDiagnostico = sDiagnostico;
	}

	public String getsEstudioRealizado() {
		return sEstudioRealizado;
	}

	public void setsEstudioRealizado(String sEstudioRealizado) {
		this.sEstudioRealizado = sEstudioRealizado;
	}

	public String getsTratamiento() {
		return sTratamiento;
	}

	public void setsTratamiento(String sTratamiento) {
		this.sTratamiento = sTratamiento;
	}

	public boolean isbIncapacidadTemporal() {
		return bIncapacidadTemporal;
	}

	public void setbIncapacidadTemporal(boolean bIncapacidadTemporal) {
		this.bIncapacidadTemporal = bIncapacidadTemporal;
	}

	public Date getdtInicioIncapacidadTemporal() {
		return dtInicioIncapacidadTemporal;
	}

	public void setdtInicioIncapacidadTemporal(Date dtInicioIncapacidadTemporal) {
		this.dtInicioIncapacidadTemporal = dtInicioIncapacidadTemporal;
	}

	public Date getdtFinIncapacidadTemporal() {
		return dtFinIncapacidadTemporal;
	}

	public void setdtFinIncapacidadTemporal(Date dtFinIncapacidadTemporal) {
		this.dtFinIncapacidadTemporal = dtFinIncapacidadTemporal;
	}

	public boolean isbIncapacidadTotal() {
		return bIncapacidadTotal;
	}

	public void setbIncapacidadTotal(boolean bIncapacidadTotal) {
		this.bIncapacidadTotal = bIncapacidadTotal;
	}

	public long getnId_Contacto_Paciente() {
		return nId_Contacto_Paciente;
	}

	public void setnId_Contacto_Paciente(long nId_Contacto_Paciente) {
		this.nId_Contacto_Paciente = nId_Contacto_Paciente;
	}

	public long getnId_Contacto_Doctor() {
		return nId_Contacto_Doctor;
	}

	public void setnId_Contacto_Doctor(long nId_Contacto_Doctor) {
		this.nId_Contacto_Doctor = nId_Contacto_Doctor;
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

	public String getnSysModCount() {
		return nSysModCount;
	}

	public void setnSysModCount(String nSysModCount) {
		this.nSysModCount = nSysModCount;
	}
	
    
}
