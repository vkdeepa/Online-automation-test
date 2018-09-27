package Execution;

import static org.testng.Assert.assertTrue;

import java.util.Map;

import io.cucumber.datatable.DataTable;

public class AddTemplatePage {
/***  Add Template locators  ***/			
	public static String add_Template_Locator =  "//i[@class = 'fa fa-plus']//following::i[2]";
	public static String title_Locator = "//input[@id = 'title']";
	public static String identifier_Locator = "//input[@id, 'identifier')]";
	public static String helpText_Locator = "//textarea[@id = 'helptext']";
	public static String select_A_Template_Icon_Locator = "//label[contains(text(), 'Select a Template Icon')]//select[@id = 'iconid']";
	public static String upload_Asset_Button_Locator = "//button[contains(text(), 'Upload New Asset')]";
	public static String upload_Asset_Locator = "//div[@id = 'assetsUploader']";
	public static String save_Asset_Button_Locator = "//i[@class = 'fa fa-lg fa-check']"; 
	public static String basic_Builder_Locator = "//span[contains(text(), 'Basic Builder')]";
	public static String collapsed_By_Default_Locator = "//span[@class = 'checkbox']//input[@id = 'collapsedbydefault']";
	public static String addItem_BasicBuilder_Locator = "//button[contains(text(), 'Add Item')]//self::button";
	public static String select_No_Of_Columns_Locator = "//select[@id = 'columncount']";
	public static String select_ColumnName_Locator = "//select[@id = 'field']";
	public static String select_ColumnName_Locator_2 = "//select[@id = 'field2']";
	public static String save_Template = "//i[@class = 'fa-check fa fa-lg']";
	public static String details_Locator = "//span[contains(text(), 'Details')]";
	public static String overeview_Locator = "//span[contains(text(), 'Overview')]";
	public static String templateSuccessful_Locator = "//span[contains(text(), 'Template added successfully')]";
	
	public static void create_Template(DataTable templatedetails) {
		try {
			for (Map<Object, Object> data : templatedetails.asMaps(String.class, String.class)) {
				String title = (String) data.get("Title");	
				String helptext = (String) data.get("Helptext");	
				String numberofcolumns = (String) data.get("No of columns");	
				String column1 = (String) data.get("Column1");	
				String column2 = (String) data.get("Column2");	
				Actionkeywords.is_PageLoaded(overeview_Locator);
				Actionkeywords.click(overeview_Locator);
				Actionkeywords.is_PageLoaded(overeview_Locator);
				Actionkeywords.click(add_Template_Locator);
				Actionkeywords.set_Val(title_Locator, title);
				Actionkeywords.set_Val(helpText_Locator, helptext);
				Actionkeywords.is_Displayed(basic_Builder_Locator);
				Actionkeywords.click(basic_Builder_Locator);	
				Actionkeywords.is_PageLoaded(addItem_BasicBuilder_Locator);
				Actionkeywords.click(addItem_BasicBuilder_Locator);
				Actionkeywords.select(select_No_Of_Columns_Locator, numberofcolumns);
				Actionkeywords.select(select_ColumnName_Locator, column1);
				Actionkeywords.select(select_ColumnName_Locator_2, column2);
				Actionkeywords.click(save_Template);
			}		
		}
		catch (Exception e) {
			System.out.println("The Exception in create_Template caused due to" + e);
		}
	}
	
	public static void check_Template() {
		try {
			assertTrue(Actionkeywords.is_Found(templateSuccessful_Locator));
		}
		catch(Exception e) {
			System.out.println("The Exception in check_Template caused due to" + e);
		}
	}
}
