package Pages;

import Core.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Actions {
    WebDriver driver;

    public LoginPage(WebDriver Driver) {
        super(Driver);
        this.driver = Driver;
        PageFactory.initElements(Driver, this);
    }


    @FindBy(xpath = "//input[@name='field[12052][value]']")
    public WebElement FirstName;

    @FindBy(xpath = "//input[@name='field[12053][value]']")
    public WebElement LastName;

    @FindBy(xpath = "//input[@name='field[12054][value]']")
    public WebElement Email;

    @FindBy(xpath = "//*[contains(@text,'Phone Numbers :')]")
    public WebElement PhoneNumbers;

    @FindBy(xpath = "//input[@name='field[12055][value][6884][flag]']")
    public WebElement MobileCheckbox;

    @FindBy(xpath = "//input[@name='field[12055][value][6884][number]']")
    public WebElement MobileNumber;

    @FindBy(xpath = "//input[@name='field[12055][value][6884][extension]']")
    public WebElement MobileExtention;

    @FindBy(xpath = "//label[@for='field-12056-field_value_id-3627']")
    public WebElement RadioGroup1;

    @FindBy(xpath = "//input[@id='field-12056-sub_field_ids-20-field_value_id-2']")
    public WebElement GenderFemale;

    @FindBy(xpath = "//input[@name='field[12056][sub_field_ids][2][value]']")
    public WebElement LastName2;

    @FindBy(xpath = "//select[(@name='field[12058][field_value_id]')]")
    public WebElement Profile;

    @FindBy(xpath = "//textarea[@name='field[12058][sub_field_ids][6839][value]']")
    public WebElement ProfileDescription;

    @FindBy(xpath = "//input[@name='field[12058][sub_field_ids][5936][value]']")
    public WebElement ProfileNickName;

    @FindBy(xpath = "//*[contains(text(),'Upload new Photo')]")
    public WebElement UploadNewPhoto;

    @FindBy(xpath = "//*[contains(text(),'Drag OR Click to start cropping image')]")
    public WebElement DragDropButton;

    @FindBy(xpath = "//*[contains(text(),'CROP / SAVE')]")
    public WebElement SaveButton;

    @FindBy(xpath = "//img[@alt='Photo']")
    public WebElement UploadedImage;

    @FindBy(xpath = "//*[contains(text(),'File should be in a gif, jpg, jpeg or png format, no more than 500kB and up to 300x300 (not less than 70x35) pixels.')]")
    public WebElement Massage;

    @FindBy(xpath = "//input[@id='group_leader']")
    public WebElement GroupLeaderCheckBox;

    @FindBy(xpath = "//input[@name='group_name']")
    public WebElement GroupName;

    @FindBy(xpath = "//input[@name='group_state']")
    public WebElement State;

    @FindBy(xpath = "//input[@name='group_city']")
    public WebElement City;

    @FindBy(xpath = "//input[@name='group_people']")
    public WebElement PayPeople;

    @FindBy(xpath = "//input[@id='attending_status_yes']")
    public WebElement AttendingStatusYes;

    @FindBy(xpath = "//input[@name='show_information'][2]")
    public WebElement ShowMyInfoCheckbox;

    @FindBy(xpath = "//input[@name='show_rsvp_information'][2]")
    public WebElement SaveCheckBox;

    @FindBy(xpath = "//select[@class='select_new section_count select_section_674']")
    public WebElement Ticket;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement Password;

    @FindBy(xpath = "//input[@name='confirm_password']")
    public WebElement ConfirmPassword;

    @FindBy(xpath = "//select[@name='security_question_id']")
    public WebElement SecurityQuestion;

    @FindBy(xpath = "//input[@name='security_answer']")
    public WebElement SecurityAnswer;



}