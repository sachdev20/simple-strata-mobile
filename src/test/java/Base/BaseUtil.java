package Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.joda.time.Seconds;
import org.junit.rules.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseUtil {
    public BaseUtil() throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("deviceName", "Redmi Note 7s");
        caps.setCapability("udid", "75e9c45e"); //DeviceId from "adb devices" command
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "9");
        caps.setCapability("skipUnlock","true");
        caps.setCapability("appPackage", "com.servingmodel");
        caps.setCapability("noReset","false");
        caps.setCapability("autoDismissAlerts", true);
        caps.setCapability("app","/Users/sagarsachdev/Downloads/app-flavor-debug.apk");
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);

        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
    }

    public AndroidDriver<MobileElement> driver;
    public WebDriverWait wait;
}
