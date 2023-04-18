package steps;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Constant;
import pages.HomePage;
import pages.LogInPage;

public class HomePageSteps {

    HomePage homePage = new HomePage(DriverFactory.getDriver());
    Constant constant;

    @When("User verify admin login page through url")
    public void user_verify_admin_login_page_through_url() {
        String url = homePage.verifyUrl();
        System.out.println("Current Page Url" + url);
        Assert.assertEquals(url, constant.url);

    }

    @Then("User will able to see text {string} behind copyright message")
    public void user_will_able_to_see_text_behind_copyright_message(String string) {
        String Msg = homePage.verifyMessage();
        if (Msg.contains(string)) {
            System.out.println("Home page displayed with required text ");
        } else {
            Assert.fail();
        }

    }
}
