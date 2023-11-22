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


    //To verify whether View Product page displays with product details with status after by clicking on product code on manage product page

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
        if (productCode.length() > 0) {
            System.out.println(productCode);
        } else {
            System.out.println("Product Page Failed To Launch");
        }
    }

    //To verify if insurer pop up windows displays by  clicking on insurer configuration pop up on setting icon on manage product

    @When("User clicks on insurer configuration icon")
    public void user_clicks_on_insurer_configuration_icon() {
        adminPage.clickOnInsurerConfigIcon();

    }

    @Then("Insurer configuration displays with all details")
    public void insurer_configuration_displays_with_all_details() {
        String insurerDetail = adminPage.fetchInsurerPageData();
        if (insurerDetail.length() > 0) {
            System.out.println(insurerDetail);
        } else {
            System.out.println("Insurer Configuration window failed To Launch");
        }


    }
    //To verify if agent configuration pop up windows displays by  clicking on agent configuration on setting icon on manage product page

    @When("User clicks on agent configuration icon")
    public void user_clicks_on_agent_configuration_icon() {
        adminPage.clickOnAgentConfigIcon();

    }

    @Then("Agent configuration displays with all details")
    public void agent_configuration_displays_with_all_details() {
        String agentDetail = adminPage.fetchAgentConfigData();
        if (agentDetail.length() > 0) {
            System.out.println(agentDetail);
        } else {
            System.out.println("Agent Configuration window failed To Launch");
        }

    }

    //Department
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

    //Add department page  displays will all details when user clicks on add department icon on manage department page
    @When("User clicks on add department icon on manage department page")
    public void user_clicks_on_add_department_icon_on_manage_department_page() {
        adminPage.clickOnAddDepartmentIcon();

    }

    @Then("Add department page displays with all details")
    public void add_department_page_displays_with_all_details() {
        String department = adminPage.verifyAddDepartmentPage();
        Assert.assertEquals(department, "Add Department");
    }

    //Edit department page displays upon clicking on edit icon against department name inside list of department on manage department page

    @When("User clicks on edit icon against department name on manage department page")
    public void user_clicks_on_edit_icon_against_department_name_on_manage_department_page() {
        adminPage.clickOnEditDepartmentIcon();

    }

    @Then("Edit department page displays in editable format")
    public void edit_department_page_displays_in_editable_format() {
        String editDepartmentPage = adminPage.verifyEditDepartmentPage();
        Assert.assertEquals(editDepartmentPage, "Edit Department");

    }

    //Filter data of staff details upon department and active drop down options on manage staff  page
    @When("User clicks on staff icon on administrator page")
    public void user_clicks_on_staff_icon_on_administrator_page() {
        adminPage.clickOnStaffIcon();

    }

    @When("User selects options from department and active dropdown")
    public void user_selects_options_from_department_and_active_dropdown() {
        adminPage.selectOptionFromDropDownOnStaffPage();

    }

    @Then("List of staff details filtered upon options")
    public void list_of_staff_details_filtered_upon_options() {
        String staffDetails = adminPage.verifyDetailsOfStaffPage();
        if (staffDetails.length() > 0) {
            System.out.println(staffDetails);
        } else {
            System.out.println("Staff Detail page does not displays with all details");
        }

    }

    //Add staff page displays with all details upon clicking on add staff icon on manage staff page
    @When("User clicks on add staff icon on manage staff page")
    public void user_clicks_on_add_staff_icon_on_manage_staff_page() {
        adminPage.clickOnAddStaffButton();
    }

    @Then("Add staff page displays with all details")
    public void add_staff_page_displays_with_all_details() {
        String Message = adminPage.verifyAddStaffPage();
        Assert.assertEquals(Message, "Add Staff");

    }

    //Edit staff page displays upon clicking on edit icon against staff name inside list of staff on manage staff page
    @When("User clicks on edit icon against staff name on manage staff page")
    public void user_clicks_on_edit_icon_against_staff_name_on_manage_staff_page() {
        adminPage.clickOnEditStaffIcon();

    }

    @Then("Edit staff page displays in editable format")
    public void edit_staff_page_displays_in_editable_format() {

        String Message = adminPage.verifyEditStaffPage();
        Assert.assertEquals(Message, "Edit Staff");

    }


    //Manage Bank Account page displays with all details by clicking on bank account icon on administration page

    @When("User clicks on bank account icon")
    public void user_clicks_on_bank_account_icon() {
        adminPage.clickOnBankAccountIcon();
    }

    @Then("Manage bank account page displays with all details")
    public void manage_bank_account_page_displays_with_all_details() {
        String bankDetails = adminPage.fetchAndDisplayBankAccountData();
        if (bankDetails.length() > 0) {
            System.out.println(bankDetails);
        } else {
            System.out.println("Bank Detail page does not displays with all details");
        }

    }


    //Filter data of bank details upon bank account and insurer drop down items on manage bank account page
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
        adminPage.clickOnSearchButton();

    }

    @Then("User will find respected data under bank detail table")
    public void user_will_find_respected_data_under_bank_detail_table() {
        String bankInformation = adminPage.verifyBankAccountDetails();
        if (bankInformation.length() > 0) {
            System.out.println(bankInformation);
        } else {
            System.out.println("Bank Details does not displays upon selecting options from drop down");
        }

    }

    //Add Bank account page displays with details after clicking on add bank account button on manage bank account page

    @When("User clicks on add bank account icon on manage bank account page")
    public void user_clicks_on_add_bank_account_icon_on_manage_bank_account_page() {
        adminPage.clickOnAddBankAccountIcon();

    }

    @Then("Add bank account page displays with all details")
    public void add_bank_account_page_displays_with_all_details() {
        String Message = adminPage.verifyAddBankAccountPage();
        Assert.assertEquals(Message, "Bank Account Details");

    }
    // On the manage bank account page click the Edit icon against a insurer name. The Edit Bank Account page should open with the  data in editable format.

    @When("User clicks on edit icon against insurer name on manage bank account page")
    public void user_clicks_on_edit_icon_against_insurer_name_on_manage_bank_account_page() {
        adminPage.clickOnEditIconOfInsurer();

    }

    @Then("Edit Bank account page displays with all fields in editable format")
    public void edit_bank_account_page_displays_with_all_fields_in_editable_format() {
        adminPage.editDataOfEditBankAccountPage();

    }

    //Manage insurer page will displays with all details by clicking on insurer icon on Administrator page
    @When("User clicks on insurer icon on administration page")
    public void user_clicks_on_insurer_icon_on_administration_page() {
        adminPage.clickOnInsurerIcon();

    }

    @Then("Manage insurer page will displays with all details")
    public void manage_insurer_page_will_displays_with_all_details() {
        String insurerDetails = adminPage.verifyManageInsurerPage();
        if (insurerDetails.length() > 0) {
            System.out.println(insurerDetails);
        } else {
            System.out.println("Insurer details does not displays");
        }

    }

    //View Insurer page displays with all insurer details after clicking on insurer code link on manage insurer page

    @When("User clicks on insurerCode link on manage insurer page")
    public void user_clicks_on_insurer_code_link_on_manage_insurer_page() {
        adminPage.clickOnInsurerCodeLink();

    }

    @Then("View insurer page displays with current insurer details")
    public void view_insurer_page_displays_with_current_insurer_details() {
        String data = adminPage.verifyViewInsurerPage();
        if (data.length() > 0) {
            System.out.println(data);
        } else {
            System.out.println("View Insurer Page Doest Not Displays");
        }

    }

    //On Manage insurer page list of data has filtered and displayed upon value of Type,Category,and Active drop down

    @When("User selects appropriate options from Type,Category and Active drop down")
    public void user_selects_appropriate_options_from_type_category_and_active_drop_down() {
        adminPage.selectsOptionFromDropDownOnManageInsurerPage();

    }

    @Then("On manage insurer page list of data reflects upon drop downs values")
    public void on_manage_insurer_page_list_of_data_reflects_upon_drop_downs_values() {
        String verifyManageInsurerList = adminPage.verifyListOfManageInsurerPageUponDD();
        if (verifyManageInsurerList.length() > 0) {
            System.out.println(verifyManageInsurerList);
        } else {
            System.out.println("No Record Found Through Filtering");
        }


    }

    //Add insurer page displays with all fields by clicking on add insurer icon on manage insurer page

    @When("User clicks on add insurer icon on manage insurer page")
    public void user_clicks_on_add_insurer_icon_on_manage_insurer_page() {
        adminPage.clickOnAddInsurerIcon();

    }

    @Then("Add insurer page displays with all fields")
    public void add_insurer_page_displays_with_all_fields() {
        String message = adminPage.verifyAddInsurerPage();
        Assert.assertEquals(message, "Add Insurer");

    }

    //Edit insurer page displays in editable format by clicking on edit icon against insurer code on manage insurer page
    @When("User clicks on edit icon against insurer code on manage insurer page")
    public void user_clicks_on_edit_icon_against_insurer_code_on_manage_insurer_page() {
        adminPage.clickOnEditInsurerIcon();
    }

    @Then("Edit insurer page displays in editable format")
    public void edit_insurer_page_displays_in_editable_format() {
        String message = adminPage.verifyEditInsurerPage();
        Assert.assertEquals(message, "Edit Insurer");
    }

    //View Agent page displays with all details by clicking on agent reference number on Manage agent page

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
        String message = adminPage.verifyViewAgentPage();
        Assert.assertEquals(message, "View Agent");

    }

    // Filter details on manage agent page upon option of category,type and active drop down
    @When("User Selects appropriate option from category,type and active drop down")
    public void user_selects_appropriate_option_from_category_type_and_active_drop_down() {
        adminPage.selectOptionFromDropDownOnManageAgentPage();

    }

    @When("User clicks on search button on manage agent page")
    public void user_clicks_on_search_button_on_manage_agent_page() {
        adminPage.clickOnButtonOnManageAgentPage();


    }

    @Then("Appropriate agent details displays on manage agent page")
    public void appropriate_agent_details_displays_on_manage_agent_page() {
        String agentDetails = adminPage.verifyDetailsOfAgentList();
        if (agentDetails.length() > 0) {
            System.out.println(agentDetails);
        } else {
            System.out.println("No Record Found Through Filtering on Manage Agent Page ");
        }

    }

    //Add agent page displays with all details by clicking on add agent button on manage agent page
    @When("User clicks on add agent button on manage agent page")
    public void user_clicks_on_add_agent_button_on_manage_agent_page() {
        adminPage.clickOnAddAgentButton();

    }

    @Then("Add agent page displays with all details")
    public void add_agent_page_displays_with_all_details() {
        String addAgentPage = adminPage.verifyAddAgentPage();
        Assert.assertEquals(addAgentPage, "Add Agent");
    }

    //Edit Agent page displays in editable format by selecting edit icon from cog icon dropdown against agent reference number on manage agent page
    @When("User selects edit icon from cog icon dropdown against agent reference number on manage agent page")
    public void user_selects_edit_icon_from_cog_icon_dropdown_against_agent_reference_number_on_manage_agent_page() {
        adminPage.clickOnEditAgentIcon();

    }

    @Then("Edit agent page displays in editable format")
    public void edit_agent_page_displays_in_editable_format() {
        String editAgentPage = adminPage.verifyEditAgentPage();
        Assert.assertEquals(editAgentPage, "Edit Agent");
    }

    //Manage Company page displays with list of companies by clicking on company icon on administration page

    @When("User clicks on company icon")
    public void user_clicks_on_company_icon() {
        adminPage.clickOnCompanyIcon();

    }

    @Then("Manage company page displays with list of available companies")
    public void manage_company_page_displays_with_list_of_available_companies() {
        String companyDetail = adminPage.fetchAndDisplaysManageCompanyDetails();
        if (companyDetail.length() > 0) {
            System.out.println(companyDetail);
        } else {
            System.out.println("Company detail page does not displays");
        }


    }

    //Filter details on manage company page upon option of state and country drop down
    @When("User selects options from state and country drop down")
    public void user_selects_options_from_state_and_country_drop_down() {
        adminPage.selectOptionsFromDropDownOnManageCompany();

    }


    @Then("Appropriate list of company displays on manage company page")
    public void appropriate_list_of_company_displays_on_manage_company_page() {
        String companyList = adminPage.verifyDetailsOfCompany();
        if (companyList.length() > 0) {
            System.out.println(companyList);
        } else {
            System.out.println("List of company do not fount as per option of drop down on manage company page");
        }

    }

    //Add company page displays with all details by clicking on add company button on manage company page

    @When("User clicks on add company button on manage company page")
    public void user_clicks_on_add_company_button_on_manage_company_page() {
        adminPage.clickOnAddCompanyButton();

    }

    @Then("Add company page displays with all details")
    public void add_company_page_displays_with_all_details() {
        String addCompanyPage = adminPage.verifyAddCompanyPage();
        Assert.assertEquals(addCompanyPage, "Add Company");

    }



}
