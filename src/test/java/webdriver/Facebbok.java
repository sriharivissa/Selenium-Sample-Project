package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Facebbok {
	
	@Test
	public static void Fb() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Downloads\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"u_0_j\"]")).sendKeys("venky");
		driver.findElement(By.xpath("//*[@id=\"u_0_r\"]")).sendKeys("venky");
		driver.findElement(By.xpath("")).sendKeys("");
		
		driver.close();

	}

}
