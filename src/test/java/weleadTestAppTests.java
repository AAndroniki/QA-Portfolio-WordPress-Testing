import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;



public class weleadTestAppTests {

WebDriver driver;
String baseurl = "http://wordpresstestsite";


    @BeforeEach
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get(baseurl+"/wp-login.php");

    }
    @AfterEach
    public void close() {
        driver.quit();
    }

        @Test
        public void AdminTest () {

            String username ="Admin";
            String password ="1234";


            WebElement userNameField = driver.findElement(By.id("user_login"));
            userNameField.sendKeys(username);

            WebElement passwordField = driver.findElement(By.id("user_pass"));
            passwordField.sendKeys(password);

            WebElement loginButton = driver.findElement(By.id("wp-submit"));
            loginButton.click();
            String pageTitle =driver.getTitle();
            Assertions.assertEquals("Dashboard ‹ WordPress Test Site — WordPress",pageTitle);


         }
    @Test
    public void testUserSub9 () {

        String username = "testUserSub9";
        String password = "1234";

        WebElement userNameField = driver.findElement(By.id("user_login"));
        userNameField.sendKeys(username);

        WebElement passwordField = driver.findElement(By.id("user_pass"));
        passwordField.sendKeys(password);

        WebElement loginButton = driver.findElement(By.id("wp-submit"));
        loginButton.click();
        String pageTitle = driver.getTitle();
        Assertions.assertEquals("Profile ‹ WordPress Test Site — WordPress", pageTitle);

    }

    }

