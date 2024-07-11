package Day13_Cookies_12_6_24;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieFlipkart {
	public static void main(String[] args) {
		System.out.println("Hello");
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		Set<Cookie> cookies=driver.manage().getCookies();
		int count=cookies.size();
		System.out.println("Count :"+count);
		
		for(Cookie cookie : cookies)
		{
			System.out.println("Cookies Name :"+cookie.getName());
			System.out.println("Cookies Domain :"+cookie.getDomain());
			System.out.println("Cookies Class :"+cookie.getClass());
			System.out.println("Cookies Value :"+cookie.getValue());
			System.out.println("Cookies Expiry :"+cookie.getExpiry());
			System.out.println("Cookies Path :"+cookie.getPath());
			System.out.println("Cookies isHttpOnly :"+cookie.isHttpOnly());
			System.out.println("Cookies isSecure :"+cookie.isSecure());
			System.out.println("............................................");
		}
		
		driver.manage().deleteCookieNamed("_px3");//Delete Cookie
		
		Set<Cookie> cookies1=driver.manage().getCookies();//check count
		int count1=cookies1.size();
		System.out.println(count1);
		
		Cookie add=new Cookie("XYZ","Snehal");//add custom cookies
		driver.manage().addCookie(add);
		
	}

}
