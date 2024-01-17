import org.testng.annotations.Test;
import StepObject.LoginSteps;
import utils.BrowserActions;

import static DataObject.LogInData.correctEmailData;
import static DataObject.LogInData.correctPasswordData;

public class
LogIn extends BrowserActions {

    @Test
    public void logInWithCorrectData() throws InterruptedException {
        LoginSteps step1 = new LoginSteps(getDriver());
        step1.emailFieldActions(correctEmailData);
        step1.passwordFieldAction(correctPasswordData);
        step1.logInButtonAction();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}