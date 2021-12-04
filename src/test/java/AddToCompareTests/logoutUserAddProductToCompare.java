package AddToCompareTests;

import TestConfigs.BaseTest;
import TestListener.TestRetry;
import com.opencart.navigation.Navigation;
import com.opencart.steps.HomePageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;


public class logoutUserAddProductToCompare extends BaseTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void logoutUserProductAddToCompare() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageBL()
                  .useSearch("")
                  .searchAddToCompare("Apple Cinema 30\"");
    }
}