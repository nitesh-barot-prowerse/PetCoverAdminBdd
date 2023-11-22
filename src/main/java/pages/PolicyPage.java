package pages;

import actions.AddClaimActions;
import actions.AddQuoteForDog;
import dataModels.Claim;
import org.apache.commons.math3.optimization.direct.PowellOptimizer;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Log;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.io.File;

public class PolicyPage extends AddClaimActions {
    private WebDriver driver;

    public PolicyPage(WebDriver driver) {
        this.driver = driver;
    }

    Claim claim;

    String PolicyNumber = " ";

    private By policyIcon = By.cssSelector("ul[id='side-menu']>li:nth-child(5)");

    private By displayedMessage = By.xpath("//div[@id='page-wrapper']/div[3]/div/h2");

    private By displayedMessageOnPolicyInformation = By.xpath("//div[@id='page-wrapper']/div[3]/div/h2");

    private By letterIcon = By.xpath("//div[@class='project-tabs user-profile dsh-tab']/ul/li[11]");

    private By downloadIcon = By.xpath("//div[@id='gridPolicyLetterList']/table/tbody/tr/td[14]/div/a[1]");

    private By statusDropDown = By.xpath("//div[@class='ms-parent']");

    private By optionFromStatusDropdown = By.xpath("//div[@class='ms-drop']/ul/li[2]/label/input");

    private By fromDateOfPolicy = By.xpath("//div[@id='search']/div[6]/div/span/span/input");

    private By toDateOfPolicy = By.xpath("//div[@id='search']/div[7]/div/span/span/input");

    private By policyDetailsOnDateValue = By.xpath("//div[@id='gridName']/table/tbody[1]/tr[1]");

    private By searchButton = By.cssSelector("button[id='SearchGrid']");

    //Add claim page

    private By cogIcon = By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[18]/ul/li/a");

    private By addClaimIcon = By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[18]/ul/li/ul/li[1]/a");

    private By displayedMessageOnAddClaimPage = By.xpath("//div[@id='page-wrapper']/div[3]/div/h2");

    //Add note window

    private By addNoteIcon = By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[18]/ul/li/ul/li[2]/a");

    private By titleOfAddNote = By.cssSelector("input[id='Title']");

    private By descriptionOfAddNote = By.cssSelector("textarea[id='Description']");

    private By cancelButton = By.cssSelector("button[value='Cancel']");

    //Add letter window

    private By addLetterIcon = By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[18]//ul/li/ul/li[3]/a");

    private By titleOfAddLetter = By.cssSelector("input[id='Title']");

    private By letterTemplateDropDown = By.xpath("//div[@class='ibox-content']/div[2]/div[1]/div/div/span");

    private By optionOfLetterTemplateDD = By.xpath("//ul[@id='LetterTemplateId_listbox']/li[3]");

    private By receiptDropDown = By.xpath("//div[@class='ibox-content']/div[2]/div[2]/div/div/span");

    private By optionOfReceiptDD = By.xpath("//ul[@id='RecipientTypeId_listbox']/li[2]");

    private By optionOfInsurerReceiptDD = By.xpath("//ul[@id='RecipientTypeId_listbox']/li[3]");

    private By remarksTextArea = By.cssSelector("textArea[id='Remark']");

    private By sendMailCheckBox = By.cssSelector("input[id='checkbox_IsSendMail']");

    private By createLatterButton = By.xpath("//button[@class='btn btn-primary' and @value='Create']");

    //Quote information page
    private By viewQuoteIcon = By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[18]/ul/li/ul/li[4]/a");

    private By displayedMessageOnViewQuotePage = By.xpath("//div[@id='page-wrapper']/div[3]/div/h2");

    //Policy information page

    private By cogIconOfPolicyInformationPage = By.xpath("//div[@class=' tooltip-demo pull-right']/div/div/div/div/div/div/a");

    private By addClaimIconOfPolicyInformationPage = By.xpath("//div[@class=' tooltip-demo pull-right']/div/div/div/div/div/div/ul/li[1]/a");

    private By addNoteIconOfPolicyInformationPage = By.xpath("//div[@class=' tooltip-demo pull-right']/div/div/div/div/div/div/ul/li[2]/a");

    private By addEndorsementIconOfPolicyInformationPage = By.xpath("//div[@class=' tooltip-demo pull-right']/div/div/div/div/div/div/ul/li[3]/a");

    private By viewQuoteIconOfPolicyInformationPage = By.xpath("//div[@class=' tooltip-demo pull-right']/div/div/div/div/div/div/ul/li[5]/a");

    private By cancelPolicyIconOfPolicyInformationPage = By.xpath("//div[@class=' tooltip-demo pull-right']/div/div/div/div/div/div/ul/li[6]/a");

