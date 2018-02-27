import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
        caps.setCapability("app", "C:\\Users\\milan\\Downloads\\App (20).apk");
        caps.setCapability("appActivity", "cz.zonky.screens.RouterActivity");
        caps.setCapability("appWaitActivity", "cz.zonky.screens.dashboard.anonym.AnonymousDashboardActivity");
        caps.setCapability("newCommandTimeout", "9999");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        WebDriverWait wait = new WebDriverWait(driver, 5);


        String birthNumberPrefix = "965609";
        String birthNumberSuffix = "3227";
        String email = "user@email.cz";


        // 1. Vyplnit poptavku
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Vyplnit poptávku\")"))).click();

        // 2. O jakou pujcku mate zajem?
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Refinancování drahých půjček\")"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Pokračovat\")"))).click();

        // 3. Kolik si chcete pujcit?
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Pokračovat\")"))).click();

        // 4. Kolik muzete mesicne splacet?
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Pokračovat\")"))).click();

        // 5. Jak se jmenujete?
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/TextInputLayout[1]/android.widget.FrameLayout/android.widget.EditText")))
                .sendKeys("Jan");

        driver.hideKeyboard();

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/TextInputLayout[2]/android.widget.FrameLayout/android.widget.EditText")))
                .click();

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/TextInputLayout[2]/android.widget.FrameLayout/android.widget.EditText")))
                .sendKeys("Novak");

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Pokračovat\")"))).click();

        // 6. Vase kontaktni udaje
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Telefon\")")))
                .sendKeys("606505404");

        driver.hideKeyboard();

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"cz.zonky.beta:id/edit_email\")")))
                .click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"cz.zonky.beta:id/edit_email\")")))
                .sendKeys(email);
        driver.hideKeyboard();

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"cz.zonky.beta:id/edit_password\")")))
                .click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"cz.zonky.beta:id/edit_password\")")))
                .sendKeys("password");
        driver.hideKeyboard();

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.CheckBox")))
                .click();

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.CheckBox")))
                .click();

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Pokračovat\")"))).click();

        // 7. Jaky je vas rodinny stav?
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Vdaná / ženatý\")")))
                .click();

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Pokračovat\")"))).click();

        // 8. Kolik zivite deti?
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Pokračovat\")"))).click();

        // 9. Kde bydlite?
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAndroidUIAutomator("new UiSelector().text(\"V nájmu\")")))
                .click();

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Pokračovat\")"))).click();

        // 10. Jake mate vzdelani?
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Základní\")")))
                .click();

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Pokračovat\")"))).click();

        // 11. Jak se zivite?

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Jsem zaměstnanec\")")))
                .click();

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Pokračovat\")"))).click();

        // 12. Jake mate prvidelne mesicni prijmy?

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Pokračovat\")"))).click();

        // 13. Jake jsou vase mesicni vydaje?

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Pokračovat\")"))).click();

        // 14. Zadejte rodne cislo

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText")))
                .sendKeys(birthNumberPrefix);

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText")))
                .sendKeys(birthNumberSuffix);

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Pokračovat\")"))).click();

        // 15. Zadejte vasi trvalou adresu v CR

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Ulice\")")))
                .sendKeys("Jesenicka");

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Číslo popisné/orientační\")")))
                .sendKeys("1");

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAndroidUIAutomator("new UiSelector().text(\"PSČ\")")))
                .sendKeys("10600");

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAndroidUIAutomator("new UiSelector().text(\"PSČ\")")))
                .sendKeys("Praha 10");

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Pokračovat\")"))).click();

        // 16. SMS overeni

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.EditText")))
                .sendKeys("000123");

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Pokračovat\")"))).click();

        // 17. Vysledek online scoringu - prednabidka

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Děkuji, nemám zájem.\")")));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Pokračovat\")"))).click();

        // 18. Nahrani dokladu - uvod
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Pokračovat\")"))).click();

        // 19. Nahrani dokladu - OP
        //. TBD

        // 20. Nahrani dokladu - druhy doklad totoznosti

        // 21. Nahrani dokladu - vypis z uctu


        driver.quit();
    }

}