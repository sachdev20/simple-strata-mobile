package stepDefinitions;

import Base.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import dataProvider.ConfigFileReader;
import org.testng.Assert;
import pageClass.Dashboard;
import pageClass.LoginPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class StepDefinition extends BaseUtil {
    private BaseUtil base;
    private LoginPage loginPage;
    private Dashboard dashboard;

    public StepDefinition(BaseUtil base) throws MalformedURLException, InterruptedException {
        this.base = base;
    }

    ConfigFileReader configFileReader = new ConfigFileReader();

    @And("^I enter signup details on register page$")
    public void IEnterSignUpDetailsOnRegisterPage() {
        loginPage = new LoginPage(driver);
        loginPage.enterRegisterationDetails();
    }

    @And("^I click on create now button on register page$")
    public void IClickOnCreateNowButtonOnRegisterPage() throws InterruptedException {
        loginPage = new LoginPage(driver);
        loginPage.clickCreateNowButtonOnRegister();
    }

    @And("^I sign out from current user$")
    public void IClickOnNameDropdownOnDashboard() throws InterruptedException {
        dashboard = new Dashboard(driver);
        dashboard.clickNameDropDownOnDashboard();
        dashboard.clickSignOutLink();
    }

    @And("^I enter username and password on login page$")
    public void IEnterUsernameAndPasswordOnLoginPage() throws InterruptedException {
        loginPage = new LoginPage(driver);
        loginPage.enterEmailonLogin();
        loginPage.entePasswordonLogin();
    }

    @And("^I click on login button on login page$")
    public void IClickOnLoginButton() throws InterruptedException {
        loginPage = new LoginPage(driver);
        loginPage.clickLoginButtonOnLoginPage();
    }

    @And("^I click on left navigation icon$")
    public void IClickOnLeftNevigationIcon() throws InterruptedException {
        dashboard = new Dashboard(driver);
        dashboard.clickleftNevigationIcon();
    }

    @And("^I select organisation tab from left panel$")
    public void ISelectOrgTab() throws InterruptedException {
        dashboard = new Dashboard(driver);
        dashboard.selectOrgaisationInLeftPanel();
        Thread.sleep(3000);
    }

    @And("^I create a new function under my organisation$")
    public void ICreateNewFunctionUnderMyOrganisation() throws InterruptedException {
        dashboard = new Dashboard(driver);
        dashboard.addNewFunctionInOrganisation();
    }

    @And("^I verify that new function has been created$")
    public void IVerifyNewFunctionCreated() throws InterruptedException {
        dashboard = new Dashboard(driver);
        dashboard.clickOnExpectations();
        Thread.sleep(4000);
        Assert.assertEquals(dashboard.getNewExpectation(), "Automated Title");
    }
}
