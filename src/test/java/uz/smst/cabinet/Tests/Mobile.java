package uz.smst.cabinet.Tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import uz.smst.cabinet.Settings.WebDriverSettings;


/**
 * Created by SapayJR on 05.06.2018.
 */

public class Mobile extends WebDriverSettings {

     @Test
        public void perfectum() throws Exception {

        System.out.println("TEST PERFECTUM");



        driver.findElement(By.linkText("Perfectum")).click();

        driver.findElement(By.name("phone")).clear();
        driver.findElement(By.name("phone")).sendKeys("3035935");
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
//        driver.findElement(By.className("ng-tns-c7-3 ng-star-inserted")).click();
//        Thread.sleep(10000);

        System.out.println("Success");



    }

     @Test
        public void Ucell() throws Exception {

            System.out.println("TEST UCELL");

                driver.findElement(By.linkText("Ucell")).click();
                    Thread.sleep(3000);

        new Select(driver.findElement(By.name("prefix"))).selectByVisibleText("94");
             Thread.sleep(2000);


        driver.findElement(By.name("phone")).clear();
            driver.findElement(By.name("phone")).sendKeys("4009051");
                 Thread.sleep(2000);

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
//            driver.findElement(By.className("ng-tns-c7-3 ng-star-inserted")).click();
//            Thread.sleep(10000);

            System.out.println("Success");



        }

     @Test
        public void beeline() throws Exception {


        System.out.println("TEST BEELINE");


        driver.findElement(By.linkText("Beeline")).click();
        Thread.sleep(3000);

            new Select(driver.findElement(By.name("prefix"))).selectByVisibleText("91");
            Thread.sleep(2000);

            new Select(driver.findElement(By.name("prefix"))).selectByVisibleText("90");
            Thread.sleep(2000);

            driver.findElement(By.name("phone")).clear();
            driver.findElement(By.name("phone")).sendKeys("1203445");
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


            System.out.println("Success");

        }

     @Test
        public void UMS() throws Exception {


            System.out.println("TEST BEELINE");


            driver.findElement(By.linkText("UMS")).click();
            Thread.sleep(3000);

            driver.findElement(By.name("phone")).clear();
            driver.findElement(By.name("phone")).sendKeys("3452813");
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


            System.out.println("Success");



        }

     @Test
        public void Uzmobile() throws Exception {


            System.out.println("TEST UZMOBILE");

            driver.findElement(By.linkText("UzMobile")).click();
            Thread.sleep(3000);

            new Select(driver.findElement(By.name("prefix"))).selectByVisibleText("99");
            Thread.sleep(2000);

            new Select(driver.findElement(By.name("prefix"))).selectByVisibleText("95");
            Thread.sleep(2000);


            driver.findElement(By.name("phone")).clear();
            driver.findElement(By.name("phone")).sendKeys("3589965");
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


            System.out.println("Success");


            }


}






