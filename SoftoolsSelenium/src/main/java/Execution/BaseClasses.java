package Execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClasses {
	public static WebDriver driver;
	public static WebDriverWait wait; 
	
	public BaseClasses(){
		driver  = Hooks.driver;
		wait = Hooks.wait;
		PageFactory.initElements(driver, this);
		//LoginPage.class
	}
}
