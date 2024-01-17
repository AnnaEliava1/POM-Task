import org.testng.annotations.Test;
import StepObject.DropDownMenuSteps;
import StepObject.LoginSteps;
import utils.BrowserActions;

import static DataObject.LogInData.correctEmailData;
import static DataObject.LogInData.correctPasswordData;

public class DropDownMenu extends BrowserActions {

    @Test
    public void testDropDownMenu() throws InterruptedException {
        LoginSteps loginSteps = new LoginSteps(getDriver());
        loginSteps.emailFieldActions(correctEmailData);
        loginSteps.passwordFieldAction(correctPasswordData);
        loginSteps.logInButtonAction();
        Thread.sleep(5000);

        DropDownMenuSteps dropDownMenuSteps = new DropDownMenuSteps(getDriver());
        dropDownMenuSteps.selectOptionsAndAssert();
    }
}
