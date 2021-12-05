package TestConfigs;

import com.opencart.driver.DriverRepository;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


    public class baseTest {

        @BeforeSuite
        public void setup() { DriverRepository.downloadWebDriver();}

        @BeforeMethod
        public void createDriver() { DriverRepository.instanceWebBrowser();}

        @AfterMethod
        public void close() {
            DriverRepository.closeBrowser();
        }

        @AfterSuite
        public void closeBrowser() {
            DriverRepository.closeBrowser();
        }
    }
