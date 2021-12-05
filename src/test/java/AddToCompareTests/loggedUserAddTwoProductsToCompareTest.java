package AddToCompareTests;


import TestConfigs.loggedUserTest;
import com.opencart.steps.MainPageBL;
import com.opencart.testListener.TestRetry;
import org.testng.annotations.Test;

public class loggedUserAddTwoProductsToCompareTest extends loggedUserTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void loginUserTwoProductAddToCompare() {
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageBL()
                .useSearch("")
                .searchAddToCompare("Apple Cinema 30\"")
                .searchAddToCompare("MacBook");
    }
}
