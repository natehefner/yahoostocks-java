Java Stocks 
============

A super simple library to help you retrieve stock data using the Yahoo Finance hidden API. 

## How it works

Yahoo Finance allows stock data to be downloaded in CSV format. All we have to do is take that CSV file and parse it to get our data. Easy. 

## Usage

```java
Stock facebook = StockFetcher.getStock("FB");
```

## Methods 

The library currently supports the following methods: 

```java
getPrice();
getVolume(); 
getPe(); 
getEps(); 
getWeek52high(); 
getWeek52low(); 
getDaylow(); 
getDayhigh(); 
getMovingav50day(); 
getMarketcap();
getName();
getCurrency();
getShortRatio();
getPreviousClose();
getOpen();
getExchange();
```
    
## Testing 

To test the library, run StockTest.java as a jUnit Test. 

## Coming Soon 

* Retrieve Mutliple Stocks at Once
* More Methods 

## Contributors 

Special Thanks To: 

* [erbycfischer](https://github.com/erbycfischer) 
    
## License 

* No Warranty Expressed or Implied. Sofware is as is. 
* [MIT License](http://opensource.org/licenses/mit-license.php) 


