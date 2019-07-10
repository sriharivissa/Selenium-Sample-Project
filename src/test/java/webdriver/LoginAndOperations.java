package webdriver;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class LoginAndOperations implements setup{

	@Test
	public static void Login() throws Exception {
		System.setProperty(FIREFOX_KEY, FIREFOX_VALUE);
		WebDriver driver=new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");

		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("HD@mailinator.com");
		driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("Hari@9691");
		driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();

		Actions act=new Actions(driver);
		WebElement WomenElementInthePage=driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a"));
		act.moveToElement(WomenElementInthePage).build().perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[2]/ul/li[3]/a")).click();

		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[1]/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div[1]/p/button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button")).click();
		driver.findElement(By.xpath("//*[@id=\"cgv\"]")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/p/button")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[3]/div[1]/div/p/a")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button	")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p/a")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/table/tbody/tr[1]/td[6]/a")).click();


	}

}
