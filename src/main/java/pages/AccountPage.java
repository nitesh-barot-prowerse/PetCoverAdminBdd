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

    private By accountNumberInput = By.cssSelector("input[id='AccountNumber']");

    private By searchButton = By.cssSelector("button[id='SearchGrid']");

    private By clientNameInput = By.cssSelector("input[id='Name']");


    public void clickOnAccountIcon() {
        driver.findElement(accountIcon).click();
    }

    public void traversingThroughPages() {
        WebDriverWait cWait = new WebDriverWait(driver, 10);
        List<WebElement> totalColumn = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='ibox-content']/div/div/a")));
        for (WebElement cLE : totalColumn) {
            System.out.println(cLE.getText());
            if (cLE.getText().equals("Policy Automatic Renewal")) {
                cLE.click();
                System.out.println(driver.getCurrentUrl());
                break;
            }
        }

    }

    public void clickOnBankIcon() {
        WebDriverWait cWait = new WebDriverWait(driver, 10);
        List<WebElement> totalColumn = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='ibox-content']/div/div/a")));
        for (WebElement cLE : totalColumn) {
            cLE.click();
            break;
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
        WebDriverWait cWait = new WebDriverWait(driver, 10);
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
        WebDriverWait cWait = new WebDriverWait(driver, 10);
        List<WebElement> clientName = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridBankList']/table/tbody/tr/td[3]")));
        String name = " ";
        for (WebElement cLE : clientName) {
            name = name + cLE.getText() + " ";
        }
        return name;

    }

    public void clickOnBankCode(){
        WebDriverWait cWait = new WebDriverWait(driver, 10);
        List<WebElement> bankCode = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridBankList']/table/tbody/tr/td[2]")));
        for (WebElement cLE : bankCode) {
            cLE.click();
            break;
        }
    }

    public String verifyBankDetails(){
        WebDriverWait cWait = new WebDriverWait(driver, 10);
        List<WebElement> clientInformation  = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='ibox-content padding-right7']/div/div/div/div/div")));
        String clientInfo = " ";
        for (WebElement cLE : clientInformation) {
            clientInfo = clientInfo + cLE.getText() + " ";
        }
        return clientInfo;

    }


}