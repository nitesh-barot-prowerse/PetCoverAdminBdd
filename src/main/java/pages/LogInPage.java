package pages;


import actions.LoginActions;
import dataModels.LogIn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LogInPage extends LoginActions  {
    private WebDriver driver;

    //1.Create a class constructor
    public LogInPage(WebDriver driver) {
        this.driver = driver;
    }


    LogIn login;



    //Login Form Elements
    private By emailField = By.xpath("//input[@id='UserName']");
    private By passwordField = By.xpath("//input[@id='Password']");
    private By accountLoginButton = By.xpath("//button[@id='login']");
    private By dashBoardTitle = By.cssSelector("h2[class='main-title']");
    private By roleText = By.xpath("//span[@class='welcome-message']/label/small");


    //Action Methods

    public String verifyUrl() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return driver.getCurrentUrl();

    }

    public void logInDetails(String datasetFile) throws Exception {
        login= getAccountDetails(datasetFile);
        setEmail(login.getUsername());
        setPassword(login.getPassword());

    }

    public void setEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void setPassword(String pass) {
        driver.findElement(passwordField).sendKeys(pass);
    }



    public void clickSubmit() {
        driver.findElement(accountLoginButton).click();
    }

    public String verifyDashBoardTitle() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return driver.findElement(dashBoardTitle).getText();
    }

    public String verifyRoleText() {
        return driver.findElement(roleText).getText();
    }


}
