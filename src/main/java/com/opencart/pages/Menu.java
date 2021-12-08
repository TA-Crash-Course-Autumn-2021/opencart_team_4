package com.opencart.pages;


import com.opencart.driver.DriverRepository;
import com.opencart.pages.containers.MenuContainer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class Menu extends BasePage{

    @FindBy(xpath = "//ul[@class = 'nav navbar-nav']/li")
    private List<WebElement> category;

    @FindBy(xpath = "//div[@class = 'dropdown-menu']//ul[@class = 'list-unstyled']/li")
    private List<WebElement> subcategory;

    public List<MenuContainer> getCategory() {
        wait.until(ExpectedConditions.visibilityOfAllElements(category));
        return category.stream().map(MenuContainer::new).collect(Collectors.toList());
    }

    public List<WebElement> getSubcategory() {
        wait.until(ExpectedConditions.visibilityOfAllElements(subcategory));
        return subcategory;
    }
}
