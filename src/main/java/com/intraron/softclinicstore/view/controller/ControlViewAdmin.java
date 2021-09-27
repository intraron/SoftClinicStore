package com.intraron.softclinicstore.view.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.intraron.softclinicstore.entidad.Operador;;

@Controller
public class ControlViewAdmin {
	
	@RequestMapping("/irregistraroperador")
    public ModelAndView vistaRegistrarOperador(){
        
    	Operador oOperador  = new Operador();
    	ModelAndView modelo = new ModelAndView("/operador/registrarOperador", "command", oOperador);
                   
        return modelo;  
    }
    
	@RequestMapping(value ="/irregistrarOperador", method = RequestMethod.POST)
	public String registrarOperador(Operador oOperador, Locale locale, Model model){
		//Aqui va todo el codigo para registrar registro tabla operador = usuario del sistema
		
		return "/operador/registrarOperador";
	}


}
