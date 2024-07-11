package Day8_WebElement_4_6_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CSS_JetStore {

	public static void main(String[] args) {
		System.out.println("CSS-Prcatice");
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jpetstore.aspectran.com/account/newAccountForm");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("LKJasdf");
		driver.findElement(By.cssSelector("input[name^='pass']")).sendKeys("LKJ@123");
		driver.findElement(By.cssSelector("input[name='repeatedPassword']")).sendKeys("LKJ@123");
		driver.findElement(By.cssSelector("input[name*='stNa']")).sendKeys("Komal");
		driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("Lkjhgf");
		driver.findElement(By.cssSelector("input[name$='ail']")).sendKeys("Poi@123");
		driver.findElement(By.cssSelector("input[name*='one']")).sendKeys("8745698745");
		driver.findElement(By.cssSelector("input[name='address1']")).sendKeys("Wakad1");
		driver.findElement(By.cssSelector("input[name*='dress2']")).sendKeys("Hinjewadi-1");
		driver.findElement(By.cssSelector("input[name='city']")).sendKeys("Pune");
		driver.findElement(By.cssSelector("input[name$='te']")).sendKeys("Maharashtra");
		driver.findElement(By.cssSelector("input[name='zip']")).sendKeys("411055");
		driver.findElement(By.cssSelector("input[name^='count']")).sendKeys("India");
		WebElement lag=driver.findElement(By.cssSelector("select[name='languagePreference']"));
		Select s=new Select(lag);
		s.selectByIndex(1);
		WebElement w=driver.findElement(By.cssSelector("select[name^='favou']"));
		Select s1=new Select(w);
		s1.selectByVisibleText("Dogs");
		driver.findElement(By.cssSelector("input[name='listOption']")).click();
		driver.findElement(By.cssSelector("input[name^='bannerO']")).click();
		driver.findElement(By.cssSelector("div[class='button-bar']>button[type='submit']")).click();

	}
}
