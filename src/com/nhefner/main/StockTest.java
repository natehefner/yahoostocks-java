package com.nhefner.main;

import org.junit.Test;

public class StockTest { 
	
	@Test
	public void testStock() { 
		
		Stock facebook = StockFetcher.getStock("FB");
		System.out.println("Price: " + facebook.getPrice());
		System.out.println("Volume: " + facebook.getVolume()); 
		System.out.println("P/E: " + facebook.getPe());
		System.out.println("EPS: " + facebook.getEps());
		System.out.println("Year Low: " + facebook.getWeek52low());
		System.out.println("Year High: " + facebook.getWeek52high());
		System.out.println("Day Low: " + facebook.getDaylow());
		System.out.println("Day High: " + facebook.getDayhigh());
		System.out.println("50 Day Moving Av: " + facebook.getMovingav50day());
		System.out.println("Market Cap: " + facebook.getMarketcap());
		System.out.println("The full name is: " + facebook.getName());
		System.out.println("The currency is: " + facebook.getCurrency());
		System.out.println("The short ratio is: " + facebook.getShortRatio());
		System.out.println("The previous close was: " + facebook.getPreviousClose());
		System.out.println("The open for today was: " + facebook.getOpen());
		System.out.println("The exchange is " + facebook.getExchange());
		
	} 

}
