package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker_12_6_24 {

	public static void main(String[] args) throws Exception {
		System.out.println("Hello");
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/datepicker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebElement fr=driver.findElement(By.xpath("iframe[class=\"demo-frame lazyloaded\"]"));
		driver.switchTo().frame(fr);
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).click();
		while(!driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-datepicker-year']")).getText().contains("2026"));
		{
			System.out.println("Year-Loop");
			driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		while(!driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-datepicker-month']")).getText().contains("November"));
		{
			System.out.println("Month-Loop");
			driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		List totalday=driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
		int count=totalday.size();
		System.out.println("No of Days :"+count);
		
		for (int i = 0; i < count; i++) {
			String day=driver.findElements(By.xpath("//td[@data-handler='selectDay']")).get(i).getText();
			if(day.equalsIgnoreCase("18"))
			{
				driver.findElements(By.xpath("//td[@data-handler='selectDay']")).get(i).click();
			}
		}
	}
}
