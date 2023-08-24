package Core;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener {
    //public static ExtentReports extent = ExtentManager.createInstance();
   // public static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();
    @Override
    public void onTestStart(ITestResult iTestResult) {

       /* ExtentManager.createInstance().createTest(iTestResult.getTestClass().getName()+"::"+iTestResult.getMethod().getMethodName());
        ExtentManager.*/
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("Result PASS");
        String logText = "<b>Test Method " +iTestResult.getMethod().getMethodName() + "Successful</b>";
        Markup m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
      //  ExtentManager.(Status.PASS,m);

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
