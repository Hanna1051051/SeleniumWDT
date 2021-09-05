import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Diary {
    public static void diary() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.get("https://diary.ru/user/login");
        driver.findElement(By.xpath("//form[@id='login-form']/div/input")).sendKeys("annaReal");
        driver.findElement(By.xpath("//form[@id='login-form']/div[2]/input")).sendKeys("1051051A");
        driver.switchTo().frame(0);
        Thread.sleep(10000);
        driver.findElement(By.cssSelector(".recaptcha-checkbox-border")).click();

        driver.switchTo().defaultContent();
        driver.findElement(By.id("login_btn")).click();
        driver.findElement(By.cssSelector("#writeThisDiary .alt")).click();
        driver.findElement(By.id("postTitle")).click();
        driver.findElement(By.id("postTitle")).sendKeys("My dreams");
        driver.switchTo().frame(1);
        driver.findElement(By.xpath("//body[@id='tinymce']")).click();
        driver.switchTo().defaultContent();
        driver.findElement(By.id("rewrite")).click();
        driver.quit();
    }
}
