package automation.stepDefinition;

import automation.pageFactory.LaunchWebPage;
import automation.pageFactory.LogOutPage;
import automation.pageFactory.LoginPage;
import automation.pageFactory.admin.*;
import automation.pageFactory.msd.ConfigureCost;
import automation.pageFactory.admin.MainMenu.*;
import automation.pageFactory.pricing_Specialist.ConfigureStation;
import automation.pageFactory.pricing_Specialist.HomePageMenus;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.qameta.allure.Allure;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.Constants;
import utils.FileUtils;
import utils.TestParam;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;

public class reUsableMethods {
    FileUtils fileUtils = new FileUtils();
    TestParam testParam = new TestParam();
    LoginPage loginPage;
    MainMenu mainMenu;
    HomePageMenus homePageMenus;
    LogOutPage logOutPage;
    ConfigureStation configureStation;
    ConfigureCost configureCost;



    public String getPropertyValue(String prop) throws IOException {
        String value = fileUtils.getPropertyValueFromFile(Constants.browserPropPath, prop);
        return value;
    }


    public void getScreenShot() {
        Allure.addAttachment("Screen Shot", new ByteArrayInputStream(((TakesScreenshot) LaunchWebPage.driver).getScreenshotAs(OutputType.BYTES)));
    }

    public HashMap getHeadersMap(String apiName) throws IOException, ParseException {
        JSONObject jsonObject = (JSONObject) fileUtils.getFileContentsAsJSONObject(Constants.apiHeadersPath).get("JSONPlaceHolder");
        HashMap headers = new ObjectMapper().readValue(jsonObject.toString(), HashMap.class);
        return headers;
    }

    public static Integer getRandomNumber(Integer upperBound) {
        Random randomNumber = new Random();
        Integer number;
        Integer num = randomNumber.nextInt(upperBound);
        if (num == 0) {
            number = num + 1;
        } else {
            number = num;
        }
        return number;
    }

    public String replaceIdInTheURL(String apiName, String url) {
        if (apiName.equalsIgnoreCase("UpdatePost") || apiName.equalsIgnoreCase("DeletePost") || apiName.equalsIgnoreCase("GetPost")) {
            url = url.replace("{id}", testParam.getId().toString());
        }
        return url;
    }


    public HashMap<String, String> getAddNewCompetitor_PricingSpecialistRole_Data() throws IOException, ParseException {
        HashMap<String, String> addNewCompetitorDetails = new HashMap<>();

        JSONObject addNewCompetitor_Data = fileUtils.getFileContentsAsJSONObject(Constants.fm01RequiredDataPath + "addNewCompetitor_PricingSpecialist_Data.json");
        addNewCompetitorDetails.put("CompetitorName", addNewCompetitor_Data.get("CompetitorName").toString());
        addNewCompetitorDetails.put("phNumberAreaCode", addNewCompetitor_Data.get("phoneNumber").toString().substring(0, 3));
        addNewCompetitorDetails.put("phNumberPrefix", addNewCompetitor_Data.get("phoneNumber").toString().substring(3, 6));
        addNewCompetitorDetails.put("phoneNumber", addNewCompetitor_Data.get("phoneNumber").toString().substring(6, 10));
        addNewCompetitorDetails.put("alternateAreaCode", addNewCompetitor_Data.get("alternatePhoneNumber").toString().substring(0, 3));
        addNewCompetitorDetails.put("alternatePrefix", addNewCompetitor_Data.get("alternatePhoneNumber").toString().substring(3, 6));
        addNewCompetitorDetails.put("alternatePhoneNumber", addNewCompetitor_Data.get("alternatePhoneNumber").toString().substring(6, 10));

        return addNewCompetitorDetails;
    }

}
