package AdminPageTests;

import TestConfigs.AdminTest;
import TestListener.TestRetry;
import com.opencart.steps.AdminSteps.AdminDashboardPageBL;
import org.testng.annotations.Test;

public class adminAddEditDeleteTaxRatesTest extends AdminTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void adminAddEditDeleteTaxRates() {
        AdminDashboardPageBL adminDashboardPageBL = new AdminDashboardPageBL();
        adminDashboardPageBL
                .getNavigationBar()
                .categorySystemClick()
                .clickOnLocalisation()
                .clickOnTaxes()
                .taxRatesClick()
                .addNewTaxClass()
                .newTestTaxRate()
                .taxRateChangesCheck()
                .clickOnTaxEdit()
                .changeTestTaxRate()
                .deleteTestTax()
                .taxRateChangesCheck();
    }
}
