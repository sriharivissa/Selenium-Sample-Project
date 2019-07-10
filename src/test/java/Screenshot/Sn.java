package Screenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import webdriver.setup;

public class Sn  implements setup{
	@Test
	
	public static void tc_1(){
		System.setProperty("WebDriver.gecko.driver", FIREFOX_VALUE);
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		
		
	}

}
