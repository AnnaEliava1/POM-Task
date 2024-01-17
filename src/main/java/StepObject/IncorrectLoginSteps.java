package StepObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import PageObject.IncorrectLoginObject;

public class IncorrectLoginSteps extends IncorrectLoginObject {

    private WebDriver driver;

    public IncorrectLoginSteps(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUserName(String userName) {
        WebElement userNameElement = driver.findElement(userNameField);
        userNameElement.sendKeys(userName);
    }

    public void enterPassword(String password) {
        WebElement passwordElement = driver.findElement(passwordField);
        passwordElement.sendKeys(password);
    }

    public void clickLoginButton() {
        WebElement loginButtonElement = driver.findElement(loginButton);
        loginButtonElement.click();
    }

    public String getErrorMessage() {
        WebElement errorMessageElement = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3"));  // Adjust the XPath based on your page structure
        return errorMessageElement.getText();
    }
}

