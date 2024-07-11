package Day4_Locator_Practice_29_05_24;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Sibling {
	public static void main(String[] args) {
		System.out.println("Find Locators");
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[3]/preceding-sibling ::input")).sendKeys("XYZ");//preceding sibling
		driver.findElement(By.xpath("//input/following-sibling ::input")).sendKeys("ABC");//following sibling
		driver.findElement(By.xpath("//input[2]/following-sibling :: *")).sendKeys("a@gmail.com");//immediate
		driver.findElement(By.xpath("//input[3]/following-sibling ::*")).sendKeys("very good");
		driver.findElement(By.xpath("//form/div/input[1]/following-sibling::*")).click();
	}

}
