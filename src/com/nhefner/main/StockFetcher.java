package com.nhefner.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;

class StockFetcher {  
	
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
			
			// Handle Our Data
			StockHelper sh = new StockHelper();
			
			price = sh.checkDouble(stockinfo[0]);
			volume = sh.checkInt(stockinfo[1]);
			pe = sh.checkDouble(stockinfo[2]);
			eps = sh.checkDouble(stockinfo[3]);
			week52low = sh.checkDouble(stockinfo[4]);
			week52high = sh.checkDouble(stockinfo[5]);
			daylow = sh.checkDouble(stockinfo[6]);
			dayhigh = sh.checkDouble(stockinfo[7]);   
			movingav50day = sh.checkDouble(stockinfo[8]);
			marketcap = sh.checkDouble(stockinfo[9]);
			
		} catch (IOException e) {
			Logger log = Logger.getLogger(StockFetcher.class.getName()); 
			log.log(Level.SEVERE, e.toString(), e);
			return null;
		}
		
		return new Stock(sym, price, volume, pe, eps, week52low, week52high, daylow, dayhigh, movingav50day, marketcap);
		
	}
}
