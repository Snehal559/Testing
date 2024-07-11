package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

public static void main(String [] args) {
System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
driver.manage().window().maximize();


		//total rows
WebElement inning1=driver.findElement(By.xpath("//div[@id='innings_1']/child ::div[1]"));
//WebElement inning1=driver.findElement(By.cssSelector("//div[@id='innings_1']/child ::div[1]")); //select all ing1table
List<WebElement> in1= inning1.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']"));
int countrows=in1.size();
System.out.println("Total Rows :"+countrows);

//total 6
int sum=0;
for(int i=0 ; i<countrows-2 ;i++)
{
String six=inning1.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(6)")).get(i).getText();
int nsix=Integer.parseInt(six);
int totalSix =sum+nsix;
System.out.println(totalSix);
}

//total 4
int sum1=0;
for(int i=0; i<countrows-2 ;i++)
{
String four=inning1.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(5)")).get(i).getText();
int nfour=Integer.parseInt(four);
int totalfour=sum1+nfour;
System.out.println(totalfour);
}

//total ball
int sum2=0;
for(int i=0; i<countrows-2 ;i++)
{
String ball=inning1.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(4)")).get(i).getText();
int nball=Integer.parseInt(ball);
int Totalball=nball+sum2;
System.out.println(Totalball);
}

}
}
