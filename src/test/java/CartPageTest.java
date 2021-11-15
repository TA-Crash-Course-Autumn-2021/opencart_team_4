import com.opencart.driver.DriverRepository;
import com.opencart.navigation.Navigation;
import com.opencart.pages.CartPage;
import com.opencart.steps.CartPageBL;
import com.opencart.steps.HomePageBL;
import com.opencart.steps.MainPageBL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import java.time.temporal.WeekFields;

import static com.opencart.enums.URLs.BASE_URL;

public class CartPageTest extends BaseTest {

    @Test
    public void cartClickOnProductTest(){
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePage = new HomePageBL();
    }

    @Test
    public void cartProductOperations(){
        new Navigation().navigateToUrl(BASE_URL.getValue());
        DriverRepository.DRIVERS.get().findElement(By.xpath("//h4/a[text()  = 'MacBook']//ancestor::div[@class = 'product-thumb transition']//button//i[@class = 'fa fa-shopping-cart']")).click();
        MainPageBL mainPageBL = new MainPageBL();
        CartPageBL cartPageBL = new CartPageBL();
        mainPageBL.getHeaderPageBL()
                .clickOnHeaderUpperCartButton()
                .cartSetProductQuantity(cartPageBL.product("Macbook"), 3)
                .cartRemove(cartPageBL.product("Macbook"));
        mainPageBL.getHeaderPageBL().headerClickOnHomeButton();
    }
}
