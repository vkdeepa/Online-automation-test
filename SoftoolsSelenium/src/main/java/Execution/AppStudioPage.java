package Execution;

import static org.testng.Assert.assertTrue;

import java.util.Map;

import io.cucumber.datatable.DataTable;

public class AppStudioPage {
/***  Version update locators  ***/	
	public static String accept_VersionUpdate_Locator = "//i[@class = 'fa-check fa fa-lg dialogOk']";	
	public static String cancel_VersionUpdateLocator = "//i[@class = 'fa-times fa fa-lg dialogCancel']";
/***  desktop notifications locators  ***/
	public static String desktopNotification_Enable_Locator = "//button[contains(text(), 'Continue')]";
	public static String desktopNotification_Askmelater_Locator = "//button[contains(text(), 'Ask Me Later')]";
/***  App Studio locators  ***/
	public static String cogMenuLocator = "//a[@id = 'cogMenu']";
	public static String appStudioLocator = "//span[contains(text(), 'AppStudio')]";
	public static String springBoardLocator = "//i[@class = 'fa-th fa fa-lg']";
	public static String searchLocator = "//input[@id = 'SearchBox']";
	public static String appLocator = "//img[@class = 'app-icon-image']";
/***  Log Off locators  ***/
	public static String logOffcogMenuLocator = "//i[@class = 'fa-cog fa fa-lg']";
	public static String logOffLocator = "//span[contains(text(), 'Log Off')]";
/***  Workspace  locators  ***/								    				
	public static String cogmenu_Locator = "//a[@id = 'cogMenu']";
	public static String workspace_Locator = "//span[contains(text(), 'Workspace')]";
	public	String workspacePage_Locator = "//span[contains(text(), 'Home')]";	
	
	public static void check_Appstudio_Page(){
		try {
			Actionkeywords.is_PageLoaded(appStudioLocator);
			Actionkeywords.click(desktopNotification_Askmelater_Locator);	
			Actionkeywords.is_PageLoaded(appStudioLocator);
			assertTrue(Actionkeywords.is_Found(appStudioLocator));
		}
		catch(Exception e) {
			System.out.println("The Exception in check_Home_Page caused due to" + e);
		}
	}
	
	public static void logout() {
		try {
			Actionkeywords.is_Displayed(logOffcogMenuLocator);
			Actionkeywords.performClick(logOffcogMenuLocator);
			Actionkeywords.is_Displayed(logOffLocator);
			Actionkeywords.click(logOffLocator);
		}
		catch(Exception e) {
			System.out.println("The Exception in logout	 caused due to" + e);
		}
	}
	
	public static void find_App(DataTable apptitle) {
		try {
				for (Map<Object, Object> data : apptitle.asMaps(String.class, String.class)) {
				String title = (String) data.get("Title");	
			    Actionkeywords.is_PageLoaded(appStudioLocator);
			    Actionkeywords.click(desktopNotification_Askmelater_Locator);	
			    Actionkeywords.is_Displayed(appStudioLocator);
			    Actionkeywords.performClick(springBoardLocator);
			    Actionkeywords.set_Val(searchLocator, title);	
			    Actionkeywords.click(appLocator);
		}
	  }
		catch(Exception e) {
			System.out.println("The Exception in find_App caused due to" + e);
		}
	}
	
	public static void workspace(){
		try {
			Actionkeywords.is_PageLoaded(appStudioLocator);
			Actionkeywords.click(desktopNotification_Askmelater_Locator);
			Actionkeywords.is_PageLoaded(appStudioLocator);
			Actionkeywords.clickElement(cogmenu_Locator);
			Actionkeywords.click(workspace_Locator);
			Actionkeywords.switch_Window();
		}
		catch(Exception e) {
			System.out.println("The Exception in go_To_AppStudio caused due to");
		}
	}
}
