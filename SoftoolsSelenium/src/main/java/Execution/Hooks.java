package Execution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	public static WebDriverWait wait;
	public static WebDriver driver;
	
	@Before
	public void CucumeberStartupClass(){
		String Browser = "firefox";
			DriverFactory driverclass = new DriverFactory();
			driver = driverclass.LaunchBrowser(Browser);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			wait = new WebDriverWait(driver, 60);
			System.out.println("test1");
			driver.manage().window().maximize();		
	}
	
	@After
	public void CucumberExitClass()
	{
		driver.quit();
	}
}
