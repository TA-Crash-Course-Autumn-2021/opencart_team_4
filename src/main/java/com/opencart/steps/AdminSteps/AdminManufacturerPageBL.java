package com.opencart.steps.AdminSteps;

import com.opencart.driver.DriverRepository;
import com.opencart.pages.AdminPages.AdminManufacturerPage;
import com.opencart.pages.AdminPages.ManufacturerPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AdminManufacturerPageBL {

    private AdminManufacturerPage adminManufacturerPage;

    public AdminManufacturerPageBL() { adminManufacturerPage = new AdminManufacturerPage(); }

    public AdminManufacturerPageBL setManufacturerName(String manufacturerName) {
        adminManufacturerPage.getManufacturerName().clear();
        adminManufacturerPage.getManufacturerName().sendKeys(manufacturerName);
        return this;
    }

    public AdminManufacturerPageBL storesSelect() {
        adminManufacturerPage.getStoresCheckBox().isSelected();
        return this;
    }

    public AdminManufacturerPageBL setSortOrder(String sortOrder) {
        adminManufacturerPage.getSortOrder().clear();
        adminManufacturerPage.getSortOrder().sendKeys(sortOrder);
        return this;
    }

    public AdminManufacturerPageBL seoClickOn() {
        adminManufacturerPage.getSeoButton().click();
        return this;
    }

    public AdminManufacturerPageBL setKeyword(String keyword) {
        adminManufacturerPage.getKeyword().clear();
        adminManufacturerPage.getKeyword().sendKeys(keyword);
        return this;
    }

    public AdminManufacturerPageBL saveButtonClickOn() {
        adminManufacturerPage.getSaveButton().click();
        return this;
    }

    public AdminManufacturerPageBL manufacturerChangesCheck() {
        String expected = "Success: You have modified manufacturers!";
        String actual = adminManufacturerPage.getManufacturerAlert().getText().trim();
        Assert.assertTrue(actual.contains(expected), "Error: manufacturers are not modified");
        return new AdminManufacturerPageBL();
    }

    public AdminManufacturerPageBL editManufacturer() {
        adminManufacturerPage.getEditManufacturerButton().click();
        return this;
    }

    public AdminManufacturerPageBL newTestManufacturer() {
        setManufacturerName("TestSamsung");
        storesSelect();
        setSortOrder("0");
        seoClickOn();
        setKeyword("samsung");
        saveButtonClickOn();
        return new AdminManufacturerPageBL();
    }

    public AdminManufacturerPageBL editTestManufacturer() {
        setManufacturerName("TestSamsungEdited");
        storesSelect();
        setSortOrder("0");
        seoClickOn();
        setKeyword("samsung");
        saveButtonClickOn();
        return new AdminManufacturerPageBL();
    }

    public AdminManufacturerPageBL deleteManufacture() {
        adminManufacturerPage.getSelectTestManufacture().click();
        adminManufacturerPage.getDeleteManufacturerButton().click();
        Alert alert = (new WebDriverWait(DriverRepository.DRIVERS.get(), 10).until(ExpectedConditions.alertIsPresent()));
        DriverRepository.DRIVERS.get().switchTo().alert().accept();
        return this;
    }

}
