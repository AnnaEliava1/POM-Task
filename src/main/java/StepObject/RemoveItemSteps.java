package StepObject;

import PageObject.RemoveItemObject;
import org.openqa.selenium.WebDriver;

public class RemoveItemSteps extends RemoveItemObject {

    public RemoveItemSteps(WebDriver driver) {
        super(driver);
    }

    public void removeItem() {

        getRemoveItemButton().click();


    }
}
