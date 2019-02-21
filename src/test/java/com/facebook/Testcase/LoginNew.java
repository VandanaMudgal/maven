package com.facebook.Testcase;

import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Qa.TestBaseDemo.TestBase;
import com.facebook.pages.LoginPage;

public class LoginNew extends TestBase {
	
	LoginPage loginpage;
	
	public LoginNew()
	{
		super();
	}
	@BeforeSuite
	public void Setup()
	{
		initialization();
		loginpage= new LoginPage();
	}
	@Test
	public void verifytesttitle()
	{
		String title =loginpage.verifyTitle();
		System.out.println("Title is ::"+title);
	}
	@Test
	public void verifylogintest()
	{
		loginpage.verifyLogin();
	}
	@AfterSuite
	public void close()
	{
		driver.quit();
	}

	

}
