package StepObject;

import PageObject.CartObject;
import org.openqa.selenium.WebDriver;

public class CartSteps extends CartObject {

    public CartSteps(WebDriver driver) {
        super(driver);
    }

    public void addToCart() {

        getAddToCartButton().click();


    }
}
