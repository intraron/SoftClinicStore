package com.intraron.softclinicstore.view.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.intraron.softclinicstore.control.ControlBuscar;
import com.intraron.softclinicstore.control.ControlModificar;
import com.intraron.softclinicstore.control.ControlRegistrar;
import com.intraron.softclinicstore.entidad.Articulo;
import com.intraron.softclinicstore.entidad.Cita;
import com.intraron.softclinicstore.entidad.Contacto;
import com.intraron.softclinicstore.entidad.Direccion;
import com.intraron.softclinicstore.entidad.Empresa;
import com.intraron.softclinicstore.entidad.Operador;
import com.intraron.softclinicstore.entidad.Presupuesto;
import com.intraron.softclinicstore.util.Util;

@Controller
public class ControlViewUser {
	
	public Util oUtil = new Util();
	
	/*este llamado es desde la vista para desplegar la vista y cargar el objeto. 
	 * recordar que los inputs deben llamarse igual que los campos de tabla para que se instancie solos*/
	@RequestMapping("/irregistrarPaciente")
    public ModelAndView vistaRegistrarPaciente(){
        
		ModelAndView modelo = new ModelAndView();
		Contacto viewContacto = new Contacto();
		Empresa viewEmpresa =  new Empresa();
		Direccion viewDireccion = new Direccion();
		
		modelo.addObject(viewContacto);
		modelo.addObject(viewEmpresa);
		modelo.addObject(viewDireccion);
		
		//Esto que esta comentado tambien es funcional
    	//ModelAndView modelo = new ModelAndView("/paciente/registrarPaciente", "command", oContato);
    	    	
    	modelo.setViewName("/paciente/registrarPaciente");

    	Operador oOperador = (Operador) SecurityContextHolder.getContext().getAuthentication().getPrincipal();		
		modelo.addObject("accionPagina", "Registro");
		modelo.addObject("tituloPagina", "SCS");

		modelo.addObject("sysUser", oOperador.getsPrimerNombre()+" "+oOperador.getsPrimerApellido());
		
		List<String> aListaProfes = Arrays.asList("Abogados", "Actor", "Administrador", "Analista de investigación de mercado o Especialista en Marketing", "Auditores técnicos y contables", "Bioanalista", "Bloguero", "Capataz de obra", "Carpinteros", "Comunicador Social", "Contador", "Doctor Cirujano", "Economista", "Enfermera", "Ingeniero", "Ingeniero en Sistemas", "locutor", "Odontólogo", "Otro", "Periodista", "Profesor o Docente o Maestro", "Profesores de educación inicial");
		modelo.addObject("aListaProfes", aListaProfes);
    	    	                   
        return modelo;  
    }

	/*este llamado es el del controlador para el formulario cuando se dispara el "acction" aqui va el procesamiento del formulario*/
	@RequestMapping(value="/registrarpaciente", method = RequestMethod.POST)
	public String registrarPaciente(Model model, 
			@Validated @ModelAttribute(value="Direccion") Direccion oDireccion, BindingResult bindingResult1,
			@Validated @ModelAttribute(value="Empresa") Empresa oEmpresa, BindingResult bindingResult2,
			@Validated @ModelAttribute(value="Contacto") Contacto oContacto, BindingResult bindingResult3){
		
		Operador oOperador = (Operador) SecurityContextHolder.getContext().getAuthentication().getPrincipal();		
		model.addAttribute("accionPagina", "Inicio");
		model.addAttribute("tituloPagina", "SCS");

		model.addAttribute("sysUser", oOperador.getsPrimerNombre()+" "+oOperador.getsPrimerApellido());
		
		//Aqui va todo el codigo para registrar registro tabla contacto = paciente
		String pagina = "/sistema/bandejaEntrada";
		//String pagina = /paciente/registrarPaciente"; //antes queri ir a la misma vista.
		
		ControlRegistrar oRegistrar = new ControlRegistrar();
				
		String resMsj=oRegistrar.registrarContacto(oContacto, oEmpresa, oDireccion);
		
		model.addAttribute("mensajeSistema", resMsj);
		return pagina;
	}
	
	@RequestMapping("/irgestionarPaciente")
    public ModelAndView vistaGestinarPaciente(){
        
		ModelAndView modelo = new ModelAndView();
		ControlBuscar oBuscar = new ControlBuscar();
		
		modelo.addObject("listacontactos", oBuscar.buscarTodosContactos());
		modelo.addObject("listasize", oBuscar.buscarTodosContactos().size());
				   	    	
    	modelo.setViewName("/paciente/gestionarPaciente");

    	Operador oOperador = (Operador) SecurityContextHolder.getContext().getAuthentication().getPrincipal();		
		modelo.addObject("accionPagina", "Gestionar");
		modelo.addObject("tituloPagina", "SCS");

		modelo.addObject("sysUser", oOperador.getsPrimerNombre()+" "+oOperador.getsPrimerApellido());
    	    	                   
        return modelo;  
    }
	
