import Browser.OpenBrowser;
import Core.Constants;
import java.util.concurrent.TimeUnit;
import javax.imageio.IIOException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import Core.ExtentManager;

public class BaseTest extends OpenBrowser {

    @BeforeSuite
    public void initBaseTest() throws IIOException, InterruptedException {
      //  DOMConfigurator.configure("log4j.xml");
        extent = createInstance();
        JavascriptExecutor js = (JavascriptExecutor)Driver;
        OpenBrowser.initBrowser(Constants.Browser);
        Driver.get(Constants.URL);
        Driver.manage().window().maximize();
        Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @AfterSuite
    public void driveQuit() {
        if (Driver != null) {
           Driver.quit();
        }
        extent.flush();
    }
}

