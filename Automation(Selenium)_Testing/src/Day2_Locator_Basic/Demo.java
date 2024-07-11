package Day2_Locator_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {
	public static void main(String[] args) throws Exception {
		System.out.println("Selenium Testing");
		System.setProperty("webdriver.chrome.driver","F:\\\\Software Testing\\\\cromedriver-seleniumTesting\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//By ID-By.id("value");
		WebElement us=driver.findElement(By.id("uid"));
		us.sendKeys("CJC");
		
		//By name
		driver.findElement(By.name("pass")).sendKeys("CJC@1");
		
		//By ClassName
		driver.findElement(By.className("login")).click();
		
		//By TagName
		WebElement dp=driver.findElement(By.tagName("select"));
		Select s=new Select(dp);
		s.selectByIndex(2);
		
		Thread.sleep(2000);
		
		//By LinkText
		driver.findElement(By.linkText("Password?"));
		
		//By partialLinkText
		driver.findElement(By.partialLinkText("Pass")).click();
	}

}
