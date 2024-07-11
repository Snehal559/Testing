package Day1_WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Test");
		System.setProperty("webdriver.chrome.driver","F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		String title=driver.getTitle();
		System.out.println("Title "+title);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String page=driver.getPageSource();
		System.out.println("Page "+page);
		
		Thread.sleep(2000); // to wait
		driver.navigate().to("https://www.google.com/");
		
		Thread.sleep(2000); // to wait
		driver.navigate().back();
		
		Thread.sleep(2000); // to wait
		driver.navigate().forward();
		
		driver.close();
		driver.quit();
	}
}
