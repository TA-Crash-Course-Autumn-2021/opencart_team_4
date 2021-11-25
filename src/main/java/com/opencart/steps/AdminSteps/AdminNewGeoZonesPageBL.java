package com.opencart.steps.AdminSteps;

import com.opencart.pages.AdminPages.AdminNewGeoZonePage;

public class AdminNewGeoZonesPageBL {

    private AdminNewGeoZonePage adminNewGeoZonePage;

    public AdminNewGeoZonesPageBL() { adminNewGeoZonePage = new AdminNewGeoZonePage(); }

    public AdminNewGeoZonesPageBL setGeoZoneTitle(String geoZoneName) {
        adminNewGeoZonePage.getGeoZoneName().sendKeys(geoZoneName);
        return this;
    }

    public AdminNewGeoZonesPageBL setGeoZoneDescription(String geoZoneDescription) {
        adminNewGeoZonePage.getGeoZoneName().sendKeys(geoZoneDescription);
        return this;
    }

    public AdminNewGeoZonesPageBL clickOnCountryForm() {
        adminNewGeoZonePage.getCountryForm().click();
        return this;
    }

    public AdminNewGeoZonesPageBL clickOnGeoZoneForm() {
        adminNewGeoZonePage.getZonesForm().click();
        return this;
    }

    public AdminNewGeoZonesPageBL deleteNewGeoZone() {
        adminNewGeoZonePage.getDeleteNewGeoZoneButton().click();
        return this;
    }

    public AdminNewGeoZonesPageBL addNewGeoZone() {
        adminNewGeoZonePage.getAddNewGeoZoneButton().click();
        return this;
    }


}