	@RequestMapping("/modificarPaciente")
    public ModelAndView vistaModificarPaciente(HttpServletRequest request, @RequestParam("id") long id){
        
		ModelAndView modelo = new ModelAndView();
		ControlBuscar oBuscar = new ControlBuscar();
		Contacto oContacto = new Contacto();
		
    	modelo.setViewName("/paciente/modificarPaciente");
    	
    	oContacto = oBuscar.buscarContactoporId(String.valueOf(id));
    	modelo.addObject("oContacto", oContacto);
    	
    	modelo.addObject("oDireccion", oBuscar.buscarDireccion(String.valueOf(oContacto.getnId_Direccion())));
    	modelo.addObject("oEmpresa", oBuscar.buscarEmpresaporId(String.valueOf(oContacto.getnId_Empresa())));
    	
    	Operador oOperador = (Operador) SecurityContextHolder.getContext().getAuthentication().getPrincipal();		
		modelo.addObject("accionPagina", "Modificar");
		modelo.addObject("tituloPagina", "SCS");

		modelo.addObject("sysUser", oOperador.getsPrimerNombre()+" "+oOperador.getsPrimerApellido());
		
		List<String> aListaProfes = Arrays.asList("Abogados", "Actor", "Administrador", "Analista de investigación de mercado o Especialista en Marketing", "Auditores técnicos y contables", "Bioanalista", "Bloguero", "Capataz de obra", "Carpinteros", "Comunicador Social", "Contador", "Doctor Cirujano", "Economista", "Enfermera", "Ingeniero", "Ingeniero en Sistemas", "locutor", "Odontólogo", "Otro", "Periodista", "Profesor o Docente o Maestro", "Profesores de educación inicial");
		modelo.addObject("aListaProfes", aListaProfes);
    	    	                   
        return modelo;  
    }

	@RequestMapping(value="/modificarpaciente", method = RequestMethod.POST)
	public String actualizarPaciente(Model model, 
			@Validated @ModelAttribute(value="Direccion") Direccion oDireccion, BindingResult bindingResult1,
			@Validated @ModelAttribute(value="Empresa") Empresa oEmpresa, BindingResult bindingResult2,
			@Validated @ModelAttribute(value="Contacto") Contacto oContacto, BindingResult bindingResult3){
		//Aqui va todo el codigo para registrar registro tabla contacto = paciente
		String pagina = "/paciente/gestionarPaciente";
		
		ControlModificar oModificar = new ControlModificar();
				
		String resMsj=oModificar.modificarContacto(oContacto, oEmpresa, oDireccion);
		
		model.addAttribute("accionPagina", "Gestionar");
		model.addAttribute("tituloPagina", "SCS");
		model.addAttribute("mensajeSistema", resMsj);
		
		String accion = new String("false");
		
		if(resMsj.contains("satisfactoriamente")) accion="true";
		model.addAttribute("accion",accion);
		ControlBuscar oBuscar = new ControlBuscar();

		Operador oOperador = (Operador) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		model.addAttribute("sysUser", oOperador.getsPrimerNombre()+" "+oOperador.getsPrimerApellido());
		model.addAttribute("listacontactos", oBuscar.buscarTodosContactos());
		return pagina;
	}
	
	@RequestMapping("/irgestionarCita")
	public ModelAndView vistagestionarCita(HttpServletRequest request) {
		ModelAndView model = new ModelAndView();
		ControlBuscar oBuscar = new ControlBuscar();
		Cita oCita = new Cita();
		
		Operador oOperador = (Operador) SecurityContextHolder.getContext().getAuthentication().getPrincipal();		
		model.addObject("accionPagina", "Registrar");
		model.addObject("tituloPagina", "SCS");

		model.addObject("sysUser", oOperador.getsPrimerNombre()+" "+oOperador.getsPrimerApellido());
		
		model.setViewName("/cita/gestionarCita");
		
		model.addObject("aDoctores", oBuscar.buscarContactoporCargo("Odontólogo"));
		model.addObject("aPacientes", oBuscar.buscarTodosContactos());
		
		model.addObject("oCita", oCita);
		
		return model;
	}

