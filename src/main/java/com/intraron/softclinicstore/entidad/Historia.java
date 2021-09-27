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
public class Historia {
    
    private long nId; //n_id
    private Date dtFechaConsulta = new Date(); //dt_fechaconsul
    private String sMotivoConsulta; //s_moticonsul
    private String sAntecedentesEnfermedad; //s_anteceenferme
    private String sAntecedentesHeredofamiliar; //s_antehedofamil
    private boolean bPadresVivos; //b_padresvivos
    private boolean bPadresFallecidos; //b_padresfalle
    private String sCausasPadresFallecido; //s_causaspapfalle
    private boolean bHermanosVivos; //b_hermasvivos
    private boolean bHemanosFallecidos; //b_hemasfallec
    private String sCausasHermanosFallecidos; //s_causasherfalle
    private boolean bHijosVivos; //b_hijosvivos
    private boolean bHijosFallecidos; //b_hijosfalle
    private String sCausasHijosFallecidos; //s_causashijfalle
    private boolean bFamiliaresDiabetes; //b_famidiabetes
    private boolean bFamiliaresHipertension; //b_famihiperten
    private boolean bFamiliaresTuberculosis; //b_famitubercul
    private boolean bFamiliaresGemelar; //b_famigenelar
    private String sOtrasEnfermedadesfamiliares; //s_otrasfamienfer
    private boolean bHabitoAlcohol; //b_habialcohol
    private boolean bHabitoTabaco; //b_habitabaco
    private boolean bHabitoDrogas; //b_habidrogas
    private boolean bPatologiaDiabete; //b_patodiabet
    private boolean bPatologiaHipertension; //b_patohipert
    private boolean bPatoligiaTuberculosis; //b_patotuberc
    private String sOtrasPatologiaEnfermedades; //s_otraspatoenfer
    private String sCirugiasPersonales; //s_cirugiperso
    private String sTraumasPersonales; //s_traumasperso
    private String sAlergiasPersonales; //s_alergiaperso
    private String sOtrasEnfermedadesPersonales; //s_otrasenferperso
    private boolean bEmbarazo; //b_embarazo
    private String sImpresionGeneralFisica; //s_impregeneralfisi
    private String sSignoVitalFrecuenciaCardiaca; //s_sigvitalfc
    private String sSignoVitalTensionArterial; //s_sigvitalta
    private String sSignoVitalFrecuenciaRespiratoria; //s_sigvitalrf
    private String sSignoVitalPulso; //s_sigvitalpul
    private String sSignoVitalTensionAxilar; //s_sigvitaltaux
    private String sSignoVitalTesionRectal; //s_sigvitaltrectal
    private String nPesoHabitual; //n_pesohabi
    private String nPesoActual; //n_pesoactual
    private String nTalla; //n_talla
    private String nIMC; //n_imc
    private String sDiagnostico; //s_diagnost
    private String sTratamiento; //s_tratamie
    private String sComentariosGenerales; //s_comengenerales
    private long nId_Contacto_Paciente; //n_id_contacto_paciente
    private long nId_Contacto_Doctor; //n_id_contacto_doctor
    private Date dtSysModTime = new Date(); //dt_sysmodtime
    private String sSysModUser; //s_sysmoduser
    private String nSysModCount; //n_sysmodcount
	
