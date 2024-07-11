package Day8_WebElement_4_6_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WE_UniversityPage {

	public static void main(String[] args) {
		System.out.println("WebElement-Practice");
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
		driver.manage().window().maximize();
		
		WebElement con= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/section/div/div[1]/div/h2"));
		String s=con.getText();
		System.out.println("Contact Us HeadLine - "+s);
		
		driver.findElement(By.cssSelector("input[name^='first_n']")).sendKeys("Snehall");
		WebElement last=driver.findElement(By.xpath("//input[@name='last_name']"));
		last.sendKeys("Mitali");
		String lastname=last.getAttribute("value");
		System.out.println("Last Name- "+lastname);
		
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.cssSelector("textarea[class*='back-in']")).sendKeys("Very Good");
		//driver.findElement(By.cssSelector("textarea[class*='back-in']")).clear();
		
		driver.findElement(By.cssSelector("input[type$='mit']")).submit();
	
	}
}
