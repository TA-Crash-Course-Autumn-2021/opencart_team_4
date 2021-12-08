package testConfigs;

import com.opencart.navigation.Navigation;
import com.opencart.steps.AdminSteps.AdminLoginPageBL;
import org.testng.annotations.BeforeMethod;

import static com.opencart.enums.URLs.ADMIN_URL;

public class AdminTest extends BaseTest {


    @BeforeMethod
    public void loginAdmin() {
        new Navigation().navigateToUrl(ADMIN_URL.getValue());
        AdminLoginPageBL adminLoginPageBL = new AdminLoginPageBL();
        adminLoginPageBL.loginAdmin();
    }
}
