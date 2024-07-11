package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) {
		System.out.println("Test");
		System.setProperty("webdriver.chrome.driver","F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String s=driver.getTitle();
		System.out.println("Title = "+s);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String page=driver.getPageSource();
		System.out.println("Page "+page);
		driver.navigate().to("https://www.flipkart.com/");
		String url1=driver.getCurrentUrl();
		System.out.println(url1);
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();
		driver.quit();
			
	}
}
