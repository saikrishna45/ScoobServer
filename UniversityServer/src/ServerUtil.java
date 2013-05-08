package edu.cmpe273.uniserver.util;

import java.util.regex.Pattern;

public class ServerUtil {

	public static final String regexString = "^[A-Za-z]*";
	public static final String regexNumber = "^[0-9]*";
	public static final String regexAlphaNumeric = "^[A-Za-z0-9]*";
	public static final String regexAlphaNumericSpaces = "^[A-Za-z0-9 ]*";
	public static final String regexDate = "([0-9]{2})\\([0-9]{2})\\([0-9]{4})";
	public static final String regexAddress = "^[A-Za-z0-9 #/]*";
	public static final String regexEmail= "^([a-zA-Z0-9_.-])+@([a-zA-Z0-9_.-])+.([a-zA-Z])+([a-zA-Z])+";
	
	public boolean isChar(String input){
		return Pattern.matches(regexString, input);
	}
	
	public boolean isNumber(String input){
		return Pattern.matches(regexNumber, input);
	}
	
	public boolean alphaNumeric(String input){
		return Pattern.matches(regexAlphaNumeric, input);		
	}
	
	public boolean alphaNumericSpaces(String input){
		return Pattern.matches(regexAlphaNumericSpaces, input);		
	}
	
	public boolean isAddress(String input){
		return Pattern.matches(regexAddress, input);	
	}
	
	public boolean isValidEmail(String input){
		return Pattern.matches(regexEmail, input);
	}
	
	public static void  main(String[] a) {
		ServerUtil u = new ServerUtil();
		System.out.println(u.isValidEmail("e@e.in"));
		
	}
}