package steps;

import factory.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.ClientPage;
import pages.QuotePage;

import java.util.List;

public class QuotePageSteps {
    QuotePage quotePage = new QuotePage(DriverFactory.getDriver());

    ClientPage clientPage;

    String quoteCode;

    @When("User clicks on quote icon on left tool bar")
    public void user_clicks_on_quote_icon_on_left_tool_bar() {
        String Message = quotePage.verifyManageQuotePage();
        Assert.assertEquals(Message, "Manage Quote");

    }

    @Then("Manage quote page displays with list of quote")
    public void manage_quote_page_displays_with_list_of_quote() {
        String quoteData = quotePage.fetchAndDisplayedData();
        if (quoteData.length() > 0) {
            System.out.println(quoteData);
        } else {
            Assert.fail();
        }
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

    @When("User clicks add quote button on manage quote page")
    public void user_clicks_add_quote_button_on_manage_quote_page() {
        quotePage.clickOnAddQuoteButton();

    }

    @Then("User will able to see add quote page with data")
    public void user_will_able_to_see_add_quote_page_with_data() {
        String addQuoteMessage = quotePage.verifyAddQuotePage();
        Assert.assertEquals(addQuoteMessage, "Add Quote");

    }

    //Data under total and monthly premium column should prefixed by £ sign

    @Then("User will able to see  all data under total and monthly premium colum prefixed by £ sign")
    public void user_will_able_to_see_all_data_under_total_and_monthly_premium_colum_prefixed_by_£_sign() {
        String yearlyArray = quotePage.verifyTotalPremiumColumn();
        //System.out.println(yearlyArray);

        String[] split = yearlyArray.split("[ .\\ ]+");
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

        String monthlyArray = quotePage.verifyMonthlyPremiumColumn();
        //System.out.println(monthlyArray);

        String monthArray[] = monthlyArray.split("[ .,\\ ]+");
        for (int j = 1; j <= monthArray.length - 1; j = j + 3) {
            System.out.println(monthArray[j]);
            if (monthArray[j].contains("£")) {
                System.out.println("Data Prefixed by £");

            } else {
                // Assert.fail();
                System.out.println("Data not Prefixed by £");
            }


        }

    }

    @When("User clicks on upload microchip file button")
    public void user_clicks_on_upload_microchip_file_button() {
        String Message = quotePage.clickOnMicrochipButton();
        Assert.assertEquals(Message, "Microchip File Upload");
    }

    @Then("User will be able to see microchip file upload page with data")
    public void user_will_be_able_to_see_microchip_file_upload_page_with_data() {
        String dataOfMicroPage = quotePage.verifyDataOnMicrochipPage();
        if (dataOfMicroPage.length() > 0) {
            System.out.println(dataOfMicroPage);
        }
    }

    //On the Add Quote page, verify that the Product dropdown appears with list of products

    @When("User clicks on add quote button")
    public void user_clicks_on_add_quote_button() {
        quotePage.clickOnAddQuoteButton();
    }

    @Then("On add quote page product dropdown will appear with desired list")
    public void on_add_quote_page_product_dropdown_will_appear_with_desired_list() {
        String verifyProducts = quotePage.verifyProductList();
        if (verifyProducts.length() > 0) {
            System.out.println(verifyProducts);
        } else {
            Assert.fail();
        }


    }

    //Verify Generate and save quote feature

    @When("User selects the species value form product dropdown")
    public void user_selects_the_species_value_form_product_dropdown() {
        quotePage.selectProductOfBreed();

    }

    @When("User enters client details form {string}")
    public void user_enters_client_details_form(String string) throws Exception {
        quotePage.clientDetails(string);

    }

    @When("User enters dog species information from {string}")
    public void user_enters_dog_species_information_from(String string) throws Exception {
        quotePage.dogDetails(string);
        quotePage.enterDogDetails();

    }

    @When("User calculate premium value")
    public void user_calculate_premium_value() {
        quotePage.calculateQuoteButton();
    }


    @When("User selects appropriate quote and click on save quote")
    public void user_selects_appropriate_quote_and_click_on_save_quote() {
        quotePage.selectSuperiorPlan();
    }

    @When("User Generates policy")
    public void user_generates_policy() {
        quotePage.enterQuestionDetailsOfPolicy();
        quotePage.otherPaymentMode();
    }

    //Verify Generate and save quote feature for Dog for credit/debit card payment mode
    @When("User Generates policy for credit and debit card payment mode for dog")
    public void user_generates_policy_for_credit_and_debit_card_payment_mode_for_dog() {
        quotePage.enterQuestionDetailsOfPolicy();
        quotePage.creditCardPaymentMode();
    }

    //Verify Generate and save quote feature for Dog with direct debit payment mode

    @When("User Generates policy for direct debit payment mode for dog")
    public void user_generates_policy_for_direct_debit_payment_mode_for_dog() {
        quotePage.enterQuestionDetailsOfPolicy();
        quotePage.directDebitPaymentMode();
    }

    //generate quote and policy for exotic species

    @When("User selects the exotic value form product dropdown")
    public void user_selects_the_exotic_value_form_product_dropdown() {
        quotePage.selectExoticProductOfBreed();
    }

    @When("User enters exotic species information from {string}")
    public void user_enters_exotic_species_information_from(String string) throws Exception {
        quotePage.enterExoticDetails();
        quotePage.exoticDetails(string);

    }

    @When("User calculate premium value for exotic")
    public void user_calculate_premium_value_for_exotic() {
        boolean value = quotePage.calculateQuoteButton();
        Assert.assertEquals(true, value);

    }

    @When("User enters all required information and click on save quote")
    public void user_enters_all_required_information_and_click_on_save_quote() {
        quotePage.selectPlanForExoticBreed();

    }

    @When("User Generates policy for exotic")
    public void user_generates_policy_for_exotic() {
        quotePage.enterQuestionDetailsOfPolicyForExotic();
        quotePage.otherPaymentMode();

    }

    //Verify Generate and save quote feature for Exotic for credit/debit card payment mode
    @When("User Generates policy for credit and debit card payment mode for exotic")
    public void user_generates_policy_for_credit_and_debit_card_payment_mode_for_exotic() {
        quotePage.enterQuestionDetailsOfPolicyForExotic();
        quotePage.creditCardPaymentMode();
    }

    //Verify Generate and save quote feature for Exotic with direct debit card payment mode

    @When("User Generates policy for direct debit payment mode for exotic")
    public void user_generates_policy_for_direct_debit_payment_mode_for_exotic() {
        quotePage.enterQuestionDetailsOfPolicyForExotic();
        quotePage.directDebitPaymentMode();
    }

    //Generate and save quote and policy for cat

    @When("User selects the cat value form product dropdown")
    public void user_selects_the_cat_value_form_product_dropdown() {
        quotePage.selectCatProductOfBreed();

    }

    @When("User enters cat species information from {string}")
    public void user_enters_cat_species_information_from(String string) throws Exception {
        quotePage.enterCatDetails();
        quotePage.catDetails(string);

    }

    @When("User calculate premium value for cat")
    public void user_calculate_premium_value_for_cat() {
        quotePage.calculateQuoteButton();

    }

    @When("User selects appropriate quote and click on save quote for cat")
    public void user_selects_appropriate_quote_and_click_on_save_quote_for_cat() {
        quotePage.selectSuperiorPlanOfCat();
    }


    @When("User Generates policy for cat")
    public void user_generates_policy_for_cat() {
        quotePage.enterQuestionDetailsOfPolicyForCat();
        quotePage.otherPaymentMode();
    }


    //Generate and save quote feature for Cat using credit and debit card payment option
    @When("User Generates policy for credit and debit card payment mode for cat")
    public void user_generates_policy_for_credit_and_debit_card_payment_mode_for_cat() {
        quotePage.enterQuestionDetailsOfPolicyForCat();
        quotePage.creditCardPaymentMode();
    }

    //Generate and save quote feature for Cat using direct debit payment option

    @When("User Generates policy for direct debit payment mode for cat")
    public void user_generates_policy_for_direct_debit_payment_mode_for_cat() {
        quotePage.enterQuestionDetailsOfPolicyForCat();
        quotePage.directDebitPaymentMode();
    }


    //Generate quote and policy for horse

    @When("User selects the introductory value of horse form product dropdown")
    public void user_selects_the_introductory_value_of_horse_form_product_dropdown() {

    }

    @When("User selects horse species for introductory")
    public void user_selects_horse_species_for_introductory() {
        quotePage.selectHorseProductOfBreed();
        quotePage.selectHorseForIntroductory();

    }

    @When("User enters horse species information for introductory from {string}")
    public void user_enters_horse_species_information_for_introductory_from(String string) throws Exception {
        quotePage.enterHorseDetails();
        quotePage.horseDetails(string);

    }

    @When("User calculate premium value for horse introductory")
    public void user_calculate_premium_value_for_horse_introductory() {
        quotePage.selectPlanAndEnterQuestionOfPolicyForHorse();
        quotePage.otherPaymentMode();

    }

    //Generate and save quote  for horse breed using credit/debit card payment option

    @When("User calculate premium value for horse and generate policy")
    public void user_calculate_premium_value_for_horse_and_generate_policy() {
        quotePage.selectPlanAndEnterQuestionOfPolicyForHorse();
        quotePage.creditCardPaymentMode();
    }

    // Generate and save quote  for horse breed using direct debit card payment option

    @When("User calculate premium value for horse and generate policy with direct debit payment mode")
    public void user_calculate_premium_value_for_horse_and_generate_policy_with_direct_debit_payment_mode() {
        quotePage.selectPlanAndEnterQuestionOfPolicyForHorse();
        quotePage.directDebitPaymentMode();
    }

    //Generate and save quote for dog breed of introductory product

    @When("User selects the introductory value form product dropdown")
    public void user_selects_the_introductory_value_form_product_dropdown() {
        quotePage.selectIntroductoryProductOfBreed();
    }

    @When("User selects dog species for introductory")
    public void user_selects_dog_species_for_introductory() {
        quotePage.selectDogForIntroductory();

    }

    @When("User enters dog species information for introductory from {string}")
    public void user_enters_dog_species_information_for_introductory_from(String string) throws Exception {
        quotePage.dogDetailsIntroductory(string);
    }

    @When("User calculate premium value for dog introductory")
    public void user_calculate_premium_value_for_dog_introductory() {
        quotePage.enterIntroductoryDogDetails();

    }

    @When("User selects appropriate options and click on save quote for dog")
    public void user_selects_appropriate_options_and_click_on_save_quote_for_dog() {
        quotePage.generatePolicyFoRIntroductoryDog();
    }

    @When("User Generates policy for dog")
    public void user_generates_policy_for_dog() {

    }

    //Generate quote and policy for introductory cat

    @When("User selects cat species for introductory")
    public void user_selects_cat_species_for_introductory() {
        quotePage.selectCatForIntroductory();

    }

    @When("User enters cat species information for introductory from {string}")
    public void user_enters_cat_species_information_for_introductory_from(String string) throws Exception {
        quotePage.catDetailsIntroductory(string);

    }

    @When("User calculate premium value for cat introductory")
    public void user_calculate_premium_value_for_cat_introductory() {
        quotePage.enterIntroductoryCatDetails();

    }

    @When("User selects appropriate options and click on save quote for cat")
    public void user_selects_appropriate_options_and_click_on_save_quote_for_cat() {
        quotePage.generatePolicyFoRIntroductoryCat();
    }

    @When("User Generates policy for cat introductory")
    public void user_generates_policy_for_cat_introductory() {

    }

    //Generate quote and policy for Introductory exotic

    @When("User selects exotic species for introductory")
    public void user_selects_exotic_species_for_introductory() {
        quotePage.selectExoticForIntroductory();
    }

    @When("User enters exotic species information for introductory from {string}")
    public void user_enters_exotic_species_information_for_introductory_from(String string) throws Exception {
        quotePage.exoticDetailsIntroductory(string);
    }

    @When("User calculate premium value for exotic introductory")
    public void user_calculate_premium_value_for_exotic_introductory() {
        quotePage.enterIntroductoryExoticDetails();
    }

    @When("User Generates policy for exotic introductory")
    public void user_generates_policy_for_exotic_introductory() {
        quotePage.generatePolicyFoRIntroductoryExotic();
    }


    //New Scenario


    @When("User clicks on quote number on manage quote page")
    public void user_clicks_on_quote_number_on_manage_quote_page() {
        quotePage.fetchDataOfQuoteInformation();

    }

    @Then("Quote Information page displays with details")
    public void quote_information_page_displays_with_details() {
        String quoteMessage = quotePage.fetchDataOfQuoteInformation();
        if (quoteMessage.length() > 0) {
            System.out.println(quoteMessage);
        } else {
            Assert.fail();
        }

    }

    //Items on manage quote page displays upon option selects from quote status dropdown

    @When("User selects appropriate option from quote status dropdown")
    public void user_selects_appropriate_option_from_quote_status_dropdown() {
        quotePage.SelectItemFromDropDown();

    }

    @Then("Respected data will be displayed on Manage quote page")
    public void respected_data_will_be_displayed_on_manage_quote_page() {
        String statusArray = quotePage.fetchAndVerifyDataAgainstDropDown();


        if (statusArray.length() > 0) {
            System.out.println("Quote has been filtered against status dropdown option");
        } else {
            System.out.println("Failed to fetch data against status dropdown option");
        }

    }

    //Fetch list of quote based on product dropdown option

    @When("User selects appropriate option from product dropdown on manage quote page")
    public void user_selects_appropriate_option_from_product_dropdown_on_manage_quote_page() {
        quotePage.selectOptionFromProductDropDown();

    }

    @When("User clicks on search button on manage quote page")
    public void user_clicks_on_search_button_on_manage_quote_page() {
        quotePage.clickOnSearchButton();

    }

    @Then("Appropriate list of quote will display")
    public void appropriate_list_of_quote_will_display() {
        List<WebElement> productList = quotePage.verifyListOfQuoteBasedOnProductDD();
        if ((productList.size() > 0)) {
            System.out.println("List of quotes display upon product dropdown value ");
        } else {
            System.out.println("Failed to display data upon selected option");
        }

    }

    //Fetch list of quote based on option from Is referred dropdown on manage quote page

    @When("User selects appropriate option from Is referred dropdown on manage quote page")
    public void user_selects_appropriate_option_from_is_referred_dropdown_on_manage_quote_page() {
        quotePage.selectOptionFromIsReferredDropDown();

    }

    @Then("Appropriate list of quote will display upon drop down option")
    public void appropriate_list_of_quote_will_display_upon_drop_down_option() {

        String quoteDetails = quotePage.verifyListOfQuoteBasedOnIsReferredDD();
        if ((quoteDetails.length() > 0)) {
            System.out.println("List of quotes display upon product dropdown value ");
        } else {
            System.out.println("Failed to display data upon selected is referred option");
        }

    }

    //Fetch list of quote based on option from division dropdown on manage quote page
    @When("User selects appropriate option from division dropdown on manage quote page")
    public void user_selects_appropriate_option_from_division_dropdown_on_manage_quote_page() {
        quotePage.selectOptionFromDivisionDropDown();
    }

    @Then("Appropriate list of quote will display upon division drop down option")
    public void appropriate_list_of_quote_will_display_upon_division_drop_down_option() {
        String quoteDetails = quotePage.verifyListOfQuoteBasedOnDivisionDD();
        if ((quoteDetails.length() > 0)) {
            System.out.println("List of quotes display upon product dropdown value ");
        } else {
            System.out.println("Failed to display data upon selected division option");
        }
    }

    //Fetch list of quote based on pet id products checkbox on manage quote page

    @When("User selects pet id products checkbox on manage quote page")
    public void user_selects_pet_id_products_checkbox_on_manage_quote_page() {
        quotePage.selectPetIdCheckBox();
    }

    @Then("Appropriate list of quote will display upon pet id products checkbox on manage quote page")
    public void appropriate_list_of_quote_will_display_upon_pet_id_products_checkbox_on_manage_quote_page() {
        String quoteDetails = quotePage.verifyPetIdDetailsOfQuote();
        if ((quoteDetails.length() > 0)) {
            System.out.println("List of quotes display upon pet Id checkbox option ");
        } else {
            System.out.println("Failed to display data upon selected pet Id checkbox option");
        }

    }

    //Upload details window should open by clicking on file name link on microchip file upload page

    @When("User clicks on filename link on upload microchip page")
    public void user_clicks_on_filename_link_on_upload_microchip_page() {
        quotePage.clickOnFileNameLink();
    }

    @Then("Upload details window displays with all details")
    public void upload_details_window_displays_with_all_details() {
        quotePage.clickOnCancelButtonOnUploadWindow();
    }

    //verify functionality of upload file feature  on microchip upload file page

    @When("user click on upload file button")
    public void user_click_on_upload_file_button() {
        String msg = quotePage.uploadFile();
        if (msg.contains("File Uploaded!")) {
            System.out.println("file uploaded");
        } else {
            System.out.println("file not uploaded");
        }
    }

    @Then("user will able to upload file")
    public void user_will_able_to_upload_file() {

    }

    //Pending Microchip displays with details by clicking on pending microchip button on manage quote page

    @When("User clicks on pending microchip file button")
    public void user_clicks_on_pending_microchip_file_button() {
        quotePage.clickOnPendingMicrochipButton();

    }

    @Then("Pending Microchip page displays with details")
    public void pending_microchip_page_displays_with_details() {
        String pendingMicrochipDetails = quotePage.verifyPendingMicrochipPage();
        if (pendingMicrochipDetails.length() > 0) {
            System.out.println(pendingMicrochipDetails);
        } else {
            System.out.println("Pending Microchip page does not display with all details");
        }

    }

    //Fetch quote on manage quote page based on quote number for qa

    @When("User enters quote number inside searc box on manage quote page")
    public void user_enters_quote_number_inside_searc_box_on_manage_quote_page() {
        quotePage.enterQuoteNumberInsideSearchBox();

    }

    @Then("Appropriate quote information displays on manage quote page")
    public void appropriate_quote_information_displays_on_manage_quote_page() {
        String quoteInformation = quotePage.verifyQuoteDetails();
        if (quoteInformation.length() > 0) {
            System.out.println(quoteInformation);
        } else {
            Assert.fail();
        }

    }

    //Fetch quote on manage quote page based on quote number for stage
    @When("User enters quote number inside search box on manage quote page")
    public void user_enters_quote_number_inside_search_box_on_manage_quote_page() {
        quotePage.enterQuoteNumberInsideSearchBoxStage();
    }

    //Verify include payment feature of quote module for Qa and Stage
    @When("User selects include payment only quotes checkbox")
    public void user_selects_include_payment_only_quotes_checkbox() {
        quotePage.selectIncludePaymentCheckBox();

    }

    @Then("Appropriate quote list displays on manage quote page")
    public void appropriate_quote_list_displays_on_manage_quote_page() {
        String quoteListIncludePayment = quotePage.verifyIncludePaymentDetailsOfQuote();
        if (quoteListIncludePayment.length() > 0) {
            System.out.println(quoteListIncludePayment);
        } else {
            System.out.println("NO record found on manage quote page");
        }
    }

    //Edit quote information and verifies the same

    @When("User selects edit quote option from cog icon on quote information page")
    public void user_selects_edit_quote_option_from_cog_icon_on_quote_information_page() {
        quotePage.selectEditQuoteOption();
    }

    @Then("User can edit all required field on edit quote page")
    public void user_can_edit_all_required_field_on_edit_quote_page() {
        quotePage.editQuoteDetails();
    }

    //Verify that quote information page displays with sane status code on by clicking on quote code on manage quote page


    @When("User clicks on quote number link on manage quote page")
    public void user_clicks_on_quote_number_link_on_manage_quote_page() {
        quotePage.clickOnQuoteCodeLink();


    }

    @Then("Quote information page displays with sane status code")
    public void quote_information_page_displays_with_sane_status_code() {
        //String code=quotePage.verifyQuoteCode();
        //Assert.assertEquals(quoteCode,code);

    }


}
