package uz.smst.cabinet.Tests;

import org.junit.Assert;
import org.junit.Test;
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

        Assert.assertEquals("Минимальная сумма сум.",
                driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-modal[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]")).getText());

        driver.findElement(By.name("amount")).clear();
        driver.findElement(By.name("amount")).sendKeys("500");

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);

        Assert.assertTrue(isElementPresent(By.xpath("//h3[contains(text(),'Оплата за услугу Университет ИНХА')]")));
        Assert.assertTrue(isElementPresent(By.xpath("//div[@class='pay-logo']//img[@class='ng-tns-c7-3']")));
        Assert.assertTrue(isElementPresent(By.xpath("//div[contains(@class,'col-lg-12 pay-logo text-center')]//img[@class='ng-tns-c7-3']")));

        driver.findElement(By.name("cardNumber")).clear();
        driver.findElement(By.name("cardNumber")).sendKeys("8600510369728358");
        Thread.sleep(3000);


        driver.findElement(By.name("exDate")).clear();
        driver.findElement(By.name("exDate")).sendKeys("2008");


        driver.findElement(By.name("phoneNumber")).clear();
        driver.findElement(By.name("phoneNumber")).sendKeys("901203445");


        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Номер карты не соответствует остальным данным, перепроверьте все данные",
                driver.findElement(By.xpath("//h3[@class='alert alert-danger']")).getText());


        driver.findElement(By.name("cardNumber")).clear();
        driver.findElement(By.name("cardNumber")).sendKeys("8600510369728378");



        driver.findElement(By.name("exDate")).clear();
        driver.findElement(By.name("exDate")).sendKeys("2008");


        driver.findElement(By.name("phoneNumber")).clear();
        driver.findElement(By.name("phoneNumber")).sendKeys("901203445");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);

        Assert.assertEquals("Убедительная просьба проверить все данные, если данные верны то введите код и нажмите продолжить.",
                driver.findElement(By.xpath("//div[@class='alert alert-info']")).getText());

    }
}
