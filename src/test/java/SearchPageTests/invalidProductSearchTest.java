package SearchPageTests;

import TestConfigs.baseTest;
import com.opencart.navigation.Navigation;
import com.opencart.steps.HomePageBL;
import com.opencart.testListener.TestRetry;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class invalidProductSearchTest extends baseTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void searchForProductInvalid() throws Exception{
        String product = "ththyj";
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageBL()
                  .useSearch(product)
                  .searchInDescription()
                  .unsuccessfulSearchResult();
    }
}
