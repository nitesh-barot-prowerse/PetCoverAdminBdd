package steps;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LogInPage;
import utils.Log;
import utils.ScreenRecorderUtil;


public class LogInPageSteps {
    //MainPage main = new MainPage();

    LogInPage main = new LogInPage(DriverFactory.getDriver());

    @Given("User is one the website login page")
    public void user_is_one_the_website_login_page() {
        Log.info("User Opens US-UK-2 Website");
        try {
            ScreenRecorderUtil.startRecord("main");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        String url = main.verifyUrl();
        System.out.println(url);
    }

    @When("User enters username {string} and password {string} and click signIn button")
    public void user_enters_username_and_password_and_click_sign_in_button(String string, String string2) {
        Log.info("User Enters Username And Password");
        try {
            main.enterUserName(string);
            main.enterPassword(string2);
            main.clickSubmit();
        } catch (Exception e) {
            Log.error(e.toString());
        }
    }

    @Then("User will be able to see dashBoard")
    public void user_will_be_able_to_see_dash_board() {
        Log.info("User Redirects To DashBord And Verify Through Message DashBoard On Page");
        String expectedTitle = main.verifyDashBoardTitle();
        Assert.assertEquals(expectedTitle, "Dashboard", "LogIn Failed");

    }

    @Then("User will be able to see {string} text on right top corner of page")
    public void user_will_be_able_to_see_text_on_right_top_corner_of_page(String string) {
        Log.info("User verify (en-GB) text on right top corner of dash board page ");
        String verifyRoleText = main.verifyRoleText();
        System.out.println("Text Displayed At Top Right Corner" + verifyRoleText);
        Assert.assertEquals(verifyRoleText, "(en-GB)");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            ScreenRecorderUtil.stopRecord();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
