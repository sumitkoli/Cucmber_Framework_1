
Feature: To test the login functionality
 
@Sanity
  Scenario: To test the login functionality with valid username and valid password
    Given the browser is open
    When User opens the URL "https://staging.netscribes.co/tata_ems_testing/admin/d2b5316eadb139ea4a091aeca9ec5bd3"
    And User enters Email as "admin@gmail.com" and Password as "123456"
    And Click on Sign In 
    Then Page Tittle should be "Event Management System - Admin"
    And close the browser
    
 
  Scenario: To test the login functionality with valid username and invalid password
    Given the browser is open
    When User opens the URL "https://staging.netscribes.co/tata_ems_testing/admin/d2b5316eadb139ea4a091aeca9ec5bd3"
    And User enters Email as "admin@gmail.com" and Password as "12345"
    And Click on Sign In 
    Then Validations message is displayed for valid username and invalid password
    And close the browser
   
   Scenario: To test the login functionality with invalid username and valid password
    Given the browser is open
    When User opens the URL "https://staging.netscribes.co/tata_ems_testing/admin/d2b5316eadb139ea4a091aeca9ec5bd3"
    And User enters Email as "admin@gmail.co" and Password as "123456"
    And Click on Sign In 
    Then Validations message is displayed for invalid username and valid password
    And close the browser
    
    Scenario: To test the login functionality with invalid username and invalid password
    Given the browser is open
    When User opens the URL "https://staging.netscribes.co/tata_ems_testing/admin/d2b5316eadb139ea4a091aeca9ec5bd3"
    And User enters Email as "admin@gmail.co" and Password as "123456"
    And Click on Sign In 
    Then Validations message is displayed for invalid username and invalid password
    And close the browser
    
    Scenario: To test the login functionality with blank username and valid password
    Given the browser is open
    When User opens the URL "https://staging.netscribes.co/tata_ems_testing/admin/d2b5316eadb139ea4a091aeca9ec5bd3"
    And User enters Email as "" and Password as "123456"
    And Click on Sign In 
    Then Validations message is displayed for blank username and valid password
    And close the browser
    
    Scenario: To test the login functionality with valid username and blank password
    Given the browser is open
    When User opens the URL "https://staging.netscribes.co/tata_ems_testing/admin/d2b5316eadb139ea4a091aeca9ec5bd3"
    And User enters Email as "admin@gmail.co" and Password as ""
    And Click on Sign In 
    Then Validations message is displayed for valid username and blank password
    And close the browser
    
    Scenario: To test the login functionality with blank username and blank password
    Given the browser is open
    When User opens the URL "https://staging.netscribes.co/tata_ems_testing/admin/d2b5316eadb139ea4a091aeca9ec5bd3"
    And User enters Email as "" and Password as ""
    And Click on Sign In 
    Then Validations message is displayed for blank username and blank password
    And close the browser

  
