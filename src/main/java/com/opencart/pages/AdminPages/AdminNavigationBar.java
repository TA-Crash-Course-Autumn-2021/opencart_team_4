package com.opencart.pages.AdminPages;


import com.opencart.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class AdminNavigationBar extends BasePage {

    @FindBy(xpath = "//li[@id = 'menu-system']")
    private WebElement menuSystem;

    @FindBy(xpath = "//a[contains(.,'Localisa')]")
    private WebElement localisationSubCategory;

    @FindBy(xpath = "//a[contains(.,'Currenc')]")
    private WebElement currecncies;


    public WebElement getMenuSystem() {
        wait.until(ExpectedConditions.visibilityOfAllElements(menuSystem));
        return menuSystem;
    }

    public WebElement getLocalisationSubCategory() {
        wait.until(ExpectedConditions.elementToBeClickable(localisationSubCategory));
        return localisationSubCategory;
    }

    public WebElement getCurrecncies() {
        wait.until(ExpectedConditions.elementToBeClickable(currecncies));
        return currecncies;
    }
}
