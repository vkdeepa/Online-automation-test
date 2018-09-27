package Execution;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Step_definition extends BasePage {
	@Given("^User enters credentials to login and clicks submit button$")
	public void login_With_Credentials(DataTable usercredentials) {
		LoginPage.login(usercredentials);
  }
	@Then("^Verify whether user is logged in successfully$")
	public void verify_Login() {
		HomePage.check_Home_Page();
		HomePage.logout();
	}
	@Then("^Verify whether error message is displayed$")
	public void verify_Error_Message() {
		LoginPage.check_Error_Message();
	}
	@Then("^Verify whether username error message is displayed$")
	public void verify_Username_Error_Message() {
		LoginPage.check_Username_Error_Message();
	}
	@Then("^Verify whether blank error message is displayed$")
	public void verify_Blank_Error_Message() {
		LoginPage.check_Blank_Error_Message();
	}
	@Then("^Verify whether user reaches login page after logout$")
	public void verify_Login_Page() {
		LoginPage.check_Login_page();
	}
	@When("^User is on Home Page$")
	public void verify_Home_Page() {
		HomePage.check_Home_Page();
	}
	@Then("^Open AppStudio$")
	public void open_Appstudio() {
		HomePage.go_To_AppStudio();
	}
	@Then("^Verify whether user has reached AppStudio page$")
	public void verify_Appstudio_Page() {
		AppStudioPage.check_Appstudio_Page();
		AppStudioPage.logout();
	}
	@Given("^User is on Login Page$")
	public void go_To_Login_Page() {
		LoginPage.open_Login_Page();
	}
	@When("^User goes to registration page and fills in registration form$")
	public void register(DataTable registrationdetails) {
		LoginPage.register_user(registrationdetails);
	}
	@Then("^Verify whether user is Registered successfully$")
	public void verify_Registration() {
		LoginPage.check_Registration();
	}
	@And("^Open Create App Page$")
	public void open_App_Page() {
		CreateAppPage.open_AppPage();
	}
	@Then("^Enter App Details and create an app$")
	public void enter_App_Details(DataTable appdetails) {
		CreateAppPage.create_App(appdetails);
	}
	@Then("^Verify whether App is created$")
	public void verify_App() {
		CreateAppPage.check_App();
		AppStudioPage.logout();
	}
	@And("^Search and open the app$")
	public void search_App(DataTable apptitle) {
		AppStudioPage.find_App(apptitle);
	}
	@Then("^Enter App Info and save$")
	public void add_Info(DataTable appinfo) {
		ConfigureAppPage.configure_App(appinfo);
	}
	@Then("^Verify whether app info is saved$")
	public void verify_App_Info() {
		ConfigureAppPage.check_App_Info();
		AppStudioPage.logout();
	}
	@Then("^Add Fields$")
	public void add_Field(DataTable fielddetails) {
		AddFieldPage.create_Field(fielddetails);
	}
	@Then("^verify whether field is saved$")
	public void verify_Field(){
		AddFieldPage.check_Field();
		AppStudioPage.logout();
	}
	@Then("^Add Template$")
	public void add_Template(DataTable templatedetails) {
		AddTemplatePage.create_Template(templatedetails);
	}
	@Then("^verify whether Template is saved$")
	public void verify_Temlplate() {
		AddTemplatePage.check_Template();
		AppStudioPage.logout();
	}
	@Then("^Add Form$")
	public void add_Form(DataTable formdetails) {
		AddFormPage.create_Form(formdetails);
	}
	@Then("^verify whether Form is saved$")
	public void verify_Form() {
		AddFormPage.check_Form();
		AppStudioPage.logout();
	}
	@Then("^Add report$")
	public void add_Report(DataTable reportdetails) {
		AddReportPage.create_Report(reportdetails);
	}
	@Then("^verify whether report is saved$")
	public void verify_report() {
		AddReportPage.check_report();
		AppStudioPage.logout();
	}
	@Then("^Publish app$")
	public void publish_App(DataTable publishdetails) {
		PublishAppPage.publish(publishdetails);
	}
	@Then("^verify whether app is published$")
	public void verify_Publish() {
		PublishAppPage.check_Publish();
		AppStudioPage.logout();
	}
	@And("^Open Workspace$")
	public void open_Workspace() {
		AppStudioPage.workspace();
	}
	@Then("^Search and Find the app$")
	public void search_App_Workspace(DataTable apptitle) {
		WorkspacePage.find_App(apptitle);
	}
	@And("^Enter Records$")
	public void enter_Record(DataTable records) {
		WorkspacePage.enter_Records(records);
	}
	@Then("^verify whether records are entered$")
	public void verify_Records() {
		WorkspacePage.check_Records();
		WorkspacePage.logout();
	}
}
