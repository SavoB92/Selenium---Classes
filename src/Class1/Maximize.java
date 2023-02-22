package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {
    public static void main(String[] args) {
// Mandatory 1st step => Connecting the driver.
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
// Mandatory 2nd step => Making an instance.
        WebDriver driver = new ChromeDriver();
// Mandatory 3rd step => Navigating to a desired URL. 
        driver.get("https://www.google.com");

        driver.manage().window().maximize();
        driver.manage().window().fullscreen();

    }
}
