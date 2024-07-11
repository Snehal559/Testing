package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrikTable {
	public static void main(String[] args) throws Exception {
		System.out.println("All-Practice");
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		WebElement in1=driver.findElement(By.xpath("//div[@id='innings_1']/child ::div[1]"));
		List<WebElement> row=in1.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']"));
		int count=row.size();
		System.out.println(count);
		
		int sum=0;
		for(int i=0; i<count-2; i++)
		{
			String six=in1.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(5)")).get(i).getText();
			int s=Integer.parseInt(six);
			sum=sum+s;
		}
		System.out.println(sum);
	}
}
