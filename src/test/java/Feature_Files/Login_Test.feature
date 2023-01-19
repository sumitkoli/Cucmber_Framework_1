
Feature: To test the login functionality
 
@LoginTest
  Scenario: To test the login functionality with valid username and password
    Given the browser is open
    When User opens the URL "https://staging.netscribes.co/tata_ems_testing/admin/d2b5316eadb139ea4a091aeca9ec5bd3"
    And User enters Email as "admin@gmail.com" and Password as "123456"
    And Click on Sign In 
    Then Page Tittle should be "Event Management System - Admin"
    When User click on logout Button
    Then Page Tittle should be "Event Management System - Admin Login"
    And close the browser
   

  
