package StepObject;

import PageObject.CheckOutObject;
import org.openqa.selenium.WebDriver;

public class CheckOutSteps extends CheckOutObject {

    public CheckOutSteps(WebDriver driver) throws InterruptedException {
        super(driver);
    }

    public void clickCartButton() {

        getCartButton().click();
    }

    public void clickCheckOutButton() {

        getCheckOutButton().click();
    }

    public void clickContinueButton() {

        getContinueButton().click();
    }
}



