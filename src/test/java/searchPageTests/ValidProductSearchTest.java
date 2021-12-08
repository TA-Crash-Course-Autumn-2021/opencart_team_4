package searchPageTests;

import testConfigs.BaseTest;
import com.opencart.navigation.Navigation;
import com.opencart.steps.MainPageBL;
import com.opencart.testListener.TestRetry;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class ValidProductSearchTest extends BaseTest {

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
