package Execution;

import static org.testng.Assert.assertTrue;

public class HomePage extends BasePage{
	public static String login_home_Text_Locator = "//span[contains(text(), 'Home')]";
/***  Version update locators  ***/
	public static String accept_VersionUpdate_Locator = "//i[@class = 'fa-check fa fa-lg dialogOk']";	
	public static String cancel_VersionUpdateLocator = "//i[@class = 'fa-times fa fa-lg dialogCancel']";
/***  desktop notifications locators  ***/	
	public static String desktopNotification_Enable_Locator = "//button[contains(text(), 'Continue')]";
	public static String desktopNotification_Askmelater_Locator = "//button[contains(text(), 'Ask Me Later')]";
/***  App Studio locators  ***/
	public static String cogMenuLocator = "//a[@id = 'cogMenu']";
	public static String appStudioLocator = "//span[contains(text(), 'AppStudio')]";
/***  Log Off locators  ***/
	public static String logOffcogMenuLocator = "//i[@class = 'fa-cog fa fa-lg']";
	public static String logOffLocator = "//span[contains(text(), 'Log Off')]";
	
	public static void check_Home_Page(){
		try {
			Actionkeywords.is_PageLoaded(login_home_Text_Locator);
			Actionkeywords.click(accept_VersionUpdate_Locator);
			Actionkeywords.is_PageLoaded(login_home_Text_Locator);
			Actionkeywords.click(desktopNotification_Askmelater_Locator);		
			Actionkeywords.is_PageLoaded(login_home_Text_Locator);
			assertTrue(Actionkeywords.is_Found(login_home_Text_Locator));
		}
		catch(Exception e) {
			System.out.println("The Exception in check_Home_Page caused due to" + e);
		}
	}
	
	public static void go_To_AppStudio(){
		try {
			Actionkeywords.clickElement(cogMenuLocator);
			Actionkeywords.click(appStudioLocator);
			Actionkeywords.switch_Window();
		}
		catch(Exception e) {
			System.out.println("The Exception in go_To_AppStudio caused due to");
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
}
