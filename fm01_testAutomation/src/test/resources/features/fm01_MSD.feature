@fm01 @MSD @sprint
Feature: fm01 Functionalities of MSD Role

  @items
  Scenario: To login into fm01 application and logout
    Given the fm01 application url to launch and logged in with MSD user details
    And verify that user with id tsfm01q104 is logged in succesfully
    Then verify that user with id tsfm01q104 is logged out succesfully

  @items
  Scenario: To check "all cancel" buttons functionality in "Configure Station" page
    Given the fm01 application url to launch and logged in with MSD user details
    And verify that user with id tsfm01q104 is logged in succesfully
    Then click on 'Configure Station' link in the main menu section
    And Provide required data as division value "Texas (20)"and facility value "1783"
    And verify 'Cancel' button in 'Edit Station' page
    And Provide required data as division value "Texas (20)"and facility value "1783"
    And verify 'Cancel' button in 'Delete Station' page

  @items
  Scenario: To check "Edit Station Information" functionality in "Configure Station" page
    Given the fm01 application url to launch and logged in with MSD user details
    And verify that user with id tsfm01q104 is logged in succesfully
    Then click on 'Configure Station' link in the main menu section
    And Provide required data as division value "Texas (20)"and facility value "1783"
    And click on 'Edit Station Information' button
   # Dont forget to change the 'value' for address field before execution
    Then provide the value "New Yaok6o6" for address field and Verify 'Save' button functionality in 'Edit Station' page

  Scenario: To check "select station need to be configured" functionality in "configure cost" page
    Given the fm01 application url to launch and logged in with MSD user details
    And verify that user with id tsfm01q104 is logged in succesfully
    Then click on Configure Cost link in the main menu section
    And enter required data as division value "Texas (20)"and facility value "1783"
    And click on Configure Station Cost info button
    Then verify reset button functionality of stationCostandCharges
    Then provide values for the fields and verify save button functionality of country cost page

  Scenario: To check "To configure Temporary Rack" and assign rack  functionality
    Given the fm01 application url to launch and logged in with MSD user details
    And verify that user with id tsfm01q104 is logged in succesfully
    Then click on Configure Cost link in the main menu section
    And enter required data as division value "Texas (20)"and facility value "1783"
    And click on configure temporary rack button
    And select rack "Dallas" to be assigned
    Then provide values "9" for gasfield and "03" for the diesel fields and verify assign button functionality

  Scenario: To check To configure Temporary rack and delete rack functionality
    Given the fm01 application url to launch and logged in with MSD user details
    And verify that user with id tsfm01q104 is logged in succesfully
    Then click on Configure Cost link in the main menu section
    And enter required data as division value "Texas (20)"and facility value "1783"
    And click on configure temporary rack button
    And select rack "Austin" to be assigned
    Then provide values "2" for gasfield and "5" for the diesel fields and verify deleteTempRack button

  Scenario: To check To configure Temporary rack functionality of msd
    Given the fm01 application url to launch and logged in with MSD user details
    And verify that user with id tsfm01q104 is logged in succesfully
    Then click on Configure Cost link in the main menu section
    And navigate to station rack replacement page
    Then provide "Fresno" for original rack and "Helena" for replacement rack and verify replace button

  Scenario: To check "configure state cost and charges" functionality
    Given the fm01 application url to launch and logged in with MSD user details
    And verify that user with id tsfm01q104 is logged in succesfully
    Then click on Configure Cost link in the main menu section
    And select "US (001)" as a corp value and "Indiana-IN" and verify submit button
    And verify reset functionality of reset button in state
    Then provide values for the fields and verify save button functionality of state cost page

  Scenario: To check "configure country cost charge"
    Given the fm01 application url to launch and logged in with MSD user details
    And verify that user with id tsfm01q104 is logged in succesfully
    Then click on Configure Cost link in the main menu section
    And select "US (001)" as a country value and verify submit button
    And verify reset button functionality of country cost page
    Then provide "3" for gasFederal tax and "3" for dieselfederalTax and provide "4" for ccsi surcharge and verify submit button

  Scenario: To check 'Rack cost page add rack' functionality
    Given the fm01 application url to launch and logged in with MSD user details
    And verify that user with id tsfm01q104 is logged in succesfully
    Then click on Configure Cost link in the main menu section
    #provide valid date before executing
    And select "10" for month and "6" for date "2021" for year and verify submit button
    Then verify cancel button of add rack
    Then enter "avbf" for rackname and "wdfst" for geographic region and verify add button functionality

  Scenario: To check the functionality of 'Delete' rack
    Given the fm01 application url to launch and logged in with MSD user details
    And verify that user with id tsfm01q104 is logged in succesfully
    Then click on Configure Cost link in the main menu section
    And select "10" for month and "6" for date "2021" for year and verify submit button
    #verify whether the rack is assigned to any station before deleting
    And verify cancel button for delete page
    Then verify proceed button for rack deletion

  @items
  Scenario: To check "Delete Station" functionality in "Configure Station" page
    Given the fm01 application url to launch and logged in with MSD user details
    And verify that user with id tsfm01q104 is logged in succesfully
    Then click on 'Configure Station' link in the main menu section
    And Provide required data as division value "Texas (20)"and facility value "1783"
    # If its failing at this point please check manually that the station is available before delete
    And click on 'Delete Station' button
    Then verify the station is deleted successfully

  @items
  Scenario: To check "cancel" button functionality in 'Add Station' section of "Configure Station" page
    Given the fm01 application url to launch and logged in with MSD user details
    And verify that user with id tsfm01q104 is logged in succesfully
    Then click on 'Configure Station' link in the main menu section
    And Provide required data as division value "Texas (20)"and facility value "1783"
    And verify 'Cancel' button in 'Add Station' page

  @items
  Scenario: To check "Add Station" functionality in "Configure Station" page
    Given the fm01 application url to launch and logged in with MSD user details
    And verify that user with id tsfm01q104 is logged in succesfully
    Then click on 'Configure Station' link in the main menu section
    And Provide required data as division value "Texas (20)"and facility value "1783"
    # If failing - Please check manually in order to 'Add Station' the station should be a new one, not be an existing station
    And click on 'Add Station' button
    Then provide the value "Washington DaCex" for address field and Verify 'Add Station And Continue' button functionality in 'Add Station' page

  Scenario: To check the functionality of 'save changes' button
    Given the fm01 application url to launch and logged in with MSD user details
    And verify that user with id tsfm01q104 is logged in succesfully
    Then click on Configure Cost link in the main menu section
    And select "10" for month and "6" for date "2021" for year and verify submit button
    Then provide values for the textfield and verify saveChanges button
