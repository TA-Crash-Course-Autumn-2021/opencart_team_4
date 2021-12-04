package com.opencart.pages.AdminPages.AdminProductsPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RewardPointsAddProduct extends AddNewProductPage {

    @FindBy(xpath = "//input[@id='input-points']")
    private WebElement productPoints;

    @FindBy(xpath = "//input[@name='product_reward[1][points]']")
    private WebElement productRewardPoints;
}
