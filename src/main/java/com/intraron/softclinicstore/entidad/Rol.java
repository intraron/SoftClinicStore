/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intraron.softclinicstore.entidad;

import java.util.Collection;
import java.util.Date;
/**
 *
 * @author Nash
 */
public class Rol {
	  
    private long nId; //n_id
    private String sNombredeRol; //s_nombre
    private String sDescripcion; //s_descri
    private String sEstadoPermitido; //s_estadop
    private boolean bActualizar; //b_actualizar
    private boolean bModificar; //b_modificar
    private boolean bEliminar; //b_eliminar
    private boolean bVer; //b_ver
    private boolean bEsAdmin; //b_esadmin
    private String sUsusarioSistema_Operador;//s_usuariosis_operador
    private Date dtSysModTime = new Date(); //dt_sysmodtime
    private String sSysModUser; //s_sysmoduser
    private int nSysModCount; //n_sysmodcount
    private Collection<Rol> cRoles;
	
    public Rol() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rol(long nId, String sNombredeRol, String sDescripcion, String sEstadoPermitido, boolean bActualizar,
			boolean bModificar, boolean bEliminar, boolean bVer, boolean bEsAdmin, String sUsusarioSistema_Operador, 
			Date dtSysModTime, String sSysModUser, int nSysModCount, Collection<Rol> cRoles) {
		super();
		this.nId = nId;
		this.sNombredeRol = sNombredeRol;
		this.sDescripcion = sDescripcion;
		this.sEstadoPermitido = sEstadoPermitido;
		this.bActualizar = bActualizar;
		this.bModificar = bModificar;
		this.bEliminar = bEliminar;
		this.bVer = bVer;
		this.bEsAdmin = bEsAdmin;
		this.sUsusarioSistema_Operador = sUsusarioSistema_Operador;
		this.dtSysModTime = dtSysModTime;
		this.sSysModUser = sSysModUser;
		this.nSysModCount = nSysModCount;
		this.cRoles = cRoles;
	}

	public Collection<Rol> getcRoles() {
		return cRoles;
	}

	public void setcRoles(Collection<Rol> cRoles) {
		this.cRoles = cRoles;
	}
	
	public long getnId() {
		return nId;
	}

	public void setnId(long nId) {
		this.nId = nId;
	}

	public String getsNombredeRol() {
		return sNombredeRol;
	}

	public void setsNombredeRol(String sNombredeRol) {
		this.sNombredeRol = sNombredeRol;
	}

	public String getsDescripcion() {
		return sDescripcion;
	}

	public void setsDescripcion(String sDescripcion) {
		this.sDescripcion = sDescripcion;
	}

	public String getsEstadoPermitido() {
		return sEstadoPermitido;
	}

	public void setsEstadoPermitido(String sEstadoPermitido) {
		this.sEstadoPermitido = sEstadoPermitido;
	}

	public boolean isbActualizar() {
		return bActualizar;
	}

	public void setbActualizar(boolean bActualizar) {
		this.bActualizar = bActualizar;
	}

	public boolean isbModificar() {
		return bModificar;
	}

	public void setbModificar(boolean bModificar) {
		this.bModificar = bModificar;
	}

	public boolean isbEliminar() {
		return bEliminar;
	}

	public void setbEliminar(boolean bEliminar) {
		this.bEliminar = bEliminar;
	}

	public boolean isbVer() {
		return bVer;
	}

	public void setbVer(boolean bVer) {
		this.bVer = bVer;
	}

	public boolean isbEsAdmin() {
		return bEsAdmin;
	}

	public void setbEsAdmin(boolean bEsAdmin) {
		this.bEsAdmin = bEsAdmin;
	}

	public String getsUsusarioSistema_Operador() {
		return sUsusarioSistema_Operador;
	}

	public void setsUsusarioSistema_Operador(String sUsusarioSistema_Operador) {
		this.sUsusarioSistema_Operador = sUsusarioSistema_Operador;
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

	public int getnSysModCount() {
		return nSysModCount;
	}

	public void setnSysModCount(int nSysModCount) {
		this.nSysModCount = nSysModCount;
	}
	
    
}
