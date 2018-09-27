package Execution;

import static org.testng.Assert.assertTrue;

import java.util.Map;

import io.cucumber.datatable.DataTable;

public class ConfigureAppPage {
	/***  App Configure locators  ***/		
	public static String configure_Locator = "//span[contains(text(), 'Configure')]";
	public static String categoryLocator = "//input[@id = 'taxonomy']";
	public static String recordTypeNameLocator = "//input[@id = 'name']";
	public static String recordTypeName_Plural_Locator = "//input[@id = 'nameplural']";
	public static String record_Title_Field_Locator = "//select[@id = 'titlefield']";
	public static String record_User_IdentifierField_Locator = "//select[@id = 'useridentifierfield']";
	public static String atoz_Search_Field_Locator = "//select[@id = 'atozfield']";
	public static String icon_Logo_URL_Locator = "//input[@id = 'logoimageuri']";
	public static String icon_Select_An_Image_Asset = "//select[@id = 'logoassetid']";
	public static String icon_Upload_Locator = "//label[@for = 'logoassetid']//button[contains(text, 'Upload New Asset')]";
	public static String icon_Upload_Button_Locator = "//div[@id = 'assetsUploader']";
	public static String icon_Upload_Submit_Button_Locator = "//i[@class = 'fa fa-lg fa-check']";
	public static String publisher_Name_Locator = "//input[@id = 'publishername']";
	public static String publisher_URL_Locator = "//input[@id = 'publisherurl']";
	public static String Publisher_Logo_URL_Locator = "//input[@id = 'publisherimageuri']";
	public static String publisher_Select_An_Image_Asset_Locator = "//select[@id = 'publisherassetid']";
	public static String publisher_Upload_Locator = "//label[@for = 'publisherassetid']//button[contains(text, 'Upload New Asset')]\"";
	public static String publisher_Upload_Button_Locator = "//div[@id = 'assetsUploader']";
	public static String publisher_Upload_Submit_Button_Locator = "//i[@class = 'fa fa-lg fa-check']";
	public static String developer_Name_Locator = "//input[@id = 'developername']";
	public static String developer_URL_Locator = "//input[@id = 'developerurl']";
	public static String developer_user_Locator = "//select[@id = 'developeruserid']";
	public static String settings_Lookup_Only_App_Locator = "//input[@id = 'lookupapp']";
	public static String learining_Help_Enabled_Locator = "//label[contains(text(), 'Help Enabled?')]";
	public static String learning_Secondary_Help_Lookup_Field_Locator = "//select[@id = 'helplookupfieldidentifier']";	
	public static String learning_Subject_Matter_Expert_Locator = "//select[@id = 'subjectmatterexpertuserid']";
	public static String resourceLinks_Add_Item_Locator = "//button[contains(text(), 'Add Item')]";
	public static String resourceLinks_Label_Locator = "//inpu[@id = 'labelundefined']";
	public static String resourceLinks_URL_Locator = "//inpu[@id = 'urlundefined']";
	public static String resourceLinks_Select_An_Asset_Locator = "//select[@id = 'learningresourceassetid']";
	public static String resources_Done_Button_Locator = "//button[contains(text(), 'Done')]";
	public static String add_Basic_Info_Locator = "//i[@class = 'fa-check fa fa-lg']";
	public static String appSaved_Locator = "//span[contains(text(), 'App saved successfully')]";
	
	public static void configure_App(DataTable appinfo) {
		try {
			for (Map<Object, Object> data : appinfo.asMaps(String.class, String.class)) {
				String category = (String) data.get("Category");	
				String recordtype = (String) data.get("Record type");	
				String recordtypeplural = (String) data.get("Record type plural");	
				String iconlogourl = (String) data.get("Icon logo URL");	
				String publishername = (String) data.get("Publisher name");	
				String publisherlogourl = (String) data.get("publisher Logo Url");	
				String developername = (String) data.get("Developer name");	
				String developeruser = (String) data.get("Developer user");					
			    Actionkeywords.is_PageLoaded(configure_Locator);
			    Actionkeywords.click(configure_Locator);
			    Actionkeywords.set_Val(categoryLocator, category);
			    Actionkeywords.set_Val(recordTypeNameLocator, recordtype);
			    Actionkeywords.set_Val(recordTypeName_Plural_Locator, recordtypeplural);
			    Actionkeywords.set_Val(icon_Logo_URL_Locator, iconlogourl);
			    Actionkeywords.set_Val(publisher_Name_Locator, publishername);
			    Actionkeywords.set_Val(Publisher_Logo_URL_Locator, publisherlogourl);
			    Actionkeywords.set_Val(developer_Name_Locator, developername);
			    Actionkeywords.select(developer_user_Locator, developeruser);
			    Actionkeywords.click(learining_Help_Enabled_Locator);
			    Actionkeywords.click(add_Basic_Info_Locator);
			}
		}
		catch(Exception e) {
			System.out.println("The Exception in configure_App caused due to" + e);
		}
	}
	
	public static void check_App_Info() {
		try {
			assertTrue(Actionkeywords.is_Found(appSaved_Locator));
		}
		catch(Exception e) {
			System.out.println("The Exception in check_App_Info caused due to" + e);
		}
	}
}
