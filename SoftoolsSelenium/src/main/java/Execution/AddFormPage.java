package Execution;

import static org.testng.Assert.assertTrue;

import java.util.Map;

import io.cucumber.datatable.DataTable;

public class AddFormPage {
/***  Add Forms locators  ***/				
	public static String add_Form_Locator =  "//i[@class = 'fa fa-plus']//following::i[4]";
	public static String form_title_Locator = "//input[@id = 'title']";
	public static String display_Order_Identifier_Locator = "//input[@id = 'displayorder']";
	public static String hide_Form_CheckBox_Locator = "//span[@class = 'checkbox']//input[@id = 'hiddenoncreate']";
	public static String showApp_Title_Locator = "//span[@class = 'checkbox']//input[@id = 'showapptitle']";
	public static String show_App_Description_Locator = "//span[@class = 'checkbox']//input[@id = 'showappdescription']";
	public static String show_App_Icon_Locator = "//span[@class = 'checkbox']//input[@id = 'showappicon']";
	public static String add_item_Locator = "//span[@class = 'additem']//button[contains(text(), 'Add Item')]";
	public static String displayOrder_Locator = "//input[@id= 'displayorder1']";
	public static String select_Template_Locator = "//select[@id = 'template1']";
	public static String save_Template_Button_Locator = "//button[contains(text(), 'Done')]";
	public static String save_Form_Locator = "//i[@class = 'fa-check fa fa-lg']";
	public static String formSuccessfull_Locator = "//span[contains(text(), 'Form added successfully')]";
	public static String overeview_Locator = "//span[contains(text(), 'Overview')]";
	
	public static void create_Form(DataTable formdetails) {
		try {
		for (Map<Object, Object> data : formdetails.asMaps(String.class, String.class)) {
			String title = (String) data.get("Title");	
			String displayorder = (String) data.get("Displayorder");	
			String template = (String) data.get("Template");	
			Actionkeywords.is_PageLoaded(overeview_Locator);
			Actionkeywords.click(add_Form_Locator);
			Actionkeywords.set_Val(form_title_Locator, title);
			Actionkeywords.set_Val(display_Order_Identifier_Locator, displayorder);
			Actionkeywords.click(add_item_Locator);
			Actionkeywords.set_Val(displayOrder_Locator, displayorder);
			Actionkeywords.select(select_Template_Locator, template);
			Actionkeywords.click(save_Template_Button_Locator);
			Actionkeywords.click(save_Form_Locator);
		}	
		}
		catch(Exception e) {
			System.out.println("The Exception in create_Form caused due to" + e);	
		}
	}
	
	public static void check_Form() {
		try {
			assertTrue(Actionkeywords.is_Found(formSuccessfull_Locator));
		}
		catch(Exception e) {
			System.out.println("The Exception in check_Form caused due to" + e);	
		}
	}
}
