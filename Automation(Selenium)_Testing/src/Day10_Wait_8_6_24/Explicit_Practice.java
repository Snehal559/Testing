package Day10_Wait_8_6_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Practice {
	public static void main(String[] args) {
		System.out.println("Explicit_Demo");
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Helloo");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Helloo123");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Snehal@gmail.com");
		WebDriverWait s=new WebDriverWait(driver, 10);
		s.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='reg_email_confirmation__']"))).sendKeys("Snehal@gmail.com");
		
	}

}
