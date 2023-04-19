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
     String Message=adminPage.displayedMessage();
     Assert.assertEquals(Message,"Edit Letter Template");
    }

    @Then("User will able to edit available fields on page")
    public void user_will_able_to_edit_available_fields_on_page() {
        adminPage.editData();

    }

    @Then("Account page displays with icons and corresponding page displays by clicking on icon.")
    public void account_page_displays_with_icons_and_corresponding_page_displays_by_clicking_on_icon() {
        adminPage.traversingThroughPages();

    }





}
