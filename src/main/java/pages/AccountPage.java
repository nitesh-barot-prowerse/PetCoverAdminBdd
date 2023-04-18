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


    public void clickOnAccountIcon() {
        driver.findElement(accountIcon).click();
    }

    public void traversingThroughPages() {
        WebDriverWait cWait = new WebDriverWait(driver, 10);
        List<WebElement> totalColumn = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='ibox-content']/div/div/a")));
        for (WebElement cLE:totalColumn){
            System.out.println(cLE.getText());
            if(cLE.getText().equals("Policy Automatic Renewal"))
            {
                cLE.click();
                System.out.println(driver.getCurrentUrl());
                break;
            }
        }

        //Store the ID of the original window


    }


}