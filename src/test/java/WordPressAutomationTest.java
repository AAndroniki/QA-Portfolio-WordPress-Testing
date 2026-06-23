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

/**
 * WordPressAutomationTest
 * -----------------------
 * Αυτή η κλάση περιέχει αυτοματοποιημένα τεστ για το WordPress Blog μας.
 * Χρησιμοποιούμε τη μέθοδο "Extract Method" για να αποφύγουμε την επανάληψη κώδικα.
 */
public class WordPressAutomationTest {

    WebDriver driver;
    String baseurl = "http://wordpresstestsite";

    @BeforeEach
    public void setUp() {
        // Αυτοματοποιημένη ρύθμιση του ChromeDriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        
        // Βασικές ρυθμίσεις παραθύρου και αναμονής
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        // Άνοιγμα της σελίδας Login
        driver.get(baseurl + "/wp-login.php");
    }

    @AfterEach
    public void tearDown() {
        // Κλείσιμο του browser μετά από κάθε τεστ
        if (driver != null) {
            driver.quit();
        }
    }

    // --- Εδώ θα προσθέσουμε τη μέθοδο performLogin στο επόμενο βήμα ---
}
