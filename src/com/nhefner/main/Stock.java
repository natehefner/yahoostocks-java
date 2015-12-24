package com.nhefner.main;

public class Stock { 
	
	private String symbol; 
	private double price;
	private int volume;
	private double pe;
	private double eps;
	private double week52low;
	private double week52high;
	private double daylow;
	private double dayhigh;
	private double movingav50day;
	private double marketcap;
	private String name;
	private String currency;
	
	public Stock(String symbol, double price, int volume, double pe, double eps, double week52low,      
					double week52high, double daylow, double dayhigh, double movingav50day, double marketcap, String name, String currency) {	
		this.symbol = symbol; 
		this.price = price;	
		this.volume = volume; 
		this.pe = pe; 
		this.eps = eps; 
		this.week52low = week52low; 
		this.week52high = week52high; 
		this.daylow = daylow; 
		this.dayhigh = dayhigh; 
		this.movingav50day = movingav50day; 
		this.marketcap = marketcap;
		this.name = name;
		this.currency = currency;
	} 
	
	public String getCurrency(){
		return this.currency;
	}
	
	public String getSymbol() { 
		return this.symbol;		
	} 
	
	public double getPrice() { 		
		return this.price;		
	} 
	
	public int getVolume() {    
		return this.volume;     
	} 
 
	public double getPe() {    
		return this.pe;     
	} 
  
	public double getEps() { 
		return this.eps;     
	} 
  
	public double getWeek52low() {    
		return this.week52low;    
	} 
  
	public double getWeek52high() {  
		return this.week52high;    
	} 
  
	public double getDaylow() {    
		return this.daylow;    
	} 
  
	public double getDayhigh() {    
		return this.dayhigh;     
	} 
  
	public double getMovingav50day() {     
		return this.movingav50day;  
	} 
  
	public double getMarketcap() { 
		return this.marketcap;
	} 
	
	public String getName(){
		return this.name;
	}
}
