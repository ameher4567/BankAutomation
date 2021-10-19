Feature: Verify Login Details

  @LoginTest @PositiveTest
  Scenario Outline: Verify Login Functionality of GTPL Bank
    Given User is present on HomePage of GTPL Bank
    When  Enter the "<uname>" as Username and "<pwd>" as password
    And User clicks on Login button
    Then User should get login into the GTPL Bank Website

    Examples: 
      | uname | pwd |
      | mngr360090 | YrunavA |
      
      
  @LoginTest @NegetiveTest
  Scenario Outline: Verify Login Functionality of GTPL Bank
    Given User is present on HomePage of GTPL Bank
    When  Enter the "<uname>" as Username and "<pwd>" as password
    Then User should get error as "<message>"


    Examples:
    | uname | pwd | message |
    | mngr360090 |   | Password must not be blank |
    |  | YrunavA | User-ID must not be blank |