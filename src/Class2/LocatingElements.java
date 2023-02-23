package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");
        // Send in the USERNAME.
        driver.findElement(By.id("email")).sendKeys("Moazzam!");
        // Send in the PASSWORD.
        driver.findElement(By.name("pass")).sendKeys("MoazzamsPassword1");
        // Make a click on the button CREATE A NEW ACCOUNT.
        /*driver.findElement(By.linkText("Create new account")).click();*/

        // Click on a FORGOTTEN PASSWORD.
        driver.findElement(By.partialLinkText("password")).click();

        driver.quit();

    }
}
