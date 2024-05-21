import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTesting {


    static String browser = "Chrome";
    static String baseUrl = "http://the-internet.herokuapp.com/login";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }

        //Launch the Chrome Broswer
        WebDriver driver = new ChromeDriver();
        //Open the Url
        driver.get(baseUrl);
        //print the title of the page
        System.out.println(driver.getTitle());
        //print current Url
        System.out.println(driver.getCurrentUrl());
        //print page source
        System.out.println(driver.getPageSource());
        //Enter email id to email field
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        //Enter password to password field
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        // Action on login Button
        driver.findElement(By.tagName("button")).click();
        //Refresh the page
        driver.navigate().refresh();
        //Close the browser
        driver.close();


    }
}

