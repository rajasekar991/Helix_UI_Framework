package com.helix.team.factory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	public WebDriver driver;
	
	public static ThreadLocal<WebDriver> localDriver = new ThreadLocal<>();
	
	/*
	 * Author: Rajesh Matadh
	 * Purpuse: This will initialize the browser drivers based on browser name
	 */
	public WebDriver initializeDriver(String browserName) throws InterruptedException
	{
		System.out.println("The browser is" +browserName );
		
		if(browserName.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			localDriver.set(new ChromeDriver());
		}else if(browserName.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			localDriver.set(new FirefoxDriver());
		}else if(browserName.equals("IE"))
		{
			WebDriverManager.iedriver().setup();
			localDriver.set(new InternetExplorerDriver());
		}else
		{
			System.out.println("Pass the correct browser name "+browserName);
		}
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		Thread.sleep(3000);
		return getDriver();
	}
	
	/*
	 * Author: Rajesh Matadh
	 * Purpuse: This method is used to get driver with local thread
	 */
	public static synchronized WebDriver getDriver()
	{
		return localDriver.get();
	}
}
