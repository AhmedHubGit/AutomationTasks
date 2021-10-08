@NotRun
Feature: UserPage  Actions
 
  Scenario Outline: User can Navigate to UsersPage successfully
    Given User can Navigate to WebSite
    When Enter Username "<User>"
    And Enter Password "<Password>"
    And User Login Successfully
    Then User can Open Users Page

    Examples: 
      | User| Password |
      | Admin| admin123 |
      | Test | test1274 |
