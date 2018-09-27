package Execution;

import static org.testng.Assert.assertTrue;

import java.util.Map;

import io.cucumber.datatable.DataTable;

public class AddFieldPage {
/***  Add Fields locators  ***/		
	public static String configure_Locator = "//span[contains(text(), 'Configure')]";
	public static String add_Field_Locator = "//i[@class = 'fa fa-plus']//self::i";
	public static String label_Locator = "//input[@id = 'label']";
	public static String fieldType_Locator = "//select[@id = 'type']";
	public static String required_CheckBox_Locator = "//label[contains(text(), 'Required')]";
	public static String readOnly_CheckBox_Locator = "//span[@class = 'checkbox']//input[@id = 'isreadonly']";
	public static String length_Locator = "//label[contains(text(), 'Length')]//input[@id = 'length']";
	public static String expression_Locator = "//label[contains(text(), 'Expression')]//input[@id = 'expression']";
	public static String defaultValue_Locator = "//label[contains(text(), 'Default Value')]//input[@id = 'defaultvalue2']";
	public static String Process_Default_Value_As_Expression_CheckBox_Locator = "//span[@class = 'checkbox']//input[@id = 'defaultvalueisexpression']";
	public static String format_String_Locator = "//label[contains(text(), 'Format String')]//input[@id = 'formatstring']";
	public static String displayFormatted_CheckBox_Locator = "//span[@class = 'checkbox']//input[@id = 'displayformatted']";
	public static String exclude_This_Field_From_Templated_Record_CheckBox_Locator = "//span[@class = 'checkbox']//input[@id = 'excludeFromTemplateCopy']";			
	public static String include_In_Free_Text_Quick_Filter_CheckBox_Locator = "//label[contains(text(), 'Include in free text quick filter')]";	
	public static String save_Field_Locator = "//a[@id = 'saveTick']//i[@class = 'fa-check fa fa-lg']";
	public static String fieldSaved_Message_Locator = "//span[contains(text(), 'Field added successfully')]";
	
	public static void create_Field(DataTable fielddetails){
		try {
			for (Map<Object, Object> data : fielddetails.asMaps(String.class, String.class)) {
				String label = (String) data.get("Fieldname");	
				String fieldtype = (String) data.get("Fieldtype");	
				Actionkeywords.is_PageLoaded(configure_Locator);
				Actionkeywords.click(add_Field_Locator);
				Actionkeywords.set_Val(label_Locator, label);
				Actionkeywords.select(fieldType_Locator, fieldtype);
				Actionkeywords.is_Displayed(required_CheckBox_Locator);
				Actionkeywords.click(required_CheckBox_Locator);
				Actionkeywords.click(save_Field_Locator);
			}			
		}
		catch(Exception e) {
			System.out.println("The Exception in create_Field caused due to" + e);
		}
	}
	
	public static void check_Field(){
		try {
			assertTrue(Actionkeywords.is_Found(fieldSaved_Message_Locator));
		}
		catch(Exception e) {
			System.out.println("The Exception in check_Field caused due to" + e);
		}
	}
}
