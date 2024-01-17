
import org.testng.Assert;
import org.testng.annotations.Test;
import StepObject.LoginSteps;
import StepObject.ShoppingCartSteps;
import utils.BrowserActions;

import static DataObject.LogInData.correctEmailData;
import static DataObject.LogInData.correctPasswordData;

public class ShoppingCartJava extends BrowserActions {

    @Test
    public void shoppingCartTests() throws InterruptedException {
        LoginSteps loginSteps = new LoginSteps(getDriver());
        loginSteps.emailFieldActions(correctEmailData);
        loginSteps.passwordFieldAction(correctPasswordData);
        loginSteps.logInButtonAction();
        Thread.sleep(5000);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        ShoppingCartSteps shoppingCartSteps = new ShoppingCartSteps(getDriver());

        shoppingCartSteps.shoppingCartButton();

        Thread.sleep(2000);

        String currentUrl = shoppingCartSteps.getCurrentPageUrl();
        Assert.assertTrue(currentUrl.contains("https://www.saucedemo.com/cart.html"), "Not on the expected page (https://www.saucedemo.com/cart.html)");
    }
}




