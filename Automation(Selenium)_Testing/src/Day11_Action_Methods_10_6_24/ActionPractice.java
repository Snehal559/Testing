
package Day11_Action_Methods_10_6_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionPractice {
	public static void main(String[] args) throws Exception {
		System.out.println("Action");
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		WebElement bestseller=driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]"));
		ac.click(bestseller).build().perform();
		Thread.sleep(2000);
		WebElement mobile=driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]"));
		ac.doubleClick(mobile).build().perform();
		Thread.sleep(2000);
		WebElement todaydeal=driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[6]"));
		ac.contextClick(todaydeal).build().perform();
		Thread.sleep(2000);
		WebElement login=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"));
		ac.moveToElement(login).build().perform();
	}

}
