import StepObject.CartSteps;
import StepObject.LoginSteps;
import org.testng.annotations.Test;
import utils.BrowserActions;
import static DataObject.LogInData.correctEmailData;
import static DataObject.LogInData.correctPasswordData;
public class cart extends BrowserActions {

    @Test
    public void cartTests() throws InterruptedException {
        LoginSteps step1 = new LoginSteps(getDriver());
        step1.emailFieldActions(correctEmailData);
        step1.passwordFieldAction(correctPasswordData);
        step1.logInButtonAction();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        CartSteps cartSteps = new CartSteps(getDriver());
        cartSteps.addToCart();
        Thread.sleep(5000);
    }


}









