package automation.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utils.SeleniumUtils;

public class LoginPage {

    @FindBy(how = How.XPATH, using = "//input[@id='userNameInput']")
    WebElement userName;
    @FindBy(how = How.XPATH, using = "//input[@id='passwordInput']")
    WebElement password;
    @FindBy(how = How.XPATH, using = "//span[@id='submitButton']")
    WebElement signIn;
    @FindBy(how = How.XPATH, using = "//input[@id='i0116']")
    WebElement ldapId;
    @FindBy(how = How.XPATH, using = "//input[@id='userNameInput']")
    WebElement userNameTxtBox;
    @FindBy(how = How.XPATH, using = "//input[@id='idSIButton9']")
    WebElement nextButton;


    public void logInToApplication(String loginName, String pwd) {
        SeleniumUtils.textSendKeys(userName, loginName);
        SeleniumUtils.textSendKeys(password, pwd);
        SeleniumUtils.webElementClick(signIn);
    }

    public void login(String pwd) {
        SeleniumUtils.textSendKeys(password, pwd);
        SeleniumUtils.webElementClick(signIn);
    }

    public void enterUserName(String userName) {
        try {
            if (LaunchWebPage.driver.findElement(By.xpath("//input[@id='userNameInput']")).isDisplayed()) {
                SeleniumUtils.textSendKeys(userNameTxtBox, userName);
            }
        } catch (Exception e) {
            SeleniumUtils.textSendKeys(ldapId, userName + "@safeway.com");
            SeleniumUtils.webElementClick(nextButton);
        }

    }


}
