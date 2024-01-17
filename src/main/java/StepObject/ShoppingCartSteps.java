package StepObject;// ShoppingCartSteps.java
import PageObject.ShoppingCartObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShoppingCartSteps extends ShoppingCartObject {

    public ShoppingCartSteps(WebDriver driver) {
        super(driver);
    }

    public void shoppingCartButton() {

        getShoppingCartButton().click();


        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        WebElement cartContainer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cart_contents_container\"]")));


    }


    public String getCurrentPageUrl() {
        return getDriver().getCurrentUrl();
    }
}

