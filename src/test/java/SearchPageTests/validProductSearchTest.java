package SearchPageTests;

import TestConfigs.BaseTest;
import TestListener.TestRetry;
import com.opencart.navigation.Navigation;
import com.opencart.steps.MainPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class validProductSearchTest extends BaseTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void searchForProductValid() throws Exception{
        String product = "iPhone";
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageBL()
                .useSearch(product)
                .searchInDescription()
                .successSearchResult();
    }
}
