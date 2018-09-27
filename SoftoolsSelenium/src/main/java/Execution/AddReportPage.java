package Execution;

import static org.testng.Assert.assertTrue;

import java.util.Map;

import io.cucumber.datatable.DataTable;

public class AddReportPage {
/***  Add Reports  locators  ***/								    
    public static String add_Report_Locator =  "//i[@class = 'fa fa-plus']//following::i[6]";
    public static String reporttitle_Locator = "//input[@id = 'title']";
    public static String subTitle_Locator = "//label[contains(text(), 'SubTitle')]//span[@class = 'lookup']//input[@id = 'subtitle']";
    public static String report_Identifier_Locator = "//input[@id = 'identifier']";
    public static String select_Report_Type_Locator = "//select[@id = 'reporttype2']";
    public static String display_Order_Locator = "//input[@id = 'displayorder']";
    public static String reportGroup_Locator = "//input[@id = 'category']";
    public static String defaultReport_Checkbox_Locator = "//span[@class = 'checkbox']//input[@id = 'isdefault']";
    public static String hidden_Checkbox_Locator = "//span[@class = 'checkbox']//input[@id = 'ishidden']";
    public static String allow_Multiselect_Checkbox_Locator = "//span[@class = 'checkbox']//input[@id = 'allowmultiselect']";
    public static String quick_Edit_Report_Checkbox_Locator = "//span[@class = 'checkbox']//input[@id = 'quickeditreport']";
    public static String display_Attachments_Count_Checkbox_Locator = "//span[@class = 'checkbox']//input[@id = 'displayAttachmentsCount']";
	public static String display_Comments_Count_Checkbox_Locator = "//span[@class = 'checkbox']//input[@id = 'displayCommentsCount']";
	public static String base_Filter_Locator = "//i[@class = 'fa-filter fa fa-lg element-side-icon icon-inner-right-input pointer']";
	public static String confirm_baseFilter_Override_Locator = "//i[@class = 'fa-check fa fa-lg dialogOk']";
	public static String filter_Add_Button_Locator = "//button[@class = 'filterAdd default']";
	public static String filterField_Locator = "//select[@class = 'filterField']";
	public static String filterOperator_Locator = "//select[@class = 'filterOperator inline']";
	public static String filterValue_Input_Locator = "//input[@class = 'filterValue input-validation-error']";
	public static String save_Filter_Locator = "i[@class = 'fa fa-lg fa-check']";
	public static String reportFields_AddItem_Locator = "//button[contains(text(), 'Add Item')]//self::button";
	public static String reportFields_Displayorder_Locator = "//input[@id = 'displayorder1']";
	public static String reportFields_Column_Priority_Locator = "//input[@id = 'columnpriority1']";
	public static String reportFields_Displayorder_Locator_2 = "//input[@id = 'displayorder2']";
	public static String reportFields_Column_Priority_Locator_2 = "//input[@id = 'columnpriority2']";
	public static String reportFields_Parent_Field_Priority_Locator = "//select[@name = 'parentfieldid']";
	public static String reportFields_Summary_Expression_Locator = "//input[@name = 'summaryexpression']";
	public static String reportFields_ShortLabel_Locator = "//input[@name = 'shortlabel']";
	public static String reportFields_Sortable_Checkbox_Locator = "//span[@class = 'checkbox']//input[@name = 'sortable']";
	public static String reportFields_Hidden_Checkbox_Locator = "//span[@class = 'checkbox']//input[@name = 'hidden	']";
	public static String reportDone_Button_Locator = "//button[contains(text(), 'Done')]";
	public static String detailFields_AddItem_Locator = "//td[@colspan = '4']//button[contains(text(), 'Add Item')]";
	public static String detailFields_Displayorder_Locator = "//input[@id = 'displayorder']";
	public static String detailFields_Parent_Field_Priority_Locator = "//select[@id = 'parentfieldid']";
	public static String detailFields_Done_Button_Locator = "//button[contains(text(), 'Done')]";
	public static String save_Report = "//i[@class = 'fa-check fa fa-lg']";
	public static String reportSaved_Locator = "//span[contains(text(), 'Report added successfully')]";
	public static String overeview_Locator = "//span[contains(text(), 'Overview')]";
	 
	public static void create_Report(DataTable reportdetails) {
		try {
			for (Map<Object, Object> data : reportdetails.asMaps(String.class, String.class)) {
				String title = (String) data.get("Title");	
				String reporttype = (String) data.get("Reporttype");	
				String displayorder = (String) data.get("Displayorder");	
				String reportfieldsdisplayorder = (String) data.get("ReportfieldsDisplayorder");	
				String reportfieldscolumnpriority = (String) data.get("ReportfieldsColumnpriority");	
				String reportFieldsParentFieldPriorityLocator = (String) data.get("ReportFieldsParentFieldPriorityLocator");	
				String reportfieldsDisplayorder2 = (String) data.get("ReportfieldsDisplayorder2");	
				String reportfieldsColumnpriority2 = (String) data.get("ReportfieldsColumnpriority2");	
				String reportFieldsParentFieldPriorityLocator2 = (String) data.get("ReportFieldsParentFieldPriorityLocator2");	
				Actionkeywords.is_PageLoaded(overeview_Locator);
				Actionkeywords.click(add_Report_Locator);
				Actionkeywords.set_Val(reporttitle_Locator, title);
				Actionkeywords.hover(select_Report_Type_Locator);
				Actionkeywords.select(select_Report_Type_Locator, reporttype);
				Actionkeywords.set_Val(display_Order_Locator, displayorder);
				Actionkeywords.click(reportFields_AddItem_Locator);
				Actionkeywords.set_Val(reportFields_Displayorder_Locator, reportfieldsdisplayorder);
				Actionkeywords.set_Val(reportFields_Column_Priority_Locator, reportfieldscolumnpriority);
				Actionkeywords.select(reportFields_Parent_Field_Priority_Locator, reportFieldsParentFieldPriorityLocator);
				Actionkeywords.click(reportDone_Button_Locator);
				Actionkeywords.click(reportFields_AddItem_Locator);
				Actionkeywords.set_Val(reportFields_Displayorder_Locator_2, reportfieldsDisplayorder2);
				Actionkeywords.set_Val(reportFields_Column_Priority_Locator_2, reportfieldsColumnpriority2);
				Actionkeywords.select(reportFields_Parent_Field_Priority_Locator, reportFieldsParentFieldPriorityLocator2);
				Actionkeywords.click(reportDone_Button_Locator);
				Actionkeywords.click(save_Report);
			}		
		}
		catch(Exception e) {
			System.out.println("The Exception in create_Report caused due to" + e);	
		}
	}
	
	public static void check_report() {
		try {
			assertTrue(Actionkeywords.is_Found(reportSaved_Locator));
		}
		catch(Exception e) {
			System.out.println("The Exception in check_report caused due to" + e);	
		}
	}
}
