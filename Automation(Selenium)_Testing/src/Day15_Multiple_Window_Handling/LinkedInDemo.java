package Day15_Multiple_Window_Handling;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedInDemo {
	public static void main(String[] args) throws Exception {
		System.out.println("hello");
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.linkedin.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		List ls=driver.findElements(By.tagName("a"));
		int count=ls.size();
		System.out.println("Total Hyperlinks :"+count);
		Thread.sleep(2000);
		
		WebElement phl=driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[3]/div[2]/div"));
		List phlcount=phl.findElements(By.tagName("a"));
		int counts=phlcount.size();
		System.out.println("Perticular Hyperlink Counts :"+counts);
		
		for (int i = 1; i < counts; i++) {
			Thread.sleep(2000);
			String linkclick=Keys.chord(Keys.CONTROL,Keys.ENTER);
			Thread.sleep(2000);
			phl.findElements(By.tagName("a")).get(i).sendKeys(linkclick);
			Thread.sleep(2000);
		}
		Set<String> s=driver.getWindowHandles();
		System.out.println(s);
		Thread.sleep(2000);
		ArrayList<String> al=new ArrayList<String>(s);
		Iterator<String> itr=al.iterator();
		Thread.sleep(2000);
		while(itr.hasNext())
		{
			Thread.sleep(2000);
			driver.switchTo().window(itr.next());
			Thread.sleep(2000);
			String url=driver.getCurrentUrl();
			System.out.println(url);
			Thread.sleep(4000);
		}
	}

}
