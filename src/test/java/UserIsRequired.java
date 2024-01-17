import org.testng.Assert;
import org.testng.annotations.Test;
import StepObject.UserIsRequiredSteps;
import utils.BrowserActions;

public class UserIsRequired extends BrowserActions {

    @Test
    public void userIsRequiredTest() throws InterruptedException {
        UserIsRequiredSteps steps = new UserIsRequiredSteps(getDriver());

        steps.clickLoginButton();

        String actualErrorMessage = steps.getErrorMessage();
        String expectedErrorMessage = "Epic sadface: Username is required";

        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message is incorrect");
        Thread.sleep(4000);
    }
}
