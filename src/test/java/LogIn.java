import org.testng.Assert;
import org.testng.annotations.Test;
import StepObject.LoginSteps;
import utils.BrowserActions;

import static DataObject.LogInData.correctEmailData;
import static DataObject.LogInData.correctPasswordData;

public class LogIn extends BrowserActions {

    @Test
    public void logInWithCorrectData() throws InterruptedException {
        LoginSteps step1 = new LoginSteps(getDriver());


        String expectedEmail = correctEmailData;
        String expectedPassword = correctPasswordData;

        step1.emailFieldActions(expectedEmail);
        step1.passwordFieldAction(expectedPassword);

        String actualEmail = step1.getEnteredText(step1.emailField);
        String actualPassword = step1.getEnteredText(step1.passwordField);

        Assert.assertEquals(actualEmail, expectedEmail, "Entered email is incorrect");
        Assert.assertEquals(actualPassword, expectedPassword, "Entered password is incorrect");
    }
}
