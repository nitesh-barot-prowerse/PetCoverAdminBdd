package steps;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.AdminPage;

public class AdminPageSteps {
    AdminPage adminPage = new AdminPage(DriverFactory.getDriver());

    @When("User clicks on administration icon on left tool bar")
    public void user_clicks_on_administration_icon_on_left_tool_bar() {
        adminPage.clickAdminIcon();

    }

    @When("User clicks on letter template icon on administration page")
    public void user_clicks_on_letter_template_icon_on_administration_page() {
        adminPage.clickOnLetterIcon();
    }

    @Then("User will able to see list of existing letters")
    public void user_will_able_to_see_list_of_existing_letters() {
        String data = adminPage.fetchData();
        System.out.println(data);
    }

    @When("User clicks on edit icon against letter letter template name in list")
    public void user_clicks_on_edit_icon_against_letter_letter_template_name_in_list() {
        adminPage.clickOnAddLetterTemplateIcon();

    }

    @Then("User will redirects to edit letter template page")
    public void user_will_redirects_to_edit_letter_template_page() {
        String Message = adminPage.displayedMessage();
        Assert.assertEquals(Message, "Edit Letter Template");
    }

    @Then("User will able to edit available fields on page")
    public void user_will_able_to_edit_available_fields_on_page() {
        adminPage.editData();

    }

    @Then("Account page displays with icons and corresponding page displays by clicking on icon.")
    public void account_page_displays_with_icons_and_corresponding_page_displays_by_clicking_on_icon() {
        adminPage.traversingThroughPages();

    }

    @When("User clicks on product icon administration page")
    public void user_clicks_on_product_icon_administration_page() {
        adminPage.clickOnProductIcon();

    }

    @When("User clicks on product code on manage product page")
    public void user_clicks_on_product_code_on_manage_product_page() {
        adminPage.clickOnProductCode();
    }

    @Then("View product page displays with all product details")
    public void view_product_page_displays_with_all_product_details() {
        String productCode = adminPage.verifyProductDetails();
        System.out.println(productCode);
    }

    @When("User clicks on insurer configuration icon")
    public void user_clicks_on_insurer_configuration_icon() {
        adminPage.clickOnInsurerConfigIcon();

    }

    @Then("Insurer configuration displays with all details")
    public void insurer_configuration_displays_with_all_details() {
        String insurerDetail = adminPage.fetchInsurerPageData();
        System.out.println(insurerDetail);

    }

    @When("User clicks on agent configuration icon")
    public void user_clicks_on_agent_configuration_icon() {
        adminPage.clickOnAgentConfigIcon();

    }

    @Then("Agent configuration displays with all details")
    public void agent_configuration_displays_with_all_details() {
        //String agentDetail=adminPage.fetchAgentConfigData();
        //System.out.println(agentDetail);
    }

    @When("User clicks on department icon on administrator page")
    public void user_clicks_on_department_icon_on_administrator_page() {
        adminPage.clickDepartmentIcon();

    }

    @When("User enters department value in to search input on manage department page")
    public void user_enters_department_value_in_to_search_input_on_manage_department_page() {
        adminPage.enterDepartmentInSearch();

    }

    @When("User clicks on search button on manage department page")
    public void user_clicks_on_search_button_on_manage_department_page() {
        adminPage.clickSearchButton();

    }

    @Then("Respected data upon department value will display on manage department page")
    public void respected_data_upon_department_value_will_display_on_manage_department_page() {
        String department = adminPage.verifyDepartmentName();
        if (department.contains("Inbound")) {
            System.out.println("required data has displayed");
        } else {
            Assert.fail();
        }

    }

    @When("User clicks on bank account icon")
    public void user_clicks_on_bank_account_icon() {
        adminPage.clickOnBankAccountIcon();
    }

    @Then("Manage bank account page displays with all details")
    public void manage_bank_account_page_displays_with_all_details() {
        String bankDetails = adminPage.fetchAndDisplayBankAccountData();
        System.out.println(bankDetails);

    }

    @When("User clicks on bank icon on administration page")
    public void user_clicks_on_bank_icon_on_administration_page() {
        adminPage.clickOnBankAccountIcon();

    }

    @When("User selects any item from bank account drop down")
    public void user_selects_any_item_from_bank_account_drop_down() {
        adminPage.selectItemFromBankDropDown();
    }

