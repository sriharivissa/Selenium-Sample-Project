package Screenshot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import webdriver.setup;

import org.apache.commons.io.FileUtils;

public class CaptureScreenShot implements setup {
	@Test
	public void tc_1() throws Exception {
		System.setProperty(FIREFOX_KEY, FIREFOX_VALUE);
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.google.com/");
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(srcFile,new File("E:\\Selenium\\Screenshots\\S1.png"));
		
	}

}
