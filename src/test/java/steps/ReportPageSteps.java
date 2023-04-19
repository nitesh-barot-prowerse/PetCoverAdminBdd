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

}
