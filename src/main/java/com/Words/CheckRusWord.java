package com.Words;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckRusWord implements CheckWord {

	Pattern pattern = Pattern.compile("[�-��-�]+");
	
	@Override
	public boolean match(String word) {
		Matcher matcher = pattern.matcher(word);
	    boolean found = matcher.matches();
	    if(found)
	    	return true;
	    else 
	    	return false;
	}

}
