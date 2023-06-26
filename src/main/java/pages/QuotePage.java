package pages;

import org.apache.logging.log4j.core.util.Assert;
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

public class QuotePage {
    private WebDriver driver;

    public QuotePage(WebDriver driver) {
        this.driver = driver;
    }

    private By quoteIcon = By.cssSelector("ul[id='side-menu']>li:nth-child(4)");
    private By displayedMessage = By.xpath("//div[@id='page-wrapper']/div[3]/div/h2");

    private By addQuoteButton = By.xpath("//div[@class=' tooltip-demo pull-right']/a[2]");

    private By messageOnAddQuotePage = By.xpath("//div[@id='page-wrapper']/div[3]/div/h2");

    private By monthlyPremiumColumn = By.xpath("//div[@id='gridName']/table/tbody[1]/tr/td[16]");

    private By microchipButton = By.xpath("//div[@class='form-group pull-right']/div/a[3]");

    private By productListDropDown = By.xpath("//div[@class='ibox-content']/div/div/div[4]/div/div/span");

    private By quoteStatusDropDown = By.xpath("//div[@class='ibox-content-search m-b-sm']/div/div/div[5]/div/div/div/button");

    private By statusOpen = By.xpath("//div[@class='ms-drop']/ul/li[1]");

    //Fetch quote list based upon product dropdown options

    private By productDropdown = By.xpath("//div[@class='ibox-content-search m-b-sm']/div[1]/div[1]/div[2]/div/span");

    private By optionsFromProductDD = By.xpath("//ul[@id='ProductId_listbox']/li[3]");

    private By searchButton = By.cssSelector("button[id='SearchGrid']");

    //Fetch quote on manage quote page based on quote number

    private By quoteSearchBox = By.cssSelector("input[id='QuoteNumber']");

    //Verify include payment feature of quote module for Qa

    private By includePaymentCheckBox = By.cssSelector("div[id='search']>:nth-child(2)>:nth-child(4)>:nth-child(1)>div[class^='icheckbox_square-green']");


    //Edit quote information and verifies the same

    private By selectCogIcon = By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[20]/ul/li/a");

    private By selectEditQuoteIcon = By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[20]/ul/li/ul/li[1]/a");

    private By enterPostCodeInAddressDropDown = By.cssSelector("input[id='Address1']");

    private By selectPostCodeFromDD = By.xpath("//div[@id='cc_c2a']/ul/li[3]");

    private By hearAboutUsDropDown = By.xpath("//div[@id='divhear']");

    private By selectOptionFromHearAboutUsDD = By.xpath("//ul[@id='HearAboutUs_listbox']/li[3]");

    private By petBreedDropDown = By.xpath("//div[@id='Div_11366']/div/div/span");

    private By selectOptionFromPrtBreedDD = By.xpath("//ul[@id='Question_11366_listbox']/li[16]");

    private By petGenderDropDown = By.xpath("//div[@id='Div_11367']/div/div/span");

    private By selectOptionsFromPetGDD = By.xpath("//ul[@id='Question_11367_listbox']/li[2]");

    private By petBirthDate = By.cssSelector("input[id='Question_11368']");

    private By petPurchaseAmount = By.xpath("//div[@id='Div_11369']/div/div/span/span/input");

    private By petAdminFees = By.cssSelector("input[id='Question_11370']");

  //  private By calculateButton = By.xpath("//button[@id='btnCalculate']");

   // private By closeButton = By.xpath("//button[@class='btn btn-primary' and @data-dismiss='modal']");

   // private By saveButton = By.xpath("//div[@id='divQuoteSavebutton']/div[2]/div/button[2]");

   // private By fetchPetBreed = By.xpath("//div[@class='col-lg-4 view-column form-group ']/div[3] /div/label");


    public String verifyManageQuotePage() {
        driver.findElement(quoteIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return driver.findElement(displayedMessage).getText();
    }

    public String fetchAndDisplayedData() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> totalRow = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr")));
        String array = " ";
        for (WebElement rEle : totalRow) {
            array = array + " " + rEle.getText();
        }
        return array;
    }

