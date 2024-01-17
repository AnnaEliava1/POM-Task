package PageObject;

import org.openqa.selenium.By;

public class DropDownMenuObject {
    protected By dropDownLocator = By.cssSelector("select.product_sort_container");
    protected By dropDownOptionsLocator = By.cssSelector("select.product_sort_container option");
}
