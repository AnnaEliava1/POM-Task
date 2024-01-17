package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckOutObject {
    private WebDriver driver;
    private WebElement cartButton;
    private WebElement checkOutButton;
    private WebElement continueButton;

    public CheckOutObject(WebDriver driver) {
        this.driver = driver;
        initializeElements();
    }

    private void initializeElements() {
        cartButton = driver.findElement(By.className("shopping_cart_link"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        checkOutButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-test='checkout']")));
    }

    public WebElement getCartButton() {
        return cartButton;
    }

    public WebElement getCheckOutButton() {
        return checkOutButton;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }
}
