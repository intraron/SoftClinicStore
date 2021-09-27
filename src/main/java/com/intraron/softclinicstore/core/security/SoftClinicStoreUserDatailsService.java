package com.intraron.softclinicstore.core.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;


import com.intraron.softclinicstore.control.ControlBuscar;
import com.intraron.softclinicstore.entidad.Operador;

@Component
public class SoftClinicStoreUserDatailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException 
	{
		ControlBuscar oBuscar     = new ControlBuscar();
		Operador oOperador = new Operador();
		
		oOperador = oBuscar.buscarOperador(username); 
			
		return oOperador;
	}
	
	
	
	

}
