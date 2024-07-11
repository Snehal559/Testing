package Day18_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Demo {
  @Test
  public void f() {
	  System.out.println("Test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before-Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After-Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before-Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After-Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before-test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After-Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before-Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After-Suite");
  }

}