package com.intraron.softclinicstore.entidad;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
*
* @author intraron
* @date 22-07-2017
*/
public class Cita {
	
	private long nId; //n_id
	private long nIniciodeCita; //n_inciocita 
	private long nFindeCita; //n_fincita
	private String sTipodeCita; //s_tipocita
	private String sTitulodeCita; //s_titulo
	private String sMotivodeCita; //s_moticita
    private Date dtSysModTime = new Date(); //dt_sysmodtime
    private String sSysModUser; //s_sysmoduser
    private String nSysModCount; //n_sysmodcount
    private String sUrl; //s_url
    private String sUsuariosis_Contacto_Paciente; //s_usuariosis_contacto_paciente
    private String sUsuariosis_Contacto_Doctor; //s_usuariosis_contacto_doctor
    
	
    public Cita() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cita(long nId, long nIniciodeCita, long nFindeCita, String sTipodeCita, String sTitulodeCita,
			String sMotivodeCita, Date dtSysModTime,
			String sSysModUser, String nSysModCount, String sUrl,
			String sUsuariosis_Contacto_Paciente, String sUsuariosis_Contacto_Doctor) {
		super();
		this.nId = nId;
		this.nIniciodeCita = nIniciodeCita;
		this.nFindeCita = nFindeCita;
		this.sTipodeCita = sTipodeCita;
		this.sTitulodeCita = sTitulodeCita;
		this.sMotivodeCita = sMotivodeCita;
		this.dtSysModTime = dtSysModTime;
		this.sSysModUser = sSysModUser;
		this.nSysModCount = nSysModCount;
		this.sUrl = sUrl;
		this.sUsuariosis_Contacto_Paciente = sUsuariosis_Contacto_Paciente;
		this.sUsuariosis_Contacto_Doctor = sUsuariosis_Contacto_Doctor;
	}
	
	public String getsUrl() {
		return sUrl;
	}

	public void setsUrl(String sUrl) {
		this.sUrl = sUrl;
	}

	public long getnId() {
		return nId;
	}

	public void setnId(long nId) {
		this.nId = nId;
	}

	public long getnIniciodeCita() {
		return nIniciodeCita;
	}

	public void setnIniciodeCita(long nIniciodeCita) {
		this.nIniciodeCita = nIniciodeCita;
	}
	
	public void setnIniciodeCita(String nIniciodeCita) {
		
		Calendar oCalendar = Calendar.getInstance();
		SimpleDateFormat fomato = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

		try {
			
			Date fechaInicio = fomato.parse(nIniciodeCita);
			oCalendar.setTime(fechaInicio);
			Long resultado = oCalendar.getTimeInMillis();
						
			this.nIniciodeCita = resultado;
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.nIniciodeCita = 32;
		}		
	}

	public long getnFindeCita() {
		return nFindeCita;
	}

	public void setnFindeCita(long nFindeCita) {
		this.nFindeCita = nFindeCita;
	}
	
	public void setnFindeCita(String nFindeCita) {
		
		Calendar oCalendar = Calendar.getInstance();
		SimpleDateFormat fomato = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss"); 

		try {
			
			Date fechaInicio = fomato.parse(nFindeCita);
			oCalendar.setTime(fechaInicio);
			Long resultado = oCalendar.getTimeInMillis();
						
			this.nFindeCita = resultado;
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.nFindeCita = 22;
		}	
	}

	public String getsTipodeCita() {
		return sTipodeCita;
	}

	public void setsTipodeCita(String sTipodeCita) {
		this.sTipodeCita = sTipodeCita;
	}

	public String getsTitulodeCita() {
		return sTitulodeCita;
	}

	public void setsTitulodeCita(String sTitulodeCita) {
		this.sTitulodeCita = sTitulodeCita;
	}

	public String getsMotivodeCita() {
		return sMotivodeCita;
	}

	public void setsMotivodeCita(String sMotivodeCita) {
		this.sMotivodeCita = sMotivodeCita;
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

	
	public String getsUsuariosis_Contacto_Paciente() {
		return sUsuariosis_Contacto_Paciente;
	}
	

	public void setsUsuariosis_Contacto_Paciente(String sUsuariosis_Contacto_Paciente) {
		this.sUsuariosis_Contacto_Paciente = sUsuariosis_Contacto_Paciente;
	}
	

	public String getsUsuariosis_Contacto_Doctor() {
		return sUsuariosis_Contacto_Doctor;
	}
	

	public void setsUsuariosis_Contacto_Doctor(String sUsuariosis_Contacto_Doctor) {
		this.sUsuariosis_Contacto_Doctor = sUsuariosis_Contacto_Doctor;
	}
    
}
