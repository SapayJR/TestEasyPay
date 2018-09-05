package uz.smst.cabinet.Settings;





import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import sun.security.krb5.internal.crypto.Des;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public class WebDriverSettings {


    /**
     * Настройки для Google Chrome
     */

    public ChromeDriver driver;

    @Before
    public void setUp(){
        driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 30, 10000);
        driver.get("https://pay.smst.uz/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


      /**
           * Настройки для переключения на  Firefox
        */
      // TODO Дописать и настроить кроссбраузерное тестирование


//    public FirefoxDriver driver;
//
//    @Before
//    public void setUp() throws Exception{
//
//        System.setProperty("webdriver.gecko.driver","C:\\GeckoDriver\\geckodriver.exe");
//
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//
//        capabilities = DesiredCapabilities.firefox();
//        capabilities.setBrowserName("firefox");
//        capabilities.setVersion("60.0");
//        capabilities.setPlatform(Platform.WIN10);
//        capabilities.setCapability("marionette", false);
//
//        WebDriver driver = new FirefoxDriver();
//        driver.get("https://pay.smst.uz/");
//        WebDriverWait wait = new WebDriverWait(driver, 30, 10000);
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    @After
    public void tearDown() {
        if (driver != null)
        driver.quit();
    }
}
