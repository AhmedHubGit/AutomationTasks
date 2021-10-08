@Run
Feature: Login Actions
 
  Scenario Outline: User can Login successfully with valid user and pass
    Given User can Navigate to WebSite
    When Enter Username "<User>"
    And Enter Password "<Password>"
    Then User Login Successfully

    Examples: 
      | User| Password |
      | Admin| admin123 |
      | Test | test1274 |
