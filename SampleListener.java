package Danthi.src.com.GenericFunctions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class SampleListener implements ITestListener {

	public static WebDriver driver;
	
	@Override
	public void onTestFailure(ITestResult tf) {
		// get failed test name and store into tf
				String failedTestName=tf.getName();
						
				//EventFiringWebDriver is a class used to perform file copy action here
				EventFiringWebDriver eDriver=new EventFiringWebDriver(driver);
						
				//identify source file
				File srcFile=eDriver.getScreenshotAs(OutputType.FILE);
						
				//identify source file
				File destFile=new File("./Danthi.Screenshot/"+failedTestName+".png");
						
				//Perform copy
				try {
						FileUtils.copyFile(srcFile, destFile);
					} catch (IOException e) 
						{
							e.printStackTrace();
						}
	}


	@Override
	public void onFinish(ITestContext c) 
	{
		// get failed test name and store into c
				String failedTestName=c.getName();
						
				//EventFiringWebDriver is a class used to perform file copy action here
				EventFiringWebDriver eDriver=new EventFiringWebDriver(driver);
						
				//identify source file
				File srcFile=eDriver.getScreenshotAs(OutputType.FILE);
						
				//identify source file
				File destFile=new File("./Danthi.Screenshot/"+failedTestName+".png");
						
				//Perform copy
				try {
						FileUtils.copyFile(srcFile, destFile);
					} catch (IOException e) 
						{
							e.printStackTrace();
						}
	}	
	

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult tr) {
		// get failed test name and store into tr
		String failedTestName=tr.getName();
				
		//EventFiringWebDriver is a class used to perform file copy action here
		EventFiringWebDriver eDriver=new EventFiringWebDriver(driver);
				
		//identify source file
		File srcFile=eDriver.getScreenshotAs(OutputType.FILE);
				
		//identify source file
		File destFile=new File("./Danthi.Screenshot/"+failedTestName+".png");
				
		//Perform copy
		try {
				FileUtils.copyFile(srcFile, destFile);
			} catch (IOException e) 
				{
					e.printStackTrace();
				}
	}
	
	@Override
	public void onTestSkipped(ITestResult ts) {
		// get failed test name and store into ts
				String failedTestName=ts.getName();
						
				//EventFiringWebDriver is a class used to perform file copy action here
				EventFiringWebDriver eDriver=new EventFiringWebDriver(driver);
						
				//identify source file
				File srcFile=eDriver.getScreenshotAs(OutputType.FILE);
						
				//identify source file
				File destFile=new File("./Danthi.Screenshot/"+failedTestName+".png");
						
				//Perform copy
				try {
						FileUtils.copyFile(srcFile, destFile);
					} catch (IOException e) 
						{
							e.printStackTrace();
						}
		
	}

	@Override
	public void onTestStart(ITestResult tst) {
		// get failed test name and store into tst
				String failedTestName=tst.getName();
						
				//EventFiringWebDriver is a class used to perform file copy action here
				EventFiringWebDriver eDriver=new EventFiringWebDriver(driver);
						
				//identify source file
				File srcFile=eDriver.getScreenshotAs(OutputType.FILE);
						
				//identify source file
				File destFile=new File("./Danthi.Screenshot/"+failedTestName+".png");
						
				//Perform copy
				try {
						FileUtils.copyFile(srcFile, destFile);
					} catch (IOException e) 
						{
							e.printStackTrace();
						}
		
	}

	@Override
	public void onTestSuccess(ITestResult tsu) {
		// get failed test name and store into tsu
				String failedTestName=tsu.getName();
						
				//EventFiringWebDriver is a class used to perform file copy action here
				EventFiringWebDriver eDriver=new EventFiringWebDriver(driver);
						
				//identify source file
				File srcFile=eDriver.getScreenshotAs(OutputType.FILE);
						
				//identify source file
				File destFile=new File("./Danthi.Screenshot/"+failedTestName+".png");
						
				//Perform copy
				try {
						FileUtils.copyFile(srcFile, destFile);
					} catch (IOException e) 
						{
							e.printStackTrace();
						}
	}

	@Override
	public void onStart(ITestContext os) {
		// get failed test name and store into os
				String failedTestName=os.getName();
						
				//EventFiringWebDriver is a class used to perform file copy action here
				EventFiringWebDriver eDriver=new EventFiringWebDriver(driver);
						
				//identify source file
				File srcFile=eDriver.getScreenshotAs(OutputType.FILE);
						
				//identify source file
				File destFile=new File("./Danthi.Screenshot/"+failedTestName+".png");
						
				//Perform copy
				try {
						FileUtils.copyFile(srcFile, destFile);
					} catch (IOException e) 
						{
							e.printStackTrace();
						}
	}
}
