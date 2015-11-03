package com.testCases;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	private static WebDriver driver = new FirefoxDriver() ;
	public static WebDriver driver(){
		driver.manage().window().maximize();
		return driver;
		
	}
	//static String url = "http://uptake.com";
	public static void open (String url){
		
		driver.get (url);
		driver.manage().window().maximize();
	}

	public static void close(){
		driver.close();
		driver.quit();
	}

	
	public static void sleep(long time) {
		
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}}
	
	
