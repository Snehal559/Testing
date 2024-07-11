package Day18_TestNG;

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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JetStoreDemo {
	WebDriver driver;
	@BeforeSuite
	public void openBrowser()
	{
		System.out.println("hello");
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("*****Browser-Open");
	}
	@BeforeTest
	public void urlopen()
	{
		driver.get("https://jpetstore.aspectran.com/account/newAccountForm");
		System.out.println("****Url Launch");
	}
	@BeforeClass
	public void maximizeWebpage() 
	{
		driver.manage().window().maximize();
		System.out.println("****Maximize Webpage");
	}
	@BeforeMethod
	public void capturedScreenShot()	
	{
		Set<Cookie> cookies=driver.manage().getCookies();
		for (Cookie cookie : cookies) {
		System.out.println(cookie.getName());
		}
		System.out.println("**** Get all Cookies Name");
	}
	@Test	
	public void loginCheck()
	{
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Sne@1");
		driver.findElement(By.xpath("//html/body/section/div[2]/div[2]/div[1]//form/table[1]/tbody/tr[3]/td[2]/input")).sendKeys("Sne@1");
		driver.findElement(By.xpath("//form/table[2]/tbody/tr[3]/preceding-sibling::tr[2]/td[2]/input")).sendKeys("ABC");
		driver.findElement(By.xpath("//form/table[2]/tbody/tr[3]/preceding-sibling::tr[1]/td[2]/input")).sendKeys("XYZ");
		driver.findElement(By.xpath("//form/table[2]/tbody/tr[1]/following-sibling::tr[2]/td[2]/input")).sendKeys("sa@gmail.com");
		driver.findElement(By.xpath("//form/table[2]/tbody/tr[1]/following-sibling::tr[3]/td[2]/input")).sendKeys("9874563214");
		driver.findElement(By.xpath("//form/table[2]/tbody/tr[1]/following-sibling::tr[4]/td[2]/input")).sendKeys("Hinjewadi");
		driver.findElement(By.xpath("//form/table[2]/tbody/tr[1]/following-sibling::tr[5]/td[2]/input")).sendKeys("Wakad");
		driver.findElement(By.xpath("//form/table[2]/tbody/tr[8]/preceding-sibling::*[1]/td[2]/input")).sendKeys("Pune");
		driver.findElement(By.xpath("//form/table[2]/tbody/tr[9]/preceding-sibling::*[1]/td[2]/input")).sendKeys("Maharashtra");
		driver.findElement(By.xpath("//form/table[2]/tbody/tr[8]/following-sibling::*[1]/td[2]/input")).sendKeys("411042");
		driver.findElement(By.xpath("//form/table[2]/tbody/tr[9]/following-sibling::*[1]/td[2]/input")).sendKeys("India");
		driver.findElement(By.xpath("//select[@name='languagePreference']")).sendKeys("English");
		driver.findElement(By.name("favouriteCategoryId")).sendKeys("dog");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@name='bannerOption']")).click();
		driver.findElement(By.xpath("//button[@class='button']")).click();	
		System.out.println("****Test Method to Login Check");
	}
	@AfterMethod
	public void capturScreenshot() throws Exception
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("F:\\Software Testing\\Testing_PDF\\A.png"));
		System.out.println("****Screen Captured");
	}
	@AfterClass
	public void deleteCookie()
	{
		System.out.println("****After Class-DeleteCookie");
	}
	@AfterTest
	public void closeDB()
	{
		System.out.println("****Close DataBase");
	}
	@AfterSuite
	public void closeBrowser()
	{
		System.out.println("Browser Close");
		driver.close();
	}

}
