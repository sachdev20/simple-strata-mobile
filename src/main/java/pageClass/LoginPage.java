package pageClass;

import constants.CommonMethodsAndConstants;
import gherkin.lexer.Th;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class LoginPage extends CommonMethodsAndConstants {

    public static LoginPage loginPage = new LoginPage();

    public LoginPage() {

    }

    public static LoginPage getInstance () {
        return loginPage;
    }

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    WebDriver driver;

    @FindBy(xpath = "//*[text()='Create now']")
    WebElement createNewButton;

    @FindBy(xpath = "//*[@name='organizationName']")
    WebElement orgNameOnRegister;

    @FindBy(xpath = "//*[@name='firstName']")
    WebElement firstName;

    @FindBy(xpath = "//*[@name='lastName']")
    WebElement lastName;

    @FindBy(xpath = "//*[@id='input_5']")
    WebElement emailToRegister;

    @FindBy(xpath = "//*[@id='input_6']")
    WebElement passwordToRegister;

    @FindBy(xpath = "//*[text()='Agree About']")
    WebElement acceptConditionBox;

    @FindBy(xpath = "//*[text()='Create now']")
    WebElement createNowButtonOnRegister;

    @FindBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
    WebElement loginEmail;

    @FindBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
    WebElement loginPassword;

    @FindBy(xpath = "//android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button")
    WebElement loginButton;

    @FindBy(xpath = "//android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ImageView")
    WebElement shakeModalonLaunch;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



    public void enterRegisterationDetails() {
        orgNameOnRegister.sendKeys("Test organisation - Automation");
        firstName.sendKeys("Automated First Name");
        lastName.sendKeys("Automated Last Name");
        emailToRegister.sendKeys("automatesimplestrataQA3@mailinator.com");
        passwordToRegister.sendKeys("SimpleQA@1234");
        acceptConditionBox.click();
    }

    public void enterEmailonLogin() throws InterruptedException {
        {
            loginEmail.clear();
            loginEmail.sendKeys("automatesimplestrataQA2@mailinator.com");
            }
    }

    public void entePasswordonLogin() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        {
            loginPassword.click();
            loginPassword.sendKeys("SimpleQA@1234");
        }
    }

    public void clickLoginButtonOnLoginPage() throws InterruptedException {
        loginButton.click();
        Thread.sleep(5000);
    }

    public void clickCreateNowButtonOnRegister() throws InterruptedException {
        createNowButtonOnRegister.click();
        Thread.sleep(10000);
    }
}
