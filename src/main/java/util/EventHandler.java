package util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
 
public class EventHandler implements WebDriverEventListener{
 
	public void afterChangeValueOf(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
 
		Log.info("inside method afterChangeValueOf on " + arg0.toString());
	}
 
	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		Log.info("inside method afterClickOn on " + arg0.toString());
	}
 
	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub
		Log.info("Find happened on " + arg1.toString() 
				+ " Using method " + arg0.toString());
	}
 
	public void afterNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
 
		Log.info("Inside the after navigateback to " + arg0.getCurrentUrl());
	}
 
	public void afterNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		Log.info("Inside the afterNavigateForward to " + arg0.getCurrentUrl());
	}
	
	public void afterNavigateRefresh(WebDriver arg0)
	{
		Log.info("Inside the afterNavigateRefresh to " + arg0.getCurrentUrl());
	}
 
	public void afterNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		Log.info("Just after navigated to " + arg0);
	}
 
	public void afterScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		Log.info("Inside the afterScript to, Script is " + arg0);
	}
 
	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
 
		Log.info("Inside the beforeChangeValueOf method");
	}
 
	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		Log.info("About to click on the " + arg0.toString());
 
	}
 
	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub
		Log.info("Just before finding element " + arg1.toString());
 
	}
 
	public void beforeNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		Log.info("Just before beforeNavigateBack " + arg0.getCurrentUrl());
 
	}
 
	public void beforeNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		Log.info("Just before beforeNavigateForward " + arg0.getCurrentUrl());
 
	}
	public void beforeNavigateRefresh(WebDriver arg0)
	{
		Log.info("Inside the beforeNavigateRefresh to " + arg0.getCurrentUrl());
	}
 
	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		Log.info("Just before navigating to  " + arg0);
	}
 
	public void beforeScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		Log.info("Just before beforeScript " + arg0);
	}
 
	public void onException(Throwable arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		Log.error("Exception occured at " + arg0.getMessage());
 
	}
 
}