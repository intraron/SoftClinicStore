/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intraron.softclinicstore.entidad;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.intraron.softclinicstore.control.ControlBuscar;
import com.intraron.softclinicstore.entidad.Rol;

/**
 *
 * @author Nash
 * @param <SimpleGrantedAuthority>
 */
public class Operador implements UserDetails{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 4452393509711918268L;
	private long nId; //n_id
    private String sUsuarioSistema; //s_usuariosis
    private String sPrimerNombre; //s_pnombre
    private String sSegundoNombre; //s_snombre
    private String sPrimerApellido; //s_papellido
    private String sSegundoApellido; //s_sapellido
    private String sCorreo; //s_correo
    private String sTelefonoOficina; //n_telefof
    private String sContrasena; //s_contras
    private Date dtUltimaHoraAcceso = new Date(); //dt_ultimahora
    private long nId_Empresa; //n_id_empresa
    private long nId_Contacto; //n_id_contacto
    private Date dtSysModTime = new Date(); //dt_sysmodtime
    private String sSysModUser; //s_sysmoduser
    private String sSysModCount; //n_sysmodcount
    private boolean bActivo; //b_activo
	
    public Operador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Operador(int nId, String sUsuarioSistema, String sPrimerNombre, String sSegundoNombre,
			String sPrimerApellido, String sSegundoApellido, String sCorreo, String sTelefonoOficina,
			String sContrasena, Date dtUltimaHoraAcceso, int nId_Empresa, int nId_Contacto, Date dtSysModTime,
			String sSysModUser, String sSysModCount, boolean bActivo) {
		super();
		this.nId = nId;
		this.sUsuarioSistema = sUsuarioSistema;
		this.sPrimerNombre = sPrimerNombre;
		this.sSegundoNombre = sSegundoNombre;
		this.sPrimerApellido = sPrimerApellido;
		this.sSegundoApellido = sSegundoApellido;
		this.sCorreo = sCorreo;
		this.sTelefonoOficina = sTelefonoOficina;
		this.sContrasena = sContrasena;
		this.dtUltimaHoraAcceso = dtUltimaHoraAcceso;
		this.nId_Empresa = nId_Empresa;
		this.nId_Contacto = nId_Contacto;
		this.dtSysModTime = dtSysModTime;
		this.sSysModUser = sSysModUser;
		this.sSysModCount = sSysModCount;
		this.bActivo = bActivo;
	}

	public boolean getbActivo() {
		return bActivo;
	}

	public void setbActivo(boolean bActivo) {
		this.bActivo = bActivo;
	}
	
	public long getnId() {
		return nId;
	}

	public void setnId(long nId) {
		this.nId = nId;
	}

	public String getsUsuarioSistema() {
		return sUsuarioSistema;
	}

	public void setsUsuarioSistema(String sUsuarioSistema) {
		this.sUsuarioSistema = sUsuarioSistema;
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

	public String getsCorreo() {
		return sCorreo;
	}

	public void setsCorreo(String sCorreo) {
		this.sCorreo = sCorreo;
	}

	public String getsTelefonoOficina() {
		return sTelefonoOficina;
	}

	public void setsTelefonoOficina(String sTelefonoOficina) {
		this.sTelefonoOficina = sTelefonoOficina;
	}

	public String getsContrasena() {
		return sContrasena;
	}

	public void setsContrasena(String sContrasena) {
		this.sContrasena = sContrasena;
	}

	public Date getdtUltimaHoraAcceso() {
		return dtUltimaHoraAcceso;
	}

	public void setdtUltimaHoraAcceso(Date dtUltimaHoraAcceso) {
		this.dtUltimaHoraAcceso = dtUltimaHoraAcceso;
	}

	public long getnId_Empresa() {
		return nId_Empresa;
	}

	public void setnId_Empresa(long nId_Empresa) {
		this.nId_Empresa = nId_Empresa;
	}

	public long getnId_Contacto() {
		return nId_Contacto;
	}

	public void setnId_Contacto(long nId_Contacto) {
		this.nId_Contacto = nId_Contacto;
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

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() 
	{
		List<SimpleGrantedAuthority> auths = new java.util.ArrayList<SimpleGrantedAuthority>();
		ControlBuscar oBuscar = new ControlBuscar();
		
		Collection<Rol> usRoles = oBuscar.buscarRolesdeOperador(this.sUsuarioSistema);
		
		for(Rol oRol : usRoles){
			
			String rol = oRol.getsNombredeRol();
			auths.add(new SimpleGrantedAuthority(rol));
		}		
		
		return auths;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return this.sContrasena;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.sUsuarioSistema;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		if(this.bActivo){
			return true;
		}
		else{
			return false;
		}
	}
	
    
   
}
