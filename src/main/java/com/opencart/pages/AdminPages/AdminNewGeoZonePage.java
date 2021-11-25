package com.opencart.pages.AdminPages;

import com.opencart.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AdminNewGeoZonePage extends BasePage {

    @FindBy(xpath = "//input[@id = 'input-name']")
    private WebElement geoZoneName;

    @FindBy(xpath = "//input[@id = 'input-description']")
    private WebElement geoZoneDescription;

    @FindBy(xpath = "//button[@id = 'button-geo-zone']")
    private WebElement addNewGeoZoneButton;

    @FindBy(xpath = "//button[@title = 'Remove']")
    private WebElement deleteNewGeoZoneButton;

    @FindBy(xpath = "//select[@data-index = '1']")
    private WebElement countryForm;

    @FindBy(xpath = "//select/option[@value = '0']/..")
    private WebElement zonesForm;

    public WebElement getAddNewGeoZoneButton() {
        wait.until(ExpectedConditions.elementToBeClickable(addNewGeoZoneButton));
        return addNewGeoZoneButton;
    }

    public WebElement getCountryForm() {
        wait.until(ExpectedConditions.elementToBeClickable(countryForm));
        return countryForm;
    }

    public WebElement getDeleteNewGeoZoneButton() {
        wait.until(ExpectedConditions.elementToBeClickable(deleteNewGeoZoneButton));
        return deleteNewGeoZoneButton;
    }

    public WebElement getGeoZoneDescription() {
        wait.until(ExpectedConditions.elementToBeClickable(geoZoneDescription));
        return geoZoneDescription;
    }

    public WebElement getGeoZoneName() {
        wait.until(ExpectedConditions.elementToBeClickable(geoZoneName));
        return geoZoneName;
    }

    public WebElement getZonesForm() {
        wait.until(ExpectedConditions.elementToBeClickable(zonesForm));
        return zonesForm;
    }
}
