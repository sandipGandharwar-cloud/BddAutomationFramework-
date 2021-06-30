package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MobileTestRecords {
    public WebDriver ldriver;

    public MobileTestRecords(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(xpath = "//div[@id='opt-top-bar-strip']")
    public WebElement homePageA;

    @FindBy(xpath = "//li[@id='menu-item-2311']/child::a[@title='Platform']")
    public WebElement platform;

    @FindBy(xpath = "//ul[@class='inner-menu']/child::li[1]/a")
    public WebElement mobileTestRecord;

    public void test1() throws InterruptedException {
//        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "src/test/Drivers/chromedriver.exe");
        ldriver = new ChromeDriver();
        ldriver.get("https://testproject.io/");
        Thread.sleep(3000);
        ldriver.manage().window().maximize();
        System.out.println("run successfully");

    }

    public void verifyHomePage(){
        WebDriverWait wait = new WebDriverWait(ldriver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='opt-top-bar-strip']")));
//        Assert.assertTrue(homePageA.isDisplayed());
        System.out.println("Navigated to homepage");
    }

    public void navigateToMobileTestRecordPage(){
        platform.click();
        System.out.println("platform clicked");
//        Actions actions = new Actions(ldriver);
//        actions.moveToElement(platform).build().perform();
    }
}
