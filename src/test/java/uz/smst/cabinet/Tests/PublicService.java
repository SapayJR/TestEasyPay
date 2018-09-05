package uz.smst.cabinet.Tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import sun.invoke.util.VerifyType;
import uz.smst.cabinet.Settings.WebDriverSettings;
import org.openqa.selenium.WebElement;





public class PublicService extends WebDriverSettings {


        @Test
            public void ElectroEnergo() throws Exception {

            driver.findElement(By.className("uicon-cat-communal")).click();
            Thread.sleep(2000);

            driver.findElement(By.linkText("Электроэнергия")).click();
            Thread.sleep(3000);


            new Select(driver.findElement(By.name("regionCode"))).selectByVisibleText("г. Ташкент");
            Thread.sleep(2000);

            new Select(driver.findElement(By.name("subRegionCode"))).selectByVisibleText("Юнусабадское ЭСП");
            Thread.sleep(2000);

            driver.findElement(By.name("account")).clear();
            driver.findElement(By.name("account")).sendKeys("0670323");
            Thread.sleep(2000);

            driver.findElement(By.name("amount")).clear();
            driver.findElement(By.name("amount")).sendKeys("500");
            Thread.sleep(2000);

            driver.findElement(By.xpath("//button[@type='submit']")).click();
            Thread.sleep(5000);

            Assert.assertTrue(isElementPresent(By.xpath("//div[@class='pay-logo']//img[@class='ng-tns-c7-3']")));

            Assert.assertEquals("Оплата за услугу Электроэнергия",
                    driver.findElement(By.xpath("//h3[contains(text(),'Оплата за услугу Электроэнергия')]")).getText());

            new Select(driver.findElement(By.name("type"))).selectByVisibleText("Нет");
            Thread.sleep(2000);

            driver.findElement(By.name("counterFrom")).click();
            driver.findElement(By.name("counterFrom")).sendKeys("01012018");
            Thread.sleep(3000);

            driver.findElement(By.name("counterTo")).click();
            driver.findElement(By.name("counterTo")).sendKeys("01052018");
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
            Thread.sleep(5000);

            Assert.assertEquals("Убедительная просьба проверить все данные, если данные верны то введите код и нажмите продолжить.",
                    driver.findElement(By.xpath("//div[@class='alert alert-info']")).getText());

            Thread.sleep(5000);
        }

        @Test
            public void SuvSoz() throws Exception {

            driver.findElement(By.className("uicon-cat-communal")).click();
            Thread.sleep(3000);


            driver.findElement(By.linkText("Холодная вода и канализация")).click();
            Thread.sleep(3000);

            new Select(driver.findElement(By.name("regionCode"))).selectByVisibleText("г.Ташкент");
            Thread.sleep(2000);

            new Select(driver.findElement(By.name("subRegionCode"))).selectByVisibleText("Мирободский район");
            Thread.sleep(1000);

            new Select(driver.findElement(By.name("subRegionCode"))).selectByVisibleText("М. Улугбекский район");
            Thread.sleep(1000);

            new Select(driver.findElement(By.name("subRegionCode"))).selectByVisibleText("Яккасарайский район");
            Thread.sleep(1000);

            new Select(driver.findElement(By.name("subRegionCode"))).selectByVisibleText("Алмазарский район");
            Thread.sleep(1000);

            new Select(driver.findElement(By.name("subRegionCode"))).selectByVisibleText("Чилонзарский район");
            Thread.sleep(1000);

            new Select(driver.findElement(By.name("subRegionCode"))).selectByVisibleText("Учтепинский район");
            Thread.sleep(1000);

            new Select(driver.findElement(By.name("subRegionCode"))).selectByVisibleText("Сергелийский район");
            Thread.sleep(1000);

            new Select(driver.findElement(By.name("subRegionCode"))).selectByVisibleText("Яшнабадский район");
            Thread.sleep(1000);

            new Select(driver.findElement(By.name("subRegionCode"))).selectByVisibleText("Шайхантаурский район");
            Thread.sleep(1000);

            new Select(driver.findElement(By.name("subRegionCode"))).selectByVisibleText("Бектемирский район");
            Thread.sleep(1000);

            new Select(driver.findElement(By.name("subRegionCode"))).selectByVisibleText("Мирободский район");
            Thread.sleep(1000);

            driver.findElement(By.name("account")).clear();
            driver.findElement(By.name("account")).sendKeys("401885");
            Thread.sleep(3000);

            driver.findElement(By.name("amount")).clear();
            driver.findElement(By.name("amount")).sendKeys("500");
            Thread.sleep(3000);

            driver.findElement(By.xpath("//button[@type='submit']")).click();
            Thread.sleep(5000);

            Assert.assertTrue(isElementPresent(By.xpath("//div[@class='pay-logo']//img[@class='ng-tns-c7-3']")));
            Assert.assertEquals("Оплата за услугу Холодная вода и канализация",
                    driver.findElement(By.xpath("//h3[contains(text(),'Оплата за услугу Холодная вода и канализация')]")).getText());
            Assert.assertEquals("Сумма оплаты", driver.findElement(By.xpath("//h2[contains(text(),'Сумма оплаты')]")).getText());


            new Select(driver.findElement(By.name("type"))).selectByVisibleText("Нет");
            Thread.sleep(2000);

            driver.findElement(By.name("counterFrom")).click();
            driver.findElement(By.name("counterFrom")).sendKeys("01012018");
            Thread.sleep(3000);

            driver.findElement(By.name("counterTo")).click();
            driver.findElement(By.name("counterTo")).sendKeys("01052018");
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
            Thread.sleep(5000);

            Assert.assertEquals("Убедительная просьба проверить все данные, если данные верны то введите код и нажмите продолжить.",
                    driver.findElement(By.xpath("//div[@class='alert alert-info']")).getText());

            Thread.sleep(5000);

        }

