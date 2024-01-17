package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RemoveItemObject {
    private WebDriver driver;


    private WebElement removeItemButton;

    public RemoveItemObject(WebDriver driver) {
        this.driver = driver;
        initializeElements();
    }

    private void initializeElements() {

        removeItemButton = driver.findElement(By.id("remove-sauce-labs-backpack"));
    }

    public WebElement getRemoveItemButton() {
        return removeItemButton;
    }
}
