package com.ashish.user.login.commans;

import org.springframework.stereotype.Component;

@Component
public class CommanUtils {
	String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"0123456789"+"abcdefghijklmnopqrstuvxyz"; 
	
	public String generateUniqueKey(int length)
	{
		return generateUniqueRandonString(length);
	}
	public String generateUniqueRandonString(int length) 
    { 
  
        // create StringBuffer size of AlphaNumericString 
        StringBuilder randomString = new StringBuilder(length); 
  
        for (int i = 0; i < length; i++) { 
        	randomString.append(AlphaNumericString.charAt((int)(AlphaNumericString.length()* Math.random())));
        } 
  
        return randomString.toString(); 
    } 
}
