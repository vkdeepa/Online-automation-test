package Execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {

	public static WebDriver driver = Hooks.driver;
	
	public DriverFactory() {
		// TODO Auto-generated constructor stub
	}

	public WebDriver LaunchBrowser(String Browser){
		System.out.println(Browser);
		switch (Browser.toUpperCase()){
		case "IE":
			System.setProperty("webdriver.ie.driver", "Dependencies/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;
		case "FIREFOX":
		    System.setProperty("webdriver.gecko.driver", ".\\Dependencies\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "CHROME":
			System.setProperty("webdriver.chrome.driver", "Dependencies/chromedriver");
			driver=new ChromeDriver();
			break;		
		}
		return driver;
	}
}
