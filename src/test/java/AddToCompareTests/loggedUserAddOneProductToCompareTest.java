package AddToCompareTests;


import TestConfigs.LoggedUserTest;
import TestListener.TestRetry;
import com.opencart.steps.MainPageBL;
import org.testng.annotations.Test;

public class loggedUserAddOneProductToCompareTest extends LoggedUserTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void loginUserOneProductAddToCompare() {
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageBL()
                .useSearch("")
                .searchAddToCompare("Apple Cinema 30\"");
    }
}
