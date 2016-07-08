package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class DriverFactory {
	
	protected static WebDriver genericdriver= null;
	protected static EventFiringWebDriver driver = null;
	protected static EventHandler handler=null;
	private String browser=null;
	
	public static void initialiseDriver()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/dvelayudhan/Files/chromedriver.exe");
		genericdriver = new ChromeDriver();
		driver = new EventFiringWebDriver(genericdriver);
		
	}

}
