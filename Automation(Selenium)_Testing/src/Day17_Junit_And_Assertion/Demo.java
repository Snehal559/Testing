package Day17_Junit_And_Assertion;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Demo {
	@BeforeClass
	public static void m1()
	{
		System.out.println("Before Class");
	}
	@After
	public void m2()
	{
		System.out.println("After");
	}
	@Test
	public void m3()
	{
		System.out.println("Test-1");
	}
	@Test
	public void m4()
	{
		System.out.println("Test-2");
	}
	@Test
	public void m5()
	{
		System.out.println("Test-3");
	}
	@Before
	public void m6()
	{
		System.out.println("Before");
	}
	@AfterClass
	public static void m7()
	{
		System.out.println("After Class");
	}
}
