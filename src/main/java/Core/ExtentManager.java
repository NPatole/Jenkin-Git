package Core;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
    public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports extent;
    public ExtentTest extentTest;
    public static ExtentReports createInstance(){
        htmlReporter = new ExtentHtmlReporter("./Report/extent.html");
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setDocumentTitle("Automation Report");
        htmlReporter.config().setReportName("Automation Test Results");
        htmlReporter.config().setTheme(Theme.STANDARD);
        extent = new ExtentReports();
        extent.setSystemInfo("Browser", Constants.Browser);
        extent.attachReporter(htmlReporter);
        return extent;
    }
}
