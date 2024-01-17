package PageObject;

import org.openqa.selenium.By;

public class LoginObject {

    public By


    emailField = By.name("user-name");
    public By passwordField = By.name("password");


    protected By logInButton = By.xpath("//*[@id=\"login-button\"]");


}
