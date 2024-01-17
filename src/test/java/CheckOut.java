
import StepObject.LoginSteps;
import org.testng.annotations.Test;
import StepObject.CheckOutSteps;
import utils.BrowserActions;
import static DataObject.LogInData.correctEmailData;
import static DataObject.LogInData.correctPasswordData;

public class CheckOut extends BrowserActions {

    @Test
    public void checkOutTest() throws InterruptedException {

        LoginSteps loginSteps = new LoginSteps(getDriver());
        loginSteps.emailFieldActions(correctEmailData);
        loginSteps.passwordFieldAction(correctPasswordData);
        loginSteps.logInButtonAction();

        CheckOutSteps checkOutSteps = new CheckOutSteps(getDriver());
        checkOutSteps.clickCartButton();
        Thread.sleep(2000);
        checkOutSteps.clickCheckOutButton();
        Thread.sleep(2000);
        checkOutSteps.clickContinueButton();
        Thread.sleep(5000);

    }
}
