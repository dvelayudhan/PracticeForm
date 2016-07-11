$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("00Practiceform.feature");
formatter.feature({
  "line": 1,
  "name": "Launch the automation practice form",
  "description": "",
  "id": "launch-the-automation-practice-form",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2838046019,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Title of your scenario",
  "description": "",
  "id": "launch-the-automation-practice-form;title-of-your-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Setup"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on the site home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I hover over Demosites tab",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on Automation Practice Form",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I am redirected to the practice form page",
  "keyword": "Then "
});
formatter.match({
  "location": "StartingSteps.i_am_on_the_site_home_page()"
});
formatter.result({
  "duration": 6909638371,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.i_hover_over_Demosites_tab()"
});
formatter.result({
  "duration": 2271397282,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.i_click_on_Automation_Practice_Form()"
});
formatter.result({
  "duration": 49072,
  "status": "passed"
});
formatter.match({
  "location": "PracticeFormPageSteps.i_am_redirected_to_the_practice_form_page()"
});
formatter.result({
  "duration": 81466,
  "status": "passed"
});
formatter.after({
  "duration": 22772,
  "status": "passed"
});
});