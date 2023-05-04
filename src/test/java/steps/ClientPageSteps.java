package steps;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.ClientPage;
import pages.LogInPage;

public class ClientPageSteps {

    ClientPage clientPage = new ClientPage(DriverFactory.getDriver());

    @Given("User should log in with username {string} and password {string} to the admin panel")
    public void user_should_log_in_with_username_and_password_to_the_admin_panel(String string, String string2) {
        LogInPage logInPage = new LogInPage(DriverFactory.getDriver());
        logInPage.enterUserName(string);
        logInPage.enterPassword(string2);
        logInPage.clickSubmit();

    }

    @When("User clicks on client icon on left tool bar")
    public void user_clicks_on_client_icon_on_left_tool_bar() {
        String Message = clientPage.verifyClientManage();
        Assert.assertEquals(Message, "Manage Client");

    }

    @Then("User will see client details")
    public void user_will_see_client_details() {
        String clientData = clientPage.fetchAndDisplayData();
        System.out.println(clientData);

    }

    @When("User enters code number inside search box on manage client page")
    public void user_enters_code_number_inside_search_box_on_manage_client_page() {
     clientPage.enterCodeDetails();
    }

    @When("User clicks on search button manage client page")
    public void user_clicks_on_search_button_manage_client_page() {
    clientPage.clickOnButton();
    }

    @Then("Appropriate client information displays inside table on manage client page")
    public void appropriate_client_information_displays_inside_table_on_manage_client_page() {
     String clientCode=clientPage.verifyClient();
     Assert.assertEquals(clientCode,"DANK-00005");
    }

    @When("User selects appropriate option from Active dropdown on manage client page")
    public void user_selects_appropriate_option_from_active_dropdown_on_manage_client_page() {
        clientPage.selectClientStatus();

    }

    @When("User clicks on search button")
    public void user_clicks_on_search_button() {
      clientPage.clickOnButton();
    }

    @When("User clicks on client code on manage client page")
    public void user_clicks_on_client_code_on_manage_client_page() {
    clientPage.clickClientCode();
    }

    @Then("Client status displays on view client page")
    public void client_status_displays_on_view_client_page() {
     String Status=clientPage.verifyClientStatus();
     Assert.assertEquals(Status,"Active");
    }

    @When("User clicks on add button on view client page")
    public void user_clicks_on_add_button_on_view_client_page() {
     clientPage.clickOnAddQuoteButton();
    }

    @Then("Add quote page displays with same client code")
    public void add_quote_page_displays_with_same_client_code() {
    String clientId=clientPage.verifyExistingClientOnAddQuote();
    Assert.assertEquals(clientId,"DANK-00005");
    }


}
