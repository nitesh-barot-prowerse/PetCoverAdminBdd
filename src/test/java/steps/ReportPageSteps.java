package steps;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ReportPage;

public class ReportPageSteps {
    ReportPage reportPage = new ReportPage(DriverFactory.getDriver());

    @When("User clicks on reports icon on left tool bar")
    public void user_clicks_on_reports_icon_on_left_tool_bar() {
        reportPage.clickOnReportIcon();

    }

    @Then("User will able to see total six section of report category")
    public void user_will_able_to_see_total_six_section_of_report_category() {
        int numberOfSection = reportPage.fetchSections();
        System.out.println("Total number of sections of report page" + numberOfSection);
        Assert.assertEquals(numberOfSection, 8);

    }

    @When("User clicks on reports icon")
    public void user_clicks_on_reports_icon() {
        reportPage.traversingThroughPages();

    }

    @Then("Respected report page displays")
    public void respected_report_page_displays() {
        //reportPage.traversingThroughPages();

    }

    //Filter quote report information upon option of product drop down

    @When("User selects any option from product drop down on quote report page")
    public void user_selects_any_option_from_product_drop_down_on_quote_report_page() {
        reportPage.selectOptionFromProductDropDown();
    }

    @Then("Appropriate data displays on quote report page upon selected option from drop down")
    public void appropriate_data_displays_on_quote_report_page_upon_selected_option_from_drop_down() {
        String data = reportPage.verifyQuoteReportData();
        if (data.length() > 0) {
            System.out.println(data);
        } else {
            System.out.println("Data does not reflects upon product drop down options on quote report page");
        }
    }

    // Filter quote report information upon options value of quote status and quote from drop downs

    @When("User clicks on quote report button on report page")
    public void user_clicks_on_quote_report_button_on_report_page() {
        reportPage.clickOnQuoteReportIcon();
    }

    @When("User selects any option from quote from and quote status drop down on quote report page")
    public void user_selects_any_option_from_quote_from_and_quote_status_drop_down_on_quote_report_page() {
        reportPage.selectOptionFromDropDown();
    }

    @When("User clicks on search button on quote report page")
    public void user_clicks_on_search_button_on_quote_report_page() {
        reportPage.clickSearchIcon();

    }

    @Then("Appropriate data displays on quote report page upon selected options from drop down")
    public void appropriate_data_displays_on_quote_report_page_upon_selected_options_from_drop_down() {
        String data = reportPage.verifyQuoteReportData();
        if (data.length() > 0) {
            System.out.println(data);
        } else {
            System.out.println("Data does not reflects upon quote from and quote status drop down options on quote report page");
        }
    }


    //Sorting data on quote report page via quote number

    @When("User selects quote number option from sort by and Ascending option from sort by direction drop down respectively")
    public void user_selects_quote_number_option_from_sort_by_and_ascending_option_from_sort_by_direction_drop_down_respectively() {
        reportPage.selectOptionFromSortByDropDown();
    }

    @Then("All data on quote report page displays in sorting manner")
    public void all_data_on_quote_report_page_displays_in_sorting_manner() {
        String data = reportPage.verifyQuoteReportData();
        if (data.length() > 0) {
            System.out.println(data);
        } else {
            System.out.println("Data does not reflects upon quote number and Ascending drop down options on quote report page");
        }
    }

    //Filter policy report information upon option of product drop down

    @When("User clicks on policy summary report button on report page")
    public void user_clicks_on_policy_summary_report_button_on_report_page() {
        reportPage.clickOnPolicySummaryIcon();
    }

    @When("User selects any option from product drop down on policy summary report page")
    public void user_selects_any_option_from_product_drop_down_on_policy_summary_report_page() {
        reportPage.selectOptionFromProductDropDownOnProductSummaryPage();
    }

    @When("User clicks on search button on policy summary report page")
    public void user_clicks_on_search_button_on_policy_summary_report_page() {
        reportPage.clickSearchIconOnPolicySummary();
    }

    @Then("Appropriate data displays on policy summary report page upon selected option from drop down")
    public void appropriate_data_displays_on_policy_summary_report_page_upon_selected_option_from_drop_down() {
        String data = reportPage.verifyPolicySummaryReportData();
        if (data.length() > 0) {
            System.out.println(data);
        } else {
            System.out.println("Data does not reflects upon product drop down options on policy summary report page");
        }

    }

