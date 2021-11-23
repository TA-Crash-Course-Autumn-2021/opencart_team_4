import com.opencart.driver.DriverRepository;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    @BeforeSuite
    public void setup() { DriverRepository.downloadWebDriver();}

    @BeforeClass
    public void createDriver() { DriverRepository.instanceWebBrowser();}

    @AfterSuite
    public void closeBrowser() {
      DriverRepository.closeBrowser();
    }
}
