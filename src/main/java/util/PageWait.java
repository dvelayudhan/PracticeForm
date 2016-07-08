package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageWait {
	
	
	public static void waitTillPageLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

    public static WebElement waitForElementPresence(WebDriver driver, By by, int timeoutInSeconds)
     {
    	WebDriverWait wait = new WebDriverWait(driver, 20);
    wait.until( ExpectedConditions.presenceOfElementLocated(by) ); //throws a timeout exception if element not present after waiting <timeoutInSeconds> seconds
    return driver.findElement(by);
     }
    
    public static WebElement waitForElementToBeClickable(WebDriver driver , By by, int timeoutInSeconds)
    {
    	WebDriverWait wait = new WebDriverWait(driver, 20); // 5 seconds timeout
		wait.until(ExpectedConditions.elementToBeClickable(by));
		return driver.findElement(by);
    }
    
    public static void waitTillAttributeStateChange(WebDriver driver , By by,String attribute , String attributeValue , int timeoutInSeconds)
    {
    	WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds); // 5 seconds timeout
		wait.until(ExpectedConditions.attributeToBe(by, attribute , attributeValue));		
    }



}
