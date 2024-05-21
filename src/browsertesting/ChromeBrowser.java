package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * BaseUrl = http://the-internet.herokuapp.com/login
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Enter the email to email field.
 * 7. Enter the password to password field.
 * 8. Click on Login Button.
 * 9. Print the current url.
 * 10. Refresh the page.
 * 11. Close the browser.
 */

public class ChromeBrowser {
    static String baseUrl = "http://the-internet.herokuapp.com/login";                //Base Url

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();                                        //Launch chrome browser
        driver.get(baseUrl);                                                          //Open the url into browseer
        driver.manage().window().maximize();                                          //Maximize window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));            //Implict wait
        System.out.println("Title of the page is : " + driver.getTitle());            //Print title
        System.out.println("Current Url is : " + driver.getCurrentUrl());             //Print current Url
        System.out.println("Page source is : " + driver.getPageSource());             //Print page source
        driver.findElement(By.name("username")).sendKeys("tomsmith");      //Write email
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");     //Write password
        driver.findElement(By.className("radius")).click();                           //Click login button
        System.out.println("Current Url is : " + driver.getCurrentUrl());             //Print current Url
        driver.navigate().refresh();                                                  //Refresh
        driver.quit();                                                                //Quit browser
    }
}
