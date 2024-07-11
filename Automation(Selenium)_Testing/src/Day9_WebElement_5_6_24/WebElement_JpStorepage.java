package Day9_WebElement_5_6_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElement_JpStorepage {

	public static void main(String[] args) {
		System.out.println("WebElement-Practice");
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jpetstore.aspectran.com/account/newAccountForm");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Slkjhgf");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Pasword12");
		driver.findElement(By.cssSelector("input[name*='atedPas']")).sendKeys("Pasword12");
		driver.findElement(By.cssSelector("input[name^='firstNa']")).sendKeys("ABCabc");
		driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("CBAasd");
		driver.findElement(By.cssSelector("input[name$='ail']")).sendKeys("B@gmail.com");
		driver.findElement(By.cssSelector("input[name$='one']")).sendKeys("9632587412");
		driver.findElement(By.cssSelector("input[name='address1']")).sendKeys("Hinjewadi");
		driver.findElement(By.cssSelector("input[name='address2']")).sendKeys("Phase1");
		driver.findElement(By.cssSelector("input[name*='it']")).sendKeys("Pune");
		driver.findElement(By.cssSelector("input[name*='tat']")).sendKeys("Maharashtra");
		driver.findElement(By.cssSelector("input[name='zip']")).sendKeys("411044");
		driver.findElement(By.cssSelector("input[name$='ntry']")).sendKeys("India");
		
		WebElement we=driver.findElement(By.cssSelector("select[name$='languagePreference']"));
		Select s=new Select(we);
		s.selectByIndex(1);
		Boolean d=we.isDisplayed();
		System.out.println("Language Displayed ?"+d);
		String s1=we.getAttribute("value");
		System.out.println("Laguage Attribute :"+s1);
		
		WebElement w1=driver.findElement(By.cssSelector("select[name='favouriteCategoryId']"));
		Select s11=new Select(w1);
		s11.selectByIndex(2);
		
		WebElement w2=driver.findElement(By.cssSelector("input[name='listOption']"));
		w2.click();
		Boolean b=w2.isSelected();
		System.out.println("Enable MyList Selected ?"+b);
		
		driver.findElement(By.cssSelector("input[name*='erOpt']")).click();
		
		WebElement bb=driver.findElement(By.cssSelector("div.button-bar>button"));
		Boolean but=bb.isEnabled();
		System.out.println("Save Account Information is Enabled? "+but);
		bb.submit();

	}
}
