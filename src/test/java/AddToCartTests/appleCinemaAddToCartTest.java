package AddToCartTests;

import TestConfigs.BaseTest;
import TestListener.TestRetry;
import com.opencart.enums.ProductForms.HardSelectForm;
import com.opencart.enums.ProductForms.RadioValues;
import com.opencart.navigation.Navigation;
import com.opencart.steps.HomePageBL;
import org.testng.annotations.Test;

import java.awt.*;

import static com.opencart.enums.URLs.BASE_URL;

public class appleCinemaAddToCartTest extends BaseTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void appleCinemaAddToCartTest() throws InterruptedException, AWTException {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.appleAddToCart()
                .radioForm(RadioValues.SMALL.getValue())
                .checkboxSelectForth()
                .hardFormSetText("Text field testing")
                .selectForm(HardSelectForm.BLUE.getValue())
                .hardFormSetTextArea("Valid add to cart test")
                .hardFormSetDate()
                .hardFormSetHour()
                .hardFormSetDateAndHour()
                .hardFormUploadFile()
                .cartHardFormAlertAccept()
                .addToCart()
                .successfulProductAdding();
    }
}
