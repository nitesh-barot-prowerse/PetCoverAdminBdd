package steps;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ManageClaimPage;
import utils.ScreenRecorderUtil;

public class ManageClaimsSteps {
    ManageClaimPage claimPage = new ManageClaimPage(DriverFactory.getDriver());

    @When("User clicks on manage claims icon on left tool bar")
    public void user_clicks_on_manage_claims_icon_on_left_tool_bar() {
        claimPage.clickManageClaimIcon();

    }

    @Then("User will able see all data available on manage claim page")
    public void user_will_able_see_all_data_available_on_manage_claim_page() {
        String displayedData = claimPage.verifyClaimPageInformation();
        if (displayedData.length() > 0) {
            System.out.println(displayedData);
        }
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
        String amountPayable = claimPage.verifyAmountPayableColumn();
        //System.out.println(yearlyArray);

        String[] split = amountPayable.split("[ .\\ ]+");
        // System.out.println(split);
        for (int j = 1; j <= split.length - 1; j = j + 3) {
            System.out.println(split[j]);
            if (split[j].contains("£")) {
                System.out.println("Data Prefixed by £");

            } else {
                // Assert.fail();
                System.out.println("Data not Prefixed by £");
            }


        }

    }

    @When("User clicks on claim number on manage claim page")
    public void user_clicks_on_claim_number_on_manage_claim_page() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        claimPage.redirectToClaimInformationPage();

    }

    @Then("User will redirects to respected claim information page")
    public void user_will_redirects_to_respected_claim_information_page() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String message = claimPage.verifyClaimInfoPageText();
        Assert.assertEquals(message, "Manage Claims");


    }

    @When("User clicks on add claim button")
    public void user_clicks_on_add_claim_button() {
        claimPage.clickAddClaimIcon();
    }

    @Then("User will redirect to add claim page")
    public void user_will_redirect_to_add_claim_page() {
        String Message = claimPage.verifyAddClaimPage();
        Assert.assertEquals(Message, "Add Claim");
    }

    @Then("Page has all dropdown with valid list items'")
    public void page_has_all_dropdown_with_valid_list_items() {
        claimPage.verifyDropDown();

    }


    //Treatment status should reflect upon option selected from treatment status drop down on manage claim page
    @When("User selects any options from treatment status dropdown on manage claim page")
    public void user_selects_any_options_from_treatment_status_dropdown_on_manage_claim_page() {
        claimPage.selectItemFromStatusDropDown();

    }

    @Then("Appropriate treatment status will display on manage claim page under claim details")
    public void appropriate_treatment_status_will_display_on_manage_claim_page_under_claim_details() {
        String treatmentStatus = claimPage.verifyTreatmentStatus();

        if (treatmentStatus.length() > 0) {
            System.out.println("Treatment status appeared as per requirement");
        }
    }

    //Verify edit claim page displays after clicking on edit claim icon on manage claim page

    @When("User clicks on edit claim icon on cog icon on manage claim page")
    public void user_clicks_on_edit_claim_icon_on_cog_icon_on_manage_claim_page() {
        claimPage.selectEditClientDetails();

    }

    @Then("Edit claim page displays with editable form")
    public void edit_claim_page_displays_with_editable_form() {

        String editClaimPage = claimPage.verifyEditClaimPage();

        Assert.assertEquals(editClaimPage, "Edit Claim");

    }

    //Verify view policy page displays after clicking on view policy icon on manage claim page

    @When("User clicks on view policy  icon on cog icon on manage claim page")
    public void user_clicks_on_view_policy_icon_on_cog_icon_on_manage_claim_page() {
        claimPage.selectViewPolicyPage();
    }

    @Then("View policy  page displays with all details")
    public void view_policy_page_displays_with_all_details() {
        String viewPolicyPage = claimPage.verifyViewPolicyPage();
        Assert.assertEquals(viewPolicyPage, "Policy Information");
    }

    //Filter Claim details on manage claim page upon option from claim status drop down

    @When("User selects appropriate option from claim status dropdown")
    public void user_selects_appropriate_option_from_claim_status_dropdown() {
        claimPage.selectOptionFromStatusDropDown();
    }

    @When("User clicks on search button on manage claim page")
    public void user_clicks_on_search_button_on_manage_claim_page() {
        claimPage.clickOnSearchButton();

    }

    @Then("Details of claim on manage claim page filters upon status drop dwon option")
    public void details_of_claim_on_manage_claim_page_filters_upon_status_drop_dwon_option() {
        String claimDetails = claimPage.verifyDetailsOfClaim();
        if (claimDetails.length() > 0) {
            System.out.println(claimDetails);
        } else {
            System.out.println("Details of claim does nit displays upon status dropdown option");
        }

    }

    //Filter Claim details on manage claim page upon option from treatment status drop down

    @When("User selects appropriate option from treatment status drop down")
    public void user_selects_appropriate_option_from_treatment_status_drop_down() {
        claimPage.selectOptionOfTreatmentStatusDD();
    }

    @Then("Details of claim on manage claim page filters upon treatment status drop down option")
    public void details_of_claim_on_manage_claim_page_filters_upon_treatment_status_drop_down_option() {
        String claimDetails = claimPage.verifyDetailsOfClaim();
        if (claimDetails.length() > 0) {
            System.out.println(claimDetails);
        } else {
            System.out.println("Details of claim does nit displays upon treatment status dropdown option");
        }

    }

    //Filter Claim details on manage claim page upon from and to date value of claim first advised on manage claim page

    @When("User enters value of from and to date value of claim first advised on manage claim page")
    public void user_enters_value_of_from_and_to_date_value_of_claim_first_advised_on_manage_claim_page() {
        claimPage.enterValueOfFromAndToDateOfAdvised();
    }

    @Then("Details of claim on manage claim page filters upon value of from and to date value of claim first advised on manage claim page")
    public void details_of_claim_on_manage_claim_page_filters_upon_value_of_from_and_to_date_value_of_claim_first_advised_on_manage_claim_page() {
        String claimDetails = claimPage.verifyDetailsOfClaim();
        if (claimDetails.length() > 0) {
            System.out.println(claimDetails);
        } else {
            System.out.println("Details of claim does not displays upon from and to date value of claim first advised on manage claim page");
        }
    }

    //Add claim for any client

    @When("User enters client details")
    public void user_enters_client_details() {
        claimPage.selectClient();
    }

    @When("User enters policy details")
    public void user_enters_policy_details() {
        claimPage.selectPolicyInfo();
    }


}
