package Day16_Table;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricbuzInn2 {

	public static void main(String[] args) {
		System.out.println("Hello");
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		//inning-2
				WebElement in2=driver.findElement(By.xpath("//*[@id='innings_2']/div[1]"));
				List<WebElement> rowss= in2.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']"));
				int rowcount=rowss.size();
				System.out.println("***********Inning-2************");
				System.out.println("Total Rows :"+rowcount);
				System.out.println(".............................................................................................");
				int sum4=0;
				for (int i = 0; i < rowcount-3; i++) {
					String rval=driver.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(3)")).get(i).getText();
					int totrun=Integer.parseInt(rval);
					sum4=sum4+totrun;
				}
				System.out.println("Total Run :"+sum4);
			//Extra run
				String rextra=driver.findElement(By.cssSelector("#innings_1 > div:nth-child(1) > div:nth-child(14) > div.cb-col.cb-col-8.text-bold.cb-text-black.text-right")).getText();
				int er=Integer.parseInt(rextra);
				System.out.println("Extra Run :"+er);
				System.out.println("............................................................................................");
				int totalruns=er+sum4;
				System.out.println("Total Run :"+totalruns);
				System.out.println(".............................................................................................");
			//total Ball
				int sum5=0;
				for (int i = 0; i < rowcount-3; i++) {
					String bval=in2.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(4)")).get(i).getText();
					int bt=Integer.parseInt(bval);
					sum5=sum5+bt;
				}
				System.out.println("Total Balls :"+sum5);
				System.out.println("............................................................................................");
			//total 4
				int sum6=0;
				for (int i = 0; i < rowcount-3; i++) {
					String t4=in2.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(5)")).get(i).getText();
					int tot4=Integer.parseInt(t4);
					sum6=sum6+tot4;
				}
				System.out.println("Total 4's :"+ sum6);
			//total 6
				int sum7=0;
				for (int i = 0; i < rowcount-3; i++) {
					String t6=in2.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(6)")).get(i).getText();
					int tot6= Integer.parseInt(t6);
					sum7=sum7+tot6;
				}
				System.out.println("Total 6's :"+sum7);
			
	}

}
