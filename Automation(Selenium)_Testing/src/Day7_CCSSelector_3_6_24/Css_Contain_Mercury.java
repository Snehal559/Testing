package Day7_CCSSelector_3_6_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Css_Contain_Mercury {
	public static void main(String[] args) {
		System.out.println("Contain-Practice");
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.findElement(By.cssSelector("input[name*='rst']")).sendKeys("qwe");
		driver.findElement(By.cssSelector("input[name*='stNa']")).sendKeys("poi");
		driver.findElement(By.cssSelector("input[name*='hon']")).sendKeys("9632587412");
		driver.findElement(By.cssSelector("input[id*='userName']")).sendKeys("qwer@gmail.com");
		driver.findElement(By.cssSelector("input[name*='ddr']")).sendKeys("bavdhan");
		driver.findElement(By.cssSelector("input[name*='it']")).sendKeys("Pune");
		driver.findElement(By.cssSelector("input[name*='tat']")).sendKeys("Maharashtra");
		driver.findElement(By.cssSelector("input[name*='talC']")).sendKeys("411055");
		WebElement we=driver.findElement(By.cssSelector("select[name*='untr']"));
		Select s=new Select(we);
		s.selectByVisibleText("INDIA");
		driver.findElement(By.cssSelector("input[name*='mai']")).sendKeys("SnehalS");
		driver.findElement(By.cssSelector("input[name*='sswor']")).sendKeys("xcv@123");
		driver.findElement(By.cssSelector("input[name*='irmPass']")).sendKeys("xcv@123");
		driver.findElement(By.cssSelector("input[name*='bmi']")).click();
		
	}

}
