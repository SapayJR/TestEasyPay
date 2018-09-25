package uz.smst.cabinet.Tests;

import org.junit.Assert;
import org.junit.Test;
import org.omg.PortableServer.THREAD_POLICY_ID;
import org.openqa.selenium.By;
import uz.smst.cabinet.Settings.WebDriverSettings;

public class Education extends WebDriverSettings {


    @Test
    public void INHA() throws Exception{


        driver.findElement(By.linkText("Образование")).click();

        driver.findElement(By.linkText("Университет ИНХА")).click();

        driver.findElement(By.name("account")).sendKeys(".,.,.");
        Thread.sleep(2000);

        Assert.assertEquals("Введите правильные данные",
                driver.findElement(By.xpath("//div[@class='form-control-feedback ng-tns-c5-2 ng-star-inserted']")).getText());

        driver.findElement(By.name("account")).clear();
        driver.findElement(By.name("account")).sendKeys("123456789");

        driver.findElement(By.name("amount")).sendKeys("1");
        Thread.sleep(2000);

        Assert.assertEquals("Обязательное поле",
                driver.findElement(By.xpath("//div[@class='form-control-feedback ng-tns-c5-6 ng-star-inserted']")).getText());

    }
}
