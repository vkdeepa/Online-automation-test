@Workspace
Feature: Workspace
@AddRecord
  Scenario: Add Record
    Given User enters credentials to login and clicks submit button
    | Username  | Password     |
    |	autouser1 | Perfection@1 | 	
    When User is on Home Page
    Then Open AppStudio
    And Open Workspace
    Then Search and Find the app
    | Title 							|
    | Automation Sample 1 |
    And Enter Records
    | Record1 | Record2 |
    | 2       | emp2    |
    Then verify whether records are entered

