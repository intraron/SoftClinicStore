package com.intraron.softclinicstore.servicioRestFull;

import java.util.Collection;
import java.util.LinkedList;

import javax.ws.rs.core.MediaType;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.intraron.softclinicstore.control.ControlBuscar;
import com.intraron.softclinicstore.entidad.Cita;
import com.intraron.softclinicstore.entidad.Contacto;
import com.intraron.softclinicstore.entidad.Direccion;

//http://www.jtech.ua.es/j2ee/publico/spring-2012-13/sesion04-apuntes.html

@Controller
public class ServicioRestFull {
	
	@RequestMapping(value = "/listaeventos.do", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON)
	public ResponseEntity<Collection<Cita>> getCitas(){
		
		Collection<Cita> aCitas = new LinkedList<>();
		ControlBuscar oBuscar = new ControlBuscar();
		
		aCitas = oBuscar.buscarTodasCitas();
								
		return new ResponseEntity<Collection<Cita>>(aCitas, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/contacto.do", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON)
	public ResponseEntity<Contacto> getContacto(@RequestParam("id") String user){
		
		Contacto oContacto = new Contacto();
		ControlBuscar oBuscar = new ControlBuscar();
		
		oContacto = oBuscar.buscarContactoporUsuario(user);
								
		return new ResponseEntity<Contacto>(oContacto, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/direccion.do", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON)
	public ResponseEntity<Direccion> getDireccion(@RequestParam("id") String id){
		
		Direccion oDireccion = new Direccion();
		ControlBuscar oBuscar = new ControlBuscar();
		
		oDireccion = oBuscar.buscarDireccion(id);
								
		return new ResponseEntity<Direccion>(oDireccion, HttpStatus.OK);
	}
	
}
