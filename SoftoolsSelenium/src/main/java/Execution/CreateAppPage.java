package Execution;

import static org.testng.Assert.assertTrue;

import java.util.Map;

import io.cucumber.datatable.DataTable;

public class CreateAppPage {
/***  App Studio locators  ***/
	public static String cogMenuLocator = "//a[@id = 'cogMenu']";
	public static String appStudioLocator = "//span[contains(text(), 'AppStudio')]";	
/***  Create App locators  ***/	
	public static String springBoardLocator = "//i[@class = 'fa-th fa fa-lg']";
	public static String addAppLocator = "//i[@class = 'fa app-icon-plus']";
	public static String appPage_Locator = "//h1[contains(text(), 'Add New App')]";
/***  Add App locators  ***/	
	public static String titleLocator = "//input[@id = 'title']";
	public static String descriptionLocator = "//textarea[@id = 'description']";
	public static String add_AppLocator = "//i[@class = 'fa fa-lg fa-check']";
	public static String configurePage_Locator = "//span[contains(text(), 'Configure')]";
/***  desktop notifications locators  ***/
	public static String desktopNotification_Enable_Locator = "//button[contains(text(), 'Continue')]";
	public static String desktopNotification_Askmelater_Locator = "//button[contains(text(), 'Ask Me Later')]";	
	
	public static void open_AppPage() {
		try {
			Actionkeywords.is_PageLoaded(appStudioLocator);
			Actionkeywords.click(desktopNotification_Askmelater_Locator);	
			Actionkeywords.is_PageLoaded(appStudioLocator);
			Actionkeywords.performClick(springBoardLocator);
			Actionkeywords.performClick(addAppLocator);
			Actionkeywords.is_Displayed(appPage_Locator);
		}
		catch(Exception e) {
			System.out.println("The Exception in open_AppPage caused due to" + e);
		}
	}
	
	public static void create_App(DataTable appdetails) {
		try {
			for (Map<Object, Object> data : appdetails.asMaps(String.class, String.class)) {
				String title = (String) data.get("Title");	
				String description = (String) data.get("Description");
				Actionkeywords.set_Val(titleLocator, title);
				Actionkeywords.set_Val(descriptionLocator, description);	
				Actionkeywords.click(add_AppLocator);
			}	
		}
		catch(Exception e) {
			System.out.println("The Exception in create_App caused due to" + e);
		}
	}
	
	public static void check_App() {
		try {
			Actionkeywords.is_PageLoaded(configurePage_Locator);
			Actionkeywords.click(desktopNotification_Askmelater_Locator);
			Actionkeywords.is_Displayed(configurePage_Locator);
			assertTrue(Actionkeywords.is_Found(configurePage_Locator));
		}
		catch(Exception e) {
			System.out.println("The Exception in check_App caused due to" + e);
		}
	}
}
