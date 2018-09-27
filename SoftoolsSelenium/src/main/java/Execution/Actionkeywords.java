package Execution;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Actionkeywords extends BasePage{
	public static WebElement element;
	
	/***  Enters data in the required field using xpath and data given  ***/
	public static void set_Val(String xpathValue, String value){
		try {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathValue))).sendKeys(value);		
		}
		catch (Exception e) {
			System.out.println("The Exception is caused in set_Val due to" + e);
		}
		}
	
	/***  Click on the required item using xpath ***/
	public static void click(String xpathValue){
		try {
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathValue))).click();	
		}
		catch(Exception e) {
			System.out.println("The Exception is caused in click due to" + e);
		}
	}
	
	/*** Checks whether the given element is present   ***/
	public static void is_Displayed(String xpathValue) {
		try {
			Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathValue)));
			//System.out.println("Test case passed");
		}
		catch(Exception e) {
			System.out.println("The exception is caused in is_Displayed due to" + e);
			//System.out.println("Test case failed");
		}
	}
	
	/*** Checks whether the given element is present   
	 * @return ***/
	public static boolean is_Found(String xpathValue) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathValue)));
			System.out.println("Test case passed");
			return true;
		}
		catch(Exception e) {
			System.out.println("The exception is caused in is_Displayed due to" + e);
			System.out.println("Test case failed");
			return false;
		}
	}
	
	/***  Selects a value in the required field using xpath(visible text in the dropdown)and data given ***/
	public static void select(String xpathValue, String value) {
		try {
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathValue)));
		Select selectItem = new Select(element);
		selectItem.selectByVisibleText(value);	
		}
		catch(Exception e) {
			System.out.println("The exception is caused in select due to" + e);
		}
	}
	
	/***  Click on the required item using xpath by using Action class  ***/
	public static void performClick(String xpathValue) {
		try {
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathValue)));
		Actions action = new Actions(driver);
		action.moveToElement(element).click().build().perform();
		}
		catch(Exception e) {
			System.out.println("The exception is caused in performClick due to" + e);
		}
	}
	
	/***  Click on the required item using xpath by using javascriptExcutor class  ***/
	public static void clickElement(String xpathValue) {
		try {
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathValue)));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
		}
		catch (Exception e){
			System.out.println("The exception is caused in clickElement due to" + e);
		}
	}
	
	/***  Hover on the required item using xpath by using Action class  ***/
	public static void hover(String xpathValue) {
		try {
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathValue)));
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		}
		catch(Exception e) {
			System.out.println("The exception is caused in hover due to" + e);
		}
	}
	
	/***  Checks whether the given page is loaded   ***/
	public static void is_PageLoaded(String xpathValue) {
		try {
		Thread.sleep(30000);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathValue)));
		}
		catch (Exception e) {
			System.out.println("The exception is caused in is_PageLoaded due to" + e);
		}
	}
	
	/***  Finds an Element using Text and data given ***/
	public static void check_Element(String value) {
		try { 	
			List<WebElement> elements = driver.findElements(By.xpath("//span"));
			System.out.println(elements);
			for (WebElement element : elements)
			{
				if(element.getText().contains(value))
				System.out.println(element.getText());	
				{
					System.out.println("element found");
					System.out.println(value);
					System.out.println(element);
				}
			}
		}
		catch(Exception e) {
			System.out.println("The exception is caused in check_Element due to" + e);
		}
	}
	
	/*** Checks whether the Message is Displayed   ***/
	public static void is_Message_Displayed(String xpathValue) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathValue)));
			System.out.println("Test case passed");
		}
		catch(Exception e) {
			System.out.println("The exception is caused in is_Displayed due to" + e);
			System.out.println("Test case failed");
		}
	}
	
	/*** Transfers the control from existing window to newly opened window ***/
	public static void switch_Window() {
		try {
			for(String handle2 : driver.getWindowHandles()) {
				driver.switchTo().window(handle2);
				driver.manage().window().maximize();
			}
		}
		catch(Exception e){
			System.out.println("The exception is caused in switch_Window due to" + e);
		}
	}

	/***  Finds the required content from email  ***/
	public static void check_EmailContent(String xpathValue, String value) {
		try {
			//Thread.sleep(30000);
			/*
			WebDriverWait wait = new WebDriverWait(driver, 60);
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathValue)));
			//WebElement element = driver.findElement(By.xpath(xpathValue));
			System.out.println(element.getText());
			*/
			List<WebElement> elements = driver.findElements(By.xpath(xpathValue));
			//elements1 = driver.findElements(By.tagName("br"));
			System.out.println(elements);
			for (WebElement element : elements)
			{
				System.out.println(element.getText());
				System.out.println(element.getAttribute("innerText"));
				System.out.println(element.getAttribute("innerHTML"));
				System.out.println(element.getText().toString());
				System.out.println(element.getAttribute("value"));
				if(element.getText().contains(value))
					System.out.println(element.getText());	
					{
						System.out.println("element found");
						System.out.println(value);
						System.out.println(element);
						String txt = element.getText();
						String txt1 = element.getAttribute("innerText");
						String txt2 = element.getAttribute("innerHTML");
						String txt3 = element.getText().toString();
						String txt4 = element.getAttribute("value");						
						System.out.println(txt);
						System.out.println(txt1);
						System.out.println(txt2);
						System.out.println(txt3);
						System.out.println(txt4);
					}
				//String text = element.getText(); 	
				if(element.getText().contains(value))
				{
					System.out.println("element found");
					System.out.println(value);
					//System.out.println(text);
					System.out.println(element.getText());
					System.out.println(element.getAttribute("innerText"));
					System.out.println(element.getAttribute("innerHTML"));
					System.out.println(element.getText().toString());
					System.out.println(element.getAttribute("value"));
				}
			}		
		}
		catch(Exception e) {
			System.out.println("The exception is caused in check_Email_Content due to" + e);
		}
	}
}
