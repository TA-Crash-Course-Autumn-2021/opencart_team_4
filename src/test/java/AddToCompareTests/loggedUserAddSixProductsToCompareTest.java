package AddToCompareTests;
import TestConfigs.BaseTest;
import TestConfigs.LoggedUserTest;
import TestListener.TestRetry;
import com.opencart.steps.MainPageBL;
import org.testng.annotations.Test;


public class loggedUserAddSixProductsToCompareTest extends LoggedUserTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void loginUserSixProductsAddToCompare() {
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageBL().useSearch("")
                .searchAddToCompare("Samsung SyncMaster 941BW")
                .searchAddToCompare("Nikon D300")
                .searchAddToCompare("Apple Cinema 30\"")
                .searchAddToCompare("Canon EOS 5D")
                .searchAddToCompare("MacBook")
                .searchAddToCompare("macbook air");
    }
}
