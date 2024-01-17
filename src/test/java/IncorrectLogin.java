import org.testng.annotations.Test;
import org.testng.Assert;
import StepObject.IncorrectLoginSteps;
import utils.BrowserActions;

public class IncorrectLogin extends BrowserActions {

    @Test
    public void testIncorrectLogin() throws InterruptedException {
        IncorrectLoginSteps incorrectLoginSteps = new IncorrectLoginSteps(getDriver());

        incorrectLoginSteps.enterUserName("annaeliava");
        incorrectLoginSteps.enterPassword("annaeliava1");
        incorrectLoginSteps.clickLoginButton();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        String errorMessage = incorrectLoginSteps.getErrorMessage();
        Assert.assertTrue(errorMessage.contains("Epic sadface: Username and password do not match any user in this service"), "Expected error message not displayed");
    }
}

