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

    private By reportIcon=By.cssSelector("ul[id='side-menu']>li:nth-child(9)");

    public void clickOnReportIcon(){
        driver.findElement(reportIcon).click();

    }
    public int fetchSections(){
        WebDriverWait cWait = new WebDriverWait(driver, 10);
        List<WebElement> totalColumn = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='ibox']/div/div")));
        int size=totalColumn.size();
        return size;

    }

    public void traversingThroughPages() {
        WebDriverWait cWait = new WebDriverWait(driver, 10);
        List<WebElement> totalColumn = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='ibox']/div/div/div/div[2]/a")));
        for (WebElement cLE : totalColumn) {
            System.out.println(cLE.getText());
            if (cLE.getText().contains("Policy Premium")) {
                cLE.click();
                System.out.println(driver.getCurrentUrl());
                break;
            }
        }
    }

}
