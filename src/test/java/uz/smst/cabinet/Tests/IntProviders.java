package uz.smst.cabinet.Tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import uz.smst.cabinet.Settings.WebDriverSettings;




public class IntProviders extends WebDriverSettings {

        @Test
            public void Sarkor() throws Exception{


        Thread.sleep(5000);
        driver.findElement(By.className("uicon-cat-internet-providers")).click();


        driver.findElement(By.linkText("Sarkor Telecom")).click();
        Thread.sleep(2000);


        driver.findElement(By.name("account")).clear();
        driver.findElement(By.name("account")).sendKeys("he-2623315");
        Thread.sleep(3000);

        driver.findElement(By.name("amount")).clear();
        driver.findElement(By.name("amount")).sendKeys("500");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);

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
             public void Sharq() throws Exception{

            driver.findElement(By.className("uicon-cat-internet-providers")).click();


            driver.findElement(By.linkText("Sharq Telekom")).click();
            Thread.sleep(2000);

            driver.findElement(By.name("account")).clear();
            driver.findElement(By.name("account")).sendKeys("shsts2435956");
            Thread.sleep(3000);

            driver.findElement(By.name("amount")).clear();
            driver.findElement(By.name("amount")).sendKeys("500");

            driver.findElement(By.xpath("//button[@type='submit']")).click();
            Thread.sleep(3000);

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
             public void Uzscinet() throws Exception {


            driver.findElement(By.className("uicon-cat-internet-providers")).click();
            Thread.sleep(3000);

            driver.findElement(By.linkText("UzScinet")).click();
            Thread.sleep(3000);

            driver.findElement(By.name("account")).click();
            driver.findElement(By.name("account")).sendKeys("1010-2-18");
            Thread.sleep(3000);

            driver.findElement(By.name("amount")).click();
            driver.findElement(By.name("amount")).sendKeys("500");
            Thread.sleep(3000);

            driver.findElement(By.xpath("//button[@type='submit']")).click();
            Thread.sleep(3000);

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
             public void SkyLine() throws Exception {



            driver.findElement(By.className("uicon-cat-internet-providers")).click();
            Thread.sleep(3000);


            driver.findElement(By.linkText("SkyLine")).click();
            Thread.sleep(3000);

            driver.findElement(By.name("account")).click();
            driver.findElement(By.name("account")).sendKeys("halikov");
            Thread.sleep(3000);

            driver.findElement(By.name("amount")).click();
            driver.findElement(By.name("amount")).sendKeys("500");
            Thread.sleep(3000);

            driver.findElement(By.xpath("//button[@type='submit']")).click();
            Thread.sleep(3000);

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
             public void TPS() throws Exception {



            driver.findElement(By.className("uicon-cat-internet-providers")).click();
            Thread.sleep(3000);


            driver.findElement(By.linkText("TPS")).click();
            Thread.sleep(3000);

            driver.findElement(By.name("account")).click();
            driver.findElement(By.name("account")).sendKeys("tps046516196");
            Thread.sleep(3000);

            driver.findElement(By.name("amount")).click();
            driver.findElement(By.name("amount")).sendKeys("500");
            Thread.sleep(3000);

            driver.findElement(By.xpath("//button[@type='submit']")).click();
            Thread.sleep(3000);

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
             public void  Uzonline() throws Exception {



            driver.findElement(By.className("uicon-cat-internet-providers")).click();
            Thread.sleep(3000);


            driver.findElement(By.linkText("UzOnline")).click();
            Thread.sleep(3000);

            driver.findElement(By.name("account")).click();
            driver.findElement(By.name("account")).sendKeys("1273364");
            Thread.sleep(3000);

            driver.findElement(By.name("amount")).click();
            driver.findElement(By.name("amount")).sendKeys("500");
            Thread.sleep(3000);

            driver.findElement(By.xpath("//button[@type='submit']")).click();
            Thread.sleep(3000);

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
             public void  EVO() throws Exception {



        driver.findElement(By.className("uicon-cat-internet-providers")).click();
        Thread.sleep(3000);


        driver.findElement(By.linkText("EVO")).click();
        Thread.sleep(3000);

        driver.findElement(By.name("account")).click();
        driver.findElement(By.name("account")).sendKeys("41095");
        Thread.sleep(3000);

        driver.findElement(By.name("amount")).click();
        driver.findElement(By.name("amount")).sendKeys("500");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);

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
             public void  Comnet() throws Exception {



        driver.findElement(By.className("uicon-cat-internet-providers")).click();
        Thread.sleep(3000);


        driver.findElement(By.linkText("Comnet")).click();
        Thread.sleep(3000);

        driver.findElement(By.name("account")).click();
        driver.findElement(By.name("account")).sendKeys("2626735");
        Thread.sleep(3000);

        driver.findElement(By.name("amount")).click();
        driver.findElement(By.name("amount")).sendKeys("500");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);

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
             public void  FiberNet() throws Exception {



        driver.findElement(By.className("uicon-cat-internet-providers")).click();
        Thread.sleep(3000);


        driver.findElement(By.linkText("FiberNet")).click();
        Thread.sleep(3000);

        driver.findElement(By.name("account")).click();
        driver.findElement(By.name("account")).sendKeys("3046");
        Thread.sleep(3000);

        driver.findElement(By.name("amount")).click();
        driver.findElement(By.name("amount")).sendKeys("500");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);

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
             public void  Sonet() throws Exception {



        driver.findElement(By.className("uicon-cat-internet-providers")).click();
        Thread.sleep(3000);


        driver.findElement(By.linkText("Sonet")).click();
        Thread.sleep(3000);

        driver.findElement(By.name("account")).click();
        driver.findElement(By.name("account")).sendKeys("102270");
        Thread.sleep(3000);

        driver.findElement(By.name("amount")).click();
        driver.findElement(By.name("amount")).sendKeys("500");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);

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
             public void  NanoTel() throws Exception {



        driver.findElement(By.className("uicon-cat-internet-providers")).click();
        Thread.sleep(3000);


        driver.findElement(By.linkText("Nano Telecom")).click();
        Thread.sleep(3000);

        driver.findElement(By.name("account")).click();
        driver.findElement(By.name("account")).sendKeys("I/H-647");
        Thread.sleep(3000);

        driver.findElement(By.name("amount")).click();
        driver.findElement(By.name("amount")).sendKeys("500");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);

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
             public void  CronTel() throws Exception {



        driver.findElement(By.className("uicon-cat-internet-providers")).click();
        Thread.sleep(3000);


        driver.findElement(By.linkText("Cron Telecom")).click();
        Thread.sleep(3000);

        driver.findElement(By.name("account")).click();
        driver.findElement(By.name("account")).sendKeys("2228");
        Thread.sleep(3000);

        driver.findElement(By.name("amount")).click();
        driver.findElement(By.name("amount")).sendKeys("500");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);

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
             public void  Freelink() throws Exception {



        driver.findElement(By.className("uicon-cat-internet-providers")).click();
        Thread.sleep(3000);


        driver.findElement(By.linkText("FreeLink")).click();
        Thread.sleep(3000);

        driver.findElement(By.name("account")).click();
        driver.findElement(By.name("account")).sendKeys("fl-up-p-11");
        Thread.sleep(3000);

        driver.findElement(By.name("amount")).click();
        driver.findElement(By.name("amount")).sendKeys("500");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);

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
             public void  EasStarkTV() throws Exception {



        driver.findElement(By.className("uicon-cat-internet-providers")).click();
        Thread.sleep(3000);


        driver.findElement(By.linkText("East Stark TV")).click();
        Thread.sleep(3000);

        driver.findElement(By.name("account")).click();
        driver.findElement(By.name("account")).sendKeys("s4101285");
        Thread.sleep(3000);

        driver.findElement(By.name("amount")).click();
        driver.findElement(By.name("amount")).sendKeys("500");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);

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
             public void  SpectrIT() throws Exception {



        driver.findElement(By.className("uicon-cat-internet-providers")).click();
        Thread.sleep(3000);


        driver.findElement(By.linkText("Spectr-IT Интернет")).click();
        Thread.sleep(3000);

        driver.findElement(By.name("account")).click();
        driver.findElement(By.name("account")).sendKeys("sp998909350697");
        Thread.sleep(3000);

        driver.findElement(By.name("amount")).click();
        driver.findElement(By.name("amount")).sendKeys("500");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);

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
             public void  ISTV() throws Exception {



        driver.findElement(By.className("uicon-cat-internet-providers")).click();
        Thread.sleep(3000);


        driver.findElement(By.linkText("ISTV Интернет")).click();
        Thread.sleep(3000);

        driver.findElement(By.name("account")).click();
        driver.findElement(By.name("account")).sendKeys("fer21526");
        Thread.sleep(3000);

        driver.findElement(By.name("amount")).click();
        driver.findElement(By.name("amount")).sendKeys("500");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);

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
             public void  Simus()  throws Exception  {


        driver.findElement(By.className("uicon-cat-internet-providers")).click();
        Thread.sleep(3000);



        driver.findElement(By.linkText("Simus")).click();
        Thread.sleep(3000);



        new Select(driver.findElement(By.name("regionCode"))).selectByVisibleText("Андижан");
        Thread.sleep(2000);


        new Select(driver.findElement(By.name("regionCode"))).selectByVisibleText("Бухара");
        Thread.sleep(2000);

        new Select(driver.findElement(By.name("regionCode"))).selectByVisibleText("Наманган");
        Thread.sleep(2000);

        new Select(driver.findElement(By.name("regionCode"))).selectByVisibleText("Самарканд");
        Thread.sleep(2000);

        new Select(driver.findElement(By.name("regionCode"))).selectByVisibleText("Фергана");
        Thread.sleep(2000);

        new Select(driver.findElement(By.name("regionCode"))).selectByVisibleText("Андижан");
        Thread.sleep(2000);


        new Select(driver.findElement(By.name("regionCode"))).selectByVisibleText("Андижан");
        Thread.sleep(2000);

        new Select(driver.findElement(By.name("subRegionCode"))).selectByVisibleText("wifian");
        Thread.sleep(2000);

        new Select(driver.findElement(By.name("subRegionCode"))).selectByVisibleText("siman");
        Thread.sleep(2000);

        driver.findElement(By.name("account")).clear();
        driver.findElement(By.name("account")).sendKeys("2354482");
        Thread.sleep(3000);

        driver.findElement(By.name("amount")).clear();
        driver.findElement(By.name("amount")).sendKeys("500");


        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);

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
             public void  Buzton() throws Exception {



        driver.findElement(By.className("uicon-cat-internet-providers")).click();
        Thread.sleep(3000);


        driver.findElement(By.linkText("Buzton Internet")).click();
        Thread.sleep(3000);

        driver.findElement(By.name("account")).click();
        driver.findElement(By.name("account")).sendKeys("8000104838");
        Thread.sleep(3000);

        driver.findElement(By.name("amount")).click();
        driver.findElement(By.name("amount")).sendKeys("500");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);

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
