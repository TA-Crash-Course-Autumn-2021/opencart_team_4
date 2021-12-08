package addToCompareTests;


import testConfigs.LoggedUserTest;
import com.opencart.steps.MainPageBL;
import com.opencart.testListener.TestRetry;
import org.testng.annotations.Test;

public class LoggedUserAddTwoProductsToCompareTest extends LoggedUserTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void loginUserTwoProductAddToCompare() {
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageBL()
                .useSearch("")
                .searchAddToCompare("Apple Cinema 30\"")
                .searchAddToCompare("MacBook");
    }
}
