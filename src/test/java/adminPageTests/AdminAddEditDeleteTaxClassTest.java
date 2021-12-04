package adminPageTests;

import testConfigs.AdminTest;
import com.opencart.steps.AdminSteps.AdminDashboardPageBL;
import com.opencart.testListener.TestRetry;
import org.testng.annotations.Test;

public class AdminAddEditDeleteTaxClassTest extends AdminTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void adminAddEditDeleteTaxClass() {
        AdminDashboardPageBL adminDashboardPageBL = new AdminDashboardPageBL();
        adminDashboardPageBL
                .getNavigationBar()
                .categorySystemClick()
                .clickOnLocalisation()
                .clickOnTaxes()
                .taxClassClick()
                .clickOnAddNew()
                .createTestClassTax()
                .taxClassChangesCheck()
                .clickOnTestEdit()
                .editTestTax()
                .editChangesCheck()
                .taxClassChangesCheck()
                .deleteTestTax()
                .taxClassChangesCheck();
    }
}
