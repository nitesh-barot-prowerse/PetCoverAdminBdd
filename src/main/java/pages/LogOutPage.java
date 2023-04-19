package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage  {
    private WebDriver driver;

    //1.Create a class constructor
    public LogOutPage(WebDriver driver) {
        this.driver = driver;
    }

    //Login Form Elements
    private By logOutIcon = By.cssSelector("ul[id='side-menu']>li:nth-child(12)");
    private By logInMessage = By.xpath("//div[@class='middle-box text-center loginscreen']/header/h4");


    //Methods
    public void clickOnLogOutButton(){
       driver.findElement(logOutIcon).click();
    }
    public String verifyLogInPage()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return driver.findElement(logInMessage).getText();
    }


}
