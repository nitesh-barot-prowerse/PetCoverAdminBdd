package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ClientPage {
    private WebDriver driver;

    public ClientPage(WebDriver driver) {
        this.driver = driver;
    }

    //Elements
    private By clientIcon = By.cssSelector("ul[id='side-menu']>li:nth-child(3)");
    private By displayedMessage = By.xpath("//div[@id='page-wrapper']/div[3]/div/h2");

    private By searchBox=By.cssSelector("input[id='SearchText']");

    private By searchButton= By.cssSelector("button[id='SearchGrid']");

    private By statusDropDown= By.xpath("//div[@class='ibox-content-search m-b-sm']/div/div[2]/div/span/span");

    private By clientStatus=By.xpath("//ul[@id='IsActive_listbox']/li[2]");

    private By displayedStatus=By.xpath("//div[@class='tooltip-demo pull-right']/div/button");

    private By addQuoteForClient= By.cssSelector("a[id='btnAddClientView']");

    private By existingClientId= By.xpath("//div[@id='loadpartialview']/div/div/div[2]/div/div");




    public String verifyClientManage() {
        driver.findElement(clientIcon).click();
        return driver.findElement(displayedMessage).getText();
    }

    public String fetchAndDisplayData() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> totalRow = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr")));
        String array = " ";
        for (WebElement rEle : totalRow) {
            array = array +" " +rEle.getText();
        }
        return array;

    }

    public void enterCodeDetails(){
        driver.findElement(searchBox).sendKeys("DANK-00005");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickOnButton(){
        driver.findElement(searchButton).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public String verifyClient(){
        WebDriverWait wait=new WebDriverWait(driver,10);
        List<WebElement> clientInfo=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr/td[2]")));
        String clientCode=" ";
        for(WebElement client:clientInfo){
            clientCode=client.getText();
            break;
        }
        return clientCode;
    }

    public void selectClientStatus(){
        driver.findElement(statusDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(clientStatus).click();
    }

    public void clickClientCode(){
        WebDriverWait wait=new WebDriverWait(driver,10);
        List<WebElement> clientInfo=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr/td[2]")));
        for(WebElement client:clientInfo){
            client.click();
            break;
        }
    }

    public String verifyClientStatus(){
        String Status=driver.findElement(displayedStatus).getText();
        return Status;
    }

    public void clickOnAddQuoteButton(){
        driver.findElement(addQuoteForClient).click();
    }

    public String verifyExistingClientOnAddQuote(){
        return driver.findElement(existingClientId).getText();
    }


}
