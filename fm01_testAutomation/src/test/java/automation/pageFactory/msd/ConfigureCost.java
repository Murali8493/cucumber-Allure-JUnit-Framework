package automation.pageFactory.msd;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utils.Constants;
import utils.FileUtils;
import utils.SeleniumUtils;

import java.io.IOException;

public class ConfigureCost {

    @FindBy(how = How.XPATH, using = "//td[contains(text(),'Cost')]")
    WebElement navBar_ConfigureCost;
    @FindBy(how = How.XPATH, using = "//td[contains(text(),'Configure Cost Info')]")
    WebElement title_ConfigureCost;
    @FindBy(how = How.XPATH, using = "//input[@type='submit']")
    WebElement submitButton;
    @FindBy(how = How.XPATH, using = "//select[@name='corp']")
    WebElement corp_DropDown;

    //***********Configure cost Page  locators ************
    @FindBy(how = How.XPATH, using = "(//select[@name='corp'])[2]")
    WebElement corpForStateAndProvision_DropDown;
    @FindBy(how = How.XPATH, using = "//select[@name='div']")
    WebElement division_DropDown;
    @FindBy(how = How.XPATH, using = "//input[@name='fac']")
    WebElement facility_TxtBox;
    @FindBy(how = How.XPATH, using = "//select[@name='state' and @size='1']")
    WebElement selectState_DropDown;
    @FindBy(how = How.XPATH, using = "(//input[@value='Submit'])[3]")
    WebElement stateprovinceSubmit;

    //*****************Configure country cost charges*******************
    @FindBy(how = How.XPATH, using = "//input[@name='country.gas.tax.rate']")
    WebElement federalTax_Amount_for_Gas;
    @FindBy(how = How.XPATH, using = "//input[@name='country.diesel.tax.rate']")
    WebElement federalTax_Amount_for_diesel;
    @FindBy(how = How.XPATH, using = "//input[@name='country.ccsi.charge']")
    WebElement enter_CCSI_Charges;
    @FindBy(how = How.XPATH, using = "//input[@value='Save']")
    WebElement saveButton;
    @FindBy(how = How.XPATH, using = "//input[@value='Reset']")
    WebElement resetButton;
    @FindBy(how = How.XPATH, using = "(//input[@value='Submit'])[2]")
    WebElement countrySubmit;
    @FindBy(how = How.XPATH, using = "//td[@class='formTitle']")
    WebElement deleterackTitle;
    //*********************Configure state cost and charges************
    @FindBy(how = How.XPATH, using = "//td[@class='formTitle']")
    WebElement stateCostCharge_Title;
    @FindBy(how = How.XPATH, using = "//input[@name='state.gas.tax.rate']")
    WebElement stateGasTaxRate;
    @FindBy(how = How.XPATH, using = "//input[@name='misc.gas.tax.rate']")
    WebElement state_misc_Gas_TaxRate;
    @FindBy(how = How.XPATH, using = "//input[@name='prepaid.gas.tax.rate']")
    WebElement state_prepaidGasTaxRate;
    @FindBy(how = How.XPATH, using = "//input[@name='gst.gas.tax.perc']")
    WebElement stateGstGasTax;
    @FindBy(how = How.XPATH, using = "//input[@name='misc.gas.perc']")
    WebElement stateMisgasperc;
    @FindBy(how = How.XPATH, using = "//input[@name='state.diesel.tax.rate']")
    WebElement state_DieseltaxRate;
    @FindBy(how = How.XPATH, using = "//input[@name='misc.diesel.tax.rate']")
    WebElement state_DieselmisctaxRate;
    @FindBy(how = How.XPATH, using = "//input[@name='prepaid.diesel.tax.rate']")
    WebElement state_DieselPrepaidTaxRate;
    @FindBy(how = How.XPATH, using = "//input[@name='gst.diesel.tax.perc']")
    WebElement state_Diesel_gsttax;
    @FindBy(how = How.XPATH, using = "//input[@name='misc.diesel.perc']")
    WebElement state_dieselMiscTax;
    @FindBy(how = How.XPATH, using = "//input[@name='UNLEADED']")
    WebElement state_Unleaded;
    @FindBy(how = How.XPATH, using = "//input[@name='MIDGRADE']")
    WebElement state_Midgrade;
    @FindBy(how = How.XPATH, using = "//input[@name='PREMIUM']")
    WebElement state_Premium;


