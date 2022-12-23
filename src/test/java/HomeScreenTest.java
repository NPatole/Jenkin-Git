import Browser.OpenBrowser;
import Core.Actions;
import Core.Constants;
import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeScreenTest extends BaseTest {
    HomePage homepage;

    @BeforeClass
    public void beforeClass() {
        homepage = new HomePage(Driver);
    }

    @Test
    public void clickOnAllMenuButton()  {
        homepage.click(homepage.HamburgerMenu);
        homepage.scrollDown(homepage.WomensFashionButton);
    }
}
