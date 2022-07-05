package automation.stepDefinition;

import automation.pageFactory.LaunchWebPage;
import automation.pageFactory.LogOutPage;
import automation.pageFactory.LoginPage;
import automation.pageFactory.admin.MainMenu;
import automation.pageFactory.msd.ConfigureCost;
import automation.pageFactory.pricing_Specialist.ConfigureStation;
import automation.pageFactory.pricing_Specialist.HomePageMenus;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.qameta.allure.Allure;
import org.apache.xpath.operations.String;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.Constants;
import utils.LogUtils;

import java.io.IOException;

public class stepDefinition extends reUsableMethods {

    WebDriver driver;
    public boolean userLoginStatus;
    public boolean userLogoutStatus;
    public String userName;

    public stepDefinition() throws IOException {
    }

    @Before
    public void before(Scenario scenario) throws IOException {
        if (System.getProperty("browserType") != null) {
            testParam.setBrowserType(System.getProperty("browserType"));
        } else {
            testParam.setBrowserType(getPropertyValue("browserType"));
        }
        testParam.setEnvironment("QA");
//        testParam.setEnvironment(System.getProperty("environment"));
        fileUtils.setPropertyValue(Constants.allureEnvPropPath, "browserType", testParam.getBrowserType());
        LogUtils.info("\n****************** Starting scenario: " + scenario.getName() + " *******************");

    }


    @Given("^the fm01 application url to launch and logged in with (.*) user details$")
    public void loginToTheApplication(String userType) throws IOException, ParseException, InterruptedException {
        JSONObject appUrls = fileUtils.getFileContentsAsJSONObject(Constants.urlsPath);
        String url = ((JSONObject) appUrls.get(testParam.getEnvironment())).get("URL").toString();
        JSONObject dataSheet = fileUtils.getFileContentsAsJSONObject(Constants.userDataJsonPath);
        userName = ((JSONObject) dataSheet.get(userType)).get("userId").toString();
        String password = ((JSONObject) dataSheet.get(userType)).get("password").toString();
        System.out.println("fm01 Application url: " + url);
        LaunchWebPage launchWebPage = new LaunchWebPage();
        driver = launchWebPage.launchWebPage(testParam.getBrowserType(), url);
        loginPage = PageFactory.initElements(LaunchWebPage.driver, LoginPage.class);
//        if(testParam.getBrowserType().equalsIgnoreCase("IE")){
//            loginPage.enterUserName(userName);
//        }
//        loginPage.logInToApplication(userName, password);
        loginPage.enterUserName(userName);
        loginPage.login(password);
        mainMenu = PageFactory.initElements(LaunchWebPage.driver, MainMenu.class);
        //orderWriterMenu = PageFactory.initElements(LaunchWebPage.driver, OrderWriterMenu.class);
        //  orderReceiverMenu = PageFactory.initElements(LaunchWebPage.driver, OrderReceiverMenu.class);
        testParam.setUserType(userType);
        Allure.step("User Id: " + userName);

    }


    @And("^verify that user with id (.*) is logged in succesfully$")
    public void verifyUserLogin(String user) throws InterruptedException {
        if (userName.equalsIgnoreCase(user)) {
            userLoginStatus = mainMenu.verifyUserLoginStatus(user);
            Assert.assertTrue(userLoginStatus);
        } else {
            System.out.println("The user Id provided " + user + " is not matched with logged in user Id");
            Assert.assertTrue(false);
        }
    }

    @Then("^verify that user with id (.*) is logged out succesfully$")
    public void verifyUserLogout(String user) throws InterruptedException {
        logOutPage = PageFactory.initElements(LaunchWebPage.driver, LogOutPage.class);
        logOutPage.userLogout();
        userLogoutStatus = logOutPage.verifyLogOutStatus();
        if (userLogoutStatus == false) {
            System.out.println("User " + user + " logged out succesfully.....");
        }
        Assert.assertFalse(userLogoutStatus);
    }

    @Then("verify {string},{string} and {string} pages are opening")
    public void verifyAllMenuPagesAreOpeningForPricingSpecilistRole(String price_Survey, String pricing, String price_Notification) {
        homePageMenus = PageFactory.initElements(LaunchWebPage.driver, HomePageMenus.class);

        Assert.assertTrue(homePageMenus.verifyPriceSurveyPageOpening(price_Survey));
        Assert.assertTrue(homePageMenus.verifyPricingPageOpening(pricing));
        Assert.assertTrue(homePageMenus.verifyPriceNotificationPageOpening(price_Notification));
    }

