package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadFile implements setup{
	public static void main(String[] args) {
		System.setProperty(FIREFOX_KEY, FIREFOX_VALUE);
		String baseUrl = "http://toolsqa.com/automation-practice-form";
        WebDriver driver = new FirefoxDriver();

        driver.get(baseUrl);
        WebElement uploadElement = driver.findElement(By.id("photo"));

        // enter the file path onto the file-selection input field
        uploadElement.sendKeys("C:\\Users\\admin\\Desktop\\New folder\\SRIHARI.jpg");

        // check the "I accept the terms of service" check box
        driver.findElement(By.id("terms")).click();

        // click the "UploadFile" button
        driver.findElement(By.name("send")).click();
		
	}

}
