package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest implements setup{
	public static void main(String[] args) {
		System.setProperty(FIREFOX_KEY, FIREFOX_VALUE);
		WebDriver driver=new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		
driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();

		driver.close();
	}

	

}
