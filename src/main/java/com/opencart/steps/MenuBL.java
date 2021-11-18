package com.opencart.steps;


import com.opencart.driver.DriverRepository;
import com.opencart.pages.Menu;
import com.opencart.pages.containers.MenuContainer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;


public class MenuBL {

    private Menu menu;
    private WebElement target;

    public MenuBL() { menu = new Menu(); }

    public MenuBL setCategory(String category){
        MenuContainer selectedCategory = menu.getCategory().stream().filter(e -> e.getCategoryName().contains(category)).findFirst().orElseThrow(NullPointerException::new);
        selectedCategory.clickOnCategory().click();
        return this;
    }

    public void setSubcategory(String subcategory) {
        for (WebElement selected : menu.getSubcategory()) {
            if (selected.findElement(By.tagName("a")).getText().trim().contains(subcategory)){
                target = selected;
                DriverRepository.DRIVERS.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                target.click();
            }
        }
    }
}
