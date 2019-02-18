package TestCase;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.driver.Driver;

public class TestLogin extends Driver {
	@Test
	public void Login()
	{
		driver.findElement(By.id("email")).sendKeys("vandu@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("admin");
		driver.findElement(By.id("loginbutton")).click();
		driver.navigate().back();
	}
	@Test
	public void Forgotten_Acc()
	{
		driver.findElement(By.linkText("Forgotten account?")).click();
	}

	

}
