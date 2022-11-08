package com.accenture.fers.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 *
 *
 * @author MariaApa
 *
 * 
 *
 * This class validates data introduced by the user
 *
 */

public class Validator{

	private final static String EMAIL_PATTERN = "^[A-Za-z0-9-_+]+(.[A-Za-z0-9-]+)*@[.A-Za-z0-9-]+([A-Za-z0-9]+)*(.[A-Za-z]{2,})$";
	private final static String DNI_PATTERN= "[0-9]{8}[A-Z a-z]";
	private static final String PHONE_PATTERN= "^\\d{9}$";
	
	
	public static boolean emailValidator (String email) {
		
		Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		Matcher matcher = pattern.matcher(email);
		
		//if(email.equals("")||email.equals(null)) {
		//	throw new FERSGenericException("Error, el email no puede estar vacío");
		//}
		
		if(matcher.find()) {
			return true;
		}else {
			return false;
		}
		
	}
    
	
	public static boolean dniValidator(String dni){
		
		
		Pattern pat = Pattern.compile(DNI_PATTERN);
		  
		Matcher mat = pat.matcher(dni);
		
		if(mat.find()) {
			return true;
		}else {
			return false;
		}
			  	
	}

	public static boolean phoneValidator(String phone) {
		Pattern p = Pattern.compile(PHONE_PATTERN);
		//Teniendo en cuenta con prefijo
		//"^(\\+\\d{1,3}( )?)?((\\(\\d{1,3}\\))|\\d{1,3})[- .]?\\d{3,4}[- .]?\\d{4}$")"
		Matcher m = p.matcher(phone);
		
		if(m.find()) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean lengthValidator(String campo, int min, int max ) {
		
		boolean result=false;
		
		if(campo.length()<=max&&campo.length()>=min&&!campo.equals("")) {
			result=true;
		}
		
		return result;
	}
	

	/*public static void main(String[] args) {

		
		System.out.println("¿Es válido el dni?");
		System.out.println(Validator.dniValidator("72B"));
		System.out.println("¿Es válido el email?");
		System.out.println(Validator.emailValidator("jsd@shdjs.com"));
		System.out.println("¿Es válido el campo?");
		System.out.println(Validator.lengthValidator("Maria Luque", 10, 5));
		System.out.println("¿Es válido el teléfono?");
		System.out.println(Validator.phoneValidator("123456789"));
	
		
	}
	*/

}
