package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Navigate {
    public static void main(String[] args) throws InterruptedException {
// Connect to WebDriver.
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
// Initiate the instance of WebDriver.
        WebDriver driver = new ChromeDriver();
// Open Google.com
        driver.get("https://google.com");
        Thread.sleep(2000);
// Now navigate to Facebook.com
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(2000);
// Going back to the previous web page.
        driver.navigate().back();
        Thread.sleep(2000);
// Going forward to the next web page.
        driver.navigate().forward();
        Thread.sleep(2000);
// Refreshing the page.
        driver.navigate().refresh();
// Close the browser.
        driver.close();

    }
}
