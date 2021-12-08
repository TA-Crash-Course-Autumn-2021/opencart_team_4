package dataProviderTest;

import testConfigs.RegisterRandomUserStayLogged;
import com.opencart.dataProviders.ProductsDataProvider;
import com.opencart.steps.ComparePageBL;
import com.opencart.steps.MainPageBL;
import org.testng.annotations.Test;



public class LoggedUserAddFourProductsToCompareTest extends RegisterRandomUserStayLogged {


    @Test(dataProvider = "products-data", dataProviderClass = ProductsDataProvider.class)
    public void loginUserFourProductsAddToCompare(String product) {
        ComparePageBL comparePageBL = new ComparePageBL();
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageBL().useSearch("")
                  .searchAddToCompare(product);
        comparePageBL.productsCheck();
    }
}
