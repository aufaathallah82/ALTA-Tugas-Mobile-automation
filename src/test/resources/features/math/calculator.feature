@android
Feature: Adding Numbers

  Background: Login successfully
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login

  @sample
  Scenario: Plus function
    When user input first number "10"
    And user click spinner operator
    And user choose "plus" operator
    And user input second number "5"
    And click button calculate
    Then the result should be "15"

  @sample
  Scenario: Minus function
    When user input first number "10"
    And user click spinner operator
    And user choose "minus" operator
    And user input second number "5"
    And click button calculate
    Then the result should be "5"

  @sample
  Scenario: Multiplication function
    When user input first number "10"
    And user click spinner operator
    And user choose "multiplication" operator
    And user input second number "5"
    And click button calculate
    Then the result should be "50"

  @sample
  Scenario: Division function
    When user input first number "10"
    And user click spinner operator
    And user choose "division" operator
    And user input second number "5"
    And click button calculate
    Then the result should be "2"


