package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
    public WebDriver driver;
    public DashBoardPage(WebDriver driver) {
        this.driver = driver;
    }

    //Elements
    private By clientTag = By.xpath("//div[@class='panel panel-primary']/div/div/div/div/a");

    private By totalClient = By.xpath("//div[@class='panel panel-primary']/div/div/div[2]/div/span");

    private By monthlyClient = By.xpath("//div[@class='panel panel-primary']/div/div/div[3]/div/span");

    private By quoteTag = By.xpath("//div[@class='panel panel-green']/div/div/div/div/a");

    private By totalQuote = By.xpath("//div[@class='panel panel-green']/div/div/div[2]/div/span");

    private By monthlyQuote = By.xpath("//div[@class='panel panel-green']/div/div/div[3]/div/span");

    private By policyTag = By.xpath("//div[@class='panel panel-yellow']/div/div/div/div/a");

    private By totalPolicy = By.xpath("//div[@class='panel panel-yellow']/div/div/div[2]/div/span");

    private By monthlyPolicy = By.xpath("//div[@class='panel panel-yellow']/div/div/div[3]/div/span");

    private By claimTag = By.xpath("//div[@class='panel panel-red']/div/div/div/div/a");

    private By totalClaims = By.xpath("//div[@class='panel panel-red']/div/div/div[2]/div/span");


    private By monthlyClaims = By.xpath("//div[@class='panel panel-red']/div/div/div[3]/div/span");

    public String verifyClientDetails() {
        String client = driver.findElement(clientTag).getText();
        String total = driver.findElement(totalClient).getText();;
        String monthly = driver.findElement(monthlyClient).getText();;
        return client + " " + total + " " + monthly;
    }

    public String verifyQuote() {
        String quote = driver.findElement(quoteTag).getText();
        String totalQ = driver.findElement(totalQuote).getText();
        String monthQ = driver.findElement(monthlyQuote).getText();
        return quote + " " + totalQ + " " + monthQ;

    }

    public String verifyPolicy() {
        String policy = driver.findElement(policyTag).getText();
        String totalP = driver.findElement(totalPolicy).getText();
        String monthP = driver.findElement(monthlyPolicy).getText();
        return policy + " " + totalP + " " + monthP;
    }

    public String verifyClaims() {
        String claims = driver.findElement(claimTag).getText();
        String totalC = driver.findElement(totalClaims).getText();
        String monthC = driver.findElement(monthlyClaims).getText();
        return claims + " " + totalC + " " + monthC;
    }
}
