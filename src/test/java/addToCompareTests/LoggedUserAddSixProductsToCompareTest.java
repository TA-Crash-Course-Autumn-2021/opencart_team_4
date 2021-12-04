package addToCompareTests;

import testConfigs.LoggedUserTest;
import com.opencart.dataProviders.ProductsDataProvider;
import com.opencart.steps.MainPageBL;
import org.testng.annotations.Test;


public class LoggedUserAddSixProductsToCompareTest extends LoggedUserTest {


    @Test(dataProvider = "products-data", dataProviderClass = ProductsDataProvider.class)
    public void loginUserSixProductsAddToCompare(String product) {
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageBL().useSearch("")
                  .searchAddToCompare(product);
    }
}
