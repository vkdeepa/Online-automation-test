package Execution;

import static org.testng.Assert.assertTrue;

import java.util.Map;

import io.cucumber.datatable.DataTable;

public class WorkspacePage {
/***  Add Records locators  ***/								    				
	public static String springBoard_Locator = "//i[@class = 'fa-th fa fa-lg']";
	public static String searchLocator = "//input[@id = 'SearchBox']";
	public static String appLocator = "//img[@class = 'app-icon-image']";
	public static String addRecords_Locator = "//i[@class = 'fa-plus fa fa-lg']";
	public static String Record_Locator_1 = "//input[@type = 'number']";
	public static String Record_Locator_2 = "//input[@type = 'text']";	
	public static String addRecord_Locator = "//a[@id = 'saveTick']";
	public static String recordAdded_locator = "//span[contains(text(), 'Record added successfully')]";
/***  Workspace  locators  ***/								    			
	public	String cogmenu_Locator = "//a[@id = 'cogMenu']";
	public	String workspace_Locator = "//span[contains(text(), 'Workspace')]";
	public static String workspacePage_Locator = "//span[contains(text(), 'Home')]";	
/***  desktop notifications locators  ***/
	public static String desktopNotification_Enable_Locator = "//button[contains(text(), 'Continue')]";
	public static String desktopNotification_Askmelater_Locator = "//button[contains(text(), 'Ask Me Later')]";
	public static String springBoardLocator = "//i[@class = 'fa-th fa fa-lg']";
	public static String cogMenuLocator = "//a[@id = 'cogMenu']";
/***  Log Off locators  ***/
	public static String logOffcogMenuLocator = "//i[@class = 'fa-cog fa fa-lg']";
	public static String logOffLocator = "//span[contains(text(), 'Log Off')]";
	
	public static void find_App(DataTable apptitle) {
		try {
			for (Map<Object, Object> data : apptitle.asMaps(String.class, String.class)) {
			String title = (String) data.get("Title");	
		    Actionkeywords.is_Displayed(workspacePage_Locator);
		    Actionkeywords.click(desktopNotification_Askmelater_Locator);	
		    Actionkeywords.is_Displayed(workspacePage_Locator);
		    Actionkeywords.performClick(springBoardLocator);
		    Actionkeywords.set_Val(searchLocator, title);	
		    Actionkeywords.click(appLocator);
	}
  }
	catch(Exception e) {
		System.out.println("The Exception in find_App caused due to" + e);
	}
	}
	
	public static void enter_Records(DataTable records) {
		try {
			for (Map<Object, Object> data : records.asMaps(String.class, String.class)) {
			String record1 = (String) data.get("Record1");	
			String record2 = (String) data.get("Record2");	
			Actionkeywords.is_PageLoaded(addRecords_Locator);
		    Actionkeywords.click(addRecords_Locator);	
		    Actionkeywords.set_Val(Record_Locator_1, record1);	
		    Actionkeywords.set_Val(Record_Locator_2, record2);	
		    Actionkeywords.click(addRecord_Locator);
		    Actionkeywords.clickElement(addRecord_Locator);
	}
  }
	catch(Exception e) {
		System.out.println("The Exception in enter_Records caused due to" + e);
	}
	}
	
	public static void check_Records() {
		try {
			assertTrue(Actionkeywords.is_Found(recordAdded_locator));
		}
		catch(Exception e) {
			System.out.println("The Exception in check_report caused due to" + e);	
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
