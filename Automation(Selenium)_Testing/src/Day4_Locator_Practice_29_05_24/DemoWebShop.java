package Day4_Locator_Practice_29_05_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {

	public static void main(String[] args) {
		System.out.println("Test-Locators");
		System.setProperty("webdriver.chrome.driver", "F:\\\\Software Testing\\\\cromedriver-seleniumTesting\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		/*WebElement we=*/
		driver.findElement(By.id("gender-female")).click();
		//we.sendKeys("F");
		//driver.findElement(By.xpath("//input[1][@class[2]='text-box single-line']")).sendKeys("ABC");//relative xpath
		driver.findElement(By.xpath("html/body/div/div/div/div/form/div/div/div/div/div/input")).sendKeys("ABC");//Absolute Xpath
		driver.findElement(By.id("LastName")).sendKeys("XYZ");
		//driver.findElement(By.xpath("input[@data-val-email='Wrong email']")).sendKeys("s@gmail.com");//relative xpath
		//driver.findElement(By.tagName("data-val-email")).sendKeys("s@gmail.com");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[4]/input")).sendKeys("abc@gmail.com");	
		//driver.findElement(By.id("Password")).sendKeys("@123");
		
	}
}
