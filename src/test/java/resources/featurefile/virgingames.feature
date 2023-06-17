Feature: Homepage functionality
  As user I want to check top menu tab and login tab functionality
 @regression
  Scenario: User should navigate to game page when you click on menu tab
    Given I am on homepage
    And   I accepted cookie
    When  I click on All games Tab
    And   I get online slots text
    Then  I verify 'online slots' text
    And   I click on '3 Lucky Rainbow' game
    Then  I navigate to game page

  @smoke
  Scenario: User should navigate to login verify page successfully
    Given  I am on the  homepage
    And    I accept cookie on homepage
    When   I click on Login link
    Then   I should navigate to verify page successfully
