package pages;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class AccountPage {
    private WebDriver driver;

    public AccountPage(WebDriver driver) {
        this.driver = driver;
    }

    private By accountIcon = By.cssSelector("ul[id='side-menu']>li:nth-child(8)");

    //Bank Account Page

    private By bankAccountIcon=By.xpath("//div[@class='ibox-content']/div/div[1]/a");

    private By displayedMessageAtViewBankAccountPage=By.xpath("//div[@class='ibox-content padding-right7']/div/div/div/div/div");

    private By addBankAccountIcon=By.xpath("//div[@class='form-group pull-right']/div/a[2]");

    private By displayedMessageAtAddBankAccountPage=By.xpath("//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2");


    //Manage Receipt Page

    private By manageReceiptIcon=By.xpath("//div[@class='ibox-content']/div/div[2]/a");

    private By addReceiptIcon=By.xpath("//div[@class='form-group pull-right']/div/a[2]");

    private By displayedMessageAtAddAllocatePaymentPage=By.xpath("//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2");



    private By accountNumberInput = By.cssSelector("input[id='AccountNumber']");

    private By searchButton = By.cssSelector("button[id='SearchGrid']");

    private By clientNameInput = By.cssSelector("input[id='Name']");


    //Manage breach register Page

    private By manageBreachRegisterIcon=By.xpath("//div[@class='ibox-content']/div/div[10]/a");

    private By addBreachRegisterIcon=By.xpath("//div[@class='form-group pull-right']/div/a[2]");

    private By displayedMessageAtAddBreachRegisterPage=By.xpath("//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2");

    //Process Credit Card Payment  Page

    private By policyReviewIcon=By.xpath("//div[@class='ibox-content']/div/div[7]/a");

    private By policyEndDate=By.xpath("//div[@id='search']/div[1]/div/span/span/input");

    private By policyToDate=By.xpath("//div[@id='search']/div[2]/div/span/span/input");

    private By searchButtonOnPolicyReview = By.cssSelector("button[id='SearchGrid']");


    //Process Credit Card Payment  Page

    private By processCreditCardPaymentIcon=By.xpath("//div[@class='ibox-content']/div/div[14]/a");

    private By paymentDueDate=By.xpath("//div[@id='search']/div/div[1]/div/span/span/input");

    private By receiptDate=By.xpath("//div[@id='search']/div/div[2]/div/span/span/input");

    private By searchButtonOnProcessCreditCardPayment = By.cssSelector("button[id='SearchGrid']");




    public void clickOnAccountIcon() {
        driver.findElement(accountIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void traversingThroughPages() {

        if (driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[1]/a")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[1]/a")).click();
        } else {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[1]/a")).click();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(accountIcon).click();


        if (driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[2]/a")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[2]/a")).click();
        } else {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[2]/a")).click();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(accountIcon).click();


        if (driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[3]/a")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[3]/a")).click();
        } else {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[3]/a")).click();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(accountIcon).click();


        if (driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[4]/a")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[4]/a")).click();
        } else {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[4]/a")).click();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(accountIcon).click();


        if (driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[5]/a")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[5]/a")).click();
        } else {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[5]/a")).click();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(accountIcon).click();


        if (driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[6]/a")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[6]/a")).click();
        } else {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[6]/a")).click();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(accountIcon).click();


        if (driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[7]/a")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[7]/a")).click();
        } else {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[7]/a")).click();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(accountIcon).click();


        if (driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[8]/a")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[8]/a")).click();
        } else {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[8]/a")).click();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(accountIcon).click();


        if (driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[9]/a")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[9]/a")).click();
        } else {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[9]/a")).click();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(accountIcon).click();


        if (driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[10]/a")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[10]/a")).click();
        } else {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[10]/a")).click();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(accountIcon).click();


        if (driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[11]/a")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[11]/a")).click();
        } else {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[11]/a")).click();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(accountIcon).click();


        if (driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[12]/a")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[12]/a")).click();
        } else {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[12]/a")).click();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(accountIcon).click();


        if (driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[13]/a")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[13]/a")).click();
        } else {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[13]/a")).click();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(accountIcon).click();


        if (driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[14]/a")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[14]/a")).click();
        } else {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[14]/a")).click();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(accountIcon).click();


        if (driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[15]/a")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[15]/a")).click();
        } else {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[15]/a")).click();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //From here make comment
        driver.findElement(accountIcon).click();


        if (driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[16]/a")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[16]/a")).click();
        } else {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[16]/a")).click();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(accountIcon).click();


        if (driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[17]/a")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[17]/a")).click();
        } else {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[17]/a")).click();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        //Report Pages


//        driver.findElement(accountIcon).click();
//
//
//        if (driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[18]/a")).isEnabled()) {
//            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[18]/a")).click();
//        } else {
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[18]/a")).click();
//        }
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(driver.getCurrentUrl());
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }


        /*driver.findElement(accountIcon).click();
        driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[19]/a")).click();
        System.out.println(driver.getCurrentUrl());
        driver.findElement(accountIcon).click();
        driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[20]/a")).click();
        System.out.println(driver.getCurrentUrl());
        driver.findElement(accountIcon).click();
        driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[21]/a")).click();
        System.out.println(driver.getCurrentUrl());
        driver.findElement(accountIcon).click();
        driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[22]/a")).click();
        System.out.println(driver.getCurrentUrl());
        driver.findElement(accountIcon).click();*/


    }
    public void clickOnBankIcon() {
        driver.findElement(bankAccountIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }



    public void enterAccountNumber() {
        driver.findElement(accountNumberInput).sendKeys("55771199");

    }

    public void clickOnSearchButton() {
        driver.findElement(searchButton).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyAccountNumber() {
        WebDriverWait cWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> accountNumber = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridBankList']/table/tbody/tr/td[4]")));
        String account = " ";
        for (WebElement cLE : accountNumber) {
            account = account + cLE.getText() + " ";
        }
        return account;

    }

    public void enterClientName() {
        driver.findElement(clientNameInput).sendKeys("Petplan Claims CUL");

    }

    public String verifyClientName() {
        WebDriverWait cWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> clientName = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridBankList']/table/tbody/tr/td[3]")));
        String name = " ";
        for (WebElement cLE : clientName) {
            name = name + cLE.getText() + " ";
        }
        return name;

    }

    //Bank Information page displays with details after clicking on bank code link on manage bank details

    public void clickOnBankCode() {
        WebDriverWait cWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> bankCode = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridBankList']/table/tbody/tr/td[2]")));
        for (WebElement cLE : bankCode) {
            cLE.click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            break;
        }
    }

    public String verifyBankDetails() {
      return driver.findElement(displayedMessageAtViewBankAccountPage).getText();

    }

    //Add Bank page  displays will all details when user clicks on add bank icon on manage bank page

    public void clickOnAddBankIcon() {
        driver.findElement(addBankAccountIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyAddBankPage() {
        return driver.findElement(displayedMessageAtAddBankAccountPage).getText();

    }

    //Add receipt page  displays will all details when user clicks on add receipt icon on manage receipt page

    public void clickOnManageReceiptIcon() {
        driver.findElement(manageReceiptIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


    public void clickOnAddReceiptIcon() {
        driver.findElement(addReceiptIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyAddAllocatePaymentPage() {
        return driver.findElement(displayedMessageAtAddAllocatePaymentPage).getText();

    }


    //Add breach register page  displays will all details when user clicks on add breach register icon on manage breach register page

    public void clickOnManageBreachRegisterIcon() {
        driver.findElement(manageBreachRegisterIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


    public void clickOnAddBreachRegisterIcon() {
        driver.findElement(addBreachRegisterIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyAddBreachRegisterPage() {
        return driver.findElement(displayedMessageAtAddBreachRegisterPage).getText();

    }

    //Filter Policy review information upon policy end date and to date

    public void clickOnPolicyReviewIcon() {
        driver.findElement(policyReviewIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void enterPolicyFromAndToDate() {

        driver.findElement(policyEndDate).clear();

        driver.findElement(policyEndDate).sendKeys("12.04.2022");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(policyToDate).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(policyToDate).sendKeys("12.08.2024");


    }

    public void clickSearchIconOnPolicyReview() {
        driver.findElement(searchButtonOnPolicyReview).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyPolicyReviewData() {
        WebDriverWait cWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> PolicyReviewDetails = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='divLoadRenewalList']/div/table/tbody/tr")));
        String details = " ";
        for (WebElement cLE : PolicyReviewDetails) {
            details = details + cLE.getText();

        }
        return details;
    }

    //Filter Process Credit Card Payment information upon payment due date and receipt date

    public void clickOnProcessCreditCardPaymentIcon() {
        driver.findElement(processCreditCardPaymentIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void enterFromAndToDate() {

        driver.findElement(paymentDueDate).clear();

        driver.findElement(paymentDueDate).sendKeys("12.02.2022");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(receiptDate).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(receiptDate).sendKeys("12.08.2024");


    }

    public void clickSearchIconOnPolicyHistory() {
        driver.findElement(searchButtonOnProcessCreditCardPayment).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyPolicyCreditCardPaymentData() {
        WebDriverWait cWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> PolicyCreditCardPaymentDetails = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridPolicyDueInvoiceGrid']/table/tbody/tr")));
        String details = " ";
        for (WebElement cLE : PolicyCreditCardPaymentDetails) {
            details = details + cLE.getText();

        }
        return details;
    }


}