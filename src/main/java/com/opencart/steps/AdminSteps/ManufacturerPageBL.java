package com.opencart.steps.AdminSteps;

import com.opencart.driver.DriverRepository;
import com.opencart.pages.AdminPages.ManufacturerPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ManufacturerPageBL {

    private ManufacturerPage manufacturerPage;

    public ManufacturerPageBL() { manufacturerPage = new ManufacturerPage(); }

    public AdminManufacturerPageBL addNewManufacturer() {
        manufacturerPage.getAddNewManufacturer().click();
        return new AdminManufacturerPageBL();
    }

    public AdminManufacturerPageBL editManufacturer() {
        manufacturerPage.getEditManufacturer().click();
        return new AdminManufacturerPageBL();
    }


}
