package Day7_CCSSelector_3_6_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CCS_index {
	public static void main(String[] args) {
		System.out.println("CSS-Selector");
		System.setProperty("webdriver.chrome.driver","F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/Software%20Testing/Practice/index%20(1).html");
		driver.findElement(By.cssSelector("input#uid")).sendKeys("ABC");
		driver.findElement(By.cssSelector("input.pass")).sendKeys("abc123");
		WebElement s=driver.findElement(By.cssSelector("select[id='browser']"));
		Select ss=new Select(s);
		ss.selectByVisibleText("Chrome");
		driver.findElement(By.cssSelector("input.rem[type='checkbox']")).click();
		driver.findElement(By.cssSelector("button.login[class=\"login\"]")).click();
	}
}
