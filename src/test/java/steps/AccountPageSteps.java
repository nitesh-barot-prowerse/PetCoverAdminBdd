package steps;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountPage;

public class AccountPageSteps {
    AccountPage accountPage = new AccountPage(DriverFactory.getDriver());


    @When("User clicks on account icon on left tool bar")
    public void user_clicks_on_account_icon_on_left_tool_bar() {
        accountPage.clickOnAccountIcon();
    }

    @When("User clicks on icon")
    public void user_clicks_on_icon() {
        accountPage.traversingThroughPages();
    }

    @Then("User will redirect to respected page")
    public void user_will_redirect_to_respected_page() {
        //String url=accountPage.displayURL();
        //System.out.println(url);
    }

    @When("User clicks on bank icon")
    public void user_clicks_on_bank_icon() {
        accountPage.clickOnBankIcon();

    }

    @When("User enters account number in search box on manage bank page")
    public void user_enters_account_number_in_search_box_on_manage_bank_page() {
       accountPage.enterAccountNumber();
    }

    @When("User clicks on search button on manage bank page")
    public void user_clicks_on_search_button_on_manage_bank_page() {
       accountPage.clickOnSearchButton();
    }

    @Then("Data on manage bank page reflects upon account number")
    public void data_on_manage_bank_page_reflects_upon_account_number() {
     String accountNumber=accountPage.verifyAccountNumber();
     System.out.println(accountNumber);
    }

    @When("User enters client name in search box on manage bank page")
    public void user_enters_client_name_in_search_box_on_manage_bank_page() {
        accountPage.enterClientName();

    }

    @Then("Data on manage bank page reflects upon client name")
    public void data_on_manage_bank_page_reflects_upon_client_name() {
        String clientName=accountPage.verifyClientName();
        System.out.println(clientName);

    }

    @When("User clicks on bank code link on manage bank page")
    public void user_clicks_on_bank_code_link_on_manage_bank_page() {
        accountPage.clickOnBankCode();

    }

    @Then("Bank information page displays with details")
    public void bank_information_page_displays_with_details() {
        String clientInfo=accountPage.verifyBankDetails();
        System.out.println(clientInfo);

    }
}
