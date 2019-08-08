package pageClass;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {


    public static Dashboard dashboard = new Dashboard();

    public Dashboard() {

    }

    public static Dashboard getInstance () {
        return dashboard;
    }

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());
    WebDriver driver;

    @FindBy(xpath = "//*[@class='am-fade ng-scope']")
    WebElement nameDropdownOnDashboard;

    @FindBy(xpath = "//*[text()='Sign Out']")
    WebElement signOutLinkOnDashboard;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"\u200E\u200F\u200E\u200E\u200E\u200E\u200E\u200F\u200E\u200F\u200F\u200F\u200E\u200E\u200E\u200E\u200E\u200F\u200E\u200E\u200F\u200E\u200E\u200E\u200E\u200F\u200F\u200F\u200F\u200F\u200E\u200F\u200F\u200E\u200F\u200F\u200E\u200E\u200E\u200E\u200F\u200F\u200F\u200F\u200F\u200F\u200F\u200E\u200F\u200F\u200F\u200F\u200F\u200E\u200F\u200E\u200E\u200F\u200F\u200E\u200F\u200E\u200E\u200E\u200E\u200E\u200F\u200F\u200F\u200E\u200F\u200E\u200E\u200E\u200E\u200E\u200F\u200F\u200E\u200F\u200F\u200E\u200E\u200F\u200E\u200F\u200E\u200F\u200F\u200F\u200F\u200F\u200E\u200ENavigate up\u200E\u200F\u200E\u200E\u200F\u200E\"]")
    WebElement leftNevigationIcon;

    @FindBy(xpath = "//android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[1]/android.widget.CheckedTextView")
    WebElement organisationTabLeftPanel;

    @FindBy(xpath = "//android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout")
    WebElement organizationBoard;

    @FindBy(xpath = "//android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageButton")
    WebElement addFunctionIcon;

    @FindBy(xpath = "//android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView[3]")
    WebElement addNewFunctionSubIcon;

    @FindBy(xpath = "//android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")
    WebElement titleOfFunction;

    @FindBy(xpath = "//android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
    WebElement description;

    @FindBy(xpath = "//android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.Spinner/android.widget.TextView")
    WebElement priorityDropdown;

    @FindBy(xpath = "//android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]")
    WebElement highPriorityLable;

    @FindBy(xpath = "//android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView")
    WebElement createButtonOnFunction;

    @FindBy(xpath = "//android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout[1]/android.widget.TextView[2]")
    WebElement expectationsMenu;

    @FindBy(xpath = "//android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView[1]")
    WebElement newCreatedExpectation;

    public Dashboard(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickNameDropDownOnDashboard() throws InterruptedException {
        nameDropdownOnDashboard.click();
        Thread.sleep(2000);
    }

    public void clickSignOutLink() throws InterruptedException {
        signOutLinkOnDashboard.click();
        Thread.sleep(3000);
    }

    public void clickleftNevigationIcon() throws InterruptedException {
        leftNevigationIcon.click();
        Thread.sleep(1000);
    }

    public void selectOrgaisationInLeftPanel() throws InterruptedException {
        organisationTabLeftPanel.click();
    }

    public void addNewFunctionInOrganisation() throws InterruptedException {
        organizationBoard.click();
        Thread.sleep(2000);
        addFunctionIcon.click();
        Thread.sleep(1000);
        addNewFunctionSubIcon.click();
        Thread.sleep(2000);
        titleOfFunction.sendKeys("Automated Title");
        description.sendKeys("Test Description");
        priorityDropdown.click();
        Thread.sleep(1000);
        highPriorityLable.click();
        createButtonOnFunction.click();
        Thread.sleep(4000);
    }

    public void clickOnExpectations(){
        expectationsMenu.click();
    }

    public String getNewExpectation(){
        return newCreatedExpectation.getText();
    }
}