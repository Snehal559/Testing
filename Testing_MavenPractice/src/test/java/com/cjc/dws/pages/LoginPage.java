package com.cjc.dws.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(css = "a[class='ico-login']")
	WebElement clicklogin;
	@FindBy(css = "input[autofocus='autofocus']")
	WebElement email;
	@FindBy(css="input[name='Password']")
	WebElement pass;
	@FindBy(css ="input[class='button-1 login-button']")
	WebElement lclick;
	
	
	public void loginCheck(String uname,String pas)
	{
		clicklogin.click();
		email.sendKeys(uname);
		pass.sendKeys(pas);
		lclick.click();
	}
	@DataProvider
	public Object [][] getData()
	{
		return new Object[][]
		{
			new Object[]{"snehalvi12345@gmail.com","Ingole1234"},
		};	
	}
	
}
