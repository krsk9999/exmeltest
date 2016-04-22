package appModules.HomeAction;

import Core.Log;
import Core.WebDriverUtils;
import pageObjects.InicioPage.HomePage;
import pageObjects.Login.LoginPage;

import static pageObjects.InicioPage.HomePage.btnExpediente;

/**
 * Created by kramirez on 4/10/2016.
 */
public class HomeAction {

    public static void mnbtnExpediente (int rowNumber) throws Exception{

        Log.info("----------------------------------------------------",true);
        Log.info("Moving to Expediente");
        WebDriverUtils.clickButtonThroughJS(HomePage.btnExpediente(),"Clicking Expediente");

    }
}
