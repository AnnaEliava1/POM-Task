package StepObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import PageObject.LogoutObject;

public class LogoutSteps extends LogoutObject {

    WebDriver driver;

    public LogoutSteps(WebDriver driver1) {
        driver = driver1;
    }

    public void emailFieldActions(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void passwordFieldAction(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void logInButtonAction() {
        driver.findElement(logInButton).click();
    }

    public void logoutButtonAction() {
        WebElement loginButton = driver.findElement(By.id("logout_sidebar_link"));
        loginButton.click();
    }

    public void openBurgerMenu() {
        WebElement burgerMenuButton = driver.findElement(By.id("react-burger-menu-btn"));
        burgerMenuButton.click();
    }

    public void assertLoginButtonExists() {
        WebElement loginButton = driver.findElement(By.id("login-button"));
        Assert.assertTrue(loginButton.isDisplayed(), "Login button is not displayed");
    }
}
