package Day12_CaptureScreenshot_11_6_24;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {
	public static void main(String[] args) {
		System.out.println("DetePicker_Demo");
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		while(!driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-datepicker-month']")).getText().contains("September"))
		{
			System.out.println("In-While");
			driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		List alldate=driver.findElements(By.cssSelector("td[data-handler='selectDay']"));
		int count=alldate.size();
		System.out.println("Number Of Days= "+count);
		for (int i=0; i<count; i++) {
			String dayvalue=driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).getText();
			if(dayvalue.equalsIgnoreCase("15"))
			{
				driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).click();
			}	
		}
	}
}
