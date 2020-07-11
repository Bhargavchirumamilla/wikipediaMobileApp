
package com.halodoc.apps.launcher;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.bson.Document;
import org.openqa.selenium.Dimension;
import org.testng.ITestContext;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.halodoc.apps.config.config;
import com.halodoc.apps.helper.LoggerHelper;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.HidesKeyboard;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.offset.PointOption;

public class TestHarness {

	DeviceWrapper deviceSetup;

	public static AppiumDriver<MobileElement> testdriver;
	public static AndroidDriver<MobileElement> Androiddriver;
	public static IOSDriver<MobileElement> iOSdriver;
	LoadConfigurations loadL18n;
	public static Properties configProperties;
	protected ArrayList<Document> testResults;
	static String Createdreport;
	Document testReportObject;
	LoadConfigurations load;
	String path;
	String name;
	public int testCaseID;
	public static ExtentReports extent;
	Logger log = LoggerHelper.getLogger(TestHarness.class);

	
	/**
	 * @param configFileName
	 *            to pass app configuration properties
	 * @return Android driver & iOS driver instance
	 * @throws InterruptedException
	 * @throws IOException
	 * 
	 * 
	 */

	@BeforeSuite

	@Parameters({ "configFileName" })
	public AppiumDriver<MobileElement> setupDriver(String configFileName) throws IOException, InterruptedException {
		loadconfigurations(configFileName);

		deleteScreenshots("Screenshots");
		deleteScreenshots("screenshotsFailedTests");

		if (!config.getPlatform().equalsIgnoreCase("iOS")) {

			testdriver = DeviceWrapper.StartAndroidDriver();
			log.info("Setup of Android Test Environment is started");
		} else {

			testdriver = DeviceWrapper.StartiOSDriver();
			log.info("Setup of iOS Test Environment is started");

		}
		log.info("The driver instance is " + testdriver.toString());

		return testdriver;

	}

	public void hidekeyboard() {
		if (config.getPlatform().equalsIgnoreCase("iOS")) {

			TouchAction tap = new TouchAction(testdriver);
			tap.tap(PointOption.point(1280, 1013)).perform();
		} else {

			((HidesKeyboard) testdriver).hideKeyboard();
		}
	}

	private void loadconfigurations(String configFileName) {

		log.info("Method called for loading config file.");
		load = new LoadConfigurations();
		load.LoadConfigurationsProperties(configFileName);

	}

	@AfterSuite
	public void stopTest(ITestContext context) throws InterruptedException {
		String reportPath = System.getProperty("user.dir") + "/TestResults/cucumber-reports/" + "TestAutomation.html";
		log.info("Report Path Location:  " + reportPath);
		testdriver.quit();
        DeviceWrapper.stopAppiumServer();

		

	}

	public static Timestamp getCurrentTime() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println("Current timestamp is: " + timestamp);
		return timestamp;
	}

	public void deleteScreenshots(String fileName) throws IOException {

		File file = new File(System.getProperty("user.dir") + "/" + fileName + "/");
		String[] myFiles;
		if (file.isDirectory()) {
			myFiles = file.list();
			for (int i = 0; i < myFiles.length; i++) {
				File myFile = new File(file, myFiles[i]);
				myFile.delete();
			}

		}

	}

	public void swipeUp() throws InterruptedException {
		Thread.sleep(2);
		Duration smallWait = Duration.ofMillis(1000);
		Dimension size = testdriver.manage().window().getSize();
		int startY = (int) (size.height * 0.90);
		int endY = (int) (size.height * 0.30);
		int startX = size.width / 2;

		TouchAction tAction = new TouchAction(testdriver);
		int iosEndY = (int) (size.height * 0.50);
		if (config.getPlatform().equalsIgnoreCase("iOS")) {
			tAction.press(startX, startY).waitAction(Duration.ofMillis(200)).moveTo(6, -iosEndY).release().perform();
		} else {
			tAction.press(startX, startY).waitAction(smallWait).moveTo(startX, endY).release().perform();
		}
		log.info("Swipe Up completed");
	}

	public void swipeUp_PDP() throws InterruptedException {
		Thread.sleep(1);
		Duration smallWait = Duration.ofMillis(1000);
		Dimension size = testdriver.manage().window().getSize();
		int startY = (int) (size.height * 0.40);
		int endY = (int) (size.height * 0.10);
		int startX = size.width / 2;

		TouchAction tAction = new TouchAction(testdriver);
		int iosEndY = (int) (size.height * 0.20);
		if (config.getPlatform().equalsIgnoreCase("iOS")) {
			tAction.press(startX, startY).waitAction(Duration.ofMillis(200)).moveTo(15, -iosEndY).release().perform();
		} else {
			tAction.press(startX, startY).waitAction(smallWait).moveTo(startX, endY).release().perform();
		}
		log.info("Swipe Up completed");
	}

}
