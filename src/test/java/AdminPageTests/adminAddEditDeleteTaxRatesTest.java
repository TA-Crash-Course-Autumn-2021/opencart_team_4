package AdminPageTests;

import TestConfigs.adminTest;
import com.opencart.steps.AdminSteps.AdminDashboardPageBL;
import com.opencart.testListener.TestRetry;
import org.testng.annotations.Test;

public class adminAddEditDeleteTaxRatesTest extends adminTest {

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
