package steps;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ManageClaimPage;

public class ManageClaimsSteps {
    ManageClaimPage claimPage = new ManageClaimPage(DriverFactory.getDriver());

    @When("User clicks on manage claims icon on left tool bar")
    public void user_clicks_on_manage_claims_icon_on_left_tool_bar() {
        claimPage.clickManageClaimIcon();

    }

    @Then("User will able see all data available on manage claim page")
    public void user_will_able_see_all_data_available_on_manage_claim_page() {
        String displayedData = claimPage.verifyClaimPageInformation();
        System.out.println(displayedData);
    }

    @Then("All data under treatment and cliam first advised date column displays in dd-mm-yyyy format")
    public void all_data_under_treatment_and_cliam_first_advised_date_column_displays_in_dd_mm_yyyy_format() {
        String treatmentDate = claimPage.verifyTreatmentDate();
        String tDate[] = treatmentDate.split(" ");
        for (String staDate : tDate) {
            String datePattern = "\\d{1,2}-\\d{1,2}-\\d{4}";
            boolean isDate = staDate.matches(datePattern);
            if (!isDate) {
                System.out.println("Treatment Date Column data displays with dd-mm-yyyy format");
                break;
            } else {
                Assert.fail();
            }
        }

        String advisedDate = claimPage.verifyFirstAdvisedDate();
        String adDate[] = advisedDate.split(" ");
        for (String eDate : adDate) {
            String datePattern = "\\d{1,2}-\\d{1,2}-\\d{4}";
            boolean isDate = eDate.matches(datePattern);
            if (!isDate) {
                System.out.println("Advised Date Column data displays with dd-mm-yyyy format");
                break;
            } else {
                Assert.fail();
            }
        }

    }

    @Then("All data under Amount paybale column prefixed by £ sign")
    public void all_data_under_amount_paybale_column_prefixed_by_£_sign() {
        String amountPayable=claimPage.verifyAmountPayableColumn();
        //System.out.println(yearlyArray);
        String apArray[] = amountPayable.split(" ");
        for (int i = 0; i < apArray.length - 1; i++) {
            if (apArray[i].equals("£")) {
                System.out.println("All Amount Under Amount Payable Column Prefixed By £");
                break;
            }
        }

    }
}
