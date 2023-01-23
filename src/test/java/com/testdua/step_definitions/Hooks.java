package com.testdua.step_definitions;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.testdua.youtube.drivers.DriverSingleton;
import com.testdua.youtube.utils.Constants;
import com.testdua.youtube.utils.TestScenarios;
import com.testdua.youtube.utils.Utils;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Hooks {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static ExtentReports reports = new ExtentReports("target/extent-reports.html");

    @Before
    public void setUp() {
        DriverSingleton.getInstance(Constants.CHROME);
        driver = DriverSingleton.getDriver();
        TestScenarios[] tests = TestScenarios.values();
        extentTest = reports.startTest(tests[Utils.testCount].getTestName());
        Utils.testCount++;
    }

    @After
    public void closeObject() {
        reports.endTest(extentTest);
        reports.flush();
    }


    @AfterAll
    public static void closeBrowser() {
        delay(2);
        DriverSingleton.closeObjectInstance();
    }

    public static void delay(int detik) {
        try {
            Thread.sleep(1000*detik);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void scroll(int vertical) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,"+vertical+")");
    }
}
