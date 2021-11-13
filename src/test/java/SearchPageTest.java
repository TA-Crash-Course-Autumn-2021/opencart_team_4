import com.opencart.navigation.Navigation;
import com.opencart.steps.HomePageBL;
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
                .searchPageProductClick(product)
                .setQuantity(2)
                .addToCart();
    }

    @Test
    public void searchSpecificProduct() throws Exception{
        String product = "iPhone";
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageBL().useSearch(product)
                .searchInDescription()
                .searchPageProductClick(product)
                .addToCart();
    }
}

