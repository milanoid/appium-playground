import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumBrowserStackDemoIos {

    public static String userName = System.getenv("bs_username");
    public static String accessKey = System.getenv("bs_password");

    public static void main(String args[]) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("device", "iPhone 7 Plus");
        // upload package (.apk or .ipa) to browserstack first - returns unique id
        // curl -k -u "[bs_username]:[bs_password]" -X POST "https://api.browserstack.com/app-automate/upload" -F "file=@App.ipa"
        caps.setCapability("app", "bs://829767486b970640c95705f670eb38ee9e15ec65");


        IOSDriver<IOSElement> driver = new IOSDriver<IOSElement>(new URL("http://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);

        WebDriverWait wait = new WebDriverWait(driver, 5);

        driver.quit();
    }
}