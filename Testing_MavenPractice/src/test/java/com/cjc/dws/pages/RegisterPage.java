package com.cjc.dws.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {
	
	public RegisterPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(xpath = "//input[@id='gender-female']" )
	WebElement gen;
	@FindBy(css = "input[id='FirstName']")
	WebElement fistn;
	@FindBy(css = "input[id='LastName']")
	WebElement lastn;
	@FindBy(css = "input[data-val-required*='Email is required.']")
	WebElement email;
	@FindBy(css = "input[id='Password']")
	WebElement pass;
	@FindBy(css = "input[id='ConfirmPassword']")
	WebElement cpass;
	@FindBy(id = "register-button")
	WebElement sub;
	@FindBy(className = "ico-logout")
	WebElement logout;
	
	WebDriver driver;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sh;
	XSSFRow row;
	XSSFCell fn;
	XSSFCell ln;
	XSSFCell em;
	XSSFCell pas;
	XSSFCell cpas;
	
	
	public void registerCheck() throws Exception
	{
		fis=new FileInputStream("F:\\Software Testing\\Apache_POI_ExcelFile\\DemoOrderMavenRegisterPage.xlsx");
		wb=new XSSFWorkbook(fis);
		sh=wb.getSheet("register");
		row=sh.getRow(1);
		fn=row.getCell(0); //for first name
		ln=row.getCell(1); //for last name
		em=row.getCell(2); //for email
		pas=row.getCell(3); //for password
		cpas=row.getCell(4); //for confirm password	
		String fname=fn.getStringCellValue();
		String lname=ln.getStringCellValue();
		String emai=em.getStringCellValue();
		String passw =fn.getStringCellValue();
		String cpassw=fn.getStringCellValue();
		gen.click();
		fistn.sendKeys(fname);
		lastn.sendKeys(lname);
		email.sendKeys(emai);
		pass.sendKeys(passw);
		cpass.sendKeys(cpassw);
		sub.click();
		logout.click();
	}
}




















