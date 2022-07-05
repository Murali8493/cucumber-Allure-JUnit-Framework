package utils;

import automation.pageFactory.LaunchWebPage;
import io.cucumber.java.de.Wenn;
import io.cucumber.java.sl.In;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtils {

    static int waitTime = 5;


    public static void selectDataByTextFromDropDown(WebElement dropDownElement, String text) {
        if (waitForVisibility(dropDownElement)) {
            Select dataFromDropDownObj = new Select(dropDownElement);
            dataFromDropDownObj.selectByVisibleText(text);
        }
    }

    public static void selectDataByValueFromDropDown(WebElement dropDownElement, String value) {
        if (waitForVisibility(dropDownElement)) {
            Select dataFromDropDownObj = new Select(dropDownElement);
            dataFromDropDownObj.selectByValue(value);
        }
    }

    public static String selectDataByIndexFromDropDown(WebElement dropDownElement, Integer index) {
        String value = null;
        if (waitForVisibility(dropDownElement)) {
            Select dataFromDropDownObj = new Select(dropDownElement);
            dataFromDropDownObj.selectByIndex(index);
            value = dataFromDropDownObj.getOptions().get(index).getText();
        }
        return value;
    }

    public static String getSelectedValueFromDropDown(WebElement dropDownElement) {
        String value = null;
        if (waitForVisibility(dropDownElement)) {
            Select dataFromDropDownObj = new Select(dropDownElement);
            value = dataFromDropDownObj.getFirstSelectedOption().getText();
        }
        return value;
    }

    public static Integer getNumberOfOptionsFromDropDown(WebElement dropDownElement) {
        Integer options = 0;
        if (waitForVisibility(dropDownElement)) {
            Select dataFromDropDownObj = new Select(dropDownElement);
            options = dataFromDropDownObj.getOptions().size();
        }
        return options;
    }

    public static boolean waitForVisibility(WebElement elementToWaitFor) {
        WebElement element = null;
        WebDriverWait wait = new WebDriverWait(LaunchWebPage.driver, waitTime);
        try {
            element = wait.until(ExpectedConditions.visibilityOf(elementToWaitFor));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return element != null;

    }

    public static boolean elementClickable(WebElement elementToWaitFor) {
        WebElement element = null;
        WebDriverWait wait = new WebDriverWait(LaunchWebPage.driver, waitTime);
        try {
            element = wait.until(ExpectedConditions.elementToBeClickable(elementToWaitFor));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return element != null;
    }

    public static void textSendKeys(WebElement element, String textToEnter) {
        try {
            if (waitForVisibility(element)) {
                element.sendKeys(textToEnter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void webElementClick(WebElement elementToClick) {
        try {
            if (elementClickable(elementToClick)) {
                elementToClick.click();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static Boolean isBrowserAlertPresent() {
        try {
            WebDriverWait wait = new WebDriverWait(LaunchWebPage.driver, waitTime);
            Alert element = wait.until(ExpectedConditions.alertIsPresent());
            return element != null;
        } catch (Exception e) {
            return false;
        }
    }

    public static void acceptBrowserAlert() {
        if (isBrowserAlertPresent()) {
            Alert alert = LaunchWebPage.driver.switchTo().alert();
            alert.accept();
        } else {
            throw new RuntimeException("Alert is not present");
        }

    }

    public static void declineBrowserAlert() {
        if (isBrowserAlertPresent()) {
            Alert alert = LaunchWebPage.driver.switchTo().alert();
            alert.dismiss();
        } else {
            throw new RuntimeException("Alert is not present");
        }

    }

    public static String getBrowserAlertText() {
        String alertText = null;
        if (isBrowserAlertPresent()) {
            Alert alert = LaunchWebPage.driver.switchTo().alert();
            alertText = alert.getText();
        } else {
            throw new RuntimeException("Alert is not present");
        }

        return alertText;
    }

    public static void pageRefresh() {
        LaunchWebPage.driver.navigate().refresh();
    }

}
