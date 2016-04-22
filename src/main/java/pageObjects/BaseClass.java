package pageObjects;

import org.openqa.selenium.WebDriver;

import java.lang.reflect.Method;

public class BaseClass {
    public static WebDriver driver;
    public static boolean bResult;
    public static Method method;
    public static int excelrowNumber;


    public BaseClass(WebDriver driver, Method vMethod, int rowNumber) {
        BaseClass.driver = driver;
        BaseClass.bResult = true;
        method = vMethod;
        excelrowNumber = rowNumber;
    }

    public BaseClass(WebDriver driver) {
        BaseClass.driver = driver;
        BaseClass.bResult = true;
    }

}