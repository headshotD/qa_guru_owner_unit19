import config.WebDriverProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class TestBase {
    protected WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = new WebDriverProvider().get();
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
