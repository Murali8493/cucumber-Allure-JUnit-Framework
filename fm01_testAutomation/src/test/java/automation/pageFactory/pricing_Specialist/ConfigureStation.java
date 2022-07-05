package automation.pageFactory.pricing_Specialist;

import automation.pageFactory.LaunchWebPage;
import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utils.Constants;
import utils.FileUtils;
import utils.SeleniumUtils;

import java.util.List;

public class ConfigureStation {


    @FindBy(how = How.XPATH, using = "//td[contains(text(),'Station')]")
    WebElement navBar_ConfigureStation;
    @FindBy(how = How.XPATH, using = "//td[@class='formTitle']")
    WebElement title_ConfigureStation;

    //***********Configure Station Page Corp,Division and Facility locatores ************
    @FindBy(how = How.XPATH, using = "//select[@name='corp']")
    WebElement corp_DropDown;
    @FindBy(how = How.XPATH, using = "//select[@name='div']")
    WebElement division_DropDown;
    @FindBy(how = How.XPATH, using = "//input[@name='fac']")
    WebElement facility_TxtBox;

    //***********'Edit Station Information' button locatores ************
    @FindBy(how = How.XPATH, using = "//input[@value='Edit Station Information']")
    WebElement editStationInformation_Btn;
    @FindBy(how = How.XPATH, using = "//td[text()='Edit Station']")
    WebElement editStation_Title;

    //***********'Edit Station' page locatores ************
    @FindBy(how = How.XPATH, using = "//input[@name='address']")
    WebElement address_TxtBox;
    @FindBy(how = How.XPATH, using = "//input[@value='Save']")
    WebElement save_Btn;
    @FindBy(how = How.XPATH, using = "//h2[text()='The station data has been submitted successfully.']")
    WebElement stationDataSavedConfirmation_Message;
    @FindBy(how = How.LINK_TEXT, using = "Click Here to Continue")
    WebElement clickHereToContinue_Link;

