import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumBrowserStackDemo {

    public static String userName = System.getenv("bs_username");
    public static String accessKey = System.getenv("bs_password");

    public static void main(String args[]) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("device", "Google Nexus 6");
        caps.setCapability("os_version", "6.0");
        // .apk uploaded first by curl - returns unique id
        caps.setCapability("app", "bs://[unique id]");


        AndroidDriver driver = new AndroidDriver(new URL("https://" + userName + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub"), caps);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Časté dotazy\")"))).click();

        driver.quit();
    }
}