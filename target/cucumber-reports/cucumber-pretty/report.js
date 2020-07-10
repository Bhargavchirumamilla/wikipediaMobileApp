$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("WikimediaSearch.feature");
formatter.feature({
  "line": 2,
  "name": "Search Screen",
  "description": "",
  "id": "search-screen",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SanityTest"
    }
  ]
});
formatter.before({
  "duration": 1741968,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Skip and Tap Search",
  "description": "",
  "id": "search-screen;skip-and-tap-search",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Skip Onboarding",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Tap Search",
  "keyword": "When "
});
formatter.match({
  "location": "search.skip_Onboarding()"
});
formatter.result({
  "duration": 478910419,
  "status": "passed"
});
formatter.match({
  "location": "search.tap_Search()"
});
formatter.result({
  "duration": 2407803177,
  "status": "passed"
});
formatter.after({
  "duration": 1424129908,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Verify India capital is New Delhi in Search bar  Using API",
  "description": "",
  "id": "search-screen;verify-india-capital-is-new-delhi-in-search-bar--using-api",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "Country Name is \"\u003cIndia Country\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Verify India capital is New Delhi in Search bar",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "search-screen;verify-india-capital-is-new-delhi-in-search-bar--using-api;",
  "rows": [
    {
      "cells": [
        "India Country"
      ],
      "line": 15,
      "id": "search-screen;verify-india-capital-is-new-delhi-in-search-bar--using-api;;1"
    },
    {
      "cells": [
        "India capital"
      ],
      "line": 16,
      "id": "search-screen;verify-india-capital-is-new-delhi-in-search-bar--using-api;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 446429,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Verify India capital is New Delhi in Search bar  Using API",
  "description": "",
  "id": "search-screen;verify-india-capital-is-new-delhi-in-search-bar--using-api;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "Country Name is \"India capital\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Verify India capital is New Delhi in Search bar",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "India capital",
      "offset": 17
    }
  ],
  "location": "search.country_Name_is(String)"
});
formatter.result({
  "duration": 1705269066,
  "status": "passed"
});
formatter.match({
  "location": "search.verify_India_capital_is_New_Delhi_in_Search_bar()"
});
formatter.result({
  "duration": 7304411639,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[New Delhi]\u003e but was:\u003c[[New Delhi]]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:125)\n\tat org.junit.Assert.assertEquals(Assert.java:147)\n\tat com.halodoc.stepdefination.search.verify_India_capital_is_New_Delhi_in_Search_bar(search.java:52)\n\tat ✽.Then Verify India capital is New Delhi in Search bar(WikimediaSearch.feature:11)\n",
  "status": "failed"
});
formatter.after({
  "duration": 1253116624,
  "status": "passed"
});
formatter.before({
  "duration": 451488,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Verify Hide",
  "description": "",
  "id": "search-screen;verify-hide",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "HideKeyboard and Scroll",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "open 10th item in search result list",
  "keyword": "And "
});
formatter.match({
  "location": "search.scroll()"
});
formatter.result({
  "duration": 2882827547,
  "status": "passed"
});
formatter.match({
  "location": "search.open_th_item_in_search_result_list()"
});
formatter.result({
  "duration": 1563912006,
  "status": "passed"
});
formatter.after({
  "duration": 994566277,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 23,
  "name": "In wikipedia app search for string haldoc",
  "description": "",
  "id": "search-screen;in-wikipedia-app-search-for-string-haldoc",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 24,
  "name": "Click Bookmarks",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Tap Save button",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "Create New",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "provide Name \u003c\"haldocname\"\u003e",
  "keyword": "When "
});
formatter.examples({
  "line": 30,
  "name": "",
  "description": "",
  "id": "search-screen;in-wikipedia-app-search-for-string-haldoc;",
  "rows": [
    {
      "cells": [
        "haldocname"
      ],
      "line": 31,
      "id": "search-screen;in-wikipedia-app-search-for-string-haldoc;;1"
    },
    {
      "cells": [
        "haldoc"
      ],
      "line": 32,
      "id": "search-screen;in-wikipedia-app-search-for-string-haldoc;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 289736,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "In wikipedia app search for string haldoc",
  "description": "",
  "id": "search-screen;in-wikipedia-app-search-for-string-haldoc;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "Click Bookmarks",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Tap Save button",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "Create New",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "provide Name \u003c\"haldocname\"\u003e",
  "keyword": "When "
});
formatter.match({
  "location": "search.click_Bookmarks()"
});
formatter.result({
  "duration": 2533029434,
  "status": "passed"
});
formatter.match({
  "location": "search.tap_Save_button()"
});
formatter.result({
  "duration": 1242295948,
  "status": "passed"
});
formatter.match({
  "location": "search.create_New()"
});
formatter.result({
  "duration": 1258870035,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "haldocname",
      "offset": 15
    }
  ],
  "location": "search.provide_Name(String)"
});
formatter.result({
  "duration": 2458210546,
  "status": "passed"
});
formatter.after({
  "duration": 1276390589,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 34,
  "name": "In wikipedia app search for string test",
  "description": "",
  "id": "search-screen;in-wikipedia-app-search-for-string-test",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 35,
  "name": "Description \u003c\"testdes\"\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "Tap ok",
  "keyword": "And "
});
formatter.examples({
  "line": 37,
  "name": "",
  "description": "",
  "id": "search-screen;in-wikipedia-app-search-for-string-test;",
  "rows": [
    {
      "cells": [
        "testdes"
      ],
      "line": 38,
      "id": "search-screen;in-wikipedia-app-search-for-string-test;;1"
    },
    {
      "cells": [
        "test"
      ],
      "line": 39,
      "id": "search-screen;in-wikipedia-app-search-for-string-test;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 277483,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "In wikipedia app search for string test",
  "description": "",
  "id": "search-screen;in-wikipedia-app-search-for-string-test;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "Description \u003c\"testdes\"\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "Tap ok",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "testdes",
      "offset": 14
    }
  ],
  "location": "search.description(String)"
});
formatter.result({
  "duration": 729924810,
  "status": "passed"
});
formatter.match({
  "location": "search.tap_ok()"
});
formatter.result({
  "duration": 577584622,
  "status": "passed"
});
formatter.after({
  "duration": 1610547913,
  "status": "passed"
});
formatter.before({
  "duration": 261977,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "Open “My Lists” tab and verify the recently saved page.",
  "description": "",
  "id": "search-screen;open-“my-lists”-tab-and-verify-the-recently-saved-page.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 42,
  "name": "user navigate to Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 43,
  "name": "Tap My Lists",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "verify the recently saved page",
  "keyword": "And "
});
formatter.match({
  "location": "search.user_navigate_to_Home_Page()"
});
formatter.result({
  "duration": 1762161325,
  "status": "passed"
});
formatter.match({
  "location": "search.tap_My_Lists()"
});
formatter.result({
  "duration": 2226732837,
  "status": "passed"
});
formatter.match({
  "location": "search.verify_the_recently_saved_page()"
});
formatter.result({
  "duration": 877572034,
  "status": "passed"
});
formatter.after({
  "duration": 964235972,
  "status": "passed"
});
});