    @When("User selects any item from insurer drop down")
    public void user_selects_any_item_from_insurer_drop_down() {
        adminPage.selectItemFromInsurerDropDown();

    }


    @When("User clicks on search button on manage bank account page")
    public void user_clicks_on_search_button_on_manage_bank_account_page() {
        adminPage.clickSearchButton();

    }

    @Then("User will find respected data under bank detail table")
    public void user_will_find_respected_data_under_bank_detail_table() {
        String bankInformation = adminPage.verifyBankAccountDetails();
        System.out.println(bankInformation);

    }

    @When("User clicks on add bank account icon on manage bank account page")
    public void user_clicks_on_add_bank_account_icon_on_manage_bank_account_page() {
        adminPage.clickOnAddBankAccountIcon();

    }

    @Then("Add bank account page displays with all details")
    public void add_bank_account_page_displays_with_all_details() {
        String Message = adminPage.verifyAddBankAccountPage();
        Assert.assertEquals(Message, "Bank Account Details");

    }

    @When("User clicks on edit icon against insurer name on manage bank account page")
    public void user_clicks_on_edit_icon_against_insurer_name_on_manage_bank_account_page() {
        adminPage.clickOnEditIconOfInsurer();

    }

    @Then("Edit Bank account page displays with all fields in editable format")
    public void edit_bank_account_page_displays_with_all_fields_in_editable_format() {
        adminPage.editDataOfEditBankAccountPage();

    }

    @When("User clicks on insurer icon on administration page")
    public void user_clicks_on_insurer_icon_on_administration_page() {
        adminPage.clickOnInsurerIcon();

    }

    @Then("Manage insurer page will displays with all details")
    public void manage_insurer_page_will_displays_with_all_details() {
        String message = adminPage.verifyManageInsurerPage();
        Assert.assertEquals(message, "Manage Insurer");

    }

    @When("User clicks on insurerCode link on manage insurer page")
    public void user_clicks_on_insurer_code_link_on_manage_insurer_page() {
        adminPage.clickOnInsurerCodeLink();

    }

    @Then("View insurer page displays with current insurer details")
    public void view_insurer_page_displays_with_current_insurer_details() {
        String message = adminPage.verifyViewInsurerPage();
        Assert.assertEquals(message, "Insurer - AL01");

    }

    @When("User selects appropriate options from Type,Category and Active drop down")
    public void user_selects_appropriate_options_from_type_category_and_active_drop_down() {
        adminPage.selectsOptionFromDropDownOnManageInsurerPage();

    }

    @Then("On manage insurer page list of data reflects upon drop downs values")
    public void on_manage_insurer_page_list_of_data_reflects_upon_drop_downs_values() {
        String verifyManageInsurerList = adminPage.verifyListOfManageInsurerPageUponDD();
        System.out.println(verifyManageInsurerList);

    }

    @When("User clicks on add insurer icon on manage insurer page")
    public void user_clicks_on_add_insurer_icon_on_manage_insurer_page() {
        adminPage.clickOnAddInsurerIcon();

    }

    @Then("Add insurer page displays with all fields")
    public void add_insurer_page_displays_with_all_fields() {
        String message = adminPage.verifyAddInsurerPage();
        Assert.assertEquals(message, "Add Insurer");

    }

    @When("User clicks on agent icon")
    public void user_clicks_on_agent_icon() {
        adminPage.clickOnAgentIcon();

    }

    @When("User clicks on agent reference number under list of agent details")
    public void user_clicks_on_agent_reference_number_under_list_of_agent_details() {
     adminPage.clickOnAgentReferenceNumber();
    }

    @Then("View agent page displays with all information")
    public void view_agent_page_displays_with_all_information() {
       String message=adminPage.verifyViewAgentPage();
       Assert.assertEquals(message,"View Agent");

    }

    @When("User clicks on company icon")
    public void user_clicks_on_company_icon() {
        adminPage.clickOnCompanyIcon();

    }

    @Then("Manage company page displays with list of available companies")
    public void manage_company_page_displays_with_list_of_available_companies() {
        String companyDetail=adminPage.fetchAndDisplaysManageCompanyDetails();
        System.out.println(companyDetail);

    }


}
