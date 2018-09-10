package uz.smst.cabinet.Tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import uz.smst.cabinet.Settings.WebDriverSettings;

public class Foundations extends WebDriverSettings {


    @Test
    public void vaqf() throws Exception {

        driver.findElement(By.xpath("//i[@class='fa u-charity']")).click();

        Assert.assertTrue(isElementPresent(By.xpath("//img[@class='img-responsive hvr-bounce-in']")));

        driver.findElement(By.xpath("//div[@class='card card-action']//div[@class='card-body']")).click();

        new Select(driver.findElement(By.name("regionCode"))).selectByVisibleText("Вакф");

        new Select(driver.findElement(By.name("regionCode"))).selectByVisibleText("Закят, Фитр, Ушр");

        new Select(driver.findElement(By.name("regionCode"))).selectByVisibleText("Хайрия");

        driver.findElement(By.name("account")).clear();
        driver.findElement(By.name("account")).sendKeys("Test");

        driver.findElement(By.name("amount")).clear();
        driver.findElement(By.name("amount")).sendKeys("500");

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Assert.assertTrue(isElementPresent(By.xpath("//div[@class='pay-logo']//img[@class='ng-tns-c7-4']")));

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
