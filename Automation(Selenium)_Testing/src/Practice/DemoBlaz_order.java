package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlaz_order {

	public static void main(String[] args) throws Exception {
		System.out.println("Hello");
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoblaze.com/");
		driver.manage().window().maximize();
		//sign up
		driver.findElement(By.id("signin2")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='sign-username']")).sendKeys("Sneaa3");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='sign-password']")).sendKeys("Abc@123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[onclick='register()']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//log in
		driver.findElement(By.xpath("//a[@id=\"login2\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("loginusername")).sendKeys("Sneaa3");
		Thread.sleep(2000);
		driver.findElement(By.id("loginpassword")).sendKeys("Abc@123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[onclick=\"logIn()\"]")).click();
		Thread.sleep(5000);
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//laptop
		driver.findElement(By.cssSelector("a[onclick=\"byCat('notebook')\"]")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//a[1][@class=\"hrefch\"]")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div[1]/div/div/h4/a")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//add to cart
		driver.findElement(By.xpath("//a[@onclick='addToCart(8)']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		//click on cart
		driver.findElement(By.cssSelector("a[id=\"cartur\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click(); //place order
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys("Snehal");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='country']")).sendKeys("India");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='city']")).sendKeys("Pune");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='card']")).sendKeys("789465498523");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='month']")).sendKeys("June");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='year']")).sendKeys("2029");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[onclick='purchaseOrder()']")).click();
		
	}

}
