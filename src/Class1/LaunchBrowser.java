package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchBrowser {
        public static void main(String[] args) throws InterruptedException {
            // Tell your project where the webdriver is located.
            System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

            // Create an instance of WebDriver (object).
            WebDriver driver = new ChromeDriver();

            // Open the website google.com
            driver.get("https://www.facebook.com/");

            // Get the current URL that is there in the browser.
            String URL = driver.getCurrentUrl();

            // Print out the URL.
            System.out.println(URL);

            // Get the title of the page.
            String title = driver.getTitle();
            // Print out the title of the page.
            System.out.println("The title of the page is "+title);

            Thread.sleep(3000);

            // Close the browser.
            driver.close(); // or driver.quit(); could work as well.

        }
}