    //Filter policy report information upon option of status drop down

    @When("User selects any option from status drop down on policy summary report page")
    public void user_selects_any_option_from_status_drop_down_on_policy_summary_report_page() {
        reportPage.selectOptionFromStatusDropDownOnProductSummaryPage();
    }

    @Then("Appropriate data displays on policy summary report page upon selected option from status drop down")
    public void appropriate_data_displays_on_policy_summary_report_page_upon_selected_option_from_status_drop_down() {
        String data = reportPage.verifyPolicySummaryReportDataUponStatusDD();
        if (data.length() > 0) {
            System.out.println(data);
        } else {
            System.out.println("Data does not reflects upon status drop down options on policy summary report page");
        }
    }

    //Sorting data on policy summary report page via policy number and sort direction dropdowns options

    @When("User selects policy number option from sort by and ascending option from sort direction drop down respectively")
    public void user_selects_policy_number_option_from_sort_by_and_ascending_option_from_sort_direction_drop_down_respectively() {
        reportPage.selectOptionFromSortsDropDownOnProductSummaryPage();
    }

    @Then("Appropriate data displays on policy summary report page upon selected option from both drop down")
    public void appropriate_data_displays_on_policy_summary_report_page_upon_selected_option_from_both_drop_down() {
        String data = reportPage.verifyPolicySummaryReportDataUponSortBYDD();
        if (data.length() > 0) {
            System.out.println(data);
        } else {
            System.out.println("Data does not reflects upon status drop down options on policy summary report page");
        }
    }

    //Filter outstanding renewal report information upon from and to date values

    @When("User clicks on outstanding renewal report button on report page")
    public void user_clicks_on_outstanding_renewal_report_button_on_report_page() {
        reportPage.clickOnOutstandingRenewalReportIcon();
    }

    @When("User enters from and to date value on outstanding renewal report page")
    public void user_enters_from_and_to_date_value_on_outstanding_renewal_report_page() {
        reportPage.enterFromAndToDateOnOutstandingRenewalReport();
    }

    @When("User clicks on search button on outstanding renewal report page")
    public void user_clicks_on_search_button_on_outstanding_renewal_report_page() {
        reportPage.clickSearchIconOnOutstandingRenewalReport();
    }
    @Then("Appropriate data displays on outstanding renewal report page upon selected option from drop down")
    public void appropriate_data_displays_on_outstanding_renewal_report_page_upon_selected_option_from_drop_down() {
        String data = reportPage.verifyOutstandingRenewalReportData();
        if (data.length() > 0) {
            System.out.println(data);
        } else {
            System.out.println("Data does not reflects upon from and to date values on outstanding renewal report page");
        }
    }

    //Filter Policy Payment history report information upon from and to date

    @When("User clicks on policy payment history button on report page")
    public void user_clicks_on_policy_payment_history_button_on_report_page() {
        reportPage.clickOnPolicyHistoryIcon();
    }

    @When("User enters from and to date value on policy payment history page")
    public void user_enters_from_and_to_date_value_on_policy_payment_history_page() {
        reportPage.enterFromAndToDate();
    }

    @When("User clicks on search button on policy policy payment history page")
    public void user_clicks_on_search_button_on_policy_policy_payment_history_page() {
        reportPage.clickSearchIconOnPolicyHistory();
    }

    @Then("Appropriate data displays on policy payment history page upon selected option from drop down")
    public void appropriate_data_displays_on_policy_payment_history_page_upon_selected_option_from_drop_down() {
        String data = reportPage.verifyPolicyHistoryReportData();
        if (data.length() > 0) {
            System.out.println(data);
        } else {
            System.out.println("Data does not reflects upon from and to date values on policy history report page");
        }
    }

    //Filter policy cancellation report information upon option of insurer drop down

    @When("User clicks on policy cancellation report button on report page")
    public void user_clicks_on_policy_cancellation_report_button_on_report_page() {
        reportPage.clickOnPolicyCancellationIcon();
    }

    @When("User selects any option from insurer drop down on policy cancellation report page")
    public void user_selects_any_option_from_insurer_drop_down_on_policy_cancellation_report_page() {
        reportPage.selectOptionFromInsurerDropDown();
    }

    @When("User clicks on search button on policy policy cancellation report page")
    public void user_clicks_on_search_button_on_policy_policy_cancellation_report_page() {
        reportPage.clickSearchIconOnPolicyCancellation();
    }

