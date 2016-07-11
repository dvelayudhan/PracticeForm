package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.DriverFactory;
import util.PageWait;

public class HomePage extends DriverFactory {

	static By demoSitesTab = By.xpath("//ul[@id='main-nav']/li[9]/a");
	static By automationPracticeFormLink = By.xpath("//ul[@id='main-nav']/li[9]/ul/li[3]/a");
	
	public static WebElement demoSitesTab()
	{
		PageWait.waitForElementPresence(driver, demoSitesTab, 10);
		WebElement element= driver.findElement(demoSitesTab);
		if(element.isDisplayed())
		{
			System.out.println("demoSitesTab is displayed");
			
		}
		else
			System.out.println("demoSitesTab is not displayed");
		
		return element;
	}
	
	public static WebElement automationPracticeFormLink()
	{
		PageWait.waitForElementToBeClickable(driver, automationPracticeFormLink, 10);
		return driver.findElement(automationPracticeFormLink);
	}
	
	public static void clickOnAutomationPracticeFormLink()
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(demoSitesTab()).build().perform();		
		automationPracticeFormLink().click();
	}
	
}
