package SearchPageTests;

import TestConfigs.BaseTest;
import TestListener.TestRetry;
import com.opencart.navigation.Navigation;
import com.opencart.steps.HomePageBL;
import com.opencart.steps.MainPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class searchByCategoryTest extends BaseTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void searchByCategoryTest() {
        String product = "Macbook";
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageBL()
                .useSearch(product)
                .setSearchCategory("Desktops")
                .searchInDescription()
                .searchInSubcategories()
                .successSearchResult();
    }
}
