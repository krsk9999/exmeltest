package Entities;

/**
 * Created by kramirez on 4/10/2016.
 */
public class Constants {

    public static final String PathTestData = System.getProperty("user.dir") + "/Excel_DataProviders/";
    public static final String GeneralSheet = "General";
    public static final int TimeOut_Seconds = 90;


    //Browsers Firefox, Chrome, IE10, Safari
    public static final String vIEBrowserPath = System.getProperty("user.dir") + "/Drivers/IEDriver_2.46/IEDriverServer.exe";
    public static final String vChromeBrowserPath = System.getProperty("user.dir") + "/Drivers/ChromeDriver/chromedriver.exe";

    public static class Columns {
        //Test Data Sheet Columns
        public static final String UserName = "UserName";
        public static final String UserPassword = "UserPassword";
        public static final String UserRoles = "RoleName";
    }

}