	@RequestMapping(value="/registrarcita", method = RequestMethod.POST)
	public String registrarCita(HttpServletRequest request, Model model, @Validated @ModelAttribute(value="Cita") Cita oCita, BindingResult bindingResult){
		
		Operador oOperador = (Operador) SecurityContextHolder.getContext().getAuthentication().getPrincipal();		
		model.addAttribute("accionPagina", "Registrar");
		model.addAttribute("tituloPagina", "SCS");

		model.addAttribute("sysUser", oOperador.getsPrimerNombre()+" "+oOperador.getsPrimerApellido());
		
		String pagina = "/cita/gestionarCita";
		
		ControlRegistrar oRegistrar = new ControlRegistrar();
		ControlBuscar oBuscar = new ControlBuscar();
		
		oCita.setnIniciodeCita(request.getParameter("nIniciodeCita"));
		oCita.setnFindeCita(request.getParameter("nFindeCita"));
		
		String resMsj = oRegistrar.registrarCita(oCita);
		
		model.addAttribute("mensajeSistema", resMsj);
		
		model.addAttribute("aDoctores", oBuscar.buscarContactoporCargo("Odontólogo"));
		model.addAttribute("aPacientes", oBuscar.buscarTodosContactos());
		
		return pagina;
	}
	
	@RequestMapping("/irregistrarPresupuesto")
	public ModelAndView vistaregistrarPresupuesto(HttpServletRequest request) {
		
		ModelAndView model = new ModelAndView();
		
		Presupuesto oPresupuesto = new Presupuesto();
		ControlBuscar oBuscar = new ControlBuscar();
		
		Operador oOperador = (Operador) SecurityContextHolder.getContext().getAuthentication().getPrincipal();		
		model.addObject("accionPagina", "Registrar");
		model.addObject("tituloPagina", "SCS");

		model.addObject("sysUser", oOperador.getsPrimerNombre()+" "+oOperador.getsPrimerApellido());
		
		model.setViewName("/presupuesto/registrarPresupuesto");
				
		model.addObject("oPresupuesto", oPresupuesto);
		model.addObject("numpresu", oBuscar.buscarIdparaRegistro("presupuestos"));
		model.addObject("horasistema", oUtil.get_HoradeSistema(request));
		model.addObject("correo", oBuscar.get_MensajedeError());
		model.addObject("telefono", "+58-(414) 222-82-14");
		model.addObject("aDoctores", oBuscar.buscarContactoporCargo("Odontólogo"));
		model.addObject("aPacientes", oBuscar.buscarTodosContactos());
		
		return model;
	}
	
	@RequestMapping(value="/registrarpresupuesto", method = RequestMethod.POST)
	public String registrarPresupuesto(HttpServletRequest request, Model model, 
			@Validated @ModelAttribute(value="Presupuesto") Presupuesto oPresupuesto, BindingResult bindingResult1){
		String pagina = "/sistema/bandejaEntrada";
				
		ControlBuscar oBuscar = new ControlBuscar();
		ControlRegistrar oRegistrar = new ControlRegistrar();
		
		oPresupuesto.setDtFpresupuesto(new Date());
		oPresupuesto.setnId(oBuscar.buscarIdparaRegistro("presupuestos"));
		
		long iIdArt = oBuscar.buscarIdparaRegistro("articulos");
		
		String resMsj1 = oRegistrar.registrarPresupuesto(oPresupuesto);
		
		int contador = Integer.parseInt(request.getParameter("count"));
		
		Collection<Articulo> aArticulo = new ArrayList<>();
		
		String s = new String();
				
		for (int i = 1; i<=(contador-1); i++) {			
			
			try {
				Articulo oArticulo = new Articulo();
				
				oArticulo.setnNumArticulo(Integer.parseInt(request.getParameter("numarti"+String.valueOf(i))));
				oArticulo.setsDesArticulo(request.getParameter("descrip"+String.valueOf(i)));
				oArticulo.setnCantArticulo(Integer.parseInt(request.getParameter("cant"+String.valueOf(i))));
				oArticulo.setnPrecio(Double.parseDouble(request.getParameter("preci"+String.valueOf(i))));
				oArticulo.setnTotal(Double.parseDouble(request.getParameter("total"+String.valueOf(i))));
				
				if(i==1)
					oArticulo.setnId(iIdArt);
				else
					oArticulo.setnId(iIdArt+i);				
				
				oArticulo.setnIdPresupuesto(oPresupuesto.getnId());
								
				aArticulo.add(oArticulo);
				
				
			} catch (NumberFormatException e) {
				// TODO: handle exception
				s = e.getMessage();
			}			

		}
		
		String resMsj = "Mensaje Articulo: "+oRegistrar.registrarArticulo(aArticulo) + " - " + resMsj1 + " - contador:" +contador + " -- vector constuido: "+aArticulo.size()+" Mensaje de exception : "+s;
		
		model.addAttribute("mensajeSistema", resMsj);
		
		
		return pagina;		
	}

}
