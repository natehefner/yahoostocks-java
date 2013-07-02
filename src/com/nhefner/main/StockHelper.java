package com.nhefner.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

class StockHelper {  
	
	/*
	* Returns a Stock Object that contains info about a specified stock.
	* @param 	symbol the company's stock symbol
	* @return 	a stock object containing info about the company's stock
	* @see Stock
	*/
	static Stock getStock(String symbol) {  
		String sym = symbol.toUpperCase();
		double price = 0.0;
		int volume = 0;
		double pe = 0.0;
		double eps = 0.0;
		double week52low = 0.0;
		double week52high = 0.0;
		double daylow = 0.0;
		double dayhigh = 0.0;
		double movingav50day = 0.0;
		double marketcap = 0.0;
	
		try { 
			
			// Retrieve CSV File
			URL yahoo = new URL("http://finance.yahoo.com/d/quotes.csv?s="+ symbol + "&f=l1vr2ejkghm3j3");
			URLConnection connection = yahoo.openConnection(); 
			InputStreamReader is = new InputStreamReader(connection.getInputStream());
			BufferedReader br = new BufferedReader(is);  
			
			// Parse CSV Into Array
			String line = br.readLine(); 
			String[] stockinfo = line.split(","); 
			
			// Check Our Data
			if (Pattern.matches("N/A", stockinfo[0])) {  
				price = 0.00;   
			} else { 
				price = Double.parseDouble(stockinfo[0]);  
			}  
			
			if (Pattern.matches("N/A", stockinfo[1])) {  
				volume = 0;   
			} else { 
				volume = Integer.parseInt(stockinfo[1]);  
			} 
	  
			if (Pattern.matches("N/A", stockinfo[2])) {  
				pe = 0;   
			} else { 
				pe = Double.parseDouble(stockinfo[2]); 
			}
  
			if (Pattern.matches("N/A", stockinfo[3])) {  
				eps = 0;   
			} else { 
				eps = Double.parseDouble(stockinfo[3]);  
			}
			    
			if (Pattern.matches("N/A", stockinfo[4])) {  
				week52low = 0;   
			} else { 
				week52low = Double.parseDouble(stockinfo[4]);  
			}
			    
			if (Pattern.matches("N/A", stockinfo[5])) {  
				week52high = 0;   
			} else { 
				week52high = Double.parseDouble(stockinfo[5]);   
			}     
			
			if (Pattern.matches("N/A", stockinfo[6])) {  
				daylow = 0;   
			} else { 
				daylow = Double.parseDouble(stockinfo[6]); 
			}
				     
			if (Pattern.matches("N/A", stockinfo[7])) {  
				dayhigh = 0;   
			} else { 
				dayhigh = Double.parseDouble(stockinfo[7]);  
			}   
			
			if (Pattern.matches("N/A - N/A", stockinfo[8])) {  
				movingav50day = 0;   
			} else { 
				movingav50day = Double.parseDouble(stockinfo[8]);  
			}
				     
			if (Pattern.matches("N/A", stockinfo[9])) {  
				marketcap = 0;   
			} else { 
				marketcap = Double.parseDouble(stockinfo[9]);   
			} 
			
		} catch (IOException e) {
			Logger log = Logger.getLogger(StockHelper.class.getName()); 
			log.log(Level.SEVERE, e.toString(), e);
			return null;
		}
		
		return new Stock(sym, price, volume, pe, eps, week52low, week52high, daylow, dayhigh, movingav50day, marketcap);
		
	}
}
