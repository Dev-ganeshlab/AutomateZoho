package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class Firsttest extends BaseTest {

	
	@Test
	public void login()
	{
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}

	}


