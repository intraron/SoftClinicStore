package com.intraron.softclinicstore.core.handlers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.security.web.authentication.logout.SimpleUrlLogoutSuccessHandler;

//import com.mandala.commons.beans.User;
import com.intraron.softclinicstore.entidad.Operador;

/**
 * Clase que realiza el manejo del deslogueo de los usuarios en la aplicacion
 * 
 * @author 
 *
 */
public class CustomLogoutSuccessHandler extends SimpleUrlLogoutSuccessHandler implements LogoutSuccessHandler {

	/*
	 * (non-Javadoc)
	 * @see org.springframework.security.web.authentication.logout.SimpleUrlLogoutSuccessHandler#onLogoutSuccess(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, org.springframework.security.core.Authentication)
	 */
	@Override
	public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
		response.sendRedirect("/softclinicstore/irLogin3?logout");
		Operador userBean = (Operador) authentication.getPrincipal();
		request.getSession().removeAttribute(userBean.getsContrasena());
		
		Cookie cookie = new Cookie("JSESSIONID", null);
		cookie.setSecure(true);
		cookie.setPath("/softclinicstore");
		cookie.setMaxAge(0);
		response.addCookie(cookie);
		request.getSession().invalidate();

		super.onLogoutSuccess(request, response, authentication);
	}

}
