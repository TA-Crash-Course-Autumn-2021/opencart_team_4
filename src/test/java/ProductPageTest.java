import com.opencart.navigation.Navigation;
import com.opencart.pages.HomePage;
import com.opencart.steps.HomePageBL;
import org.testng.annotations.Test;
import static com.opencart.enums.URLs.BASE_URL;

public class ProductPageTest extends BaseTest {

    @Test
    public void productPageTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
    }
}
