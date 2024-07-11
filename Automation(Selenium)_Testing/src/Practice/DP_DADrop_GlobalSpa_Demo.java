package Practice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DP_DADrop_GlobalSpa_Demo {
	public static void main(String[] args) throws IOException, Exception {
		System.out.println("All-Practice");
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		//ScreenShot
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("F:\\Software Testing\\Practice\\m.png"));
		Thread.sleep(5000);
		//Drag And Drop
		WebElement wf= driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(wf);
		Thread.sleep(5000);
		
		Actions ac=new Actions(driver);
		WebElement source= driver.findElement(By.xpath("//img[@src='images/high_tatras3_min.jpg']"));
		Thread.sleep(5000);
		WebElement target= driver.findElement(By.xpath("//div[@id=\"trash\"]"));
		ac.dragAndDrop(source, target).build().perform();
		Thread.sleep(2000);
		
		WebElement source1=driver.findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']"));
		Thread.sleep(5000);
		WebElement target1= driver.findElement(By.xpath("//div[@id=\"trash\"]"));
		ac.dragAndDrop(source1, target1).build().perform();
		Thread.sleep(2000);
		
		WebElement source2=driver.findElement(By.xpath("//img[@src='images/high_tatras2_min.jpg']"));
		Thread.sleep(5000);
		WebElement target2= driver.findElement(By.xpath("//div[@id=\"trash\"]"));
		ac.dragAndDrop(source2, target2).build().perform();
		Thread.sleep(2000);
		
		WebElement source3=driver.findElement(By.xpath("//img[@src='images/high_tatras4_min.jpg']"));
		Thread.sleep(5000);
		WebElement target3= driver.findElement(By.xpath("//div[@id=\"trash\"]"));
		ac.dragAndDrop(source3, target3).build().perform();	
	}
}
