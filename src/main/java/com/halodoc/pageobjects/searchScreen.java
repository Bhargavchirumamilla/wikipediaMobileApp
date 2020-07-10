package com.halodoc.pageobjects;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.halodoc.apps.helper.LoggerHelper;
import com.halodoc.apps.launcher.TestHarness;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class searchScreen extends TestHarness {
	AppiumDriver<MobileElement> driver;
	protected static Logger log = LoggerHelper.getLogger(searchScreen.class);

	public searchScreen(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@AndroidFindBy(id = "org.wikipedia:id/search_container")
	@iOSFindBy(id = "need ipa")
	private MobileElement searchBar;

	@AndroidFindBy(id = "org.wikipedia:id/search_src_text")
	@iOSFindBy(id = "need ipa")
	private MobileElement searchBar_text;

	@AndroidFindBy(id = "org.wikipedia:id/secondary_text_input")
	@iOSFindBy(id = "need ipa")
	private MobileElement searchBar_dec;

	@AndroidFindBy(id = "org.wikipedia:id/page_list_item_title")
	@iOSFindBy(id = "need ipa")
	List<MobileElement> searchDepatment;

	@AndroidFindBy(id = "org.wikipedia:id/fragment_onboarding_skip_button")
	@iOSFindBy(id = "need ipa")
	private MobileElement skip;

	@AndroidFindBy(accessibility = "Add this article to a reading list")
	@iOSFindBy(id = "need ipa")
	private MobileElement book;

	public boolean book() {
		book.click();
		return true;
	}

	public boolean save() {
		try {

			save.click();
		} catch (Exception ex) {

		}
		return true;
	}

	@AndroidFindBy(id = "org.wikipedia:id/onboarding_button")
	@iOSFindBy(id = "need ipa")
	private MobileElement save;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Create new']")
	@iOSFindBy(id = "need ipa")
	private MobileElement create;

	@AndroidFindBy(id = "android:id/button1")
	@iOSFindBy(id = "need ipa")
	private MobileElement ok;

	@AndroidFindBy(id = "org.wikipedia:id/text_input")
	@iOSFindBy(id = "need ipa")
	private MobileElement name;

	@AndroidFindBy(id = "org.wikipedia:id/secondary_text_input")
	@iOSFindBy(id = "need ipa")
	private MobileElement descrption;

	@AndroidFindBy(className = "android.widget.ImageButton")
	@iOSFindBy(id = "need ipa")
	private MobileElement back;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc='My lists']/android.widget.ImageView")
	@iOSFindBy(id = "need ipa")
	private MobileElement mylist;

	@AndroidFindBy(id = "org.wikipedia:id/item_title")
	@iOSFindBy(id = "need ipa")
	private MobileElement savedList;

	public boolean savedList() {
		// Verify saved item is present
		savedList.isEnabled();
		return true;
	}

	public boolean create() {
		create.click();
		return true;
	}

	public boolean back() {
		back.click();
		back.click();
		return true;
	}

	public boolean mylist() {
		mylist.click();
		return true;
	}

	public boolean name(String arg1) {
		name.sendKeys(arg1);
		return true;

	}

	public boolean descrption(String arg1) {
		searchBar_dec.sendKeys(arg1);
		return true;

	}

	public boolean ok() {
		ok.click();
		return true;
	}

	public boolean tap_skip() {
		try {
			Thread.sleep(3);
			skip.click();
		} catch (Exception ex) {

		}
		return true;
	}

	public boolean tap_searchbar() throws InterruptedException {
		Thread.sleep(3);
		searchBar.click();
		Thread.sleep(3);
		return true;
	}

	public boolean searchBar(String arg1) {
		searchBar_text.sendKeys(arg1);
		return true;

	}

	public String verify_text_NewDelhi() throws InterruptedException {
		String title;
		title = searchDepatment.get(0).getAttribute("text").trim();
		log.info("User found text in screen is available : " + title);
		return title;
	}

	public boolean tap_deaptment() {
		searchDepatment.get(4).click();
		return true;
	}

	// public static void main(String[] args) {
	public String getCapital() {
		String capital;
		RestAssured.baseURI = "https://restcountries.eu";
		RestAssured.basePath = "rest/v2";
		RequestSpecification request = RestAssured.given().relaxedHTTPSValidation();
		Response response = request.log().all().pathParam("name", "india").queryParams("fullText", "true")
				.get("/name/" + "{name}");
        response.then().log().all();
		JsonPath jsonPathEvaluator = response.jsonPath();
		log.info(" country related capital----------->" + jsonPathEvaluator.getString("capital"));
		capital = jsonPathEvaluator.getString("capital");
		capital = capital.replace("[", "").replace("]", "");
		log.info(" ---- New capital after replace is : " + capital);
		return capital;
		

	}
}
