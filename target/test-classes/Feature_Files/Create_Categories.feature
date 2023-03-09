@EventTest
Feature: To test Create Event Categories Function

  
  Scenario: To Create Event Categories with Valid Details
    Given the browser is open
    When User opens the URL "https://staging.netscribes.co/tata_ems_testing/admin/d2b5316eadb139ea4a091aeca9ec5bd3"
    And User enters Email as "admin@gmail.com" and Password as "123456"
    And Click on Sign In 
    Then Page Tittle should be "Event Management System - Admin"
    And Click on Event Category Tab
    Then Page Header should be "Event Categories"
    And Click on Add Event Category Button
    Then Header should be "Create Event Category"
    And Enter enter Event Name "Test1" and Status as "Inactive"
    And Click on Save
    Then Page Header should be "Event Categories"
   

