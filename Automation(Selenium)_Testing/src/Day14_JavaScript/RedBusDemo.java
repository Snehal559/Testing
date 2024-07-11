package Day14_JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusDemo {

	public static void main(String[] args) throws Exception {
		System.out.println("Java-Script");
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("scrollBy(0,200)");
		
		WebElement fr=driver.findElement(By.id("src"));
		fr.sendKeys("Beng");
		
		JavascriptExecutor j=(JavascriptExecutor) driver;
		
		String frcity="return document.getElementById(\"src\").value;";
		String fromcity=(String) j.executeScript(frcity);
		System.out.println(fromcity);
		while(!fromcity.equalsIgnoreCase("Bengare"))
		{
			Thread.sleep(5000);
			fr.sendKeys(Keys.DOWN);
			frcity="return document.getElementById(\"src\").value;";
			fromcity=(String) j.executeScript(frcity);
			System.out.println(fromcity);
		}
		fr.sendKeys(Keys.ENTER);
	}

}
