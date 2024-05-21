import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTesting {

    public static void main(String[] args) {

        //Base url Declartion
        String baseUrl = "http://the-internet.herokuapp.com/login";
        //setup Chrome browser
        WebDriver driver = new ChromeDriver();
        //open the Url
        driver.get(baseUrl);
        //print the title of the page
        System.out.println(driver.getTitle());
        // print the current Url
        System.out.println(driver.getCurrentUrl());
        //print the page source
        System.out.println(driver.getPageSource());
        //Enter the email to email field
        //current url
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        //enter password to password field
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        //Action on login button
        driver.findElement(By.tagName("button")).click();
        // Refresh the page
        driver.navigate().refresh();
        //close the browser
        driver.close();


    }
}
