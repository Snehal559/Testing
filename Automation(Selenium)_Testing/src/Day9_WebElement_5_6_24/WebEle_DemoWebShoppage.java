package Day9_WebElement_5_6_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebEle_DemoWebShoppage {

	public static void main(String[] args) {
		System.out.println("WebElement-Practice");
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/Software%20Testing/Practice/index%20(1).html");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[id='uid']")).sendKeys("Masdfg");
		
		WebElement pass= driver.findElement(By.cssSelector("input[id*='pi']"));
		pass.sendKeys("Pasd@123");
		String pas=pass.getAttribute("value");
		System.out.println("Password = "+pas);
		Boolean p=pass.isDisplayed();
		System.out.println("PassWord is Displayed? "+p);
		WebElement gt= driver.findElement(By.cssSelector("label[for='password']>b"));
		String ss=gt.getText();
		System.out.println("Password Text ="+ss);
		
		WebElement cat=driver.findElement(By.id("browser"));
		Select s=new Select(cat);
		s.selectByIndex(1);
		
		WebElement t=driver.findElement(By.cssSelector("input[type^='chec']"));
		Boolean b=t.isSelected();
		System.out.println("RememberMe is Selected? "+b);
		
		WebElement log=driver.findElement(By.xpath("//button[@type='submit']"));
		Boolean l=log.isEnabled();
		System.out.println("Login button Enabled?"+l);
		
	}

}
