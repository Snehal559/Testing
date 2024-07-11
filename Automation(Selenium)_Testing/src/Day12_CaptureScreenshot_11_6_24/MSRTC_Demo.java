package Day12_CaptureScreenshot_11_6_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MSRTC_Demo {
	public static void main(String[] args) {
		System.out.println("BookMyShow-Wait-Practice");
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.bookmyshow.com/explore/home/pune");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a[href='/explore/movies-pune']")).click();
		
		
		
	}

}
