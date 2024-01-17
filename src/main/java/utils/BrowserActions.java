package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BrowserActions {
    private static ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();

    public WebDriver getDriver() {
        return driverThreadLocal.get();
    }

    @BeforeMethod
    public void openBrowser() {

        driverThreadLocal.set(new ChromeDriver());
        getDriver().manage().window().maximize();
        getDriver().get("https://www.saucedemo.com");
    }

    @AfterMethod
    public void closeBrowser() {
        if (getDriver() != null) {
            getDriver().quit();
        }
    }
}
