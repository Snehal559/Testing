package Day6_locator_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class preceding_Sibling_mercury {

	public static void main(String[] args) {
		System.out.println("Preceding-Siblings");
		System.setProperty("webdriver.chrome.driver","F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.findElement(By.xpath("//form/table/tbody/tr[15]/preceding-sibling::tr[13]/td[2]/input")).sendKeys("ABC");
		driver.findElement(By.xpath("//form/table/tbody/tr[15]/preceding-sibling::tr[12]/td[2]/input")).sendKeys("XYZ");
		driver.findElement(By.xpath("//form/table/tbody/tr[15]/preceding-sibling::tr[13]/td[2]/input")).sendKeys("9632587412");
		driver.findElement(By.xpath("//form/table/tbody/tr[15]/preceding-sibling::tr[10]/td[2]/input")).sendKeys("S@gmail.com");
		driver.findElement(By.xpath("//form/table/tbody/tr[15]/preceding-sibling::tr[8]/td[2]/input")).sendKeys("Karvenagar");
		driver.findElement(By.xpath("//form/table/tbody/tr[15]/preceding-sibling::tr[7]/td[2]/input")).sendKeys("Pune");
		driver.findElement(By.xpath("//form/table/tbody/tr[15]/preceding-sibling::tr[6]/td[2]/input")).sendKeys("Maharashtra");
		driver.findElement(By.xpath("//form/table/tbody/tr[15]/preceding-sibling::tr[5]/td[2]/input")).sendKeys("411052");
		driver.findElement(By.xpath("//form/table/tbody/tr[15]/preceding-sibling::tr[4]/td[2]/select")).sendKeys("India");
		driver.findElement(By.xpath("//form/table/tbody/tr[15]/preceding-sibling::tr[2]/td[2]/input")).sendKeys("Snehal");
		driver.findElement(By.xpath("//form/table/tbody/tr[15]/preceding-sibling::tr[1]/td[2]/input")).sendKeys("s@123");
		driver.findElement(By.xpath("//form/table/tbody/tr[17]/preceding-sibling::tr[2]/td[2]/input")).sendKeys("s@123");
		driver.findElement(By.xpath("//input[@name='submit']")).click();

	}

}
