@fm01 @Pricing_Specialist @sprint
Feature: fm01 Functionalities of Pricing Specialist Role

  @logintest
  Scenario: To login into fm01 application and logout
    Given the fm01 application url to launch and logged in with Pricing Specialist user details
    And verify that user with id tsfm01q103 is logged in succesfully
    Then verify that user with id tsfm01q103 is logged out succesfully

  @check1
  Scenario: To Check "Price Survey","Pricing" and "Price Notification" pages are opening
    Given the fm01 application url to launch and logged in with Pricing Specialist user details
    And verify that user with id tsfm01q103 is logged in succesfully
    Then verify "Price Survey","Pricing" and "Price Notification" pages are opening

  @items
  Scenario: To check "all cancel" buttons functionality in "Configure Station" page
    Given the fm01 application url to launch and logged in with Pricing Specialist user details
    And verify that user with id tsfm01q103 is logged in succesfully
    Then click on 'Configure Station' link in the main menu section
    And Provide required data as division value "Texas (20)"and facility value "1783"
    And verify 'Cancel' button in 'Add New Competitor' page
    And Provide required data as division value "Texas (20)"and facility value "1783"
    And verify 'Cancel' button in 'Edit Station' page
    And Provide required data as division value "Texas (20)"and facility value "1783"
    And verify 'Cancel' button in 'Delete Station' page

  @items
  Scenario: To check "Edit Station Information" functionality in "Configure Station" page
    Given the fm01 application url to launch and logged in with Pricing Specialist user details
    And verify that user with id tsfm01q103 is logged in succesfully
    Then click on 'Configure Station' link in the main menu section
    And Provide required data as division value "Texas (20)"and facility value "1783"
    And click on 'Edit Station Information' button
   # Dont forget to change the 'value' for address field before execution
    Then provide the value "New York55" for address field and Verify 'Save' button functionality in 'Edit Station' page

  @items
  Scenario: To check "Add New Competitor" functionality in "Configure Station" page
    Given the fm01 application url to launch and logged in with Pricing Specialist user details
    And verify that user with id tsfm01q103 is logged in succesfully
    Then click on 'Configure Station' link in the main menu section
    And Provide required data as division value "Texas (20)"and facility value "1783"
    And click on 'Add New Competitor' button
    Then verify the competitor is added successfully

  @items
  Scenario: To check "Edit Competitor" functionality in "Configure Station" page
    Given the fm01 application url to launch and logged in with Pricing Specialist user details
    And verify that user with id tsfm01q103 is logged in succesfully
    Then click on 'Configure Station' link in the main menu section
    And Provide required data as division value "Denver (05)"and facility value "722"
    And click on 'Edit Competitors for this Station' button
    # Below competitor value should exist in the 'competitors dropdown list'
    Then select competitor "002893 BRADLEY/SINCLAIR" from dropdown and display the selected competitor data
    Then verify 'Reset' button functionality
    Then verify 'Save' button functionality
    Then verify 'Cancel' button in 'Delete Competitor' page
    #Below step 'Delete' will deletes the competitor, so execute the step when we wants to delete competitor
    Then verify 'Delete' button in 'Delete Competitor' page

  @items
  Scenario: To check "Edit Competitor Associations" button functionality in "Edit Competitor" page of "Configure Station" Tab
    Given the fm01 application url to launch and logged in with Pricing Specialist user details
    And verify that user with id tsfm01q103 is logged in succesfully
    Then click on 'Configure Station' link in the main menu section
    And Provide required data as division value "Denver (05)"and facility value "244"
    And click on 'Edit Competitors for this Station' button
    # Below competitor value should exist in the 'competitors dropdown list'
    Then select competitor "001421 ALTA" from dropdown and display the selected competitor data
    And click on 'Edit Competitor Associations' button
    Then click on 'Return to Edit Competitor' button to validate its functionality
    And click on 'Edit Competitor Associations' button
    Then edit the values for distance "3", direction "E" and limit "1" and click on 'Associate' button and verify the data updated succesfully

  @items
  Scenario: To check "Remove" button functionality in "Edit Competitor Association" page of "Configure Station" Tab
    Given the fm01 application url to launch and logged in with Pricing Specialist user details
    And verify that user with id tsfm01q103 is logged in succesfully
    Then click on 'Configure Station' link in the main menu section
    And Provide required data as division value "Denver (05)"and facility value "1116"
    And click on 'Edit Competitors for this Station' button
    # Below competitor value should exist in the 'competitors dropdown list'
    Then select competitor "002831 GASAMAT" from dropdown and display the selected competitor data
    And click on 'Edit Competitor Associations' button
     #Below step will removes the competitor, so execute the step when we wants to remove competitor
    Then provide the competitor details(division and facility) '1 Denver 1116' to remove and click on 'Remove' button and verify the competitor is removed

  @items
  Scenario: To check "Delete Station" functionality in "Configure Station" page
    Given the fm01 application url to launch and logged in with Pricing Specialist user details
    And verify that user with id tsfm01q103 is logged in succesfully
    Then click on 'Configure Station' link in the main menu section
    And Provide required data as division value "Texas (20)"and facility value "1783"
    # If its failing at this point please check manually that the station is available before delete
    And click on 'Delete Station' button
    Then verify the station is deleted successfully




