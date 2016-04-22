package pageObjects.InicioPage;

import Core.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObjects.BaseClass;

public class HomePage extends BaseClass{

    public static String relativeURL = "exmel.html#";

    public HomePage(){
        super(driver);
    }

    public static WebElement btnExpediente() throws Exception {
        WebDriverUtils.waitUntilElementIsDisplayed(By.cssSelector("li a[href='#/Expediente']"));
        return WebDriverUtils.findElement(By.cssSelector("li a[href='#/Expediente']"));
    }

}
