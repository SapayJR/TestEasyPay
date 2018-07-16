package uz.smst.cabinet.Tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import uz.smst.cabinet.Settings.WebDriverSettings;

public class Insurance extends WebDriverSettings {



    @Test
    public void AlfaInvest() throws Exception {

        driver.findElement(By.className("uicon-cat-insurance")).click();
        Thread.sleep(3000);

        driver.findElement(By.linkText("Alfa Invest")).click();
        Thread.sleep(3000);

        driver.findElement(By.name("account")).clear();
        driver.findElement(By.name("account")).sendKeys("01f977ha");
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
    public void UzbekInvest() throws Exception {

        driver.findElement(By.className("uicon-cat-insurance")).click();
        Thread.sleep(3000);

        driver.findElement(By.linkText("Uzbekinvest")).click();
        Thread.sleep(3000);

        new Select(driver.findElement(By.name("prefix"))).selectByVisibleText("90");
        Thread.sleep(1000);

        new Select(driver.findElement(By.name("prefix"))).selectByVisibleText("93");
        Thread.sleep(1000);

        new Select(driver.findElement(By.name("prefix"))).selectByVisibleText("94");
        Thread.sleep(1000);

        new Select(driver.findElement(By.name("prefix"))).selectByVisibleText("95");
        Thread.sleep(1000);

        new Select(driver.findElement(By.name("prefix"))).selectByVisibleText("97");
        Thread.sleep(1000);

        new Select(driver.findElement(By.name("prefix"))).selectByVisibleText("98");
        Thread.sleep(1000);

        new Select(driver.findElement(By.name("prefix"))).selectByVisibleText("99");
        Thread.sleep(1000);

        new Select(driver.findElement(By.name("prefix"))).selectByVisibleText("90");
        Thread.sleep(1000);

        driver.findElement(By.name("account")).clear();
        driver.findElement(By.name("account")).sendKeys("7377447");
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
    public void Kafolat() throws Exception {

        driver.findElement(By.className("uicon-cat-insurance")).click();
        Thread.sleep(3000);

        driver.findElement(By.linkText("Kafolat")).click();
        Thread.sleep(3000);

        new Select(driver.findElement(By.name("prefix"))).selectByVisibleText("90");
        Thread.sleep(1000);

        new Select(driver.findElement(By.name("prefix"))).selectByVisibleText("93");
        Thread.sleep(1000);

        new Select(driver.findElement(By.name("prefix"))).selectByVisibleText("94");
        Thread.sleep(1000);

        new Select(driver.findElement(By.name("prefix"))).selectByVisibleText("95");
        Thread.sleep(1000);

        new Select(driver.findElement(By.name("prefix"))).selectByVisibleText("97");
        Thread.sleep(1000);

        new Select(driver.findElement(By.name("prefix"))).selectByVisibleText("98");
        Thread.sleep(1000);

        new Select(driver.findElement(By.name("prefix"))).selectByVisibleText("99");
        Thread.sleep(1000);

        new Select(driver.findElement(By.name("prefix"))).selectByVisibleText("90");
        Thread.sleep(1000);

        driver.findElement(By.name("account")).clear();
        driver.findElement(By.name("account")).sendKeys("3568704");
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
    public void Gross() throws Exception {

        driver.findElement(By.className("uicon-cat-insurance")).click();
        Thread.sleep(3000);

        driver.findElement(By.linkText("Gross Insurance")).click();
        Thread.sleep(3000);

        new Select(driver.findElement(By.name("prefix"))).selectByVisibleText("90");
        Thread.sleep(1000);

        new Select(driver.findElement(By.name("prefix"))).selectByVisibleText("93");
        Thread.sleep(1000);

        new Select(driver.findElement(By.name("prefix"))).selectByVisibleText("94");
        Thread.sleep(1000);

        new Select(driver.findElement(By.name("prefix"))).selectByVisibleText("95");
        Thread.sleep(1000);

        new Select(driver.findElement(By.name("prefix"))).selectByVisibleText("97");
        Thread.sleep(1000);

        new Select(driver.findElement(By.name("prefix"))).selectByVisibleText("98");
        Thread.sleep(1000);

        new Select(driver.findElement(By.name("prefix"))).selectByVisibleText("99");
        Thread.sleep(1000);

        new Select(driver.findElement(By.name("prefix"))).selectByVisibleText("90");
        Thread.sleep(1000);

        driver.findElement(By.name("account")).clear();
        driver.findElement(By.name("account")).sendKeys("9771809");
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

}
