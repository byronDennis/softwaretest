package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Mywfw extends BaseTest {
  @Test
  public void f() {
	     
  }
   
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dmubiru1@gmail.com");
	  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("demubiru");
	  driver.findElement(By.xpath("//button[@name='login']")).submit();
	  /*driver.findElement(By.cssSelector("")).submit//input[@id='email']t();*/
	  /*driver.close();*/
  }

  @AfterMethod
  public void afterMethod() {
	  WebDriver driver=new ChromeDriver();
	  driver.close();
  }
}