    public String verifyQuoteDateColumnForamt() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> quoteDateColumn = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody[1]/tr/td[3]")));
        String date = "";
        for (WebElement quoteDate : quoteDateColumn) {
            date = date + " " + quoteDate.getText().toString();

        }
        return date;

    }

    public String verifyExpireDateColumnFormat() {
        WebDriverWait eWait = new WebDriverWait(driver, 10);
        List<WebElement> expireDateColumn = eWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody[1]/tr/td[4]")));
        String date = "";
        for (WebElement expireDate : expireDateColumn) {
            date = date + " " + expireDate.getText().toString();

        }
        return date;

    }

    public void clickOnAddQuoteButton() {
        driver.findElement(addQuoteButton).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyAddQuotePage() {
        return driver.findElement(messageOnAddQuotePage).getText();
    }

    public String verifyTotalPremiumColumn() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("arguments[0].scrollIntoView();", driver.findElement(monthlyPremiumColumn));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> yearlyPremiumColum = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody[1]/tr/td[15]")));
        String yPremium = " ";
        for (WebElement amountP : yearlyPremiumColum) {
            yPremium = yPremium + " " + amountP.getText().toString();
        }
        return yPremium;
    }

    public String verifyMonthlyPremiumColumn() {
        WebDriverWait mWait = new WebDriverWait(driver, 10);
        List<WebElement> monthlyPremiumColumn = mWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody[1]/tr/td[16]")));
        String yPremium = " ";
        for (WebElement amountP : monthlyPremiumColumn) {
            yPremium = yPremium + " " + amountP.getText().toString();
        }
        return yPremium;

    }

    public String clickOnMicrochipButton() {
        driver.findElement(microchipButton).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return driver.findElement(displayedMessage).getText();
    }

    public String verifyDataOnMicrochipPage() {
        WebDriverWait rWait = new WebDriverWait(driver, 10);
        List<WebElement> totalRow = rWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='MicrochipFileUploadAuditGrid']/table/tbody/tr")));
        String data = " ";
        for (WebElement rEle : totalRow) {
            data = data + " " + rEle.getText();
        }
        return data;
    }

    public String verifyProductList() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(productListDropDown).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> pList = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("ul[id='PrimaryProductId_listbox']>li")));
        System.out.println(pList.size());

        String verfiy = " ";
        for (WebElement product : pList) {

            verfiy = verfiy + product.getText() + " ";

        }
        return verfiy;
    }

    public String fetchDataOfQuoteInformation() {
        WebDriverWait cWait = new WebDriverWait(driver, 10);
        List<WebElement> totalColumn = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody[1]/tr/td[2]/a")));
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
//Items on manage quote page displays upon option selects from quote status dropdown
    public void SelectItemFromDropDown() {
        driver.findElement(quoteStatusDropDown).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(statusOpen).click();
        driver.findElement(searchButton).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String fetchAndVerifyDataAgainstDropDown() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> totalRow = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr")));
        String array = " ";
        for (WebElement rEle : totalRow) {
            array = array + " " + rEle.getText();
        }
        return array;
    }

    //Fetch list of quote based upon product drop down

    public void selectOptionFromProductDropDown() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(productDropdown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionsFromProductDD).click();

    }

    public void clickOnSearchButton() {
        driver.findElement(searchButton).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public List<WebElement> verifyListOfQuoteBasedOnProductDD() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> listOfProduct = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr")));
        return listOfProduct;

    }


    //Fetch quote on manage quote page based on quote number for UK2 Qa

    public void enterQuoteNumberInsideSearchBox() {
        driver.findElement(quoteSearchBox).sendKeys("Q0042274");
    }

    public String verifyQuoteDetails() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement quoteInfo = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='gridName']/table/tbody/tr[1]")));
        return quoteInfo.getText();
    }


    //Fetch quote on manage quote page based on quote number for stage

    public void enterQuoteNumberInsideSearchBoxStage() {
        driver.findElement(quoteSearchBox).sendKeys("Q0064379");
    }


    //Verify include payment feature of quote module for Qa

    public void selectIncludePaymentCheckBox() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(includePaymentCheckBox).click();


    }

    public String verifyIncludePaymentDetailsOfQuote() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement quoteInfoIncludePayment = driver.findElement(By.xpath("//div[@id='gridName']/table/tbody/tr"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", quoteInfoIncludePayment);
        //WebDriverWait wait=new WebDriverWait(driver,10);
        // WebElement quoteInfoIncludePayment=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return quoteInfoIncludePayment.getText();
    }

    //Edit quote information and verifies the same

    public void clickOnQuoteNumber() {

        WebDriverWait cWait = new WebDriverWait(driver, 10);
        WebElement quoteNumber = cWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[2]/a")));
        quoteNumber.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void selectEditQuoteOption(){
        WebElement cogIcon = driver.findElement(By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[20]/ul/li/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cogIcon);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(selectCogIcon)).perform();
        driver.findElement(selectEditQuoteIcon).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void editQuoteDetails(){
        //Scroll up
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        driver.findElement(enterPostCodeInAddressDropDown).clear();
        driver.findElement(enterPostCodeInAddressDropDown).sendKeys("RM8 2TE");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(selectPostCodeFromDD).click();

        driver.findElement(hearAboutUsDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(selectOptionFromHearAboutUsDD).click();

        //Scroll up
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,-150)", "");
        driver.findElement(petBreedDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(selectOptionFromPrtBreedDD).click();

        driver.findElement(petGenderDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(selectOptionsFromPetGDD).click();

        driver.findElement(petBirthDate).clear();
        driver.findElement(petBirthDate).sendKeys("02.08.2020");


        //driver.findElement(petPurchaseAmount).clear();
        //driver.findElement(petPurchaseAmount).sendKeys("500");

        //driver.findElement(petAdminFees).clear();
        //driver.findElement(petAdminFees).sendKeys("20");

        //driver.findElement(calculateButton).click();
        /*((JavascriptExecutor) driver).executeScript("arguments[0].click()", driver.findElement(calculateButton));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,150)", "");

        //driver.findElement(closeButton).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", driver.findElement(closeButton));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/


    }




}
