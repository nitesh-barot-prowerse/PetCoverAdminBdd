package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ClientPage {
    private WebDriver driver;

    public ClientPage(WebDriver driver) {
        this.driver = driver;
    }

    //Elements
    private By clientIcon = By.cssSelector("ul[id='side-menu']>li:nth-child(3)");
    private By displayedMessage = By.xpath("//div[@id='page-wrapper']/div[3]/div/h2");

    private By searchBox = By.cssSelector("input[id='SearchText']");

    private By searchButton = By.cssSelector("button[id='SearchGrid']");

    private By statusDropDown = By.xpath("//div[@class='ibox-content-search m-b-sm']/div/div[2]/div/span/span");

    private By clientStatus = By.xpath("//ul[@id='IsActive_listbox']/li[2]");

    private By displayedStatus = By.xpath("//div[@class='tooltip-demo pull-right']/div/button");

    private By addQuoteForClient = By.cssSelector("a[id='btnAddClientView']");

    private By existingClientId = By.xpath("//div[@id='loadpartialview']/div/div/div[2]/div/div");

    //Add client scenario
    private By addClientButton = By.xpath("//div[@class=' tooltip-demo pull-right']/a[2]");

    private By clientTypeRadioButton = By.cssSelector("input[id='ClientTypeId_1']");

    private By genderDropDown = By.xpath("//div[@id='dvClientName']/div/div/div/div/span/span");

    private By genderValue = By.xpath("//ul[@id='Title_listbox']/li[2]");

    private By firstName = By.cssSelector("input[id='FirstName']");

    private By lastName = By.cssSelector("input[id='LastName']");

    private By birthDate = By.cssSelector("input[id='BirthDate']");

    private By Address = By.cssSelector("input[id='Address1']");

    private By postCodeOfAddress = By.xpath("//ul[@class='c2a_results']/li[2]");

    private By okButtonPopUp = By.cssSelector("button[class='dismissButton']");

    private By emailId = By.cssSelector("input[id='Email']");

    private By primaryContact = By.cssSelector("input[id='PrimaryContactNumber']");

    private By createButton = By.cssSelector("button[value='Create']");

    private By displayMessageOfViewClientPage = By.xpath("//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2");

    //Add contact details of client

    private By settingDropDown = By.cssSelector("a[id='dropdownMenu1']");

    private By addContactOptionOfDD = By.xpath("//ul[@class='dropdown-menu']/li[5]");

    private By userName = By.cssSelector("input[id='Name']");

    private By userEmail = By.cssSelector("input[id='Email']");

    private By userRelation = By.cssSelector("input[id='JobTitle']");

    private By userMobile = By.cssSelector("input[id='Mobile']");

    private By Button = By.xpath("//button[@value='Create']");

    private By contactMenu = By.xpath("//div[@class='project-tabs user-profile dsh-tab']/ul/li[3]");

    private By contactData = By.xpath("//div[@id='gridName']/table/tbody/tr");

    //Add notes details of client

    private By addNotesOptionOfDD = By.xpath("//ul[@class='dropdown-menu']/li[6]/a");

    private By titleOfNote = By.cssSelector("input[id='Title']");

    private By descriptionOFNote = By.cssSelector("textarea[id='Description']");

    private By createButtonOfWindow = By.xpath("//button[@type='submit' and @title='Create']");

    private By noteTabOFMenu = By.xpath("//div[@class='project-tabs user-profile dsh-tab']/ul/li[4]/a");

    private By noteDetails = By.xpath("//div[@id='gridClientNoteName']/table/tbody/tr[1]");

    //Add task details of client

    private By addTaskOptionOfDD = By.xpath("//ul[@class='dropdown-menu']/li[7]/a");

    private By titleOfTask = By.cssSelector("input[id='Title']");

    private By statusDropDownOfTask = By.xpath("//div[@class='ibox-content']/div[1]/div[1]/div[3]/div/div/div/div/span");

    private By optionFromStatusDD = By.xpath("//ul[@id='TaskStatusId_listbox']/li[2]/span/span");

    private By priorityDropDown = By.xpath("//div[@class='ibox-content']/div[1]/div[1]/div[4]/div/div/div/span");

    private By optionFromPriority = By.xpath("//ul[@id='TaskPriorityId_listbox']/li[4]");

    private By typeDropDown = By.xpath("//div[@class='ibox-content']/div[1]/div[1]/div[5]/div/div/div/span");

    private By optionFromTypeDD = By.xpath("//ul[@id='TaskTypeId_listbox']/li[2]");

    private By endDate = By.xpath("//input[@id='EndDate']");

    private By createButtonOfTask = By.xpath("//button[@type='submit' and @value='Create']");

    private By taskTabOFMenu = By.xpath("//div[@class='project-tabs user-profile dsh-tab']/ul/li[5]/a");

    private By taskDetails = By.xpath("//div[@id='gridClientTaskName']/table/tbody/tr[1]");

    //Edit client test case

    private By editClientOptionsFromDD = By.xpath("//ul[@class='dropdown-menu']/li[1]");

    private By clientFirstName = By.cssSelector("input[id='FirstName']");

    private By clientLastName = By.cssSelector("input[id='LastName']");

    private By clientBirthDate = By.cssSelector("input[id='BirthDate']");

    private By clientPostAddressCode = By.cssSelector("input[id='Address1']");

    private By clientAddressFromDD = By.xpath("//div[@id='cc_c2a']/ul/li[3]");

    private By clientEmail = By.cssSelector("input[id='Email']");

    private By clientContact = By.cssSelector("input[id='PrimaryContactNumber']");

    private By saveButton = By.xpath("//button[@type='button' and @value='Create']");


    public String verifyClientManage() {
        driver.findElement(clientIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return driver.findElement(displayedMessage).getText();
    }

    public String fetchAndDisplayData() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> totalRow = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr")));
        String array = " ";
        for (WebElement rEle : totalRow) {
            array = array + " " + rEle.getText();
        }
        return array;

    }

    public void enterCodeDetails() {
        driver.findElement(searchBox).sendKeys("RAOA-0001");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickOnButton() {
        driver.findElement(searchButton).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyClient() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> clientInfo = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr/td[2]")));
        String clientCode = " ";
        for (WebElement client : clientInfo) {
            clientCode = client.getText();
            break;
        }
        return clientCode;
    }

    public void selectClientStatus() {
        driver.findElement(statusDropDown).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(clientStatus).click();
    }

    public void clickClientCode() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> clientInfo = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[2]")));
        for (WebElement client : clientInfo) {
            client.click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            break;
        }
    }

    public String verifyClientStatus() {
        String Status = driver.findElement(displayedStatus).getText();
        return Status;
    }

    //To check whether add quote page is displays for same user by clicking on add button on view client page
    public String clickClientCodeToGetClientNumber() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement clientInfo = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[2]")));
        String clientNumber =clientInfo.getText();
        System.out.println(clientNumber);
        clientInfo.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return clientNumber;
    }

    public void clickOnAddQuoteButton() {
        driver.findElement(addQuoteForClient).click();
    }

    public String verifyExistingClientOnAddQuote() {
        return driver.findElement(existingClientId).getText();
    }

    //Add client scenario

    public void clickOnAddClientButton() {
        driver.findElement(addClientButton).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void enterUserDetails() {
        String clientType = driver.findElement(By.xpath("//div[@class='ibox-content']/div[2]/div/div/div")).getText();
        String clientRadio[] = clientType.split(" ");
        if (clientRadio[0].equals("Individual")) {
            driver.findElement(genderDropDown).click();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(genderValue).click();
            driver.findElement(firstName).sendKeys("Deep");
            driver.findElement(lastName).sendKeys("Rao");
            driver.findElement(birthDate).sendKeys("19.06.1987");
            driver.findElement(Address).sendKeys("RM8 2TE");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(postCodeOfAddress).click();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //Alert simpleAlert = driver.switchTo().alert();
            //simpleAlert.accept();
            driver.findElement(emailId).sendKeys(Constant.getSaltString() + "@gmail.com");
            driver.findElement(primaryContact).sendKeys(Constant.getAlphaNumericString());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void clickOnCreateClientButton() {
        driver.findElement(createButton).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyCreatedClient() {
        return driver.findElement(displayMessageOfViewClientPage).getText();
    }


    //Add contact details of client

    public void selectAddContactOfClient() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(settingDropDown)).perform();
        driver.findElement(addContactOptionOfDD).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void enterContactDetails() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(userName).sendKeys("Maitry");
        driver.findElement(userEmail).sendKeys("maitry@gmail.com");
        driver.findElement(userRelation).sendKeys("Wife");
        driver.findElement(userMobile).sendKeys("9898989898");
        driver.findElement(Button).click();

    }


    public void clickOnCreateButton() {

    }

    public String verifyGeneratedContactDetails() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(contactMenu).click();
        return driver.findElement(contactData).getText();
    }

    //Add note information of client

    public void selectAddNotesOfClient() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(settingDropDown)).perform();
        driver.findElement(addNotesOptionOfDD).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    public void enterNotesDetails() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(titleOfNote).sendKeys("Test");
        driver.findElement(descriptionOFNote).sendKeys("Test Test Test");

        driver.findElement(createButtonOfWindow).click();

    }

    public String verifyGeneratedNotesDetails() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(noteTabOFMenu).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return driver.findElement(noteDetails).getText();
    }

    //Add task details of client

    public void selectAddTaskOfClient() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(settingDropDown)).perform();
        driver.findElement(addTaskOptionOfDD).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    public void enterTaskDetails() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(titleOfNote).sendKeys("Test");
        driver.findElement(statusDropDownOfTask).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromStatusDD).click();
        driver.findElement(priorityDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromPriority).click();
        driver.findElement(typeDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromTypeDD).click();
        driver.findElement(endDate).sendKeys("12.06.2025");
        driver.findElement(createButtonOfTask).click();


    }

    public String verifyGeneratedTaskDetails() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(taskTabOFMenu).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return driver.findElement(taskDetails).getText();
    }

    //Edit client details

    public void selectEditClientDetails() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(settingDropDown)).perform();
        driver.findElement(editClientOptionsFromDD).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    public void editClientData() {
        driver.findElement(clientFirstName).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(clientFirstName).sendKeys("Nitesh");
        driver.findElement(clientLastName).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(clientLastName).sendKeys("Barot");
        driver.findElement(clientBirthDate).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(clientBirthDate).sendKeys("12.09.1980");

        driver.findElement(clientPostAddressCode).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(clientPostAddressCode).sendKeys("RM8 2TE");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(clientAddressFromDD).click();

        driver.findElement(clientEmail).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(clientEmail).sendKeys("nik@gmail.com");

        driver.findElement(clientContact).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(clientContact).sendKeys("07459170022");
        driver.findElement(saveButton).click();
    }

    public String verifyUpdatedClient() {
        return driver.findElement(By.cssSelector("ul[class='iconlist']>li")).getText();
    }

    //Add notes for client on production

    public void enterClientCode() {
        driver.findElement(searchBox).sendKeys("TEST-00065");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickOnSearchButton() {
        driver.findElement(searchButton).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickONClientCode() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> clientInfo = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[2]")));
        for (WebElement client : clientInfo) {
            client.click();
            break;
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


}
