
package com.halodoc.apps.launcher;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import java.net.URL;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.halodoc.apps.config.config;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class DeviceWrapper {

	static AppiumDriverLocalService service;

	private static AndroidDriver<MobileElement> androidDriver;
	private static IOSDriver<MobileElement> iOSDriver;
	protected static Logger log = LogManager.getLogger(Logger.class.getName());

	public static AppiumDriver<MobileElement> StartAndroidDriver() throws MalformedURLException, InterruptedException {
		service = AppiumDriverLocalService
				.buildService(new AppiumServiceBuilder().usingDriverExecutable(new File(config.getNodePath()))
						.withAppiumJS(new File(config.getAppiumPath())).withIPAddress("0.0.0.0")
						.usingPort(config.getPort()).withLogFile(new File(config.getAppiumlogfilepath())));
		service.start();

		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability(MobileCapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, true);
		capability.setCapability(MobileCapabilityType.UNHANDLED_PROMPT_BEHAVIOUR, true);
		capability.setCapability(MobileCapabilityType.AUTOMATION_NAME, config.getAutomationName());
		capability.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		capability.setCapability(MobileCapabilityType.DEVICE_NAME, config.getAndroidDeviceName());
		capability.setCapability(MobileCapabilityType.PLATFORM_VERSION, config.getMobileVersion());
		capability.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, config.getImplictwaittime());
        capability.setCapability(MobileCapabilityType.ACCEPT_SSL_CERTS, true);
		capability.setCapability("autoWebView", "true");
		capability.setCapability("INSTALL_GRANT_RUNTIME_PERMISSIONS", "true");
		capability.setCapability(MobileCapabilityType.NO_RESET,"false");
		capability.setCapability("webContentsDebuggingEnabled", "true");
		capability.setCapability(MobileCapabilityType.UDID, config.getDeviceUDID());

		capability.setCapability("appActivity", "org.wikipedia.main.MainActivity");
		capability.setCapability("appPackage", "org.wikipedia");

		Thread.sleep(3000);
		androidDriver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:" + config.getPort() + "/wd/hub"),
				capability);
		androidDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);		boolean deviceLocked = androidDriver.isDeviceLocked();
		if (deviceLocked == true) {
			androidDriver.unlockDevice();
		}
		return androidDriver;

	}

	public static AppiumDriver<MobileElement> StartiOSDriver() throws MalformedURLException, InterruptedException {
		service = AppiumDriverLocalService
				.buildService(new AppiumServiceBuilder().usingDriverExecutable(new File(config.getNodePath()))
						.withAppiumJS(new File(config.getAppiumPath())).withIPAddress("0.0.0.0")
						.usingPort(config.getPort()).withLogFile(new File(config.getAppiumlogfilepath())));
		service.start();
		DesiredCapabilities capability = new DesiredCapabilities();

		capability.setCapability(MobileCapabilityType.AUTOMATION_NAME, config.getAutomationName());
		capability.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
		capability.setCapability(MobileCapabilityType.DEVICE_NAME, config.getIphoneDeviceName());
		capability.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, config.getImplictwaittime());
		capability.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.2");
		capability.setCapability("appActivity", "org.wikipedia.main.MainActivity");
		capability.setCapability("appPackage", "org.wikipedia");
        capability.setCapability(MobileCapabilityType.FULL_RESET, true);
		capability.setCapability(MobileCapabilityType.UDID, config.getDeviceUDID());
		capability.setCapability("showXcodeLog", "true");
		capability.setCapability("useNewWDA", "true");
		// capability.setCapability("sendKeyStrategy", "setValue");
		capability.setCapability("autoWebView", "true");
		capability.setCapability("realDeviceLogger", "/usr/local/bin/idevicesyslog");
		capability.setCapability(MobileCapabilityType.TAKES_SCREENSHOT, "true");
		Thread.sleep(2000);
		iOSDriver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:" + config.getPort() + "/wd/hub"),
				capability);
		iOSDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		return iOSDriver;
	}
	
	public static void stopAppiumServer() throws InterruptedException {

		log.info("Stoping appium server");
		String stopCommand = "-i:" + config.getPort();
		Runtime runtime = Runtime.getRuntime();
		try {
			// appiumProcess.setProcessDestroyer(appiumProcess.getProcessDestroyer());

			Process process = runtime.exec(new String[] { "lsof", "-t", stopCommand });
			BufferedReader r = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line = "";
			String pid = "";
			while ((line = r.readLine()) != null) {
				Process killProcess = runtime.exec(new String[] { "ps", "-p", line, "-o", "comm=" });
				BufferedReader br = new BufferedReader(new InputStreamReader(killProcess.getInputStream()));
				pid = br.readLine();
				if (pid.equals("/usr/local/bin/node")) {
					runtime.exec(new String[] { "kill", line });
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			log.info("Appium server not found");
		}
		
	}

}
