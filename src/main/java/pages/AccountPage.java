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

    public void clickOnBankCode() {
        WebDriverWait cWait = new WebDriverWait(driver, 10);
        List<WebElement> bankCode = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridBankList']/table/tbody/tr/td[2]")));
        for (WebElement cLE : bankCode) {
            cLE.click();
            break;
        }
    }

    public String verifyBankDetails() {
        WebDriverWait cWait = new WebDriverWait(driver, 10);
        List<WebElement> clientInformation = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='ibox-content padding-right7']/div/div/div/div/div")));
        String clientInfo = " ";
        for (WebElement cLE : clientInformation) {
            clientInfo = clientInfo + cLE.getText() + " ";
        }
        return clientInfo;

    }


}