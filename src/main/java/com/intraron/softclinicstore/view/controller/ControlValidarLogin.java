package com.intraron.softclinicstore.view.controller;

import java.util.Locale;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.intraron.softclinicstore.HomeController;
import com.intraron.softclinicstore.control.ControlBuscar;
import com.intraron.softclinicstore.entidad.Contacto;
import com.intraron.softclinicstore.entidad.Operador;

@Controller
public class ControlValidarLogin {
	
	private static final Logger logger = LoggerFactory.getLogger(ControlValidarLogin.class);
	
	/*
	@RequestMapping("/irLogin3")
    public ModelAndView vistalogin(){
        
    	Operador oOPerador  = new Operador();
    	ModelAndView modelo = new ModelAndView("/sistema/login3", "command", oOPerador);
                   
        return modelo;  
    }*/
	
	/*@RequestMapping(value ="/BandejaEntrada3......", method = RequestMethod.POST)
    public String prueba(Operador oOperador, Locale locale, Model model){
		
		model.addAttribute("usuario",oOperador.getM_sUsuarioSistema());
		model.addAttribute("password",oOperador.getM_sContrasena());
		
		return "sistema/prueba";
	}*/
	
	//@RequestMapping(value ="/bandejaentrada", method = RequestMethod.POST)
	@RequestMapping(value ="/irLogin3")
    public String ValidarLogin(HttpServletRequest request, HttpServletResponse response, Locale locale, Model model){
               
		model.addAttribute("pageTitle", "Login");
		Cookie cookie = new Cookie("JSESSIONID", null);
		cookie.setSecure(true);
		cookie.setPath("/softclinicstore");
		cookie.setMaxAge(0);
		response.addCookie(cookie);
		request.getSession().invalidate();
		
		logger.info("prueba desde otro controlador");
		
       /* String sMensaje        = new String();
        String sMensajedeError = new String();
        ControlBuscar oBuscar  = new ControlBuscar(); 
        Operador oBDOperador   = new Operador();
         
        try{

        	oBDOperador = oBuscar.buscarOperador(oOperador.getsUsuarioSistema());
        	
        	if(oBDOperador.getsUsuarioSistema().isEmpty()){
        		
        		sMensaje = oBuscar.get_Mensaje();
        		model.addAttribute("sysMsj",sMensaje);
            	return "sistema/login3";
        	}
        	else{
	
	        	if (!oOperador.getsContrasena().equals(oBDOperador.getsContrasena())){
	
	            	sMensaje = "Clave incorecta";
	            	model.addAttribute("sysMsj",sMensaje);
	            	return "sistema/login3";
	            }
	            else{
	            	//pendiente aqui por si no se hace la asignacion completa.
	            	oOperador = oBDOperador;
	            	model.addAttribute("sysUser",oOperador.getsPrimerNombre()+" "+oOperador.getsPrimerApellido());
	            	
	            	ModelAndView modelo = new ModelAndView("/sistema/bandejaEntrada", "command", oOperador);
	            	
	            	return modelo.getViewName();
	                //session.setAttribute("Usuario", oOperador);
	                //response.sendRedirect("bandejaentrada.jsp");
	            }
        	}
        }
        catch(Exception e){
        	
            sMensajedeError="Problemas en el sistema";
            model.addAttribute("errorMsj",sMensajedeError+": "+e.getMessage()+" / "+oBuscar.get_MensajedeError());
        }*/
                
        return "sistema/login3";
    }
	
	@RequestMapping(value = "/irbandeja")
	public String getBandejaEntrada(HttpServletRequest request, Model model){
		
		Operador oOperador = (Operador) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		model.addAttribute("sysUser", oOperador.getsPrimerNombre()+" "+oOperador.getsPrimerApellido());
		model.addAttribute("accionPagina", "Inicio");
		model.addAttribute("tituloPagina", "SCS");
		
		return "sistema/bandejaEntrada";
	}
	
	@RequestMapping(value = "/logout")
	public String logout(HttpServletRequest request, HttpServletResponse response, Model model){
		Cookie cookie = new Cookie("JSESSIONID", null);
		cookie.setSecure(true);
		cookie.setPath("/softclinicstore");
		cookie.setMaxAge(0);
		response.addCookie(cookie);
		request.getSession().invalidate();
				
		return "sistema/login3";
	}
     
    @RequestMapping("/loginDisponible.do")
    public @ResponseBody String loginDisponible(@RequestParam("login") String login) {
        
    	ControlBuscar oBuscar = new ControlBuscar();
    	
    	Contacto oContacto = oBuscar.buscarContactoporUsuario(login);
    	
    	if (oContacto.getsUsuarioSis()==null)
            return "OK";
        else
            return "<span style='font-weight:bold;color:red;'>El nombre de usuario ya existe.</span>";
    }
}
