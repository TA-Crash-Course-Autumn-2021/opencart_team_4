
import com.opencart.navigation.Navigation;
import com.opencart.steps.MenuBL;
import org.testng.annotations.Test;
import static com.opencart.enums.URLs.BASE_URL;

public class MenuTest extends BaseTest{

    @Test
    public void MenuTest(){
        MenuBL menuBL = new MenuBL();
        new Navigation().navigateToUrl(BASE_URL.getValue());
        menuBL.setCategory("Components").setSubcategory("Monitors");
    }
}
