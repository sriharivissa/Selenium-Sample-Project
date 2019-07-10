package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateAccountTest {

	@Test
	public void tc_1() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Downloads\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");

		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("HD@mailinator.com");
		driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"id_gender1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).sendKeys("VISA");
		driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys("SRIHARI");
		driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("Hari@9691");

		WebElement ele=driver.findElement(By.xpath("//*[@id=\"days\"]"));
		Select s= new Select(ele);
		s.selectByIndex(19);
	
		WebElement months=driver.findElement(By.xpath("//*[@id=\"months\"]"));
		Select month= new Select(months);
		month.selectByIndex(12);
		
		WebElement years=driver.findElement(By.xpath("//*[@id=\"years\"]"));
		Select year = new Select(years);
		year.selectByValue("1995");
		driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("1st street,Venkatareddy nagar,Nellore");
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Nellore");
		WebElement state= driver.findElement(By.xpath("//*[@id=\"id_state\"]"));
		Select states=new Select(state);
		states.selectByVisibleText("Florida");
		driver.findElement(By.xpath("//*[@id=\"postcode\"]")).sendKeys("00000");
		
		WebElement country= driver.findElement(By.xpath("//*[@id=\"id_country\"]"));
		Select countries=new Select(country);
		countries.selectByVisibleText("United States");
		driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]")).sendKeys("9966349691");
		driver.findElement(By.xpath("//*[@id=\"alias\"]")).sendKeys("1st street,Venkatareddy nagar,Nellore");
		driver.findElement(By.xpath("//*[@id=\"submitAccount\"]")).click();;
		Thread.sleep(2000);
		
		driver.close();
	}
}
