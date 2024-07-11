package Day13_Cookies_12_6_24;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulShetyCookies {

	public static void main(String[] args) {
		System.out.println("Hello");
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		Set<Cookie> cookies=driver.manage().getCookies();
		int count=cookies.size();
		System.out.println("Total Cookies :"+count);
		
		for(Cookie cookie : cookies)
		{
			System.out.println("Cookies Name:"+ cookie.getName());
			System.out.println("Cookies Domain:"+ cookie.getDomain());
			System.out.println("Cookies Class:"+ cookie.getClass());
			System.out.println("Cookies Value:"+ cookie.getValue());
			System.out.println("Cookies Path:"+ cookie.getPath());
			System.out.println("Cookies Expiry:"+ cookie.getExpiry());
			System.out.println("Cookies isHttpOnly:"+ cookie.isHttpOnly());
			System.out.println("Cookies isSecure:"+ cookie.isSecure());
			System.out.println(".............................................");
		}
		
		driver.manage().deleteCookieNamed("rahulshettyacademy_session");
		
		Set<Cookie> cookies1=driver.manage().getCookies();
		int count1=cookies1.size();
		System.out.println("count1");
		
		Cookie add=new Cookie("Number","9874569874");
		driver.manage().addCookie(add);
		
		Set<Cookie> cookies2=driver.manage().getCookies();
		int count2=cookies2.size();
		System.out.println("count2");
	}

}
