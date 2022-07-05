package automation;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "automation.stepDefinition",
        monochrome = true,
        tags = "@fm01",
        plugin = {"pretty", "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm", "html:target/cucumber-reports.html", "json:target/cucumber.json", "junit:target/cucumberXml.xml"}

)

public class CucumberTest {
}
