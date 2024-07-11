package Day17_Junit_And_Assertion;

import org.junit.Assert;
import org.junit.Test;

public class AddTest {
	@Test
	public void addTest() {
		Add a=new Add();
		int sum = a.add(10, 30);
		//Assert.assertEquals(sum, 20);//error expected 40 instead of 20
		Assert.assertEquals(sum, 40); //Runs=1/1,error=0,failure-0
	}
}
