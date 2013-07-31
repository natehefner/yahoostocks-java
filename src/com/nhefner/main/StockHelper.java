package com.nhefner.main;

import java.util.regex.Pattern;

public class StockHelper {
	
	public StockHelper() {
		
	}
	
	public double checkDouble(String x) {
		Double y;
		if (Pattern.matches("N/A", x)) {  
			y = 0.00;   
		} else { 
			y = Double.parseDouble(x);  
		}  
		return y;
	}
	
	public int checkInt(String x) {
		int y;
		if (Pattern.matches("N/A", x)) {  
			y = 0;   
		} else { 
			y = Integer.parseInt(x);  
		} 
		return y;
	}

}
