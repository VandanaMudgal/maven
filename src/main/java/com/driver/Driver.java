package com.driver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Driver {
	String path;
	public static WebDriver driver;
	@BeforeSuite
	public void Open_Browser()
	{
		path=System.setProperty("webdriver.chrome.driver", "E:\\selenium-java-3.141.59\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@AfterSuite
	public void Close()
	{
		driver.close();
	}

}
