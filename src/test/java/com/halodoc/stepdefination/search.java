package com.halodoc.stepdefination;

import org.apache.log4j.Logger;
import org.junit.Assert;

import com.halodoc.apps.launcher.TestHarness;
import com.halodoc.pageobjects.searchScreen;
import com.halodoc.apps.helper.LoggerHelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class search extends TestHarness {
	private searchScreen search;
	Logger log = LoggerHelper.getLogger(search.class);
	

	@When("^Skip Onboarding$")
	public void skip_Onboarding() throws Throwable {
		search = new searchScreen(testdriver);
		search.tap_skip();

	}

	@Given("^Tap Search$")
	public void tap_Search() throws Throwable {
		search = new searchScreen(testdriver);
		Assert.assertTrue(search.tap_searchbar());
	}


	

	@When("^Country Name is \"([^\"]*)\"$")
	public void country_Name_is(String arg1) throws Throwable {
		search = new searchScreen(testdriver);
		Assert.assertTrue(search.searchBar(arg1));
	}

	@Then("^HideKeyboard and Scroll$")
	public void scroll() throws Throwable {
		search = new searchScreen(testdriver);
		hidekeyboard();
		swipeUp_PDP();
		

	}
	
	@Then("^Verify India capital is New Delhi in Search bar$")
	public void verify_India_capital_is_New_Delhi_in_Search_bar() throws Throwable {
		Assert.assertEquals(search.verify_text_NewDelhi() ,search.getCapital());
	}

	@Then("^open 10th item in search result list$")
	public void open_th_item_in_search_result_list() throws Throwable {
		swipeUp_PDP();
		Assert.assertTrue(search.tap_deaptment());

	}
	
	@Then("^Click Bookmarks$")
	public void click_Bookmarks() throws Throwable {
		search = new searchScreen(testdriver);
		Assert.assertTrue(search.book());
	}

	@Then("^Tap Save button$")
	public void tap_Save_button() throws Throwable {
		Assert.assertTrue(search.save());
	}

	@Then("^Create New$")
	public void create_New() throws Throwable {
		Assert.assertTrue(search.create());
	}

	@When("^provide Name <\"([^\"]*)\">$")
	public void provide_Name(String arg1) throws Throwable {
		search = new searchScreen(testdriver);
		Assert.assertTrue(search.name(arg1));
	}

	@Then("^Description <\"([^\"]*)\">$")
	public void description(String arg1) throws Throwable {
		search = new searchScreen(testdriver);
		Assert.assertTrue(search.descrption(arg1));
	}

	@Then("^Tap ok$")
	public void tap_ok() throws Throwable {
		Assert.assertTrue(search.ok());
	}
	
	@Given("^user navigate to Home Page$")
	public void user_navigate_to_Home_Page() throws Throwable {
		search = new searchScreen(testdriver);
		Assert.assertTrue(search.back());
	}

	@Then("^Tap My Lists$")
	public void tap_My_Lists() throws Throwable {
		Assert.assertTrue(search.mylist());
	}

	@Then("^verify the recently saved page$")
	public void verify_the_recently_saved_page() throws Throwable {
		Assert.assertTrue(search.savedList());
	}
	

}
