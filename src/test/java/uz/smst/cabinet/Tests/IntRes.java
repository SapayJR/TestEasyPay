package uz.smst.cabinet.Tests;

import org.junit.Test;
import org.openqa.selenium.By;
import uz.smst.cabinet.Settings.WebDriverSettings;

public class IntRes extends WebDriverSettings {


    @Test

        public void OLX() throws Exception {

        driver.findElement(By.className("uicon-cat-internet-services")).click();
        Thread.sleep(3000);

        driver.findElement(By.linkText("OLX.uz (torg.uz)")).click();
        Thread.sleep(3000);

        driver.findElement(By.name("account")).clear();
        driver.findElement(By.name("account")).sendKeys("4619");
        Thread.sleep(3000);

        driver.findElement(By.name("amount")).clear();
        driver.findElement(By.name("amount")).sendKeys("500");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);

        driver.findElement(By.name("cardNumber")).clear();
        driver.findElement(By.name("cardNumber")).sendKeys("8600510369728378");
        Thread.sleep(3000);


        driver.findElement(By.name("exDate")).clear();
        driver.findElement(By.name("exDate")).sendKeys("0820");
        Thread.sleep(3000);

        driver.findElement(By.name("phoneNumber")).clear();
        driver.findElement(By.name("phoneNumber")).sendKeys("901203445");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(10000);

    }

}
