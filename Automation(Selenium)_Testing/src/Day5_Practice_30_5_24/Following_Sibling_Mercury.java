package Day5_Practice_30_5_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Following_Sibling_Mercury {
	public static void main(String[] args){
		System.out.println("Sibling-Practice");
		System.setProperty("webdriver.chrome.driver","F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("ABC");
		driver.findElement(By.xpath("//form/table/tbody/tr[2]/following-sibling::tr[1]/td[2]/input")).sendKeys("XYZ");
		driver.findElement(By.xpath("// form/table/tbody/tr[2]/following-sibling::tr[2]/td[2]/input")).sendKeys("7894561236");
		driver.findElement(By.xpath("// form/table/tbody/tr[2]/following-sibling::tr[3]/td[2]/input")).sendKeys("a@gmail.com");
		driver.findElement(By.xpath("// form/table/tbody/tr[2]/following-sibling::tr[5]/td[2]/input")).sendKeys("Hinjewadi");
		driver.findElement(By.xpath("// form/table/tbody/tr[2]/following-sibling::tr[6]/td[2]/input")).sendKeys("Pune");
		driver.findElement(By.xpath("// form/table/tbody/tr[2]/following-sibling::tr[7]/td[2]/input")).sendKeys("Maharashtra");
		driver.findElement(By.xpath("// form/table/tbody/tr[2]/following-sibling::tr[8]/td[2]/input")).sendKeys("412115");
		driver.findElement(By.xpath("// form/table/tbody/tr[2]/following-sibling::tr[9]/td[2]/select")).sendKeys("India");
		driver.findElement(By.xpath("// form/table/tbody/tr[2]/following-sibling::tr[11]/td[2]/input")).sendKeys("a@gmail.com");
		driver.findElement(By.xpath("// form/table/tbody/tr[2]/following-sibling::tr[12]/td[2]/input")).sendKeys("B@123");
		driver.findElement(By.xpath("// form/table/tbody/tr[2]/following-sibling::tr[13]/td[2]/input")).sendKeys("B@123");
		driver.findElement(By.xpath("// form/table/tbody/tr[2]/following-sibling::tr[15]/td[1]/input")).click();		
	}
}
