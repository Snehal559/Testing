package Day17_Junit_And_Assertion;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestUrl {
	@Test
	public void m1()
	{
		System.out.println("Test Url");
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//Assert.assertEquals(url, "https://rahulshettyacademy.com/AutomationPracti"); //failure=1 /url wrong
		Assert.assertEquals(url, "https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println("Next Process");
		
	}

	
	/*WebDriver driver;
		@BeforeSuite
		public void openBrowser()
		{
		System.out.println("Hello Selenium");
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\119\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Open Browser");
}
		@BeforeTest
		public void entrUrl()
		{
			driver.get("https://demo.guru99.com/test/newtours/index.php");


		}
@Test
		public void loginCheck()
		{
			driver.findElement(By.name("userName")).sendKeys("QQQQ");
			driver.findElement(By.name("password")).sendKeys("qqqq");
			driver.findElement(By.name("submit")).click();
			System.out.println("Test method to login check");
		}
}*/
}
