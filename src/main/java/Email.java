import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;

public class Email {
    public static void email() {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://crm.geekbrains.space/user/login");

        driver.findElement(By.xpath("//input[@id='prependedInput']")).click();
        driver.findElement(By.xpath("//input[@id='prependedInput']")).sendKeys("1051051@MAIL.RU");
        assertEquals(driver.findElement(By.cssSelector(".title")).getText(), "Логин");

        {      String value = driver.findElement(By.xpath("//input[@id='prependedInput']")).getAttribute("value");
            assertEquals(value, "1051051@MAIL.RU");
        }
        driver.quit();
    }
}
