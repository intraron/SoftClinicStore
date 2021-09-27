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
public class Presupuesto {
    
    private long nId; //n_id
    private Date dtFpresupuesto; //dt_fpresupuesto
    private String sFkPaciente_Usuariosis; //s_fkpaciente_usuariosis
    private String sFkDoctor_Usuariosis; //s_fkdoctor_usuariosis
    private double nSubtotal; //n_subtotal 
    private double nImpuesto; //n_impuesto 
    private double nTotal; //n_total	   
    private Date dtSysModTime = new Date(); //dt_sysmodtime
    private String sSysModuser; //s_sysmoduser
    private String nSysModCount; //n_sysmodcount
	
    public Presupuesto() {
		super();
		// TODO Auto-generated constructor stub
	}

	
    public Presupuesto(long nIdPresupuesto, Date dtFpresupuesto, String sFkPaciente_Usuariosis,
			String sFkDoctor_Usuariosis, double nSubtotal, double nImpuesto, double nTotal, Date dtSysModTime,
			String sSysModuser, String nSysModCount) {
		super();
		this.nId = nIdPresupuesto;
		this.dtFpresupuesto = dtFpresupuesto;
		this.sFkPaciente_Usuariosis = sFkPaciente_Usuariosis;
		this.sFkDoctor_Usuariosis = sFkDoctor_Usuariosis;
		this.nSubtotal = nSubtotal;
		this.nImpuesto = nImpuesto;
		this.nTotal = nTotal;
		this.dtSysModTime = dtSysModTime;
		this.sSysModuser = sSysModuser;
		this.nSysModCount = nSysModCount;
	}


	

	public long getnId() {
		return nId;
	}


	public void setnId(long nId) {
		this.nId = nId;
	}


	public Date getDtFpresupuesto() {
		return dtFpresupuesto;
	}


	public void setDtFpresupuesto(Date dtFpresupuesto) {
		this.dtFpresupuesto = dtFpresupuesto;
	}


	public String getsFkPaciente_Usuariosis() {
		return sFkPaciente_Usuariosis;
	}


	public void setsFkPaciente_Usuariosis(String sFkPaciente_Usuariosis) {
		this.sFkPaciente_Usuariosis = sFkPaciente_Usuariosis;
	}


	public String getsFkDoctor_Usuariosis() {
		return sFkDoctor_Usuariosis;
	}


	public void setsFkDoctor_Usuariosis(String sFkDoctor_Usuariosis) {
		this.sFkDoctor_Usuariosis = sFkDoctor_Usuariosis;
	}


	public double getnSubtotal() {
		return nSubtotal;
	}


	public void setnSubtotal(double nSubtotal) {
		this.nSubtotal = nSubtotal;
	}


	public double getnImpuesto() {
		return nImpuesto;
	}


	public void setnImpuesto(double nImpuesto) {
		this.nImpuesto = nImpuesto;
	}


	public double getnTotal() {
		return nTotal;
	}


	public void setnTotal(double nTotal) {
		this.nTotal = nTotal;
	}


	public Date getdtSysModTime() {
		return dtSysModTime;
	}


	public void setdtSysModTime(Date dtSysModTime) {
		this.dtSysModTime = dtSysModTime;
	}


	public String getsSysModuser() {
		return sSysModuser;
	}


	public void setsSysModuser(String sSysModuser) {
		this.sSysModuser = sSysModuser;
	}


	public String getnSysModCount() {
		return nSysModCount;
	}


	public void setnSysModCount(String nSysModCount) {
		this.nSysModCount = nSysModCount;
	}

    
    
}
