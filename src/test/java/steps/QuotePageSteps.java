package steps;

import factory.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.QuotePage;

public class QuotePageSteps {
    QuotePage quotePage = new QuotePage(DriverFactory.getDriver());

    @When("User clicks on quote icon on left tool bar")
    public void user_clicks_on_quote_icon_on_left_tool_bar() {
        String Message = quotePage.verifyManageQuotePage();
        Assert.assertEquals(Message, "Manage Quote");

    }

    @Then("User will see quote details")
    public void user_will_see_quote_details() {
        String Array = quotePage.fetchAndDisplayedData();
        System.out.println(Array);
    }

    @Then("User will able to see all data under quote date and expire date column displays with dd-mm-yyyy format")
    public void user_will_able_to_see_all_data_under_quote_date_and_expire_date_column_displays_with_dd_mm_yyyy_format() {
        String date = quotePage.verifyQuoteDateColumnForamt();
        String newDate[] = date.split(" ");
        for (String expDate : newDate) {
            System.out.println(expDate);
            String datePattern = "\\d{1,2}-\\d{1,2}-\\d{4}";
            boolean isDate = expDate.matches(datePattern);
            if (!isDate) {
                System.out.println("QuoteDate Column Having All Dates In Require Format");
                break;
            } else {
                Assert.fail();
            }

        }

        String eDate = quotePage.verifyExpireDateColumnFormat();
        String expDate[] = eDate.split(" ");
        for (String expireDate : expDate) {
            System.out.println(expireDate);
            String datePattern = "\\d{1,2}-\\d{1,2}-\\d{4}";
            boolean isDate = expireDate.matches(datePattern);
            if (!isDate) {
                System.out.println("Expire Date Column Having All Dates In Require Format");
                break;
            } else {
                Assert.fail();
            }
        }


    }


}
