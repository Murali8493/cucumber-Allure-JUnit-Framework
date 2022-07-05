package automation.stepDefinition;

import automation.pageFactory.LaunchWebPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.Constants;
import utils.LogUtils;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class CucumberHooks {


    @After
    public void quitDriver(Scenario scenario) {
        if (scenario.isFailed()) {
            Allure.addAttachment("Screen shot", new ByteArrayInputStream(((TakesScreenshot) LaunchWebPage.driver).getScreenshotAs(OutputType.BYTES)));
        }

        if (LaunchWebPage.driver != null) {
            LaunchWebPage.driver.quit();

            LogUtils.info("\n******************************************** End of scenario ****************************************************************");
        }
    }
}
