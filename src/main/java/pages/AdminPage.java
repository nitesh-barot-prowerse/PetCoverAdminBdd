package pages;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

    private By productIcon = By.xpath("//div[@class='ibox-content']/div/div[1]/a/i");

    private By productName = By.xpath("//div[@class='ibox view']/div/div[2]/div/dl/dd[1]/h2");

    private By settingsIcon = By.xpath("//div[@id='gridName']/table/tbody/tr/td[5]/ul/li");

    private By insurerConfigIcon = By.xpath("//div[@id='gridName']/table/tbody/tr/td[5]/ul[1]/li/ul/li[1]/a[1]");

    private By insurerDetail = By.xpath("//div[@id='gridInsurerConfiguration']/table/tbody/tr");

    private By agentDetail = By.xpath("///div[@id='gridAgentConfiguration']/table/tbody/tr");

    private By searchInput = By.cssSelector("input[id='SearchText']");

    private By searchButton = By.cssSelector("button[id='SearchGrid']");

    private By departmentIcon = By.xpath("//div[@class='ibox-content']/div/div[2]/a/i");

    private By bankAccountIcon = By.xpath("//div[@class='ibox-content']/div/div[4]/a/i");

    private By bankAccountDropDown = By.xpath("//div[@class='ibox-content-search m-b-sm']/div/div[1]/div/span/span");

    private By itemFromBADD = By.xpath("//ul[@id='BankAccount_listbox']/li[7]");

    private By insurerDropDown = By.xpath("//div[@class='ibox-content-search m-b-sm']/div/div[2]/div/span/span");

    private By itemFromIDD = By.xpath("//ul[@id='Insurer_listbox']/li[6]");

    private By searchButtonOfManageBank = By.cssSelector("button[id='SearchGrid']");

    private By addBankAccountIcon = By.xpath("//div[@class='form-group pull-right']/div/a[2]");

    private By displayedMessageOnAddBankAccount = By.xpath("//form[@id='bankForm']/div/div/div/div/h5");

    private By editIconAgainstInsurer=By.xpath("//div[@id='gridBankAccount']/table/tbody/tr[1]/td[7]/div/a");

    private By insurerNameInput=By.xpath("//div[@class='ibox float-e-margins']/div[2]/div[1]/div/div/div/span");

    private By insurerNameInputDD=By.xpath("//ul[@id='Insurer_listbox']/li[3]");

    private By accountTypeInput= By.xpath("//div[@class='ibox float-e-margins']/div[2]/div[2]/div/div/div/input[2]");

    private By bankAccountNameInput=By.xpath("//div[@class='ibox float-e-margins']/div[2]/div[3]/div/div/div/input");

    private By bankAccountNumberInput=By.xpath("//div[@class='ibox float-e-margins']/div[2]/div[4]/div/div/div/input");

    private By bicNUmberInput=By.xpath("//div[@class='ibox float-e-margins']/div[2]/div[5]/div/div/div/input");


    public void clickAdminIcon() {
        driver.findElement(adminIcon).click();
    }

    public void clickOnLetterIcon() {
        driver.findElement(letterIcon).click();
    }

    public String fetchData() {
        WebDriverWait waitR = new WebDriverWait(driver, 10);
        List<WebElement> totalRow = waitR.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr")));
        String data = " ";
        for (WebElement trRow : totalRow) {
            data = data + " " + trRow.getText();
        }
        return data;
    }

    public void clickOnAddLetterTemplateIcon() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> totalHead = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(editLetterTemplateButton));
        for (WebElement thHead : totalHead) {
            thHead.click();
            break;
        }
        try {
            Thread.sleep(1000);
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
        WebDriverWait wait1 = new WebDriverWait(driver, 10);
        String order = "23";
        wait1.until(ExpectedConditions.visibilityOf(element)).sendKeys(order);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(subjectField)).clear();
        driver.findElement(subjectField).sendKeys("Testing Purpose");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void traversingThroughPages() {
        WebDriverWait cWait = new WebDriverWait(driver, 10);
        List<WebElement> totalColumn = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='ibox-content']/div/div/a")));
        for (WebElement cLE : totalColumn) {
            System.out.println(cLE.getText());
            if (cLE.getText().equals("Insurer")) {
                cLE.click();
                System.out.println(driver.getCurrentUrl());
                break;
            }
        }
    }

    public void clickOnProductIcon() {
        driver.findElement(productIcon).click();

    }

    public void clickOnProductCode() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> productCode = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr/td[2]")));
        for (WebElement pCode : productCode) {
            pCode.click();
            break;
        }

    }

    public String verifyProductDetails() {
        return driver.findElement(productName).getText();

    }

    public void clickOnInsurerConfigIcon() {
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> settingIcon = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr/td[5]/ul/li")));
        for (WebElement stg : settingIcon) {
            actions.moveToElement(stg).perform();
            WebDriverWait wait1 = new WebDriverWait(driver, 10);
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
        return driver.findElement(insurerDetail).getText();
    }

    public void clickOnAgentConfigIcon() {
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> settingIcon = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr/td[5]/ul/li")));
        for (WebElement stg : settingIcon) {
            actions.moveToElement(stg).perform();
            WebDriverWait wait1 = new WebDriverWait(driver, 10);
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
        return driver.findElement(agentDetail).getText();
    }

    public void clickDepartmentIcon() {
        driver.findElement(departmentIcon).click();
    }

    public void enterDepartmentInSearch() {
        driver.findElement(searchInput).sendKeys("Inbound");
    }

    public void clickSearchButton() {
        driver.findElement(searchButton).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyDepartmentName() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> department = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[2]")));
        String depart = " ";
        for (WebElement dep : department) {
            depart = depart + dep.getText();
        }
        return depart;
    }

    public void clickOnBankAccountIcon() {
        driver.findElement(bankAccountIcon).click();
    }

    public String fetchAndDisplayBankAccountData() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> bankDetails = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridBankAccount']/table/tbody/tr/td")));
        String bankDetail = " ";
        for (WebElement bankD : bankDetails) {
            bankDetail = bankDetail + bankD.getText();

        }
        return bankDetail;

    }

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
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyBankAccountDetails() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> insurerName = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridBankAccount']/table/tbody/tr/td[2]")));
        String insurer = " ";
        for (WebElement insu : insurerName) {
            insurer = insurer + insu.getText();
        }
        List<WebElement> bankAccountName = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridBankAccount']/table/tbody/tr/td[3]")));
        String bankAccount = " ";
        for (WebElement accountName : bankAccountName) {
            insurer = insurer + accountName.getText();
        }
        return bankAccount + insurer;


    }

    public void clickOnAddBankAccountIcon() {
        driver.findElement(addBankAccountIcon).click();
    }

    public String verifyAddBankAccountPage() {
        return driver.findElement(displayedMessageOnAddBankAccount).getText();
    }

    public void clickOnEditIconOfInsurer(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(editIconAgainstInsurer).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void editDataOfEditBankAccountPage(){
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


}



