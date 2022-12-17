package testcase;

import org.openqa.selenium.By;

import base.BaseTest;

public class MyFirstTestFramework extends BaseTest {
	public static void login()
	{  
		System.out.println("Succesful");
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dmubiru1@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("demubiru");
		driver.findElement(By.xpath("//button[@name='login']")).submit();	
	}
	

}
