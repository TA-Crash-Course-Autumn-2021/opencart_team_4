package com.opencart.pages.AdminPages.AdminProductsPage;

import com.opencart.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddNewProductPage extends BasePage {

    @FindBy(xpath = "//a[@href='#tab-general']")
    private WebElement generalButton;

    @FindBy(xpath = "//a[@href='#tab-data']")
    private WebElement dataButton;

    @FindBy(xpath = "//a[@href='#tab-links']")
    private WebElement linksButton;

    @FindBy(xpath = "//a[@href='#tab-attribute']")
    private WebElement attributeButton;

    @FindBy(xpath = "//a[@href='#tab-option']")
    private WebElement optionButton;

    @FindBy(xpath = "//a[@href='#tab-recurring']")
    private WebElement recurringButton;

    @FindBy(xpath = "//a[@href='#tab-discount']")
    private WebElement discountButton;

    @FindBy(xpath = "//a[@href='#tab-special']")
    private WebElement specialButton;

    @FindBy(xpath = "//a[@href='#tab-image']")
    private WebElement imageButton;

    @FindBy(xpath = "//a[@href='#tab-reward']")
    private WebElement rewardButton;

    @FindBy(xpath = "//a[@href='#tab-seo']")
    private WebElement seoButton;

    @FindBy(xpath = "//a[@href='#tab-design']")
    private WebElement designButton;

    @FindBy(xpath = "//i[@class = 'fa fa-save']")
    private WebElement saveProductButton;

    @FindBy(xpath = "//div[@class = 'alert alert-success alert-dismissible'][contains(.,'Success')]")
    private WebElement productAlert;

    public WebElement getGeneralButton() {
        wait.until(ExpectedConditions.elementToBeClickable(generalButton));
        return generalButton;
    }

    public WebElement getDataButton() {
        wait.until(ExpectedConditions.elementToBeClickable(dataButton));
        return dataButton;
    }

    public WebElement getLinksButton() {
        wait.until(ExpectedConditions.elementToBeClickable(linksButton));
        return linksButton;
    }

    public WebElement getAttributeButton() {
        wait.until(ExpectedConditions.elementToBeClickable(attributeButton));
        return attributeButton;
    }

    public WebElement getOptionButton() {
        wait.until(ExpectedConditions.elementToBeClickable(optionButton));
        return optionButton;
    }

    public WebElement getRecurringButton() {
        wait.until(ExpectedConditions.elementToBeClickable(recurringButton));
        return recurringButton;
    }

    public WebElement getDiscountButton() {
        wait.until(ExpectedConditions.elementToBeClickable(discountButton));
        return discountButton;
    }

    public WebElement getSpecialButton() {
        wait.until(ExpectedConditions.elementToBeClickable(specialButton));
        return specialButton;
    }

    public WebElement getImageButton() {
        wait.until(ExpectedConditions.elementToBeClickable(imageButton));
        return imageButton;
    }

    public WebElement getRewardButton() {
        wait.until(ExpectedConditions.elementToBeClickable(rewardButton));
        return rewardButton;
    }

    public WebElement getSeoButton() {
        wait.until(ExpectedConditions.elementToBeClickable(seoButton));
        return seoButton;
    }

    public WebElement getDesignButton() {
        wait.until(ExpectedConditions.elementToBeClickable(designButton));
        return designButton;
    }

    public WebElement getSaveProductButton() {
        wait.until(ExpectedConditions.elementToBeClickable(saveProductButton));
        return saveProductButton;
    }

    public WebElement getProductAlert() {
        wait.until(ExpectedConditions.elementToBeClickable(productAlert));
        return productAlert;
    }
}