    //***********'Delete Station' page locatores ************
    @FindBy(how = How.XPATH, using = "//input[@value='Delete Station']")
    WebElement deleteStation_Btn;
    @FindBy(how = How.XPATH, using = "//td[text()='Delete Station']")
    WebElement deleteStation_Title;
    @FindBy(how = How.XPATH, using = "//input[@value='Delete']")
    WebElement delete_Btn;
    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'successfully deleted.')]")
    WebElement stationDeletedConfirmation_Message;

    //***********"MSD" role 'Add Station' page locatores ************
    @FindBy(how = How.XPATH, using = "//input[@value='Add Station']")
    WebElement addStation_Btn;
    @FindBy(how = How.XPATH, using = "//td[text()='Add Station']")
    WebElement addStation_Title;
    @FindBy(how = How.XPATH, using = "//input[@value='Add Station & Continue']")
    WebElement addStationAndContinue_Btn;
    @FindBy(how = How.XPATH, using = "//td[contains(text(),'Station Costs and Charges')]")
    WebElement stationCostsAndCharges_Title;

    //***********"Pricing Specialist" role 'Add New Competitor' page locatores ************
    @FindBy(how = How.XPATH, using = "//input[@value='Add New Competitor']")
    WebElement addNewCompetitor_Btn;
    @FindBy(how = How.XPATH, using = "//td[text()='Add New Competitor']")
    WebElement addNewCompetitor_Title;
    @FindBy(how = How.XPATH, using = "//input[@name='competitor.name']")
    WebElement competitorName_TxtBox;
    @FindBy(how = How.XPATH, using = "//input[@name='classification']")
    WebElement classification_TxtBox;
    @FindBy(how = How.XPATH, using = "//input[@name='competitor.address']")
    WebElement competitorAddress_TxtBox;
    @FindBy(how = How.XPATH, using = "//input[@name='competitor.cross.street']")
    WebElement competitorCrossStreet_TxtBox;
    @FindBy(how = How.XPATH, using = "//input[@name='competitor.city']")
    WebElement competitorCity_TxtBox;
    @FindBy(how = How.XPATH, using = "//select[@name='state']")
    WebElement competitorState_DropDown;
    @FindBy(how = How.XPATH, using = "//input[@name='competitor.zip.code']")
    WebElement competitorZipCode_TxtBox;
    @FindBy(how = How.XPATH, using = "//textarea[@name='notes']")
    WebElement competitorNotes_TxtBox;
    @FindBy(how = How.XPATH, using = "//input[@name='competitor.station.distance']")
    WebElement competitorStationDistance_TxtBox;
    @FindBy(how = How.XPATH, using = "//input[@name='competitor.station.direction']")
    WebElement competitorStationDirection_TxtBox;
    @FindBy(how = How.XPATH, using = "//input[@name='competitor.station.limit']")
    WebElement competitorStationLimit_TxtBox;
    @FindBy(how = How.XPATH, using = "//input[@value='Save']")
    WebElement competitorSave_Btn;
    @FindBy(how = How.XPATH, using = "//h2[text()='The competitor station data has been submitted successfully.']")
    WebElement competitorDataSavedConfirmation_Message;

    //  'Configure Station' page "Cancel" button locators
    @FindBy(how = How.XPATH, using = "//input[@value='Cancel']")
    WebElement cancel_Btn;

    //  'Configure Station' page "Edit Competitor" page locators
    @FindBy(how = How.XPATH, using = "//input[@value='Edit Competitors for this Station']")
    WebElement editCompetitorsForThisStation_Btn;
    @FindBy(how = How.XPATH, using = "//td[text()='Edit Competitor']")
    WebElement editCompetitor_Title;
    @FindBy(how = How.XPATH, using = "//select[@name='code']")
    WebElement getAllCompetitors_Dropdown;
    @FindBy(how = How.XPATH, using = "//input[@value='Display']")
    WebElement display_Btn;
    @FindBy(how = How.XPATH, using = "//input[@value='Reset']")
    WebElement reset_Btn;
    @FindBy(how = How.XPATH, using = "//input[@value='Save']")
    WebElement savebuttonInEditCompetitorPage_Btn;
    @FindBy(how = How.XPATH, using = "//h2[text()='The competitor was updated successfully']")
    WebElement editCompetitorSaveConfirmation_Message;
    @FindBy(how = How.LINK_TEXT, using = "Return to Edit Competitor")
    WebElement returnToEditCompetitor_Link;
    @FindBy(how = How.LINK_TEXT, using = "Configure Station")
    WebElement configureStation_Link;
    @FindBy(how = How.XPATH, using = "//input[@name='delete.competitor']")
    WebElement deleteCompetitor_Btn;
    @FindBy(how = How.XPATH, using = "//td[text()='Delete Competitor']")
    WebElement deleteCompetitor_Title;
    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'successfully removed.')]")
    WebElement deleteCompetitorConfirmation_Message;
    @FindBy(how = How.XPATH, using = "//input[@value='Edit Competitor Associations']")
    WebElement editCompetitorAssociates_Btn;
    @FindBy(how = How.XPATH, using = "//td[text()='Edit Competitor Association']")
    WebElement editCompetitorAssociates_Title;
    @FindBy(how = How.XPATH, using = "//input[@value='Return to Edit Competitor']")
    WebElement returnToEditCompetitor_Btn;
    @FindBy(how = How.XPATH, using = "//input[@value='Associate']")
    WebElement associate_Btn;
    @FindBy(how = How.XPATH, using = "//tbody//tr//td//a")
    List<WebElement> competitorAndStationDataLinkInEditCompetitorAssociationPage;
    @FindBy(how = How.XPATH, using = "//h2[text()='All associations to this competitor have been removed.']")
    WebElement removeAssociate_Title;

    //***********Configure Station Page Division and Facility locatores for MDO role ************
    @FindBy(how = How.XPATH, using = "//Select[@name='div']")
    WebElement division_Dropdown;
    @FindBy(how = How.XPATH, using = "//Select[@name='fac']")
    WebElement facility_Dropdown;

    public boolean pageOpenStatus;
    FileUtils fileUtils = new FileUtils();


    public boolean verifyConfigureStationPageOpeningStatus() {

        try {
            SeleniumUtils.webElementClick(navBar_ConfigureStation);

            pageOpenStatus = title_ConfigureStation.isDisplayed();
            if (pageOpenStatus) {
                System.out.println("Configure station Page is opened.....");
            }
            return pageOpenStatus;
        } catch (Exception e) {

            System.out.println("Configure station Page is failed to opened Successfully.....");

            return pageOpenStatus = false;
        }

    }


    public boolean provideCorpDivisionAndFacilityData(String division, String facility) {
        boolean dataSelectionStatus = false;
        try {
            String cropDropDownSelectedValue = SeleniumUtils.getSelectedValueFromDropDown(corp_DropDown);
            if (cropDropDownSelectedValue.contains("US")) {
                SeleniumUtils.selectDataByTextFromDropDown(division_DropDown, division);
                String divisionDropDownSelectedValue = SeleniumUtils.getSelectedValueFromDropDown(division_DropDown);
                if (divisionDropDownSelectedValue.equalsIgnoreCase(division)) {
                    SeleniumUtils.textSendKeys(facility_TxtBox, facility);
                    dataSelectionStatus = true;
                }
            } else {
                System.out.println("US (001) option is not selected in 'Crop' dropdown.........");
                return false;
            }
            return dataSelectionStatus;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean verifyEditStationPageDisplayed() {
        boolean editStationPageDisplayedStatus = false;
        try {
            SeleniumUtils.webElementClick(editStationInformation_Btn);
            if (editStation_Title.isDisplayed()) {
                editStationPageDisplayedStatus = true;
                System.out.println("Successfully landed on to 'Edit Station' Page............");
            }
            return editStationPageDisplayedStatus;
        } catch (Exception e) {
            System.out.println("Failed to land on 'Edit Station' Page............");
            return editStationPageDisplayedStatus;
        }
    }

    public boolean verifyEditStationPageSaveBtn(String address) {
        boolean stationdataSaveMsgStatus = false;
        try {
            address_TxtBox.clear();
            SeleniumUtils.textSendKeys(address_TxtBox, address);
            SeleniumUtils.webElementClick(save_Btn);
            if (stationDataSavedConfirmation_Message.isDisplayed()) {
                System.out.println("Station data '" + address + "' has been submitted successfully");
                SeleniumUtils.webElementClick(clickHereToContinue_Link);
                if (title_ConfigureStation.isDisplayed()) {
                    stationdataSaveMsgStatus = true;
                }
            }
            return stationdataSaveMsgStatus;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean verifyDeleteStationPageDisplayed() {
        boolean deleteStationPageDisplayedStatus = false;
        try {
            SeleniumUtils.webElementClick(deleteStation_Btn);
            if (deleteStation_Title.isDisplayed()) {
                deleteStationPageDisplayedStatus = true;
                System.out.println("Successfully landed on to 'Delete Station' Page............");
            }
            return deleteStationPageDisplayedStatus;
        } catch (Exception e) {
            System.out.println("Failed to land on 'Delete Station' Page............");
            return deleteStationPageDisplayedStatus;
        }
    }

    public boolean verifyDeleteStationPageDeleteBtn() {
        boolean stationDeletedStatus = false;
        try {
            SeleniumUtils.webElementClick(delete_Btn);
            if (stationDeletedConfirmation_Message.isDisplayed()) {
                System.out.println("Station deleted successfully.....");
                SeleniumUtils.webElementClick(clickHereToContinue_Link);
                if (title_ConfigureStation.isDisplayed()) {
                    stationDeletedStatus = true;
                }
            }
            return stationDeletedStatus;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean verifyAddStationPageDisplayed() {
        boolean addStationPageDisplayedStatus = false;
        try {
            SeleniumUtils.webElementClick(addStation_Btn);
            if (addStation_Title.isDisplayed()) {
                addStationPageDisplayedStatus = true;
                System.out.println("Successfully landed on to 'Add Station' Page............");
            }
            return addStationPageDisplayedStatus;
        } catch (Exception e) {
            System.out.println("Failed to land on 'Add Station' Page............");
            return addStationPageDisplayedStatus;
        }
    }

    public boolean verifyAddStationPageAddStationAndContinueBtn(String address) {
        boolean stationAddedMsgStatus = false;
        try {
            address_TxtBox.clear();
            SeleniumUtils.textSendKeys(address_TxtBox, address);
            SeleniumUtils.webElementClick(addStationAndContinue_Btn);
            if (stationDataSavedConfirmation_Message.isDisplayed()) {
                System.out.println("Station with address '" + address + "' has been added successfully.....");
                SeleniumUtils.webElementClick(clickHereToContinue_Link);
                if (stationCostsAndCharges_Title.isDisplayed()) {
                    stationAddedMsgStatus = true;
                }
            }
            return stationAddedMsgStatus;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean verifyAddNewCompetitorPageDisplayed() {
        boolean addNewCompetitorPageDisplayedStatus = false;
        try {
            SeleniumUtils.webElementClick(addNewCompetitor_Btn);
            if (addNewCompetitor_Title.isDisplayed()) {
                addNewCompetitorPageDisplayedStatus = true;
                System.out.println("Successfully landed on to 'Add New Competitor' Page............");
            }
            return addNewCompetitorPageDisplayedStatus;
        } catch (Exception e) {
            System.out.println("Failed to land on 'Add New Competitor' Page............");
            return addNewCompetitorPageDisplayedStatus;
        }
    }

    public boolean addNewCompetitor() {
        boolean addNewCompetitorStatus = false;
        try {
            JSONObject addNewCompetitor_Data = fileUtils.getFileContentsAsJSONObject(Constants.fm01RequiredDataPath + "addNewCompetitor_PricingSpecialist_Data.json");

            SeleniumUtils.textSendKeys(competitorName_TxtBox, addNewCompetitor_Data.get("CompetitorName").toString());
            SeleniumUtils.textSendKeys(classification_TxtBox, addNewCompetitor_Data.get("Classification").toString());
            SeleniumUtils.textSendKeys(competitorAddress_TxtBox, addNewCompetitor_Data.get("Address").toString());
            SeleniumUtils.textSendKeys(competitorCrossStreet_TxtBox, addNewCompetitor_Data.get("CrossStreets").toString());
            SeleniumUtils.textSendKeys(competitorCity_TxtBox, addNewCompetitor_Data.get("City").toString());
            SeleniumUtils.selectDataByTextFromDropDown(competitorState_DropDown, addNewCompetitor_Data.get("StateProvince").toString());
            SeleniumUtils.textSendKeys(competitorZipCode_TxtBox, addNewCompetitor_Data.get("ZipCode").toString());
            SeleniumUtils.textSendKeys(competitorNotes_TxtBox, addNewCompetitor_Data.get("Notes").toString());
            SeleniumUtils.textSendKeys(competitorStationDistance_TxtBox, addNewCompetitor_Data.get("Distance").toString());
            SeleniumUtils.textSendKeys(competitorStationDirection_TxtBox, addNewCompetitor_Data.get("Direction").toString());
            SeleniumUtils.textSendKeys(competitorStationLimit_TxtBox, addNewCompetitor_Data.get("Limit").toString());
            SeleniumUtils.webElementClick(competitorSave_Btn);
            if (competitorDataSavedConfirmation_Message.isDisplayed()) {
                addNewCompetitorStatus = true;
            }

            return addNewCompetitorStatus;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }


    public boolean verifyCancelButtonInAddNewCompetitorPage() {
        boolean cancelBtnStatus = false;
        try {
            SeleniumUtils.webElementClick(addNewCompetitor_Btn);
            if (addNewCompetitor_Title.isDisplayed()) {
                SeleniumUtils.webElementClick(cancel_Btn);
                if (title_ConfigureStation.isDisplayed()) {
                    cancelBtnStatus = true;
                    System.out.println("Clicked on 'Add New Competitor' page 'Cancel' button " +
                            "and Successfully landed on to 'Configure Station' page.....");
                }
            }
            return cancelBtnStatus;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean verifyCancelButtonInEditStationPage() {
        boolean cancelBtnStatus = false;
        try {
            SeleniumUtils.webElementClick(editStationInformation_Btn);
            if (editStation_Title.isDisplayed()) {
                SeleniumUtils.webElementClick(cancel_Btn);
                if (title_ConfigureStation.isDisplayed()) {
                    cancelBtnStatus = true;
                    System.out.println("Clicked on 'Edit Station' page 'Cancel' button " +
                            "and Successfully landed on to 'Configure Station' page.....");
                }
            }
            return cancelBtnStatus;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean verifyCancelButtonInDeleteStationPage() {
        boolean cancelBtnStatus = false;
        try {
            SeleniumUtils.webElementClick(deleteStation_Btn);
            if (deleteStation_Title.isDisplayed()) {
                SeleniumUtils.webElementClick(cancel_Btn);
                if (title_ConfigureStation.isDisplayed()) {
                    cancelBtnStatus = true;
                    System.out.println("Clicked on 'Delete Station' page 'Cancel' button " +
                            "and Successfully landed on to 'Configure Station' page.....");
                }
            }
            return cancelBtnStatus;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean verifyCancelButtonInAddStationPage() {
        boolean cancelBtnStatus = false;
        try {
            SeleniumUtils.webElementClick(addStation_Btn);
            if (addStation_Title.isDisplayed()) {
                SeleniumUtils.webElementClick(cancel_Btn);
                if (title_ConfigureStation.isDisplayed()) {
                    cancelBtnStatus = true;
                    System.out.println("Clicked on 'Add Station' page 'Cancel' button " +
                            "and Successfully landed on to 'Configure Station' page.....");
                }
            }
            return cancelBtnStatus;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean verifyEditCompetitorPageDisplayed() {
        boolean editCompetitorPageDisplayedStatus = false;
        try {
            SeleniumUtils.webElementClick(editCompetitorsForThisStation_Btn);
            if (editCompetitor_Title.isDisplayed()) {
                editCompetitorPageDisplayedStatus = true;
                System.out.println("Successfully landed on to 'Edit Competitor' Page............");
            }
            return editCompetitorPageDisplayedStatus;
        } catch (Exception e) {
            System.out.println("Failed to land on 'Edit Competitor' Page............");
            return editCompetitorPageDisplayedStatus;
        }
    }

    public boolean selectCompetitorFromDropdown(String competitor) {
        boolean editCompetitorPageDisplayedStatus = false;
        try {
            List<WebElement> competitorOptions = new Select(getAllCompetitors_Dropdown).getOptions();

            int size = competitorOptions.size();
            System.out.println("No of Competitors in dropdown :::" + size);
            for (int i = 0; i < size; i++) {
                String options = competitorOptions.get(i).getText();
                System.out.println("Competitors ::: " + options);
                if (options.equals(competitor)) {
                    SeleniumUtils.selectDataByTextFromDropDown(getAllCompetitors_Dropdown, competitor);
                    String selectedCompetitor = SeleniumUtils.getSelectedValueFromDropDown(getAllCompetitors_Dropdown);

                    if (selectedCompetitor.equals(competitor)) {
                        System.out.println("Selected competitor ::::: " + competitor);
                        SeleniumUtils.webElementClick(display_Btn);
                        if (competitorName_TxtBox.isDisplayed()) {
                            return editCompetitorPageDisplayedStatus = true;
                        }
                    }
                }
            }
            return editCompetitorPageDisplayedStatus;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return editCompetitorPageDisplayedStatus;
        }
    }

    public boolean verifyResetButtonInEditCompetitorPage() {
        boolean editCompetitorPageResetButtonStatus = false;
        try {
            String competitorName = competitorName_TxtBox.getText();
            SeleniumUtils.textSendKeys(competitorName_TxtBox, " Testing");
            SeleniumUtils.webElementClick(reset_Btn);
            String competitorName_AfterReset = competitorName_TxtBox.getText();
            if (competitorName.equals(competitorName_AfterReset)) {
                editCompetitorPageResetButtonStatus = true;
                Thread.sleep(2000);
            }
            return editCompetitorPageResetButtonStatus;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return editCompetitorPageResetButtonStatus;
        }
    }

    public boolean verifySaveButtonInEditCompetitorPage() {
        boolean editCompetitorPageSaveButtonStatus = false;
        try {
            SeleniumUtils.textSendKeys(competitorName_TxtBox, " Testing");
            SeleniumUtils.webElementClick(savebuttonInEditCompetitorPage_Btn);
            if (editCompetitorSaveConfirmation_Message.isDisplayed()) {

                SeleniumUtils.webElementClick(returnToEditCompetitor_Link);
                if (editCompetitor_Title.isDisplayed()) {
                    Thread.sleep(2000);
                    String updatedCompetitorName = competitorName_TxtBox.getAttribute("value");
                    List<WebElement> competitorOptions = new Select(getAllCompetitors_Dropdown).getOptions();

                    int size = competitorOptions.size();
                    for (int i = 0; i < size; i++) {
                        String options = competitorOptions.get(i).getText();
                        if (options.equals(updatedCompetitorName)) {
                            return editCompetitorPageSaveButtonStatus = true;
                        }

                    }
                }
            }
            return editCompetitorPageSaveButtonStatus;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return editCompetitorPageSaveButtonStatus;
        }
    }


    public boolean verifyCancelButtonInDeleteCompetitorPage() {
        boolean cancelBtnStatus = false;
        try {
            SeleniumUtils.webElementClick(deleteCompetitor_Btn);
            if (deleteCompetitor_Title.isDisplayed()) {
                SeleniumUtils.webElementClick(cancel_Btn);
                if (editCompetitor_Title.isDisplayed()) {
                    cancelBtnStatus = true;
                    System.out.println("Clicked on 'Delete Competitor' page 'Cancel' button " +
                            "and Successfully landed on to 'Edit Competitor' page.....");
                }
            }
            return cancelBtnStatus;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean verifyDeleteButtonInDeleteCompetitorPage() {
        boolean deleteBtnStatus = false;
        try {
            SeleniumUtils.webElementClick(deleteCompetitor_Btn);
            if (deleteCompetitor_Title.isDisplayed()) {
                Thread.sleep(2000);
                SeleniumUtils.webElementClick(delete_Btn);
                Thread.sleep(2000);
                SeleniumUtils.acceptBrowserAlert();
                Thread.sleep(2000);
                if (deleteCompetitorConfirmation_Message.isDisplayed()) {
                    System.out.println("Conpetitor is deleted Successfully.....");
                    Thread.sleep(2000);
                    SeleniumUtils.webElementClick(clickHereToContinue_Link);
                    if (editCompetitor_Title.isDisplayed()) {
                        Thread.sleep(2000);
                        deleteBtnStatus = true;
                    }
                }
            }
            return deleteBtnStatus;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean verifyEditCompetitorAssociationsButtonFunctionality() {
        boolean editCompetitorAssociationsStatus = false;
        try {
            SeleniumUtils.webElementClick(editCompetitorAssociates_Btn);
            if (editCompetitorAssociates_Title.isDisplayed()) {
                editCompetitorAssociationsStatus = true;
                System.out.println("Successfully landed on to 'Edit Competitor Association' Page............");
            }
            return editCompetitorAssociationsStatus;
        } catch (Exception e) {
            System.out.println("Failed to land on 'Edit Competitor Association' Page............");
            return editCompetitorAssociationsStatus;
        }
    }

    public boolean verifyReturnToEditCompetitorButtonFunctionality() {
        boolean returnToEditCompetitorStatus = false;
        try {
            SeleniumUtils.webElementClick(returnToEditCompetitor_Btn);
            if (editCompetitor_Title.isDisplayed()) {
                returnToEditCompetitorStatus = true;
                System.out.println("Successfully landed on to 'Edit Competitor' Page............");
            }
            return returnToEditCompetitorStatus;
        } catch (Exception e) {
            System.out.println("Failed to land on 'Edit Competitor' Page............");
            return returnToEditCompetitorStatus;
        }
    }

    public boolean editValuesForDistanceDirectionAndLimitFieldsInEditCompetitorAssociationPageAndClickOnAssociateBtnAndVerifyDataUpdatedSuccessfully(String distance, String direction, String limit) {
        boolean dataUpdateStatus = false;
        try {
            competitorStationDistance_TxtBox.clear();
            SeleniumUtils.textSendKeys(competitorStationDistance_TxtBox, distance);
            competitorStationDirection_TxtBox.clear();
            SeleniumUtils.textSendKeys(competitorStationDirection_TxtBox, direction);
            competitorStationLimit_TxtBox.clear();
            SeleniumUtils.textSendKeys(competitorStationLimit_TxtBox, limit);
            SeleniumUtils.webElementClick(associate_Btn);
            List<WebElement> stationAssociates = competitorAndStationDataLinkInEditCompetitorAssociationPage;
            int listSize = stationAssociates.size();
            System.out.println("No of station associates displayed :::" + listSize);
            for (int i = 0; i < listSize; i++) {
                String stationAssociate = stationAssociates.get(i).getText();
                if (stationAssociate.contains(distance) && stationAssociate.contains(direction)) {
                    System.out.println("Distance:" + distance + ", Direction:" + direction + " updated successfully.");
                    return dataUpdateStatus = true;
                }

            }
            return dataUpdateStatus;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean verifyCompetitorIsRemovedWhenClickedOnRemoveButton(String competitorDetails) {
        boolean competitorRemovedStatus = false;
        int listSize = 0;
        int listSizeAfterRemove;
        WebElement associateRemove_Btn = null;
        try {
            List<WebElement> stationAssociates = competitorAndStationDataLinkInEditCompetitorAssociationPage;
             listSize = stationAssociates.size();
            System.out.println("No of station associates displayed when landed on to 'Edit Competitor associate' page is:::" + listSize);
            
              associateRemove_Btn= LaunchWebPage.driver.findElement(By.xpath("//a[contains(text(),'"+competitorDetails+"')]//parent::td//following-sibling::td//input"));
              associateRemove_Btn.click();
             if (removeAssociate_Title.isDisplayed()) {
                competitorRemovedStatus = true;
                System.out.println("Successfully associate/competitor '"+competitorDetails+"' is removed.....");
              }
            return competitorRemovedStatus;
        } catch (Exception e) {
            List<WebElement> stationAssociates = competitorAndStationDataLinkInEditCompetitorAssociationPage;
            listSizeAfterRemove = stationAssociates.size();
            System.out.println("No of station associates displayed after clicked on 'Remove' button is :::" + listSizeAfterRemove);
            if(listSizeAfterRemove<listSize)
            {
                competitorRemovedStatus = true;
                System.out.println("Successfully associate/competitor '"+competitorDetails+"' is removed.....");
            }

            System.out.println(e.getMessage());
            return competitorRemovedStatus;
        }
    }

    public boolean provideDivisionAndFacilityDataForUSCorp(String division, String facility) {
        boolean dataSelectionStatus = false;
        try {
            SeleniumUtils.selectDataByTextFromDropDown(division_DropDown,division);
            SeleniumUtils.selectDataByTextFromDropDown(facility_Dropdown,facility);
           String selectedFacility= SeleniumUtils.getSelectedValueFromDropDown(facility_Dropdown);

            if (selectedFacility.equals(facility)) {
                    dataSelectionStatus = true;
            }
            return dataSelectionStatus;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
