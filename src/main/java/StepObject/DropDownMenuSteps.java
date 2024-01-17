package StepObject;

import PageObject.DropDownMenuObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDownMenuSteps extends DropDownMenuObject {

    private WebDriver driver;

    public DropDownMenuSteps(WebDriver driver) {
        this.driver = driver;
    }

    public void selectOptionsAndAssert() {
        for (int i = 0; i <= 3; i++) {
            WebElement dropdown = driver.findElement(dropDownLocator);
            Select select = new Select(dropdown);
            select.selectByIndex(i);


            dropdown = driver.findElement(dropDownLocator);
            Select updatedSelect = new Select(dropdown);


            WebElement selectedOption = updatedSelect.getFirstSelectedOption();
            String selectedOptionText = selectedOption.getText();


            String[] expectedOptions = {"Name (A to Z)", "Name (Z to A)", "Price (low to high)", "Price (high to low)"};


            Assert.assertEquals(selectedOptionText, expectedOptions[i], "Selected option doesn't match expected option");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
