import StepObject.CartSteps;
import StepObject.LoginSteps;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import StepObject.RemoveItemSteps;
import org.testng.Assert;
import utils.BrowserActions;

import static DataObject.LogInData.correctEmailData;
import static DataObject.LogInData.correctPasswordData;

public class RemoveItem extends BrowserActions {

    @Test
    public void removeItemTests() throws InterruptedException {
        LoginSteps loginSteps = new LoginSteps(getDriver());
        loginSteps.emailFieldActions(correctEmailData);
        loginSteps.passwordFieldAction(correctPasswordData);
        loginSteps.logInButtonAction();
        Thread.sleep(5000);

        CartSteps cartSteps = new CartSteps(getDriver());
        cartSteps.addToCart();
        Thread.sleep(5000);

        RemoveItemSteps removeItemSteps = new RemoveItemSteps(getDriver());
        removeItemSteps.removeItem();
        Thread.sleep(5000);

        Assert.assertFalse(isRemoveButtonPresent(), "Item was not removed successfully.");
    }

    public boolean isRemoveButtonPresent() {

        try {
            getDriver().findElement(By.id("remove-sauce-labs-backpack"));
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
}

