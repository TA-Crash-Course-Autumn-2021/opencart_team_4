package com.opencart.pages.AdminPages;

import com.opencart.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GeoZonesPage extends BasePage {

    @FindBy(xpath = "//i[@class = 'fa fa-plus']/..")
    private WebElement addNewGeoZone;

    @FindBy(xpath = "//button[@class = 'btn btn-danger']")
    private WebElement deleteGeoZone;

    public WebElement getAddNewGeoZone() {
        wait.until(ExpectedConditions.elementToBeClickable(addNewGeoZone));
        return addNewGeoZone;
    }

    public WebElement getDeleteGeoZone() {
        wait.until(ExpectedConditions.elementToBeClickable(deleteGeoZone));
        return deleteGeoZone;
    }
}
