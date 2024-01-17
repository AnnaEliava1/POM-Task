package StepObject;
import PageObject.FacebookIconObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookIconSteps extends FacebookIconObject {

    private WebDriver driver;

    public FacebookIconSteps(WebDriver driver) {
        this.driver = driver;
    }

    public void clickFacebookIcon() {
        WebElement facebookIcon = driver.findElement(facebookIconLocator);
        facebookIcon.click();


        for (String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
        }
    }
}