    @Then("click on 'Configure Station' link in the main menu section")
    public void clickOnConfigureStationLinkInTheMainMenuSection() {
        configureStation = PageFactory.initElements(LaunchWebPage.driver, ConfigureStation.class);
        Assert.assertTrue(configureStation.verifyConfigureStationPageOpeningStatus());
    }

    @And("Provide required data as division value {string}and facility value {string}")
    public void provideRequiredDataAsDivisionValueAndFacilityValue(String division, String facility) throws InterruptedException {
        Assert.assertTrue(configureStation.provideCorpDivisionAndFacilityData(division, facility));
    }


    @And("click on 'Edit Station Information' button")
    public void clickOnEditStationInformationButton() {
        Assert.assertTrue(configureStation.verifyEditStationPageDisplayed());
    }

    @Then("provide the value {string} for address field and Verify 'Save' button functionality in 'Edit Station' page")
    public void provideTheValueForAddressFiledAndVerifyButtonFunctionalityInPage(String address) {
        Assert.assertTrue(configureStation.verifyEditStationPageSaveBtn(address));
    }

    @And("click on 'Delete Station' button")
    public void clickOnDeleteStatiomButton() {
        Assert.assertTrue(configureStation.verifyDeleteStationPageDisplayed());
    }

    @Then("verify the station is deleted successfully")
    public void verifyTheStationIsDeletedSuccessfully() {
        Assert.assertTrue(configureStation.verifyDeleteStationPageDeleteBtn());
    }

    @And("click on 'Add Station' button")
    public void clickOnAddStationButton() {
        Assert.assertTrue(configureStation.verifyAddStationPageDisplayed());
    }

    @Then("provide the value {string} for address field and Verify 'Add Station And Continue' button functionality in 'Add Station' page")
    public void provideTheValueForAddressFieldAndVerifyAddStationAndContinueButtonFunctionalityInAddStationPage(String address) throws InterruptedException {
        Assert.assertTrue(configureStation.verifyAddStationPageAddStationAndContinueBtn(address));
    }

    @And("click on 'Add New Competitor' button")
    public void clickOnAddNewCompetitorButton() {
        Assert.assertTrue(configureStation.verifyAddNewCompetitorPageDisplayed());
    }

    @Then("verify the competitor is added successfully")
    public void verifyTheCompetitorIsAddedSuccessfully() {

        Assert.assertTrue(configureStation.addNewCompetitor());
    }


    @And("verify 'Cancel' button in 'Add New Competitor' page")
    public void verifyCancelButtonInAddNewCompetitorPage() {
        Assert.assertTrue(configureStation.verifyCancelButtonInAddNewCompetitorPage());
    }


    @And("verify 'Cancel' button in 'Edit Station' page")
    public void verifyCancelButtonInEditStationPage() {
        Assert.assertTrue(configureStation.verifyCancelButtonInEditStationPage());
    }

    @And("verify 'Cancel' button in 'Delete Station' page")
    public void verifyCancelButtonInDeleteStationPage() {
        Assert.assertTrue(configureStation.verifyCancelButtonInDeleteStationPage());

    }

    @And("verify 'Cancel' button in 'Add Station' page")
    public void verifyCancelButtonInAddStationPage() {
        Assert.assertTrue(configureStation.verifyCancelButtonInAddStationPage());
    }



    @Then("click on Configure Cost link in the main menu section")
    public void clickOnConfigureCostLinkInTheMainMenuSection() {
        configureCost = PageFactory.initElements(LaunchWebPage.driver, ConfigureCost.class);
        Assert.assertTrue(configureCost.verifyConfigureCostPageOpeningStatus());
    }


   // @And("provide required data as country value {string}")
   // public void provideRequiredDataAsCountryValue(String country) {
        //configureCost = PageFactory.initElements(LaunchWebPage.driver, ConfigureCost.class);

        //Assert.assertTrue(ConfigureCost.provideCorpData(country));
   // }

    @And("click on 'Edit Competitors for this Station' button")
    public void clickOnEditCompetitorsForThisStationButton() {
        Assert.assertTrue(configureStation.verifyEditCompetitorPageDisplayed());
    }

    @Then("select competitor {string} from dropdown and display the selected competitor data")
    public void selectCompetitorFromDropdownAndDisplayTheSelectedCompetitorData(String competitor) {
        Assert.assertTrue(configureStation.selectCompetitorFromDropdown(competitor));
    }