    public Historia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Historia(long nId, Date dtFechaConsulta, String sMotivoConsulta, String sAntecedentesEnfermedad,
			String sAntecedentesHeredofamiliar, boolean bPadresVivos, boolean bPadresFallecidos,
			String sCausasPadresFallecido, boolean bHermanosVivos, boolean bHemanosFallecidos,
			String sCausasHermanosFallecidos, boolean bHijosVivos, boolean bHijosFallecidos,
			String sCausasHijosFallecidos, boolean bFamiliaresDiabetes, boolean bFamiliaresHipertension,
			boolean bFamiliaresTuberculosis, boolean bFamiliaresGemelar, String sOtrasEnfermedadesfamiliares,
			boolean bHabitoAlcohol, boolean bHabitoTabaco, boolean bHabitoDrogas, boolean bPatologiaDiabete,
			boolean bPatologiaHipertension, boolean bPatoligiaTuberculosis, String sOtrasPatologiaEnfermedades,
			String sCirugiasPersonales, String sTraumasPersonales, String sAlergiasPersonales,
			String sOtrasEnfermedadesPersonales, boolean bEmbarazo, String sImpresionGeneralFisica,
			String sSignoVitalFrecuenciaCardiaca, String sSignoVitalTensionArterial,
			String sSignoVitalFrecuenciaRespiratoria, String sSignoVitalPulso, String sSignoVitalTensionAxilar,
			String sSignoVitalTesionRectal, String nPesoHabitual, String nPesoActual, String nTalla, String nIMC,
			String sDiagnostico, String sTratamiento, String sComentariosGenerales, long nId_Contacto_Paciente,
			long nId_Contacto_Doctor, Date dtSysModTime, String sSysModUser, String nSysModCount) {
		super();
		this.nId = nId;
		this.dtFechaConsulta = dtFechaConsulta;
		this.sMotivoConsulta = sMotivoConsulta;
		this.sAntecedentesEnfermedad = sAntecedentesEnfermedad;
		this.sAntecedentesHeredofamiliar = sAntecedentesHeredofamiliar;
		this.bPadresVivos = bPadresVivos;
		this.bPadresFallecidos = bPadresFallecidos;
		this.sCausasPadresFallecido = sCausasPadresFallecido;
		this.bHermanosVivos = bHermanosVivos;
		this.bHemanosFallecidos = bHemanosFallecidos;
		this.sCausasHermanosFallecidos = sCausasHermanosFallecidos;
		this.bHijosVivos = bHijosVivos;
		this.bHijosFallecidos = bHijosFallecidos;
		this.sCausasHijosFallecidos = sCausasHijosFallecidos;
		this.bFamiliaresDiabetes = bFamiliaresDiabetes;
		this.bFamiliaresHipertension = bFamiliaresHipertension;
		this.bFamiliaresTuberculosis = bFamiliaresTuberculosis;
		this.bFamiliaresGemelar = bFamiliaresGemelar;
		this.sOtrasEnfermedadesfamiliares = sOtrasEnfermedadesfamiliares;
		this.bHabitoAlcohol = bHabitoAlcohol;
		this.bHabitoTabaco = bHabitoTabaco;
		this.bHabitoDrogas = bHabitoDrogas;
		this.bPatologiaDiabete = bPatologiaDiabete;
		this.bPatologiaHipertension = bPatologiaHipertension;
		this.bPatoligiaTuberculosis = bPatoligiaTuberculosis;
		this.sOtrasPatologiaEnfermedades = sOtrasPatologiaEnfermedades;
		this.sCirugiasPersonales = sCirugiasPersonales;
		this.sTraumasPersonales = sTraumasPersonales;
		this.sAlergiasPersonales = sAlergiasPersonales;
		this.sOtrasEnfermedadesPersonales = sOtrasEnfermedadesPersonales;
		this.bEmbarazo = bEmbarazo;
		this.sImpresionGeneralFisica = sImpresionGeneralFisica;
		this.sSignoVitalFrecuenciaCardiaca = sSignoVitalFrecuenciaCardiaca;
		this.sSignoVitalTensionArterial = sSignoVitalTensionArterial;
		this.sSignoVitalFrecuenciaRespiratoria = sSignoVitalFrecuenciaRespiratoria;
		this.sSignoVitalPulso = sSignoVitalPulso;
		this.sSignoVitalTensionAxilar = sSignoVitalTensionAxilar;
		this.sSignoVitalTesionRectal = sSignoVitalTesionRectal;
		this.nPesoHabitual = nPesoHabitual;
		this.nPesoActual = nPesoActual;
		this.nTalla = nTalla;
		this.nIMC = nIMC;
		this.sDiagnostico = sDiagnostico;
		this.sTratamiento = sTratamiento;
		this.sComentariosGenerales = sComentariosGenerales;
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

	public Date getdtFechaConsulta() {
		return dtFechaConsulta;
	}

	public void setdtFechaConsulta(Date dtFechaConsulta) {
		this.dtFechaConsulta = dtFechaConsulta;
	}

	public String getsMotivoConsulta() {
		return sMotivoConsulta;
	}

	public void setsMotivoConsulta(String sMotivoConsulta) {
		this.sMotivoConsulta = sMotivoConsulta;
	}

	public String getsAntecedentesEnfermedad() {
		return sAntecedentesEnfermedad;
	}

	public void setsAntecedentesEnfermedad(String sAntecedentesEnfermedad) {
		this.sAntecedentesEnfermedad = sAntecedentesEnfermedad;
	}

	public String getsAntecedentesHeredofamiliar() {
		return sAntecedentesHeredofamiliar;
	}

	public void setsAntecedentesHeredofamiliar(String sAntecedentesHeredofamiliar) {
		this.sAntecedentesHeredofamiliar = sAntecedentesHeredofamiliar;
	}

	public boolean isbPadresVivos() {
		return bPadresVivos;
	}

	public void setbPadresVivos(boolean bPadresVivos) {
		this.bPadresVivos = bPadresVivos;
	}

	public boolean isbPadresFallecidos() {
		return bPadresFallecidos;
	}

	public void setbPadresFallecidos(boolean bPadresFallecidos) {
		this.bPadresFallecidos = bPadresFallecidos;
	}

	public String getsCausasPadresFallecido() {
		return sCausasPadresFallecido;
	}

	public void setsCausasPadresFallecido(String sCausasPadresFallecido) {
		this.sCausasPadresFallecido = sCausasPadresFallecido;
	}

	public boolean isbHermanosVivos() {
		return bHermanosVivos;
	}

	public void setbHermanosVivos(boolean bHermanosVivos) {
		this.bHermanosVivos = bHermanosVivos;
	}

	public boolean isbHemanosFallecidos() {
		return bHemanosFallecidos;
	}

	public void setbHemanosFallecidos(boolean bHemanosFallecidos) {
		this.bHemanosFallecidos = bHemanosFallecidos;
	}

	public String getsCausasHermanosFallecidos() {
		return sCausasHermanosFallecidos;
	}

	public void setsCausasHermanosFallecidos(String sCausasHermanosFallecidos) {
		this.sCausasHermanosFallecidos = sCausasHermanosFallecidos;
	}

	public boolean isbHijosVivos() {
		return bHijosVivos;
	}

	public void setbHijosVivos(boolean bHijosVivos) {
		this.bHijosVivos = bHijosVivos;
	}

	public boolean isbHijosFallecidos() {
		return bHijosFallecidos;
	}

	public void setbHijosFallecidos(boolean bHijosFallecidos) {
		this.bHijosFallecidos = bHijosFallecidos;
	}

	public String getsCausasHijosFallecidos() {
		return sCausasHijosFallecidos;
	}

	public void setsCausasHijosFallecidos(String sCausasHijosFallecidos) {
		this.sCausasHijosFallecidos = sCausasHijosFallecidos;
	}

	public boolean isbFamiliaresDiabetes() {
		return bFamiliaresDiabetes;
	}

	public void setbFamiliaresDiabetes(boolean bFamiliaresDiabetes) {
		this.bFamiliaresDiabetes = bFamiliaresDiabetes;
	}

	public boolean isbFamiliaresHipertension() {
		return bFamiliaresHipertension;
	}

	public void setbFamiliaresHipertension(boolean bFamiliaresHipertension) {
		this.bFamiliaresHipertension = bFamiliaresHipertension;
	}

	public boolean isbFamiliaresTuberculosis() {
		return bFamiliaresTuberculosis;
	}

	public void setbFamiliaresTuberculosis(boolean bFamiliaresTuberculosis) {
		this.bFamiliaresTuberculosis = bFamiliaresTuberculosis;
	}

	public boolean isbFamiliaresGemelar() {
		return bFamiliaresGemelar;
	}

	public void setbFamiliaresGemelar(boolean bFamiliaresGemelar) {
		this.bFamiliaresGemelar = bFamiliaresGemelar;
	}

	public String getsOtrasEnfermedadesfamiliares() {
		return sOtrasEnfermedadesfamiliares;
	}

	public void setsOtrasEnfermedadesfamiliares(String sOtrasEnfermedadesfamiliares) {
		this.sOtrasEnfermedadesfamiliares = sOtrasEnfermedadesfamiliares;
	}

	public boolean isbHabitoAlcohol() {
		return bHabitoAlcohol;
	}

	public void setbHabitoAlcohol(boolean bHabitoAlcohol) {
		this.bHabitoAlcohol = bHabitoAlcohol;
	}

	public boolean isbHabitoTabaco() {
		return bHabitoTabaco;
	}

	public void setbHabitoTabaco(boolean bHabitoTabaco) {
		this.bHabitoTabaco = bHabitoTabaco;
	}

	public boolean isbHabitoDrogas() {
		return bHabitoDrogas;
	}

	public void setbHabitoDrogas(boolean bHabitoDrogas) {
		this.bHabitoDrogas = bHabitoDrogas;
	}

	public boolean isbPatologiaDiabete() {
		return bPatologiaDiabete;
	}

	public void setbPatologiaDiabete(boolean bPatologiaDiabete) {
		this.bPatologiaDiabete = bPatologiaDiabete;
	}

	public boolean isbPatologiaHipertension() {
		return bPatologiaHipertension;
	}

	public void setbPatologiaHipertension(boolean bPatologiaHipertension) {
		this.bPatologiaHipertension = bPatologiaHipertension;
	}

	public boolean isbPatoligiaTuberculosis() {
		return bPatoligiaTuberculosis;
	}

	public void setbPatoligiaTuberculosis(boolean bPatoligiaTuberculosis) {
		this.bPatoligiaTuberculosis = bPatoligiaTuberculosis;
	}

	public String getsOtrasPatologiaEnfermedades() {
		return sOtrasPatologiaEnfermedades;
	}

	public void setsOtrasPatologiaEnfermedades(String sOtrasPatologiaEnfermedades) {
		this.sOtrasPatologiaEnfermedades = sOtrasPatologiaEnfermedades;
	}

	public String getsCirugiasPersonales() {
		return sCirugiasPersonales;
	}

	public void setsCirugiasPersonales(String sCirugiasPersonales) {
		this.sCirugiasPersonales = sCirugiasPersonales;
	}

	public String getsTraumasPersonales() {
		return sTraumasPersonales;
	}

	public void setsTraumasPersonales(String sTraumasPersonales) {
		this.sTraumasPersonales = sTraumasPersonales;
	}

	public String getsAlergiasPersonales() {
		return sAlergiasPersonales;
	}

	public void setsAlergiasPersonales(String sAlergiasPersonales) {
		this.sAlergiasPersonales = sAlergiasPersonales;
	}

	public String getsOtrasEnfermedadesPersonales() {
		return sOtrasEnfermedadesPersonales;
	}

	public void setsOtrasEnfermedadesPersonales(String sOtrasEnfermedadesPersonales) {
		this.sOtrasEnfermedadesPersonales = sOtrasEnfermedadesPersonales;
	}

	public boolean isbEmbarazo() {
		return bEmbarazo;
	}

	public void setbEmbarazo(boolean bEmbarazo) {
		this.bEmbarazo = bEmbarazo;
	}

	public String getsImpresionGeneralFisica() {
		return sImpresionGeneralFisica;
	}

	public void setsImpresionGeneralFisica(String sImpresionGeneralFisica) {
		this.sImpresionGeneralFisica = sImpresionGeneralFisica;
	}

	public String getsSignoVitalFrecuenciaCardiaca() {
		return sSignoVitalFrecuenciaCardiaca;
	}

	public void setsSignoVitalFrecuenciaCardiaca(String sSignoVitalFrecuenciaCardiaca) {
		this.sSignoVitalFrecuenciaCardiaca = sSignoVitalFrecuenciaCardiaca;
	}

	public String getsSignoVitalTensionArterial() {
		return sSignoVitalTensionArterial;
	}

	public void setsSignoVitalTensionArterial(String sSignoVitalTensionArterial) {
		this.sSignoVitalTensionArterial = sSignoVitalTensionArterial;
	}

	public String getsSignoVitalFrecuenciaRespiratoria() {
		return sSignoVitalFrecuenciaRespiratoria;
	}

	public void setsSignoVitalFrecuenciaRespiratoria(String sSignoVitalFrecuenciaRespiratoria) {
		this.sSignoVitalFrecuenciaRespiratoria = sSignoVitalFrecuenciaRespiratoria;
	}

	public String getsSignoVitalPulso() {
		return sSignoVitalPulso;
	}

	public void setsSignoVitalPulso(String sSignoVitalPulso) {
		this.sSignoVitalPulso = sSignoVitalPulso;
	}

	public String getsSignoVitalTensionAxilar() {
		return sSignoVitalTensionAxilar;
	}

	public void setsSignoVitalTensionAxilar(String sSignoVitalTensionAxilar) {
		this.sSignoVitalTensionAxilar = sSignoVitalTensionAxilar;
	}

	public String getsSignoVitalTesionRectal() {
		return sSignoVitalTesionRectal;
	}

	public void setsSignoVitalTesionRectal(String sSignoVitalTesionRectal) {
		this.sSignoVitalTesionRectal = sSignoVitalTesionRectal;
	}

	public String getnPesoHabitual() {
		return nPesoHabitual;
	}

	public void setnPesoHabitual(String nPesoHabitual) {
		this.nPesoHabitual = nPesoHabitual;
	}

	public String getnPesoActual() {
		return nPesoActual;
	}

	public void setnPesoActual(String nPesoActual) {
		this.nPesoActual = nPesoActual;
	}

	public String getnTalla() {
		return nTalla;
	}

	public void setnTalla(String nTalla) {
		this.nTalla = nTalla;
	}

	public String getnIMC() {
		return nIMC;
	}

	public void setnIMC(String nIMC) {
		this.nIMC = nIMC;
	}

	public String getsDiagnostico() {
		return sDiagnostico;
	}

	public void setsDiagnostico(String sDiagnostico) {
		this.sDiagnostico = sDiagnostico;
	}

	public String getsTratamiento() {
		return sTratamiento;
	}

	public void setsTratamiento(String sTratamiento) {
		this.sTratamiento = sTratamiento;
	}

	public String getsComentariosGenerales() {
		return sComentariosGenerales;
	}

	public void setsComentariosGenerales(String sComentariosGenerales) {
		this.sComentariosGenerales = sComentariosGenerales;
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
