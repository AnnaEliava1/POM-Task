import StepObject.FacebookIconSteps;
import StepObject.LoginSteps;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BrowserActions;

import static DataObject.LogInData.correctEmailData;
import static DataObject.LogInData.correctPasswordData;

public class FacebookIcon extends BrowserActions {

    @Test
    public void testFacebookIcon() throws InterruptedException {

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

        FacebookIconSteps facebookIconSteps = new FacebookIconSteps(getDriver());
        facebookIconSteps.clickFacebookIcon();
        Thread.sleep(5000);

        for (String windowHandle : getDriver().getWindowHandles()) {
            getDriver().switchTo().window(windowHandle);
        }
        Thread.sleep(5000);


        String currentUrl = getDriver().getCurrentUrl();
        System.out.println("Actual URL: " + currentUrl);


        Assert.assertTrue(currentUrl.contains("https://www.facebook.com/saucelabs"), "Not on the expected page (https://www.facebook.com/saucelabs)");
    }
}
