package Day18_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Mercury_Demo {
	WebDriver driver;
	@BeforeSuite
	  public void openbrowser() {
		System.out.println("Hello");
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver =new ChromeDriver();
		System.out.println("***Open Browser***");
	  }	
	 @BeforeTest
	  public void enterurl() {
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		System.out.println("***URL launch***");
	  }
	 @BeforeClass
	  public void maximizeWebpage() {
		  driver.manage().window().maximize();
		  System.out.println("***Maximize WebPage***");
	  }
	 @BeforeMethod
	  public void cookiesDetails() {
		Set<Cookie> cookies=driver.manage().getCookies();
		for (Cookie cookie : cookies) {
			System.out.println("Cookie Name ="+cookie.getName());
		}
	  }
	 @Test
	  public void loginCheck() {
		 	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("ABCD");
			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("XYZS");
			driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9874563214");
			driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("a2bc@gmail.com");
			driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Wakad");
			driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Pune");
			driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Maharastra");
			driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("411052");
			driver.findElement(By.xpath("//select[@name='country']")).sendKeys("India");
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Axyz@gmail.com");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("A@123");
			driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("A@123");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			System.out.println("***Test method to login check***");
	  }
 
	 @AfterMethod
	 public void captureScreenShot() throws Exception {
		 System.out.println("***After Method Captur ScreenShot***");
		 File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(scr, new File("F:\\Software Testing\\Practice\\teng.png"));
		 System.out.println("***Screen Captured***");
	 }
	 
	@AfterClass
	public void deleteCookies() {
	   System.out.println("***After Class***");
	}
	 
	 @AfterTest
	 public void dbConnectionClose()
		{
			System.out.println("***Database close***");
		}

	 @AfterSuite
	 public void CloseBrowser() {
		 System.out.println("***Close-Browser***");
		 driver.close();
	 }
}




	 /*@BeforeMethod
		public void getCookies()
		{
			Set<Cookie> cookies = driver.manage().getCookies();
			for(Cookie cookie : cookies)
			{
				System.out.println(cookie.getName());
			}

		}
		@Test
		public void loginCheck()
		{
			driver.findElement(By.name("userName")).sendKeys("QQQQ");
			driver.findElement(By.name("password")).sendKeys("qqqq");
			driver.findElement(By.name("submit")).click();
			System.out.println("Test method to login check");
		}
		@AfterMethod
		public void captureScreenshot() throws IOException
		{
			System.out.println("After method capture screen shot");
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File( "C:\\Selenium\\screenshot\\demo987.png"));
			System.out.println("Capture screen");

@AfterTest
		public void dbConnectionClose()
		{
			System.out.println("Database close");
		}
		
		@AfterSuite
		public void CloseBrowser()
		{
			System.out.println("close Browser");
			driver.close();
		}*/

