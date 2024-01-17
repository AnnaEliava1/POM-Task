package PageObject;
import org.openqa.selenium.By;

public class IncorrectLoginObject {

    protected By userNameField = By.name("user-name");
    protected By passwordField = By.name("password");
    protected By loginButton = By.xpath("//*[@id=\"login-button\"]");
}

