@AppStudio
Feature: AppStudio Scenarios

@TC_177
  Scenario: COGs Menu - Does clicking on AppStudio from the COGs navigation menu take the user to the AppStudio area in a new browser tab?
    Given User enters credentials to login and clicks submit button
    | Username  | Password     |
    |	autouser1 | Perfection@1 | 	
    When User is on Home Page
    Then Open AppStudio
    Then Verify whether user has reached AppStudio page
@TC_635
  Scenario: COGs Menu - Does clicking on AppStudio from the COGs navigation menu take the user to the AppStudio area in a new browser tab?
    Given User enters credentials to login and clicks submit button
    | Username  | Password     |
    |	autouser1 | Perfection@1 | 	
    When User is on Home Page
    Then Open AppStudio
    Then Verify whether user has reached AppStudio page