package com.cjc.dws.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cjc.dws.pages.LoginPage;
import com.cjc.dws.pages.RegisterPage;

public class DemoWebShopTest {
	WebDriver driver;
	Logger log=Logger.getLogger(DemoWebShopTest.class.getName());
	
	  @BeforeSuite
	  public void openbrowser() {
		log.info("Hello");
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver =new ChromeDriver();
		log.info("***Open Browser***");
	  }	
	  @BeforeTest
	  public void enterurl() throws IOException {
		  driver.get("https://demowebshop.tricentis.com/register");
		  log.info("***URL launch***");
	  }
	  @BeforeClass
	  public void maximizeWebpage() {
		  driver.manage().window().maximize();
		  log.info("***Maximize WebPage***");
	  }
	 @BeforeMethod
	  public void cookiesDetails() {
		Set<Cookie> cookies=driver.manage().getCookies();
		int count=cookies.size();
		log.info("Cookies"+count);
	  }
	  @Test(enabled = false)
	 //@Test(priority = 1)
	  public void register() throws Exception
	  {
		  RegisterPage re=PageFactory.initElements(driver, RegisterPage.class);
		  re.registerCheck();
	  }
	/* @Test(priority = 2,dataProvider = "getData")
	 //@Test(priority = 2)
	  public void login(String uname,String pas)
	  {
		  LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
		  lp.loginCheck(uname,pas);
	  }*/
	  @Test(priority = 2)
	  public void login()
	  {
		  LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
		  lp.loginCheck("snehalvi12345@gmail.com","Ingole123");
	  }
	  @AfterMethod
		 public void captureScreenShot() throws Exception {
			 log.info("***After Method Captur ScreenShot***");
			 File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(scr, new File("F:\\Software Testing\\Testing_PDF\\teng.png"));
			 log.info("***Screen Captured***");
		 }
		 
		@AfterClass
		public void deleteCookies() {
			driver.manage().deleteAllCookies();
		    log.info("***After Class***");
		}
		 
		@AfterTest
		 public void dbConnectionClose()
			{
				log.info("***Database close***");
			}

		 @AfterSuite(enabled = false)
		 public void CloseBrowser() {
			 log.info("***Close-Browser***");
			 driver.close();
		 }
	  
}