    //****To navigate Rack cost page
    @FindBy(how = How.XPATH, using = "//select[@name='date.month']")
    WebElement selectMonth_DropDown;
    @FindBy(how = How.XPATH, using = "//select[@name='date.day']")
    WebElement selectDay_DropDown;
    @FindBy(how = How.XPATH, using = "//input[@name='date.year']")
    WebElement selectYear;
    @FindBy(how = How.XPATH, using = "//td[@class='formTitle']")
    WebElement rackCost_Title;
    @FindBy(how = How.XPATH, using = "(//input[@name='rack.cost.applied.friday.94'])[1]")
    WebElement mradiobutton;
    @FindBy(how = How.XPATH, using = "(//input[@name='rack.cost.applied.friday.94'])[2]")
    WebElement fradioButton;
    @FindBy(how = How.XPATH, using = "(//input[@name='rack.cost.94.UNLEADED'])[1]")
    WebElement rackunleadedTextbox;
    @FindBy(how = How.XPATH, using = "(//input[@name='rack.cost.94.UNLEADED.variance'])[1]")
    WebElement rackVarienceTextbox;
    @FindBy(how = How.XPATH, using = "(//input[@name='rack.cost.94.MIDGRADE'])[1]")
    WebElement rackMidgradeTextbox;
    @FindBy(how = How.XPATH, using = "(//input[@name='rack.cost.94.MIDGRADE.variance'])[1]")
    WebElement rackMidgradeVarience;
    @FindBy(how = How.XPATH, using = "(//input[@name='rack.cost.94.PREMIUM'])[1]")
    WebElement rackPremiumTextfield;
    @FindBy(how = How.XPATH, using = "//input[@name='rack.cost.94.PREMIUM.variance']")
    WebElement rackPremiumVarience;
    @FindBy(how = How.XPATH, using = "//input[@name='rack.cost.94.DIESEL']")
    WebElement rackDieseltexfield;
    @FindBy(how = How.XPATH, using = "//input[@name='rack.cost.94.DIESEL.variance']")
    WebElement rackDieselVarience;
    @FindBy(how = How.XPATH, using = "//input[@name='rack.cost.94.EFREEGAS']")
    WebElement rackEfreeGasTextfield;
    @FindBy(how = How.XPATH, using = "//input[@name='rack.cost.94.EFREEGAS.variance']")
    WebElement rackFreegasVarience;
    @FindBy(how = How.XPATH, using = "(//input[@value='Delete'])[2]")
    WebElement rackdeleteButton;
    @FindBy(how = How.XPATH, using = "//input[@value='Proceed']")
    WebElement rackDeleteProceedButton;
    @FindBy(how = How.XPATH, using = "//input[@value='Cancel']")
    WebElement rackdeleteCancelButton;
    @FindBy(how = How.XPATH, using = "//input[@value='Save Changes']")
    WebElement rackSaveChangesButton;
    @FindBy(how = How.XPATH, using = "//input[@value='Add New Rack']")
    WebElement addNewRackButton;
    @FindBy(how = How.XPATH, using = "//td[@class='formTitle']")
    WebElement addRackTitle;
    @FindBy(how = How.XPATH, using = "//input[@name='rack.name']")
    WebElement rackName;
    @FindBy(how = How.XPATH, using = "//input[@name='rack.geographic.region']")
    WebElement rackGeographicRegion;
    @FindBy(how = How.XPATH, using = "//input[@value='Cancel']")
    WebElement addRackCancelButton;
    @FindBy(how = How.XPATH, using = "//input[@value='Add']")
    WebElement rack_Add_Button;

    //**********Configure Rack/station *****************
    @FindBy(how = How.XPATH, using = "//input[@value='Configure Station Cost Info']")
    WebElement configureStation_CostInfo_Tab;
    @FindBy(how = How.XPATH, using = "//input[@value='Configure Temporary Rack']")
    WebElement configure_Temporary_Rack;
    @FindBy(how = How.XPATH, using = "//input[@value='Replace Rack Assignments']")
    WebElement replace_Rack_Assignment;
    @FindBy(how = How.XPATH, using = "//td[@class='formTitle']")
    WebElement stationCostInfo_Title;
    @FindBy(how = How.LINK_TEXT, using = "Click Here to Continue")
    WebElement clickHereToContinue_Link;
    @FindBy(how=How.XPATH,using ="(//select[@name='corp'])[3]")
    WebElement selectCorpForCountry;

