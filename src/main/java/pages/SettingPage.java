package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SettingPage {
    private WebDriver driver;

    //1.Create a class constructor
    public SettingPage(WebDriver driver) {
        this.driver = driver;
    }

    private By lookUpIcon= By.cssSelector("ul[id='side-menu']>li:nth-child(11)");

    public void clickIcon(){
        driver.findElement(lookUpIcon).click();
    }


    public void traversingThroughPages() {
        WebDriverWait cWait = new WebDriverWait(driver, 10);
        List<WebElement> totalColumn = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='ibox-content']/div/div/a")));
        for (WebElement cLE : totalColumn) {
            System.out.println(cLE.getText());
            if (cLE.getText().equals("Debtor Code")) {
                cLE.click();
                System.out.println(driver.getCurrentUrl());
                break;
            }
        }
    }
}