    @Then("verify 'Reset' button functionality")
    public void verifyResetButtonFunctionality() {
        Assert.assertTrue(configureStation.verifyResetButtonInEditCompetitorPage());
    }

    @Then("verify 'Save' button functionality")
    public void verifySaveButtonFunctionality() {
        Assert.assertTrue(configureStation.verifySaveButtonInEditCompetitorPage());

    }

    @Then("verify 'Cancel' button in 'Delete Competitor' page")
    public void verifyCancelButtonInDeleteCompetitorPage() {
        Assert.assertTrue(configureStation.verifyCancelButtonInDeleteCompetitorPage());
    }

    @Then("verify 'Delete' button in 'Delete Competitor' page")
    public void verifyDeleteButtonInDeleteCompetitorPage() {
        Assert.assertTrue(configureStation.verifyDeleteButtonInDeleteCompetitorPage());
    }

    @And("click on 'Edit Competitor Associations' button")
    public void clickOnEditCompetitorAssociationsButton() {
        Assert.assertTrue(configureStation.verifyEditCompetitorAssociationsButtonFunctionality());

    }

    @Then("click on 'Return to Edit Competitor' button to validate its functionality")
    public void clickOnReturnToEditCompetitorButtonToValidateItsFunctionality() {
        Assert.assertTrue(configureStation.verifyReturnToEditCompetitorButtonFunctionality());
    }

    @Then("edit the values for distance {string}, direction {string} and limit {string} and click on 'Associate' button and verify the data updated succesfully")
    public void editTheValuesForDistanceDirectionAndLimitAndClickAssociateBtnAndVerifyDataUpdatedSuccessfully(String distance, String direction, String limit) throws Throwable {    // Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();}
        Assert.assertTrue(configureStation.editValuesForDistanceDirectionAndLimitFieldsInEditCompetitorAssociationPageAndClickOnAssociateBtnAndVerifyDataUpdatedSuccessfully(distance,direction,limit));
    }

    @Then("provide the competitor details\\(division and facility) {string} to remove and click on 'Remove' button and verify the competitor is removed")
    public void provideTheCompetitorDetailsDivisionAndFacilityDenverToRemoveAndClickOnRemoveButtonAndVerifyTheCompetitorIsRemoved(String competitorDetails) {
        Assert.assertTrue(configureStation.verifyCompetitorIsRemovedWhenClickedOnRemoveButton(competitorDetails));
    }



    @And("Provide required data as corp value {string} division value {string}and facility value {string}")
    public void provideRequiredDataAsCorpValueDivisionValueAndFacilityValue( String division, String facility) {
        Assert.assertTrue(configureCost.providCorpDivisionAndFacilityData(division,facility));
    }

    @And("click on Configure Station Cost info button")
    public void clickOnConfigureStationCostInfoButton() {
        Assert.assertTrue(configureCost.verifyConfigureStationCostInfo());
    }

    @Then("verify reset button functionality of stationCostandCharges")
    public void verifyResetButtonFunctionalityOfStationCostandCharges() {
        Assert.assertTrue(configureCost.verifyResetButtonForStationCostAndCharges());
    }

    @Then("provide values for the fields and verify save button functionality")
    public void provideValuesForTheFieldsAndVerifySaveButtonFunctionality() throws IOException, ParseException {
        Assert.assertTrue(configureCost.stationCostandCharges());

    }
        @And("Provide required data as division value {string}and facility value {string} for Corp - US")
        public void provideRequiredDataAsDivisionValueAndFacilityValueForCorpUS (String division, String facility){
            Assert.assertTrue(configureStation.provideDivisionAndFacilityDataForUSCorp(division, facility));
        }

    @And("click on configure temporary rack button")
    public void clickOnConfigureTemporaryRackButton() {
        Assert.assertTrue(configureCost.verifyConfigureTemporaryRack());
    }


    @And("select rack {string} to be assigned")
    public void selectRackToBeAssigned(String rack) {
        Assert.assertTrue(configureCost.selectrackToAssign(rack));
    }

    @Then("provide values {string} for gasfield and {string} for the diesel fields and verify assign button functionality")
    public void provideValuesForGasfieldAndForTheDieselFieldsAndVerifyAssignButtonFunctionality(String gas, String diesel) throws InterruptedException {
        Assert.assertTrue(configureCost.verifyAssignButton(gas, diesel));
    }

