package Core;

import java.io.IOException;
import java.util.Properties;
import Entities.IterationIndex;

/**
 * Created by kramirez on 4/6/16.
 */
public final class Utils {


    private static Properties properties = new Properties();
    static {
        try {
            properties.load(Utils.class.getResourceAsStream("/exmel.properties"));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }

    private Utils() {
    }

    public static String getProperty(String property) {
        return properties.getProperty(property);
    }

    public static Object[][] populateExcelDataProvider() throws Exception {

        int iterationIndex = Integer.parseInt(IterationIndex.get());
        Object[][] excelData;

        if (iterationIndex > 0) { //This validation is implemented in case the user wants to run the script for a specific IterationIndex (Organization)

            excelData = new Object[1][1];
            excelData[0][0] = iterationIndex;

        } else { //This code is executed if the variable IterationIndex is an empty string, this means that the script will be executed for all the IterationList (Organizations)

            excelData = new Object[ExcelUtils.ExcelWSheet.getLastRowNum()][1];
            for (int count = 0; count < ExcelUtils.ExcelWSheet.getLastRowNum(); count++) {
                excelData[count][0] = count + 1;
            }

        }

        return excelData;
    }
}
