package utils;

import org.testng.ITestContext;
import org.testng.ITestListener;

public class ListinersForTests implements ITestListener {

	@Override
	public void onStart(ITestContext context) {
		System.out.println("TEST STARTED");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("TEST FINISHED");
	}

}
