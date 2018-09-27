@CreateApp
Feature: CreateApp Scenarios
@AddApp
  Scenario: Create App
    Given User enters credentials to login and clicks submit button
    | Username  | Password     |
    |	autouser1 | Perfection@1 | 	
    When User is on Home Page
    Then Open AppStudio
    And Open Create App Page
    Then Enter App Details and create an app 
    | Title							  | Description                     																			|
    | Automation Sample 2 | This app is created to run automation sample tests Created by: Deepa  |
    Then Verify whether App is created
@ConfigureApp    
  Scenario: Add Info to the App created
    Given User enters credentials to login and clicks submit button
    | Username  | Password     |
    |	autouser1 | Perfection@1 | 	
    When User is on Home Page
    Then Open AppStudio
    And Search and open the app
    | Title 							|
    | Automation Sample 2 |
    Then Enter App Info and save
    | Category	 | Record type | Record type plural | Icon logo URL                                                         | Publisher name  | publisher Logo Url 																										| Developer name | Developer user 					 |
    | Automation | Auto Sample | Auto Sample's      | https://tse1.mm.bing.net/th?id=OIP.IaOfJA0AYJzWujSlxMn4WQHaCd&pid=Api | Test Automation | http://labs.sogeti.com/wp-content/uploads/2015/07/test-automation.jpg | AutoUser1 		 | AutoUser1 FN AutoUser1 LN |
    Then Verify whether app info is saved
@AddFiled
  Scenario: Add Field
  	Given User enters credentials to login and clicks submit button
    | Username  | Password     |
    |	autouser1 | Perfection@1 | 	
    When User is on Home Page
    Then Open AppStudio
    And Search and open the app
    | Title 							|
    | Automation Sample 2 |
    Then Add Fields
    | Fieldname | Fieldtype | 
    | Integer   | Integer   | 
    | Text      | Text      |
    Then verify whether field is saved
@AddTemplate
  Scenario: Add template
  	Given User enters credentials to login and clicks submit button
    | Username  | Password     |
    |	autouser1 | Perfection@1 | 	
    When User is on Home Page
    Then Open AppStudio
    And Search and open the app
    | Title 							|
    | Automation Sample 2 |
    Then Add Template
    | Title  				| Helptext 																| No of columns | Column1 | Column2 |
    | Auto Template | This template is created for Automation | 2							|	Integer | Text		|
    Then verify whether Template is saved
@AddForm
  Scenario: Add form
  	Given User enters credentials to login and clicks submit button
    | Username  | Password     |
    |	autouser1 | Perfection@1 | 	
    When User is on Home Page
    Then Open AppStudio
    And Search and open the app
    | Title 							|
    | Automation Sample 2 |
    Then Add Form
    | Title  		| Displayorder | Template 	 	|
    | Auto form | 1            | AutoTemplate	|		
    Then verify whether Form is saved 
@AddReport
	Scenario: Add report
  	Given User enters credentials to login and clicks submit button
    | Username  | Password     |
    |	autouser1 | Perfection@1 | 	
    When User is on Home Page
    Then Open AppStudio
    And Search and open the app
    | Title 							|
    | Automation Sample 2 |
    Then Add report
    | Title  		                 | Reporttype | Displayorder | ReportfieldsDisplayorder | ReportfieldsColumnpriority | ReportFieldsParentFieldPriorityLocator | ReportfieldsDisplayorder2 | ReportfieldsColumnpriority2 | ReportFieldsParentFieldPriorityLocator2 |
    | Auto LIST Report - Default | List       | 1						 | 1												| 1													 | Integer																| 2												  | 2													  |	Text																	  |				
    Then verify whether report is saved 
@PublishApp
  Scenario: Add report
  	Given User enters credentials to login and clicks submit button
    | Username  | Password     |
    |	autouser1 | Perfection@1 | 	
    When User is on Home Page
    Then Open AppStudio
    And Search and open the app
    | Title 							|
    | Automation Sample 2 | 
    Then Publish app
    | Uservisible |
    | Auto User   |
    Then verify whether app is published 
     