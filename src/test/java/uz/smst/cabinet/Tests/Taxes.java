package uz.smst.cabinet.Tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import uz.smst.cabinet.Settings.WebDriverSettings;

public class Taxes extends WebDriverSettings {


    @Test

        public void InsurTax() throws Exception {

        driver.findElement(By.className("uicon-cat-tax")).click();
        Thread.sleep(3000);


        driver.findElement(By.linkText("Налоги и государственные сборы")).click();
        Thread.sleep(3000);

        new Select(driver.findElement(By.name("typeValue"))).selectByVisibleText("38 - Страховой сбор ИП");
        Thread.sleep(3000);

        driver.findElement(By.name("account")).clear();
        driver.findElement(By.name("account")).sendKeys("518889356");
        Thread.sleep(3000);

        driver.findElement(By.name("amount")).clear();
        driver.findElement(By.name("amount")).sendKeys("500");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(15000);


        driver.findElement(By.linkText("518889356")).click();
        Thread.sleep(15000);


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
        Thread.sleep(15000);


    }

    @Test

         public void IncomeTax() throws Exception {

        driver.findElement(By.className("uicon-cat-tax")).click();
        Thread.sleep(3000);


        driver.findElement(By.linkText("Налоги и государственные сборы")).click();
        Thread.sleep(3000);

        new Select(driver.findElement(By.name("typeValue"))).selectByVisibleText("47 - Подоходный сбор ИП");
        Thread.sleep(3000);

        driver.findElement(By.name("account")).clear();
        driver.findElement(By.name("account")).sendKeys("487702834");
        Thread.sleep(3000);

        driver.findElement(By.name("amount")).clear();
        driver.findElement(By.name("amount")).sendKeys("500");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(15000);


//        driver.findElement(By.linkText("518889356")).click();
//        Thread.sleep(15000);



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
        Thread.sleep(15000);


    }

    @Test

         public void IncomeDeclar() throws Exception {

        driver.findElement(By.className("uicon-cat-tax")).click();
        Thread.sleep(3000);


        driver.findElement(By.linkText("Налоги и государственные сборы")).click();
        Thread.sleep(3000);

        new Select(driver.findElement(By.name("typeValue"))).selectByVisibleText("51 - Подоходный налог - Декларация");
        Thread.sleep(3000);

        driver.findElement(By.name("account")).clear();
        driver.findElement(By.name("account")).sendKeys("547000886");
        Thread.sleep(3000);

        driver.findElement(By.name("amount")).clear();
        driver.findElement(By.name("amount")).sendKeys("500");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(15000);

//        driver.findElement(By.linkText("518889356")).click();
//        Thread.sleep(15000);

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
        Thread.sleep(15000);


    }

    @Test

        public void PropertyTax() throws Exception {

        driver.findElement(By.className("uicon-cat-tax")).click();
        Thread.sleep(3000);


        driver.findElement(By.linkText("Налоги и государственные сборы")).click();
        Thread.sleep(3000);

        new Select(driver.findElement(By.name("typeValue"))).selectByVisibleText("66 - Налог на имущество");
        Thread.sleep(3000);

        driver.findElement(By.name("account")).clear();
        driver.findElement(By.name("account")).sendKeys("463106908");
        Thread.sleep(3000);

        driver.findElement(By.name("amount")).clear();
        driver.findElement(By.name("amount")).sendKeys("500");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(15000);


//        driver.findElement(By.linkText("518889356")).click();
//        Thread.sleep(15000);

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
        Thread.sleep(15000);


    }

    @Test

        public void LandTax() throws Exception {

        driver.findElement(By.className("uicon-cat-tax")).click();
        Thread.sleep(3000);


        driver.findElement(By.linkText("Налоги и государственные сборы")).click();
        Thread.sleep(3000);

        new Select(driver.findElement(By.name("typeValue"))).selectByVisibleText("67 - Земельный налог");
        Thread.sleep(3000);

        driver.findElement(By.name("account")).clear();
        driver.findElement(By.name("account")).sendKeys("486408384");
        Thread.sleep(3000);

        driver.findElement(By.name("amount")).clear();
        driver.findElement(By.name("amount")).sendKeys("500");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(15000);

//        driver.findElement(By.linkText("518889356")).click();
//        Thread.sleep(15000);

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
        Thread.sleep(15000);


    }

    @Test

         public void PenaltyTax() throws Exception {

        driver.findElement(By.className("uicon-cat-tax")).click();
        Thread.sleep(3000);


        driver.findElement(By.linkText("Налоги и государственные сборы")).click();
        Thread.sleep(3000);

        new Select(driver.findElement(By.name("typeValue"))).selectByVisibleText("199 - Оплата за начисленную пеню");
        Thread.sleep(3000);

        driver.findElement(By.name("account")).clear();
        driver.findElement(By.name("account")).sendKeys("535110756");
        Thread.sleep(3000);

        driver.findElement(By.name("amount")).clear();
        driver.findElement(By.name("amount")).sendKeys("500");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(15000);

//        driver.findElement(By.linkText("518889356")).click();
//        Thread.sleep(15000);

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
        Thread.sleep(15000);


    }




}
