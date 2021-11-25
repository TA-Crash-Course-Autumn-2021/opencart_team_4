package com.opencart.pages.AdminPages;

import com.opencart.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TaxClassPage extends BasePage {

    @FindBy(xpath = "//i[@class = 'fa fa-plus']/..")
    private WebElement addNew;

    @FindBy(xpath = "//i[@class = 'fa fa-trash-o']/..")
    private WebElement delete;

    public WebElement getAddNew() {
        wait.until(ExpectedConditions.elementToBeClickable(addNew));
        return addNew;
    }

    public WebElement getDelete() {
        wait.until(ExpectedConditions.elementToBeClickable(delete));
        return delete;
    }
}
