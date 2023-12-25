import DataObject.LogInData;
import StepObject.LoginSteps;


import org.testng.annotations.Test;


import utils.BrowserActions;

import static DataObject.LogInData.correctEmailData;
import static DataObject.LogInData.correctPasswordData;

public class LogIn extends BrowserActions {

    @Test

    public void logInWithCorrectData() throws InterruptedException {
        LoginSteps step1 = new LoginSteps(driver);
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

































         //String
                //expectedResult ="https://www.saucedemo.com/inventory.html",
                //actualResult = driver.findElement(By.linkText("https://www.saucedemo.com/inventory.html").getText();

        //SoftAssertions  = new SoftAssert();
        //softAssert.assertEquals(actualResult,expectedResult);
        //softAssert.assertAll();










