import org.testng.annotations.Test;
import StepObject.LogoutSteps;
import utils.BrowserActions;

import static DataObject.LogInData.correctEmailData;
import static DataObject.LogInData.correctPasswordData;

public class Logout extends BrowserActions {

    @Test
    public void logoutTest() throws InterruptedException {

        LogoutSteps logoutSteps = new LogoutSteps(getDriver());
        logoutSteps.emailFieldActions(correctEmailData);
        logoutSteps.passwordFieldAction(correctPasswordData);
        logoutSteps.logInButtonAction();
        logoutSteps.openBurgerMenu();
        Thread.sleep(10000);
        logoutSteps.logoutButtonAction();
        Thread.sleep(5000);
    }
}