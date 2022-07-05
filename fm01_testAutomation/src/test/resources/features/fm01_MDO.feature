@fm01 @MDO @sprint
Feature: fm01 Functionalities of MDO Role

  @items
  Scenario: To login into fm01 application and logout
    Given the fm01 application url to launch and logged in with MDO user details
    And verify that user with id tsfm01q102 is logged in succesfully
    Then verify that user with id tsfm01q102 is logged out succesfully

  @items @check
  Scenario: To Check "Price Survey","Pricing" and "Price Notification" pages are opening
    Given the fm01 application url to launch and logged in with MDO user details
    And verify that user with id tsfm01q102 is logged in succesfully
    Then verify "Price Survey","Pricing" and "Price Notification" pages are opening

  @items
  Scenario: To check "all cancel" buttons functionality in "Configure Station" page
    Given the fm01 application url to launch and logged in with MDO user details
    And verify that user with id tsfm01q102 is logged in succesfully
    Then click on 'Configure Station' link in the main menu section
    And Provide required data as division value "Denver (05)"and facility value "41" for Corp - US
    And verify 'Cancel' button in 'Add New Competitor' page
    And Provide required data as division value "Denver (05)"and facility value "41" for Corp - US
    And verify 'Cancel' button in 'Edit Station' page

  @items
  Scenario: To check "Edit Station Information" functionality in "Configure Station" page
    Given the fm01 application url to launch and logged in with MDO user details
    And verify that user with id tsfm01q102 is logged in succesfully
    Then click on 'Configure Station' link in the main menu section
    And Provide required data as division value "Denver (05)"and facility value "41" for Corp - US
    And click on 'Edit Station Information' button
   # Dont forget to change the 'value' for address field before execution
    Then provide the value "003433 U PUMP IT" for address field and Verify 'Save' button functionality in 'Edit Station' page

  @items
  Scenario: To check "Add New Competitor" functionality in "Configure Station" page
    Given the fm01 application url to launch and logged in with MDO user details
    And verify that user with id tsfm01q102 is logged in succesfully
    Then click on 'Configure Station' link in the main menu section
    And Provide required data as division value "Denver (05)"and facility value "17" for Corp - US
    And click on 'Add New Competitor' button
    Then verify the competitor is added successfully

  @items
  Scenario: To check "Edit Competitor" functionality in "Configure Station" page
    Given the fm01 application url to launch and logged in with MDO user details
    And verify that user with id tsfm01q102 is logged in succesfully
    Then click on 'Configure Station' link in the main menu section
    And Provide required data as division value "Denver (05)"and facility value "2722" for Corp - US
    And click on 'Edit Competitors for this Station' button
    # Below competitor value should exist in the 'competitors dropdown list'
    Then select competitor "002358 SINCLAIR" from dropdown and display the selected competitor data
    Then verify 'Reset' button functionality
    Then verify 'Save' button functionality

  @items
  Scenario: To check "Edit Competitor Associations" button functionality in "Edit Competitor" page of "Configure Station" Tab
    Given the fm01 application url to launch and logged in with MDO user details
    And verify that user with id tsfm01q102 is logged in succesfully
    Then click on 'Configure Station' link in the main menu section
    And Provide required data as division value "Denver (05)"and facility value "583" for Corp - US
    And click on 'Edit Competitors for this Station' button
    # Below competitor value should exist in the 'competitors dropdown list'
    Then select competitor "002923 FRESH START" from dropdown and display the selected competitor data
    And click on 'Edit Competitor Associations' button
    Then click on 'Return to Edit Competitor' button to validate its functionality
    And click on 'Edit Competitor Associations' button
    Then edit the values for distance "5", direction "E" and limit "2" and click on 'Associate' button and verify the data updated succesfully
