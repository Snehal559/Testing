package Day4_Locator_Practice_29_05_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoUniversity {

	public static void main(String[] args) {
		System.out.println("Find Locators");
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
		driver.manage().window().maximize();
		driver.findElement(By.name("first_name")).sendKeys("ABC");//by name
		driver.findElement(By.xpath("//input [@name='last_name']")).sendKeys("ABC@1");//by relative xpath
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
		//driver.findElement(By.xpath("/html/body/div[1]/div/div/selection/div/div[2]/form/input[3]")).sendKeys("abc@gmail.com");//Absolute xpath
		driver.findElement(By.xpath("//form/child ::textarea")).sendKeys("Good");//child
		driver.findElement(By.xpath("//input[@type='submit']")).click(); //by relative xpath
	}
}
