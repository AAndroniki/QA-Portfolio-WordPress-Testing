import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHelloWorld {
    WebDriver driver;


    @BeforeEach
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void openGooglePage(){
        driver.get("https://www.google.com");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        Assertions.assertEquals("Google",pageTitle);
    }

    @Test
    public void openInGRPage(){
        driver.get("https://www.in.gr");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        Assertions.assertEquals("in.gr | Όλες οι ειδήσεις - Ολοκληρωμένη κάλυψη ειδήσεων",pageTitle);
    }
}