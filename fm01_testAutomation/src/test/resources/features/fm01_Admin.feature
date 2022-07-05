@fm01 @Admin @sprint
Feature: fm01 Functionalities of Admin Role

  @items
  Scenario: To login into fm01 application and logout
    Given the fm01 application url to launch and logged in with Admin user details
    And verify that user with id tsfm01q106 is logged in succesfully
    Then verify that user with id tsfm01q106 is logged out succesfully

  @items @check
  Scenario: To Check "Price Survey","Pricing" and "Price Notification" pages are opening
    Given the fm01 application url to launch and logged in with Admin user details
    And verify that user with id tsfm01q106 is logged in succesfully
    Then verify "Price Survey","Pricing" and "Price Notification" pages are opening

  @items
  Scenario: To check "all cancel" buttons functionality in "Configure Station" page
    Given the fm01 application url to launch and logged in with Admin user details
    And verify that user with id tsfm01q106 is logged in succesfully
    Then click on 'Configure Station' link in the main menu section
    And Provide required data as division value "Texas (20)"and facility value "1783"
    And verify 'Cancel' button in 'Add New Competitor' page
    And Provide required data as division value "Texas (20)"and facility value "1783"
    And verify 'Cancel' button in 'Edit Station' page
    And Provide required data as division value "Texas (20)"and facility value "1783"
    And verify 'Cancel' button in 'Delete Station' page

  @items
  Scenario: To check "Edit Station Information" functionality in "Configure Station" page
    Given the fm01 application url to launch and logged in with Admin user details
    And verify that user with id tsfm01q106 is logged in succesfully
    Then click on 'Configure Station' link in the main menu section
    And Provide required data as division value "Texas (20)"and facility value "1783"
    And click on 'Edit Station Information' button
   # Dont forget to change the 'value' for address field before execution
    Then provide the value "Neew Yoks" for address field and Verify 'Save' button functionality in 'Edit Station' page

  @items
  Scenario: To check "Add New Competitor" functionality in "Configure Station" page
    Given the fm01 application url to launch and logged in with Admin user details
    And verify that user with id tsfm01q106 is logged in succesfully
    Then click on 'Configure Station' link in the main menu section
    And Provide required data as division value "Texas (20)"and facility value "1783"
    And click on 'Add New Competitor' button
    Then verify the competitor is added successfully

  @items
  Scenario: To check "Edit Competitor" functionality in "Configure Station" page
    Given the fm01 application url to launch and logged in with Admin user details
    And verify that user with id tsfm01q106 is logged in succesfully
    Then click on 'Configure Station' link in the main menu section
    And Provide required data as division value "Denver (05)"and facility value "1116"
    And click on 'Edit Competitors for this Station' button
    # Below competitor value should exist in the 'competitors dropdown list'
    Then select competitor "000200 KING SOOPERS" from dropdown and display the selected competitor data
    Then verify 'Reset' button functionality
    Then verify 'Save' button functionality
    Then verify 'Cancel' button in 'Delete Competitor' page
    #Below step 'Delete' will deletes the competitor, so execute the step when we wants to delete competitor
    Then verify 'Delete' button in 'Delete Competitor' page

  @items
  Scenario: To check "Edit Competitor Associations" button functionality in "Edit Competitor" page of "Configure Station" Tab
    Given the fm01 application url to launch and logged in with Admin user details
    And verify that user with id tsfm01q106 is logged in succesfully
    Then click on 'Configure Station' link in the main menu section
    And Provide required data as division value "Denver (05)"and facility value "1116"
    And click on 'Edit Competitors for this Station' button
    # Below competitor value should exist in the 'competitors dropdown list'
    Then select competitor "002832 SAV-O-MAT" from dropdown and display the selected competitor data
    And click on 'Edit Competitor Associations' button
    Then click on 'Return to Edit Competitor' button to validate its functionality
    And click on 'Edit Competitor Associations' button
    Then edit the values for distance "1", direction "E" and limit "2" and click on 'Associate' button and verify the data updated succesfully

  @items
  Scenario: To check "Remove" button functionality in "Edit Competitor Association" page of "Configure Station" Tab
    Given the fm01 application url to launch and logged in with Admin user details
    And verify that user with id tsfm01q106 is logged in succesfully
    Then click on 'Configure Station' link in the main menu section
    And Provide required data as division value "Denver (05)"and facility value "1045"
    And click on 'Edit Competitors for this Station' button
    # Below competitor value should exist in the 'competitors dropdown list'
    Then select competitor "001490 KING SOOPERS Testing" from dropdown and display the selected competitor data
    And click on 'Edit Competitor Associations' button
     #Below step will removes the competitor, so execute the step when we wants to remove competitor
    Then provide the competitor details(division and facility) '1 Denver 1045' to remove and click on 'Remove' button and verify the competitor is removed

  @items
  Scenario: To check "Delete Station" functionality in "Configure Station" page
    Given the fm01 application url to launch and logged in with Admin user details
    And verify that user with id tsfm01q106 is logged in succesfully
    Then click on 'Configure Station' link in the main menu section
    And Provide required data as division value "Texas (20)"and facility value "1783"
    # If its failing at this point please check manually that the station is available before delete
    And click on 'Delete Station' button
    Then verify the station is deleted successfully

  @items
  Scenario: To check "cancel" button functionality in 'Add Station' section of "Configure Station" page
    Given the fm01 application url to launch and logged in with Admin user details
    And verify that user with id tsfm01q106 is logged in succesfully
    Then click on 'Configure Station' link in the main menu section
    And Provide required data as division value "Texas (20)"and facility value "1783"
    And verify 'Cancel' button in 'Add Station' page

  @items
  Scenario: To check "Add Station" functionality in "Configure Station" page
    Given the fm01 application url to launch and logged in with Admin user details
    And verify that user with id tsfm01q106 is logged in succesfully
    Then click on 'Configure Station' link in the main menu section
    And Provide required data as division value "Texas (20)"and facility value "1783"
    # If failing - Please check manually in order to 'Add Station' the station should be a new one, not be an existing station
    And click on 'Add Station' button
    Then provide the value "Waslngton sd" for address field and Verify 'Add Station And Continue' button functionality in 'Add Station' page

  Scenario: To check "select station need to be configured" functionality in "configure cost" page
    Given the fm01 application url to launch and logged in with Admin user details
    And verify that user with id tsfm01q106 is logged in succesfully
    Then click on Configure Cost link in the main menu section
    And enter required data as division value "Texas (20)"and facility value "1783"
    And click on Configure Station Cost info button
    Then verify reset button functionality of stationCostandCharges
    Then provide values for the fields and verify save button functionality of country cost page

  Scenario: To check "To configure Temporary Rack" and assign rack  functionality
    Given the fm01 application url to launch and logged in with Admin user details
    And verify that user with id tsfm01q106 is logged in succesfully
    Then click on Configure Cost link in the main menu section
    And enter required data as division value "Texas (20)"and facility value "1783"
    And click on configure temporary rack button
    And select rack "Dallas" to be assigned
    Then provide values "6" for gasfield and "8" for the diesel fields and verify assign button functionality

  Scenario: To check To configure Temporary rack and delete rack functionality
    Given the fm01 application url to launch and logged in with Admin user details
    And verify that user with id tsfm01q106 is logged in succesfully
    Then click on Configure Cost link in the main menu section
    And enter required data as division value "Texas (20)"and facility value "1783"
    And click on configure temporary rack button
    And select rack "Austin" to be assigned
    Then provide values "9" for gasfield and "4" for the diesel fields and verify deleteTempRack button

  Scenario: To check To configure Temporary rack functionality of msd
    Given the fm01 application url to launch and logged in with Admin user details
    And verify that user with id tsfm01q106 is logged in succesfully
    Then click on Configure Cost link in the main menu section
    And navigate to station rack replacement page
    Then provide "Fresno" for original rack and "Helena" for replacement rack and verify replace button

  Scenario: To check "configure state cost and charges" functionality
    Given the fm01 application url to launch and logged in with Admin user details
    And verify that user with id tsfm01q106 is logged in succesfully
    Then click on Configure Cost link in the main menu section
    And select "US (001)" as a corp value and "Indiana-IN" and verify submit button
    And verify reset functionality of reset button in state
    Then provide values for the fields and verify save button functionality of state cost page

  Scenario: To check "configure country cost charge"
    Given the fm01 application url to launch and logged in with Admin user details
    And verify that user with id tsfm01q106 is logged in succesfully
    Then click on Configure Cost link in the main menu section
    And select "US (001)" as a country value and verify submit button
    And verify reset button functionality of country cost page
    Then provide "5" for gasFederal tax and "8" for dieselfederalTax and provide "3" for ccsi surcharge and verify submit button

  Scenario: To check 'Rack cost page add rack' functionality
    Given the fm01 application url to launch and logged in with Admin user details
    And verify that user with id tsfm01q106 is logged in succesfully
    Then click on Configure Cost link in the main menu section
    #provide valid date before executing
    And select "10" for month and "7" for date "2021" for year and verify submit button
    Then verify cancel button of add rack
    Then enter "aks" for rackname and "atlas" for geographic region and verify add button functionality

  Scenario: To check the functionality of 'Delete' rack
    Given the fm01 application url to launch and logged in with Admin user details
    And verify that user with id tsfm01q106 is logged in succesfully
    Then click on Configure Cost link in the main menu section
    And select "10" for month and "7" for date "2021" for year and verify submit button
    #verify whether the rack is assigned to any station before deleting
    And verify cancel button for delete page
    Then verify proceed button for rack deletion
