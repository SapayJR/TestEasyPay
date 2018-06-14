package uz.smst.cabinet.Tests;

import org.junit.Test;
import org.openqa.selenium.By;
import uz.smst.cabinet.Settings.WebDriverSettings;

public class TV extends WebDriverSettings {






    @Test

    public void Mediabay() throws Exception {



        driver.findElement(By.className("uicon-cat-tv")).click();
        Thread.sleep(3000);


        driver.findElement(By.linkText("Mediabay.uz")).click();
        Thread.sleep(3000);

        driver.findElement(By.name("account")).clear();
        driver.findElement(By.name("account")).sendKeys("255587");
        Thread.sleep(2000);

        driver.findElement(By.name("amount")).clear();
        driver.findElement(By.name("amount")).sendKeys("500");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(10000);





    }
}
