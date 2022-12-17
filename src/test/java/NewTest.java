import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class NewTest extends BaseTest{
  @Test
  public void f() {
	  
	  driver.findElement(By.xpath("")).sendKeys("");
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dmubiru1@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("demubiru");
		driver.findElement(By.xpath("//button[@name='login']")).submit();	
  }
}
