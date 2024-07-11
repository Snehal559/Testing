package Day17_Junit_And_Assertion;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoGuruDemo {
	static WebDriver driver;
	@BeforeClass
	public static void openbrowser()
	{
		System.out.println("Hello");
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver =new ChromeDriver();
		System.out.println("Open Browser");
		
	}
	@Before
	public void enterurl()
	{
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
	}
	@Test
	public void logincheck()
	{
		driver.findElement(By.name("userName")).sendKeys("Abcde");
		driver.findElement(By.name("password")).sendKeys("Abcd@123");
		driver.findElement(By.cssSelector("input[name='submit']")).click();
		System.out.println("Test method to login check");
	}

}
