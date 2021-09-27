package com.intraron.softclinicstore.entidad;

import java.util.Date;

public class Articulo {

	private long nId; //n_id_articulo
	private long nIdPresupuesto; //n_id_presupuesto
	private long nNumArticulo; //n_numarticulo
	private String sDesArticulo; //s_desarticulo
	private long nCantArticulo;//n_cantarticulo
	private double nPrecio;//n_precio 
	private double nTotal;//n_total  
	private Date dtSysModTime = new Date(); //dt_sysmodtime
    private String sSysModuser; //s_sysmoduser
    private String nSysModCount; //n_sysmodcount
	
	public Articulo() {
		// TODO Auto-generated constructor stub
	}

	public Articulo(long nIdArticulo, long nIdPresupuesto, long nNumArticulo, String sDesArticulo, long nCantArticulo,
			double nPrecio, double nTotal, Date dtSysModTime, String sSysModuser, String nSysModCount) {
		super();
		this.nId = nIdArticulo;
		this.nIdPresupuesto = nIdPresupuesto;
		this.nNumArticulo = nNumArticulo;
		this.sDesArticulo = sDesArticulo;
		this.nCantArticulo = nCantArticulo;
		this.nPrecio = nPrecio;
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

	public long getnIdPresupuesto() {
		return nIdPresupuesto;
	}

	public void setnIdPresupuesto(long nIdPresupuesto) {
		this.nIdPresupuesto = nIdPresupuesto;
	}

	public long getnNumArticulo() {
		return nNumArticulo;
	}

	public void setnNumArticulo(long nNumArticulo) {
		this.nNumArticulo = nNumArticulo;
	}

	public String getsDesArticulo() {
		return sDesArticulo;
	}

	public void setsDesArticulo(String sDesArticulo) {
		this.sDesArticulo = sDesArticulo;
	}

	public long getnCantArticulo() {
		return nCantArticulo;
	}

	public void setnCantArticulo(long nCantArticulo) {
		this.nCantArticulo = nCantArticulo;
	}

	public double getnPrecio() {
		return nPrecio;
	}

	public void setnPrecio(double nPrecio) {
		this.nPrecio = nPrecio;
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
