package Day8_WebElement_4_6_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElement_IndexPage {

	public static void main(String[] args) {
		System.out.println("WebElement-Practice");
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/Software%20Testing/Practice/index%20(1).html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='uid']")).sendKeys("Snehal");
		driver.findElement(By.xpath("//input[@id='uid']")).clear();

		
		WebElement pass=driver.findElement(By.cssSelector("input[id='pid']"));
		pass.sendKeys("Pass@123");
		String passvalue=pass.getAttribute("value");
		System.out.println("Password Attribute value -"+ passvalue);
		
		WebElement passt=driver.findElement(By.cssSelector("label[for$='rd']"));
		String passtext=passt.getText();
		System.out.println("Pasword Text -"+ passtext);
		
		WebElement w= driver.findElement(By.cssSelector("select[id^='browser']"));
		Select s=new Select(w);
		s.selectByIndex(1);
		
		driver.findElement(By.xpath("/html/body/form/div/label[3]/input")).click();
		driver.findElement(By.cssSelector("button[id*='gi']")).submit();

	}

}
