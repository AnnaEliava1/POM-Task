package PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartObject {

    private WebDriver driver;


    private WebElement shoppingCartButton;

    public ShoppingCartObject(WebDriver driver) {
        this.driver = driver;
        initializeElements();
    }

    private void initializeElements() {

        shoppingCartButton = driver.findElement(By.className("shopping_cart_link"));
    }

    public WebElement getShoppingCartButton() {
        return shoppingCartButton;
    }


    public WebDriver getDriver() {
        return driver;
    }
}




