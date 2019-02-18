package com.Qa.TestBaseDemo;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()
	{
		try
		{
			FileInputStream ip=new FileInputStream("E:\\eclipse_workspace\\com.maven\\src\\main\\java\\com\\facebook\\configuration\\config.properties"); 
				prop=new Properties();
			prop.load(ip);
					
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public static void initialization()
	{
		String browsername=prop.getProperty("browser");
		if(browsername.equalsIgnoreCase("chrome"))
		{
		System.setProperty(prop.getProperty("systemproperty_1"),prop.getProperty("systemproperty_2"));
		driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.NANOSECONDS);
		driver.get(prop.getProperty("url"));
		
	}
	

}
