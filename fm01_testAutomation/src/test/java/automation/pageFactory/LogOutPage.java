package automation.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utils.SeleniumUtils;

public class LogOutPage {
    @FindBy(how = How.XPATH, using = "//td[text()='Logout']")
    WebElement logOut;

    public void userLogout() throws InterruptedException {
        SeleniumUtils.webElementClick(logOut);
        Thread.sleep(3000);
    }

    public Boolean verifyLogOutStatus() {
        try{
            return logOut.isDisplayed();
        }
        catch (Exception e)
        {
            return false;
        }

    }

}
