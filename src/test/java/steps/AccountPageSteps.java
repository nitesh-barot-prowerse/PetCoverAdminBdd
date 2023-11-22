package steps;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
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
        String accountNumber = accountPage.verifyAccountNumber();
        System.out.println(accountNumber);
    }

    @When("User enters client name in search box on manage bank page")
    public void user_enters_client_name_in_search_box_on_manage_bank_page() {
        accountPage.enterClientName();

    }

    @Then("Data on manage bank page reflects upon client name")
    public void data_on_manage_bank_page_reflects_upon_client_name() {
        String clientName = accountPage.verifyClientName();
        System.out.println(clientName);

    }

    //Bank Information page displays with details after clicking on bank code link on manage bank details

    @When("User clicks on bank code link on manage bank page")
    public void user_clicks_on_bank_code_link_on_manage_bank_page() {
        accountPage.clickOnBankCode();

    }

    @Then("Bank information page displays with details")
    public void bank_information_page_displays_with_details() {
        String clientInfo = accountPage.verifyBankDetails();
        if (clientInfo.length() > 0) {
            System.out.println(clientInfo);
        } else {
            Assert.fail();
        }

    }

    //Add Bank page  displays will all details when user clicks on add bank icon on manage bank page

    @When("User clicks on add bank icon on manage bank page")
    public void user_clicks_on_add_bank_icon_on_manage_bank_page() {
        accountPage.clickOnAddBankIcon();
    }

    @Then("Add bank page displays with all details")
    public void add_bank_page_displays_with_all_details() {
        String addBankPage = accountPage.verifyAddBankPage();
        Assert.assertEquals(addBankPage, "Add Bank");
    }

    //Add receipt page  displays will all details when user clicks on add receipt icon on manage receipt page

    @When("User clicks on manage receipt icon on account page")
    public void user_clicks_on_manage_receipt_icon_on_account_page() {
        accountPage.clickOnManageReceiptIcon();
    }

    @When("User clicks on add receipt icon on manage receipt page")
    public void user_clicks_on_add_receipt_icon_on_manage_receipt_page() {
        accountPage.clickOnAddReceiptIcon();
    }

    @Then("Allocate Payment page displays with all details")
    public void allocate_payment_page_displays_with_all_details() {
        String addAllocatePaymentPage = accountPage.verifyAddAllocatePaymentPage();
        Assert.assertEquals(addAllocatePaymentPage, "Allocate Payment");
    }

    //Add breach register page  displays will all details when user clicks on Add breach register on manage breach register page

    @When("User clicks on manage breach registers icon")
    public void user_clicks_on_manage_breach_registers_icon() {
        accountPage.clickOnManageBreachRegisterIcon();
    }

    @When("User clicks on Add breach register icon on manage breach register page")
    public void user_clicks_on_add_breach_register_icon_on_manage_breach_register_page() {
        accountPage.clickOnAddBreachRegisterIcon();
    }

    @Then("Add breach register page displays with all details")
    public void add_breach_register_page_displays_with_all_details() {
        String addBreachRegisterPage = accountPage.verifyAddBreachRegisterPage();
        Assert.assertEquals(addBreachRegisterPage, "Add Breach Register");
    }

    //Filter Policy review information upon policy end date and to date

    @When("User clicks on policy review button on account page")
    public void user_clicks_on_policy_review_button_on_account_page() {
        accountPage.clickOnPolicyReviewIcon();

    }

    @When("User enters policy end date and to date value on policy review page")
    public void user_enters_policy_end_date_and_to_date_value_on_policy_review_page() {
        accountPage.enterPolicyFromAndToDate();

    }

    @When("User clicks on search button on policy review page")
    public void user_clicks_on_search_button_on_policy_review_page() {
        accountPage.clickSearchIconOnPolicyReview();

    }

    @Then("Appropriate data displays on policy review page upon date values")
    public void appropriate_data_displays_on_policy_review_page_upon_date_values() {
        String data = accountPage.verifyPolicyReviewData();
        if (data.length() > 0) {
            System.out.println(data);
        } else {
            System.out.println("Data does not reflects upon from and to date values on policy review page");
        }
    }



    //Filter Process Credit Card Payment information upon payment due date and receipt date

    @When("User clicks on Process Credit Card button on account page")
    public void user_clicks_on_process_credit_card_button_on_account_page() {
        accountPage.clickOnProcessCreditCardPaymentIcon();

    }

    @When("User enters payment due date and receipt date value on Process Credit Card page")
    public void user_enters_payment_due_date_and_receipt_date_value_on_process_credit_card_page() {
        accountPage.enterFromAndToDate();

    }

    @When("User clicks on search button on Process Credit Card")
    public void user_clicks_on_search_button_on_process_credit_card() {
        accountPage.clickSearchIconOnPolicyHistory();

    }

    @Then("Appropriate data displays on Process Credit Card upon date values")
    public void appropriate_data_displays_on_process_credit_card_upon_date_values() {
        String data = accountPage.verifyPolicyCreditCardPaymentData();
        if (data.length() > 0) {
            System.out.println(data);
        } else {
            System.out.println("Data does not reflects upon from and to date values on policy credit card page");
        }

    }
}
