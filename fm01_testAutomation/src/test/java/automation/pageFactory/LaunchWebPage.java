package automation.pageFactory;

import io.cucumber.java.hu.Ha;
import org.apache.xpath.operations.String;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class LaunchWebPage {

    public static WebDriver driver;

    //    public static String windowHandle;
    public WebDriver launchWebPage(String browserType, String url) throws IOException, InterruptedException {

//        DesiredCapabilities capabilities = null;

        if (browserType.equalsIgnoreCase("chrome")) {

            System.setProperty("webdriver.chrome.driver", "browsers\\chromedriver.exe");
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--no-sandbox");
            chromeOptions.addArguments("--disable-gpu");
            chromeOptions.addArguments("--disable-features=VizDisplayCompositor");
            driver = new ChromeDriver(chromeOptions);

        } else if (browserType.equalsIgnoreCase("edge")) {

            System.setProperty("webdriver.edge.driver", "browsers\\msedgedriver.exe");
            EdgeOptions edgeOptions = new EdgeOptions();
            HashMap<String, Object> edgePrefs = new HashMap<String, Object>();
            edgePrefs.put("profile.default_content_settings.popups", 0);
            edgeOptions.setCapability("prefs", edgePrefs);
            edgeOptions.setCapability("useAutomationExtension", false);
            driver = new EdgeDriver(edgeOptions);

        } else if (browserType.equalsIgnoreCase("firefox")) {

            System.setProperty("webdriver.gecko.driver", "browsers\\geckodriver.exe");
            driver = new FirefoxDriver();

        } else if (browserType.equalsIgnoreCase("IE")) {
//            capabilities = DesiredCapabilities.internetExplorer();
            InternetExplorerOptions options = new InternetExplorerOptions();
            options.introduceFlakinessByIgnoringSecurityDomains();
            options.setCapability("ignoreProtectedModeSettings", true);
            System.setProperty("webdriver.ie.driver", "browsers\\IEDriverServer.exe");
            driver = new InternetExplorerDriver(options);
        }

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get(url);

        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        return driver;
    }
}