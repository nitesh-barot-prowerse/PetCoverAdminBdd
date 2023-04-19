package pages;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

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

    private By orderField=By.cssSelector("input[id='DisplayOrder']");

    private By subjectField = By.cssSelector("input[id='Subject']");


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
        WebElement element=driver.findElement(By.id("DisplayOrder"));
        WebDriverWait wait1=new WebDriverWait(driver,10);
        String order="23";
        wait1.until(ExpectedConditions.visibilityOf(element)).sendKeys(order);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebDriverWait wait=new WebDriverWait(driver,10);
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
}