    @Then("provide values {string} for gasfield and {string} for the diesel fields and verify deleteTempRack button")
    public void provideValuesForGasfieldAndForTheDieselFieldsAndVerifyDeleteTempRackButton(String gas, String diesel) throws InterruptedException {
        Assert.assertTrue(configureCost.verifyDeleteTempRackButton(gas, diesel));
    }

    @And("navigate to station rack replacement page")
    public void navigateToStationRackReplacementPage() {
        Assert.assertTrue(configureCost.verifyReplaceRack());
    }

    @Then("provide {string} for original rack and {string} for replacement rack and verify replace button")
    public void provideForOriginalRackAndForReplacementRackAndVerifyReplaceButton(String orgrack, String reprack) throws InterruptedException {
   Assert.assertTrue(configureCost.verifyReplaceRackButton(orgrack,reprack));
    }

    @And("select {string} as a corp value and {string} and verify submit button")
    public void selectAsACorpValueAndAndVerifySubmitButton(String country, String state) throws InterruptedException {
        Assert.assertTrue(configureCost.statecostchargestatus(country,state));
    }

    @And("verify reset functionality of reset button in state")
    public void verifyResetFunctionalityOfResetButton() {
        Assert.assertTrue(configureCost.verifyResetButtonForStateCostAndCharges());
    }

    @Then("provide values for the fields and verify save button functionality of state cost page")
    public void provideValuesForTheFieldsAndVerifySaveButtonFunctionalityOfStateCostPage() {
        Assert.assertTrue((configureCost.stationCostandCharges()));
    }

    @And("select {string} as a country value and verify submit button")
    public void selectAsACountryValueAndVerifySubmitButton(String country) throws InterruptedException {
        Assert.assertTrue(configureCost.countryCostCharges(country));
    }

    @And("verify reset button functionality of country cost page")
    public void verifyResetButtonFunctionalityOfCountryCostPage() {
        Assert.assertTrue(configureCost.verifyResetButtonForcountryCostAndCharges());
    }

    @Then("provide {string} for gasFederal tax and {string} for dieselfederalTax and provide {string} for ccsi surcharge and verify submit button")
    public void provideForGasFederalTaxAndForDieselfederalTaxAndProvideForCcsiSurchargeAndVerifySubmitButton(String gas, String diesel, String ccsiSurcharge) throws InterruptedException {
  Assert.assertTrue(configureCost.countyCostSubmitbutton(gas,diesel,ccsiSurcharge));
    }

    @And("select {string} for month and {string} for date {string} for year and verify submit button")
    public void selectForMonthAndForDateForYearAndVerifySubmitButton(String month, String day, String year) throws InterruptedException {
    Assert.assertTrue(configureCost.riviewrackCostpage(month, day, year));
    }

    @Then("verify cancel button of add rack")
    public void verifyCancelButtonOfAddRack() {
        Assert.assertTrue(configureCost.verifyCanceladdRackButton());

    }

    @Then("enter {string} for rackname and {string} for geographic region and verify add button functionality")
    public void enterForRacknameAndForGeographicRegionAndVerifyAddButtonFunctionality(String rack, String geographicName) throws InterruptedException {
   Assert.assertTrue(configureCost.addrackfunctionality(rack,geographicName));
    }

    @And("verify cancel button for delete page")
    public void verifyCancelButtonForDeletePage() {
        Assert.assertTrue(configureCost.verifyCancelButtonInDeleterackPage());
    }

    @Then("verify proceed button for rack deletion")
    public void verifyProceedButtonForRackDeletion() throws InterruptedException {
        Assert.assertTrue(configureCost.deleteProceed());
    }

    @Then("provide values for the textfield and verify saveChanges button")
    public void provideValuesForTheTextfieldAndVerifySaveChangesButton() throws IOException, ParseException {
        Assert.assertTrue(configureCost.rackcostData());

    }

    @And("enter required data as division value {string}and facility value {string}")
    public void enterRequiredDataAsDivisionValueAndFacilityValue(String division, String facility) {
            Assert.assertTrue(configureCost.providCorpDivisionAndFacilityData(division,facility));
        }

    @Then("provide values for the fields and verify save button functionality of country cost page")
    public void provideValuesForTheFieldsAndVerifySaveButtonFunctionalityOfCountryCostPage() {
        Assert.assertTrue(configureCost.countrycostData());
    }
}


