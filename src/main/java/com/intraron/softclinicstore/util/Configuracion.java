package com.intraron.softclinicstore.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Configuracion {
	
	@Value("${valor.user}")
	private String Usuario;
	
	public Configuracion() {
		// TODO Auto-generated constructor stub
	}

	public String getUsuario() {
		return this.Usuario;
	}

	
}
