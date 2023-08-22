package base;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
public static WebDriver driver;
public static Properties prop = new Properties();
public static Properties loc = new Properties();
public static FileInputStream fis;

@BeforeMethod
public  void startup() throws IOException {
	if(driver==null) {
		fis= new FileInputStream(System.getProperty("user.dir") +"\\src\\test\\resources\\configfiles\\prop.properties");
		prop.load(fis);
	}
	
	if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(prop.getProperty("url"));
	}
}
}
