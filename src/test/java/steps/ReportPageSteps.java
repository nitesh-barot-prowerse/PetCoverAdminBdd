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
        int numberOfSection=reportPage.fetchSections();
        System.out.println("Total number of sections of report page" +numberOfSection);
        Assert.assertEquals(numberOfSection,6);

    }

    @When("User clicks on reports icon")
    public void user_clicks_on_reports_icon() {
        reportPage.traversingThroughPages();

    }

    @Then("Respected report page displays")
    public void respected_report_page_displays() {
        //reportPage.traversingThroughPages();

    }
    @When("User clicks on quote report button on report button")
    public void user_clicks_on_quote_report_button_on_report_button() {
        reportPage.clickOnQuoteReportIcon();

    }

    @When("User selects any option from product,quote from and quote status drop down on quote report page")
    public void user_selects_any_option_from_product_quote_from_and_quote_status_drop_down_on_quote_report_page() {
        reportPage.selectOptionFromDropDown();

    }

    @When("User clicks on search button on quote report page")
    public void user_clicks_on_search_button_on_quote_report_page() {
        reportPage.clickSearchIcon();

    }

    @Then("Appropriate data displays on on quote report page upon selected options from drop down")
    public void appropriate_data_displays_on_on_quote_report_page_upon_selected_options_from_drop_down() {
        String data=reportPage.verifyQuoteReportData();
        System.out.println(data);

    }

}
