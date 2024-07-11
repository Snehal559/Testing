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

public class RohitShettyDemo {
	public static void main(String[] args) throws Exception {
		System.out.println("Hello");
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		List alhyperlink=driver.findElements(By.tagName("a"));
		int totalhycount=alhyperlink.size();
		System.out.println("Total HyperLink Counts :"+totalhycount);
		Thread.sleep(2000);
		
		WebElement footerdriver=driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]"));
	    List footerhylink=footerdriver.findElements(By.tagName("a"));
	    int foterhycount=footerhylink.size();
	    System.out.println("Total Footer HyperLink Counts :"+foterhycount);
	    Thread.sleep(2000);
	    
	    WebElement pfd=driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]"));//perticular footer xpath
	    List pfcount=pfd.findElements(By.tagName("a"));
	    int pfcounts=pfcount.size();
	    System.out.println("Perticular footer Count :"+pfcounts);
	    Thread.sleep(2000);
	    
	    for (int i = 1; i < pfcounts; i++) {
	    	String clicklink=Keys.chord(Keys.CONTROL,Keys.ENTER);
	    	pfd.findElements(By.tagName("a")).get(i).sendKeys(clicklink);
	    	Thread.sleep(2000);	
		}  
	    Set<String> s=driver.getWindowHandles();
	    System.out.println(s);
	    Thread.sleep(2000);
	    
	    ArrayList<String> al=new ArrayList<String>(s);
	    System.out.println("List Data "+al);
	    Thread.sleep(2000);
	    
	    Iterator<String> itr=al.iterator();
	    while (itr.hasNext()) {
			//String string = (//String) itr.next();
			driver.switchTo().window(itr.next());
			Thread.sleep(4000);
			String url=driver.getCurrentUrl();
			Thread.sleep(2000);
			System.out.println(url);
			Thread.sleep(4000);
			if(url.equalsIgnoreCase("https://www.restapitutorial.com/"))
			{
				Thread.sleep(4000);
				driver.findElement(By.xpath("//*[@id=\"R-topics\"]/ul/li[1]/a")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//*[@id=\"R-subsections-f5db5b284a3d023503978d00824e9c16\"]/li[1]/a")).click();
				Thread.sleep(4000);
				String url1=driver.getCurrentUrl();
				Thread.sleep(4000);
				System.out.println("...........Url of-What is Rest?............. :"+url1);
				Thread.sleep(4000);		
			}
			Thread.sleep(4000);
		}
	}
}
