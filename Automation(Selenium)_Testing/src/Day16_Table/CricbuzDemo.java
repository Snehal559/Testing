package Day16_Table;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricbuzDemo {
	public static void main(String[] args) throws Exception {
		System.out.println("Hello");
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		//total rows
		WebElement inning1=driver.findElement(By.xpath("//div[@id='innings_1']/child ::div[1]")); //select all ing1table
		Thread.sleep(2000);
		List<WebElement> in1= inning1.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']"));
		int countrows=in1.size();
		System.out.println("Total Rows :"+countrows);
		System.out.println("...................................................................................................");
		//total Run
		int sum=0;
		for (int i = 0; i < countrows-2; i++) {
			String val=driver.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(3)")).get(i).getText();//css for 1 complete row-gettext return type string -use string
			int valrun= Integer.parseInt(val);
			sum=sum+valrun;
		}
		System.out.println("Total Run of inn-1 :"+sum);
		System.out.println("..................................................................................................");
		//Extra run
		String extrarunval=inning1.findElement(By.cssSelector("#innings_1 > div:nth-child(1) > div:nth-child(14) > div.cb-col.cb-col-8.text-bold.cb-text-black.text-right")).getText();
		int extrarun=Integer.parseInt(extrarunval); //covert string to int
		System.out.println("Extra Run :"+extrarun);
		System.out.println("...............................................................................................");
		int totalrun=sum+extrarun;
		System.out.println("Total Run :"+totalrun);
		System.out.println("..................................................................................................");
		
		//find total balls
		int sum1=0;
		for (int i = 0; i < countrows-2; i++) {
			String totballval=driver.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(4)")).get(i).getText();
			int totalball= Integer.parseInt(totballval);
			sum1=sum1+totalball;
		}
		System.out.println("Total Balls :"+sum1);
		System.out.println("..................................................................................................");
		//find total 4's
		int sum2=0;
		for (int i = 0; i < countrows-2; i++) {
			String value4=driver.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(5)")).get(i).getText();
			int total4=Integer.parseInt(value4);
			sum2=sum2+total4;
		}
		System.out.println("Total 4's :"+sum2);
		System.out.println("..................................................................................................");

		//find total 6's
		int sum3=0;
		for (int i = 0; i < countrows-2; i++) {
			String val6=driver.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(6)")).get(i).getText();
			int value6=Integer.parseInt(val6);
			sum3=sum3+value6;
		}
		System.out.println("Total 6's :"+sum3);
		System.out.println("................................................................................................");
	
	
	
	
	
	
	
	}
}