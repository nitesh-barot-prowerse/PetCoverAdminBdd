package steps;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.SettingPage;


public class SettingPageSteps {
    SettingPage settingPage = new SettingPage(DriverFactory.getDriver());



    @When("User clicks on look up values icon on left tool bar")
    public void user_clicks_on_look_up_values_icon_on_left_tool_bar() {
        settingPage.clickIcon();

    }

    @When("User clicks on icon on setting page")
    public void user_clicks_on_icon_on_setting_page() {
        settingPage.traversingThroughPages();

    }

    @Then("User will able to redirect to respected page")
    public void user_will_able_to_redirect_to_respected_page() {

    }


}
