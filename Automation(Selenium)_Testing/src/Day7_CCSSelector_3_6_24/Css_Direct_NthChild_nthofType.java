package Day7_CCSSelector_3_6_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Css_Direct_NthChild_nthofType {
	public static void main(String[] args) {
		System.out.println("Contain-Practice");
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.cssSelector("div.page-body input[id='gender-female']")).click();//directChild use space instead of >
		driver.findElement(By.cssSelector("div.page-body input[id='FirstName']")).sendKeys("mnb");//directChild
		//div.page-body input:nth-of-type[4] /for lastname
		//div.page-body:nth-child[4]
		driver.findElement(By.cssSelector("div.page-body input[id='LastName']")).sendKeys("lkj");//directChild
		driver.findElement(By.cssSelector("div.page-body input[id='Email']")).sendKeys("lkjghjk@gmail.com");
		//div.page-body :nth-child[]
		driver.findElement(By.cssSelector("div.page-body input[id='Password']")).sendKeys("plm@123");
		driver.findElement(By.cssSelector("div.page-body input[id='ConfirmPassword']")).sendKeys("plm@123");
		driver.findElement(By.cssSelector("div.page-body input[id='register-button']")).click();
	}
}
