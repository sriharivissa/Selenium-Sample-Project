package Screenshot;

import org.junit.Assert;
import org.testng.annotations.Test;

public class SecondTest {
	@Test
	public void tc_1() {
		System.out.println("Testcase 1");
	}
	@Test
	public void tc_2() {
		System.out.println("Testcase 2");
		Assert.assertTrue(false);
	}
	@Test
	public void tc_3() {
		System.out.println("Testcase 3");
	}
	

}
