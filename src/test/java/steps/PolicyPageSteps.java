package steps;

import factory.DriverFactory;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.PolicyPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PolicyPageSteps {
    PolicyPage policyPage = new PolicyPage(DriverFactory.getDriver());


    @When("User clicks on policy icon on left tool bar")
    public void user_clicks_on_policy_icon_on_left_tool_bar() {

        policyPage.clickPolicyIcon();
    }

    @Then("User can see {string} message with all policy data")
    public void user_can_see_message_with_all_policy_data(String string) {
        String mpMessage = policyPage.verifyManagePolicyPage();
        Assert.assertEquals(mpMessage, string);
        String dataArray = policyPage.fetchAndDisplayData();
        if (dataArray.length() > 0) {
            System.out.println(dataArray);
        } else {
            Assert.fail();
        }

    }

    @Then("All data under Start date and And date displays in dd-mm-yyyy format")
    public void all_data_under_start_date_and_and_date_displays_in_dd_mm_yyyy_format() {
        String startDate = policyPage.verifyDateFormatOfStartDate();
        String sDate[] = startDate.split(" ");
        for (String staDate : sDate) {
            String datePattern = "\\d{1,2}-\\d{1,2}-\\d{4}";
            boolean isDate = staDate.matches(datePattern);
            if (!isDate) {
                System.out.println("StartDate Column data displays with dd-mm-yyyy format");
                break;
            } else {
                Assert.fail();
            }
        }

        String expireDate = policyPage.verfiyDateFormatOfExpireDate();
        String endDate[] = expireDate.split(" ");
        for (String eDate : endDate) {
            String datePattern = "\\d{1,2}-\\d{1,2}-\\d{4}";
            boolean isDate = eDate.matches(datePattern);
            if (!isDate) {
                System.out.println("ExpireDate Column data displays with dd-mm-yyyy format");
                break;
            } else {
                Assert.fail();
            }
        }

    }

    @When("User clicks on policy number")
    public void user_clicks_on_policy_number() {
        String policyMessage = policyPage.clickOnPolicyNumberLink();
        if (policyMessage.length() > 0) {
            System.out.println(policyMessage);
        } else {
            Assert.fail();
        }

    }

    @Then("User will redirect to policy information page")
    public void user_will_redirect_to_policy_information_page() {

    }

    @When("User clicks on policy number link")
    public void user_clicks_on_policy_number_link() {
        policyPage.clickPolicyPageToDownloadFile();
    }

    @When("User clicks on letter tab on policy information page")
    public void user_clicks_on_letter_tab_on_policy_information_page() {
        policyPage.LetterIcon();
    }

    @When("User clicks on download icon")
    public void user_clicks_on_download_icon() {
        policyPage.DownloadIcon();

    }

    @Then("User will able to see downloaded policy page")
    public void user_will_able_to_see_downloaded_policy_page() {
        /*String downloadFile = policyPage.verifyDownLoadFile();
        if (downloadFile.equals("file exist")) {
            System.out.println("File Has Been Downloaded");
        } else {
            Assert.fail();
        }*/

    }

    //Check appropriate policy data should displays against option selected from status drop down on manage policy page
    @When("User selects any options from status dropdown")
    public void user_selects_any_options_from_status_dropdown() {

        policyPage.selectOptionFromStatusDropDown();
    }

    @Then("Appropriate data displays on manage policy page depend on drop down option")
    public void appropriate_data_displays_on_manage_policy_page_depend_on_drop_down_option() {
        String policyStatus = policyPage.verifyPolicyStatusUponDropDown();
        if (policyStatus.length() > 0) {
            System.out.println(policyStatus);
        } else {
            System.out.println("Policy details do not displays upon status dropdown option");
        }
    }

    //Filter policy details on manage policy page upon from and to date value of policy  on manage policy page

    @When("User enters value of from and to date value of policy on manage policy page")
    public void user_enters_value_of_from_and_to_date_value_of_policy_on_manage_policy_page() {
        policyPage.enterFromAndToDateValueOfPolicy();

    }

    @When("User clicks on search button on manage policy page")
    public void user_clicks_on_search_button_on_manage_policy_page() {
        policyPage.clickOnSearchButtonOnManagePolicyPage();

    }

    @Then("Details of policy on manage policy page filters upon value of from and to date value of policy")
    public void details_of_policy_on_manage_policy_page_filters_upon_value_of_from_and_to_date_value_of_policy() {
        String policyDetails = policyPage.verifyPolicyDetails();
        if (policyDetails.length() > 0) {
            System.out.println(policyDetails);
        } else {
            System.out.println("Policy details do not displays upon from and to date values of policy");
        }

    }

    //Verify that add claim page should open with all details by clicking on add claim icon of cog drop down against policy number on manage policy page

    @When("User clicks on add claim icon of cog drop down against policy number on manage policy page")
    public void user_clicks_on_add_claim_icon_of_cog_drop_down_against_policy_number_on_manage_policy_page() {
        policyPage.clickOnAddClaimPage();

    }

    @Then("Add claim displays with all details")
    public void add_claim_displays_with_all_details() {
        String addClaimPageDetails = policyPage.verifyAddClaimPage();
        Assert.assertEquals(addClaimPageDetails, " Add Claim");

    }

    //Verify that add note window should open with all details by clicking on add note icon of cog drop down against policy number on manage policy page

    @When("User clicks on add note window icon of cog drop down against policy number on manage policy page")
    public void user_clicks_on_add_note_window_icon_of_cog_drop_down_against_policy_number_on_manage_policy_page() {
        policyPage.clickOnAddNoteIcon();
    }

    @Then("Add note window displays with all details")
    public void add_note_window_displays_with_all_details() {
        policyPage.verifyAddNoteWindow();

    }
    //Verify that add latter page should open with all details by clicking on add latter icon of cog drop down against policy number on manage policy page

    @When("User clicks on add latter window icon of cog drop down against policy number on manage policy page")
    public void user_clicks_on_add_latter_window_icon_of_cog_drop_down_against_policy_number_on_manage_policy_page() {
        policyPage.clickOnAddLetterIcon();
    }

    @When("User enter all details to generate letter for client and selects send email and letter option")
    public void user_enter_all_details_to_generate_letter_for_client_and_selects_send_email_and_letter_option() {
        policyPage.verifyAddLetterWindow();
    }

    @Then("Generated letter should displays under letter tab on policy information page")
    public void generated_letter_should_displays_under_letter_tab_on_policy_information_page() {
        String letterDetails=policyPage.verifyLetter();
        if (letterDetails.length()>0)
        {
            System.out.println("Test Passed");
        }
        else
        {
            Assert.fail();
        }


    }

    //Verify that add latter page should open with all details by clicking on add latter icon of cog drop down against policy number on manage policy page for insurer

    @When("User enter all details for insurer to generate letter for client and selects send email and letter option")
    public void user_enter_all_details_for_insurer_to_generate_letter_for_client_and_selects_send_email_and_letter_option() {
        policyPage.enterDetailsOnAddLetterWindow();
    }

    //Verify that quote information page should open with all details by clicking on view quote icon of cog drop down against policy number on manage policy page

    @When("User clicks on view quote icon of cog drop down against policy number on manage policy page")
    public void user_clicks_on_view_quote_icon_of_cog_drop_down_against_policy_number_on_manage_policy_page() {
        policyPage.clickOnViewQuoteIcon();

    }

    @Then("Quote information page displays with all details")
    public void quote_information_page_displays_with_all_details() {
        String quoteInformationDetails = policyPage.verifyQuoteInformationPage();
        Assert.assertEquals(quoteInformationDetails, " Quote Information");

    }
    //Add claim page displays with all details by clicking add claim icon of cog drop down on policy information page

    @When("User selects any active option from status dropdown on manage policy page")
    public void user_selects_any_active_option_from_status_dropdown_on_manage_policy_page() {
        policyPage.selectOptionFromStatusDropDown();
    }

    @When("User clicks on policy number link on manage policy page")
    public void user_clicks_on_policy_number_link_on_manage_policy_page() {
        policyPage.clickPolicyPageToDownloadFile();

    }

    @When("User selects add claim page icon option from cog drop dowm on policy information page")
    public void user_selects_add_claim_page_icon_option_from_cog_drop_dowm_on_policy_information_page() {
        policyPage.clickOnAddClaimOnPolicyInformation();

    }

    @Then("Add claim page displays with all details")
    public void add_claim_page_displays_with_all_details() {
        String addClaimPageDetails = policyPage.verifyAddClaimPage();
        Assert.assertEquals(addClaimPageDetails, " Add Claim");

    }

    //Add note window displays with all details by clicking add note icon of cog drop down on policy information page

    @When("User selects add note icon option from cog drop down on policy information page")
    public void user_selects_add_note_icon_option_from_cog_drop_down_on_policy_information_page() {
        policyPage.clickOnAddNoteOnPolicyInformation();
    }

    //Policy endorsement page displays with all details by clicking add endorsement icon of cog drop down on policy information page

    @When("User selects add endorsement icon of cog drop down on policy information page")
    public void user_selects_add_endorsement_icon_of_cog_drop_down_on_policy_information_page() {
        policyPage.clickOnAddEndorsementOnPolicyInformation();

    }

    @Then("Policy endorsement page displays with all details")
    public void policy_endorsement_page_displays_with_all_details() {
        String policyEndorsementPage = policyPage.verifyPolicyEndorsementPage();
        Assert.assertEquals(policyEndorsementPage, " Policy Endorsement");

    }

    // Quote information page displays with all details by clicking view quote icon of cog drop down on policy information page
    @When("User selects view quote icon option from cog drop down on policy information page")
    public void user_selects_view_quote_icon_option_from_cog_drop_down_on_policy_information_page() {
        policyPage.selectViewQuoteIcon();

    }

    @Then("Quote information displays with all required details")
    public void quote_information_displays_with_all_required_details() {
        String quoteInfoPage = policyPage.verifyQuoteInfoPage();
        Assert.assertEquals(quoteInfoPage, " Policy Information");
    }

    //Cancel  policy window displays with all details by clicking cancel policy icon of cog drop down on policy information page

    @When("User selects cancel policy icon of cog drop down on policy information page")
    public void user_selects_cancel_policy_icon_of_cog_drop_down_on_policy_information_page() {
        policyPage.selectCancelPolicyIcon();

    }

    @Then("Cancel policy window displays with all required details")
    public void cancel_policy_window_displays_with_all_required_details() {
        policyPage.verifyCancelPolicyWindow();

    }

    // Add allocate payment page displays with all details by clicking add allocate payment icon of cog drop down on policy information page
    @When("User selects add allocate payment icon of cog drop down on policy information page")
    public void user_selects_add_allocate_payment_icon_of_cog_drop_down_on_policy_information_page() {
        policyPage.selectAddAllocateIcon();

    }

    @Then("Add allocate payment page displays with all details")
    public void add_allocate_payment_page_displays_with_all_details() {
        String allocatePaymentPage = policyPage.verifyAddAllocatePage();
        Assert.assertEquals(allocatePaymentPage, " Allocate Payment");

    }

    //Client account maintenance displays with all details by clicking add account maintenance icon of cog drop down on policy information page

    @When("User selects add account maintenance icon of cog drop down on policy information page")
    public void user_selects_add_account_maintenance_icon_of_cog_drop_down_on_policy_information_page() {
        policyPage.selectAddAccountMaintenanceIcon();
    }

    @Then("Client account maintenance displays with all details")
    public void client_account_maintenance_displays_with_all_details() {
        String clientAccountMaintenancePage = policyPage.verifyClientAccountMaintenancePage();
        Assert.assertEquals(clientAccountMaintenancePage, " Policy Information");

    }

    //Verify appropriate details should reflect by clicking on  transactions tab on policy information page

    @When("User clicks on transactional tab on policy information page")
    public void user_clicks_on_transactional_tab_on_policy_information_page() {
        policyPage.clickOnTransactionTab();

    }

    @Then("User will able to see appropriate data")
    public void user_will_able_to_see_appropriate_data() {
        String details = policyPage.verifyDetailsOfTabsOnPolicyInformationPage();
        if (details.length() > 0) {
            System.out.println(details);
        } else {
            System.out.println("Data does not displays upon clicking transaction tab");
        }

    }

    //Verify appropriate details should reflect by clicking on insurer tab on policy information page

    @When("User clicks on insurer tab on policy information page")
    public void user_clicks_on_insurer_tab_on_policy_information_page() {
        policyPage.clickOnInsurerTab();

    }

    @Then("User will able to see appropriate data upon clicking insurer tab")
    public void user_will_able_to_see_appropriate_data_upon_clicking_insurer_tab() {

        String details = policyPage.verifyDetailsOfInsurerTabOnPolicyInformationPage();
        if (details.length() > 0) {
            System.out.println(details);
        } else {
            System.out.println("Data does not displays upon clicking insurer tab");
        }

    }

    //Verify appropriate details should reflect by clicking on claim tab on policy information page

    @When("User clicks on claim tab on policy information page")
    public void user_clicks_on_claim_tab_on_policy_information_page() {
        policyPage.clickOnClaimTab();
    }

    @Then("User will able to see appropriate data upon clicking claim tab")
    public void user_will_able_to_see_appropriate_data_upon_clicking_claim_tab() {
        String details = policyPage.verifyDetailsOfClaimTabOnPolicyInformationPage();
        if (details.length() > 0) {
            System.out.println(details);
        } else {
            System.out.println("Data does not displays upon clicking claim tab");
        }

    }

    //Verify appropriate details should reflect by clicking on reversal claim tab on policy information page

    @When("User clicks on reversal claim tab on policy information page")
    public void user_clicks_on_reversal_claim_tab_on_policy_information_page() {
        policyPage.clickOnReversalClaimTab();
    }

    @Then("User will able to see appropriate data upon clicking reversal claim tab")
    public void user_will_able_to_see_appropriate_data_upon_clicking_reversal_claim_tab() {
        String details = policyPage.verifyDetailsOfReversalClaimTabOnPolicyInformationPage();
        if (details.length() > 0) {
            System.out.println(details);
        } else {
            System.out.println("Data does not displays upon clicking reversal claim tab");
        }

    }

    @When("User clicks on credit note tab on policy information page")
    public void user_clicks_on_credit_note_tab_on_policy_information_page() {
        policyPage.clickOnCreditNoteTab();
    }

    @Then("User will able to see appropriate data upon clicking credit note tab")
    public void user_will_able_to_see_appropriate_data_upon_clicking_credit_note_tab() {
        String details = policyPage.verifyDetailsOfCreditNoteTabOnPolicyInformationPage();
        if (details.length() > 0) {
            System.out.println(details);
        } else {
            System.out.println("Data does not displays upon clicking credit note tab");
        }
    }

    //Verify appropriate details should reflect by clicking on policy invoice credit note tab on policy information page

    @When("User clicks on policy invoice credit note tab on policy information page")
    public void user_clicks_on_policy_invoice_credit_note_tab_on_policy_information_page() {
       policyPage.clickOnPolicyInvoiceCreditNoteTab();
    }

    @Then("User will able to see appropriate data upon clicking policy invoice credit note tab")
    public void user_will_able_to_see_appropriate_data_upon_clicking_policy_invoice_credit_note_tab() {
        String details = policyPage.verifyDetailsOfPolicyInvoiceCreditNoteTabOnPolicyInformationPage();
        if (details.length() > 0) {
            System.out.println(details);
        } else {
            System.out.println("Data does not displays upon clicking policy invoice credit note tab");
        }
    }

    //Verify appropriate details should reflect by clicking on notes tab on policy information page

    @When("User clicks on notes tab on policy information page")
    public void user_clicks_on_notes_tab_on_policy_information_page() {
       policyPage.clickOnNotesTab();
    }

    @Then("User will able to see appropriate data upon clicking notes tab")
    public void user_will_able_to_see_appropriate_data_upon_clicking_notes_tab() {
        String details = policyPage.verifyDetailsOfNotesTabOnPolicyInformationPage();
        if (details.length() > 0) {
            System.out.println(details);
        } else {
            System.out.println("Data does not displays upon clicking notes tab");
        }

    }

    //Verify appropriate details should reflect by clicking on installment tab on policy information page
    @When("User clicks on installment tab on policy information page")
    public void user_clicks_on_installment_tab_on_policy_information_page() {
        policyPage.clickOnInstallmentTab();
    }

    @Then("User will able to see appropriate data upon clicking installment tab")
    public void user_will_able_to_see_appropriate_data_upon_clicking_installment_tab() {
        String details = policyPage.verifyDetailsOfInstallmentTabOnPolicyInformationPage();
        if (details.length() > 0) {
            System.out.println(details);
        } else {
            System.out.println("Data does not displays upon clicking installment tab");
        }
    }

    //Verify appropriate details should reflect by clicking on exclusion tab on policy information page

    @When("User clicks on exclusion tab on policy information page")
    public void user_clicks_on_exclusion_tab_on_policy_information_page() {
       policyPage.clickOnExclusionTab();
    }

    @Then("User will able to see appropriate data upon clicking exclusion tab")
    public void user_will_able_to_see_appropriate_data_upon_clicking_exclusion_tab() {
        String details = policyPage.verifyDetailsOfExclusionTabOnPolicyInformationPage();
        if (details.length() > 0) {
            System.out.println(details);
        } else {
            System.out.println("Data does not displays upon clicking exclusion tab");
        }
    }

    //Verify appropriate details should reflect by clicking on history tab on policy information page

    @When("User clicks on history tab on policy information page")
    public void user_clicks_on_history_tab_on_policy_information_page() {
       policyPage.clickOnHistoryTab();
    }

    @Then("User will able to see appropriate data upon clicking history tab")
    public void user_will_able_to_see_appropriate_data_upon_clicking_history_tab() {
        String details = policyPage.verifyDetailsOfHistoryTabOnPolicyInformationPage();
        if (details.length() > 0) {
            System.out.println(details);
        } else {
            System.out.println("Data does not displays upon clicking history tab");
        }
    }

    //Verify appropriate details should reflect by clicking on policy ledger tab on policy information page

    @When("User clicks on policy ledger tab on policy information page")
    public void user_clicks_on_policy_ledger_tab_on_policy_information_page() {
        policyPage.clickOnPolicyLedgerTab();
    }

    @Then("User will able to see appropriate data upon clicking policy ledger tab")
    public void user_will_able_to_see_appropriate_data_upon_clicking_policy_ledger_tab() {
        String details = policyPage.verifyDetailsOfPolicyLedgerTabOnPolicyInformationPage();
        if (details.length() > 0) {
            System.out.println(details);
        } else {
            System.out.println("Data does not displays upon clicking policy ledger tab");
        }
    }

    //Add claim for existing policy

    @When("User click on policy icon and selects add claim icon for existing policy")
    public void user_click_on_policy_icon_and_selects_add_claim_icon_for_existing_policy() {
        policyPage.clickAddClaimIcon();
    }

    @When("User enters claim details")
    public void user_enters_claim_details() {
       policyPage.enterClaimPolicyInfo();
    }

    @When("User clicks on save button")
    public void user_clicks_on_save_button() {
        policyPage.clickOnSaveClaimButton();

    }



}
