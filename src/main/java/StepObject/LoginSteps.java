package StepObject;

import PageObject.LoginObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginSteps extends LoginObject {

    WebDriver driver;

    public LoginSteps(WebDriver driver1) {
        driver = driver1;
    }

    public void emailFieldActions(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void passwordFieldAction(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public String getEnteredText(By locator) {
        return driver.findElement(locator).getAttribute("value");
    }

    public void logInButtonAction() {
        driver.findElement(logInButton).click();
    }
}
