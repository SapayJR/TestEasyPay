package uz.smst.cabinet.Settings;



/**
 * Created by SapayJR on 05.06.2018.
 */

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class WebDriverSettings {
    public ChromeDriver driver;


    @Before
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://pay.smst.uz/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @After
    public void tearDown() throws Exception {
        if (driver != null)
        driver.quit();
    }
}
