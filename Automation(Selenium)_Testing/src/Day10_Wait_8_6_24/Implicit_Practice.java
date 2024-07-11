package Day10_Wait_8_6_24;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Practice {
	public static void main(String[] args) {
		System.out.println("Implicit_Demo");
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().back();
	}

}
