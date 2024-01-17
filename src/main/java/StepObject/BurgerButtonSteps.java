package StepObject;

import PageObject.BurgerButtonObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BurgerButtonSteps extends BurgerButtonObject {

    private WebDriver driver;

    public BurgerButtonSteps(WebDriver driver) {
        this.driver = driver;
    }

    public void openBurgerMenu() {
        WebElement burgerMenuButton = driver.findElement(burgerMenuButtonLocator);
        burgerMenuButton.click();
    }

    public void clickAboutButton() {
        WebElement aboutButton = driver.findElement(aboutButtonLocator);
        aboutButton.click();
    }


    public String getCurrentPageUrl() {
        return driver.getCurrentUrl();
    }
}
