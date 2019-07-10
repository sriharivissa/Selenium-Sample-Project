package Screenshot;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class CustomListener extends TestListenerAdapter{
	
	@Override
	public void onTestFailure(ITestResult arg0) {
		System.out.println("captureScreenshot");
	}
	

}