    private By cancelPolicyRefundAmount = By.cssSelector("input[id='RefundAmount']");

    private By cancelPolicyDescription = By.cssSelector("textarea[id='CancellationDescription']");

    private By cancelPolicyCancelButton = By.xpath("//div[@class='ibox-content']/div[5]/div/div/div/a[@id='btnCancel']");

    private By addAllocatePaymentIcon = By.xpath("//div[@class=' tooltip-demo pull-right']/div/div/div/div/div/div/ul/li[8]/a");

    private By addAccountMaintenanceIcon = By.xpath("//div[@class=' tooltip-demo pull-right']/div/div/div/div/div/div/ul/li[11]/a");

    private By displayedMessageOnPolicyEndorsementPage = By.xpath("//div[@id='page-wrapper']/div[3]/div/h2");

    private By displayedMessageOnQuoteInformationPage = By.xpath("//div[@id='page-wrapper']/div[3]/div/h2");

    private By displayedMessageOnAddAllocatePage = By.xpath("//div[@id='page-wrapper']/div[3]/div/h2");

    private By displayedMessageOnAddAccountMaintenancePage = By.xpath("//div[@id='page-wrapper']/div[3]/div/h2");


    //All tab on policy information page

    private By transactionalTab = By.xpath("//div[@class='project-tabs user-profile dsh-tab']/ul/li[1]");

    private By detailsOfTransactionTab = By.xpath("//div[@id='gridPolicyActivityList']/table/tbody/tr");

    private By insurerTab = By.xpath("//div[@class='project-tabs user-profile dsh-tab']/ul/li[2]");

    private By detailsOfInsurerTab = By.xpath("//div[@id='gridPolicyTransactionInsurerList']/table/tbody/tr");

    private By claimTab = By.xpath("//div[@class='project-tabs user-profile dsh-tab']/ul/li[3]");

    private By detailsOfClaimTab = By.xpath("//div[@id='gridPolicyClaimList']/table/tbody/tr");

    private By reversalClaimTab = By.xpath("//div[@class='project-tabs user-profile dsh-tab']/ul/li[4]");

    private By detailsOfReversalClaimTab = By.xpath("//div[@id='gridPolicyClaimReversalInvoiceList']/table/tbody/tr");

    private By creditNoteTab = By.xpath("//div[@class='project-tabs user-profile dsh-tab']/ul/li[5]");

    private By detailsOfCreditNoteTab = By.xpath("//div[@id='gridPolicyCreditNoteList']/table/tbody/tr");

    private By policyInvoiceCreditNoteTab = By.xpath("//div[@class='project-tabs user-profile dsh-tab']/ul/li[6]");

    private By detailsOfPolicyInvoiceCreditNoteTab = By.xpath("//div[@id='gridNamePolicyInvoiceCreditNote']/table/tbody/tr");

    private By notesTab = By.xpath("//div[@class='project-tabs user-profile dsh-tab']/ul/li[7]");

    private By detailsOfNotesTab = By.xpath("//div[@id='gridNameNotes']/table/tbody/tr");

    private By installmentTab = By.xpath("//div[@class='project-tabs user-profile dsh-tab']/ul/li[8]");

    private By detailsOfInstallmentTab = By.xpath("//div[@id='gridPolicyInstalmentList']/table/tbody/tr");

    private By exclusionTab = By.xpath("//div[@class='project-tabs user-profile dsh-tab']/ul/li[9]");

    private By detailsOfExclusionTab = By.xpath("//div[@id='gridNameExclusion']/table/tbody/tr");

    private By letterTab = By.xpath("//div[@class='ibox-content project-content']/div/ul/li[11]");

    private By detailsOfLetterTab = By.xpath("//div[@id='gridPolicyLetterList']/table/tbody/tr");

    private By historyTab = By.xpath("//div[@class='project-tabs user-profile dsh-tab']/ul/li[12]");

    private By detailsOfHistoryTab = By.xpath("//div[@id='gridPolicyHistoryList']/table/tbody/tr");

    private By policyLedgerTab = By.xpath("//div[@class='project-tabs user-profile dsh-tab']/ul/li[13]");

    private By detailsOfPolicyLedgerTab = By.xpath("//div[@id='gridPolicyDebtorLedgerList']/table/tbody/tr");

    //Add claim for policy

    private By cogIconOnPolicyManagePage = By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[18]/ul/li/a");

    private By addClaimOnCogIcon = By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[18]/ul/li/ul/li[1]/a");

    private By coverDropDown = By.xpath("//div[@class='ibox-content']/div[6]/div[3]/div/div/div[7]/div/div/div/span");

    private By optionOfCoverDD = By.xpath("//ul[@id='ClaimCoverDetailId_listbox']/li[2]");

