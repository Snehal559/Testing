package Day7_CCSSelector_3_6_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_CSS_Practice {
	public static void main(String[] args) {
		
	System.out.println("Amazon-LogIn-Practice");
	System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5j0bx521tf_e&adgrpid=150668181581&hvpone=&hvptwo=&hvadid=674842289449&hvpos=&hvnetw=g&hvrand=7378221079783531823&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302442&hvtargid=kwd-10544572015&hydadcr=5621_2359492&gad_source=1");
	driver.findElement(By.cssSelector("span[id='nav-link-accountList-nav-line-1']")).click();
	driver.findElement(By.xpath("//input[@aria-describedby='Enter your email or mobile phone number']")).sendKeys("8421849833");
	driver.findElement(By.cssSelector("input[aria-labelledby='continue-announce']")).click();
	driver.findElement(By.cssSelector("input[id='ap_password']")).sendKeys("Snehal@001");
	driver.findElement(By.id("signInSubmit")).click();
	driver.findElement(By.cssSelector("div[id='nav-tools'] span[class='nav-line-2 ']")).click();
	//driver.findElement(By.cssSelector("span[class='nav-text']")).click();
}
}