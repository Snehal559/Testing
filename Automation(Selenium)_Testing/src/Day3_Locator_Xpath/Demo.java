package Day3_Locator_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {

	
public static void main(String[] args) {
	System.out.println("Xpath-Locator");
	System.setProperty("webdriver.chrome.driver","F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("F:\\Software Testing\\Practice\\index (1).html"); //index html path
	
	//driver.manage().window().maximize();
	
	//******************Absolute Xpath ::************************
	
	//find login button
	//driver.findElement(By.xpath("/html/body/form/div[1]/button")).sendKeys("CJC");
	
	//find username  in our index html page
	//driver.findElement(By.xpath("/html/body/form/div[1]/input[1]"));
	
	//find password  in our index html page
		//driver.findElement(By.xpath("/html/body/form/div[1]/input[2]"));
	
	//****************Relative Xpath******************************
		//1. find dropdown
		//driver.findElement(By.xpath("//select [@id='browser']"));	
		
		//2.find username
		//driver.findElement(By.xpath("//input[1] [@id='uid']"));
		
		//find login button
		//driver.findElement(By.xpath("//button [@id='login']"));
		
	//****************Dynamic Xpath- Parent***********************
		//find dropdown
		//driver.findElement(By.xpath("//option/parent ::select"));
		
	//*********************child********************************
		//find username
		driver.findElement(By.xpath("//div[1] /child ::input[1]"));
}
}
