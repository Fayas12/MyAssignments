package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login {

    public static void main(String[] args) {

        // Set path to chromedriver if not in system PATH
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create ChromeOptions and ignore certificate errors
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--allow-insecure-localhost");  // useful for localhost and internal IPs
        options.addArguments("--start-maximized");

        // Launch Chrome with options
        WebDriver driver = new ChromeDriver(options);

        // Navigate to the site
        driver.get(" https://www.facebook.com/");

        // OPTIONAL: Try to bypass the "Your connection is not private" screen
        try {
            // Wait for interstitial (tweak as needed)
            Thread.sleep(2000);

            // Click "Advanced" button
            WebElement advancedButton = driver.findElement(By.id("details-button"));
            advancedButton.click();
            Thread.sleep(1000);

            // Click "Proceed to site" link
            WebElement proceedLink = driver.findElement(By.id("proceed-link"));
            proceedLink.click();
        } catch (Exception e) {
            System.out.println("Bypass screen not shown or already skipped: " + e.getMessage());
        }
        driver.findElement(By.id("email")).sendKeys("fayas");
		driver.findElement(By.name("pass")).sendKeys("password");
		driver.findElement(By.name("login")).click();
		System.out.println(driver.getTitle());
		driver.close();
    }
}
