package steps;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.TaskPage;

public class TaskPageSteps {
    TaskPage taskPage = new TaskPage(DriverFactory.getDriver());

    @When("User clicks on task icon on left tool bar")
    public void user_clicks_on_task_icon_on_left_tool_bar() {
        taskPage.clickOnTaskIcon();

    }

    @Then("User redirects to {string} page")
    public void user_redirects_to_page(String string) {
        String Message = taskPage.verifyTaskPage();
        Assert.assertEquals(Message, string);
    }

    @Then("User see concern data on manage task page")
    public void user_see_concern_data_on_manage_task_page() {
        String pageData = taskPage.fetchData();
        if (pageData.length() > 0) {
            System.out.println(pageData);
        } else {
            Assert.fail();
        }

    }

    //To check whether Assign to dropdown on add task page appears with current user after clicking on add task button on add task page

    @When("user clicks on add task button")
    public void user_clicks_on_add_task_button() {
        taskPage.clickAddTaskButton();

    }

    @Then("User redirects to page with {string} message")
    public void user_redirects_to_page_with_message(String string) {
        String Message = taskPage.verifyAddTaskPage();
        Assert.assertEquals(Message, string);
    }

    @Then("Assigned to dropdown appears with initial current user")
    public void assigned_to_dropdown_appears_with_initial_current_user() {
        String userName = taskPage.verifyDropDown();
        if (userName.length() > 0) {
            System.out.println(userName);
        } else {
            Assert.fail();
        }
    }

    //Appropriate data should display upon selecting an option from the status drop down on managing task page

    @When("User Selects any option from status dropdown on manage task page")
    public void user_selects_any_option_from_status_dropdown_on_manage_task_page() {
        taskPage.selectOptionFromStatus();

    }

    @Then("Status tage of manage task data displays accordingly")
    public void status_tage_of_manage_task_data_displays_accordingly() {
        String status = taskPage.verifyStatusOfManageTaskData();
        if (status.length()>0) {
            System.out.println("All data under status column displays right");
        }
    }

    //Appropriate data should display upon selecting an option from the priority drop down on managing task page

    @When("User Selects any option from priority dropdown on manage task page")
    public void user_selects_any_option_from_priority_dropdown_on_manage_task_page() {
        taskPage.selectOptionFromPriorityDropDown();

    }

    @Then("Data under priority column of task data displays accordingly")
    public void data_under_priority_column_of_task_data_displays_accordingly() {
        String status = taskPage.verifyPriorityDataOfTask();
        System.out.println(status);
        if (status.length()>0) {
            System.out.println("All data under Priority column displays right");
        } else {
            System.out.println("Failed To find data for selected option ");
        }

    }
//Appropriate data should display upon selecting an option from the type drop down on managing task page
    @When("User Selects any option from type dropdown on manage task page")
    public void user_selects_any_option_from_type_dropdown_on_manage_task_page() {
        taskPage.selectOptionFromTypeDropDown();
    }

    @Then("Data under type column of task data displays accordingly")
    public void data_under_type_column_of_task_data_displays_accordingly() {
        String type = taskPage.verifyTypeDataOfTask();

        if (type.length()>0) {
            System.out.println("Required data displays against Type dropdown option ");
        } else {
            System.out.println("Failed to fetch data against Type dropdown option");
        }
    }
    //Appropriate data should display upon selecting an option from the client drop down on managing task page

    @When("User Selects any option from client dropdown on manage task page")
    public void user_selects_any_option_from_client_dropdown_on_manage_task_page() {
        taskPage.selectOptionFromClientDropDown();

    }

    @Then("Data under client column of task data displays accordingly")
    public void data_under_client_column_of_task_data_displays_accordingly() {
        String client = taskPage.verifyClientDataOfTask();

        if (client.length()>0) {
            System.out.println("Required data displays against client dropdown option");
        } else {
            System.out.println("Failed to fetch data against client dropdown option");
        }

    }
//To check task details should open after clicking on task title on manage task page
    @When("User clicks on task tile on task manage page")
    public void user_clicks_on_task_tile_on_task_manage_page() {
        taskPage.clickAndFetchDataOfTask();

    }

    @Then("Task details window will open with all task details")
    public void task_details_window_will_open_with_all_task_details() {

    }

    //To check add task page displays with all details  by clicking on add task button on manage task page

    @Then("Add task page displays with all details")
    public void add_task_page_displays_with_all_details() {
        String addTaskPage = taskPage.verifyAddTaskPageOpen();

        Assert.assertEquals(addTaskPage,"Add Task");

    }

   //Edit task page should open in editable format by clicking on edit icon on manage edit page
    @When("User clicks on edit icon on manage task page")
    public void user_clicks_on_edit_icon_on_manage_task_page() {
        taskPage.clickOnEditIcon();
    }

    @Then("Edit task page opens in editable format")
    public void edit_task_page_opens_in_editable_format() {

        String editTaskPage = taskPage.verifyEditTaskPage();

        Assert.assertEquals(editTaskPage,"Edit Task");


    }


}
