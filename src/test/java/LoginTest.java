import Core.Constants;
import Core.Log;
import Core.Utils;
import Pages.LoginPage;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    public LoginPage loginPage;

    @BeforeClass
    public void beforeClass() {
        loginPage = new LoginPage(Driver);
    }

    /*@Test
    public void test01() throws InterruptedException {
        try {
            Thread.sleep(2000);
            loginPage.FirstName.submit();
            Thread.sleep(2000);
            List<WebElement> test = Driver.findElements(By.xpath("//span[@class='required']//parent::div[@class='form_heading_cell pad-B-10 pad-T-10 pad-R-10 col col-lg-3 col-md-3 col-sm-4 col-xs-4 col-mbl-12 text-right-min-500 custom-lable-back-color bold']"));
            for(int i = 0; i < test.size(); ++i) {

                System.out.println("Required fields: " + ((WebElement)test.get(i)).getText().toString());
            }
            Assert.assertEquals(loginPage.isDisplayed(loginPage.FirstName), true);
        } catch (Exception e) {
            Log.error("Exception: " + e.toString());
        }

    }

    @Test
    public void test02() throws InterruptedException {
        try {
            loginPage.scrollDown(loginPage.UploadNewPhoto);
            loginPage.click(loginPage.UploadNewPhoto);
            loginPage.scrollDown(loginPage.DragDropButton);
            loginPage.click(loginPage.DragDropButton);
            Utils.fileAttach(Constants.ImageFilePath);
            Thread.sleep(2000);
            loginPage.scrollDown(loginPage.SaveButton);
            Thread.sleep(2000);
            loginPage.click(loginPage.SaveButton);
            Thread.sleep(2000);
            loginPage.scrollDown(loginPage.Massage);
            Assert.assertEquals(loginPage.isDisplayed(loginPage.UploadedImage), true);
        } catch (Exception e) {
            Log.error("Exception: " + e.toString());
        }

    }

    @Test
    public void test03() throws InterruptedException {
        try {
            loginPage.enterText(loginPage.FirstName, "Monica");
            loginPage.enterText(loginPage.LastName, "Sawant");
            loginPage.enterText(loginPage.Email, "abc@gmail.com");
            loginPage.click(loginPage.MobileCheckbox);
            loginPage.enterText(loginPage.MobileNumber, "9898989898");
            loginPage.enterText(loginPage.MobileExtention, "91");
            loginPage.scrollDown(loginPage.RadioGroup1);
            loginPage.click(loginPage.RadioGroup1);
            loginPage.click(loginPage.GenderFemale);
            loginPage.enterText(loginPage.LastName2, "Sawant");
            loginPage.select_DropDown_Using_Index(loginPage.Profile, 2);
            loginPage.enterText(loginPage.ProfileDescription, "Profile");
            loginPage.enterText(loginPage.ProfileNickName, "Monica");
            Thread.sleep(1000);
            loginPage.click(loginPage.GroupLeaderCheckBox);
            Thread.sleep(1000);
            loginPage.enterText(loginPage.GroupName, "Group");
            loginPage.enterText(loginPage.State, "MH");
            loginPage.enterText(loginPage.City, "Pune");
            loginPage.enterText(loginPage.PayPeople, "Pay");
            loginPage.click(loginPage.AttendingStatusYes);
            Thread.sleep(1000);
            loginPage.click(loginPage.ShowMyInfoCheckbox);
            loginPage.click(loginPage.SaveCheckBox);
            loginPage.select_DropDown_Using_Index(loginPage.Ticket, 2);
            loginPage.enterText(loginPage.Password, "monica@123");
            loginPage.enterText(loginPage.ConfirmPassword, "monica@123");
            loginPage.select_DropDown_Using_Index(loginPage.SecurityQuestion, 2);
            loginPage.enterText(loginPage.SecurityAnswer, "Pune");
            loginPage.SecurityAnswer.submit();
            Thread.sleep(2000);
            Assert.assertEquals(loginPage.isDisplayed(loginPage.SecurityAnswer), false);
        } catch (Exception e) {
            Log.error("Exception: " + e.toString());
        }

    }*/
}

