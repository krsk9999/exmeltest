package pageObjects.Login;

import Core.WebDriverUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BaseClass;

/**
 * Created by kramirez on 4/9/16.
 */
public class LoginPage extends BaseClass {

    public static String relativeURL = "login.html";

    public LoginPage(WebDriver driver) throws Exception {
        super(driver);
    }

    public static WebElement txtUserName() throws Exception {
        WebDriverUtils.waitUntilElementIsDisplayed(By.id("login-username"));
        return WebDriverUtils.findElement(By.id("login-username"));
    }

    public static WebElement txtPassword() throws Exception {
        WebDriverUtils.waitUntilElementIsDisplayed(By.id("login-password"));
        return WebDriverUtils.findElement(By.id("login-password"));
    }

    public static WebElement btnLogin() throws Exception {
        WebDriverUtils.waitUntilElementIsDisplayed(By.id("btn-login"));
        return WebDriverUtils.findElement(By.id("btn-login"));
    }


}
