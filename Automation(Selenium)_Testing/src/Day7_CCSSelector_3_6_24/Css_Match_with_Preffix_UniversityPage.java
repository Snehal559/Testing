package Day7_CCSSelector_3_6_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Match_with_Preffix_UniversityPage {
	public static void main(String[] args) {
		System.out.println("prefix-practice");
		System.setProperty("webdriver.chrome.driver","F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
		driver.findElement(By.cssSelector("input[name^='first_name']")).sendKeys("ABC");
		driver.findElement(By.cssSelector("input[name^='last_name']")).sendKeys("XYZ");
		driver.findElement(By.cssSelector("input[name^='email']")).sendKeys("a@gmail.com");
		driver.findElement(By.cssSelector("textarea[name^='message']")).sendKeys("Good");
		driver.findElement(By.cssSelector("input[type^='submit']")).click();
	}

}
