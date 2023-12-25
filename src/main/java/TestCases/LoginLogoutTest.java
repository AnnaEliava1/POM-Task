// Package: TestCases
package TestCases;

import DataObject.LogInData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import PageObject.LoginObject;
import StepObject.LoginSteps;
import StepObject.LogoutSteps;
import utils.BrowserActions;

public class LoginLogoutTest extends BrowserActions {
    private WebDriver driver;
    private LoginSteps loginSteps;
    private LogoutSteps logoutSteps;

    @BeforeMethod
    public void setUp() {
        driver = BrowserActions.driver;
        loginSteps = new LoginSteps(driver);
        logoutSteps = new LogoutSteps(driver);
    }

    @Test(description = "Login Test")
    public void loginTest() {
        // Login
        loginSteps.emailFieldActions(LogInData.correctEmailData);
        loginSteps.passwordFieldAction(LogInData.correctPasswordData);
        loginSteps.logInButtonAction();

        // Perform assertions or further actions after login if needed
    }

    @Test(description = "Logout Test")
    public void logoutTest() {
        // Logout
        logoutSteps.clickLogoutButton();

        // Perform assertions or further actions after logout if needed
    }

    @AfterMethod
    public void tearDown() {
        // Additional cleanup or verification if needed
    }
}

