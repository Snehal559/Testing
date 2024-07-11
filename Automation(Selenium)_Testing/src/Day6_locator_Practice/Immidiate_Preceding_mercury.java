package Day6_locator_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Immidiate_Preceding_mercury {
	public static void main(String[] args) {
		System.out.println("Immediate-Preceding-Practice");
		System.setProperty("webdriver.chrome.driver","F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.findElement(By.xpath("//form/table/tbody/tr[3]/preceding-sibling::*[1]/td[2]/input")).sendKeys("ABC");
		driver.findElement(By.xpath("//form/table/tbody/tr[4]/preceding-sibling::*[1]/td[2]/input")).sendKeys("XYZ");
		driver.findElement(By.xpath("//form/table/tbody/tr[5]/preceding-sibling::*[1]/td[2]/input")).sendKeys("9632587412");
		driver.findElement(By.xpath("//form/table/tbody/tr[6]/preceding-sibling::*[1]/td[2]/input")).sendKeys("S@gmail.com");
		driver.findElement(By.xpath("//form/table/tbody/tr[8]/preceding-sibling::*[1]/td[2]/input")).sendKeys("Karvenagar");
		driver.findElement(By.xpath("//form/table/tbody/tr[9]/preceding-sibling::*[1]/td[2]/input")).sendKeys("Pune");
		driver.findElement(By.xpath("//form/table/tbody/tr[10]/preceding-sibling::*[1]/td[2]/input")).sendKeys("Maharashtra");
		driver.findElement(By.xpath("//form/table/tbody/tr[11]/preceding-sibling::*[1]/td[2]/input")).sendKeys("411052");
		driver.findElement(By.xpath("//form/table/tbody/tr[12]/preceding-sibling::*[1]/td[2]/select")).sendKeys("India");
		driver.findElement(By.xpath("//form/table/tbody/tr[14]/preceding-sibling::*[1]/td[2]/input")).sendKeys("Snehal");
		driver.findElement(By.xpath("//form/table/tbody/tr[15]/preceding-sibling::*[1]/td[2]/input")).sendKeys("s@123");
		driver.findElement(By.xpath("//form/table/tbody/tr[16]/preceding-sibling::*[1]/td[2]/input")).sendKeys("s@123");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}

}
