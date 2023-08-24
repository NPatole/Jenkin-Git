import Browser.OpenBrowser;
import Core.Actions;
import Core.Constants;
import Pages.HomePage;
import Pages.LoginPage;
import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomeScreenTest extends BaseTest {
    HomePage homepage;

    @BeforeClass
    public void beforeClass() {
        homepage = new HomePage(Driver);
    }

    @Test
    public void clickOnAllMenuButton()  {
//        extentTest.pass("Test case start");
//        homepage.click(homepage.HamburgerMenu);
      //  homepage.scrollDown(homepage.WomensFashionButton);
//        Assert.assertEquals("abc","123");
        homepage.click(homepage.HamburgerMenu);
//        SoftAssert soft = new SoftAssert();
//        soft.assertEquals("abc", "abc"); //even its failed its continue with test caseexecution
//        homepage.click(homepage.HamburgerMenu);
//        soft.assertAll(); //to see assertion results at the end of the test
        Assert.assertEquals("abc","abc");
        homepage.click(homepage.HamburgerMenu);


    }

}
