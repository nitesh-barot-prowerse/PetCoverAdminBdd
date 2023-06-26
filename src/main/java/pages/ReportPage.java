package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ReportPage {
    private WebDriver driver;

    public ReportPage(WebDriver driver) {
        this.driver = driver;
    }

    private By reportIcon = By.cssSelector("ul[id='side-menu']>li:nth-child(9)");

    private By quoteReportIcon = By.xpath("//div[@class='ibox']/div[1]/div[1]/div/div[2]/a");

    private By productDropDown = By.xpath("//div[@id='search']/div[1]/div[1]/div/span/span");

    private By optionFromProductDD = By.xpath("//ul[@id='ProductId_listbox']/li[2]");

    private By quoteFromDropDown = By.xpath("//div[@id='search']/div[1]/div[4]/div/span/span");

    private By optionFromQuoteFromDD = By.xpath("//ul[@id='QuoteSaveFrom_listbox']/li[2]");

    private By quoteStatusDropDown = By.xpath("//div[@id='search']/div[1]/div[5]/div/div/div/button");

    private By optionFromQuoteStatusDD = By.xpath("//div[@class='ms-parent']/div/ul/li[2]/label/input");

    private By searchButton = By.cssSelector("button[id='SearchGrid']");

    private By sortByDropDown=By.xpath("//div[@id='search']/div[2]/div[1]/div/span/span");

    private By optionFromSortByDD=By.xpath("//ul[@id='SortName_listbox']/li[2]");

    private By sortByDirectionDropDown=By.xpath("//div[@id='search']/div[2]/div[2]/div/span/span");

    private By optionFromSortByDirectionDD=By.xpath("//ul[@id='SortDirection2_listbox']/li[2]");

    public void clickOnReportIcon() {
        driver.findElement(reportIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public int fetchSections() {
        WebDriverWait cWait = new WebDriverWait(driver, 10);
        List<WebElement> totalColumn = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='ibox']/div/div")));
        int size = totalColumn.size();
        return size;

    }

    public void traversingThroughPages() {

        //Quote
        if (driver.findElement(By.xpath("//div[@class='ibox']/div[1]/div[2]/div/div[2]/a[1]")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox']/div[1]/div[2]/div/div[2]/a[1]")).click();
        } else {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox']/div[1]/div[2]/div/div[2]/a[1]")).click();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(reportIcon).click();


        //Client
        if (driver.findElement(By.xpath("//div[@class='ibox']/div[1]/div[2]/div/div[2]/a[1]")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox']/div[1]/div[2]/div/div[2]/a[1]")).click();
        } else {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox']/div[1]/div[2]/div/div[2]/a[1]")).click();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(reportIcon).click();


        if (driver.findElement(By.xpath("//div[@class='ibox']/div[1]/div[2]/div/div[2]/a[2]")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox']/div[1]/div[2]/div/div[2]/a[2]")).click();
        } else {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox']/div[1]/div[2]/div/div[2]/a[2]")).click();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(reportIcon).click();

        //Policy

        if (driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[1]")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[1]")).click();
        } else {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[1]")).click();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(reportIcon).click();


        if (driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[2]")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[2]")).click();
        } else {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[2]")).click();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(reportIcon).click();


        if (driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[3]")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[3]")).click();
        } else {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[3]")).click();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(reportIcon).click();


//        if (driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[4]")).isEnabled()) {
//            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[4]")).click();
//        } else {
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[4]")).click();
//        }
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(driver.getCurrentUrl());
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        driver.findElement(reportIcon).click();
//
//
//        if (driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[5]")).isEnabled()) {
//            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[5]")).click();
//        } else {
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[5]")).click();
//        }
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(driver.getCurrentUrl());
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        driver.findElement(reportIcon).click();


        if (driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[6]")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[6]")).click();
        } else {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[6]")).click();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(reportIcon).click();


        if (driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[7]")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[7]")).click();
        } else {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[7]")).click();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(reportIcon).click();



       //Claim

        if (driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[2]/div/div[2]/a[1]")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[2]/div/div[2]/a[1]")).click();
        } else {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[2]/div/div[2]/a[1]")).click();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(reportIcon).click();


//        if (driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[2]/div/div[2]/a[2]")).isEnabled()) {
//            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[2]/div/div[2]/a[2]")).click();
//        } else {
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[2]/div/div[2]/a[2]")).click();
//        }
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(driver.getCurrentUrl());
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        driver.findElement(reportIcon).click();


       //Trust Summary
        if (driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[1]")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[1]")).click();
        } else {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[1]")).click();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(reportIcon).click();


        if (driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[2]")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[2]")).click();
        } else {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[2]")).click();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(reportIcon).click();


        if (driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[3]")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[3]")).click();
        } else {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[3]")).click();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(reportIcon).click();


        if (driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[4]")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[4]")).click();
        } else {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[4]")).click();
        }
        try {
            Thread.sleep(3000);
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
        driver.findElement(reportIcon).click();


        if (driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[5]")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[5]")).click();
        } else {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[5]")).click();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(reportIcon).click();

        //Bordereaux
        if (driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[1]")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[1]")).click();
        } else {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[1]")).click();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(reportIcon).click();

        if (driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[2]")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[2]")).click();
        } else {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[2]")).click();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(reportIcon).click();

        if (driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[3]")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[3]")).click();
        } else {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[3]")).click();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(reportIcon).click();

        if (driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[4]")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[4]")).click();
        } else {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[4]")).click();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



    }

    public void clickOnQuoteReportIcon() {
        WebDriverWait cWait = new WebDriverWait(driver, 10);
        WebElement quoteIcon = cWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='ibox']/div[1]/div[1]/div/div[2]/a")));
        quoteIcon.click();

    }

    public void selectOptionFromDropDown() {
        driver.findElement(productDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromProductDD).click();
        driver.findElement(quoteFromDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromQuoteFromDD).click();
        driver.findElement(quoteStatusDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromQuoteStatusDD).click();

    }

    public void clickSearchIcon() {
        driver.findElement(searchButton).click();
    }

    public String verifyQuoteReportData() {
        WebDriverWait cWait = new WebDriverWait(driver, 10);
        List<WebElement> quoteDetails = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='wrapper wrapper-content']/div/div/table/tbody/tr[1]/td")));
        String details = " ";
        for (WebElement cLE : quoteDetails) {
            details = details + cLE.getText();

        }
        return details;
    }

    public void selectOptionFromSortByDropDown(){
        driver.findElement(sortByDropDown).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromSortByDD).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(sortByDirectionDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromSortByDirectionDD).click();
    }

}




