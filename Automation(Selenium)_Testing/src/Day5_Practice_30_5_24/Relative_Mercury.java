package Day5_Practice_30_5_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_Mercury {
	public static void main(String[] args) {
		System.out.println("Relative-Xpath-Practice");
		System.setProperty("webdriver.chrome.driver", "F:\\\\Software Testing\\\\cromedriver-seleniumTesting\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("ABC");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("XYZ");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9874563214");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Wakad");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Pune");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Maharastra");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("411052");
		driver.findElement(By.xpath("//select[@name='country']")).sendKeys("India");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("xyz@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("A@123");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("A@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
