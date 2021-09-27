package com.intraron.softclinicstore.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

public class Util {

	public Util() {
		// TODO Auto-generated constructor stub
	}
	
	public String get_HoradeSistema(HttpServletRequest request) {
		
		Date date=new Date(request.getSession().getCreationTime());
	    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	    String formattedDate=dateFormat.format(date);
	    
	    return formattedDate;
	}
	
	

}
