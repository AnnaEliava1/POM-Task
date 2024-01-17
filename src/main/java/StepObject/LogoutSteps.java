package StepObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import PageObject.LogoutObject;

public class LogoutSteps extends LogoutObject {

    WebDriver driver;

    public LogoutSteps(WebDriver driver1) {
        driver = driver1;
    }

    public void emailFieldActions(String email){
        driver.findElement(emailField).sendKeys(email);
    }
    public  void passwordFieldAction(String password){
        driver.findElement(passwordField).sendKeys(password);

    }
    public void logInButtonAction(){
        driver.findElement(logInButton).click();

    }
    public void logoutButtonAction(){
        WebElement loginButton = driver.findElement(By.id("logout_sidebar_link"));
        loginButton.click();
    }

    public void openBurgerMenu() {
        WebElement burgerMenuButton = driver.findElement(By.id("react-burger-menu-btn"));
        burgerMenuButton.click();
    }








//    public void clickLogoutButton() throws InterruptedException {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        // Wait for the burger menu to be clickable
//        WebElement burgerMenu = wait.until(ExpectedConditions.elementToBeClickable(By.id("react-burger-menu-btn")));
//        burgerMenu.click();
//
//
//        public void logoutButtonAction() {
//            driver.findElement(logoutButton).click();
//
//        }

        // Scroll to the logout button
//        WebElement logoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.className(".bm-item menu-item")));
//
//        Thread.sleep(5000);
        // Click the logout button
//        logoutButton.click();


//    }

//    private void scrollToElement(WebElement element) {
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//    }
}











