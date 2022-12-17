package base;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
 
	public static WebDriver driver;
	
	/*referencing url page form BaseTest Class framework approach eg. facebook since its called driver*/
	public static Properties prop=new Properties();
	public static FileReader fr;
	public void setup() throws IOException {
		if (driver==null) {
		FileReader fr= new FileReader(System.getProperty("user+dir")+"\\\\src\\\\test\\\\resources\\\\configfiles\\\\config.properties");
		prop.load(fr);
	}
		if (prop.getProperty("browser").equals("chrome")) {
			 WebDriverManager.chromedriver().setup();
			 WebDriver driver=new ChromeDriver();
			 prop.getProperty("testurl");
			prop.load(fr);
		}
		else if (prop.getProperty("browser").equals("firefox")) {
			 WebDriverManager.firefoxdriver().setup();
			 WebDriver driver=new FirefoxDriver();
			/* replaced driver.get("http://facebook.com");*/
			 driver.get("testurl");
			 prop.getProperty("testurl");
			prop.load(fr);			 
	}}
public void teardown() {
		driver.close();
	}
}
