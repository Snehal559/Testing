package Day16_Table;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) throws Exception {
		System.out.println("Hello");
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/Software%20Testing/Practice/table%20(1).html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		//Total rows
		List<WebElement>al= driver.findElements(By.tagName("tr"));
		int totrows=al.size();
		System.out.println("Total Row :"+totrows);
		Thread.sleep(3000);
		
		//Display all data
		for (WebElement rows : al) {
			List<WebElement> col= rows.findElements(By.tagName("td"));
			for (WebElement coloum : col) {
				System.out.println(coloum.getText());
			}
		}
		
		//display perticular row and column
		System.out.println("................................................................");
		List<WebElement> prc= driver.findElements(By.xpath("/html/body/table/tbody/tr[6]"));
		for (WebElement col2 : prc) {
			System.out.println(col2.getText());
		}
	}
}