    private By treatmentDate = By.cssSelector("input[id='DateOfLoss']");

    private By firstClaimAdvised = By.cssSelector("input[id='NotifiedDate']");

    private By firstNotification = By.cssSelector("input[id='FirstNotificationAcknowledgmentDate']");

    private By manifestationDate = By.cssSelector("input[id='ManifestationDate']");

    private By notifiedMethodDropDown = By.xpath("//div[@class='ibox-content']/div[6]/div[4]/div/div/div[3]/div/div/div[5]/div/div/div/span");

    private By optionOfNotifiedDD = By.xpath("//ul[@id='NotificationMethod_listbox']/li[4]");

    private By paymentToDropDown = By.xpath("//div[@class='ibox-content']/div[6]/div[4]/div/div/div[3]/div/div/div[8]/div/div/div/span");

    private By optionOfPaymentToDD = By.xpath("//ul[@id='PayBy_listbox']/li[2]");

    private By chequeName = By.className("input[id='ChequeName']");

    private By conditionTypeDropDown = By.xpath("/div[@class='ibox-content']/div[6]/div[4]/div/div/div[3]/div/div/div[14]/div/div/div/span");

    private By optionOfConditionTypeDD = By.xpath("//ul[@id='ConditionType_listbox']/li[3]");

    private By claimAmount = By.cssSelector("input[id='ClaimAmount']");

    private By lossCauseDropDown = By.xpath("//div[@class='ibox-content']/div[8]/div[2]/div[1]/div[3]/div/div/div/div/div/div/span/span");

    private By optionOfLossCauseDD = By.xpath("//ul[@id='CauseId_listbox']/li[3]/table/tbody/tr/td[2]/span");

    private By saveButton = By.cssSelector("button[id='SaveButton']");


    public void clickPolicyIcon() {

        driver.findElement(policyIcon).click();
        Log.info("*******Script Clicks On Policy Icon*******");
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyManagePolicyPage() {
        String Message = driver.findElement(displayedMessage).getText();
        Log.info("Script Redirect To Page Of====>" + Message);
        return Message;
    }

    public String fetchAndDisplayData() {
        String array = " ";
        Log.info("Script Now Try's To Fetch Policy Data On Manage Policy Page");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> totalRow = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr")));

        for (WebElement rEle : totalRow) {
            array = array + " " + rEle.getText();
        }
        Log.info("On Manage Policy Page Available Policy Information is ====>" + array);
        return array;
    }

    public String verifyDateFormatOfStartDate() {
        Log.info("Script Now Try's To Verify Date Format Of  Start Date On Manage Policy Page");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> policyDateColumn = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody[1]/tr/td[13]")));
        String dateArray = " ";
        for (WebElement startDate : policyDateColumn) {
            dateArray = dateArray + " " + startDate.getText().toString();

        }
        Log.info("On Manage Policy Page Start Date Displays In Format Of ====>" + dateArray);
        return dateArray;
    }

    public String verfiyDateFormatOfExpireDate() {
        Log.info("Script Now Try's To Verify Date Format Of  Expire Date On Manage Policy Page");
        WebDriverWait eWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> endDateColumn = eWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody[1]/tr/td[14]")));
        String dateArray = " ";
        for (WebElement endDate : endDateColumn) {
            dateArray = dateArray + " " + endDate.getText().toString();
        }
        Log.info("On Manage Policy Page Expire Date Displays In Format Of ====>" + dateArray);
        return dateArray;

    }

    public String clickOnPolicyNumberLink() {
        Log.info("Script Now Try's To Open Policy Information Page By Clicking Each Policy Number Link On Manage Policy Page");

        WebDriverWait cWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> totalColumn = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[4]/a")));

        String displayMessage = " ";
        for (WebElement cEle : totalColumn) {
            cEle.click();
            Log.info("Script Has Clicked On Policy Number Link On Manage Policy Page");


            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs2.get(1));
            System.out.println(driver.getCurrentUrl());
            Log.info("Script Redirects to Respected Policy Information Page Is===> " + driver.getCurrentUrl());
            displayMessage = displayMessage + driver.findElement(displayedMessage).getText();
            driver.close();
            driver.switchTo().window(tabs2.get(0));
            //break;

        }
        return displayMessage;

    }

    public String verifyPolicyInformationPage() {
        return driver.findElement(displayedMessageOnPolicyInformation).getText();

    }

    public void clickPolicyPageToDownloadFile() {
        Log.info("Script Now Try's To Open Policy Information Page By Clicking First One Policy Number Link On Manage Policy Page");

        WebDriverWait cWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement totalColumn = cWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[4]/a")));
        totalColumn.click();
        Log.info("Script Has Clicked On Policy Number Link On Manage Policy Page");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        Log.info("Script Redirects to Respected Policy Information Page Is===> " + driver.getCurrentUrl());
        System.out.println(driver.getCurrentUrl());

    }

