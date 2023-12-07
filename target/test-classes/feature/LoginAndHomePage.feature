Feature: Login page for Adactin

  Background: 
    Given Enter the username "Muthulakshmi07"
    And Enter the password "Test@123"

  Scenario: Validate home page displayed
    When Enter the loginbutton
    Then Validate HomePage