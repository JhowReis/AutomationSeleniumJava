package core;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	private static WebDriver driver;
	
	
	private DriverFactory() {}
	
	public static WebDriver getDriver() {
		if(driver == null) {
			System.setProperty("webdriver.chrome.driver", "/Users/jluiz/selenium/chromedriver.exe");
			switch (Propriedades.browser) {
				case FIREFOX: driver = new FirefoxDriver(); break;
				case CHROME: driver = new FirefoxDriver(); break;

			}
			driver.manage().window().setSize(new Dimension(1200, 765));
			
		}
		return driver;	
	}
	
	public static void killDriver() {
		if(driver != null) {

			driver.quit();
			driver = null;
			
		}
	}
}
