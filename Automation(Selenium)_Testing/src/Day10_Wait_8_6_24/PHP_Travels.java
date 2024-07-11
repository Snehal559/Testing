package Day10_Wait_8_6_24;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PHP_Travels {
	public static void main(String[] args) throws Exception {
		System.out.println("All_Locators_Practice");
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://phptravels.org/register.php");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("John");
		driver.findElement(By.cssSelector("input[name^='last']")).sendKeys("Joseph");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("john1234@gmail.com");
		driver.findElement(By.xpath("//input[@name='phonenumber']")).sendKeys("9236547896");
		driver.findElement(By.xpath("//input[@name='companyname']")).sendKeys("Deloite");
		driver.findElement(By.cssSelector("input[name$='ss1']")).sendKeys("Pune");
		driver.findElement(By.cssSelector("input[name*='dress2']")).sendKeys("Hinjewadi");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Pune");
		driver.findElement(By.cssSelector("input[name='state']")).sendKeys("Maharashtra");
		driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys("411052");
		WebElement con=driver.findElement(By.xpath("//select[@name='country']"));
		Select scon=new Select(con);
		scon.selectByVisibleText("India");
		driver.findElement(By.xpath("//input[@name='customfield[2]']")).sendKeys("9865475698");
		driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("John@123");
		driver.findElement(By.cssSelector("input[name=\"password2\"]")).sendKeys("John@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"frmCheckout\"]/div[3]/div/div/div/span[1]")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
	}
}
