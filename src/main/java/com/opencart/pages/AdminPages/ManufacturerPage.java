package com.opencart.pages.AdminPages;

import com.opencart.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ManufacturerPage extends BasePage {

    @FindBy(xpath = "//i[@class = 'fa fa-plus']/..")
    private WebElement addNewManufacturer;

    @FindBy(xpath = "//td[contains(.,'Test')]/..//a")
    private WebElement editManufacturer;

    @FindBy(xpath = "//i[@class = 'fa fa-trash-o']/..")
    private WebElement deleteManufacturer;

    public WebElement getAddNewManufacturer() {
        wait.until(ExpectedConditions.elementToBeClickable(addNewManufacturer));
        return addNewManufacturer;
    }

    public WebElement getEditManufacturer() {
        wait.until(ExpectedConditions.elementToBeClickable(editManufacturer));
        return addNewManufacturer;
    }

}
