package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Demo {
	public static void main(String[] args) {
		System.out.println("All-Practice");
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/Software%20Testing/Practice/table%20(1).html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		List<WebElement>row=driver.findElements(By.tagName("tr"));
		int count=row.size();
		System.out.println(count);
		System.out.println(".............................................");
		
		List<WebElement> alcol=driver.findElements(By.tagName("td"));
		int count1=alcol.size();
		System.out.println(count1);
		System.out.println("...............................................");
		
		for(WebElement rows :row)
		{
			List<WebElement> col=rows.findElements(By.tagName("td"));
			for(WebElement coloumn : col)
			{
				System.out.println(coloumn.getText());
			}
		}
		System.out.println("..............................................");
		List<WebElement> prc=driver.findElements(By.xpath("/html/body/table/tbody/tr[3]"));
		for(WebElement singler : prc)
		{
			System.out.println(singler.getText());
		}
	}

}
