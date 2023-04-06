package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class QuotePage {
    private WebDriver driver;

    public QuotePage(WebDriver driver) {
        this.driver = driver;
    }

    private By quoteIcon = By.cssSelector("ul[id='side-menu']>li:nth-child(4)");
    private By displayedMessage = By.xpath("//div[@id='page-wrapper']/div[3]/div/h2");

    public String verifyManageQuotePage() {
        driver.findElement(quoteIcon).click();
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
            date = date +" "+ quoteDate.getText().toString();

        }
        return date;

    }

    public String verifyExpireDateColumnFormat(){
        WebDriverWait eWait = new WebDriverWait(driver, 10);
        List<WebElement> expireDateColumn = eWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody[1]/tr/td[4]")));
        String date = "";
        for (WebElement expireDate : expireDateColumn) {
            date = date +" "+ expireDate.getText().toString();

        }
        return date;

    }
}
