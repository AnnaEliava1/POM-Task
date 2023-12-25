package StepObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import PageObject.LogoutObject;
import java.time.Duration;

public class LogoutSteps extends LogoutObject {

    private WebDriver driver;

    public LogoutSteps(WebDriver driver1) {
        driver = driver1;
    }

    public void openBurgerMenu() {
        WebElement burgerMenuButton = driver.findElement(By.id("react-burger-menu-btn"));
        burgerMenuButton.click();
    }

    public void clickLogoutButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait for the burger menu to be clickable
        WebElement burgerMenu = wait.until(ExpectedConditions.elementToBeClickable(By.id("react-burger-menu-btn")));
        burgerMenu.click();

        // Locate the logout button dynamically
        By logoutButtonSelector = By.cssSelector(".bm-item.menu-item");

        // Scroll to the logout button
        WebElement logoutButton = wait.until(ExpectedConditions.presenceOfElementLocated(logoutButtonSelector));
        scrollToElement(logoutButton);

        // Click the logout button
        logoutButton.click();
    }

    private void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
}











