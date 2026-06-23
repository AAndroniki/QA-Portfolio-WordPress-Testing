import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


//τα πηρα από δώ: https://www.selenium.dev/documentation/
//https://bonigarcia.dev/webdrivermanager/

public class WordPressChromeTest {
    WebDriver driver;
    String baseurl = "http://wordpresstestsite";


    // Η μέθοδός μας που δέχεται δύο "πακέτα" πληροφοριών (username, password)
    public void performLogin(String username, String password, String expectedTitle) {

        driver.findElement(By.id("user_login")).sendKeys(username);    // 1. Βρες το πεδίο του ονόματος και γράψε το username
        driver.findElement(By.id("user_pass")).sendKeys(password);    // 2. Βρες το πεδίο του κωδικού και γράψε το password
        driver.findElement(By.id("wp-submit")).click(); // 3. Βρες το κουμπί Login και πάτα το

        String actualTitle = driver.getTitle();
        Assertions.assertEquals(expectedTitle, actualTitle);
        System.out.println("Login and Title Verification passed for user: " + username);
    }


    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        //Πηγαίνει στο ίντερνετ, βλέπει τι έκδοση Chrome εχω και κατεβάζει το σωστό αρχείο chromedriver για να μπορέσει η Java να του δώσει εντολές.
        //Χωρίς αυτό: Θα έπρεπε να το κατεβάζω κάθε φορά που κάνει update ο Chrome.

        driver = new ChromeDriver();
        //ανοίγει ο browser
        driver.manage().window().maximize();
        //Μεγιστοποιεί το παράθυρο
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }


    @Test
    public void adminLogInTest() {
        driver.get(baseurl + "/wp-login.php");
        performLogin("Admin", "1234", "Dashboard ‹ WordPress Test Site — WordPress");
//        String pageTitle = driver.getTitle();
//        Assertions.assertEquals("Dashboard ‹ WordPress Test Site — WordPress", pageTitle);
    }

    @Test
    public void invalidAdminLoginTest() { // 1. Αλλαγή ονόματος
        driver.get(baseurl + "/wp-login.php");
        performLogin("Admin", "wrong_password", "Log In ‹ WordPress Test Site — WordPress"); // 2. Λάθος κωδικός
    }

    @Test
    public void authorLogInTest() {
        driver.get(baseurl + "/wp-login.php");
        performLogin("And_auth", "1234", "Dashboard ‹ WordPress Test Site — WordPress");
    }

    @Test
    public void invalidauthorLoginTest() { // 1. Αλλαγή ονόματος
        driver.get(baseurl + "/wp-login.php");
        performLogin("And_auth", "wrong_password", "Log In ‹ WordPress Test Site — WordPress");
    }

    @Test
    public void subscriberLogInTest() {
        driver.get(baseurl + "/wp-login.php");
        performLogin("Androniki_Subscriber", "1234", "Profile ‹ WordPress Test Site — WordPress");
    }

    @Test
    public void invalidsubscriberLoginTest() {
        driver.get(baseurl + "/wp-login.php");
        performLogin("Androniki_Subscriber", "wrong_password", "Log In ‹ WordPress Test Site — WordPress");
    }


}