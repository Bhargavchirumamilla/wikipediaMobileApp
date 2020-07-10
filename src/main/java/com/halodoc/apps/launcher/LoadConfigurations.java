package com.halodoc.apps.launcher;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.halodoc.apps.config.config;


public class LoadConfigurations {

	
	Properties configproperties;
	Properties configpropertieslang;
	config runTimeConfigurations;

	protected static Logger log = LogManager.getLogger(Logger.class.getName());

	private Properties loadConfigProperties(String configFileName) {

		return configproperties = loadProperties(System.getProperty("user.dir") + "/Resources/" + configFileName);
	}

	private Properties loadProperties(String propertyFileName) {
		Properties prop = new Properties();
		InputStream input = null;
		try {
			log.info("Reading of config file started");
			input = new FileInputStream(propertyFileName);
			prop.load(input);
			prop.load(new InputStreamReader(input, "UTF-8"));
		} catch (IOException e) {
			log.error("Reading the config file failed because of IOException." + propertyFileName);
		}

		return prop;

	}

	public void LoadConfigurationsProperties(String configFileName) {

		loadConfigProperties(configFileName);
		config.setPlatform(configproperties.getProperty("platform"));
		log.info(config.getPlatform());
		config.setCountry(configproperties.getProperty("country"));
		String port = (String) configproperties.get("port");
		int portInteger = Integer.parseInt(port, 10);
		config.setPort(portInteger);
		config.setLanguage(configproperties.getProperty("language"));
		config.setConcept(configproperties.getProperty("concept"));
		config.setAppiumPath(configproperties.getProperty("appiumpath"));
		config.setAppiumlogfilepath(configproperties.getProperty("appiumlogfilepath"));
		config.setAndroidDeviceName(configproperties.getProperty("androidDeviceName"));
		config.setIphoneDeviceName(configproperties.getProperty("iphoneDeviceName"));
		config.setTakescreenshot(configproperties.getProperty("takescreenshot"));
		config.setImplictwaittime(configproperties.getProperty("implictwaittime"));
		config.setAutomationName(configproperties.getProperty("automationname"));
		config.setAppFilePath(configproperties.getProperty("appFilePath"));
		config.setNodePath(configproperties.getProperty("nodePath"));
		config.setBuildVersion(configproperties.getProperty("buildVersion"));
		config.setExecutionType(configproperties.getProperty("executionType"));
		config.setCloudExecution(configproperties.getProperty("cloudExecution"));
		config.setAppPackage(configproperties.getProperty("appPackage"));
		config.setgetBundleID(configproperties.getProperty("bundileID"));
		config.setdDeviceUDID(configproperties.getProperty("deviceUDID"));
		config.setMobileVersion(configproperties.getProperty("mobileVersion"));
		config.setPromoExecution(configproperties.getProperty("promoCodeExecution"));
	}

	public Properties loadL18nProperties(String configFileName) {
		return loadConfigProperties(configFileName);
	}
}
