package dataProviders;

import Core.ExcelUtils;
import Core.Log;
import Core.Utils;
import Entities.Constants;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.DataProvider;

/**
 * Created by kramirez on 4/10/2016.
 */
public class Default_DataProvider {

    public static String sTestCaseName;

    @DataProvider(name = "Default")
    public static Object[][] dp() throws Exception {
        DOMConfigurator.configure("log4j.xml");
        sTestCaseName = Default_DataProvider.class.getSimpleName();
        Log.startTestCase(sTestCaseName);

        ExcelUtils.setExcelFile(Constants.PathTestData + "//General_DataProvider.xlsx", Constants.GeneralSheet);

        return Utils.populateExcelDataProvider();
    }


}
