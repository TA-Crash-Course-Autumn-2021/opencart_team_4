import com.opencart.navigation.Navigation;
import com.opencart.steps.HomePageBL;
import org.testng.annotations.Test;
import static com.opencart.enums.URLs.BASE_URL;

public class HomePageTest extends BaseTest{

    @Test
    public void clickOnCart() {
    new Navigation().navigateToUrl(BASE_URL.getValue());
    HomePageBL homePageBL = new HomePageBL();
    homePageBL.homeAddToCart("Macbook");
    }
}
