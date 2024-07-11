package Day12_CaptureScreenshot_11_6_24;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertDemo {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Alert");
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		//Alert-Methods
		//WebDriverWait wdw=new WebDriverWait(driver, 20);
		//wdw.until(ExpectedConditions.visibilityOfElementLocated("/html/body/div[2]/div/div/div/div[1]/div/div/div[3]/span/div/div[1]"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[3]/span/div/div[1]")).click();
		//wdw.until(ExpectedConditions.visibilityOfElementLocated("//button[@id='alertButton']"));
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.findElement(By.id("timerAlertButton")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.findElement(By.id("confirmButton")).click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		driver.findElement(By.id("promtButton")).click();
		String val=driver.switchTo().alert().getText();
		System.out.println(val);
		driver.switchTo().alert().sendKeys("Snehal");
		driver.switchTo().alert().accept();
	}
}
