package uz.smst.cabinet.Tests;

import org.junit.Test;
import org.openqa.selenium.By;
import uz.smst.cabinet.Settings.WebDriverSettings;

public class Amuse extends WebDriverSettings {


    @Test

    public void Anhor() throws Exception {

        driver.findElement(By.linkText("Развлечение")).click();
        Thread.sleep(3000);

        driver.findElement(By.linkText("Lokomotiv Anhor")).click();
        Thread.sleep(3000);

        driver.findElement(By.name("account")).clear();
        driver.findElement(By.name("account")).sendKeys("126969");
        Thread.sleep(3000);

        driver.findElement(By.name("amount")).clear();
        driver.findElement(By.name("amount")).sendKeys("500");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(10000);

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


    @Test

    public void Istirohat() throws Exception {

        driver.findElement(By.linkText("Развлечение")).click();
        Thread.sleep(3000);

        driver.findElement(By.linkText("Lokomotiv Istirohat")).click();
        Thread.sleep(3000);

        driver.findElement(By.name("account")).clear();
        driver.findElement(By.name("account")).sendKeys("416512");
        Thread.sleep(3000);

        driver.findElement(By.name("amount")).clear();
        driver.findElement(By.name("amount")).sendKeys("500");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(10000);

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
