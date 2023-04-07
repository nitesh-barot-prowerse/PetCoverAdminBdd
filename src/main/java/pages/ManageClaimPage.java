package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ManageClaimPage {
    private WebDriver driver;

    public ManageClaimPage(WebDriver driver) {
        this.driver = driver;
    }

    private By manageClaimIcon = By.cssSelector("ul[id='side-menu']>li:nth-child(6)");

    private By manageClaimText = By.xpath("//ul[@id='side-menu']/li[6]/ul/li[1]");

    public void clickManageClaimIcon() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(manageClaimIcon)).perform();
        driver.findElement(manageClaimText).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyClaimPageInformation() {

        WebDriverWait cWait = new WebDriverWait(driver, 10);
        List<WebElement> totalColumn = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody[1]/tr")));
        String itemsDisplayed = " ";
        for (WebElement cEle : totalColumn) {
            itemsDisplayed = itemsDisplayed + " " + cEle.getText();

        }
        return itemsDisplayed;
    }

    public String verifyTreatmentDate() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> claimDateColumn = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody[1]/tr/td[14]")));
        String treatmentDate = " ";
        for (WebElement startDate : claimDateColumn) {
            treatmentDate = treatmentDate + " " + startDate.getText().toString();
        }
        return treatmentDate;
    }

    public String verifyFirstAdvisedDate() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> claimDateColumn = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody[1]/tr/td[15]")));
        String fAdvisedDate = " ";
        for (WebElement startDate : claimDateColumn) {
            fAdvisedDate = fAdvisedDate + " " + startDate.getText().toString();
        }
        return fAdvisedDate;

    }


    public String verifyAmountPayableColumn() {
        WebDriverWait mWait = new WebDriverWait(driver, 10);
        List<WebElement> monthlyPremiumColumn = mWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody[1]/tr/td[16]")));
        String yPremium = " ";
        for (WebElement amountP : monthlyPremiumColumn) {
            yPremium = yPremium + " " + amountP.getText().toString();
        }
        return yPremium;

    }

    }



