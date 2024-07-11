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

public class NaukariDemoo {
	public static void main(String[] args) throws Exception {
		System.out.println("Hello");
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		List al=driver.findElements(By.tagName("a"));
		int thcount=al.size();
		System.out.println("Total HyperLink Counts :"+thcount);
		Thread.sleep(2000);
		
		//header hyperlinks
		WebElement hdriver=driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]"));
		List hhl=hdriver.findElements(By.tagName("a"));
		int hcount=hhl.size();
		System.out.println("Heder HyperLink Counts :"+hcount);
		Thread.sleep(2000);
		
		//perticular hyperlinks
		WebElement phdriver=driver.findElement(By.xpath("//*[@id=\"root\"]/footer/section[1]/div/div/div[2]"));
		List phl=phdriver.findElements(By.tagName("a"));
		int phlcount=phl.size();
		System.out.println("Perticular HyperLink Counts :"+phlcount);
		Thread.sleep(2000);
		for (int i = 1; i < phlcount; i++) {
			String clicklink=Keys.chord(Keys.CONTROL,Keys.ENTER);
			phdriver.findElements(By.tagName("a")).get(i).sendKeys(clicklink);	
			Thread.sleep(2000);
		}
		Set<String> sw= driver.getWindowHandles();
		System.out.println(sw);
		ArrayList<String> sal=new ArrayList<String>(sw);
		System.out.println("List data"+sal);
		Iterator<String> itr=sal.iterator(); 
		while (itr.hasNext()) {
			driver.switchTo().window(itr.next());
			String url=driver.getCurrentUrl();
			System.out.println(url);
				if(url.equalsIgnoreCase("https://www.naukri.com/recruit/login"))
				{
					driver.findElement(By.xpath("//*[@id=\"productsMenu\"]/div")).click();
					Thread.sleep(4000);
					driver.findElement(By.xpath("//*[@id=\"productsMenu\"]/ul/a[3]/li")).click();
					Thread.sleep(4000);
					String title=driver.getTitle();
					System.out.println("..............Job Posting Title :"+title);
					Thread.sleep(4000);
				}
			Thread.sleep(2000);
		}	
	}
}
