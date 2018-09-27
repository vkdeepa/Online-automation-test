package Execution;

import static org.testng.Assert.assertTrue;

import java.util.Map;

import io.cucumber.datatable.DataTable;

public class PublishAppPage {
/***  publish App locators  ***/								    		
	public static String publish_Locator = "//span[contains(text(), 'Publish')]";
	public static String hidden_Checkbox_locator = "//label[@for = 'hiddenapp']";
	public static String select_Visible_By_Team_Locator = "//select[@id = 'visibleTeamIds']";
	public static String select_Visible_By_User_Locator = "//select[@id = 'visibleUserIds']";
	public static String select_Read_Only_Teams_Locator = "//select[@id = 'readOnlyTeamIds']";
	public static String select_FullAccess_Teams_Locator = "//select[@id = 'fullAccessTeamIds']";
	public static String allTeams_Read_Only_Checkbox_locator = "//span[@class = 'checkbox']//input[@name = 'readOnlyAccessAll']";
	public static String allTeams_FullAccess_Checkbox_locator = "//span[@class = 'checkbox']//input[@name = 'fullAccessAll']";
	public static String select_Editable_By_Team_Locator = "//select[@id = 'editAccessRightTeamIds']";
	public static String select_Editable_By_User_Locator = "//select[@id = 'editAccessRightUserIds']";
	public static String publishApp_Locator = "//i[@class = 'fa-check fa fa-lg']";
	public static String appPublished_Locator = "//span[contains(text(), 'App saved successfully')]";
	public static String overeview_Locator = "//span[contains(text(), 'Overview')]";

	public static void publish(DataTable publishdetails) {
		try {
			for (Map<Object, Object> data : publishdetails.asMaps(String.class, String.class)) {
				String user = (String) data.get("Uservisible");	
				Actionkeywords.is_PageLoaded(overeview_Locator);
				Actionkeywords.click(publish_Locator);
				Actionkeywords.is_Displayed(hidden_Checkbox_locator);
				Actionkeywords.click(hidden_Checkbox_locator);
				Actionkeywords.select(select_Visible_By_User_Locator, user);
				Actionkeywords.click(publishApp_Locator);
			}		
		}
		catch(Exception e) {
			System.out.println("The Exception in publish caused due to" + e);	
		}
	}
	
	public static void check_Publish() {
		try {
			assertTrue(Actionkeywords.is_Found(appPublished_Locator));
		}
		catch(Exception e) {
			System.out.println("The Exception in check_report caused due to" + e);	
		}
	}
}
