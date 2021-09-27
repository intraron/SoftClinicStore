package com.intraron.softclinicstore;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.intraron.softclinicstore.control.ControlBuscar;
import com.intraron.softclinicstore.core.security.SoftClinicStoreUserDatailsService;
import com.intraron.softclinicstore.entidad.Rol;
import com.intraron.softclinicstore.util.Configuracion;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
    private Configuracion appConfig;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletRequest request, HttpServletResponse response, Locale locale, Model model) {
		//logger.info("Welcome home! The client locale is {}.", locale);
        logger.info("This is an info log entry");
       
        logger.error(appConfig.getUsuario());
        		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		SoftClinicStoreUserDatailsService objeto = new SoftClinicStoreUserDatailsService();
		
		UserDetails oOperator = objeto.loadUserByUsername("intraron");
		
		String nombre = oOperator.getUsername();
		String clave = oOperator.getPassword();
		
		
		Collection<? extends GrantedAuthority> lista = oOperator.getAuthorities();
		
		model.addAttribute("nombre", nombre );
		model.addAttribute("clave", clave );
		
		ControlBuscar rolesdato=new ControlBuscar();
		
		
		
		if(rolesdato.buscarRolesdeOperador("intraron").isEmpty())
		{
			model.addAttribute("lista1","  la maldita lista esta sin nada");
		}
		else{
			
			int aux=20;
			for(GrantedAuthority autori : lista)
			{
				String valor = autori.getAuthority();
				model.addAttribute("lista"+aux,valor);
				aux++;
				valor="0";
			}
			
			// est se hizo para probar el otro tipo de arreglo.
			//int aux=20;
			//for(Rol oroles : rolesdato.buscarRolesdeOperador("intraron"))
			//{
				//String valor = oroles.getsNombredeRol();
				//model.addAttribute("lista"+aux,lista);
				//aux++;
				//valor="0";
			//}
			model.addAttribute("lista",lista);
			model.addAttribute("lista2",rolesdato.buscarRolesdeOperador("intraron").size());
			
			
		}
		
		model.addAttribute("serverTime", formattedDate );
		
		Cookie cookie = new Cookie("JSESSIONID", null);
		cookie.setSecure(true);
		cookie.setPath("/softclinicstore");
		cookie.setMaxAge(0);
	
		response.addCookie(cookie);
		request.getSession().invalidate();
		
		return "home";
	}
	
	/*@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView adminPage(Locale locale, Model model) {
		
		ModelAndView modelin = new ModelAndView();
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		
		
		modelin.addObject("title", "Spring Security Hello World");
		modelin.addObject("message", "This is protected page!");
		modelin.setViewName("home");

		return modelin;

	}*/

	
}
