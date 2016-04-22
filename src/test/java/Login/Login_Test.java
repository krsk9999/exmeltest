package Login;

import Core.WebDriverUtils;
import appModules.HomeAction.HomeAction;
import appModules.LoginAction.LoginAction;
import dataProviders.Default_DataProvider;
import org.testng.annotations.Test;
import General.TestBase;

/**
 * Created by kramirez on 4/10/2016.
 */
public class Login_Test extends TestBase {

    @Test(dataProvider = "Default", dataProviderClass = Default_DataProvider.class)
    public void Login_ValidUser_Test(int rowNumber) throws Exception {
        LoginAction.executeLogin(rowNumber);
    }


}
