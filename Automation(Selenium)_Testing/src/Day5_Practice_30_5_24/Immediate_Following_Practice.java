package Day5_Practice_30_5_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Immediate_Following_Practice {
	public static void main(String[] args) {
		System.out.println("Practice-immed-following");
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Snehal");
		driver.findElement(By.xpath("//form/ table/tbody/tr[2]/following-sibling :: *[1]/td[2]/input")).sendKeys("XYZ");
		driver.findElement(By.xpath("//form/ table/tbody/tr[3]/following-sibling :: *[1]/td[2]/input")).sendKeys("8745698569");
		driver.findElement(By.xpath("//form/ table/tbody/tr[4]/following-sibling :: *[1]/td[2]/input")).sendKeys("w@gmail.com");
		driver.findElement(By.xpath("//form/ table/tbody/tr[6]/following-sibling :: *[1]/td[2]/input")).sendKeys("Karavenagar");
		driver.findElement(By.xpath("//form/ table/tbody/tr[7]/following-sibling :: *[1]/td[2]/input")).sendKeys("Pune");
		driver.findElement(By.xpath("//form/ table/tbody/tr[8]/following-sibling :: *[1]/td[2]/input")).sendKeys("Maharashtra");
		driver.findElement(By.xpath("//form/ table/tbody/tr[9]/following-sibling :: *[1]/td[2]/input")).sendKeys("412005");
		driver.findElement(By.xpath("//form/ table/tbody/tr[10]/following-sibling :: *[1]/td[2]/select")).sendKeys("India");
		driver.findElement(By.xpath("//form/ table/tbody/tr[12]/following-sibling :: *[1]/td[2]/input")).sendKeys("Ssss");
		driver.findElement(By.xpath("//form/ table/tbody/tr[13]/following-sibling :: *[1]/td[2]/input")).sendKeys("M@321");
		driver.findElement(By.xpath("//form/ table/tbody/tr[14]/following-sibling :: *[1]/td[2]/input")).sendKeys("M@123");
		driver.findElement(By.xpath("//form/ table/tbody/tr[16]/following-sibling :: *[1]/td[1]/input")).click();
		
	}

}
