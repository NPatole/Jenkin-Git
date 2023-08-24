package Core;

import Browser.OpenBrowser;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actions {
    private static WebDriver driver;
    private WebDriverWait wait;
    private static int DRIVER_WAIT = 10;

    public Actions(WebDriver Driver) {
        driver = Driver;
        wait = new WebDriverWait(driver, (long)DRIVER_WAIT);
    }

    public void click(WebElement ElementToClick) {
        try {
            if (ElementToClick != null) {
                wait.until(ExpectedConditions.elementToBeClickable(ElementToClick));
                ElementToClick.click();
            } else {
                Log.error("Element could not found");
            }
        } catch (Exception e) {
            Log.error("Error while clicking the element" + e.toString());
        }

    }

    public void enterText(WebElement ElementToType, String StringToType) {
        try {
            if (ElementToType != null) {
                wait.until(ExpectedConditions.visibilityOf(ElementToType));
                ElementToType.clear();
                ElementToType.sendKeys(new CharSequence[]{StringToType});
            } else {
                Log.error("Element could not found");
            }
        } catch (Exception e) {
            Log.error("Error while writting the element" + e.toString());
        }

    }

    public boolean isDisplayed(WebElement ElementToCheck) {
        try {
            wait.until(ExpectedConditions.visibilityOf(ElementToCheck));
            return ElementToCheck.isDisplayed();
        } catch (Exception e) {
            Log.error("Element is not getting displayed");
            return false;
        }
    }

    public void selectDropDownUsingIndex(WebElement DropDownEle, int Index) {
        try {
            wait.until(ExpectedConditions.visibilityOf(DropDownEle));
            (new Select(DropDownEle)).selectByIndex(Index);
        } catch (Exception e) {
            Log.error(e.toString());
        }

    }

    public void scrollDown(WebElement SearchElemet) {
        JavascriptExecutor js = (JavascriptExecutor) OpenBrowser.Driver;
        js.executeScript("arguments[0].scrollIntoView();", SearchElemet);
    }
}

