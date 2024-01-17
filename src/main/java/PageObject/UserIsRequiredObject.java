package PageObject;

import org.openqa.selenium.By;

public class UserIsRequiredObject {
    protected By loginButton = By.id("login-button");
    protected By errorMessage = By.cssSelector("h3[data-test='error']");
}
