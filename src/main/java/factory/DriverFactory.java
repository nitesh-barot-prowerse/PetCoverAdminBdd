package factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import utils.Log;

import java.util.HashMap;

public class DriverFactory {
    public WebDriver driver;

    public static ThreadLocal<WebDriver> tlLocal = new ThreadLocal<>();

    /*This method is used to initialize the threadLocal driver on the basis of given browser*/
    public WebDriver init_browser(String browser) {

        System.out.println("The name of the browser is " + browser);
        Log.info("Name Of Browser Is " +browser);

        if (browser == null || browser.isEmpty()) {
            browser = "chrome";
        }

        switch (browser) {
            case ("chrome"):
                getChromeDriver();
                getDriver().manage().deleteAllCookies();
                getDriver().manage().window().maximize();
                return getDriver();
            case ("chrome-headless"):
                getChromeHeadlessDriver();
                getDriver().manage().deleteAllCookies();
                getDriver().manage().window().maximize();
                return getDriver();
            case ("firefox"):
                getFirefoxDriver();
                getDriver().manage().deleteAllCookies();
                getDriver().manage().window().maximize();
                return getDriver();
            case ("ie"):
                getInternetExplorerDriver();
                getDriver().manage().deleteAllCookies();
                getDriver().manage().window().maximize();
                return getDriver();
            case ("microsoft edge"):
                getMicrosoftEdge();
                getDriver().manage().deleteAllCookies();
                getDriver().manage().window().maximize();
                return getDriver();
            case ("safari"):
                getSafari();
                getDriver().manage().deleteAllCookies();
                getDriver().manage().window().maximize();
                return getDriver();
            default:
                throw new RuntimeException("browser option " + browser + " not supported");
        }

    }

    private void getChromeDriver() {
         ChromeOptions options = new ChromeOptions();
         options.addArguments("--headless", "--window-size=1920,1200");

        WebDriver driver1=new ChromeDriver(options);
        tlLocal.set(driver1);
        //WebDriver driver1 = new ChromeDriver();
       // tlLocal.set(driver1);
    }

    private void getChromeHeadlessDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", "--window-size=1920,1200");
        WebDriver driver1=new ChromeDriver(options);
        tlLocal.set(driver1);

    }

    private void getFirefoxDriver() {
        WebDriver driver1 = new FirefoxDriver();
        tlLocal.set(driver1);

    }

    private void getInternetExplorerDriver() {
        WebDriver driver1 = new InternetExplorerDriver();
        tlLocal.set(driver1);
    }

    private void getMicrosoftEdge() {
        WebDriver driver1 = new EdgeDriver();
        tlLocal.set(driver1);

    }

    private void getSafari() {
        WebDriver driver1 = new SafariDriver();
        tlLocal.set(driver1);
    }


    /*This is to used to get the driver with ThreadLocal @return
    making it Synchronized just for parallel execution
    */
    public static synchronized WebDriver getDriver() {
        return tlLocal.get();
    }
}
