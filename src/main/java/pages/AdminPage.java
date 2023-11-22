package pages;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class AdminPage {
    private WebDriver driver;

    public AdminPage(WebDriver driver) {
        this.driver = driver;
    }

    private By adminIcon = By.cssSelector("ul[id='side-menu']>li:nth-child(10)");

    private By letterIcon = By.xpath("//div[@class='ibox-content']/div/div[5]/a/i");

    private By editLetterTemplateButton = By.xpath("//div[@id='gridName']/table/tbody/tr/td[5]/div/a[1]");

    private By displayMessage = By.xpath("//*[text()='Edit Letter Template']");

    private By nameField = By.cssSelector("input[id='LetterTemplateName']");

    private By emailField = By.cssSelector("input[id='FromEmail']");

    private By orderField = By.cssSelector("input[id='DisplayOrder']");

    private By subjectField = By.cssSelector("input[id='Subject']");

    //Product Page

    private By productIcon = By.xpath("//div[@class='ibox-content']/div/div[1]/a/i");

    private By productName = By.xpath("//div[@class='ibox view']/div/div[2]/div/dl/dd[1]/h2");

    private By settingsIcon = By.xpath("//div[@id='gridName']/table/tbody/tr/td[5]/ul/li");

    private By insurerConfigIcon = By.xpath("//div[@id='gridName']/table/tbody/tr/td[5]/ul[1]/li/ul/li[1]/a[1]");

    private By insurerDetail = By.xpath("//div[@id='gridInsurerConfiguration']/table/tbody/tr");

    private By agentDetail = By.xpath("//div[@id='gridAgentConfiguration']/table/tbody/tr");

    private By searchInput = By.cssSelector("input[id='SearchText']");

    private By searchButton = By.cssSelector("button[id='SearchGrid']");

    //Department Page

    private By departmentIcon = By.xpath("//div[@class='ibox-content']/div/div[2]/a/i");

    private By addDepartmentIcon=By.xpath("//div[@class=' tooltip-demo pull-right']/a[2]");

    private By displayMessageOnAddDepartmentPage=By.xpath("//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2");

    private By editDepartmentIcon=By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[5]/div/a[1]");

    private By displayedMessageOnEditDepartmentPage=By.xpath("//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2");

    //Staff Page

    private By staffIcon=By.xpath("//div[@class='ibox-content']/div/div[3]/a/i");

    private By departmentDropDownOnStaffPage=By.xpath("//div[@class='ibox-content-search m-b-sm']/div/div[2]/div/span/span");

    private By optionOfDepartmentDropDownOnStaffPage=By.xpath("//ul[@id='DepartmentId_listbox']/li[2]");

    private By activeDropDownOnStaffPage=By.xpath("//div[@class='ibox-content-search m-b-sm']/div/div[3]/div/span/span");

    private By optionOfActiveDropDownOnStaffPage=By.xpath("//ul[@id='IsActive_listbox']/li[2]");

    private By searchButtonOnStaffPage=By.cssSelector("button[id='SearchGrid']");

    private By addStaffButton=By.xpath("//div[@class='form-group pull-right']/div/a[2]");

    private By displayedMessageOnAddStaffPage=By.xpath("//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2");


    private By editStaffIcon=By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[7]/div/a[1]");

    private By displayedMessageOnEditStaffPage=By.xpath("//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2");




    //Bank Page

    private By bankAccountIcon = By.xpath("//div[@class='ibox-content']/div/div[4]/a/i");

    private By bankAccountDropDown = By.xpath("//div[@class='ibox-content-search m-b-sm']/div/div[1]/div/span/span");

    private By itemFromBADD = By.xpath("//ul[@id='BankAccount_listbox']/li[3]");

    private By insurerDropDown = By.xpath("//div[@class='ibox-content-search m-b-sm']/div/div[2]/div/span/span");

    private By itemFromIDD = By.xpath("//ul[@id='Insurer_listbox']/li[3]");

    private By searchButtonOfManageBank = By.cssSelector("button[id='SearchGrid']");

    private By addBankAccountIcon = By.xpath("//div[@class='form-group pull-right']/div/a[2]");

    private By displayedMessageOnAddBankAccount = By.xpath("//form[@id='bankForm']/div/div/div/div/h5");

    private By editIconAgainstInsurer = By.xpath("//div[@id='gridBankAccount']/table/tbody/tr[1]/td[7]/div/a");

    private By insurerNameInput = By.xpath("//div[@class='ibox float-e-margins']/div[2]/div[1]/div/div/div/span");

    private By insurerNameInputDD = By.xpath("//ul[@id='Insurer_listbox']/li[3]");

    private By accountTypeInput = By.xpath("//div[@class='ibox float-e-margins']/div[2]/div[2]/div/div/div/input[2]");

    private By bankAccountNameInput = By.xpath("//div[@class='ibox float-e-margins']/div[2]/div[3]/div/div/div/input");

    private By bankAccountNumberInput = By.xpath("//div[@class='ibox float-e-margins']/div[2]/div[4]/div/div/div/input");

    private By bicNUmberInput = By.xpath("//div[@class='ibox float-e-margins']/div[2]/div[5]/div/div/div/input");

     //Insurer Page
    private By insurerIcon = By.xpath("//div[@class='ibox-content']/div/div[6]/a/i");

    private By insurerPageDetails=By.xpath("//div[@id='gridName']/table/tbody/tr");

    private By displayedMessageOnManageInsurerPage = By.xpath("//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2");

    private By insurerCode = By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[2]");

    private By displayMessageOfViewInsurerCode = By.xpath("//div[@class='row row0 views']/div[1]/div/div/div[2]/div[1]/dl/dd/h2");

    private By typeDropDownOnManageInsurerPage = By.xpath("//div[@id='search']/div[2]/div/span/span");

    private By itemFromTypeDropDown = By.xpath("//ul[@id='InsurerTypeId_listbox']/li[3]");

    private By categoryDropDownOnManageInsurerPage = By.xpath("//div[@id='search']/div[3]/div/span/span");

    private By itemFromCategoryDropDown = By.xpath("//ul[@id='InsurerCategoryId_listbox']/li[2]");

    private By activeDropDownOnManageInsurerPage = By.xpath("//div[@id='search']/div[4]/div/span/span");

    private By itemFromActiveDropDown = By.xpath("//ul[@id='IsActive_listbox']/li[2]");

    private By searchButtonOnManageInsurerPage = By.xpath("//button[@id='SearchGrid']");

    private By addInsurerIcon = By.xpath("//div[@class='form-group pull-right']/div/a[2]");

    private By displayedMessageOnAddInsurerPage = By.xpath("//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2");

    private By editIconOfInsurer=By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[14]/div/a[1]");

    private By displayedMessageOnEditInsurerPage=By.xpath("//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2");

    //Agent Page
    private By agentIcon = By.xpath("//div[@class='ibox-content']/div/div[7]/a/i");

    private By agentReferenceNumber = By.xpath("//div[@id='gridName']/table/tbody/tr/td[2]");

    private By displayedMessageOnViewAgentPage = By.xpath("//div[@class='row wrapper border-bottom white-bg page-heading']/div[1]/h2");

    private By categoryDropDownOnManageAgentPage=By.xpath("//div[@class='ibox-content-search m-b-sm']/div/div[2]/div/span/span");

    private By optionFromCategoryDropDownOnManageAgentPage=By.xpath("//ul[@id='AgentCategoryId_listbox']/li[2]");

    private By typeDropDownOnManageAgentPage=By.xpath("//div[@class='ibox-content-search m-b-sm']/div/div[3]/div/span/span");

    private By optionFromTypeDropDownOnManageAgentPage=By.xpath("//ul[@id='AgentTypeId_listbox']/li[2]");

    private By activeDropDownOnManageAgentPage=By.xpath("//div[@class='ibox-content-search m-b-sm']/div/div[4]/div/span/span");

    private By optionFromActiveDropDownOnManageAgentPage=By.xpath("//ul[@id='IsActive_listbox']/li[2]");

    private By searchButtonOnManageAgentPage=By.cssSelector("button[id='SearchGrid']");

    private By addAgentButtonOnManageAgentPage=By.xpath("//div[@class='form-group pull-right']/div/a[2]");

    private By displayedMessageOnAddAgentPage=By.xpath("//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2");

    private By cogIconOnManageAgentPage=By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[14]/ul/li/a");

    private By editAgentOptionOfCogIcon=By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[14]/ul/li/ul/li[2]/a");

    private By displayedMessageOnEditAgentPage=By.xpath("//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2");



    //Company Page
    private By companyIcon = By.xpath("//div[@class='ibox-content']/div/div[8]/a/i");

    private By stateDropDownOnManageCompanyPage=By.xpath("//div[@class='ibox-content-search m-b-sm']/div/div[2]/div/span/span");

    private By optionFromStateDropDownOnManageCompanyPage= By.xpath("//ul[@id='StateId_listbox']/li[2]");

    private By countryDropDownOnManageCompanyPage=By.xpath("//div[@class='ibox-content-search m-b-sm']/div/div[3]/div/span/span");

    private By optionFromCountryDropDownOnManageCompanyPage=By.xpath("//ul[@id='CountryId_listbox']/li[2]");

    private By searchButtonOnManageCompanyPage=By.cssSelector("button[id='SearchGrid']");

    private By addCompanyButtonOnManageCompanyPage=By.xpath("//div[@class='form-group pull-right']/div/a[2]");

    private By displayedMessageOnAddCompanyPage=By.xpath("//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2");






    public void clickAdminIcon() {
        driver.findElement(adminIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickOnLetterIcon() {
        driver.findElement(letterIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public String fetchData() {
        WebDriverWait waitR = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> totalRow = waitR.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr")));
        String data = " ";
        for (WebElement trRow : totalRow) {
            data = data + " " + trRow.getText();
        }
        return data;
    }

    public void clickOnAddLetterTemplateIcon() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> totalHead = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(editLetterTemplateButton));
        for (WebElement thHead : totalHead) {
            thHead.click();
            break;
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String displayedMessage() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return driver.findElement(displayMessage).getText();

    }

    public void editData() {
        driver.findElement(nameField).clear();
        driver.findElement(nameField).sendKeys("Nitesh");
        driver.findElement(emailField).clear();
        driver.findElement(emailField).sendKeys("nitesh.barot@prowerse.com");

        ((JavascriptExecutor) driver).executeScript("document.getElementById('DisplayOrder').style.display='block';");
        WebElement element = driver.findElement(By.id("DisplayOrder"));
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        String order = "23";
        wait1.until(ExpectedConditions.visibilityOf(element)).sendKeys(order);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(subjectField)).clear();
        driver.findElement(subjectField).sendKeys("Testing Purpose");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void traversingThroughPages() {
        WebDriverWait cWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> totalColumn = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='ibox-content']/div/div/a")));
        String product = driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[1]/a")).getText();
        if (product.contains("Run Scheduler") || product.contains("Email Logs")) {
            System.out.println("Do Nothing");

        } else {
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[1]/a")).click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(driver.getCurrentUrl());
            driver.findElement(adminIcon).click();

        }
        String Department = driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[2]/a")).getText();
        if (Department.contains("Run Scheduler") || Department.contains("Email Logs")) {
            System.out.println("Do Nothing");

        } else {
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[2]/a")).click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(driver.getCurrentUrl());
            driver.findElement(adminIcon).click();
        }
        String Staff = driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[3]/a")).getText();
        if (Staff.contains("Run Scheduler") || Staff.contains("Email Logs")) {
            System.out.println("Do Nothing");

        } else {
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[3]/a")).click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(driver.getCurrentUrl());
            driver.findElement(adminIcon).click();
        }
        String BankAccount = driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[4]/a")).getText();
        if (BankAccount.contains("Run Scheduler") || BankAccount.contains("Email Logs")) {
            System.out.println("Do Nothing");

        } else {
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[4]/a")).click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(driver.getCurrentUrl());
            driver.findElement(adminIcon).click();
        }
        String Insurer = driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[5]/a")).getText();
        if (Insurer.contains("Run Scheduler") || Insurer.contains("Email Logs")) {
            System.out.println("Do Nothing");

        } else {
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[5]/a")).click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(driver.getCurrentUrl());
            driver.findElement(adminIcon).click();
        }
        String Agent = driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[6]/a")).getText();
        if (Agent.contains("Run Scheduler") || Agent.contains("Email Logs")) {
            System.out.println("Do Nothing");

        } else {
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[6]/a")).click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(driver.getCurrentUrl());
            driver.findElement(adminIcon).click();
        }
        String Company = driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[7]/a")).getText();
        if (Company.contains("Run Scheduler") || Company.contains("Email Logs")) {
            System.out.println("Do Nothing");

        } else {
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[7]/a")).click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(driver.getCurrentUrl());
            driver.findElement(adminIcon).click();
        }
        String RatingVersion = driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[8]/a")).getText();
        if (RatingVersion.contains("Run Scheduler") || RatingVersion.contains("Email Logs")) {
            System.out.println("Do Nothing");

        } else {
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[8]/a")).click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(driver.getCurrentUrl());
            driver.findElement(adminIcon).click();
        }
        String RunScheduler = driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[9]/a")).getText();
        if (RunScheduler.contains("Run Scheduler") || RunScheduler.contains("Email Logs")) {
            System.out.println("Do Nothing");


        } else {
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[9]/a")).click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(driver.getCurrentUrl());
            driver.findElement(adminIcon).click();
        }
        String PromoCode = driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[10]/a")).getText();
        if (PromoCode.contains("Run Scheduler") || PromoCode.contains("Email Logs")) {
            System.out.println("Do Nothing");


        } else {
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[10]/a")).click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(driver.getCurrentUrl());
            driver.findElement(adminIcon).click();
        }
        String ProCode = driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[11]/a")).getText();
        if (ProCode.contains("Run Scheduler") || ProCode.contains("Email Logs")) {
            System.out.println("Do Nothing");


        } /*else {
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[11]/a")).click();
            System.out.println(driver.getCurrentUrl());
            //driver.findElement(adminIcon).click();
        }
        String PCode = driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[12]/a")).getText();
        if (PCode.contains("Run Scheduler") || PCode.contains("Email Logs")) {
            System.out.println("Do Nothing");


        } else {
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[12]/a")).click();
            System.out.println(driver.getCurrentUrl());
            driver.findElement(adminIcon).click();
        }*/
    }

    //To verify whether View Product page displays with product details with status after by clicking on product code on manage product page

    public void clickOnProductIcon() {
        driver.findElement(productIcon).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void clickOnProductCode() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> productCode = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr/td[2]")));
        for (WebElement pCode : productCode) {
            pCode.click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            break;
        }

    }

    public String verifyProductDetails() {
        return driver.findElement(productName).getText();

    }

    // To verify if insurer pop up windows displays by  clicking on insurer configuration pop up on setting icon on manage product page

    public void clickOnInsurerConfigIcon() {
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> settingIcon = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr/td[5]/ul/li")));
        for (WebElement stg : settingIcon) {
            actions.moveToElement(stg).perform();
            WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
            List<WebElement> insurerConfig = wait1.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr/td[5]/ul[1]/li/ul/li[1]/a[1]")));
            for (WebElement insu : insurerConfig) {
                insu.click();
                break;
            }
            break;
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String fetchInsurerPageData() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> insurerDetail = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridInsurerConfiguration']/table/tbody/tr")));
        String data=" ";
        for (WebElement details : insurerDetail) {
           data=details.getText()+data;

        }

        return data;
    }

    //To verify if agent configuration pop up windows displays by  clicking on agent configuration on setting icon on manage product page

    public void clickOnAgentConfigIcon() {
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> settingIcon = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr/td[5]/ul/li")));
        for (WebElement stg : settingIcon) {
            actions.moveToElement(stg).perform();
            WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
            List<WebElement> agentConfig = wait1.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr/td[5]/ul[1]/li/ul/li[2]/a[1]")));
            for (WebElement agent : agentConfig) {
                agent.click();
                break;
            }
            break;
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String fetchAgentConfigData() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> insurerDetail = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridAgentConfiguration']/table/tbody/tr")));
        String data=" ";
        for (WebElement details : insurerDetail) {
            data=details.getText()+data;

        }

        return data;
    }

//Department

    public void clickDepartmentIcon() {
        driver.findElement(departmentIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void enterDepartmentInSearch() {
        driver.findElement(searchInput).sendKeys("Inbound");
    }

    public void clickSearchButton() {
        driver.findElement(searchButton).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyDepartmentName() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> department = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[2]")));
        String depart = " ";
        for (WebElement dep : department) {
            depart = depart + dep.getText();
        }
        return depart;
    }
    //Add department page  displays will all details when user clicks on add department icon on manage department page

    public void clickOnAddDepartmentIcon()
    {
        driver.findElement(addDepartmentIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyAddDepartmentPage(){
        return driver.findElement(displayMessageOnAddDepartmentPage).getText();
    }


    //Edit department page displays upon clicking on edit icon against department name inside list of department on manage department page

    public void clickOnEditDepartmentIcon(){
        driver.findElement(editDepartmentIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyEditDepartmentPage(){
        return driver.findElement(displayedMessageOnEditDepartmentPage).getText();

    }

    //Filter data of staff details upon department and active drop down options on manage staff  page

    public void clickOnStaffIcon(){
        driver.findElement(staffIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void selectOptionFromDropDownOnStaffPage(){
        driver.findElement(departmentDropDownOnStaffPage).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfDepartmentDropDownOnStaffPage).click();

        driver.findElement(activeDropDownOnStaffPage).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfActiveDropDownOnStaffPage).click();
        driver.findElement(searchButtonOnStaffPage).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyDetailsOfStaffPage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> staffDetails = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr/td")));
        String data = " ";
        for (WebElement details : staffDetails) {
            data = data + details.getText();

        }
        return data;
    }

    //Add staff page displays with all details upon clicking on add staff icon on manage staff page
    public void clickOnAddStaffButton(){
        driver.findElement(addStaffButton).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyAddStaffPage(){
        return driver.findElement(displayedMessageOnAddStaffPage).getText();

    }

    //Edit staff page displays upon clicking on edit icon against staff name inside list of staff on manage staff page

    public void clickOnEditStaffIcon(){
        driver.findElement(editStaffIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyEditStaffPage(){
        return driver.findElement(displayedMessageOnEditStaffPage).getText();

    }

    //Manage Bank Account page displays with all details by clicking on bank account icon on administration page

    public void clickOnBankAccountIcon() {
        driver.findElement(bankAccountIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String fetchAndDisplayBankAccountData() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> bankDetails = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridBankAccount']/table/tbody/tr")));
        String bankDetail = " ";
        for (WebElement bankD : bankDetails) {
            bankDetail = bankDetail + bankD.getText();

        }
        return bankDetail;

    }

    //Filter data of bank details upon bank account and insurer drop down items on manage bank account page

    public void selectItemFromBankDropDown() {
        driver.findElement(bankAccountDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(itemFromBADD).click();

    }

    public void selectItemFromInsurerDropDown() {
        driver.findElement(insurerDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(itemFromIDD).click();

    }

    public void clickOnSearchButton() {
        driver.findElement(searchButtonOfManageBank).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyBankAccountDetails() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> insurerName = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridBankAccount']/table/tbody/tr")));
        String insurer = " ";
        for (WebElement insu : insurerName) {
            insurer = insurer + insu.getText();
        }

        return insurer;


    }

    //Add Bank account page displays with details after clicking on add bank account button on manage bank account page

    public void clickOnAddBankAccountIcon() {
        driver.findElement(addBankAccountIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyAddBankAccountPage() {
        return driver.findElement(displayedMessageOnAddBankAccount).getText();
    }

    // On the manage bank account page click the Edit icon against a insurer name. The Edit Bank Account page should open with the  data in editable format.

    public void clickOnEditIconOfInsurer() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(editIconAgainstInsurer).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void editDataOfEditBankAccountPage() {
        driver.findElement(insurerNameInput).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(insurerNameInputDD).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(accountTypeInput).click();
        driver.findElement(bankAccountNameInput).clear();
        driver.findElement(bankAccountNameInput).sendKeys("Xys");
        driver.findElement(bankAccountNumberInput).sendKeys("989");
        driver.findElement(bicNUmberInput).sendKeys("989867");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    ////Manage insurer page will displays with all details by clicking on insurer icon on Administrator page

    public void clickOnInsurerIcon()  {
        driver.findElement(insurerIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    public String verifyManageInsurerPage() {
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        List<WebElement> insurerDetails=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr")));
        String insurerData=" ";
        for (WebElement data: insurerDetails){
            insurerData=insurerDetails+data.getText();

        }

       return insurerData;

    }
    //View Insurer page displays with all insurer details after clicking on insurer code link on manage insurer page

    public void clickOnInsurerCodeLink() {

        driver.findElement(insurerCode).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyViewInsurerPage() {
        return driver.findElement(displayMessageOfViewInsurerCode).getText();

    }

    public void selectsOptionFromDropDownOnManageInsurerPage() {
        driver.findElement(typeDropDownOnManageInsurerPage).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(itemFromTypeDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(categoryDropDownOnManageInsurerPage).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(itemFromCategoryDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(activeDropDownOnManageInsurerPage).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(itemFromActiveDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(searchButtonOnManageInsurerPage).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyListOfManageInsurerPageUponDD() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> typeDD = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr/td")));
        String typeValue = " ";
        for (WebElement type : typeDD) {
            typeValue = typeValue + type.getText();
        }

        return typeValue ;

    }

    //Add insurer page displays with all fields by clicking on add insurer icon on manage insurer page
    public void clickOnAddInsurerIcon() {
        driver.findElement(addInsurerIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyAddInsurerPage() {
        return driver.findElement(displayedMessageOnAddInsurerPage).getText();
    }


    //Edit insurer page displays in editable format by clicking on edit icon against insurer code on manage insurer page

    public void clickOnEditInsurerIcon(){

        WebElement editInsurerIcon = driver.findElement(By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[14]/div/a[1]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", editInsurerIcon);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        editInsurerIcon.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyEditInsurerPage() {
        return driver.findElement(displayedMessageOnEditInsurerPage).getText();
    }

    //View Agent page displays with all details by clicking on agent reference number on Manage agent page

    public void clickOnAgentIcon() {
        driver.findElement(agentIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void clickOnAgentReferenceNumber() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> agentRef = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(agentReferenceNumber));
        for (WebElement agent : agentRef) {
            agent.click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            break;
        }

    }

    public String verifyViewAgentPage() {
        return driver.findElement(displayedMessageOnViewAgentPage).getText();
    }

    // Filter details on manage agent page upon option of category,type and active drop down

    public void selectOptionFromDropDownOnManageAgentPage(){
        driver.findElement(categoryDropDownOnManageAgentPage).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromCategoryDropDownOnManageAgentPage).click();

        driver.findElement(typeDropDownOnManageAgentPage).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromTypeDropDownOnManageAgentPage).click();

        driver.findElement(activeDropDownOnManageAgentPage).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromActiveDropDownOnManageAgentPage).click();


    }

    public void clickOnButtonOnManageAgentPage(){
        driver.findElement(searchButtonOnManageAgentPage).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyDetailsOfAgentList(){
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        List<WebElement> agentDetails=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr")));
        String data=" ";
        for (WebElement details:agentDetails){
            data=details.getText()+data;
        }
        return data;

    }


    //Add agent page displays with all details by clicking on add agent button on manage agent page

    public void clickOnAddAgentButton(){
        driver.findElement(addAgentButtonOnManageAgentPage).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyAddAgentPage(){
        return driver.findElement(displayedMessageOnAddAgentPage).getText();

    }

    //Edit Agent page displays in editable format by selecting edit icon from cog icon dropdown against agent reference number on manage agent page
    public void clickOnEditAgentIcon(){

        WebElement cogIcon = driver.findElement(By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[14]/ul/li/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cogIcon);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(cogIconOnManageAgentPage)).perform();
        driver.findElement(editAgentOptionOfCogIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyEditAgentPage(){
        return driver.findElement(displayedMessageOnEditAgentPage).getText();

    }


    //Manage Company page displays with list of companies by clicking on company icon on administration page

    public void clickOnCompanyIcon() {
        driver.findElement(companyIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String fetchAndDisplaysManageCompanyDetails() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> companyDetails = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr/td")));
        String companyDetail = " ";
        for (WebElement company : companyDetails) {
            companyDetail = companyDetail + company.getText();

        }
        return companyDetail;
    }

    //Filter details on manage company page upon option of state and country drop down

    public void selectOptionsFromDropDownOnManageCompany(){
        driver.findElement(stateDropDownOnManageCompanyPage).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromStateDropDownOnManageCompanyPage).click();

        driver.findElement(countryDropDownOnManageCompanyPage).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromCountryDropDownOnManageCompanyPage).click();
        driver.findElement(searchButtonOnManageCompanyPage).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyDetailsOfCompany(){
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        List<WebElement> companyList=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr/td")));
        String data=" ";
        for (WebElement details:companyList){
            data=details.getText()+data;
        }
        return data;

    }

    //Add company page displays with all details by clicking on add company button on manage company page

    public void clickOnAddCompanyButton(){
        driver.findElement(addCompanyButtonOnManageCompanyPage).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyAddCompanyPage(){
        return driver.findElement(displayedMessageOnAddCompanyPage).getText();

    }






}



