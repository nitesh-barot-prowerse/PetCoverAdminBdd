package steps;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.hc.core5.http.Message;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.ClientPage;
import pages.LogInPage;

public class ClientPageSteps {

    ClientPage clientPage = new ClientPage(DriverFactory.getDriver());

    String clientNumber = " ";

    @Given("User should log in with username {string} and password {string} to the admin panel")
    public void user_should_log_in_with_username_and_password_to_the_admin_panel(String string, String string2) {
        LogInPage logInPage = new LogInPage(DriverFactory.getDriver());
        logInPage.setEmail(string);
        logInPage.setPassword(string2);
        logInPage.clickSubmit();

    }

    @When("User clicks on client icon on left tool bar")
    public void user_clicks_on_client_icon_on_left_tool_bar() {
        String Message = clientPage.verifyClientManage();
        Assert.assertEquals(Message, "Manage Client");

    }


    @Then("Manage client page displays with list of clients")
    public void manage_client_page_displays_with_list_of_clients() {
        String clientData = clientPage.fetchAndDisplayData();
        if (clientData.length() > 0) {
            System.out.println(clientData);
        } else {
            Assert.fail();
        }

    }

    //Add client using json file

    @When("User clicks on add client icon on dashbord")
    public void user_clicks_on_add_client_icon_on_dashbord() {
        clientPage.clickOnAddClientButton();
    }

    @When("User enters client details from {string}")
    public void user_enters_client_details_from(String string) throws Exception {
        clientPage.enterUserDetails();
        clientPage.clientDetails(string);
    }

    @When("User clicks on create button")
    public void user_clicks_on_create_button() {
        clientPage.clickOnCreateClientButton();

    }

    @Then("View client page displays")
    public void view_client_page_displays() {
        String clientMessage = clientPage.verifyCreatedClient();
        Assert.assertEquals(clientMessage, "View Client");

    }

    //Edit client using json file
    @When("User selects edit client sections from setting dropdown besides the active text on view client page")
    public void user_selects_edit_client_sections_from_setting_dropdown_besides_the_active_text_on_view_client_page() {
        clientPage.selectEditClientDetails();
    }


    @When("User enters all details of client on edit client window from  from {string}")
    public void user_enters_all_details_of_client_on_edit_client_window_from_from(String string) throws Exception {
        clientPage.editClientDetails(string);
    }

    @Then("Updated details can view on view client page")
    public void updated_details_can_view_on_view_client_page() {
        String updatedClientDetail = clientPage.verifyUpdatedClient();
        if (updatedClientDetail.length() > 0) {
            System.out.println(updatedClientDetail);

        }

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
        String clientCode = clientPage.verifyClient();
        Assert.assertEquals(clientCode, "RAOA-0001");
    }

