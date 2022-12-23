package Pages;

import Core.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Actions {

    WebDriver driver;
    public HomePage(WebDriver Driver) {
        super(Driver);
        this.driver = Driver;
        PageFactory.initElements(Driver, this);
}

    @FindBy(id = "nav-hamburger-menu")
    public WebElement HamburgerMenu;
    @FindBy(xpath = "//div[text()='Women's Fashion']")
    public WebElement WomensFashionButton;


}
