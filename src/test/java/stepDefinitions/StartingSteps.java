package stepDefinitions;

import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Assert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import util.DriverFactory;
import util.EventHandler;
import util.Log;
import util.PropertyReader;

public class StartingSteps extends DriverFactory {
	
	
	
	@Before ("@Setup")
	public void setupAction() throws Exception
	{
		   DOMConfigurator.configure("log4j.xml");
		   Log.info("Initialising driver");
		   initialiseDriver();
		   handler = new EventHandler();
		   driver.register(handler);
		    
	}
	
	@Given("^I am on the site home page$")
	public void i_am_on_the_site_home_page() throws Throwable {
	   System.out.println("I am on the site home page : Code running");
	   try
	   {
	   Log.startTestStep("I am on the site home page");
	   Log.info("Reading url from config file");
	   String url = new PropertyReader().readProperty("url");
	   Log.info("Loading the url");
	   driver.get(url);
	   driver.manage().window().maximize();
	   String currenturl= driver.getCurrentUrl();
	   Assert.assertTrue("Assertion failed :Home page is not launched", url.equals(currenturl));
	   Log.info("Assertion pass : I am on the site home page");
	   Log.endTestStep();
	   }
	   catch(Exception e)
	   {
		   Log.error("Assertion failed . Exception caught by try catch block : " + e.getMessage());
		   throw e ;
	   }
	}
	
	@After("@Setup")
	public static void teardownAction()
	{
		driver.unregister(handler);
		//driver.close();
	}
	

}
