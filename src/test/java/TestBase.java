import config.WebDriverProvider;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;

public class TestBase {
    private final WebDriver driver = new WebDriverProvider().get();
    @AfterEach
    void driverQuit() {
        if (driver != null) {
            driver.quit();
        }
    }
}
