package Execution;

import static org.testng.Assert.assertTrue;

import java.util.Map;

import io.cucumber.datatable.DataTable;

public class LoginPage extends BasePage {

	public static String url = "https://staging-testauto.on.softools.net";
/***  Login Page locators  ***/
	public static String login_username_Locator = "//input[@name = 'username']";
	public static String login_password_Locator = "//input[@name = 'password']";
	public static String login_submitbutton_Locator = "//button[@type = 'submit']";
	public static String login_invalid_Errormessage = "//span[contains(text(), 'Wrong username or password.')]";
	public static String login_empty_Errormessage = "//a[contains(text(), 'Log In')]";
	public static String login_Page = "//span[contains(text(), 'Log In')]";	
	public static String login_Username_Errormessage = "//span[contains(text(), 'Username require 3 or more characters')]";
/***  Registration locators  ***/								    								
	public static String signUp_Locator = "//a[contains(text(), 'Sign Up')]"; 
	public static String username_Locator = "//input[@name = 'username']"; 
	public static String emailid_Locator = "//input[@name = 'email']"; 
	public static String firstname_Locator = "//input[@name = 'firstname']"; 
	public static String lastname_Locator = "//input[@name = 'lastname']"; 
	public static String company_Locator = "//input[@name = 'company']"; 
	public static String mobilePhone_Locator = "//input[@name = 'mobilephone']"; 
	public static String password_Locator = "//input[@name = 'password']"; 
	public static String legend_Locator = "//legend[contains(text(), 'User Account Login Not Allowed')]";
	public static String submitButton_Locator = "//button[@type = 'submit']";
	
	public static void login(DataTable usercredentials) {
		try {
			for (Map<Object, Object> data : usercredentials.asMaps(String.class, String.class)) {
			String username = (String) data.get("Username");	
			String password = (String) data.get("Password");
			driver.get(url);
			Actionkeywords.set_Val(login_username_Locator, username);
			Actionkeywords.set_Val(login_password_Locator, password);
			Actionkeywords.click(login_submitbutton_Locator);
		}
	}
		catch(Exception e) {
			System.out.println("The Exception in login caused due to" + e);
		}
		
	}
	
	public static void check_Error_Message() {
		try {
			Actionkeywords.is_Displayed(login_invalid_Errormessage);
			assertTrue(Actionkeywords.is_Found(login_invalid_Errormessage));
		}
		catch(Exception e){
			System.out.println("The Exception in check_Error_Message caused due to" + e);
		}
	}
	
	public static void check_Username_Error_Message(){
		try {
			Actionkeywords.is_Displayed(login_Page);
			assertTrue(Actionkeywords.is_Found(login_Page));

		}
		catch(Exception e) {
			System.out.println("The Exception in check_Username_Error_Message caused due to" + e);
		}
	}
	
	public static void check_Blank_Error_Message(){
		try {
			Actionkeywords.is_Displayed(login_empty_Errormessage);
			assertTrue(Actionkeywords.is_Found(login_empty_Errormessage));
		}
		catch(Exception e) {
			System.out.println("The Exception in check_Blank_Error_Message caused due to" + e);
		}
	}
	
	public static void check_Login_page() {
		try {
			Actionkeywords.is_Displayed(login_Page);
			assertTrue(Actionkeywords.is_Found(login_Page));
		}
		catch(Exception e) {
			System.out.println("The Exception in check_Login_page caused due to" + e);
		}
	}
	
	public static void open_Login_Page() {
		try {
			driver.get(url);
			Actionkeywords.is_Displayed(login_Page);
		}
		catch(Exception e) {
			System.out.println("The Exception in open_Login_Page caused due to" + e);
		}
	}
	
	public static void register_user(DataTable registrationdetails) {
		try {
			for (Map<Object, Object> data : registrationdetails.asMaps(String.class, String.class)) {
				String emailid = (String) data.get("emailid");	
				String username = (String) data.get("username");
				String password = (String) data.get("password");
				String firstname = (String) data.get("firstname");
				String lastname = (String) data.get("lastname");
				String company = (String) data.get("company");
				String mobile = (String) data.get("mobile no");
				Actionkeywords.click(signUp_Locator);
				Actionkeywords.set_Val(emailid_Locator, emailid);
				Actionkeywords.set_Val(username_Locator, username);
				Actionkeywords.set_Val(password_Locator, password);
				Actionkeywords.set_Val(firstname_Locator, firstname);
				Actionkeywords.set_Val(lastname_Locator, lastname);
				Actionkeywords.set_Val(company_Locator, company);
				Actionkeywords.set_Val(mobilePhone_Locator, mobile);
				Actionkeywords.click(submitButton_Locator);
			}
		}
		catch(Exception e) {
			System.out.println("The Exception in register_user caused due to" + e);
		}
	} 
	
	public static void check_Registration() {
		try {
			Actionkeywords.is_Displayed(legend_Locator);
			assertTrue(Actionkeywords.is_Found(legend_Locator));
		}
		catch(Exception e) {
			System.out.println("The Exception in check_Registration caused due to" + e);
		}
	}
}
