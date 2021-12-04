package com.opencart.pages.containers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class CartOrderingResultPrice {
    private WebElement rootElement;

    public String cartSubTotalData(){
        return rootElement
                .findElement(By.cssSelector("#content > div.row > div > table > tbody > tr:nth-child(1) > td:nth-child(2)"))
                .getText();
    }
    public String cartCouponData(){
        return rootElement
                .findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/table/tbody/tr[2]/td[2]"))
                .getText();
    }
    public String cartEcoTaxData(){
        return rootElement
                .findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/table/tbody/tr[3]/td[2]"))
                .getText();
    }
    public String cartVATData(){
        return rootElement
                .findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/table/tbody/tr[4]/td[2]"))
                .getText();
    }
    public String cartTotalData(){
        return rootElement
                .findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/table/tbody/tr[5]/td[2]"))
                .getText();
    }




}


