package Execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	public BasePage(){
		driver = Hooks.driver;
		wait = Hooks.wait;
	}
}
