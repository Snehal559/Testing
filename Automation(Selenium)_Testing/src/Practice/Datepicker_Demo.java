package Practice;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker_Demo {
	public static void main(String[] args) throws IOException {
		System.out.println("Date Picker");
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("input[id='datepicker']")).click();
		while(!driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-datepicker-year']")).getText().contains("2024"))
		{
			System.out.println("In-Loop-Year-Selected");
			driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-datepicker-next ui-corner-all ui-state-hover ui-datepicker-next-hover']")).click();
		}
		while(!driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-datepicker-month']")).getText().contains("June"))
		{
			System.out.println("In-Loop-Month-selected");
			driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		List allday=driver.findElements(By.cssSelector("td[data-handler='selectDay']"));
		int count=allday.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			String dayval=driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).getText();
			if(dayval.equalsIgnoreCase("18"))
			{
				driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).click();
			}
		}
		driver.switchTo().defaultContent();
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("F:\\Software Testing\\Practice\\sss.png"));
	}
}
