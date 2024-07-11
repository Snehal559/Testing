package Day11_Action_Methods_10_6_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_DragADrop_frame {
	public static void main(String[] args) throws Exception {
		System.out.println("Frame-Demo");
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		//Frame-In-Concept
		driver.switchTo().frame(0);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		Actions ac=new Actions(driver);
		ac.dragAndDrop(source, target).build().perform();
		Thread.sleep(2000);
		//frame-out
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id=\"menu-top\"]/li[8]/a")).click();//about-Locator
		
		
	
	}

}
