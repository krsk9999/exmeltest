package appModules.LoginAction;

import Core.ExcelUtils;
import Core.Log;
import Core.WebDriverUtils;
import Entities.User;
import org.openqa.selenium.By;
import org.testng.Assert;
import pageObjects.Login.LoginPage;
import Entities.Constants;

/**
 * Created by kramirez on 4/10/2016.
 */
public class LoginAction {

    public static void executeLogin(int rowNumber) throws Exception{
        Log.info("----------------------------------------------------",true);
        Log.info("Executing Login");
        WebDriverUtils.goToURL(LoginPage.relativeURL);

        //Wait for the login elements
        WebDriverUtils.waitUntilElementIsDisplayed(LoginPage.txtUserName());
        WebDriverUtils.waitUntilElementIsDisplayed(LoginPage.txtPassword());
        WebDriverUtils.waitUntilElementIsDisplayed(LoginPage.btnLogin());

        User.userName = ExcelUtils.getCellData(rowNumber, Constants.Columns.UserName);
        User.userPassword = ExcelUtils.getCellData(rowNumber, Constants.Columns.UserPassword);
        //User.userRoles = ExcelUtils.getCellData(rowNumber, Constants.Columns.UserRoles).split(",");

        try{

            WebDriverUtils.sendKeysWithClear(LoginPage.txtUserName(), User.userName);
            Log.info("Username: "+User.userName);
            WebDriverUtils.sendKeysWithClear(LoginPage.txtPassword(), User.userPassword);
            Log.info("Password: "+User.userPassword);

            WebDriverUtils.clickButtonThroughJS(LoginPage.btnLogin(), "Click login Button");
            Log.info("Click action is performed on Submit button", true);

            WebDriverUtils.waitUntilElementIsDisplayed(By.cssSelector(".navbar-brand"));

            Assert.assertTrue(WebDriverUtils.isElementDisplayed(By.cssSelector(".navbar-brand")),"Login Performed Successfully");

        }catch (Exception ex){
            throw ex;
        }

    }


}
