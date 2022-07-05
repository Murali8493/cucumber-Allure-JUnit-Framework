package automation.pageFactory.pricing_Specialist;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utils.SeleniumUtils;

public class HomePageMenus {


    @FindBy(how = How.XPATH, using = "//td[contains(text(),'Survey')]")
    WebElement priceSurvey_Menu;
    @FindBy(how = How.XPATH, using = "//td[text()='Pricing']")
    WebElement pricing_Menu;
    @FindBy(how = How.XPATH, using = "//td[text()='Price Notification']")
    WebElement priceNotification_Menu;

    @FindBy(how = How.XPATH, using = "//td[contains(text(),'Station Selection')]")
    WebElement priceSurveyMenu_VerifyStationSelection;
    @FindBy(how = How.XPATH, using = "//td[contains(text(),'Price Decision Options')]")
    WebElement pricingMenu_VerifyPriceDecisionOptions;
    @FindBy(how = How.XPATH, using = "//b[text()='Send Latest Prices Via Email']")
    WebElement priceNotificationMenu_VerifySendLatestPricesViaEmail;

   public boolean pageOpenStatus;
    public boolean verifyPriceSurveyPageOpening(String menuItem) {
        try{
            SeleniumUtils.webElementClick(priceSurvey_Menu);
            pageOpenStatus=priceSurveyMenu_VerifyStationSelection.isDisplayed();
            if(pageOpenStatus)
            {
                System.out.println(menuItem +" page is opened....");
            }
            return pageOpenStatus;
        }
        catch (Exception e)
        {
            System.out.println(menuItem +" page is not opened....");
            return pageOpenStatus=false;
        }

    }

    public boolean verifyPricingPageOpening(String menuItem) {
        try{
            SeleniumUtils.webElementClick(pricing_Menu);
            pageOpenStatus=pricingMenu_VerifyPriceDecisionOptions.isDisplayed();
            if(pageOpenStatus)
            {
                System.out.println(menuItem +" page is opened....");
            }
            return pageOpenStatus;
        }
        catch (Exception e)
        {
            System.out.println(menuItem +" page is not opened....");
            return pageOpenStatus=false;
        }

    }

    public boolean verifyPriceNotificationPageOpening(String menuItem) {
        try{
            SeleniumUtils.webElementClick(priceNotification_Menu);
            pageOpenStatus=priceNotificationMenu_VerifySendLatestPricesViaEmail.isDisplayed();
            if(pageOpenStatus)
            {
                System.out.println(menuItem +" page is opened....");
            }
            return pageOpenStatus;
        }
        catch (Exception e)
        {
            System.out.println(menuItem +" page is not opened....");
            return pageOpenStatus=false;
        }
    }
}
