package automation.pageFactory.admin;

import automation.pageFactory.LaunchWebPage;
import org.apache.xpath.operations.Bool;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utils.SeleniumUtils;

import java.awt.*;

public class MainMenu {

    public boolean userLoggedStatus;
    public boolean verifyUserLoginStatus(String user)
    {
        try {
            userLoggedStatus= LaunchWebPage.driver.findElement(By.xpath("//i[text()='"+user+"']")).isDisplayed();
             if (userLoggedStatus)
             {
                 System.out.println("User "+user+" logged in succesfully...");
             }

             return userLoggedStatus;
        }
        catch (Exception e)
        {
            userLoggedStatus=false;
            System.out.println("User "+user+" login failed....");
            return userLoggedStatus;
        }
    }
 /*   @FindBy(how = How.XPATH, using = "//select[@id='orderableItemsForm:divisionMenu']")
    WebElement itemsDivisionDropDown;
    @FindBy(how = How.XPATH, using = "//select[@id='orderableItemsForm:divisionMenu']/../following-sibling::td/select[@id='orderableItemsForm:shippingBakeryMenu']")
    WebElement itemsShippingBakeryDropDown;
    @FindBy(how = How.XPATH, using = "//select[@id='orderableItemsForm:shippingSatelliteMenu']")
    WebElement itemsSatelliteBakeryDropDown;
    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Maintain Orderable Items']")
    WebElement orderableItemsLink;
    @FindBy(how = How.XPATH, using = "//select[@id='shippingsatellitesmaintform:DivisionMenu']")
    WebElement associationDivisionDropDown;
    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Shipping Satellite Association']")
    WebElement associationLink;
    @FindBy(how = How.XPATH, using = "//select[@id='addleadtimemenu:DivisionMenuforLeadTime']")
    WebElement leadTimeDivisionDropDown;
    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Add Two Day Lead Time']")
    WebElement leadTimeLink;
    @FindBy(how = How.XPATH, using = "//span[normalize-space()='View Order History']")
    WebElement orderHistoryLink;
    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Logout']")
    WebElement logoutLink;
    @FindBy(how = How.XPATH, using = "//b[normalize-space()='MAIN MENU']")
    WebElement mainMenuText;
    @FindBy(how = How.XPATH, using = "//li[contains(normalize-space(),'No bakery items for division ')]")
    WebElement itemsAvailabilityText;


    public Integer getTotalDivisions (String type){
        Integer divisions = 0;
        if(type.equalsIgnoreCase("items")) {
            divisions = SeleniumUtils.getNumberOfOptionsFromDropDown(itemsDivisionDropDown);
        } else if(type.equalsIgnoreCase("association")){
            divisions = SeleniumUtils.getNumberOfOptionsFromDropDown(associationDivisionDropDown);
        } else if(type.equalsIgnoreCase("leadTime")){
            divisions = SeleniumUtils.getNumberOfOptionsFromDropDown(leadTimeDivisionDropDown);
        }
        return divisions;
    }

    public Integer getTotalBakeries(String bakeryType) throws InterruptedException {
        Integer bakeries = 0;
        if(bakeryType.equalsIgnoreCase("shipping")){
            Thread.sleep(2000);
            bakeries = SeleniumUtils.getNumberOfOptionsFromDropDown(itemsShippingBakeryDropDown);
        } else if(bakeryType.equalsIgnoreCase("satellite")){
            Thread.sleep(2000);
            bakeries = SeleniumUtils.getNumberOfOptionsFromDropDown(itemsSatelliteBakeryDropDown);
        }

        return bakeries;
    }

    public String selectDivision(String type, Integer index){
        String divisionNumber = null;
        if(type.equalsIgnoreCase("items")) {
           divisionNumber = SeleniumUtils.selectDataByIndexFromDropDown(itemsDivisionDropDown,index );
        } else if(type.equalsIgnoreCase("association")){
            divisionNumber = SeleniumUtils.selectDataByIndexFromDropDown(associationDivisionDropDown,index );
        } else if(type.equalsIgnoreCase("leadTime")){
            divisionNumber = SeleniumUtils.selectDataByIndexFromDropDown(leadTimeDivisionDropDown,index );
        }

        return divisionNumber;
    }

    public String selectBakery(String bakeryType, Integer bakeryIndex){
        String bakeryNumber = null;
        if(bakeryType.equalsIgnoreCase("shipping")){
            bakeryNumber = SeleniumUtils.selectDataByIndexFromDropDown(itemsShippingBakeryDropDown, bakeryIndex);
        } else {
            bakeryNumber = SeleniumUtils.selectDataByIndexFromDropDown(itemsSatelliteBakeryDropDown, bakeryIndex);
        }
        return bakeryNumber;
    }

    public Boolean checkItemsAvailability(String divisionNumber){
        try {
            if (LaunchWebPage.driver.findElement(By.xpath("//li[contains(normalize-space(),'No bakery items for division "+ divisionNumber +"')]")).isDisplayed()){
                return false;
            } else {
                return true;
            }
        } catch (NoSuchElementException e){
            return true;
        }

    }

    public void navigateToMaintainOrderableItemsPage(){
        SeleniumUtils.webElementClick(orderableItemsLink);
    }

    public void navigateToShippingSatelliteAssociationPage(){
        SeleniumUtils.webElementClick(associationLink);
    }

    public void navigateToLeadTimePage(){
        SeleniumUtils.webElementClick(leadTimeLink);
    }

    public void navigateToOrderHistoryPage(){
        SeleniumUtils.webElementClick(orderHistoryLink);
    }

    public void logoutFromTheApplication(){
        SeleniumUtils.webElementClick(logoutLink);
    }

    public Boolean isUpdateSuccessful(String divisionNumber){
        try {
            if(LaunchWebPage.driver.findElement(By.xpath("//li[contains(text(),'Bakery Items for Division "+divisionNumber+" has been updated successfully')]")).isDisplayed()){
                return true;
            } else return false;
        } catch (NoSuchElementException e){
            return false;
        }

    }

    public Boolean isUpdateSuccessfulAtShippingBakeryLevel(String divisionNumber, String shippingBakeryNumber){

            try {
                if(LaunchWebPage.driver.findElement(By.xpath("//li[contains(text(),'Bakery Items for Division "+divisionNumber+", Shipping Bakery "+shippingBakeryNumber+" has been updated successfully')]")).isDisplayed()){
                    return true;
                } else return false;
            } catch (NoSuchElementException e){
                return false;
            }
    }

    public Boolean isUpdateSuccessfulAtSatelliteBakeryLevel(String divisionNumber, String shippingBakeryNumber, String satelliteBakeryNumber){

        try {
            if(LaunchWebPage.driver.findElement(By.xpath("//li[contains(text(),'Bakery Items for Division "+divisionNumber+", Shipping Bakery "+shippingBakeryNumber+", Satellite Bakery "+satelliteBakeryNumber+" has been updated successfully')]")).isDisplayed()){
                return true;
            } else return false;
        } catch (NoSuchElementException e){
//            return false;
            throw new RuntimeException(e);
        }
    }

    public Boolean mainMenuDisplayed(){
//        SeleniumUtils.waitForVisibility(mainMenuText);
//        SeleniumUtils.
        if(mainMenuText.isDisplayed()){
            return true;
        } else return false;
    }*/

}
