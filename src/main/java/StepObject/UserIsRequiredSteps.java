package StepObject;

import PageObject.UserIsRequiredObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserIsRequiredSteps extends UserIsRequiredObject {

    WebDriver driver;

    public UserIsRequiredSteps(WebDriver driver1) {
        driver = driver1;
    }

    public void clickLoginButton() {
        WebElement loginButtonElement = driver.findElement(loginButton);
        loginButtonElement.click();
    }

    public String getErrorMessage() {
        WebElement errorMessageElement = driver.findElement(errorMessage);
        return errorMessageElement.getText();
    }
}