    public void LetterIcon() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Log.info("Script Has Reached To Letter Icon On Policy Information Page");
        driver.findElement(letterIcon).click();
        Log.info("Script Has Clicked On Letter Icon On Policy Information Page");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void DownloadIcon() {
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//div[@id='gridPolicyLetterList']/table/tbody/tr/td[14]/div/a[1]")));
        Log.info("Script Has Reached To Letter Download Icon On Policy Information Page");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }

        WebDriverWait dWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> totalDownLoadSymbol = dWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridPolicyLetterList']/table/tbody/tr/td[14]/div/a[1]")));
        int dSize = totalDownLoadSymbol.size();

        for (int i = 0; i < dSize; i++) {
            totalDownLoadSymbol.get(i).click();
            Log.info("Script Has Clicked On Letter Download Icon On Policy Information Page");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            break;
        }

        //driver.switchTo().window(tabs2.get(0));
    }

    public String verifyDownLoadFile() {
        File myfile = new File("C:/Users/prowe/Downloads/BPIS Document - Welcome Letter.pdf");
        //FileUtils.touch(myfile);
        String re = "";

        if (myfile.exists()) {
            re = "file exist";

        } else {

            System.out.println("The file does not exist");
        }
        return re;
    }

    //Check appropriate policy data should displays against option selected from status drop down on manage policy page
    public void selectOptionFromStatusDropDown() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement element = driver.findElement(statusDropDown);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromStatusDropdown).click();
        Log.info("Script Has Selected Any Available Options From Status Dropdown On Manage Policy Page");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(searchButton).click();
        Log.info("Script Has Clicked On Search Button On Manage Policy Page");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    public String verifyPolicyStatusUponDropDown() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> policyStatus = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody[1]/tr[1]")));
        String Status = " ";
        for (WebElement status : policyStatus) {
            Status = status.getText();
        }
        return Status;
    }

    //Filter policy details on manage policy page upon from and to date value of policy  on manage policy page

    public void enterFromAndToDateValueOfPolicy() {
        driver.findElement(fromDateOfPolicy).sendKeys("23.06.2023");
        Log.info("Script Has Entered From Policy Date On Manage Policy Page");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(toDateOfPolicy).sendKeys("20.06.2025");
        Log.info("Script Has Entered To Policy Date Manage On Policy Page");
    }

    public void clickOnSearchButtonOnManagePolicyPage() {
        driver.findElement(searchButton).click();
        Log.info("Script Has Clicked On Search Button To Fetch Data On Manage Policy Page");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyPolicyDetails() {
        String policyValue = driver.findElement(policyDetailsOnDateValue).getText();
        Log.info("Available Policies Information Upon Start And To Policy Date Values===> " + policyValue);
        return policyValue;
    }

    //Verify that add claim page should open with all details by clicking on add claim icon of cog drop down against policy number on manage policy page

    public void clickOnAddClaimPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(cogIcon)).perform();
        Log.info("Script Has Clicked On Cog Icon");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(addClaimIcon).click();
        Log.info("Script Has Clicked On Add Claim Icon");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyAddClaimPage() {
        String displayMessage = " ";
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        System.out.println(driver.getCurrentUrl());
        Log.info("Script Redirects To Page Add Claim Page===>" + driver.getCurrentUrl());
        displayMessage = displayMessage + driver.findElement(displayedMessage).getText();

        driver.close();
        driver.switchTo().window(tabs2.get(0));
        return displayMessage;
    }


    //Verify that add note window should open with all details by clicking on add note icon of cog drop down against policy number on manage policy page

    public void clickOnAddNoteIcon() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(cogIcon)).perform();
        Log.info("Script Has Clicked On Cog Icon To Select Add Note Option");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(addNoteIcon).click();
        Log.info("Script Has Clicked On Add Note Icon");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void verifyAddNoteWindow() {
        driver.findElement(titleOfAddNote).sendKeys("Test");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(descriptionOfAddNote).sendKeys("Test");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Log.info("Script Redirects To Add Note Window");
        driver.findElement(cancelButton).click();
    }

    //Verify that add latter page should open with all details by clicking on add latter icon of cog drop down against policy number on manage policy page

    public void clickOnAddLetterIcon() {
        Log.info("Add Latter For Existing Policy Script Has Started Executing");

        PolicyNumber = driver.findElement(By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[4]/a")).getText();
        Log.info("Policy Number For Which Latter Is Generating==="+PolicyNumber);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(cogIcon)).perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(addLetterIcon).click();
        Log.info("User clicks on Add letter Icon On Manage Policy Page For Above Policy");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void verifyAddLetterWindow() {
        driver.findElement(titleOfAddLetter).sendKeys("Test");
        Log.info("User Enters Title");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(letterTemplateDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfLetterTemplateDD).click();
        Log.info("User Selects Template Of Latter is==" + driver.findElement(optionOfLetterTemplateDD).getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(receiptDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfReceiptDD).click();
        Log.info("User Selects Recipient Of Letter is===" + driver.findElement(optionOfReceiptDD).getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(remarksTextArea).sendKeys("TestRemarks");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement sendEmail = driver.findElement(By.cssSelector("input[id='checkbox_IsSendMail']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", sendEmail);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement sendLetter = driver.findElement(By.cssSelector("input[id='checkbox_IsLetterSend']"));
        JavascriptExecutor executor1 = (JavascriptExecutor) driver;
        executor1.executeScript("arguments[0].click();", sendLetter);
        // driver.findElement(sendMailCheckBox).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(createLatterButton).click();
        Log.info("User Clicks On Create Latter");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyLetter() {
        driver.findElement(policyIcon).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.id("PolicyNumber")).sendKeys(PolicyNumber);
        Log.info("User Enters PolicyNumber To fetch Letter Information" +PolicyNumber);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(searchButton).click();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Log.info("User Clicks On Search Button");

        driver.findElement(By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[4]")).click();
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Log.info("User On Page Is=="+driver.getCurrentUrl());
        WebElement tab1 = driver.findElement(By.xpath("//div[@class='ibox-content project-content']/div/ul/li[11]/a"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", tab1);
        // driver.findElement(letterTab).click();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Log.info("Letter Details Is=="+driver.findElement(detailsOfLetterTab).getText());
        return driver.findElement(detailsOfLetterTab).getText();


    }

    // //Verify that add latter page should open with all details by clicking on add latter icon of cog drop down against policy number on manage policy page for insurer


    public void enterDetailsOnAddLetterWindow() {
        driver.findElement(titleOfAddLetter).sendKeys("Test");
        Log.info("User Enters Title");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(letterTemplateDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfLetterTemplateDD).click();
        Log.info("User Selects Template Of Latter is==" + driver.findElement(optionOfLetterTemplateDD).getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(receiptDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfInsurerReceiptDD).click();
        Log.info("User Selects Recipient Of Letter is===" + driver.findElement(optionOfInsurerReceiptDD).getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(remarksTextArea).sendKeys("TestRemarks");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement sendEmail = driver.findElement(By.cssSelector("input[id='checkbox_IsSendMail']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", sendEmail);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement sendLetter = driver.findElement(By.cssSelector("input[id='checkbox_IsLetterSend']"));
        JavascriptExecutor executor1 = (JavascriptExecutor) driver;
        executor1.executeScript("arguments[0].click();", sendLetter);
        // driver.findElement(sendMailCheckBox).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(createLatterButton).click();
        Log.info("User Clicks On Create Latter");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    //Verify that quote information page should open with all details by clicking on view quote icon of cog drop down against policy number on manage policy page

    public void clickOnViewQuoteIcon() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(cogIcon)).perform();
        Log.info("Script Has Clicked On Cog Icon To Select View Quote Page");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(viewQuoteIcon).click();
        Log.info("Script Has Clicked On View Quote Page Icon");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyQuoteInformationPage() {
        String displayMessage = " ";
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        System.out.println(driver.getCurrentUrl());
        Log.info("Script Redirects To View Quote Page is===>" + driver.getCurrentUrl());
        displayMessage = displayMessage + driver.findElement(displayedMessageOnViewQuotePage).getText();

        driver.close();
        driver.switchTo().window(tabs2.get(0));
        return displayMessage;
    }

    //Add claim page displays with all details by clicking add claim icon of cog drop down on policy information page

    public void clickOnAddClaimOnPolicyInformation() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(cogIconOfPolicyInformationPage)).perform();
        Log.info("Script Has Clicked On Cog Icon To Select Policy Information Page");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(addClaimIconOfPolicyInformationPage).click();
        Log.info("Script Has Clicked On Policy Information Page Icon");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //Add note window displays with all details by clicking add note icon of cog drop down on policy information page

    public void clickOnAddNoteOnPolicyInformation() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(cogIconOfPolicyInformationPage)).perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(addNoteIconOfPolicyInformationPage).click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //Policy endorsement page displays with all details by clicking add endorsement icon of cog drop down on policy information page

    public void clickOnAddEndorsementOnPolicyInformation() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(cogIconOfPolicyInformationPage)).perform();
        Log.info("Script Has Clicked On Cog Icon To Select Add Endorsement Page Icon");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(addEndorsementIconOfPolicyInformationPage).click();
        Log.info("Script Has Clicked On Add Endorsement Page Icon");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyPolicyEndorsementPage() {

        String displayMessage = " ";
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        System.out.println(driver.getCurrentUrl());
        Log.info("Script Redirects To Add Endorsement Page Is ===>" + driver.getCurrentUrl());
        displayMessage = displayMessage + driver.findElement(displayedMessageOnPolicyEndorsementPage).getText();

        driver.close();
        driver.switchTo().window(tabs2.get(0));
        return displayMessage;


    }

    //Quote information page displays with all details by clicking view quote icon of cog drop down on policy information page

    public void selectViewQuoteIcon() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(cogIconOfPolicyInformationPage)).perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(viewQuoteIconOfPolicyInformationPage).click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyQuoteInfoPage() {
        String displayMessage = " ";
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        System.out.println(driver.getCurrentUrl());
        displayMessage = displayMessage + driver.findElement(displayedMessageOnQuoteInformationPage).getText();

        driver.close();
        driver.switchTo().window(tabs2.get(0));
        return displayMessage;

    }

    // Cancel  policy window displays with all details by clicking cancel policy icon of cog drop down on policy information page

    public void selectCancelPolicyIcon() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(cogIconOfPolicyInformationPage)).perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(cancelPolicyIconOfPolicyInformationPage).click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void verifyCancelPolicyWindow() {


      /*  driver.findElement(cancelPolicyRefundAmount).sendKeys("123.98");
        driver.findElement(cancelPolicyDescription).sendKeys("Test");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
        driver.findElement(cancelPolicyCancelButton).click();

    }

    //Quote information page displays with all details by clicking view quote icon of cog drop down on policy information page

    public void selectAddAllocateIcon() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(cogIconOfPolicyInformationPage)).perform();
        Log.info("Script Has Clicked On Cog Icon To Select Add Allocate Page Icon");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(addAllocatePaymentIcon).click();
        Log.info("Script Has Clicked On Add Allocate Page Icon");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyAddAllocatePage() {

        String displayMessage = " ";
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        System.out.println(driver.getCurrentUrl());
        Log.info("Script Redirects To Add Allocate Page Is===>" + driver.getCurrentUrl());
        displayMessage = displayMessage + driver.findElement(displayedMessageOnAddAllocatePage).getText();

        driver.close();
        driver.switchTo().window(tabs2.get(0));
        return displayMessage;

    }

    //Client account maintenance displays with all details by clicking add account maintenance icon of cog drop down on policy information page
    public void selectAddAccountMaintenanceIcon() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(cogIconOfPolicyInformationPage)).perform();
        Log.info("Script Has Clicked On Cog Icon To Select Add Account Maintenance Page Icon");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(addAccountMaintenanceIcon).click();
        Log.info("Script Has Clicked On  Add Account Maintenance Page Icon");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyClientAccountMaintenancePage() {
        String displayMessage = " ";
        // ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        // driver.switchTo().window(tabs2.get(1));
        //System.out.println(driver.getCurrentUrl());
        displayMessage = displayMessage + driver.findElement(displayedMessageOnAddAccountMaintenancePage).getText();
        Log.info("Script Redirects To Add Account Maintenance Page Is===>" + driver.getCurrentUrl());

        driver.close();
        // driver.switchTo().window(tabs2.get(0));
        return displayMessage;

    }

    //Verify appropriate details should reflect by clicking on  transactions tab on policy information page

    public void clickOnTransactionTab() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        driver.findElement(transactionalTab).click();
        Log.info("Script Has Clicked On Transaction Tab On Policy Information Page");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyDetailsOfTabsOnPolicyInformationPage() {
        String Data = driver.findElement(detailsOfTransactionTab).getText();
        Log.info("Data Display On Clicking Transaction Tab is==>" + Data);
        return Data;

    }

    //Verify appropriate details should reflect by clicking on insurer tab on policy information page

    public void clickOnInsurerTab() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        driver.findElement(insurerTab).click();
        Log.info("Script Has Clicked On Insurer Tab On Policy Information Page");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyDetailsOfInsurerTabOnPolicyInformationPage() {
        String Data = driver.findElement(detailsOfInsurerTab).getText();
        Log.info("Data Display On Clicking Insurer Tab is==>" + Data);
        return Data;

    }

    //Verify appropriate details should reflect by clicking on claim tab on policy information page

    public void clickOnClaimTab() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        driver.findElement(claimTab).click();
        Log.info("Script Has Clicked On Claim Tab On Policy Information Page");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyDetailsOfClaimTabOnPolicyInformationPage() {
        String Data = driver.findElement(detailsOfClaimTab).getText();
        Log.info("Data Display On Clicking Claims Tab is==>" + Data);
        return Data;

    }

    //Verify appropriate details should reflect by clicking on reversal claim tab on policy information page
    public void clickOnReversalClaimTab() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        driver.findElement(reversalClaimTab).click();
        Log.info("Script Has Clicked On Reversal Claim Tab On Policy Information Page");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyDetailsOfReversalClaimTabOnPolicyInformationPage() {
        String Data = driver.findElement(detailsOfReversalClaimTab).getText();
        Log.info("Data Display On Clicking Reversal Claim Tab is==>" + Data);
        return Data;

    }

    //Verify appropriate details should reflect by clicking on credit note tab on policy information page

    public void clickOnCreditNoteTab() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        driver.findElement(creditNoteTab).click();
        Log.info("Script Has Clicked On Credit Note Tab On Policy Information Page");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyDetailsOfCreditNoteTabOnPolicyInformationPage() {
        String Data = driver.findElement(detailsOfCreditNoteTab).getText();
        Log.info("Data Display On Clicking Credit Note Tab is==>" + Data);
        return Data;

    }

    //Verify appropriate details should reflect by clicking on policy invoice credit note tab on policy information page

    public void clickOnPolicyInvoiceCreditNoteTab() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        driver.findElement(policyInvoiceCreditNoteTab).click();
        Log.info("Script Has Clicked On Policy Invoice Credit Note Tab On Policy Information Page");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyDetailsOfPolicyInvoiceCreditNoteTabOnPolicyInformationPage() {
        String Data = driver.findElement(detailsOfPolicyInvoiceCreditNoteTab).getText();
        Log.info("Data Display On Clicking Policy Invoice Note Tab is==>" + Data);
        return Data;

    }

    //Verify appropriate details should reflect by clicking on policy notes tab on policy information page

    public void clickOnNotesTab() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        driver.findElement(notesTab).click();
        Log.info("Script Has Clicked On Notes Tab On Policy Information Page");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyDetailsOfNotesTabOnPolicyInformationPage() {
        String Data = driver.findElement(detailsOfNotesTab).getText();
        Log.info("Data Display On Clicking Notes Tab is==>" + Data);
        return Data;

    }

    //Verify appropriate details should reflect by clicking on policy  installment tab on policy information page

    public void clickOnInstallmentTab() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        driver.findElement(installmentTab).click();
        Log.info("Script Has Clicked On Installment Tab On Policy Information Page");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyDetailsOfInstallmentTabOnPolicyInformationPage() {
        String Data = driver.findElement(detailsOfInstallmentTab).getText();
        Log.info("Data Display On Clicking Installment Tab is==>" + Data);
        return Data;

    }

    //Verify appropriate details should reflect by clicking on policy exclusion tab on policy information page

    public void clickOnExclusionTab() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        driver.findElement(exclusionTab).click();
        Log.info("Script Has Clicked On Exclusion Tab On Policy Information Page");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyDetailsOfExclusionTabOnPolicyInformationPage() {
        String Data = driver.findElement(detailsOfExclusionTab).getText();
        Log.info("Data Display On Clicking Exclusion Tab is==>" + Data);
        return Data;

    }

    //Verify appropriate details should reflect by clicking on history tab on policy information page

    public void clickOnHistoryTab() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        driver.findElement(historyTab).click();
        Log.info("Script Has Clicked On History Tab On Policy Information Page");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyDetailsOfHistoryTabOnPolicyInformationPage() {
        String Data = driver.findElement(detailsOfHistoryTab).getText();
        Log.info("Data Display On Clicking History Tab is==>" + Data);
        return Data;

    }

    //Verify appropriate details should reflect by clicking on policy ledger tab on policy information page

    public void clickOnPolicyLedgerTab() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        driver.findElement(policyLedgerTab).click();
        Log.info("Script Has Clicked On Policy Ledger Tab On Policy Information Page");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyDetailsOfPolicyLedgerTabOnPolicyInformationPage() {
        String Data = driver.findElement(detailsOfPolicyLedgerTab).getText();
        Log.info("Data Display On Clicking Policy Ledger Tab is==>" + Data);
        return Data;

    }

    //Add claim for existing policy

    public void clickAddClaimIcon() {
        Log.info("*******Script To Create Claim For Existing policy ===PATE-0062-EBBPPR-00000001===start here*****");

        driver.findElement(By.id("PolicyNumber")).sendKeys("PATE-0062-EBBPPR-00000001");
        Log.info("Enter Policy Number ==PATE-0062-EBBPPR-00000001");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.id("SearchGrid")).click();
        Log.info("Click On Search Button On Manage Policy Page");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(cogIconOnPolicyManagePage)).perform();
        Log.info("Script Has Clicked On Cog Icon To Select Add Account Maintenance Page Icon");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(addClaimOnCogIcon).click();
        Log.info("Select Add claim icon from cog dropdown on manage policy page for selected policy to launch add claim page ");

        String displayMessage = " ";
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        Log.info("Script Redirects To Add Claim Page is===>" + driver.getCurrentUrl());


    }

    public void enterClaimPolicyInfo() {


        WebElement element1 = driver.findElement(By.xpath("//div[@class='ibox-content']/div[6]/div[3]/div/div/div[7]/div/div/div/span/span"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement cover = driver.findElement(By.xpath("//div[@class='ibox-content']/div[6]/div[3]/div/div/div[7]/div/div/div/span/span"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", cover);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement optionCover = driver.findElement(By.xpath("//ul[@id='ClaimCoverDetailId_listbox']/li[2]"));
        JavascriptExecutor executor1 = (JavascriptExecutor) driver;
        Log.info("Select Cover Type option==" + optionCover.getText());
        executor1.executeScript("arguments[0].click();", optionCover);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(treatmentDate).sendKeys("02.11.2023");
        Log.info("Entered Treatment Date is== 02.11.2023");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(firstClaimAdvised).sendKeys("02.11.2023");
        Log.info("Entered first claim advised  Date is== 02.11.2023");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        WebElement notifiedDD = driver.findElement(By.xpath("//div[@class='ibox-content']/div[6]/div[4]/div/div/div[3]/div/div/div[5]/div/div/div/span"));
        JavascriptExecutor executor2 = (JavascriptExecutor) driver;
        executor2.executeScript("arguments[0].click();", notifiedDD);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement optionNotifiedDD = driver.findElement(By.xpath("//ul[@id='NotificationMethod_listbox']/li[4]"));
        JavascriptExecutor executor3 = (JavascriptExecutor) driver;
        Log.info("Selected claim notified method is==" + optionNotifiedDD.getText());
        executor3.executeScript("arguments[0].click();", optionNotifiedDD);


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement paymentToDD = driver.findElement(By.xpath("//div[@class='ibox-content']/div[6]/div[4]/div/div/div[3]/div/div/div[8]/div/div/div/span"));
        JavascriptExecutor executor4 = (JavascriptExecutor) driver;
        executor4.executeScript("arguments[0].click();", paymentToDD);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement optionPaymentToDD = driver.findElement(By.xpath("//ul[@id='PayBy_listbox']/li[2]"));
        JavascriptExecutor executor5 = (JavascriptExecutor) driver;
        Log.info("Selected Payment to option is==" + optionPaymentToDD.getText());
        executor5.executeScript("arguments[0].click();", optionPaymentToDD);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement conditionTypeDD = driver.findElement(By.xpath("//div[@class='ibox-content']/div[6]/div[4]/div/div/div[3]/div/div/div[14]/div/div/div/span"));
        JavascriptExecutor executor6 = (JavascriptExecutor) driver;
        executor6.executeScript("arguments[0].click();", conditionTypeDD);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement optionConditionTypeDD = driver.findElement(By.xpath("//ul[@id='ConditionType_listbox']/li[3]"));
        JavascriptExecutor executor7 = (JavascriptExecutor) driver;
        Log.info("Selected condition Type is ==" + optionConditionTypeDD.getText());
        executor7.executeScript("arguments[0].click();", optionConditionTypeDD);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ((JavascriptExecutor) driver).executeScript("document.getElementById('ClaimAmount').style.display='block';");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(claimAmount).sendKeys("1200");
        Log.info("Entered Claim amount is==1200");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement lossCauseDD = driver.findElement(By.xpath("//div[@class='ibox-content']/div[8]/div[2]/div[1]/div[3]/div/div/div/div/div/div/span/span/span[2]"));
        JavascriptExecutor executor8 = (JavascriptExecutor) driver;
        executor8.executeScript("arguments[0].click();", lossCauseDD);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement optionLossCauseDD = driver.findElement(By.xpath("//ul[@id='CauseId_listbox']/li[3]/table/tbody/tr/td[2]/span"));
        JavascriptExecutor executor9 = (JavascriptExecutor) driver;
        Log.info("Selected loss cause is==" + optionLossCauseDD.getText());
        executor9.executeScript("arguments[0].click();", optionLossCauseDD);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    public void clickOnSaveClaimButton() {
        driver.findElement(saveButton).click();
        Log.info("Cliked On Save Button");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Log.info("Generated Claim Number is==" + driver.findElement(By.xpath("//div[@class='ibox-content1 padding-right7']/div/div[2]/div[1]/dl/dd/h2")).getText());


    }

}
