package base;

import enums.Browser;
import enums.OS;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;

    public WebDriver selectBrowser(final String browser) throws Throwable{
        if(System.getProperty("os.name").toLowerCase().contains(OS.WINDOWS.name().toLowerCase())){
             if(browser.equalsIgnoreCase(Browser.IE.name())){
                System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"src/test/Browser exe/EIE11_EN-US_MCM_WIN764.EXE");
                TestBase.driver = new InternetExplorerDriver();
                 DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
                 capabilities.setCapability("EnableNativeEvents",false);
                 capabilities.setCapability("ignorZoomSetting",true);
                 capabilities.setCapability("browserName",true);
                 capabilities.setCapability("ignorProtectedModeSettings",true);
                 capabilities.setCapability("ie.ensureCleanSession",true);
                 capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
                 capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
                 driver.manage().window().maximize();
                 driver.manage().deleteAllCookies();
                 driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
                 driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
             }else if (browser.equalsIgnoreCase(Browser.CHROME.name())){

             }

        }
        return TestBase.driver;
    }

}
