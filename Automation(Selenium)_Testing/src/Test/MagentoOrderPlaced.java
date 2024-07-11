package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MagentoOrderPlaced {

	public static void main(String[] args) throws Exception {
		System.out.println("Test-CSS");
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		//..............................CREATE ACCOUNT.......................................................................................................................
		driver.findElement(By.cssSelector("div[class='panel header'] a[href='https://magento.softwaretestingboard.com/customer/account/create/']")).click();
		driver.findElement(By.cssSelector("input[id='firstname']")).sendKeys("Anagha");
		driver.findElement(By.cssSelector("input[id='lastname']")).sendKeys("Devasffg");
		driver.findElement(By.cssSelector("input[name*='mai']")).sendKeys("aabc77@gmail.com");
		driver.findElement(By.cssSelector("input[title='Password']")).sendKeys("Snehal@123");
		driver.findElement(By.cssSelector("input[title='Confirm Password']")).sendKeys("Snehal@123");
		driver.findElement(By.cssSelector("button[class='action submit primary'] span")).click();
		Thread.sleep(2000);
		//..............................SIGN OUT........................................................................................................................
		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button")).click();
		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a")).click();
		//...............................SIGN_IN.......................................................................................................................
		driver.findElement(By.xpath("/html/body/div[2]/header/div/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//input[@name='login[username]']")).sendKeys("aabc77@gmail.com");
		driver.findElement(By.xpath("//input[@name='login[password]']")).sendKeys("Snehal@123");
		driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[1]/div[2]/form/fieldset/div[4]/div[1]/button/span")).click();
		//...............................Women-Add-Product.......................................................................................................................
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/nav/ul/li[2]/a/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/main/div[4]/div[2]/div[1]/div[2]/dl/dd/ol/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[1]/div/div/div[3]/div[1]/div/div[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[1]/div/div/div[3]/div[2]/div/div[1]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[1]/div/div/div[4]/div/div[1]/form/button/span")).click();
		Thread.sleep(2000);
		//...............................Proceed-TO-CheckOut........................................................................................................................
		driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a")).click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//button[@id='top-cart-btn-checkout']")).click();
		driver.findElement(By.xpath("//*[@id='top-cart-btn-checkout']")).click();
		Thread.sleep(2000);
		//...............................Shipping-Address........................................................................................................................
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys("TCS");	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='street[0]']")).sendKeys("Wakad");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/fieldset/div/div[1]/div/input")).sendKeys("Wakad,Pune");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Pune");
		Thread.sleep(2000);
		WebElement wr= driver.findElement(By.xpath("//select[@name='region_id']"));
		Select s=new Select(wr);
		s.selectByIndex(4);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys("111052-74125-12345");
		Thread.sleep(2000);
		WebElement wc=driver.findElement(By.xpath("//select[@name='country_id']"));
		Select s1=new Select(wc);
		s1.selectByIndex(5);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys("7788995632");
		Thread.sleep(2000);
		//..............................Place-Order......................................................................................................................
		driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='checkout-payment-method-load']/div/div/div[2]/div[2]/div[4]/div/button/span")).click();
	}
}
