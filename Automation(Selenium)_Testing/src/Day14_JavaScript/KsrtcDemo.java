package Day14_JavaScript;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KsrtcDemo {
	public static void main(String[] args) throws Exception {
		System.out.println("Java-Script");
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,300)");
		
		WebElement fb= driver.findElement(By.id("fromPlaceName"));
		fb.sendKeys("BENG");
		
		JavascriptExecutor js1=(JavascriptExecutor) driver;
		String jcityname="return document.getElementById(\"fromPlaceName\").value";
		String cityname=(String) js1.executeScript(jcityname);
		System.out.println(cityname);
		
		while(!cityname.equalsIgnoreCase("BENGALURU AIRPORT"))
		{
			Thread.sleep(3000);
			fb.sendKeys(Keys.DOWN);
			jcityname="return document.getElementById(\"fromPlaceName\").value";
			cityname=(String) js1.executeScript(jcityname);
			System.out.println("City value in Loop :"+cityname);
		}
		fb.sendKeys(Keys.ENTER);
		
		WebElement des=driver.findElement(By.id("toPlaceName"));
		des.sendKeys("Anan");
		
		JavascriptExecutor js2=(JavascriptExecutor)driver;
		String destcity="return document.getElementById(\"toPlaceName\").value";
		String dcity=(String) js2.executeScript(destcity);
		System.out.println(dcity);
		
		while(!dcity.equalsIgnoreCase("ANANTAPUR"))
		{
			Thread.sleep(3000);
			des.sendKeys(Keys.DOWN);
			destcity="return document.getElementById(\"toPlaceName\").value";
			dcity=(String) js2.executeScript(destcity);
			System.out.println("Destination in Loop"+dcity);
		}
		des.sendKeys(Keys.ENTER);
		
		while(!driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-datepicker-year']")).getText().contains("2025"));
		{
			System.out.println("Loop-Year");
			driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-datepicker-next ui-corner-all']")).click();
		}
		while(!driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-datepicker-month']")).getText().contains("June"));
		{
			System.out.println("Loop-Month");
			driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-datepicker-next ui-corner-all']")).click();
		}
		List selday=driver.findElements(By.cssSelector("td[data-handler='selectDay']"));
		int count=selday.size();
		System.out.println("No of Days :"+count);
		
		for (int i = 0; i < count; i++) {
			String day= driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).getText();
			
			if(day.equalsIgnoreCase("18"))
			{
				driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).click();
			}
		}
	}
}
