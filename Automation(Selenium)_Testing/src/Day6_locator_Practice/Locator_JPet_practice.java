package Day6_locator_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_JPet_practice {
	public static void main(String[] args) {
		System.out.println("Locators-Practice");
		System.setProperty("webdriver.chrome.driver","F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jpetstore.aspectran.com/account/newAccountForm");
		driver.findElement(By.name("username")).sendKeys("ABC");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Sne@1");
		driver.findElement(By.xpath("//html/body/section/div[2]/div[2]/div[1]//form/table[1]/tbody/tr[3]/td[2]/input")).sendKeys("Sne@1");
		driver.findElement(By.xpath("//form/table[2]/tbody/tr[3]/preceding-sibling::tr[2]/td[2]/input")).sendKeys("ABC");
		driver.findElement(By.xpath("//form/table[2]/tbody/tr[3]/preceding-sibling::tr[1]/td[2]/input")).sendKeys("XYZ");
		driver.findElement(By.xpath("//form/table[2]/tbody/tr[1]/following-sibling::tr[2]/td[2]/input")).sendKeys("s@gmail.com");
		driver.findElement(By.xpath("//form/table[2]/tbody/tr[1]/following-sibling::tr[3]/td[2]/input")).sendKeys("9874563214");
		driver.findElement(By.xpath("//form/table[2]/tbody/tr[1]/following-sibling::tr[4]/td[2]/input")).sendKeys("Hinjewadi");
		driver.findElement(By.xpath("//form/table[2]/tbody/tr[1]/following-sibling::tr[5]/td[2]/input")).sendKeys("Wakad");
		driver.findElement(By.xpath("//form/table[2]/tbody/tr[8]/preceding-sibling::*[1]/td[2]/input")).sendKeys("Pune");
		driver.findElement(By.xpath("//form/table[2]/tbody/tr[9]/preceding-sibling::*[1]/td[2]/input")).sendKeys("Maharashtra");
		driver.findElement(By.xpath("//form/table[2]/tbody/tr[8]/following-sibling::*[1]/td[2]/input")).sendKeys("411042");
		driver.findElement(By.xpath("//form/table[2]/tbody/tr[9]/following-sibling::*[1]/td[2]/input")).sendKeys("India");
		driver.findElement(By.xpath("//select[@name='languagePreference']")).sendKeys("English");
		driver.findElement(By.name("favouriteCategoryId")).sendKeys("dog");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@name='bannerOption']")).click();
		driver.findElement(By.xpath("//button[@class='button']")).click();	
	}
}
