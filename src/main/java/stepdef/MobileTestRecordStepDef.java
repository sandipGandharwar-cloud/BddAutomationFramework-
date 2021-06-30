package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.MobileTestRecords;

public class MobileTestRecordStepDef {
    WebDriver driver;
    MobileTestRecords mtr = new MobileTestRecords(driver);
    @Given("Navigate to testproject URL")
    public void navigate_to_testproject_url() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        mtr.test1();
    }

    @When("On home page")
    public void on_home_page() {
        // Write code here that turns the phrase above into concrete actions
        mtr.verifyHomePage();
    }

    @Then("Navigate to Mobile Test Recorder page")
    public void navigate_to_mobile_test_recorder_page() {
        // Write code here that turns the phrase above into concrete actions
        mtr.navigateToMobileTestRecordPage();
    }
}
