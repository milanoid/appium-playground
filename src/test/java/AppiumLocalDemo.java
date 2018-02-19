import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumLocalDemo {
    public static void main(String args[]) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("deviceName", "Android Emulator");
        caps.setCapability("platformname", "Android");
        caps.setCapability("app", "[full path to .apk file]");
        caps.setCapability("appActivity", "cz.zonky.screens.RouterActivity");
        caps.setCapability("appWaitActivity", "cz.zonky.screens.dashboard.anonym.AnonymousDashboardActivity");
        caps.setCapability("newCommandTimeout", "9999");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        WebDriverWait wait = new WebDriverWait(driver, 5);

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Časté dotazy\")"))).click();

        driver.quit();
    }

}