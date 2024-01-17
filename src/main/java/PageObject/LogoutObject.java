
package PageObject;

import org.openqa.selenium.By;


public class LogoutObject {
    protected By emailField = By.id("user-name");
    protected By passwordField = By.id("password");

    protected By logInButton = By.xpath("//*[@id=\"login-button\"]");

    protected By burgerMenuButton = By.id("react-burger-menu-btn");

    protected By logoutButton = By.cssSelector(".bm-item.menu-item");
}


