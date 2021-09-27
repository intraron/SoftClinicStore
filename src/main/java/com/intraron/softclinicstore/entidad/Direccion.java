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
public class Direccion {
    
    private long nId; //n_id
    private String sPais; //s_pais
    private String sEstado; //s_estado
    private String sMunicipio; //s_municipio
    private String sDespartamento; //s_despart
    private String sProvincia; //s_provin
    private String sParroquia; //s_parroq
    private String sSector; //s_sector
    private String sCalleoAv; //s_caavca
    private String sCasaoEdif; //s_casaedi
    private String sPiso; //s_piso
    private int nNumerodeCasa; //n_numcasa
    private String sPuntodeReferencia; //s_prefer
    private java.util.Date dtSysModTime = new Date(); //dt_sysmodtime
    private String sSysModUser; //s_sysmoduser
    private String sSysModCount; //n_sysmodcount
	
    public Direccion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Direccion(long nId, String sPais, String sEstado, String sMunicipio, String sDespartamento, String sProvincia,
			String sParroquia, String sSector, String sCalleoAv, String sCasaoEdif, String sPiso, int nNumerodeCasa,
			String sPuntodeReferencia, Date dtSysModTime, String sSysModUser, String nSysModCount) {
		super();
		this.nId = nId;
		this.sPais = sPais;
		this.sEstado = sEstado;
		this.sMunicipio = sMunicipio;
		this.sDespartamento = sDespartamento;
		this.sProvincia = sProvincia;
		this.sParroquia = sParroquia;
		this.sSector = sSector;
		this.sCalleoAv = sCalleoAv;
		this.sCasaoEdif = sCasaoEdif;
		this.sPiso = sPiso;
		this.nNumerodeCasa = nNumerodeCasa;
		this.sPuntodeReferencia = sPuntodeReferencia;
		this.dtSysModTime = dtSysModTime;
		this.sSysModUser = sSysModUser;
		this.sSysModCount = nSysModCount;
	}

	public long getnId() {
		return nId;
	}

	public void setnId(long nId) {
		this.nId = nId;
	}

	public String getsPais() {
		return sPais;
	}

	public void setsPais(String sPais) {
		this.sPais = sPais;
	}

	public String getsEstado() {
		return sEstado;
	}

	public void setsEstado(String sEstado) {
		this.sEstado = sEstado;
	}

	public String getsMunicipio() {
		return sMunicipio;
	}

	public void setsMunicipio(String sMunicipio) {
		this.sMunicipio = sMunicipio;
	}

	public String getsDespartamento() {
		return sDespartamento;
	}

	public void setsDespartamento(String sDespartamento) {
		this.sDespartamento = sDespartamento;
	}

	public String getsProvincia() {
		return sProvincia;
	}

	public void setsProvincia(String sProvincia) {
		this.sProvincia = sProvincia;
	}

	public String getsParroquia() {
		return sParroquia;
	}

	public void setsParroquia(String sParroquia) {
		this.sParroquia = sParroquia;
	}

	public String getsSector() {
		return sSector;
	}

	public void setsSector(String sSector) {
		this.sSector = sSector;
	}

	public String getsCalleoAv() {
		return sCalleoAv;
	}

	public void setsCalleoAv(String sCalleoAv) {
		this.sCalleoAv = sCalleoAv;
	}

	public String getsCasaoEdif() {
		return sCasaoEdif;
	}

	public void setsCasaoEdif(String sCasaoEdif) {
		this.sCasaoEdif = sCasaoEdif;
	}

	public String getsPiso() {
		return sPiso;
	}

	public void setsPiso(String sPiso) {
		this.sPiso = sPiso;
	}

	public int getnNumerodeCasa() {
		return nNumerodeCasa;
	}

	public void setnNumerodeCasa(int nNumerodeCasa) {
		this.nNumerodeCasa = nNumerodeCasa;
	}

	public String getsPuntodeReferencia() {
		return sPuntodeReferencia;
	}

	public void setsPuntodeReferencia(String sPuntodeReferencia) {
		this.sPuntodeReferencia = sPuntodeReferencia;
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
