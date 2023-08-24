package Browser;

import Core.Constants;
import Core.ExtentManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenBrowser extends ExtentManager {
    public static WebDriver Driver;
    public static void initBrowser(String browser){

        if (browser.equalsIgnoreCase("IE")) {

            WebDriverManager.iedriver().setup();
            Driver = new InternetExplorerDriver();

        } else if (browser.equalsIgnoreCase("Chrome")) {

//            WebDriverManager.chromedriver().setup();
            System.setProperty("webdriver.chrome.driver", Constants.ChromeExePath);
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            // Instantiate a ChromeDriver class.
            Driver = new ChromeDriver(options);

        }

    }

}

