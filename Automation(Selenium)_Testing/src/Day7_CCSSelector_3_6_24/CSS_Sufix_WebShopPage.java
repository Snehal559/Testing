package Day7_CCSSelector_3_6_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Sufix_WebShopPage {
	public static void main(String[] args) {
		System.out.println("Suffix-Practice");
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.cssSelector("input[id$=\"gender-female\"]")).click();
		driver.findElement(By.cssSelector("input[class$='text-box single-line']")).sendKeys("ABC");
		driver.findElement(By.cssSelector("input[id$='LastName']")).sendKeys("MNB");
		driver.findElement(By.cssSelector("input[data-val-email$='Wrong email']")).sendKeys("smdvi@gmail.com");
		driver.findElement(By.cssSelector("input[class$='text-box single-line password']")).sendKeys("ABC@123");
		driver.findElement(By.cssSelector("input[id$='ConfirmPassword']")).sendKeys("ABC@123");
		driver.findElement(By.cssSelector("input[id$='register-button']")).click();
	}

}