        @Test
            public void TeploEnergo() throws Exception {

            driver.findElement(By.className("uicon-cat-communal")).click();
            Thread.sleep(3000);


            driver.findElement(By.linkText("Горячая вода и отопление")).click();
            Thread.sleep(3000);

            new Select(driver.findElement(By.name("regionCode"))).selectByVisibleText("г.Ташкент");
            Thread.sleep(3000);

            new Select(driver.findElement(By.name("subRegionCode"))).selectByVisibleText("Мирободский район");
            Thread.sleep(1000);

            new Select(driver.findElement(By.name("subRegionCode"))).selectByVisibleText("М. Улугбекский район");
            Thread.sleep(1000);

            new Select(driver.findElement(By.name("subRegionCode"))).selectByVisibleText("Яккасарайский район");
            Thread.sleep(1000);

            new Select(driver.findElement(By.name("subRegionCode"))).selectByVisibleText("Алмазарский район");
            Thread.sleep(1000);

            new Select(driver.findElement(By.name("subRegionCode"))).selectByVisibleText("Чилонзарский район");
            Thread.sleep(1000);

            new Select(driver.findElement(By.name("subRegionCode"))).selectByVisibleText("Учтепинский район");
            Thread.sleep(1000);

            new Select(driver.findElement(By.name("subRegionCode"))).selectByVisibleText("Сергелийский район");
            Thread.sleep(1000);

            new Select(driver.findElement(By.name("subRegionCode"))).selectByVisibleText("Яшнабадский район");
            Thread.sleep(1000);

            new Select(driver.findElement(By.name("subRegionCode"))).selectByVisibleText("Шайхантаурский район");
            Thread.sleep(1000);

            new Select(driver.findElement(By.name("subRegionCode"))).selectByVisibleText("Бектемирский район");
            Thread.sleep(1000);

            new Select(driver.findElement(By.name("subRegionCode"))).selectByVisibleText("Мирободский район");
            Thread.sleep(1000);


            driver.findElement(By.name("account")).clear();
            driver.findElement(By.name("account")).sendKeys("04000081290");
            Thread.sleep(2000);

            driver.findElement(By.name("amount")).clear();
            driver.findElement(By.name("amount")).sendKeys("500");
            Thread.sleep(2000);

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

        @Test
            public  void Gaz() throws Exception {

            driver.findElement(By.className("uicon-cat-communal")).click();
            Thread.sleep(3000);

            driver.findElement(By.linkText("Газ")).click();
            Thread.sleep(3000);

            new Select(driver.findElement(By.name("regionCode"))).selectByVisibleText("г. Ташкент");
            Thread.sleep(3000);

            new Select(driver.findElement(By.name("subRegionCode"))).selectByVisibleText("Юнусабадский район");
            Thread.sleep(3000);

            driver.findElement(By.name("account")).clear();
            driver.findElement(By.name("account")).sendKeys("07315130");
            Thread.sleep(3000);

            driver.findElement(By.name("amount")).clear();
            driver.findElement(By.name("amount")).sendKeys("500");
            Thread.sleep(2000);

            driver.findElement(By.xpath("//button[@type='submit']")).click();
            Thread.sleep(5000);


            Assert.assertEquals("Наименование Услуги:", driver.findElement(By.xpath("//td[contains(text(),'Наименованиие Услуги:')]")).getText());

            new Select(driver.findElement(By.name("type"))).selectByVisibleText("Нет");
            Thread.sleep(3000);

            driver.findElement(By.name("counterFrom")).click();
            driver.findElement(By.name("counterFrom")).sendKeys("01012018");
            Thread.sleep(3000);

            driver.findElement(By.name("counterTo")).click();
            driver.findElement(By.name("counterTo")).sendKeys("01052018");
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
            public void MahsusTrans() throws Exception {

            driver.findElement(By.className("uicon-cat-communal")).click();
            Thread.sleep(3000);

            driver.findElement(By.linkText("Вывоз мусора")).click();
            Thread.sleep(2000);


            new Select(driver.findElement(By.name("regionCode"))).selectByVisibleText("Ташкент");
            Thread.sleep(2000);

            new Select(driver.findElement(By.name("subRegionCode"))).selectByVisibleText("Бектемирский район");
            Thread.sleep(2000);

            driver.findElement(By.name("account")).clear();
            driver.findElement(By.name("account")).sendKeys("101021418");
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
            public void Hamza() throws Exception {

            driver.findElement(By.className("uicon-cat-communal")).click();
            Thread.sleep(3000);

            driver.findElement(By.linkText("Хамза харакат")).click();
            Thread.sleep(3000);

            driver.findElement(By.name("account")).clear();
            driver.findElement(By.name("account")).sendKeys("47008008");
            Thread.sleep(3000);

            driver.findElement(By.name("amount")).clear();
            driver.findElement(By.name("amount")).sendKeys("500");

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
            public void MJKO() throws Exception {

            driver.findElement(By.className("uicon-cat-communal")).click();
            Thread.sleep(3000);


            driver.findElement(By.linkText("МЖКО Холодная вода и канализация")).click();
            Thread.sleep(2000);


            driver.findElement(By.name("account")).clear();
            driver.findElement(By.name("account")).sendKeys("0102080150");
            Thread.sleep(2000);

            driver.findElement(By.name("amount")).clear();
            driver.findElement(By.name("amount")).sendKeys("500");

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
