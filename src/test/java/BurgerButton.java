import StepObject.BurgerButtonSteps;
import StepObject.LoginSteps;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BrowserActions;

import static DataObject.LogInData.correctEmailData;
import static DataObject.LogInData.correctPasswordData;

public class BurgerButton extends BrowserActions {

    @Test
    public void Burgerbutton() throws InterruptedException {

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

        BurgerButtonSteps burgerButtonSteps = new BurgerButtonSteps(getDriver());
        burgerButtonSteps.openBurgerMenu();
        Thread.sleep(5000);
        burgerButtonSteps.clickAboutButton();

        String currentUrl = burgerButtonSteps.getCurrentPageUrl();
        Assert.assertTrue(currentUrl.contains("https://saucelabs.com/"), "Not on the expected page (https://saucelabs.com/)");
    }
}

