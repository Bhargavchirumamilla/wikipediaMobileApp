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
  "duration": 2081906,
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
  "duration": 700586251,
  "status": "passed"
});
formatter.match({
  "location": "search.tap_Search()"
});
formatter.result({
  "duration": 2613099825,
  "status": "passed"
});
formatter.after({
  "duration": 1427037881,
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
  "duration": 428538,
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
  "duration": 806011297,
  "status": "passed"
});
formatter.match({
  "location": "search.verify_India_capital_is_New_Delhi_in_Search_bar()"
});
formatter.result({
  "duration": 5613997625,
  "status": "passed"
});
formatter.after({
  "duration": 1153029218,
  "status": "passed"
});
formatter.before({
  "duration": 465170,
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
  "duration": 2898602918,
  "status": "passed"
});
formatter.match({
  "location": "search.open_th_item_in_search_result_list()"
});
formatter.result({
  "duration": 1611685288,
  "status": "passed"
});
formatter.after({
  "duration": 1082994939,
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
  "duration": 390649,
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
  "duration": 1140278381,
  "status": "passed"
});
formatter.match({
  "location": "search.tap_Save_button()"
});
formatter.result({
  "duration": 1485975359,
  "status": "passed"
});
formatter.match({
  "location": "search.create_New()"
});
formatter.result({
  "duration": 1228599894,
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
  "duration": 2760570823,
  "status": "passed"
});
formatter.after({
  "duration": 1249505175,
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
  "duration": 421099,
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
  "duration": 777279543,
  "status": "passed"
});
formatter.match({
  "location": "search.tap_ok()"
});
formatter.result({
  "duration": 1280418383,
  "status": "passed"
});
formatter.after({
  "duration": 1705286925,
  "status": "passed"
});
formatter.before({
  "duration": 291342,
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
  "duration": 1800141681,
  "status": "passed"
});
formatter.match({
  "location": "search.tap_My_Lists()"
});
formatter.result({
  "duration": 2643701779,
  "status": "passed"
});
formatter.match({
  "location": "search.verify_the_recently_saved_page()"
});
formatter.result({
  "duration": 851696794,
  "status": "passed"
});
formatter.after({
  "duration": 1000829148,
  "status": "passed"
});
});