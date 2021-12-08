package com.opencart.steps.AdminSteps;

import com.opencart.pages.AdminPages.GeoZonesPage;

public class GeoZonesPageBL {

    private GeoZonesPage geoZonesPage;

    public GeoZonesPageBL() { geoZonesPage = new GeoZonesPage(); }

    public AdminNewGeoZonesPageBL addNewGeoZone() {
        geoZonesPage.getAddNewGeoZone().click();
        return new AdminNewGeoZonesPageBL();
    }

    public void deleteGeoZone() {
        geoZonesPage.getDeleteGeoZone().click();
    }
}
