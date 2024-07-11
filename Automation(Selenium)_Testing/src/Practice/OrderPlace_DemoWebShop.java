package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrderPlace_DemoWebShop {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Order-Placed-Practice");
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[id='gender-female']")).click();
		driver.findElement(By.cssSelector("input[id='FirstName']")).sendKeys("Snehal");
		driver.findElement(By.cssSelector("input[id='LastName']")).sendKeys("Dhember");
		driver.findElement(By.cssSelector("input[data-val-required*='Email is required.']")).sendKeys("snehalvi12345@gmail.com");
		driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("Ingole123");
		driver.findElement(By.cssSelector("input[id='ConfirmPassword']")).sendKeys("Ingole123");
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.cssSelector("input[class='button-1 register-continue-button']")).click();
		//.......................................................................................................................
		driver.findElement(By.className("ico-logout")).click();
		//.......................................................................................................................
		driver.findElement(By.cssSelector("a[class='ico-login']")).click();
		driver.findElement(By.cssSelector("input[autofocus='autofocus']")).sendKeys("snehalvi12345@gmail.com");
		driver.findElement(By.cssSelector("input[name='Password']")).sendKeys("Ingole123");
		driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();;
		//.......................................................................................................................
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li/a[@href='/books']")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[3]/div[2]/input")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[3]/a")).click();//shopping cart
		//.......................................................................................................................
		driver.findElement(By.cssSelector("input[name='removefromcart']")).click();
		WebElement con= driver.findElement(By.xpath("//select[@id='CountryId']"));
		Select scon=new Select(con);
		scon.selectByVisibleText("India");
		driver.findElement(By.cssSelector("input[id='termsofservice']")).click();
		driver.findElement(By.cssSelector("button[id='checkout']")).click();
		//........................................................................................................................
		WebElement wee=driver.findElement(By.xpath("//select[@data-val-number='The field Country must be a number.']"));
		Select sss=new Select(wee);
		sss.selectByVisibleText("India");
		driver.findElement(By.cssSelector("input[id='BillingNewAddress_City']")).sendKeys("Bavdhan");
		driver.findElement(By.cssSelector("input[id='BillingNewAddress_Address1']")).sendKeys("Pune");
		driver.findElement(By.cssSelector("input[id='BillingNewAddress_ZipPostalCode']")).sendKeys("412115");
		driver.findElement(By.cssSelector("input[id='BillingNewAddress_PhoneNumber']")).sendKeys("9874569856");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@onclick='Billing.save()']")).click();
		Thread.sleep(2000);
		//.........................................................................................................................
		//driver.findElement(By.xpath("//input[@class='button-1 shipping-method-next-step-button']")).click();
		driver.findElement(By.xpath("//input[@onclick='Shipping.save()']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/input")).click();
		//driver.findElement(By.className("button-1 confirm-order-next-step-button")).click();
		//driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']")).click();	
		//driver.findElement(By.cssSelector("input[onclick='ConfirmOrder.save()']")).submit();
	}
}