    @Then("Appropriate data displays on policy policy cancellation report page upon selected option from drop down")
    public void appropriate_data_displays_on_policy_policy_cancellation_report_page_upon_selected_option_from_drop_down() {

        String data = reportPage.verifyPolicyCancellationReportData();
        if (data.length() > 0) {
            System.out.println(data);
        } else {
            System.out.println("Data does not reflects upon insurer drop down options on policy cancellation report page");
        }

    }

    //Sorting data on policy cancellation report via sort by and sort direction dropdowns options
    @When("User selects any option from sort by and option from sort direction drop down respectively")
    public void user_selects_any_option_from_sort_by_and_option_from_sort_direction_drop_down_respectively() {
        reportPage.selectOptionFromDropDownOnPolicyCancellation();
    }

    //Filter Outstanding Claims report information upon notified from and to date

    @When("User clicks on outstanding claims button on report page")
    public void user_clicks_on_outstanding_claims_button_on_report_page() {
        reportPage.clickOnOutstandingClaimIcon();
    }

    @When("User enters from and to date value on outstanding claims page")
    public void user_enters_from_and_to_date_value_on_outstanding_claims_page() {
        reportPage.enterFromAndToDateOnOutstandingClaim();
    }

    @When("User clicks on search button on outstanding claims")
    public void user_clicks_on_search_button_on_outstanding_claims() {
        reportPage.clickSearchIconOnOutstandingClaim();
    }

    @Then("Appropriate data displays on outstanding claims upon date values")
    public void appropriate_data_displays_on_outstanding_claims_upon_date_values() {
        String data = reportPage.verifyOutstandingClaimData();
        if (data.length() > 0) {
            System.out.println(data);
        } else {
            System.out.println("Data does not reflects upon entering from and to date value on outstanding claim report page");
        }
    }

    // Sorting data on Filter Outstanding Claims report via sort by and sort direction dropdowns options

    @When("User selects any option from sort by and option from sort direction drop down respectively on Filter Outstanding Claims page")
    public void user_selects_any_option_from_sort_by_and_option_from_sort_direction_drop_down_respectively_on_filter_outstanding_claims_page() {
        reportPage.selectOptionsFromSortByAndDirectionDDOnOutstandingClaim();
    }

    @Then("Appropriate data displays on outstanding claims upon selected option from drop down")
    public void appropriate_data_displays_on_outstanding_claims_upon_selected_option_from_drop_down() {
        String data = reportPage.verifyOutstandingClaimDataUponSorting();
        if (data.length() > 0) {
            System.out.println(data);
        } else {
            System.out.println("Data does not reflects upon options of sort by and sort direction drop down  on outstanding claim report page");
        }
    }


    //Add premium and claim adjustments window opens by clicking on adjustment button on section 26 and 27 report page

    @When("User clicks on Trust summary section button on report page")
    public void user_clicks_on_trust_summary_section_button_on_report_page() {
        reportPage.clickOnTrustSummarySection();
    }

    @When("User clicks on adjustment button on section report page")
    public void user_clicks_on_adjustment_button_on_section_report_page() {
        reportPage.clickOnAdjustmentIconOnSectionPage();
    }

    @Then("Add premium and claim adjustments window opens with all details")
    public void add_premium_and_claim_adjustments_window_opens_with_all_details() {
        reportPage.verifyAddPremiumAndClaimAdjustmentWindow();
    }

    //Payment window opens by clicking on payments button on section 26 and 27 report page

    @When("User clicks on payments button on section report page")
    public void user_clicks_on_payments_button_on_section_report_page() {
        reportPage.clickOnPaymentsSectionPage();
    }

    @Then("Payments window opens with all details")
    public void payments_window_opens_with_all_details() {
        reportPage.verifyPaymentsWindow();
    }

    //Opening and Closing bank balance window opens by clicking on bank button on section 26 and 27 report page

    @When("User clicks on bank button on section report page")
    public void user_clicks_on_bank_button_on_section_report_page() {
        reportPage.clickOnBankIconOnSectionPage();
    }

    @Then("Opening and Closing bank balance window opens with all details")
    public void opening_and_closing_bank_balance_window_opens_with_all_details() {
        reportPage.verifyBankBalanceWindow();

    }


}
