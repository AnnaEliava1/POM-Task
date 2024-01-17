package PageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartObject {
    public WebDriver driver;


    private WebElement addToCartButton;

    public CartObject(WebDriver driver) {
        this.driver = driver;
        initializeElements();
    }

    public CartObject() {
    }

    public void initializeElements() {
        addToCartButton = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
    }

    public WebElement getAddToCartButton() {
        return addToCartButton;
    }



}
