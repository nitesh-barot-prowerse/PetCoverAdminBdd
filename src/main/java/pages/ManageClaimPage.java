package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

    private By displayedMessage = By.xpath("//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2");


    private By addClaimIcon = By.xpath("//div[@class=' tooltip-demo pull-right']/a[2]");

    private By treatmentDropdown = By.xpath("//div[@class='well1']/div/div/div/div/span/span/span[@class='k-input']");

    private By riskCountryDropDown = By.xpath("//div[@class='ibox-content']/div[6]/div[2]/div[1]/div/div/div[3]/div/div/div/span");

    private By lostCountryDropDown = By.xpath("//div[@class='ibox-content']/div[6]/div[2]/div[2]/div[3]/div/div[3]/div/div/div/span");

    private By insuredCountryDropDown = By.xpath("//div[@class='ibox-content']/div[6]/div[3]/div/div/div[6]/div/div/div/span");

    private By coverDropDown = By.xpath("//div[@class='ibox-content']/div[6]/div[3]/div/div/div[7]/div/div/div/span");

    private By statusDropDown = By.xpath("//div[@class='ibox-content']/div[6]/div[3]/div[3]/div[3]/div/div[5]/div/div/div/span");

    private By notifiedMethodDDown = By.xpath("//div[@class='ibox-content']/div[6]/div[4]/div/div/div[3]/div/div//div[5]/div/div/div/span");

    private By paymentToDDown = By.xpath("//div[@class='ibox-content']/div[6]/div[4]/div/div/div[3]/div/div//div[8]/div/div/div/span");

    private By conditionTypeDDown = By.xpath("//div[@class='ibox-content']/div[6]/div[4]/div/div/div[3]/div/div/div[14]/div/div/div/span");

    private By treatmentStatusDropDown=By.xpath("//div[@class='controls']/div/button");

    private By selectItemFromStatusDropDown=By.xpath("//div[@class='ms-parent']/div/ul/li[2]/label/input");

    private By clickSearchButton=By.cssSelector("button[id='SearchGrid']");




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

    public String redirectToClaimInformationPage() {

        WebDriverWait cWait = new WebDriverWait(driver, 10);
        List<WebElement> totalColumn = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody[1]/tr/td[5]/a")));
        int cSize = totalColumn.size();
        String displayMessage = " ";

        for (WebElement cEle : totalColumn) {
            System.out.println(cEle.getText());
            cEle.click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs2.get(1));
            //System.out.println(driver.getCurrentUrl());

            System.out.println(driver.getCurrentUrl());
            displayMessage = displayMessage + driver.findElement(displayedMessage).getText();


            driver.close();
            driver.switchTo().window(tabs2.get(0));
        }
        return displayMessage;
    }

    public String verifyClaimInfoPageText() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //driver.close();
        //driver.switchTo().window(tabs2.get(0));
        return driver.findElement(displayedMessage).getText();

    }

    public void clickAddClaimIcon() {
        driver.findElement(addClaimIcon).click();
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyAddClaimPage() {
        return driver.findElement(displayedMessage).getText();
    }

    public void verifyDropDown() {
        driver.findElement(treatmentDropdown).click();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(riskCountryDropDown).click();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(lostCountryDropDown).click();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(insuredCountryDropDown).click();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        driver.findElement(coverDropDown).click();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(statusDropDown).click();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(notifiedMethodDDown).click();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(paymentToDDown).click();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(conditionTypeDDown).click();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //Treatment status should reflect upon option selected from treatment status drop down on manage claim page

    public void selectItemFromStatusDropDown(){
        driver.findElement(treatmentStatusDropDown).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(selectItemFromStatusDropDown).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(clickSearchButton).click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyTreatmentStatus(){
        WebDriverWait cWait = new WebDriverWait(driver, 10);
        List<WebElement> treatmentStatus = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr")));

        String Status = " ";
        for (WebElement cEle : treatmentStatus) {
           // System.out.println(cEle.getText());
            Status = Status + " " + cEle.getText();

        }
        return Status;

    }

}