    //************Station cost and Charges*********

    @FindBy(how = How.XPATH, using = "//input[@name='gas.freight.rate']")
    WebElement gasFreightRate;
    @FindBy(how = How.XPATH, using = "//input[@name='city.gas.tax.rate']")
    WebElement gas_cityTaxRate;
    @FindBy(how = How.XPATH, using = "//input[@name='gas.adjustment']")
    WebElement gas_AdjustmentAmount;
    @FindBy(how = How.XPATH, using = "//input[@name='freight.surcharge']")
    WebElement gas_freight_Surcharge;
    @FindBy(how = How.XPATH, using = "//select[@name='oxy.begin.month']")
    WebElement gas_select_Month_oxyBegining;
    @FindBy(how = How.XPATH, using = "//select[@name='oxy.begin.day']")
    WebElement gas_select_Day_oxyBegining;
    @FindBy(how = How.XPATH, using = "//input[@name='oxy.tax.credit']")
    WebElement gas_oxy_Tax_credit;
    @FindBy(how = How.XPATH, using = "//input[@name='sales.tax.perc']")
    WebElement gas_salesTax;
    @FindBy(how = How.XPATH, using = "//input[@name='diesel.sales.tax.perc']")
    WebElement diesel_Sales_Tax;
    @FindBy(how = How.XPATH, using = "//input[@name='diesel.freight.rate']")
    WebElement diesel_freight_Rate;
    @FindBy(how = How.XPATH, using = "//input[@name='city.diesel.tax.rate']")
    WebElement diesel_City_tax_Rate;
    @FindBy(how = How.XPATH, using = "//input[@name='diesel.adjustment']")
    WebElement diesel_Adjustment_Amount;
    @FindBy(how = How.XPATH, using = "//select[@name='oxy.end.month']")
    WebElement diesel_Oxy_End_Month;
    @FindBy(how = How.XPATH, using = "//select[@name='oxy.end.day']")
    WebElement diesel_oxy_End_day;
    @FindBy(how = How.XPATH, using = "//input[@value='5' and @name='grades.sold']")
    WebElement unleaded_checkBox;
    @FindBy(how = How.XPATH, using = "//input[@value='10' and @name='grades.sold']")
    WebElement midgrade_Checkbox;
    @FindBy(how = How.XPATH, using = "//input[@value='15' and @name='grades.sold']")
    WebElement premium_Checkbox;
    @FindBy(how = How.XPATH, using = "//input[@value='20' and @name='grades.sold']")
    WebElement diesel_Checkbox;
    @FindBy(how = How.XPATH, using = "//input[@value='25' and @name='grades.sold']")
    WebElement efreeGas_Checkbox;
    @FindBy(how = How.XPATH, using = "//input[@value='36' and @name='grades.sold']")
    WebElement deiesel_unleaded_checkbox;
    @FindBy(how = How.XPATH, using = "//input[@value='1' and @name='grades.sold']")
    WebElement efreegas_Unleaded_Checkbox;
    @FindBy(how = How.XPATH, using = "//select[@name='default.rack']")
    WebElement default_Track_Dropdown;
    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'submitted successfully.')]")
    WebElement costDataSubmit_Msg;
    @FindBy(how = How.XPATH, using = "//h2[text()='Rack was added successfully.']")
    WebElement addRackSubmit_msg;
    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'deleted successfully.')]")
    WebElement deleteRackSubmit_Msg;
    @FindBy(how = How.XPATH, using = "//h2[text()='Temporary rack was removed successfully.']")
    WebElement removeTemporaryRackSubmit_Msg;
    //*********************Configure Temporary Rack**********************

    @FindBy(how = How.XPATH, using = "//td[text()='Configure Temporary Rack']")
    WebElement title_Configure_Temporary_Rack;
    @FindBy(how = How.XPATH, using = "//select[@name='temp.rack']")
    WebElement selectRack_To_AssignThisStation;
    @FindBy(how = How.XPATH, using = "//input[@value='Assign']")
    WebElement assign_Button;
    @FindBy(how = How.XPATH, using = "//input[@value='Delete Temp Rack']")
    WebElement deleteTempRack;

    //******************Replace Rack Assignment****************

    @FindBy(how = How.XPATH, using = "//input[@value='Replace Rack Assignments']")
    WebElement replaceRack_AssignmentTab;
    @FindBy(how = How.XPATH, using = "//select[@name='original.rack']")
    WebElement select_Originalrack;
    @FindBy(how = How.XPATH, using = "//select[@name='replacement.rack']")
    WebElement select_replacement_Rack;
    @FindBy(how = How.XPATH, using = "//input[@value='Replace']")
    WebElement replaceButton;
    @FindBy(how = How.XPATH, using = "//td[@class='formTitle']")
    WebElement replaceRack_Title;


    public boolean pageOpenStatus;
    FileUtils fileUtils = new FileUtils();

    public boolean verifyConfigureCostPageOpeningStatus() {
        try {
            SeleniumUtils.webElementClick(navBar_ConfigureCost);
            pageOpenStatus = title_ConfigureCost.isDisplayed();
            if (pageOpenStatus) {
                System.out.println("Configure cost Page is opened.....");
            }
            return pageOpenStatus;
        } catch (Exception e) {
            System.out.println("Configure station Page is failed to opened Successfully.....");
            return pageOpenStatus = false;
        }
    }

    public boolean providCorpDivisionAndFacilityData(String division, String facility) {
        boolean dataSelectionStatus = false;
        try {
            String cropDropDownSelectedValue = SeleniumUtils.getSelectedValueFromDropDown(selectCorpForCountry);
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

    public boolean verifyConfigureStationCostInfo() {
        boolean stationcostInfoPageDisplayedStatus = false;
        try {
            SeleniumUtils.webElementClick(configureStation_CostInfo_Tab);
            if (stationCostInfo_Title.isDisplayed()) {
                stationcostInfoPageDisplayedStatus = true;
                System.out.println("Successfully landed on to ' Station cost info' Page............");
            }
            return stationcostInfoPageDisplayedStatus;
        } catch (Exception e) {
            System.out.println("Failed to land on 'Station cost info' Page............");
            return stationcostInfoPageDisplayedStatus;
        }
    }

    public boolean verifyResetButtonForStationCostAndCharges() {
        boolean stationCostAndChargesPageResetButtonStatus = false;
        try {
            String gasFreightRateValue = gasFreightRate.getText();
            SeleniumUtils.textSendKeys(gasFreightRate, " Testing");
            SeleniumUtils.webElementClick(resetButton);
            String competitorName_AfterReset = gasFreightRate.getText();
            if (gasFreightRateValue.equals(competitorName_AfterReset)) {
                stationCostAndChargesPageResetButtonStatus = true;
            }
            return stationCostAndChargesPageResetButtonStatus;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return stationCostAndChargesPageResetButtonStatus;
        }
    }

    public boolean countrycostData() {
        boolean stationCostChargeStatus = false;
        try {
            JSONObject stationCostCharge_Data = fileUtils.getFileContentsAsJSONObject(Constants.fm01RequiredDataPath + "stationCostAndCharge_Msd.json");
            gasFreightRate.clear();
            SeleniumUtils.textSendKeys(gasFreightRate, stationCostCharge_Data.get("Freight Rate").toString());
            gas_cityTaxRate.clear();
            SeleniumUtils.textSendKeys(gas_cityTaxRate, stationCostCharge_Data.get("County/City Tax Rate").toString());
            gas_AdjustmentAmount.clear();
            SeleniumUtils.textSendKeys(gas_AdjustmentAmount, stationCostCharge_Data.get("Adjustment Amount").toString());
            gas_freight_Surcharge.clear();
            SeleniumUtils.textSendKeys(gas_freight_Surcharge, stationCostCharge_Data.get("Freight Surcharge").toString());
            SeleniumUtils.selectDataByTextFromDropDown(gas_select_Month_oxyBegining, stationCostCharge_Data.get("Gas OxyBeginingMonth").toString());
            SeleniumUtils.selectDataByTextFromDropDown(gas_select_Day_oxyBegining, stationCostCharge_Data.get("Gas_OxyBeginingDay").toString());
            gas_oxy_Tax_credit.clear();
            SeleniumUtils.textSendKeys(gas_oxy_Tax_credit, stationCostCharge_Data.get("Oxy Tax Credit").toString());
            gas_salesTax.clear();
            SeleniumUtils.textSendKeys(gas_salesTax, stationCostCharge_Data.get("Sales Tax").toString());
            diesel_Sales_Tax.clear();
            SeleniumUtils.textSendKeys(diesel_Sales_Tax, stationCostCharge_Data.get("Diesel Sales Tax").toString());
            diesel_freight_Rate.clear();
            SeleniumUtils.textSendKeys(diesel_freight_Rate, stationCostCharge_Data.get("Diesel Freight Rate").toString());
            diesel_City_tax_Rate.clear();
            SeleniumUtils.textSendKeys(diesel_City_tax_Rate, stationCostCharge_Data.get("Diesel County/City Tax Rate").toString());
            diesel_Adjustment_Amount.clear();
            SeleniumUtils.textSendKeys(diesel_Adjustment_Amount, stationCostCharge_Data.get("Diesel Adjustment Amount").toString());
            SeleniumUtils.selectDataByTextFromDropDown(diesel_oxy_End_day, stationCostCharge_Data.get("Oxy ending date_day").toString());
            SeleniumUtils.selectDataByTextFromDropDown(diesel_Oxy_End_Month, stationCostCharge_Data.get("Oxydate_month ending").toString());
            SeleniumUtils.webElementClick(unleaded_checkBox);
            SeleniumUtils.webElementClick(premium_Checkbox);
            SeleniumUtils.webElementClick(midgrade_Checkbox);
            SeleniumUtils.webElementClick(diesel_Checkbox);
            SeleniumUtils.webElementClick(efreeGas_Checkbox);
            SeleniumUtils.webElementClick(efreegas_Unleaded_Checkbox);
            SeleniumUtils.webElementClick(deiesel_unleaded_checkbox);
            SeleniumUtils.selectDataByTextFromDropDown(default_Track_Dropdown, stationCostCharge_Data.get("Default rack").toString());
            SeleniumUtils.webElementClick(saveButton);
            if (costDataSubmit_Msg.isDisplayed()) {
                System.out.println("Cost data submitted successfully.....");
                SeleniumUtils.webElementClick(clickHereToContinue_Link);
                if (title_ConfigureCost.isDisplayed()) {
                    stationCostChargeStatus = true;
                }
            }
            return stationCostChargeStatus;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean verifyConfigureTemporaryRack() {
        boolean ConfigureTemporaryRackDisplayedStatus = false;
        try {
            SeleniumUtils.webElementClick(configure_Temporary_Rack);
            if (title_Configure_Temporary_Rack.isDisplayed()) {
                ConfigureTemporaryRackDisplayedStatus = true;
                System.out.println("Successfully landed on to ' Station cost info' Page............");
            }
            return ConfigureTemporaryRackDisplayedStatus;
        } catch (Exception e) {
            System.out.println("Failed to land on 'Station cost info' Page............");
            return ConfigureTemporaryRackDisplayedStatus;
        }
    }

    public boolean selectrackToAssign(String rack) {
        boolean selectRackStatus = false;
        try {
            SeleniumUtils.selectDataByTextFromDropDown(selectRack_To_AssignThisStation, rack);
            String assignrack = SeleniumUtils.getSelectedValueFromDropDown(selectRack_To_AssignThisStation);
            if (assignrack.equals(rack)) {
                selectRackStatus = true;
            }
            return selectRackStatus;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return selectRackStatus;
        }
    }

    public boolean verifyAssignButton(String gas, String diesel) throws InterruptedException {
        boolean assignStatus = false;
        try {
            gasFreightRate.clear();
            SeleniumUtils.textSendKeys(gasFreightRate, gas);
            diesel_freight_Rate.clear();
            SeleniumUtils.textSendKeys(diesel_freight_Rate, diesel);
            SeleniumUtils.webElementClick(assign_Button);
            if (costDataSubmit_Msg.isDisplayed()) {
                System.out.println("Station assigned successfully.....");
                SeleniumUtils.webElementClick(clickHereToContinue_Link);
                if (title_ConfigureCost.isDisplayed()) {
                    assignStatus = true;
                }
            }
            return assignStatus;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return assignStatus;
        }
    }

    public boolean verifyDeleteTempRackButton(String gas, String diesel) throws InterruptedException {
        boolean deleteRackStatus = false;
        try {
            gasFreightRate.clear();
            SeleniumUtils.textSendKeys(gasFreightRate, gas);
            diesel_freight_Rate.clear();
            SeleniumUtils.textSendKeys(diesel_freight_Rate, diesel);
            SeleniumUtils.webElementClick(deleteTempRack);
            if (removeTemporaryRackSubmit_Msg.isDisplayed()) {
                System.out.println("rack deleted successfully.....");
                SeleniumUtils.webElementClick(clickHereToContinue_Link);
                if (title_ConfigureCost.isDisplayed()) {
                    deleteRackStatus = true;
                }
            }
            return deleteRackStatus;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return deleteRackStatus;
        }
    }

    public boolean verifyReplaceRack() {
        boolean replaceRackDisplayedStatus = false;
        try {
            SeleniumUtils.webElementClick(replace_Rack_Assignment);
            if (replaceRack_Title.isDisplayed()) {
                replaceRackDisplayedStatus = true;
                System.out.println("Successfully landed on to ' station rack  replacement' Page............");
            }
            return replaceRackDisplayedStatus;
        } catch (Exception e) {
            System.out.println("Failed to land on 'station rack replacement page' Page............");
            return replaceRackDisplayedStatus;
        }
    }

    public boolean verifyReplaceRackButton(String orgrack, String reprack) throws InterruptedException {
        boolean replaceRackStatus = false;
        try {
            SeleniumUtils.selectDataByTextFromDropDown(select_Originalrack, orgrack);
            SeleniumUtils.selectDataByTextFromDropDown(select_replacement_Rack, reprack);
            SeleniumUtils.webElementClick(replaceButton);
            if (costDataSubmit_Msg.isDisplayed()) {
                System.out.println("rack replaced  successfully.....");
                SeleniumUtils.webElementClick(clickHereToContinue_Link);
                if (title_ConfigureCost.isDisplayed()) {
                    replaceRackStatus = true;
                }
            }
            return replaceRackStatus;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return replaceRackStatus;
        }
    }

    public boolean statecostchargestatus(String country, String state) throws InterruptedException {
        boolean stateChargehomepageStatus = false;
        try {
            SeleniumUtils.selectDataByTextFromDropDown(corpForStateAndProvision_DropDown, country);
            SeleniumUtils.selectDataByTextFromDropDown(selectState_DropDown, state);
            SeleniumUtils.webElementClick(stateprovinceSubmit);
            if (stationCostInfo_Title.isDisplayed()) {
                System.out.println("state province page opened successfully.....");
                stateChargehomepageStatus = true;
            }
            return stateChargehomepageStatus;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return stateChargehomepageStatus;
        }
    }

    public boolean verifyResetButtonForStateCostAndCharges() {
        boolean stateCostAndChargesPageResetButtonStatus = false;
        try {
            String gasGstvalue = stateGstGasTax.getText();
            SeleniumUtils.textSendKeys(stateGstGasTax, " 1");
            SeleniumUtils.webElementClick(resetButton);
            String gasGstvalueafterReset = stateGstGasTax.getText();
            if (gasGstvalue.equals(gasGstvalueafterReset)) {
                stateCostAndChargesPageResetButtonStatus = true;

            }
            return stateCostAndChargesPageResetButtonStatus;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return stateCostAndChargesPageResetButtonStatus;
        }
    }

    public boolean stationCostandCharges  () {
        boolean stateprovincestatus = false;
        try {
            JSONObject stateProvinceCst_Data = fileUtils.getFileContentsAsJSONObject(Constants.fm01RequiredDataPath + "stateProvincecostCharges.json");
            stateGasTaxRate.clear();
            SeleniumUtils.textSendKeys(stateGasTaxRate, stateProvinceCst_Data.get("StategasTaxRate").toString());
            state_misc_Gas_TaxRate.clear();
            SeleniumUtils.textSendKeys(state_misc_Gas_TaxRate, stateProvinceCst_Data.get("StategasMiscTaxRate").toString());
            state_prepaidGasTaxRate.clear();
            SeleniumUtils.textSendKeys(state_prepaidGasTaxRate, stateProvinceCst_Data.get("StategasPrepaidgasTax").toString());
            stateGstGasTax.clear();
            SeleniumUtils.textSendKeys(stateGstGasTax, stateProvinceCst_Data.get("StategasGstTax").toString());
            stateMisgasperc.clear();
            SeleniumUtils.textSendKeys(stateMisgasperc, stateProvinceCst_Data.get("StategasMisctax").toString());
            state_DieseltaxRate.clear();
            SeleniumUtils.textSendKeys(state_DieseltaxRate, stateProvinceCst_Data.get("StatedieselTaxRate").toString());
            state_DieselmisctaxRate.clear();
            SeleniumUtils.textSendKeys(state_DieselmisctaxRate, stateProvinceCst_Data.get("stateDieselMiscTaxRate").toString());
            state_DieselPrepaidTaxRate.clear();
            SeleniumUtils.textSendKeys(state_DieselPrepaidTaxRate, stateProvinceCst_Data.get("StateDieselPrepaidgstTax").toString());
            state_Diesel_gsttax.clear();
            SeleniumUtils.textSendKeys(state_Diesel_gsttax, stateProvinceCst_Data.get("StateDieselgstTax").toString());
            state_dieselMiscTax.clear();
            SeleniumUtils.textSendKeys(state_dieselMiscTax, stateProvinceCst_Data.get("statedieselMisctax").toString());
            state_Unleaded.clear();
            SeleniumUtils.textSendKeys(state_Unleaded, stateProvinceCst_Data.get("stateUnleade").toString());
            state_Midgrade.clear();
            SeleniumUtils.textSendKeys(state_Midgrade, stateProvinceCst_Data.get("stateMidgrade").toString());
            state_Premium.clear();
            SeleniumUtils.textSendKeys(state_Premium, stateProvinceCst_Data.get("statePremium").toString());
            SeleniumUtils.webElementClick(saveButton);
            if (costDataSubmit_Msg.isDisplayed()) {
                System.out.println(" data submitted successfully.....");
                SeleniumUtils.webElementClick(clickHereToContinue_Link);
                if (title_ConfigureCost.isDisplayed()) {
                    stateprovincestatus = true;
                }
            }
            return stateprovincestatus;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return stateprovincestatus;
        }
    }

    public boolean countryCostCharges(String country) throws InterruptedException {
        boolean countryChargehomepageStatus = false;
        try {
            SeleniumUtils.selectDataByTextFromDropDown(corp_DropDown, country);
            SeleniumUtils.webElementClick(countrySubmit);
            if (stationCostInfo_Title.isDisplayed()) {
                System.out.println("country cost and charges page displayed.....");
                countryChargehomepageStatus = true;
            }
            return countryChargehomepageStatus;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return countryChargehomepageStatus;
        }
    }

    public boolean verifyResetButtonForcountryCostAndCharges() {
        boolean countryCostAndChargesPageResetButtonStatus = false;
        try {
            String countryCcsiSurcharge = federalTax_Amount_for_Gas.getText();
            SeleniumUtils.textSendKeys(federalTax_Amount_for_Gas, " 1");
            SeleniumUtils.webElementClick(resetButton);
            String ccsiaftersurcharge = federalTax_Amount_for_Gas.getText();
            if (countryCcsiSurcharge.equals(ccsiaftersurcharge)) {
                countryCostAndChargesPageResetButtonStatus = true;
            }
            return countryCostAndChargesPageResetButtonStatus;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return countryCostAndChargesPageResetButtonStatus;
        }
    }

    public boolean countyCostSubmitbutton(String gas, String diesel, String ccsiCharge) throws InterruptedException {
        boolean countrycostsavebuttonStatus = false;
        try {
            federalTax_Amount_for_Gas.clear();
            SeleniumUtils.textSendKeys(federalTax_Amount_for_Gas, gas);
            federalTax_Amount_for_diesel.clear();
            SeleniumUtils.textSendKeys(federalTax_Amount_for_diesel, diesel);
            enter_CCSI_Charges.clear();
            SeleniumUtils.textSendKeys(enter_CCSI_Charges, ccsiCharge);
            SeleniumUtils.webElementClick(saveButton);
            if (costDataSubmit_Msg.isDisplayed()) {
                System.out.println("Station assigned successfully.....");
                SeleniumUtils.webElementClick(clickHereToContinue_Link);
                if (title_ConfigureCost.isDisplayed()) {
                    countrycostsavebuttonStatus = true;
                }
            }
            return countrycostsavebuttonStatus;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return countrycostsavebuttonStatus;
        }
    }

    public boolean riviewrackCostpage(String month, String day, String year) throws InterruptedException {
        boolean reviewRackostPagestatus = false;
        try {
            SeleniumUtils.selectDataByTextFromDropDown(selectMonth_DropDown, month);
            SeleniumUtils.selectDataByTextFromDropDown(selectDay_DropDown, day);
            SeleniumUtils.textSendKeys(selectYear, year);
            SeleniumUtils.webElementClick(submitButton);
            if (rackCost_Title.isDisplayed()) {
                System.out.println("rack cost  page displayed successfully.....");
                reviewRackostPagestatus = true;
            }
            return reviewRackostPagestatus;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return reviewRackostPagestatus;
        }
    }

    public boolean verifyCanceladdRackButton() {
        boolean addRackStatus = false;
        try {
            SeleniumUtils.webElementClick(addNewRackButton);
            SeleniumUtils.webElementClick(addRackCancelButton);
            if (rackCost_Title.isDisplayed()) {
                System.out.println("rackCost Homepage displayed successfully");
                addRackStatus = true;
            }
            return addRackStatus;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return addRackStatus;
        }
    }

    public boolean addrackfunctionality(String rack, String geographicName) throws InterruptedException {
        boolean addrackStatus = false;
        try {
            SeleniumUtils.webElementClick(addNewRackButton);
            if (addRackTitle.isDisplayed()) {
                System.out.println("add rack home page displayed");
                rackName.clear();
                SeleniumUtils.textSendKeys(rackName, rack);
                rackGeographicRegion.clear();
                SeleniumUtils.textSendKeys(rackGeographicRegion, geographicName);
                SeleniumUtils.webElementClick(rack_Add_Button);
                if (addRackSubmit_msg.isDisplayed()) {
                    System.out.println("Station assigned successfully.....");
                    SeleniumUtils.webElementClick(clickHereToContinue_Link);
                    if (rackCost_Title.isDisplayed()) {
                        addrackStatus = true;
                    }
                }
            }
            return addrackStatus;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return addrackStatus;
        }
    }

    public boolean verifyCancelButtonInDeleterackPage() {
        boolean cancelBtnStatus = false;
        try {
            SeleniumUtils.webElementClick(rackdeleteButton);
            if (deleterackTitle.isDisplayed()) {
                SeleniumUtils.webElementClick(rackdeleteCancelButton);
                if (rackCost_Title.isDisplayed()) {
                    cancelBtnStatus = true;
                    System.out.println("Clicked on 'delete rack' page 'Cancel' button " +
                            "and Successfully landed on to 'rack cost' page.....");
                }
            }
            return cancelBtnStatus;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return cancelBtnStatus;
        }
    }

    public boolean deleteProceed() throws InterruptedException {
        boolean deleteProceedStatus = false;
        try {
            SeleniumUtils.webElementClick(rackdeleteButton);
            if (deleterackTitle.isDisplayed()) {
                System.out.println("delete rack homepage displayed");
                SeleniumUtils.webElementClick(rackDeleteProceedButton);
                if (deleteRackSubmit_Msg.isDisplayed()) {
                    System.out.println("rack deleted successfully.....");
                    SeleniumUtils.webElementClick(clickHereToContinue_Link);
                    if (rackCost_Title.isDisplayed()) {
                        deleteProceedStatus = true;
                    }
                }
            }
            return deleteProceedStatus;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return deleteProceedStatus;
        }
    }

    public boolean rackcostData() throws IOException, ParseException {
        boolean rackcostDataStatus = false;
        try {
            JSONObject rackCost_Data = fileUtils.getFileContentsAsJSONObject(Constants.fm01RequiredDataPath + "rackCostData.json");
            rackunleadedTextbox.clear();
            SeleniumUtils.textSendKeys(rackunleadedTextbox, rackCost_Data.get("unleaded").toString());Thread.sleep(2000);
            rackMidgradeTextbox.clear();
            SeleniumUtils.textSendKeys(rackMidgradeTextbox, rackCost_Data.get("midgrade").toString());
            rackPremiumTextfield.clear();
            SeleniumUtils.textSendKeys(rackPremiumTextfield, rackCost_Data.get("premier").toString());
            rackDieseltexfield.clear();
            SeleniumUtils.textSendKeys(rackDieseltexfield, rackCost_Data.get("diesel").toString());
            rackEfreeGasTextfield.clear();
            SeleniumUtils.textSendKeys(rackEfreeGasTextfield, rackCost_Data.get("efreegas").toString());
            SeleniumUtils.webElementClick(rackSaveChangesButton);
            if (costDataSubmit_Msg.isDisplayed()) {
                System.out.println("data submitted successfully.....");
                SeleniumUtils.webElementClick(clickHereToContinue_Link);
                if (rackCost_Title.isDisplayed()) {
                    rackcostDataStatus = true;
                }
            }
            return rackcostDataStatus;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}