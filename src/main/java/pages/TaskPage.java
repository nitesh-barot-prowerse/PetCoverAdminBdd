package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TaskPage {
    private WebDriver driver;

    public TaskPage(WebDriver driver) {
        this.driver = driver;
    }

    private By taskIcon = By.cssSelector("ul[id='side-menu']>li:nth-child(7)");

    private By displayedMessage = By.xpath("//div[@id='page-wrapper']/div[3]/div/h2");

    private By addTaskButton = By.xpath("//div[@class=' tooltip-demo pull-right']/a[2]");

    private By assignDropDown = By.xpath("//div[@class='ibox float-e-margins']/div[1]/div/div[6]/div/div/div/span/span/span[2]");

    private By statusDropDown = By.xpath("//div[@id='search']/div[2]/div/span/span");

    private By openOptionFromStatusDropDown = By.xpath("//ul[@id='TaskStatusId_listbox']/li[2]");

    private By searchButton = By.cssSelector("button[id='SearchGrid']");

    private By priorityDropDown = By.xpath("//div[@id='search']/div[3]/div/span/span");

    private By optionUnderPriorityDropdown = By.xpath("//ul[@id='TaskPriorityId_listbox']/li[2]");

    private By typeDropDown = By.xpath("//div[@id='search']/div[4]/div/span/span");

    private By optionUnderTypeDropDown = By.xpath("//ul[@id='TaskTypeId_listbox']/li[2]");

    private By clientDropDown = By.xpath("//div[@id='search']/div[5]/div/span/span");

    private By optionUnderClinetrDropDown = By.xpath("//ul[@id='ClientId_listbox']/li[4]");

    private By editIconOnManageTaskPage=By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[11]/div/a[1]");


    public void clickOnTaskIcon() {
        driver.findElement(taskIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyTaskPage() {
        return driver.findElement(displayedMessage).getText();
    }

    public String fetchData() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> totalRow = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr")));
        String data = " ";
        for (WebElement rEle : totalRow) {
            data = data + " " + rEle.getText();
        }
        return data;
    }

    //To check whether Assign to dropdown on add task page appears with current user after clicking on add task button on add task page

    public void clickAddTaskButton() {
        driver.findElement(addTaskButton).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyAddTaskPage() {
        return driver.findElement(displayedMessage).getText();

    }

    public String verifyDropDown() {
        driver.findElement(assignDropDown).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> drop = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@id='AssignedToId_listbox']/li[1]/table/tbody/tr/td")));
        System.out.println(drop.size());
        String rev = "";
        for (WebElement element : drop) {
            rev = rev + element.getText() + " ";
            System.out.println(element.getText());
        }
        return rev;

    }

    //Appropriate data should display upon selecting an option from the status drop down on managing task page

    public void selectOptionFromStatus() {
        driver.findElement(statusDropDown).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(openOptionFromStatusDropDown).click();
        driver.findElement(searchButton).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyStatusOfManageTaskData() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> statusValue = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr")));
        String status = "";
        for (WebElement element : statusValue) {
            status = status + element.getText() + " ";
            System.out.println(element.getText());
        }
        return status;


    }
 //Appropriate data should display upon selecting an option from the priority drop down on managing task page
    public void selectOptionFromPriorityDropDown() {
        driver.findElement(priorityDropDown).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionUnderPriorityDropdown).click();
        driver.findElement(searchButton).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyPriorityDataOfTask() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> priorityValue = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr")));
        String priority = "";
        for (WebElement element : priorityValue) {
            priority = priority + element.getText() + " ";

        }
        System.out.println(priority);
        return priority;
    }
    //Appropriate data should display upon selecting an option from the type drop down on managing task page

    public void selectOptionFromTypeDropDown() {
        driver.findElement(typeDropDown).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        /*((JavascriptExecutor) driver).executeScript("document.getElementById('TaskTypeId_listbox').aria-hidden='true';");
        WebElement element = driver.findElement(By.xpath("//ul[@id='TaskPriorityId_listbox']/li[2]"));
        WebDriverWait wait1 = new WebDriverWait(driver, 10);
        wait1.until(ExpectedConditions.visibilityOf(element)).click();*/

        driver.findElement(optionUnderTypeDropDown).click();
        driver.findElement(searchButton).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyTypeDataOfTask() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> typeValue = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr")));
        String type = "";
        for (WebElement element : typeValue) {
            type = type + element.getText() + " ";

        }
        System.out.println(type);
        return type;
    }

    // Appropriate data should display upon selecting an option from the client drop down on managing task page

    public void selectOptionFromClientDropDown() {
        driver.findElement(clientDropDown).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionUnderClinetrDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // driver.findElement(optionUnderTypeDropDown).click();
        driver.findElement(searchButton).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyClientDataOfTask() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> clientValue = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr")));
        String type = "";
        for (WebElement element : clientValue) {
            type = type + element.getText() + " ";

        }
        System.out.println(type);
        return type;
    }

    //To check task details should open after clicking on task title on manage task page

    public void clickAndFetchDataOfTask() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> clientValue = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr/td[3]")));

        for (WebElement element : clientValue) {
            element.click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            String MainWindow = driver.getWindowHandle();
            System.out.println("Main window handle is " + MainWindow);

            // To handle all new opened window
            Set<String> s1 = driver.getWindowHandles();
            System.out.println("Child window handle is" + s1);
            Iterator<String> i1 = s1.iterator();

            // Here we will check if child window has other child windows and when child window
            //is the main window it will come out of loop.
            while (i1.hasNext()) {

                String ChildWindow = i1.next();
                if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
                    driver.switchTo().window(ChildWindow);
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    driver.close();
                    System.out.println("Child window closed");
                }
            }

            driver.switchTo().window(MainWindow);
            break;

        }

    }

    //To check add task page displays with all details  by clicking on add task button on manage task page

    public String verifyAddTaskPageOpen(){
        return  driver.findElement(displayedMessage).getText();

    }

    //Edit task page should open in editable format by clicking on edit icon on manage edit page

    public void clickOnEditIcon(){
        driver.findElement(editIconOnManageTaskPage).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyEditTaskPage(){
        return driver.findElement(displayedMessage).getText();
    }

}
