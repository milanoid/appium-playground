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
        // upload package (.apk or .ipa) to browserstack first - returns unique id
        // curl -k -u "[bs_username]:[bs_password]" -X POST "https://api.browserstack.com/app-automate/upload" -F "file=@App.apk"
        caps.setCapability("app", "bs://556574a888b0f4a7b2bc79f6a549f50b7c02cf91");


        AndroidDriver driver = new AndroidDriver(new URL("https://" + userName + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub"), caps);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Časté dotazy\")"))).click();

        driver.quit();
    }
}