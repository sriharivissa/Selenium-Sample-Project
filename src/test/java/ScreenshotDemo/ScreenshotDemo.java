package ScreenshotDemo;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenshotDemo {



	static WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Downloads\\geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");

	}
	@Test(description="verify sign in link is present or not")
	public void tc_1() {
	Assert.assertTrue((driver.findElement(By.xpath("//*[@class='login']"))).isDisplayed());
	driver.close();

	}
	@Test(description="verify contact us")
	public void tc_2() {
		Assert.assertTrue((driver.findElement(By.xpath("//*[@title='Contact Us']"))).isDisplayed());

	Assert.assertTrue(false);
	}
	@Test(description="click signin and verify it is navigated to appropriate page")
	public void tc_3() {
		driver.findElement(By.xpath("//*[@class='login']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//%[@id='email_create']")).isDisplayed());
	}




}
