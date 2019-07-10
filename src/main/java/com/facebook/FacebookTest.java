package com.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.webdriver.setup;

public class FacebookTest implements setup {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", FIREFOX_VALUE);
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sriharivissa@gmail.com");;
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Hari@96911");
		driver.close();

	}

}
