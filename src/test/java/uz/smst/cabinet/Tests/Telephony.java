package uz.smst.cabinet.Tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import uz.smst.cabinet.Settings.WebDriverSettings;

public class Telephony extends WebDriverSettings {

    @Test
        public void UzTelJizzakh() throws Exception {


            driver.findElement(By.className("uicon-cat-telephony")).click();
            Thread.sleep(3000);

            driver.findElement(By.linkText("Узбектелеком")).click();
            Thread.sleep(3000);

            new Select(driver.findElement(By.name("regionCode"))).selectByVisibleText("Джиззак");
            Thread.sleep(1000);

            driver.findElement(By.name("account")).clear();
            driver.findElement(By.name("account")).sendKeys("3922156");
            Thread.sleep(3000);

            driver.findElement(By.name("amount")).clear();
            driver.findElement(By.name("amount")).sendKeys("500");
            Thread.sleep(3000);

            driver.findElement(By.xpath("//button[@type='submit']")).click();
            Thread.sleep(5000);

            new Select(driver.findElement(By.name("type"))).selectByVisibleText("Междугородние звонки");
            Thread.sleep(1000);

            new Select(driver.findElement(By.name("type"))).selectByVisibleText("Городская связь");
            Thread.sleep(1000);

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
        public void JizzakhUZI() throws Exception {


        driver.findElement(By.className("uicon-cat-telephony")).click();
        Thread.sleep(3000);

        driver.findElement(By.linkText("Узбектелеком")).click();
        Thread.sleep(3000);

        new Select(driver.findElement(By.name("regionCode"))).selectByVisibleText("Джиззак");
        Thread.sleep(1000);

        driver.findElement(By.name("account")).clear();
        driver.findElement(By.name("account")).sendKeys("2260513");
        Thread.sleep(3000);

        driver.findElement(By.name("amount")).clear();
        driver.findElement(By.name("amount")).sendKeys("500");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);

        new Select(driver.findElement(By.name("type"))).selectByVisibleText("Междугородние звонки");
        Thread.sleep(1000);

        new Select(driver.findElement(By.name("type"))).selectByVisibleText("Городская связь");
        Thread.sleep(1000);

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
        public void SamarqandUZI() throws Exception {



        driver.findElement(By.className("uicon-cat-telephony")).click();
        Thread.sleep(3000);

        driver.findElement(By.linkText("Узбектелеком")).click();
        Thread.sleep(3000);

        new Select(driver.findElement(By.name("regionCode"))).selectByVisibleText("Самарканд");
        Thread.sleep(1000);

        driver.findElement(By.name("account")).clear();
        driver.findElement(By.name("account")).sendKeys("4752733");
        Thread.sleep(3000);

        driver.findElement(By.name("amount")).clear();
        driver.findElement(By.name("amount")).sendKeys("500");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);

        new Select(driver.findElement(By.name("type"))).selectByVisibleText("Междугородние звонки");
        Thread.sleep(1000);

        new Select(driver.findElement(By.name("type"))).selectByVisibleText("Городская связь");
        Thread.sleep(1000);

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
        public void SamarkandUZTEL() throws Exception {

        driver.findElement(By.className("uicon-cat-telephony")).click();
        Thread.sleep(3000);

        driver.findElement(By.linkText("Узбектелеком")).click();
        Thread.sleep(3000);

        new Select(driver.findElement(By.name("regionCode"))).selectByVisibleText("Самарканд");
        Thread.sleep(1000);

        driver.findElement(By.name("account")).clear();
        driver.findElement(By.name("account")).sendKeys("2328603");
        Thread.sleep(3000);

        driver.findElement(By.name("amount")).clear();
        driver.findElement(By.name("amount")).sendKeys("500");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);

        new Select(driver.findElement(By.name("type"))).selectByVisibleText("Междугородние звонки");
        Thread.sleep(1000);

        new Select(driver.findElement(By.name("type"))).selectByVisibleText("Городская связь");
        Thread.sleep(1000);

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
        public void Surhan() throws Exception {


        driver.findElement(By.className("uicon-cat-telephony")).click();
        Thread.sleep(3000);

        driver.findElement(By.linkText("Узбектелеком")).click();
        Thread.sleep(3000);

        new Select(driver.findElement(By.name("regionCode"))).selectByVisibleText("Сурхандарья");
        Thread.sleep(1000);

        driver.findElement(By.name("account")).clear();
        driver.findElement(By.name("account")).sendKeys("4133789");
        Thread.sleep(3000);

        driver.findElement(By.name("amount")).clear();
        driver.findElement(By.name("amount")).sendKeys("500");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);

        new Select(driver.findElement(By.name("type"))).selectByVisibleText("Междугородние звонки");
        Thread.sleep(1000);

        new Select(driver.findElement(By.name("type"))).selectByVisibleText("Городская связь");
        Thread.sleep(1000);

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
        public void SIRDARYO() throws Exception {


        driver.findElement(By.className("uicon-cat-telephony")).click();
        Thread.sleep(3000);

        driver.findElement(By.linkText("Узбектелеком")).click();
        Thread.sleep(3000);

        new Select(driver.findElement(By.name("regionCode"))).selectByVisibleText("Сирдарья");
        Thread.sleep(1000);

        driver.findElement(By.name("account")).clear();
        driver.findElement(By.name("account")).sendKeys("2278366");
        Thread.sleep(3000);

        driver.findElement(By.name("amount")).clear();
        driver.findElement(By.name("amount")).sendKeys("500");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);

        new Select(driver.findElement(By.name("type"))).selectByVisibleText("Междугородние звонки");
        Thread.sleep(1000);

        new Select(driver.findElement(By.name("type"))).selectByVisibleText("Городская связь");
        Thread.sleep(1000);

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
        public void TashReg() throws Exception {


        driver.findElement(By.className("uicon-cat-telephony")).click();
        Thread.sleep(3000);

        driver.findElement(By.linkText("Узбектелеком")).click();
        Thread.sleep(3000);

        new Select(driver.findElement(By.name("regionCode"))).selectByVisibleText("Ташкентская обл.");
        Thread.sleep(1000);

        driver.findElement(By.name("account")).clear();
        driver.findElement(By.name("account")).sendKeys("5938278");
        Thread.sleep(3000);

        driver.findElement(By.name("amount")).clear();
        driver.findElement(By.name("amount")).sendKeys("500");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);

        new Select(driver.findElement(By.name("type"))).selectByVisibleText("Междугородние звонки");
        Thread.sleep(1000);

        new Select(driver.findElement(By.name("type"))).selectByVisibleText("Городская связь");
        Thread.sleep(1000);

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
        public void Namangan() throws Exception {


        driver.findElement(By.className("uicon-cat-telephony")).click();
        Thread.sleep(3000);

        driver.findElement(By.linkText("Узбектелеком")).click();
        Thread.sleep(3000);

        new Select(driver.findElement(By.name("regionCode"))).selectByVisibleText("Наманган");
        Thread.sleep(1000);

        driver.findElement(By.name("account")).clear();
        driver.findElement(By.name("account")).sendKeys("2371306");
        Thread.sleep(3000);

        driver.findElement(By.name("amount")).clear();
        driver.findElement(By.name("amount")).sendKeys("500");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);

        new Select(driver.findElement(By.name("type"))).selectByVisibleText("Междугородние звонки");
        Thread.sleep(1000);

        new Select(driver.findElement(By.name("type"))).selectByVisibleText("Городская связь");
        Thread.sleep(1000);

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
        public void Khorezm() throws Exception {


        driver.findElement(By.className("uicon-cat-telephony")).click();
        Thread.sleep(3000);

        driver.findElement(By.linkText("Узбектелеком")).click();
        Thread.sleep(3000);

        new Select(driver.findElement(By.name("regionCode"))).selectByVisibleText("Хорезм");
        Thread.sleep(1000);

        driver.findElement(By.name("account")).clear();
        driver.findElement(By.name("account")).sendKeys("2247324");
        Thread.sleep(3000);

        driver.findElement(By.name("amount")).clear();
        driver.findElement(By.name("amount")).sendKeys("500");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);

        new Select(driver.findElement(By.name("type"))).selectByVisibleText("Междугородние звонки");
        Thread.sleep(1000);

        new Select(driver.findElement(By.name("type"))).selectByVisibleText("Городская связь");
        Thread.sleep(1000);

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
        public void Navoi() throws Exception {


        driver.findElement(By.className("uicon-cat-telephony")).click();
        Thread.sleep(3000);

        driver.findElement(By.linkText("Узбектелеком")).click();
        Thread.sleep(3000);

        new Select(driver.findElement(By.name("regionCode"))).selectByVisibleText("Навои");
        Thread.sleep(1000);

        driver.findElement(By.name("account")).clear();
        driver.findElement(By.name("account")).sendKeys("5322177");
        Thread.sleep(3000);

        driver.findElement(By.name("amount")).clear();
        driver.findElement(By.name("amount")).sendKeys("500");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);

        new Select(driver.findElement(By.name("type"))).selectByVisibleText("Междугородние звонки");
        Thread.sleep(1000);

        new Select(driver.findElement(By.name("type"))).selectByVisibleText("Городская связь");
        Thread.sleep(1000);

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
        public void Buxara() throws Exception {


        driver.findElement(By.className("uicon-cat-telephony")).click();
        Thread.sleep(3000);

        driver.findElement(By.linkText("Узбектелеком")).click();
        Thread.sleep(3000);

        new Select(driver.findElement(By.name("regionCode"))).selectByVisibleText("Бухара");
        Thread.sleep(1000);

        driver.findElement(By.name("account")).clear();
        driver.findElement(By.name("account")).sendKeys("5273354");
        Thread.sleep(3000);

        driver.findElement(By.name("amount")).clear();
        driver.findElement(By.name("amount")).sendKeys("500");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);

        new Select(driver.findElement(By.name("type"))).selectByVisibleText("Междугородние звонки");
        Thread.sleep(1000);

        new Select(driver.findElement(By.name("type"))).selectByVisibleText("Городская связь");
        Thread.sleep(1000);

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
        public void Fergana() throws Exception {


        driver.findElement(By.className("uicon-cat-telephony")).click();
        Thread.sleep(3000);

        driver.findElement(By.linkText("Узбектелеком")).click();
        Thread.sleep(3000);

        new Select(driver.findElement(By.name("regionCode"))).selectByVisibleText("Фергана");
        Thread.sleep(1000);

        driver.findElement(By.name("account")).clear();
        driver.findElement(By.name("account")).sendKeys("2269500");
        Thread.sleep(3000);

        driver.findElement(By.name("amount")).clear();
        driver.findElement(By.name("amount")).sendKeys("500");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);

        new Select(driver.findElement(By.name("type"))).selectByVisibleText("Междугородние звонки");
        Thread.sleep(1000);

        new Select(driver.findElement(By.name("type"))).selectByVisibleText("Городская связь");
        Thread.sleep(1000);

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
        public void GorTelTash() throws Exception {


        driver.findElement(By.className("uicon-cat-telephony")).click();
        Thread.sleep(3000);

        driver.findElement(By.linkText("Городской телефон г.Ташкент")).click();
        Thread.sleep(3000);

        new Select(driver.findElement(By.name("typeValue"))).selectByVisibleText("Междугородние звонки");
        Thread.sleep(1000);

        new Select(driver.findElement(By.name("typeValue"))).selectByVisibleText("Городская связь");
        Thread.sleep(1000);


        driver.findElement(By.name("account")).clear();
        driver.findElement(By.name("account")).sendKeys("2185310");
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
