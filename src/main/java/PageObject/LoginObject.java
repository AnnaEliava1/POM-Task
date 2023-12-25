package PageObject;

import org.openqa.selenium.By;

public class LoginObject {

    protected By


    emailField = By.name("user-name"),
    passwordField = By.name("password"),


    logInButton = By.xpath("//*[@id=\"login-button\"]");


}
