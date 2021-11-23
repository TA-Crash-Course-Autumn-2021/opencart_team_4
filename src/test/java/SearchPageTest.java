import com.opencart.driver.DriverRepository;
import com.opencart.enums.Currencies;
import com.opencart.navigation.Navigation;
import com.opencart.steps.MainPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class SearchPageTest extends BaseTest {

    @Test
    public void searchByCategoryTest() throws Exception{
       String product = "Macbook";
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageBL().useSearch(product)
                .setSearchCategory("Desktops")
                .searchInDescription()
                .searchInSubcategories()
                .successSearchResult();
    }

    @Test
    public void searchForProductValid() throws Exception{
        String product = "iPhone";
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageBL()
                .useSearch(product)
                .searchInDescription()
                .successSearchResult();
    }

    @Test
    public void searchForProductInvalid() throws Exception{
        String product = "ththyj";
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageBL()
                .useSearch(product)
                .searchInDescription()
                .unsuccessfulSearchResult();
    }
}