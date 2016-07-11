package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import util.DriverFactory;
import util.Log;

public class HomePageSteps extends DriverFactory{
	
	
	@When("^I hover over Demosites tab$")
	public void i_hover_over_Demosites_tab() throws Throwable {
		 System.out.println("I hover over Demosites tab : code running");
		 Log.startTestStep("I hover over Demosites tab and click on option");
		 HomePage.clickOnAutomationPracticeFormLink();
	}

	@When("^I click on Automation Practice Form$")
	public void i_click_on_Automation_Practice_Form() throws Throwable {
		 System.out.println("I click on Automation Practice Form : Code not ready");
	}


}
