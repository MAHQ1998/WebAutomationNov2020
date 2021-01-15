package com.report;

import com.relevantcodes.extentreports.ExtentReports;
import org.testng.ITestContext;
import org.testng.Reporter;

import java.io.File;

public class ExtentManager {
    private static ExtentReports extent;
    private static ITestContext context;

    public synchronized static ExtentReports getInstance() {
        if (extent == null) {
            File outputDirectory = new File(context.getOutputDirectory());
            File resultDirectory = new File(outputDirectory.getParentFile(), "html");
            extent = new ExtentReports(System.getProperty("user.dir") + "/Extent-Report/ExtentReport.html", true);
            //we also cane change the name above like say Automation report instant of extent report
            Reporter.log("Extent Report Directory" + resultDirectory, true);
            extent.addSystemInfo("Host Name", "--").addSystemInfo("Environment",
                    "QA").addSystemInfo("User Name", "--").addSystemInfo("URL", "---");
            extent.loadConfig(new File("../generic/src/main/resources/report-config.xml"));
            // above we can specify where we can locate our file.
            //System.getProperty("user.dir") + "/com.report-config.xml"
        }
        return extent;
    }

    public static void setOutputDirectory(ITestContext context) {
        ExtentManager.context = context;
    }

}