    //Filter list of client based on active status dropdown option on manage client page also verifies client status on view client page
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
        String Status = clientPage.verifyClientStatus();
        if (Status.equals("Active")) {
            System.out.println("Client details displays with Active status");
        } else {
            System.out.println("Failed to find Client details displays with Active status");
        }

    }

    //To check whether add quote page is displays for same user by clicking on add button on view client page

    @When("User clicks on client code on manage client page to add quote")
    public void user_clicks_on_client_code_on_manage_client_page_to_add_quote() {

        clientNumber = clientPage.clickClientCodeToGetClientNumber();
        //System.out.println(clientPage);
    }

    @When("User clicks on add button on view client page")
    public void user_clicks_on_add_button_on_view_client_page() {
        clientPage.clickOnAddQuoteButton();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("Add quote page displays with same client code")
    public void add_quote_page_displays_with_same_client_code() {
        String clientId = clientPage.verifyExistingClientOnAddQuote();
        Assert.assertEquals(clientId, clientNumber);
    }

    //view client page should displays with all details for each client code link on manage client page

    @When("User clicks on client code link  on manage client page")
    public void user_clicks_on_client_code_link_on_manage_client_page() {
        String Message = clientPage.clickOnClientCodeOnManageClient();

        if (Message.length() > 0) {
            System.out.println(Message);
        } else {
            Assert.fail();
        }

    }

    @Then("View client page displays with all details")
    public void view_client_page_displays_with_all_details() {

    }

    //Edit client page should display in editable format by clicking on edit client icon on cog dropdown menu on view client page

    @When("User clicks on edit client icon on cog dropdown menu on view client page")
    public void user_clicks_on_edit_client_icon_on_cog_dropdown_menu_on_view_client_page() {
        clientPage.clickOnEditClientIcon();

    }

    @Then("Edit client page displays in editable format")
    public void edit_client_page_displays_in_editable_format() {
        clientPage.verifyEditClientPage();

    }

    //Add quote page should display in editable format by clicking on add quote icon on cog dropdown menu on view client page

    @When("User clicks on add quote icon on cog dropdown menu on view client page")
    public void user_clicks_on_add_quote_icon_on_cog_dropdown_menu_on_view_client_page() {
        clientPage.clickOnAddQuoteIcon();
    }

    @Then("Add quote page should display in editable format")
    public void add_quote_page_should_display_in_editable_format() {
        clientPage.verifyAddQuotePage();
    }

    //Add policy page should display in editable format by clicking on add policy icon on cog dropdown menu on view client page
    @When("User clicks on add policy icon on cog dropdown menu on view client page")
    public void user_clicks_on_add_policy_icon_on_cog_dropdown_menu_on_view_client_page() {
        clientPage.clickOnAddPolicyIcon();
    }

    @Then("Add policy page should display in editable format")
    public void add_policy_page_should_display_in_editable_format() {
        String Message = clientPage.verifyAddPolicyPage();
        Assert.assertEquals(Message, "Add Quote");
    }


    //Add claim page should display with all details by clicking on add claim icon on cog dropdown menu on view client page

    @When("User clicks on add claim icon on cog dropdown menu on view client page")
    public void user_clicks_on_add_claim_icon_on_cog_dropdown_menu_on_view_client_page() {
        clientPage.clickOnAddClaimIcon();
    }

    @Then("Add claim page should display with all details")
    public void add_claim_page_should_display_with_all_details() {
        String Message = clientPage.verifyAddClaimPage();
        Assert.assertEquals(Message, "Add Claim");
    }

    //Client Refund Unallocated Balance page displays with all details by clicking on client refund unallocated balance icon on cog dropdown menu on view client page

    @When("User clicks on client refund unallocated balance icon on cog dropdown menu on view client page")
    public void user_clicks_on_client_refund_unallocated_balance_icon_on_cog_dropdown_menu_on_view_client_page() {

        clientPage.clickOnClientRefundUnallocatedBalanceIcon();

    }

    @Then("Client Refund Unallocated Balance page displays with all details")
    public void client_refund_unallocated_balance_page_displays_with_all_details() {
        String Message = clientPage.verifyClientRefundUnallocatedBalancePage();
        Assert.assertEquals(Message, "Client Refund Unallocated Balance");

    }

    //Client Refund Credit Note page displays with all details by clicking on client refund credit note icon on cog dropdown menu on view client page

    @When("User clicks on client refund credit note icon on cog dropdown menu on view client page")
    public void user_clicks_on_client_refund_credit_note_icon_on_cog_dropdown_menu_on_view_client_page() {
        clientPage.clickOnClientRefundCreditNoteIcon();

    }

    @Then("Client Refund Credit Note page displays with all details")
    public void client_refund_credit_note_page_displays_with_all_details() {
        String Message = clientPage.verifyClientRefundCreditNotePage();
        Assert.assertEquals(Message, "Client Refund - Credit Note");
    }

    //Client Allocate Payment page displays with all details by clicking on client allocate payment icon on cog dropdown menu on view client page

    @When("User clicks on client allocate payment icon on cog dropdown menu on view client page")
    public void user_clicks_on_client_allocate_payment_icon_on_cog_dropdown_menu_on_view_client_page() {
        clientPage.clickOnClientAllocatePaymentIcon();
    }

    @Then("Client Allocate Payment page displays with all details")
    public void client_allocate_payment_page_displays_with_all_details() {
        String Message = clientPage.verifyAllocatePaymentPage();
        Assert.assertEquals(Message, "Allocate Payment");
    }

    //Client Account Maintenance page displays with all details by clicking on client account maintenance page icon on cog dropdown menu on view client page

    @When("User clicks on client account maintenance page icon on cog dropdown menu on view client page")
    public void user_clicks_on_client_account_maintenance_page_icon_on_cog_dropdown_menu_on_view_client_page() {
        clientPage.clickOnClientAccountMaintenanceIcon();
    }

    @Then("Client Account Maintenance page displays with all details")
    public void client_account_maintenance_page_displays_with_all_details() {
        String Message = clientPage.verifyAccountMaintenancePage();
        Assert.assertEquals(Message, "Client Account Maintenance");
    }

    //Debtor ledger page should display in editable format by clicking on debtor ledger icon on cog dropdown menu on view client page

    @When("User clicks on  clicking on debtor ledger icon on cog dropdown menu on view client page")
    public void user_clicks_on_clicking_on_debtor_ledger_icon_on_cog_dropdown_menu_on_view_client_page() {
        clientPage.clickOnDebtorLedgerIcon();
    }

    @Then("Debtor ledger page should display in editable format")
    public void debtor_ledger_page_should_display_in_editable_format() {
        clientPage.verifyDebtorLedgerPage();
    }


    //Policies details of client displays by clicking on policy tab on view client page

    @When("User clicks on policy tab on view client page")
    public void user_clicks_on_policy_tab_on_view_client_page() {
        clientPage.clickOnPolicyIcon();

    }

    @Then("Policies details should display on view client page")
    public void policies_details_should_display_on_view_client_page() {
        String pDetails = clientPage.verifyPolicyDetails();
        if (pDetails.length() > 0) {
            System.out.println(pDetails);
        } else {
            Assert.fail();
        }
    }

    //Claims details of client displays by clicking on policy tab on view client page

    @When("User clicks on claim tab on view client page")
    public void user_clicks_on_claim_tab_on_view_client_page() {
        clientPage.clickOnClaimIcon();
    }

    @Then("Claim details should display on view client page")
    public void claim_details_should_display_on_view_client_page() {
        String cDetails = clientPage.verifyClaimDetails();
        if (cDetails.length() > 0) {
            System.out.println(cDetails);
        } else {
            Assert.fail();
        }
    }

    //Contacts details of client displays by clicking on contact tab on view client page

    @When("User clicks on contact tab on view client page")
    public void user_clicks_on_contact_tab_on_view_client_page() {
        clientPage.clickOnContactIcon();
    }

    @Then("Contact details should display on view client page")
    public void contact_details_should_display_on_view_client_page() {
        String cDetails = clientPage.verifyContactDetails();
        if (cDetails.length() > 0) {
            System.out.println(cDetails);
        } else {
            Assert.fail();
        }
    }

    //Notes details of client displays by clicking on notes tab on view client page

    @When("User clicks on notes tab on view client page")
    public void user_clicks_on_notes_tab_on_view_client_page() {
        clientPage.clickOnNotesIcon();
    }

    @Then("Notes details should display on view client page")
    public void notes_details_should_display_on_view_client_page() {
        String nDetails = clientPage.verifyNotesDetails();
        if (nDetails.length() > 0) {
            System.out.println(nDetails);
        } else {
            Assert.fail();
        }
    }

    //Task details of client displays by clicking on task tab on view client page

    @When("User clicks on task tab on view client page")
    public void user_clicks_on_task_tab_on_view_client_page() {
        clientPage.clickOnTaskIcon();
    }

    @Then("Task details should display on view client page")
    public void task_details_should_display_on_view_client_page() {
        String tDetails = clientPage.verifyTaskDetails();
        if (tDetails.length() > 0) {
            System.out.println(tDetails);
        } else {
            Assert.fail();
        }
    }

    //History details of client displays by clicking on history tab on view client page

    @When("User clicks on history tab on view client page")
    public void user_clicks_on_history_tab_on_view_client_page() {
        clientPage.clickOnHistoryIcon();
    }

    @Then("History details should display on view client page")
    public void history_details_should_display_on_view_client_page() {
        String hDetails = clientPage.verifyHistoryDetails();
        if (hDetails.length() > 0) {
            System.out.println(hDetails);
        } else {
            Assert.fail();
        }
    }

    //Quotes details of client displays by clicking on quote tab on view client page

    @When("User clicks on quote tab on view client page")
    public void user_clicks_on_quote_tab_on_view_client_page() {
        clientPage.clickOnQuoteIcon();
    }

    @Then("Quote details should display on view client page")
    public void quote_details_should_display_on_view_client_page() {
        String qDetails = clientPage.verifyQuoteDetails();
        if (qDetails.length() > 0) {
            System.out.println(qDetails);
        } else {
            Assert.fail();
        }
    }

    //Policies Statement details of client displays by clicking on policies statement tab on view client page

    @When("User clicks on policies statement tab on view client page")
    public void user_clicks_on_policies_statement_tab_on_view_client_page() {
        clientPage.clickOnPoliciesStatementIcon();
    }

    @Then("Policies Statement details should display on view client page")
    public void policies_statement_details_should_display_on_view_client_page() {
        String psDetails = clientPage.verifyPoliciesStatementDetails();
        if (psDetails.length() > 0) {
            System.out.println(psDetails);
        } else {
            Assert.fail();
        }
    }

    //Filter the list of Policies details under policy tab on view client page by selecting appropriate option from status dropdown

    @When("User selects  appropriate option from status dropdown")
    public void user_selects_appropriate_option_from_status_dropdown() {
        clientPage.selectOptionFromStatusDropDown();

    }

    @Then("Filtered Policies details should display on view client page")
    public void filtered_policies_details_should_display_on_view_client_page() {

        String pDetails = clientPage.verifyPolicyData();
        if (pDetails.length() > 0) {
            System.out.println(pDetails);
        } else {
            Assert.fail();
        }

    }

    //Filter the list of Policies details under claim tab on view client page by selecting appropriate option from status dropdown

    @When("User selects  appropriate option from status dropdown on view page")
    public void user_selects_appropriate_option_from_status_dropdown_on_view_page() {
        clientPage.selectOptionFromStatusDD();
    }


    //To add new Client test case step definition

    @When("User clicks on add client icon on manage client page")
    public void user_clicks_on_add_client_icon_on_manage_client_page() {
        clientPage.clickOnAddClientButton();

    }

    @When("User enters all client details {string}")
    public void user_enters_all_client_details(String string) throws Exception {
        //main.logInDetails(string);

    }

    @When("User enters all mandatory details on add client page")
    public void user_enters_all_mandatory_details_on_add_client_page() {
        clientPage.enterUserDetails();
    }

    @When("User clicks on create button on add client page")
    public void user_clicks_on_create_button_on_add_client_page() {
        clientPage.clickOnCreateClientButton();
    }

    @Then("View client page appears with the details of currently added client")
    public void view_client_page_appears_with_the_details_of_currently_added_client() {
        String clientMessage = clientPage.verifyCreatedClient();
        Assert.assertEquals(clientMessage, "View Client");

    }

    //Add contact details of client

    @When("User selects Add contact option from setting dropdown besides of active text on view client page")
    public void user_selects_add_contact_option_from_setting_dropdown_besides_of_active_text_on_view_client_page() {
        clientPage.selectAddContactOfClient();

    }

    @When("User enters all details inside add client window")
    public void user_enters_all_details_inside_add_client_window() {
        clientPage.enterContactDetails();

    }

    @Then("Contact details can view under contacts menu on view client page")
    public void contact_details_can_view_under_contacts_menu_on_view_client_page() {
        String contactDetail = clientPage.verifyGeneratedContactDetails();
        if (contactDetail.length() > 0) {
            System.out.println(contactDetail);

        }
    }


    //Add notes information for client

    @When("User selects Add notes options from setting dropdown besides the active text on view client page")
    public void user_selects_add_notes_options_from_setting_dropdown_besides_the_active_text_on_view_client_page() {
        clientPage.selectAddNotesOfClient();

    }

    @When("User enters all details inside add notes window")
    public void user_enters_all_details_inside_add_notes_window() {
        clientPage.enterNotesDetails();

    }

    @Then("Notes details can view under note menu tab on view client page")
    public void notes_details_can_view_under_note_menu_tab_on_view_client_page() {
        String notesDetail = clientPage.verifyGeneratedNotesDetails();
        if (notesDetail.length() > 0) {
            System.out.println(notesDetail);

        }

    }

    //Add task details of client

    @When("User selects Add task options from setting dropdown besides the active text on view client page")
    public void user_selects_add_task_options_from_setting_dropdown_besides_the_active_text_on_view_client_page() {
        clientPage.selectAddTaskOfClient();

    }

    @When("User enters all details inside add task window")
    public void user_enters_all_details_inside_add_task_window() {
        clientPage.enterTaskDetails();

    }

    @Then("Task details can view under task menu tab on view client page")
    public void task_details_can_view_under_task_menu_tab_on_view_client_page() {
        String taskDetail = clientPage.verifyGeneratedTaskDetails();
        if (taskDetail.length() > 0) {
            System.out.println(taskDetail);

        }

    }





    //Add notes for client on production

    @When("User enters test client code inside search box on manage client page")
    public void user_enters_test_client_code_inside_search_box_on_manage_client_page() {
        clientPage.enterClientCode();
    }

    @When("Uer clicks on search button on manage client page")
    public void uer_clicks_on_search_button_on_manage_client_page() {
        clientPage.clickOnSearchButton();

    }

    @When("User clicks on client code on manage client page on production")
    public void user_clicks_on_client_code_on_manage_client_page_on_production() {
        clientPage.clickONClientCode();

    }


}
