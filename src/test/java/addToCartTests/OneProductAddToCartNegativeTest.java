package addToCartTests;

import testConfigs.BaseTest;
import com.opencart.enums.ProductForms.HardCheckbox;
import com.opencart.enums.ProductForms.RadioValues;
import com.opencart.navigation.Navigation;
import com.opencart.steps.HomePageBL;
import com.opencart.testListener.TestRetry;
import org.testng.annotations.Test;


import static com.opencart.enums.URLs.BASE_URL;

public class OneProductAddToCartNegativeTest extends BaseTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void productAddToCartNegativeTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.addToCartApple()
                  .radioForm(RadioValues.LARGE.getValue())
                  .checkBox(HardCheckbox.CHECKBOX2.getValue())
                  .hardFormSetText("Test text")
                  .addToCart()
                  .fieldRequiredCheck();
    }
}
